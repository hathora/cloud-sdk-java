# ProcessesV2
(*processesV2()*)

## Overview

Deprecated. Use [ProcessesV3](https://hathora.dev/api#tag/ProcessesV3).

### Available Operations

* [createProcessV2Deprecated](#createprocessv2deprecated) - Creates a [process](https://hathora.dev/docs/concepts/hathora-entities#process) without a room. Use this to pre-allocate processes ahead of time so that subsequent room assignment via [CreateRoom()](https://hathora.dev/api#tag/RoomV2/operation/CreateRoom) can be instant.
* [getLatestProcessesV2Deprecated](#getlatestprocessesv2deprecated) - Retrieve the 10 most recent [processes](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `status` or `region`.
* [getProcessInfoV2Deprecated](#getprocessinfov2deprecated) - Get details for a [process](https://hathora.dev/docs/concepts/hathora-entities#process).
* [getProcessesCountExperimentalV2Deprecated](#getprocessescountexperimentalv2deprecated) - Count the number of [processes](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter by optionally passing in a `status` or `region`.
* [stopProcessV2Deprecated](#stopprocessv2deprecated) - Stops a [process](https://hathora.dev/docs/concepts/hathora-entities#process) immediately.

## createProcessV2Deprecated

Creates a [process](https://hathora.dev/docs/concepts/hathora-entities#process) without a room. Use this to pre-allocate processes ahead of time so that subsequent room assignment via [CreateRoom()](https://hathora.dev/api#tag/RoomV2/operation/CreateRoom) can be instant.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.SDKError;
import dev.hathora.cloud_sdk.models.operations.CreateProcessV2DeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            CreateProcessV2DeprecatedResponse res = sdk.processesV2().createProcessV2Deprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .region(Region.MUMBAI)
                .call();

            if (res.processV2().isPresent()) {
                // handle response
            }
        } catch (dev.hathora.cloud_sdk.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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
| `appId`                                  | *Optional<String>*                       | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `region`                                 | [Region](../../models/shared/Region.md)  | :heavy_check_mark:                       | N/A                                      |                                          |

### Response

**[CreateProcessV2DeprecatedResponse](../../models/operations/CreateProcessV2DeprecatedResponse.md)**

### Errors

| Error Object            | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401,402,404,422,429,500 | application/json        |
| models/errors/SDKError  | 4xx-5xx                 | \*\/*                   |


## getLatestProcessesV2Deprecated

Retrieve the 10 most recent [processes](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `status` or `region`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.SDKError;
import dev.hathora.cloud_sdk.models.operations.GetLatestProcessesV2DeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.ProcessStatus;
import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            GetLatestProcessesV2DeprecatedResponse res = sdk.processesV2().getLatestProcessesV2Deprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .region(List.of(
                    Region.MUMBAI))
                .status(List.of(
                    ProcessStatus.FAILED))
                .call();

            if (res.classes().isPresent()) {
                // handle response
            }
        } catch (dev.hathora.cloud_sdk.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 | Example                                                     |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `appId`                                                     | *Optional<String>*                                          | :heavy_minus_sign:                                          | N/A                                                         | app-af469a92-5b45-4565-b3c4-b79878de67d2                    |
| `region`                                                    | List<[Region](../../models/shared/Region.md)>               | :heavy_minus_sign:                                          | N/A                                                         |                                                             |
| `status`                                                    | List<[ProcessStatus](../../models/shared/ProcessStatus.md)> | :heavy_minus_sign:                                          | N/A                                                         |                                                             |

### Response

**[GetLatestProcessesV2DeprecatedResponse](../../models/operations/GetLatestProcessesV2DeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getProcessInfoV2Deprecated

Get details for a [process](https://hathora.dev/docs/concepts/hathora-entities#process).

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.SDKError;
import dev.hathora.cloud_sdk.models.operations.GetProcessInfoV2DeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            GetProcessInfoV2DeprecatedResponse res = sdk.processesV2().getProcessInfoV2Deprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .processId("cbfcddd2-0006-43ae-996c-995fff7bed2e")
                .call();

            if (res.processV2().isPresent()) {
                // handle response
            }
        } catch (dev.hathora.cloud_sdk.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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
| `appId`                                  | *Optional<String>*                       | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `processId`                              | *String*                                 | :heavy_check_mark:                       | N/A                                      | cbfcddd2-0006-43ae-996c-995fff7bed2e     |

### Response

**[GetProcessInfoV2DeprecatedResponse](../../models/operations/GetProcessInfoV2DeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getProcessesCountExperimentalV2Deprecated

Count the number of [processes](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter by optionally passing in a `status` or `region`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.SDKError;
import dev.hathora.cloud_sdk.models.operations.GetProcessesCountExperimentalV2DeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.ProcessStatus;
import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            GetProcessesCountExperimentalV2DeprecatedResponse res = sdk.processesV2().getProcessesCountExperimentalV2Deprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .region(List.of(
                    Region.FRANKFURT))
                .status(List.of(
                    ProcessStatus.STOPPING))
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (dev.hathora.cloud_sdk.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 | Example                                                     |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `appId`                                                     | *Optional<String>*                                          | :heavy_minus_sign:                                          | N/A                                                         | app-af469a92-5b45-4565-b3c4-b79878de67d2                    |
| `region`                                                    | List<[Region](../../models/shared/Region.md)>               | :heavy_minus_sign:                                          | N/A                                                         |                                                             |
| `status`                                                    | List<[ProcessStatus](../../models/shared/ProcessStatus.md)> | :heavy_minus_sign:                                          | N/A                                                         |                                                             |

### Response

**[GetProcessesCountExperimentalV2DeprecatedResponse](../../models/operations/GetProcessesCountExperimentalV2DeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## stopProcessV2Deprecated

Stops a [process](https://hathora.dev/docs/concepts/hathora-entities#process) immediately.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.SDKError;
import dev.hathora.cloud_sdk.models.operations.StopProcessV2DeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            StopProcessV2DeprecatedResponse res = sdk.processesV2().stopProcessV2Deprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .processId("cbfcddd2-0006-43ae-996c-995fff7bed2e")
                .call();

            // handle response
        } catch (dev.hathora.cloud_sdk.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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
| `appId`                                  | *Optional<String>*                       | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `processId`                              | *String*                                 | :heavy_check_mark:                       | N/A                                      | cbfcddd2-0006-43ae-996c-995fff7bed2e     |

### Response

**[StopProcessV2DeprecatedResponse](../../models/operations/StopProcessV2DeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429,500        | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
