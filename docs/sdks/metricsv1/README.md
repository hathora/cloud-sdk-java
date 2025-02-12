# MetricsV1
(*metricsV1()*)

## Overview

Deprecated. Use [ProcessesV3#GetProcessMetrics](https://hathora.dev/api#tag/ProcessesV3/operation/GetProcessMetrics) to fetch metrics about a specific process.

### Available Operations

* [~~getMetricsDeprecated~~](#getmetricsdeprecated) - GetMetricsDeprecated :warning: **Deprecated**

## ~~getMetricsDeprecated~~

Get metrics for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetMetricsDeprecatedRequest;
import dev.hathora.cloud_sdk.models.operations.GetMetricsDeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        GetMetricsDeprecatedRequest req = GetMetricsDeprecatedRequest.builder()
                .processId("cbfcddd2-0006-43ae-996c-995fff7bed2e")
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

        GetMetricsDeprecatedResponse res = sdk.metricsV1().getMetricsDeprecated()
                .request(req)
                .call();

        if (res.deprecatedProcessMetricsData().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetMetricsDeprecatedRequest](../../models/operations/GetMetricsDeprecatedRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetMetricsDeprecatedResponse](../../models/operations/GetMetricsDeprecatedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 422, 429     | application/json       |
| models/errors/ApiError | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |