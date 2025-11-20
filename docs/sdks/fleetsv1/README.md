# FleetsV1
(*fleetsV1()*)

## Overview

Operations to manage and view a [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet).

### Available Operations

* [createFleetDeprecated](#createfleetdeprecated) - CreateFleetDeprecated
* [getFleetDeprecated](#getfleetdeprecated) - GetFleetDeprecated
* [getFleetMetricsDeprecated](#getfleetmetricsdeprecated) - GetFleetMetricsDeprecated
* [getFleetRegionDeprecated](#getfleetregiondeprecated) - GetFleetRegionDeprecated
* [getFleetRegionMetricsDeprecated](#getfleetregionmetricsdeprecated) - GetFleetRegionMetricsDeprecated
* [getFleetsDeprecated](#getfleetsdeprecated) - GetFleetsDeprecated
* [updateFleetDeprecated](#updatefleetdeprecated) - UpdateFleetDeprecated
* [updateFleetRegionDeprecated](#updatefleetregiondeprecated) - UpdateFleetRegionDeprecated

## createFleetDeprecated

CreateFleetDeprecated

### Example Usage

<!-- UsageSnippet language="java" operationID="CreateFleetDeprecated" method="post" path="/fleets/v1/fleets" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateFleetDeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        CreateFleetDeprecatedResponse res = sdk.fleetsV1().createFleetDeprecated()
                .createFleet(CreateFleet.builder()
                    .autoscalerConfig(AutoscalerConfig.builder()
                        .scaleUpThreshold(78718)
                        .build())
                    .name("production")
                    .nodeShape(NodeShape.GPU_H100252468)
                    .build())
                .call();

        if (res.fleet().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                         | Type                                              | Required                                          | Description                                       | Example                                           |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `createFleet`                                     | [CreateFleet](../../models/shared/CreateFleet.md) | :heavy_check_mark:                                | N/A                                               |                                                   |
| `orgId`                                           | *Optional\<String>*                               | :heavy_minus_sign:                                | N/A                                               | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39          |

### Response

**[CreateFleetDeprecatedResponse](../../models/operations/CreateFleetDeprecatedResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## getFleetDeprecated

Returns a [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet).

### Example Usage

<!-- UsageSnippet language="java" operationID="GetFleetDeprecated" method="get" path="/fleets/v1/fleets/{fleetId}" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetFleetDeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        GetFleetDeprecatedResponse res = sdk.fleetsV1().getFleetDeprecated()
                .fleetId("<id>")
                .call();

        if (res.fleet().isPresent()) {
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

### Response

**[GetFleetDeprecatedResponse](../../models/operations/GetFleetDeprecatedResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## getFleetMetricsDeprecated

Gets aggregate metrics for a [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet).

### Example Usage

<!-- UsageSnippet language="java" operationID="GetFleetMetricsDeprecated" method="get" path="/fleets/v1/fleets/{fleetId}/metrics" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetFleetMetricsDeprecatedRequest;
import dev.hathora.cloud_sdk.models.operations.GetFleetMetricsDeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        GetFleetMetricsDeprecatedRequest req = GetFleetMetricsDeprecatedRequest.builder()
                .fleetId("<id>")
                .build();

        GetFleetMetricsDeprecatedResponse res = sdk.fleetsV1().getFleetMetricsDeprecated()
                .request(req)
                .call();

        if (res.fleetMetricsData().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetFleetMetricsDeprecatedRequest](../../models/operations/GetFleetMetricsDeprecatedRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetFleetMetricsDeprecatedResponse](../../models/operations/GetFleetMetricsDeprecatedResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## getFleetRegionDeprecated

Gets the configuration for a given [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet) in a region.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetFleetRegionDeprecated" method="get" path="/fleets/v1/fleets/{fleetId}/regions/{region}" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetFleetRegionDeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        GetFleetRegionDeprecatedResponse res = sdk.fleetsV1().getFleetRegionDeprecated()
                .fleetId("<id>")
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

**[GetFleetRegionDeprecatedResponse](../../models/operations/GetFleetRegionDeprecatedResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## getFleetRegionMetricsDeprecated

Gets metrics for a region in a [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet).

### Example Usage

<!-- UsageSnippet language="java" operationID="GetFleetRegionMetricsDeprecated" method="get" path="/fleets/v1/fleets/{fleetId}/regions/{region}/metrics" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetFleetRegionMetricsDeprecatedRequest;
import dev.hathora.cloud_sdk.models.operations.GetFleetRegionMetricsDeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        GetFleetRegionMetricsDeprecatedRequest req = GetFleetRegionMetricsDeprecatedRequest.builder()
                .fleetId("<id>")
                .region(Region.DUBAI)
                .build();

        GetFleetRegionMetricsDeprecatedResponse res = sdk.fleetsV1().getFleetRegionMetricsDeprecated()
                .request(req)
                .call();

        if (res.fleetMetricsData().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [GetFleetRegionMetricsDeprecatedRequest](../../models/operations/GetFleetRegionMetricsDeprecatedRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[GetFleetRegionMetricsDeprecatedResponse](../../models/operations/GetFleetRegionMetricsDeprecatedResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## getFleetsDeprecated

Returns an array of [fleets](https://hathora.dev/docs/concepts/hathora-entities#fleet).

### Example Usage

<!-- UsageSnippet language="java" operationID="GetFleetsDeprecated" method="get" path="/fleets/v1/fleets" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetFleetsDeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        GetFleetsDeprecatedResponse res = sdk.fleetsV1().getFleetsDeprecated()
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

**[GetFleetsDeprecatedResponse](../../models/operations/GetFleetsDeprecatedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 408, 429     | application/json       |
| models/errors/ApiError | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateFleetDeprecated

Updates a [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet)'s configuration.

### Example Usage

<!-- UsageSnippet language="java" operationID="UpdateFleetDeprecated" method="post" path="/fleets/v1/fleets/{fleetId}" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.UpdateFleetDeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        UpdateFleetDeprecatedResponse res = sdk.fleetsV1().updateFleetDeprecated()
                .updateFleet(UpdateFleet.builder()
                    .autoscalerConfig(AutoscalerConfig.builder()
                        .scaleUpThreshold(638855)
                        .build())
                    .name("production")
                    .build())
                .fleetId("<id>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                         | Type                                              | Required                                          | Description                                       | Example                                           |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `updateFleet`                                     | [UpdateFleet](../../models/shared/UpdateFleet.md) | :heavy_check_mark:                                | N/A                                               |                                                   |
| `fleetId`                                         | *String*                                          | :heavy_check_mark:                                | N/A                                               |                                                   |
| `orgId`                                           | *Optional\<String>*                               | :heavy_minus_sign:                                | N/A                                               | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39          |

### Response

**[UpdateFleetDeprecatedResponse](../../models/operations/UpdateFleetDeprecatedResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## updateFleetRegionDeprecated

Updates the configuration for a given [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet) in a region.

### Example Usage

<!-- UsageSnippet language="java" operationID="UpdateFleetRegionDeprecated" method="put" path="/fleets/v1/fleets/{fleetId}/regions/{region}" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.UpdateFleetRegionDeprecatedRequest;
import dev.hathora.cloud_sdk.models.operations.UpdateFleetRegionDeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        UpdateFleetRegionDeprecatedRequest req = UpdateFleetRegionDeprecatedRequest.builder()
                .fleetRegionConfig(FleetRegionConfig.builder()
                    .cloudMinVcpus(122781)
                    .build())
                .fleetId("<id>")
                .region(Region.JOHANNESBURG)
                .build();

        UpdateFleetRegionDeprecatedResponse res = sdk.fleetsV1().updateFleetRegionDeprecated()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [UpdateFleetRegionDeprecatedRequest](../../models/operations/UpdateFleetRegionDeprecatedRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[UpdateFleetRegionDeprecatedResponse](../../models/operations/UpdateFleetRegionDeprecatedResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |