package dev.hathora.cloud_sdk;

import static org.junit.jupiter.api.Assertions.fail;

import dev.hathora.cloud_sdk.models.operations.*;
import dev.hathora.cloud_sdk.models.shared.*;
import org.junit.jupiter.api.Test;

import java.lang.System;
import java.util.*;

public class SDKTest {
    private static final String HATHORA_APP_ID = "app-7422f70e-e6a7-440f-ba50-d9924af00296";
    private static final String HATHORA_DEV_TOKEN = Optional.ofNullable(
            System.getenv("HATHORA_DEV_TOKEN"))
            .orElseThrow(() -> new IllegalStateException("API_KEY env var is not defined"));
    private static final int POLL_INTERVAL_MS = 1000;

    @Test
    public void testRoomFlowWithGetConnectionInfo() throws Exception {
        String roomId = UUID.randomUUID().toString();
        Region region = Region.WASHINGTON_DC;
        String roomConfig = "{\"property\":\"value\"}";

        // Instantiate SDK
        HathoraCloud hathoraCloudSdk = HathoraCloud.builder()
                .security(Security.builder()
                        .hathoraDevToken(HATHORA_DEV_TOKEN)
                        .build())
                .appId(HATHORA_APP_ID)
                .build();

        CreateRoomResponse createRoomResponse = hathoraCloudSdk.roomsV2().createRoom()
                .roomId(roomId)
                .createRoomParams(CreateRoomParams.builder()
                        .region(region)
                        .roomConfig(roomConfig)
                        .build())
                .call();
        if (createRoomResponse.statusCode() != 201) {
            System.out.println("error: " + createRoomResponse.rawResponse());
        }

        System.out.println("RES: " + createRoomResponse.statusCode());
        if (createRoomResponse.roomConnectionData().isPresent()) {
            System.out.println("Status: " + createRoomResponse.roomConnectionData().get().status());
            System.out.println("RoomId: " + createRoomResponse.roomConnectionData().get().roomId());
        } else {
            System.out.println("Inner response not present!");
        }

        // Poll for connection info
        System.out.println("Starting poll for connection info");
        long start = System.currentTimeMillis();

        boolean stillPoll = true;
        int tries = 0;
        while (stillPoll) {
            System.out.println("poll try #" + tries + ":");
            GetConnectionInfoResponse connectionInfoResponse = hathoraCloudSdk.roomsV2().getConnectionInfo()
                    .roomId(createRoomResponse.roomConnectionData().get().roomId())
                    .call();
            if (connectionInfoResponse.statusCode() != 200) {
                System.out.println("api error: " + connectionInfoResponse.rawResponse());
            }
            if (connectionInfoResponse.connectionInfoV2().isPresent()
                    && connectionInfoResponse.connectionInfoV2().get().exposedPort().isPresent()) {
                System.out.println("RES: " + connectionInfoResponse.statusCode() + ", Success!");
                System.out.println("RoomId: " + connectionInfoResponse.connectionInfoV2().get().roomId());
                System.out.println("ExposedPort: " + connectionInfoResponse.connectionInfoV2().get().exposedPort());
                long end = System.currentTimeMillis();
                long elapsedTime = end - start;
                System.out.println("POLLING TIME ELAPSED: " + elapsedTime + "ms");
                stillPoll = false;
            } else {
                System.out.println("RES: " + connectionInfoResponse.statusCode()
                        + ", ConnectionInfoV2.ExposedPort not present, keep polling");
            }
            if (stillPoll && tries > 15) {
                stillPoll = false;
                long end = System.currentTimeMillis();
                long elapsedTime = end - start;
                fail("Timed out after " + elapsedTime + "ms of polling");
            } else {
                tries++;
                Thread.sleep(POLL_INTERVAL_MS);
            }
        }
    }

    @Test
    public void testRoomFlowWithGetProcessInfo() throws Exception {

        String roomId = UUID.randomUUID().toString();
        Region region = Region.WASHINGTON_DC;
        String roomConfig = "{\"property\":\"value\"}";

        // Instantiate SDK
        HathoraCloud hathoraCloudSdk = HathoraCloud.builder()
                .security(Security.builder()
                        .hathoraDevToken(HATHORA_DEV_TOKEN)
                        .build())
                .appId(HATHORA_APP_ID)
                .build();

        CreateRoomResponse createRoomResponse = hathoraCloudSdk.roomsV2().createRoom()
                .roomId(roomId)
                .createRoomParams(CreateRoomParams.builder()
                        .region(region)
                        .roomConfig(roomConfig)
                        .build())
                .call();
        if (createRoomResponse.statusCode() != 201) {
            System.out.println("error: " + createRoomResponse.rawResponse());
        }

        System.out.println("RES: " + createRoomResponse.rawResponse());
        if (createRoomResponse.roomConnectionData().isPresent()) {
            System.out.println("Status: " + createRoomResponse.statusCode());
            System.out.println("RoomId: " + createRoomResponse.roomConnectionData().get().roomId());
            System.out.println("ProcessId: " + createRoomResponse.roomConnectionData().get().processId());
        } else {
            System.out.println("Inner response not present!");
        }

        // Poll for connection info
        System.out.println("Starting poll for process info");
        long start = System.currentTimeMillis();

        boolean stillPoll = true;
        int tries = 0;
        while (stillPoll) {
            System.out.println("poll try #" + tries + ":");
            GetProcessResponse processResponse = hathoraCloudSdk.processesV3().getProcess()
                    .processId(createRoomResponse.roomConnectionData().get().processId())
                    .call();
            if (processResponse.processV3().isEmpty()) {
                System.out.println("api error: " + processResponse.rawResponse().toString());
            }
            if (processResponse.processV3().isPresent()
                    && processResponse.processV3().get().exposedPort().isPresent()) {
                System.out.println("RES: " + processResponse.statusCode() + ", Success!");
                System.out.println("RoomId: " + processResponse.processV3().get().processId());
                System.out.println("ExposedPort: " + processResponse.processV3().get().exposedPort());
                long end = System.currentTimeMillis();
                long elapsedTime = end - start;
                System.out.println("POLLING TIME ELAPSED: " + elapsedTime + "ms");
                stillPoll = false;
                testGetMetrics(hathoraCloudSdk, processResponse.processV3().get().processId());
            } else {
                System.out.println("RES: " + processResponse.statusCode()
                        + ", processV2.ExposedPort not present, keep polling");
            }
            if (stillPoll && tries > 15) {
                stillPoll = false;
                long end = System.currentTimeMillis();
                long elapsedTime = end - start;
                fail("Timed out after " + elapsedTime + "ms of polling");
            } else {
                tries++;
                Thread.sleep(POLL_INTERVAL_MS);
            }
        }
    }

    @Test
    public void testLobbyFlowWithGetConnectionInfo() throws Exception {

        String roomId = UUID.randomUUID().toString();
        Region region = Region.WASHINGTON_DC;
        String roomConfig = "{\"property\":\"value\"}";

        // Instantiate SDK
        HathoraCloud hathoraCloudSdk = HathoraCloud.builder()
                .appId(HATHORA_APP_ID)
                .build();

        // login anonymous
        LoginAnonymousResponse loginAnonymousResponse = hathoraCloudSdk.authV1().loginAnonymous().appId(HATHORA_APP_ID)
                .call();
        if (loginAnonymousResponse.playerTokenObject().isEmpty()) {
            System.out.println("error: " + loginAnonymousResponse.rawResponse().toString());
        }

        System.out.println("RES: " + loginAnonymousResponse.statusCode());
        if (loginAnonymousResponse.playerTokenObject().isPresent()) {
            System.out.println("Status: " + loginAnonymousResponse.playerTokenObject().get().token());
        } else {
            System.out.println("Inner response not present!");
        }

        CreateLobbyResponse createLobbyResponse = hathoraCloudSdk.lobbiesV3().createLobby()
                .security(CreateLobbySecurity.builder()
                        .playerAuth(loginAnonymousResponse.playerTokenObject().get().token()).build())
                .request(CreateLobbyRequest.builder()
                        .roomId(roomId)
                        .shortCode("test_short_code")
                        .createLobbyV3Params(CreateLobbyV3Params.builder()
                                .region(region)
                                .roomConfig(roomConfig)
                                .visibility(LobbyVisibility.PUBLIC)
                                .build())
                        .build())
                .call();
        if (createLobbyResponse.lobbyV3().isEmpty()) {
            System.out.println("error: " + createLobbyResponse.statusCode());
        }

        System.out.println("RES: " + createLobbyResponse.statusCode());
        if (createLobbyResponse.lobbyV3().isPresent()) {
            System.out.println("ShortCode: " + createLobbyResponse.lobbyV3().get().shortCode());
            System.out.println("RoomId: " + createLobbyResponse.lobbyV3().get().roomId());
        } else {
            System.out.println("Inner response not present!");
        }

        // Poll for connection info
        System.out.println("Starting poll for connection info");
        long start = System.currentTimeMillis();

        boolean stillPoll = true;
        int tries = 0;
        while (stillPoll) {
            System.out.println("poll try #" + tries + ":");
            GetConnectionInfoResponse connectionInfoResponse = hathoraCloudSdk.roomsV2().getConnectionInfo()
                    .roomId(createLobbyResponse.lobbyV3().get().roomId())
                    .call();
            if (connectionInfoResponse.statusCode() != 200) {
                System.out.println("api error: " + connectionInfoResponse.rawResponse());
            }
            if (connectionInfoResponse.connectionInfoV2().isPresent()
                    && connectionInfoResponse.connectionInfoV2().get().exposedPort().isPresent()) {
                System.out.println("RES: " + connectionInfoResponse.statusCode() + ", Success!");
                System.out.println("RoomId: " + connectionInfoResponse.connectionInfoV2().get().roomId());
                System.out.println("ExposedPort: " + connectionInfoResponse.connectionInfoV2().get().exposedPort());
                long end = System.currentTimeMillis();
                long elapsedTime = end - start;
                System.out.println("POLLING TIME ELAPSED: " + elapsedTime + "ms");
                stillPoll = false;
            } else {
                System.out.println("RES: " + connectionInfoResponse.statusCode()
                        + ", ConnectionInfoV2.ExposedPort not present, keep polling");
            }
            if (stillPoll && tries > 15) {
                stillPoll = false;
                long end = System.currentTimeMillis();
                long elapsedTime = end - start;
                fail("Timed out after " + elapsedTime + "ms of polling");
            } else {
                tries++;
                Thread.sleep(POLL_INTERVAL_MS);
            }
        }
    }

    @Test
    public void testDiscoveryPingService() throws Exception {

        // Instantiate SDK
        HathoraCloud hathoraCloudSdk = HathoraCloud.builder()
                .security(Security.builder()
                        .hathoraDevToken(HATHORA_DEV_TOKEN)
                        .build())
                .appId(HATHORA_APP_ID)
                .build();

        GetPingServiceEndpointsResponse res = hathoraCloudSdk.discoveryV2().getPingServiceEndpoints()
                .call();

        System.out.println("RES: " + res.statusCode());
        if (res.statusCode() == 200) {
            System.out.println("Ping Endpoints: " + res.pingEndpoints());
        } else {
            System.out.println("Inner response not present!");
        }

        // Ping to find best region
        double bestRegionTime = Double.MAX_VALUE;
        Region bestRegion = null;
        Map<Region, Double> pingMap = new HashMap<>();
        for (PingEndpoints dr : res.pingEndpoints().get()) {
            System.out.println("Ping " + dr.region() + ": " + dr.host() + " " + dr.port());
            long ping1 = ping(dr.host(), (int) dr.port());
            long ping2 = ping(dr.host(), (int) dr.port());
            long ping3 = ping(dr.host(), (int) dr.port());
            int successes = 0;
            long sum = 0;
            if (ping1 > 0) {
                successes++;
                sum += ping1;
            }
            if (ping2 > 0) {
                successes++;
                sum += ping2;
            }
            if (ping3 > 0) {
                successes++;
                sum += ping3;
            }
            double avg = (double) sum / successes;
            if (bestRegionTime > avg) {
                bestRegionTime = avg;
                bestRegion = dr.region();
            }
            pingMap.put(dr.region(), avg);
        }
        System.out.println("Best region found: " + bestRegion + " (" + bestRegionTime + ")");
        System.out.println("Ping map: " + pingMap);
    }

    /**
     * Ping a host (TCP) 3-times and return average latency time
     * 
     * @param host Hostname to be pinged.
     * @return <code>ping latency</code> if the given HTTP URL has returned response
     *         code 200-399 on a HEAD request within the
     *         given timeout, otherwise <code>-1</code>.
     */
    private long ping(String host, int port) throws Exception {

        WebSocketPing client = new WebSocketPing("wss://" + host + ":" + port + "/ws");
        client.connectBlocking(); // Ensure the client is connected before sending messages

        client.startPingTest();
        return client.calculateLatency();
    }

    public void testGetMetrics(HathoraCloud hathoraCloudSdk, String processId) throws Exception {
        GetProcessMetricsResponse res = hathoraCloudSdk.processesV3().getProcessMetrics(
            GetProcessMetricsRequest.builder().metrics(List.of(ProcessMetricName.CPU)).processId(processId).step(60).build());
        System.out.println("RES: " + res.statusCode());
        if (res.processMetricsData().isPresent()) {
            System.out.println("Metrics: " + res.processMetricsData().get());
        } else {
            fail("Inner response not present!");
        }
    }
}
