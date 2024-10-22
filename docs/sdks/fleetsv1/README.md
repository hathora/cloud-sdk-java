# FleetsV1
(*fleetsV1()*)

## Overview

### Available Operations

* [getFleetRegion](#getfleetregion)
* [getFleets](#getfleets)
* [updateFleetRegion](#updatefleetregion)

## getFleetRegion

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetFleetRegionResponse;
import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        GetFleetRegionResponse res = sdk.fleetsV1().getFleetRegion()
                .fleetId("<id>")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .region(Region.SAO_PAULO)
                .call();

        if (res.fleetRegion().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `fleetId`                                | *String*                                 | :heavy_check_mark:                       | N/A                                      |                                          |
| `orgId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39 |
| `region`                                 | [Region](../../models/shared/Region.md)  | :heavy_check_mark:                       | N/A                                      |                                          |

### Response

**[GetFleetRegionResponse](../../models/operations/GetFleetRegionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 422, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getFleets

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetFleetsResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        GetFleetsResponse res = sdk.fleetsV1().getFleets()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

        if (res.fleetsPage().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `orgId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39 |

### Response

**[GetFleetsResponse](../../models/operations/GetFleetsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateFleetRegion

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.UpdateFleetRegionRequest;
import dev.hathora.cloud_sdk.models.operations.UpdateFleetRegionResponse;
import dev.hathora.cloud_sdk.models.shared.FleetRegionConfig;
import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        UpdateFleetRegionRequest req = UpdateFleetRegionRequest.builder()
                .fleetRegionConfig(FleetRegionConfig.builder()
                    .cloudMinVcpus(511402)
                    .build())
                .fleetId("<id>")
                .region(Region.SINGAPORE)
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .build();

        UpdateFleetRegionResponse res = sdk.fleetsV1().updateFleetRegion()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateFleetRegionRequest](../../models/operations/UpdateFleetRegionRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateFleetRegionResponse](../../models/operations/UpdateFleetRegionResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 422, 429, 500 | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |