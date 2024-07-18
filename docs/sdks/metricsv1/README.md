# MetricsV1
(*metricsV1()*)

## Overview

Operations to get metrics by [process](https://hathora.dev/docs/concepts/hathora-entities#process). We store 72 hours of metrics data.

### Available Operations

* [getMetrics](#getmetrics) - Get metrics for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.

## getMetrics

Get metrics for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.Security;
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
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            GetMetricsRequest req = GetMetricsRequest.builder()
                .processId("cbfcddd2-0006-43ae-996c-995fff7bed2e")
                .build();

            GetMetricsResponse res = sdk.metricsV1().getMetrics()
                .request(req)
                .call();

            if (res.metricsData().isPresent()) {
                // handle response
            }
        } catch (dev.hathora.cloud_api.models.errors.ApiError e) {
            // handle exception
            throw e;
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

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [dev.hathora.cloud_api.models.operations.GetMetricsRequest](../../models/operations/GetMetricsRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.GetMetricsResponse>](../../models/operations/GetMetricsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,422,429,500    | application/json       |
| models/errors/SDKError | 4xx-5xx                | */*                    |
