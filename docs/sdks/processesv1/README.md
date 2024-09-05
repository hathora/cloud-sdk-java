# ProcessesV1
(*processesV1()*)

## Overview

Deprecated. Use [ProcessesV2](https://hathora.dev/api#tag/ProcessesV2).

### Available Operations

* [~~getProcessInfoDeprecated~~](#getprocessinfodeprecated) - Get details for a [process](https://hathora.dev/docs/concepts/hathora-entities#process). :warning: **Deprecated**
* [~~getRunningProcesses~~](#getrunningprocesses) - Retrieve 10 most recently started [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`. :warning: **Deprecated**
* [~~getStoppedProcesses~~](#getstoppedprocesses) - Retrieve 10 most recently stopped [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`. :warning: **Deprecated**

## ~~getProcessInfoDeprecated~~

Get details for a [process](https://hathora.dev/docs/concepts/hathora-entities#process).

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.GetProcessInfoDeprecatedResponse;
import com.hathora.hathora_cloud_sdk.models.shared.Security;
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

            GetProcessInfoDeprecatedResponse res = sdk.processesV1().getProcessInfoDeprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .processId("cbfcddd2-0006-43ae-996c-995fff7bed2e")
                .call();

            if (res.process().isPresent()) {
                // handle response
            }
        } catch (com.hathora.hathora_cloud_sdk.models.errors.ApiError e) {
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

**[GetProcessInfoDeprecatedResponse](../../models/operations/GetProcessInfoDeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429,500        | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## ~~getRunningProcesses~~

Retrieve 10 most recently started [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.GetRunningProcessesResponse;
import com.hathora.hathora_cloud_sdk.models.shared.Region;
import com.hathora.hathora_cloud_sdk.models.shared.Security;
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

            GetRunningProcessesResponse res = sdk.processesV1().getRunningProcesses()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .region(Region.TOKYO)
                .call();

            if (res.classes().isPresent()) {
                // handle response
            }
        } catch (com.hathora.hathora_cloud_sdk.models.errors.ApiError e) {
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

| Parameter                                         | Type                                              | Required                                          | Description                                       | Example                                           |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `appId`                                           | *Optional<String>*                                | :heavy_minus_sign:                                | N/A                                               | app-af469a92-5b45-4565-b3c4-b79878de67d2          |
| `region`                                          | [Optional<Region>](../../models/shared/Region.md) | :heavy_minus_sign:                                | N/A                                               |                                                   |

### Response

**[GetRunningProcessesResponse](../../models/operations/GetRunningProcessesResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## ~~getStoppedProcesses~~

Retrieve 10 most recently stopped [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.GetStoppedProcessesResponse;
import com.hathora.hathora_cloud_sdk.models.shared.Region;
import com.hathora.hathora_cloud_sdk.models.shared.Security;
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

            GetStoppedProcessesResponse res = sdk.processesV1().getStoppedProcesses()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .region(Region.SYDNEY)
                .call();

            if (res.classes().isPresent()) {
                // handle response
            }
        } catch (com.hathora.hathora_cloud_sdk.models.errors.ApiError e) {
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

| Parameter                                         | Type                                              | Required                                          | Description                                       | Example                                           |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `appId`                                           | *Optional<String>*                                | :heavy_minus_sign:                                | N/A                                               | app-af469a92-5b45-4565-b3c4-b79878de67d2          |
| `region`                                          | [Optional<Region>](../../models/shared/Region.md) | :heavy_minus_sign:                                | N/A                                               |                                                   |

### Response

**[GetStoppedProcessesResponse](../../models/operations/GetStoppedProcessesResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
