# ProcessesV2
(*processesV2()*)

## Overview

Deprecated. Use [ProcessesV3](https://hathora.dev/api#tag/ProcessesV3).

### Available Operations

* [~~createProcessV2Deprecated~~](#createprocessv2deprecated) - CreateProcessV2Deprecated :warning: **Deprecated**
* [~~getLatestProcessesV2Deprecated~~](#getlatestprocessesv2deprecated) - GetLatestProcessesV2Deprecated :warning: **Deprecated**
* [~~getProcessInfoV2Deprecated~~](#getprocessinfov2deprecated) - GetProcessInfoV2Deprecated :warning: **Deprecated**
* [~~getProcessesCountExperimentalV2Deprecated~~](#getprocessescountexperimentalv2deprecated) - GetProcessesCountExperimentalV2Deprecated :warning: **Deprecated**
* [~~stopProcessV2Deprecated~~](#stopprocessv2deprecated) - StopProcessV2Deprecated :warning: **Deprecated**

## ~~createProcessV2Deprecated~~

Creates a [process](https://hathora.dev/docs/concepts/hathora-entities#process) without a room. Use this to pre-allocate processes ahead of time so that subsequent room assignment via [CreateRoom()](https://hathora.dev/api#tag/RoomV2/operation/CreateRoom) can be instant.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateProcessV2DeprecatedResponse;
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
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        CreateProcessV2DeprecatedResponse res = sdk.processesV2().createProcessV2Deprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .region(Region.MUMBAI)
                .call();

        if (res.processV2().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `region`                                 | [Region](../../models/shared/Region.md)  | :heavy_check_mark:                       | N/A                                      |                                          |

### Response

**[CreateProcessV2DeprecatedResponse](../../models/operations/CreateProcessV2DeprecatedResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ApiError       | 401, 402, 404, 422, 429, 500 | application/json             |
| models/errors/SDKError       | 4XX, 5XX                     | \*/\*                        |

## ~~getLatestProcessesV2Deprecated~~

Retrieve the 10 most recent [processes](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `status` or `region`.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetLatestProcessesV2DeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.ProcessStatus;
import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        GetLatestProcessesV2DeprecatedResponse res = sdk.processesV2().getLatestProcessesV2Deprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .region(List.of(
                    Region.SINGAPORE))
                .status(List.of(
                    ProcessStatus.RUNNING))
                .call();

        if (res.classes().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `appId`                                                      | *Optional\<String>*                                          | :heavy_minus_sign:                                           | N/A                                                          | app-af469a92-5b45-4565-b3c4-b79878de67d2                     |
| `region`                                                     | List\<[Region](../../models/shared/Region.md)>               | :heavy_minus_sign:                                           | N/A                                                          |                                                              |
| `status`                                                     | List\<[ProcessStatus](../../models/shared/ProcessStatus.md)> | :heavy_minus_sign:                                           | N/A                                                          |                                                              |

### Response

**[GetLatestProcessesV2DeprecatedResponse](../../models/operations/GetLatestProcessesV2DeprecatedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 422, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~getProcessInfoV2Deprecated~~

Get details for a [process](https://hathora.dev/docs/concepts/hathora-entities#process).

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetProcessInfoV2DeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        GetProcessInfoV2DeprecatedResponse res = sdk.processesV2().getProcessInfoV2Deprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .processId("cbfcddd2-0006-43ae-996c-995fff7bed2e")
                .call();

        if (res.processV2().isPresent()) {
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

**[GetProcessInfoV2DeprecatedResponse](../../models/operations/GetProcessInfoV2DeprecatedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~getProcessesCountExperimentalV2Deprecated~~

Count the number of [processes](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter by optionally passing in a `status` or `region`.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetProcessesCountExperimentalV2DeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.ProcessStatus;
import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        GetProcessesCountExperimentalV2DeprecatedResponse res = sdk.processesV2().getProcessesCountExperimentalV2Deprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .region(List.of(
                    Region.MUMBAI))
                .status(List.of(
                    ProcessStatus.FAILED))
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `appId`                                                      | *Optional\<String>*                                          | :heavy_minus_sign:                                           | N/A                                                          | app-af469a92-5b45-4565-b3c4-b79878de67d2                     |
| `region`                                                     | List\<[Region](../../models/shared/Region.md)>               | :heavy_minus_sign:                                           | N/A                                                          |                                                              |
| `status`                                                     | List\<[ProcessStatus](../../models/shared/ProcessStatus.md)> | :heavy_minus_sign:                                           | N/A                                                          |                                                              |

### Response

**[GetProcessesCountExperimentalV2DeprecatedResponse](../../models/operations/GetProcessesCountExperimentalV2DeprecatedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 422, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~stopProcessV2Deprecated~~

Stops a [process](https://hathora.dev/docs/concepts/hathora-entities#process) immediately.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.StopProcessV2DeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        StopProcessV2DeprecatedResponse res = sdk.processesV2().stopProcessV2Deprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .processId("cbfcddd2-0006-43ae-996c-995fff7bed2e")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `processId`                              | *String*                                 | :heavy_check_mark:                       | N/A                                      | cbfcddd2-0006-43ae-996c-995fff7bed2e     |

### Response

**[StopProcessV2DeprecatedResponse](../../models/operations/StopProcessV2DeprecatedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 429, 500     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |