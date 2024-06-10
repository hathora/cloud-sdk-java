# DiscoveryV1
(*discoveryV1()*)

## Overview

Deprecated. Does not include latest Regions (missing Dallas region). Use [DiscoveryV2](https://hathora.dev/api#tag/DiscoveryV2).

### Available Operations

* [~~getPingServiceEndpointsDeprecated~~](#getpingserviceendpointsdeprecated) - Returns an array of V1 regions with a host and port that a client can directly ping. Open a websocket connection to `wss://<host>:<port>/ws` and send a packet. To calculate ping, measure the time it takes to get an echo packet back. :warning: **Deprecated**

## ~~getPingServiceEndpointsDeprecated~~

Returns an array of V1 regions with a host and port that a client can directly ping. Open a websocket connection to `wss://<host>:<port>/ws` and send a packet. To calculate ping, measure the time it takes to get an echo packet back.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            GetPingServiceEndpointsDeprecatedResponse res = sdk.discoveryV1().getPingServiceEndpointsDeprecated()
                .call();

            if (res.pingEndpoints().isPresent()) {
                // handle response
            }
        } catch (dev.hathora.cloud_api.models.errors.SDKError e) {
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

**[Optional<? extends dev.hathora.cloud_api.models.operations.GetPingServiceEndpointsDeprecatedResponse>](../../models/operations/GetPingServiceEndpointsDeprecatedResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
