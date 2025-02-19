# DiscoveryV2
(*discoveryV2()*)

## Overview

Service that allows clients to directly ping all Hathora regions to get latency information

### Available Operations

* [getPingServiceEndpoints](#getpingserviceendpoints) - GetPingServiceEndpoints

## getPingServiceEndpoints

Returns an array of all regions with a host and port that a client can directly ping. Open a websocket connection to `wss://<host>:<port>/ws` and send a packet. To calculate ping, measure the time it takes to get an echo packet back.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.operations.GetPingServiceEndpointsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        GetPingServiceEndpointsResponse res = sdk.discoveryV2().getPingServiceEndpoints()
                .call();

        if (res.pingEndpoints().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetPingServiceEndpointsResponse](../../models/operations/GetPingServiceEndpointsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |