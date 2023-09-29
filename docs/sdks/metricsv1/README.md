# MetricsV1
(*metricsV1*)

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
import dev.hathora.cloud_api.models.operations.GetMetricsRequest;
import dev.hathora.cloud_api.models.operations.GetMetricsResponse;
import dev.hathora.cloud_api.models.shared.MetricName;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("override") {{
                    auth0 = "";
                }})
                .build();

            GetMetricsRequest req = new GetMetricsRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2", "cbfcddd2-0006-43ae-996c-995fff7bed2e") {{
                end = 4311.13d;
                metrics = new dev.hathora.cloud_api.models.shared.MetricName[]{{
                    add(MetricName.MEMORY),
                }};
                start = 2713.56d;
                step = 406495;
            }};            

            GetMetricsResponse res = sdk.metricsV1.getMetrics(req);

            if (res.metricsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [dev.hathora.cloud_api.models.operations.GetMetricsRequest](../../models/operations/GetMetricsRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[dev.hathora.cloud_api.models.operations.GetMetricsResponse](../../models/operations/GetMetricsResponse.md)**

