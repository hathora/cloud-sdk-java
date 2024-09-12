package dev.hathora.cloud_sdk;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import java.net.URI;
import java.util.concurrent.CountDownLatch;

import static java.lang.Long.parseLong;

public class WebSocketPing extends WebSocketClient {
    private final CountDownLatch latch;
    private long totalLatency = 0;
    private int messageCount = 0;
    private static final int PING_MESSAGES = 1;

    public WebSocketPing(String serverUri) throws Exception {
        super(new URI(serverUri));
        this.latch = new CountDownLatch(PING_MESSAGES);
    }

    @Override
    public void onOpen(ServerHandshake handshake) {
        System.out.println("Opened connection");
    }

    @Override
    public void onMessage(String message) {
        try {
            long latency = System.currentTimeMillis() - parseLong(message);
            System.out.println("Received: " + message + " with latency: " + latency + " ms");
            totalLatency += latency;
            messageCount++;
            latch.countDown();
        } catch (NumberFormatException e) {
            return;
        }
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        System.out.println("Closed with exit code " + code + ", additional info: " + reason);
    }

    @Override
    public void onError(Exception ex) {
        ex.printStackTrace();
    }

    public void sendPingMessage(String message) {
        send(message);
    }

    public void startPingTest() {
        sendPingMessage(Long.toString(System.currentTimeMillis()));
    }

    public long calculateLatency() throws InterruptedException {
        latch.await(); // Wait for all messages to be received
        if (messageCount > 0) {
            long averageLatency = totalLatency / messageCount;
            System.out.println("Average Latency: " + averageLatency + " ms");
            return averageLatency;
        } else {
            System.out.println("No messages were sent.");
            return -1;
        }
    }

}
