# DiscoveryV2
(*discoveryV2()*)

## Overview

Service that allows clients to directly ping all Hathora regions to get latency information

### Available Operations

* [getPingServiceEndpoints](#getpingserviceendpoints) - Returns an array of all regions with a host and port that a client can directly ping. Open a websocket connection to `wss://<host>:<port>/ws` and send a packet. To calculate ping, measure the time it takes to get an echo packet back.

## getPingServiceEndpoints

Returns an array of all regions with a host and port that a client can directly ping. Open a websocket connection to `wss://<host>:<port>/ws` and send a packet. To calculate ping, measure the time it takes to get an echo packet back.

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.GetPingServiceEndpointsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            GetPingServiceEndpointsResponse res = sdk.discoveryV2().getPingServiceEndpoints()
                .call();

            if (res.pingEndpoints().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Response

**[GetPingServiceEndpointsResponse](../../models/operations/GetPingServiceEndpointsResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
