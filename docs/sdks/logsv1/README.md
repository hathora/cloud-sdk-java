# LogsV1
(*logsV1()*)

### Available Operations

* [downloadLogForProcess](#downloadlogforprocess) - Download entire log file for a stopped process.
* [~~getLogsForApp~~](#getlogsforapp) - Returns a stream of logs for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. :warning: **Deprecated**
* [~~getLogsForDeployment~~](#getlogsfordeployment) - Returns a stream of logs for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) using `appId` and `deploymentId`. :warning: **Deprecated**
* [getLogsForProcess](#getlogsforprocess) - Returns a stream of logs for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.

## downloadLogForProcess

Download entire log file for a stopped process.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_api.HathoraCloud;
import com.hathora.cloud_api.models.operations.*;
import com.hathora.cloud_api.models.shared.*;
import com.hathora.cloud_api.models.shared.Security;
import com.hathora.cloud_api.utils.EventStream;
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

            DownloadLogForProcessResponse res = sdk.logsV1().downloadLogForProcess()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .processId("cbfcddd2-0006-43ae-996c-995fff7bed2e")
                .call();

            if (res.responseStream().isPresent()) {
                // handle response
            }
        } catch (com.hathora.cloud_api.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_api.models.errors.SDKError e) {
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

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional<? extends String>*             | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `processId`                              | *String*                                 | :heavy_check_mark:                       | N/A                                      | cbfcddd2-0006-43ae-996c-995fff7bed2e     |


### Response

**[com.hathora.cloud_api.models.operations.DownloadLogForProcessResponse](../../models/operations/DownloadLogForProcessResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 400,401,404,410,429    | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## ~~getLogsForApp~~

Returns a stream of logs for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_api.HathoraCloud;
import com.hathora.cloud_api.models.operations.*;
import com.hathora.cloud_api.models.shared.*;
import com.hathora.cloud_api.models.shared.Security;
import com.hathora.cloud_api.utils.EventStream;
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

            GetLogsForAppRequest req = GetLogsForAppRequest.builder()
                .tailLines(100)
                .build();

            GetLogsForAppResponse res = sdk.logsV1().getLogsForApp()
                .request(req)
                .call();

            if (res.responseStream().isPresent()) {
                // handle response
            }
        } catch (com.hathora.cloud_api.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_api.models.errors.SDKError e) {
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

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.hathora.cloud_api.models.operations.GetLogsForAppRequest](../../models/operations/GetLogsForAppRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[com.hathora.cloud_api.models.operations.GetLogsForAppResponse](../../models/operations/GetLogsForAppResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## ~~getLogsForDeployment~~

Returns a stream of logs for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) using `appId` and `deploymentId`.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_api.HathoraCloud;
import com.hathora.cloud_api.models.operations.*;
import com.hathora.cloud_api.models.shared.*;
import com.hathora.cloud_api.models.shared.Security;
import com.hathora.cloud_api.utils.EventStream;
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

            GetLogsForDeploymentRequest req = GetLogsForDeploymentRequest.builder()
                .deploymentId(1)
                .tailLines(100)
                .build();

            GetLogsForDeploymentResponse res = sdk.logsV1().getLogsForDeployment()
                .request(req)
                .call();

            if (res.responseStream().isPresent()) {
                // handle response
            }
        } catch (com.hathora.cloud_api.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_api.models.errors.SDKError e) {
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

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [com.hathora.cloud_api.models.operations.GetLogsForDeploymentRequest](../../models/operations/GetLogsForDeploymentRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |


### Response

**[com.hathora.cloud_api.models.operations.GetLogsForDeploymentResponse](../../models/operations/GetLogsForDeploymentResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## getLogsForProcess

Returns a stream of logs for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_api.HathoraCloud;
import com.hathora.cloud_api.models.operations.*;
import com.hathora.cloud_api.models.shared.*;
import com.hathora.cloud_api.models.shared.Security;
import com.hathora.cloud_api.utils.EventStream;
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

            GetLogsForProcessRequest req = GetLogsForProcessRequest.builder()
                .processId("cbfcddd2-0006-43ae-996c-995fff7bed2e")
                .tailLines(100)
                .build();

            GetLogsForProcessResponse res = sdk.logsV1().getLogsForProcess()
                .request(req)
                .call();

            if (res.responseStream().isPresent()) {
                // handle response
            }
        } catch (com.hathora.cloud_api.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_api.models.errors.SDKError e) {
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

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [com.hathora.cloud_api.models.operations.GetLogsForProcessRequest](../../models/operations/GetLogsForProcessRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[com.hathora.cloud_api.models.operations.GetLogsForProcessResponse](../../models/operations/GetLogsForProcessResponse.md)**
### Errors

| Error Object            | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 400,401,404,410,429,500 | application/json        |
| models/errors/SDKError  | 4xx-5xx                 | \*\/*                   |
