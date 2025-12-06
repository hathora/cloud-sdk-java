# ~~AppsV1~~

> [!WARNING]
> This SDK is **DEPRECATED**

## Overview

### Available Operations

* [~~createAppV1Deprecated~~](#createappv1deprecated) - CreateAppV1Deprecated :warning: **Deprecated**
* [~~deleteAppV1Deprecated~~](#deleteappv1deprecated) - DeleteAppV1Deprecated :warning: **Deprecated**
* [~~getAppInfoV1Deprecated~~](#getappinfov1deprecated) - GetAppInfoV1Deprecated :warning: **Deprecated**
* [~~getAppsV1Deprecated~~](#getappsv1deprecated) - GetAppsV1Deprecated :warning: **Deprecated**
* [~~updateAppV1Deprecated~~](#updateappv1deprecated) - UpdateAppV1Deprecated :warning: **Deprecated**

## ~~createAppV1Deprecated~~

Create a new [application](https://hathora.dev/docs/concepts/hathora-entities#application).

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="CreateAppV1Deprecated" method="post" path="/apps/v1/create" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateAppV1DeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        CreateAppConfig req = CreateAppConfig.builder()
                .appName("minecraft")
                .authConfiguration(AuthConfiguration.builder()
                    .build())
                .build();

        CreateAppV1DeprecatedResponse res = sdk.appsV1().createAppV1Deprecated()
                .request(req)
                .call();

        if (res.application().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [CreateAppConfig](../../models/shared/CreateAppConfig.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[CreateAppV1DeprecatedResponse](../../models/operations/CreateAppV1DeprecatedResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## ~~deleteAppV1Deprecated~~

Delete an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Your organization will lose access to this application.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="DeleteAppV1Deprecated" method="delete" path="/apps/v1/delete/{appId}" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.DeleteAppV1DeprecatedResponse;
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

        DeleteAppV1DeprecatedResponse res = sdk.appsV1().deleteAppV1Deprecated()
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

**[DeleteAppV1DeprecatedResponse](../../models/operations/DeleteAppV1DeprecatedResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## ~~getAppInfoV1Deprecated~~

Get details for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetAppInfoV1Deprecated" method="get" path="/apps/v1/info/{appId}" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetAppInfoV1DeprecatedResponse;
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

        GetAppInfoV1DeprecatedResponse res = sdk.appsV1().getAppInfoV1Deprecated()
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

**[GetAppInfoV1DeprecatedResponse](../../models/operations/GetAppInfoV1DeprecatedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 408, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~getAppsV1Deprecated~~

Returns an unsorted list of your organization’s [applications](https://hathora.dev/docs/concepts/hathora-entities#application). An application is uniquely identified by an `appId`.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetAppsV1Deprecated" method="get" path="/apps/v1/list" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetAppsV1DeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        GetAppsV1DeprecatedResponse res = sdk.appsV1().getAppsV1Deprecated()
                .call();

        if (res.classes().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetAppsV1DeprecatedResponse](../../models/operations/GetAppsV1DeprecatedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 408, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~updateAppV1Deprecated~~

Update data for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="UpdateAppV1Deprecated" method="post" path="/apps/v1/update/{appId}" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.UpdateAppV1DeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        UpdateAppV1DeprecatedResponse res = sdk.appsV1().updateAppV1Deprecated()
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
| `appId`                                                   | *Optional\<String>*                                       | :heavy_minus_sign:                                        | N/A                                                       | app-af469a92-5b45-4565-b3c4-b79878de67d2                  |

### Response

**[UpdateAppV1DeprecatedResponse](../../models/operations/UpdateAppV1DeprecatedResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |