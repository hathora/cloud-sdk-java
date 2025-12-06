# ~~DiscoveryV1~~

> [!WARNING]
> This SDK is **DEPRECATED**

## Overview

Deprecated. Does not include latest Regions (missing Dallas region). Use [DiscoveryV2](https://hathora.dev/api#tag/DiscoveryV2).

### Available Operations

* [~~getPingServiceEndpointsDeprecated~~](#getpingserviceendpointsdeprecated) - GetPingServiceEndpointsDeprecated :warning: **Deprecated**

## ~~getPingServiceEndpointsDeprecated~~

Returns an array of V1 regions with a host and port that a client can directly ping. Open a websocket connection to `wss://<host>:<port>/ws` and send a packet. To calculate ping, measure the time it takes to get an echo packet back.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetPingServiceEndpointsDeprecated" method="get" path="/discovery/v1/ping" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.operations.GetPingServiceEndpointsDeprecatedResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        HathoraCloud sdk = HathoraCloud.builder()
            .build();

        GetPingServiceEndpointsDeprecatedResponse res = sdk.discoveryV1().getPingServiceEndpointsDeprecated()
                .call();

        if (res.pingEndpoints().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetPingServiceEndpointsDeprecatedResponse](../../models/operations/GetPingServiceEndpointsDeprecatedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |