# AppsV1
(*appsV1()*)

## Overview

### Available Operations

* [createAppV1Deprecated](#createappv1deprecated) - Create a new [application](https://hathora.dev/docs/concepts/hathora-entities#application).
* [deleteAppV1Deprecated](#deleteappv1deprecated) - Delete an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Your organization will lose access to this application.
* [getAppInfoV1Deprecated](#getappinfov1deprecated) - Get details for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.
* [getAppsV1Deprecated](#getappsv1deprecated) - Returns an unsorted list of your organization’s [applications](https://hathora.dev/docs/concepts/hathora-entities#application). An application is uniquely identified by an `appId`.
* [updateAppV1Deprecated](#updateappv1deprecated) - Update data for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

## createAppV1Deprecated

Create a new [application](https://hathora.dev/docs/concepts/hathora-entities#application).

### Example Usage

```java
package hello.world;

import com.hathora.cloud_sdk.HathoraCloud;
import com.hathora.cloud_sdk.models.errors.SDKError;
import com.hathora.cloud_sdk.models.operations.CreateAppV1DeprecatedResponse;
import com.hathora.cloud_sdk.models.shared.AppConfig;
import com.hathora.cloud_sdk.models.shared.AuthConfiguration;
import com.hathora.cloud_sdk.models.shared.Security;
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

            AppConfig req = AppConfig.builder()
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
        } catch (com.hathora.cloud_sdk.models.errors.ApiError e) {
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

| Parameter                                     | Type                                          | Required                                      | Description                                   |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `request`                                     | [AppConfig](../../models/shared/AppConfig.md) | :heavy_check_mark:                            | The request object to use for the request.    |

### Response

**[CreateAppV1DeprecatedResponse](../../models/operations/CreateAppV1DeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,422,429,500        | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## deleteAppV1Deprecated

Delete an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Your organization will lose access to this application.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_sdk.HathoraCloud;
import com.hathora.cloud_sdk.models.errors.SDKError;
import com.hathora.cloud_sdk.models.operations.DeleteAppV1DeprecatedResponse;
import com.hathora.cloud_sdk.models.shared.Security;
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

            DeleteAppV1DeprecatedResponse res = sdk.appsV1().deleteAppV1Deprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .call();

            // handle response
        } catch (com.hathora.cloud_sdk.models.errors.ApiError e) {
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

### Response

**[DeleteAppV1DeprecatedResponse](../../models/operations/DeleteAppV1DeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429,500        | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getAppInfoV1Deprecated

Get details for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_sdk.HathoraCloud;
import com.hathora.cloud_sdk.models.errors.SDKError;
import com.hathora.cloud_sdk.models.operations.GetAppInfoV1DeprecatedResponse;
import com.hathora.cloud_sdk.models.shared.Security;
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

            GetAppInfoV1DeprecatedResponse res = sdk.appsV1().getAppInfoV1Deprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .call();

            if (res.application().isPresent()) {
                // handle response
            }
        } catch (com.hathora.cloud_sdk.models.errors.ApiError e) {
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

### Response

**[GetAppInfoV1DeprecatedResponse](../../models/operations/GetAppInfoV1DeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getAppsV1Deprecated

Returns an unsorted list of your organization’s [applications](https://hathora.dev/docs/concepts/hathora-entities#application). An application is uniquely identified by an `appId`.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_sdk.HathoraCloud;
import com.hathora.cloud_sdk.models.errors.SDKError;
import com.hathora.cloud_sdk.models.operations.GetAppsV1DeprecatedResponse;
import com.hathora.cloud_sdk.models.shared.Security;
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

            GetAppsV1DeprecatedResponse res = sdk.appsV1().getAppsV1Deprecated()
                .call();

            if (res.classes().isPresent()) {
                // handle response
            }
        } catch (com.hathora.cloud_sdk.models.errors.ApiError e) {
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

### Response

**[GetAppsV1DeprecatedResponse](../../models/operations/GetAppsV1DeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,429                | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## updateAppV1Deprecated

Update data for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_sdk.HathoraCloud;
import com.hathora.cloud_sdk.models.errors.SDKError;
import com.hathora.cloud_sdk.models.operations.UpdateAppV1DeprecatedResponse;
import com.hathora.cloud_sdk.models.shared.AppConfig;
import com.hathora.cloud_sdk.models.shared.AuthConfiguration;
import com.hathora.cloud_sdk.models.shared.Security;
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

            UpdateAppV1DeprecatedResponse res = sdk.appsV1().updateAppV1Deprecated()
                .appConfig(AppConfig.builder()
                    .appName("minecraft")
                    .authConfiguration(AuthConfiguration.builder()
                            .build())
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .call();

            if (res.application().isPresent()) {
                // handle response
            }
        } catch (com.hathora.cloud_sdk.models.errors.ApiError e) {
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

| Parameter                                     | Type                                          | Required                                      | Description                                   | Example                                       |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `appConfig`                                   | [AppConfig](../../models/shared/AppConfig.md) | :heavy_check_mark:                            | N/A                                           |                                               |
| `appId`                                       | *Optional<String>*                            | :heavy_minus_sign:                            | N/A                                           | app-af469a92-5b45-4565-b3c4-b79878de67d2      |

### Response

**[UpdateAppV1DeprecatedResponse](../../models/operations/UpdateAppV1DeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,422,429,500    | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
