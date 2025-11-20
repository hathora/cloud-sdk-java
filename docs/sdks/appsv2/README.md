# AppsV2
(*appsV2()*)

## Overview

Operations that allow you manage your [applications](https://hathora.dev/docs/concepts/hathora-entities#application).

### Available Operations

* [createApp](#createapp) - CreateApp
* [deleteApp](#deleteapp) - DeleteApp
* [getApp](#getapp) - GetApp
* [getApps](#getapps) - GetApps
* [patchApp](#patchapp) - PatchApp
* [updateApp](#updateapp) - UpdateApp

## createApp

Create a new [application](https://hathora.dev/docs/concepts/hathora-entities#application).

### Example Usage

<!-- UsageSnippet language="java" operationID="CreateApp" method="post" path="/apps/v2/apps" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateAppResponse;
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

        CreateAppResponse res = sdk.appsV2().createApp()
                .createAppConfig(CreateAppConfig.builder()
                    .appName("minecraft")
                    .authConfiguration(AuthConfiguration.builder()
                        .build())
                    .build())
                .call();

        if (res.application().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               | Example                                                   |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `createAppConfig`                                         | [CreateAppConfig](../../models/shared/CreateAppConfig.md) | :heavy_check_mark:                                        | N/A                                                       |                                                           |
| `orgId`                                                   | *Optional\<String>*                                       | :heavy_minus_sign:                                        | N/A                                                       | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39                  |

### Response

**[CreateAppResponse](../../models/operations/CreateAppResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## deleteApp

Delete an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Your organization will lose access to this application.

### Example Usage

<!-- UsageSnippet language="java" operationID="DeleteApp" method="delete" path="/apps/v2/apps/{appId}" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.DeleteAppResponse;
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

        DeleteAppResponse res = sdk.appsV2().deleteApp()
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |

### Response

**[DeleteAppResponse](../../models/operations/DeleteAppResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## getApp

Get details for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetApp" method="get" path="/apps/v2/apps/{appId}" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetAppResponse;
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

        GetAppResponse res = sdk.appsV2().getApp()
                .call();

        if (res.application().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |

### Response

**[GetAppResponse](../../models/operations/GetAppResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 408, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getApps

Returns an unsorted list of your organization’s [applications](https://hathora.dev/docs/concepts/hathora-entities#application). An application is uniquely identified by an `appId`.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetApps" method="get" path="/apps/v2/apps" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetAppsResponse;
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

        GetAppsResponse res = sdk.appsV2().getApps()
                .call();

        if (res.applicationsPage().isPresent()) {
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

**[GetAppsResponse](../../models/operations/GetAppsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 408, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchApp

Patch data for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

### Example Usage

<!-- UsageSnippet language="java" operationID="PatchApp" method="patch" path="/apps/v2/apps/{appId}" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.PatchAppResponse;
import dev.hathora.cloud_sdk.models.shared.*;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        PatchAppResponse res = sdk.appsV2().patchApp()
                .partialAppConfigWithServiceConfig(PartialAppConfigWithServiceConfig.builder()
                    .serviceConfig(ServiceConfigWrite.builder()
                        .staticProcessAllocation(List.of(
                            StaticProcessAllocationConfigWrite.builder()
                                .maxProcesses(3)
                                .minProcesses(1)
                                .region(Region.TOKYO)
                                .targetProcesses(2)
                                .build(),
                            StaticProcessAllocationConfigWrite.builder()
                                .maxProcesses(3)
                                .minProcesses(1)
                                .region(Region.TOKYO)
                                .targetProcesses(2)
                                .build(),
                            StaticProcessAllocationConfigWrite.builder()
                                .maxProcesses(3)
                                .minProcesses(1)
                                .region(Region.TOKYO)
                                .targetProcesses(2)
                                .build()))
                        .build())
                    .build())
                .call();

        if (res.application().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `partialAppConfigWithServiceConfig`                                                           | [PartialAppConfigWithServiceConfig](../../models/shared/PartialAppConfigWithServiceConfig.md) | :heavy_check_mark:                                                                            | N/A                                                                                           |                                                                                               |
| `appId`                                                                                       | *Optional\<String>*                                                                           | :heavy_minus_sign:                                                                            | N/A                                                                                           | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                      |

### Response

**[PatchAppResponse](../../models/operations/PatchAppResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## updateApp

Set application config (will override all fields) for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

### Example Usage

<!-- UsageSnippet language="java" operationID="UpdateApp" method="post" path="/apps/v2/apps/{appId}" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.UpdateAppResponse;
import dev.hathora.cloud_sdk.models.shared.*;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        UpdateAppResponse res = sdk.appsV2().updateApp()
                .appConfigWithServiceConfig(AppConfigWithServiceConfig.builder()
                    .appName("minecraft")
                    .authConfiguration(AuthConfiguration.builder()
                        .build())
                    .serviceConfig(ServiceConfigWrite.builder()
                        .staticProcessAllocation(List.of(
                            StaticProcessAllocationConfigWrite.builder()
                                .maxProcesses(3)
                                .minProcesses(1)
                                .region(Region.SAO_PAULO)
                                .targetProcesses(2)
                                .build(),
                            StaticProcessAllocationConfigWrite.builder()
                                .maxProcesses(3)
                                .minProcesses(1)
                                .region(Region.SAO_PAULO)
                                .targetProcesses(2)
                                .build()))
                        .build())
                    .build())
                .call();

        if (res.application().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     | Example                                                                         |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `appConfigWithServiceConfig`                                                    | [AppConfigWithServiceConfig](../../models/shared/AppConfigWithServiceConfig.md) | :heavy_check_mark:                                                              | N/A                                                                             |                                                                                 |
| `appId`                                                                         | *Optional\<String>*                                                             | :heavy_minus_sign:                                                              | N/A                                                                             | app-af469a92-5b45-4565-b3c4-b79878de67d2                                        |

### Response

**[UpdateAppResponse](../../models/operations/UpdateAppResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |