# MetricsV1
(*metricsV1()*)

## Overview

Operations to get metrics by [process](https://hathora.dev/docs/concepts/hathora-entities#process). We store 72 hours of metrics data.

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

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        GetMetricsDeprecatedRequest req = GetMetricsDeprecatedRequest.builder()
                .processId("cbfcddd2-0006-43ae-996c-995fff7bed2e")
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

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 422, 429, 500 | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |