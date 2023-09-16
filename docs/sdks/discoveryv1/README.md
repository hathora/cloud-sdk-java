# DiscoveryV1

## Overview

Service that allows clients to directly ping all Hathora regions to get latency information

### Available Operations

* [getPingServiceEndpoints](#getpingserviceendpoints) - Returns an array of all regions with a host and port that a client can directly ping.

## getPingServiceEndpoints

Returns an array of all regions with a host and port that a client can directly ping.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.GetPingServiceEndpointsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .build();

            GetPingServiceEndpointsResponse res = sdk.discoveryV1.getPingServiceEndpoints();

            if (res.discoveryResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[dev.hathora.cloud_api.models.operations.GetPingServiceEndpointsResponse](../../models/operations/GetPingServiceEndpointsResponse.md)**

