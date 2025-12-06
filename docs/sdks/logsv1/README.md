# LogsV1

## Overview

### Available Operations

* [downloadLogForProcess](#downloadlogforprocess) - DownloadLogForProcess
* [getLogsForProcess](#getlogsforprocess) - GetLogsForProcess

## downloadLogForProcess

Download entire log file for a stopped process.

### Example Usage

<!-- UsageSnippet language="java" operationID="DownloadLogForProcess" method="get" path="/logs/v1/{appId}/process/{processId}/download" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.DownloadLogForProcessResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        DownloadLogForProcessResponse res = sdk.logsV1().downloadLogForProcess()
                .processId("cbfcddd2-0006-43ae-996c-995fff7bed2e")
                .call();

        if (res.responseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `processId`                              | *String*                                 | :heavy_check_mark:                       | N/A                                      | cbfcddd2-0006-43ae-996c-995fff7bed2e     |

### Response

**[DownloadLogForProcessResponse](../../models/operations/DownloadLogForProcessResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ApiError       | 400, 401, 404, 408, 410, 429 | application/json             |
| models/errors/SDKError       | 4XX, 5XX                     | \*/\*                        |

## getLogsForProcess

Returns a stream of logs for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetLogsForProcess" method="get" path="/logs/v1/{appId}/process/{processId}" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetLogsForProcessRequest;
import dev.hathora.cloud_sdk.models.operations.GetLogsForProcessResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        GetLogsForProcessRequest req = GetLogsForProcessRequest.builder()
                .processId("cbfcddd2-0006-43ae-996c-995fff7bed2e")
                .build();

        GetLogsForProcessResponse res = sdk.logsV1().getLogsForProcess()
                .request(req)
                .call();

        if (res.responseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetLogsForProcessRequest](../../models/operations/GetLogsForProcessRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetLogsForProcessResponse](../../models/operations/GetLogsForProcessResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ApiError       | 400, 401, 404, 408, 410, 429 | application/json             |
| models/errors/ApiError       | 500                          | application/json             |
| models/errors/SDKError       | 4XX, 5XX                     | \*/\*                        |