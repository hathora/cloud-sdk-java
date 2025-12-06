# FleetsV2

## Overview

### Available Operations

* [createFleet](#createfleet) - CreateFleet
* [~~deprecatedUpdateFleetRegionV2~~](#deprecatedupdatefleetregionv2) - DeprecatedUpdateFleetRegionV2 :warning: **Deprecated**
* [getFleet](#getfleet) - GetFleet
* [getFleetMetrics](#getfleetmetrics) - GetFleetMetrics
* [getFleetRegion](#getfleetregion) - GetFleetRegion
* [getFleetRegionMetrics](#getfleetregionmetrics) - GetFleetRegionMetrics
* [getFleets](#getfleets) - GetFleets
* [getNodeShapes](#getnodeshapes) - GetNodeShapes
* [updateFleet](#updatefleet) - UpdateFleet
* [updateFleetRegion](#updatefleetregion) - UpdateFleetRegion

## createFleet

CreateFleet

### Example Usage

<!-- UsageSnippet language="java" operationID="CreateFleet" method="post" path="/fleets/v2/fleets" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateFleetResponse;
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

        CreateFleetResponse res = sdk.fleetsV2().createFleet()
                .createFleetV2(CreateFleetV2.builder()
                    .autoscalerConfig(AutoscalerConfig.builder()
                        .scaleUpThreshold(599396)
                        .build())
                    .name("production")
                    .nodeShapeId(NodeShapeId.SHAPE_AMD6432128)
                    .build())
                .call();

        if (res.fleetV2().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `createFleetV2`                                       | [CreateFleetV2](../../models/shared/CreateFleetV2.md) | :heavy_check_mark:                                    | N/A                                                   |                                                       |
| `orgId`                                               | *Optional\<String>*                                   | :heavy_minus_sign:                                    | N/A                                                   | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39              |

### Response

**[CreateFleetResponse](../../models/operations/CreateFleetResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## ~~deprecatedUpdateFleetRegionV2~~

Updates the configuration for a given [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet) in a region.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="DeprecatedUpdateFleetRegionV2" method="put" path="/fleets/v2/fleets/{fleetId}/regions/{region}" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.DeprecatedUpdateFleetRegionV2Request;
import dev.hathora.cloud_sdk.models.operations.DeprecatedUpdateFleetRegionV2Response;
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

        DeprecatedUpdateFleetRegionV2Request req = DeprecatedUpdateFleetRegionV2Request.builder()
                .fleetRegionConfig(FleetRegionConfig.builder()
                    .cloudMinVcpus(735068)
                    .build())
                .fleetId("<id>")
                .region(Region.SINGAPORE)
                .build();

        DeprecatedUpdateFleetRegionV2Response res = sdk.fleetsV2().deprecatedUpdateFleetRegionV2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [DeprecatedUpdateFleetRegionV2Request](../../models/operations/DeprecatedUpdateFleetRegionV2Request.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[DeprecatedUpdateFleetRegionV2Response](../../models/operations/DeprecatedUpdateFleetRegionV2Response.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## getFleet

Returns a [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet).

### Example Usage

<!-- UsageSnippet language="java" operationID="GetFleet" method="get" path="/fleets/v2/fleets/{fleetId}" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetFleetResponse;
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

        GetFleetResponse res = sdk.fleetsV2().getFleet()
                .fleetId("<id>")
                .call();

        if (res.fleetV2().isPresent()) {
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

**[GetFleetResponse](../../models/operations/GetFleetResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## getFleetMetrics

Gets aggregate metrics for a [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet).

### Example Usage

<!-- UsageSnippet language="java" operationID="GetFleetMetrics" method="get" path="/fleets/v2/fleets/{fleetId}/metrics" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetFleetMetricsRequest;
import dev.hathora.cloud_sdk.models.operations.GetFleetMetricsResponse;
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

        GetFleetMetricsRequest req = GetFleetMetricsRequest.builder()
                .fleetId("<id>")
                .build();

        GetFleetMetricsResponse res = sdk.fleetsV2().getFleetMetrics()
                .request(req)
                .call();

        if (res.fleetMetricsData().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetFleetMetricsRequest](../../models/operations/GetFleetMetricsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetFleetMetricsResponse](../../models/operations/GetFleetMetricsResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## getFleetRegion

Gets the configuration for a given [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet) in a region.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetFleetRegion" method="get" path="/fleets/v2/fleets/{fleetId}/regions/{region}" -->
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
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        GetFleetRegionResponse res = sdk.fleetsV2().getFleetRegion()
                .fleetId("<id>")
                .region(Region.SINGAPORE)
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

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## getFleetRegionMetrics

Gets metrics for a region in a [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet).

### Example Usage

<!-- UsageSnippet language="java" operationID="GetFleetRegionMetrics" method="get" path="/fleets/v2/fleets/{fleetId}/regions/{region}/metrics" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetFleetRegionMetricsRequest;
import dev.hathora.cloud_sdk.models.operations.GetFleetRegionMetricsResponse;
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

        GetFleetRegionMetricsRequest req = GetFleetRegionMetricsRequest.builder()
                .fleetId("<id>")
                .region(Region.CHICAGO)
                .build();

        GetFleetRegionMetricsResponse res = sdk.fleetsV2().getFleetRegionMetrics()
                .request(req)
                .call();

        if (res.fleetMetricsData().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetFleetRegionMetricsRequest](../../models/operations/GetFleetRegionMetricsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetFleetRegionMetricsResponse](../../models/operations/GetFleetRegionMetricsResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## getFleets

Returns an array of [fleets](https://hathora.dev/docs/concepts/hathora-entities#fleet).

### Example Usage

<!-- UsageSnippet language="java" operationID="GetFleets" method="get" path="/fleets/v2/fleets" -->
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
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        GetFleetsResponse res = sdk.fleetsV2().getFleets()
                .call();

        if (res.fleetsPageV2().isPresent()) {
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
| models/errors/ApiError | 401, 404, 408, 429     | application/json       |
| models/errors/ApiError | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getNodeShapes

GetNodeShapes

### Example Usage

<!-- UsageSnippet language="java" operationID="GetNodeShapes" method="get" path="/fleets/v2/nodeShapes" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetNodeShapesResponse;
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

        GetNodeShapesResponse res = sdk.fleetsV2().getNodeShapes()
                .call();

        if (res.classes().isPresent()) {
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

**[GetNodeShapesResponse](../../models/operations/GetNodeShapesResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## updateFleet

Updates a [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet)'s configuration.

### Example Usage

<!-- UsageSnippet language="java" operationID="UpdateFleet" method="post" path="/fleets/v2/fleets/{fleetId}" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.UpdateFleetResponse;
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

        UpdateFleetResponse res = sdk.fleetsV2().updateFleet()
                .updateFleetV2(UpdateFleetV2.builder()
                    .autoscalerConfig(AutoscalerConfig.builder()
                        .scaleUpThreshold(979840)
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

| Parameter                                             | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `updateFleetV2`                                       | [UpdateFleetV2](../../models/shared/UpdateFleetV2.md) | :heavy_check_mark:                                    | N/A                                                   |                                                       |
| `fleetId`                                             | *String*                                              | :heavy_check_mark:                                    | N/A                                                   |                                                       |
| `orgId`                                               | *Optional\<String>*                                   | :heavy_minus_sign:                                    | N/A                                                   | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39              |

### Response

**[UpdateFleetResponse](../../models/operations/UpdateFleetResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## updateFleetRegion

Updates the configuration for a given [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet) in a region.

### Example Usage

<!-- UsageSnippet language="java" operationID="UpdateFleetRegion" method="put" path="/fleets/v2/fleets/{fleetId}/regions/{region}/v2" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.UpdateFleetRegionRequest;
import dev.hathora.cloud_sdk.models.operations.UpdateFleetRegionResponse;
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

        UpdateFleetRegionRequest req = UpdateFleetRegionRequest.builder()
                .fleetRegionConfigV2(FleetRegionConfigV2.builder()
                    .nodeBaseline(503995)
                    .build())
                .fleetId("<id>")
                .region(Region.CHICAGO)
                .build();

        UpdateFleetRegionResponse res = sdk.fleetsV2().updateFleetRegion()
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
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |