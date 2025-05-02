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

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateAppResponse;
import dev.hathora.cloud_sdk.models.shared.*;
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

        CreateAppResponse res = sdk.appsV2().createApp()
                .appConfig(AppConfig.builder()
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

| Parameter                                     | Type                                          | Required                                      | Description                                   | Example                                       |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `appConfig`                                   | [AppConfig](../../models/shared/AppConfig.md) | :heavy_check_mark:                            | N/A                                           |                                               |
| `orgId`                                       | *Optional\<String>*                           | :heavy_minus_sign:                            | N/A                                           | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39      |

### Response

**[CreateAppResponse](../../models/operations/CreateAppResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 422, 429     | application/json       |
| models/errors/ApiError | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteApp

Delete an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Your organization will lose access to this application.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.DeleteAppResponse;
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

        DeleteAppResponse res = sdk.appsV2().deleteApp()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
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

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 429          | application/json       |
| models/errors/ApiError | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getApp

Get details for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

### Example Usage

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
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        GetAppResponse res = sdk.appsV2().getApp()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
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
| models/errors/ApiError | 401, 404, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getApps

Returns an unsorted list of your organization’s [applications](https://hathora.dev/docs/concepts/hathora-entities#application). An application is uniquely identified by an `appId`.

### Example Usage

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
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
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
| models/errors/ApiError | 401, 404, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchApp

Patch data for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.PatchAppResponse;
import dev.hathora.cloud_sdk.models.shared.*;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ApiError, ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        PatchAppResponse res = sdk.appsV2().patchApp()
                .partialAppConfigWithServiceConfig(PartialAppConfigWithServiceConfig.builder()
                    .serviceConfig(ServiceConfig.builder()
                        .staticProcessAllocation(List.of())
                        .build())
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
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

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 422, 429     | application/json       |
| models/errors/ApiError | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateApp

Set application config (will override all fields) for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.UpdateAppResponse;
import dev.hathora.cloud_sdk.models.shared.*;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ApiError, ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        UpdateAppResponse res = sdk.appsV2().updateApp()
                .appConfigWithServiceConfig(AppConfigWithServiceConfig.builder()
                    .appName("minecraft")
                    .authConfiguration(AuthConfiguration.builder()
                        .build())
                    .serviceConfig(ServiceConfig.builder()
                        .staticProcessAllocation(List.of())
                        .build())
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
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

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 422, 429     | application/json       |
| models/errors/ApiError | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |