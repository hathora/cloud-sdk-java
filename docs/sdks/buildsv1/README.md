# ~~BuildsV1~~

> [!WARNING]
> This SDK is **DEPRECATED**

## Overview

### Available Operations

* [~~createBuildDeprecated~~](#createbuilddeprecated) - CreateBuildDeprecated :warning: **Deprecated**
* [~~deleteBuildDeprecated~~](#deletebuilddeprecated) - DeleteBuildDeprecated :warning: **Deprecated**
* [~~getBuildInfoDeprecated~~](#getbuildinfodeprecated) - GetBuildInfoDeprecated :warning: **Deprecated**
* [~~getBuildsDeprecated~~](#getbuildsdeprecated) - GetBuildsDeprecated :warning: **Deprecated**
* [~~runBuildDeprecated~~](#runbuilddeprecated) - RunBuildDeprecated :warning: **Deprecated**

## ~~createBuildDeprecated~~

Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build). Responds with a `buildId` that you must pass to [`RunBuild()`](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a `buildTag` to associate an external version with a build.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="CreateBuildDeprecated" method="post" path="/builds/v1/{appId}/create" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateBuildDeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.CreateBuildParams;
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

        CreateBuildDeprecatedResponse res = sdk.buildsV1().createBuildDeprecated()
                .createBuildParams(CreateBuildParams.builder()
                    .buildTag("0.1.14-14c793")
                    .build())
                .call();

        if (res.build().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `createBuildParams`                                           | [CreateBuildParams](../../models/shared/CreateBuildParams.md) | :heavy_check_mark:                                            | N/A                                                           |                                                               |
| `appId`                                                       | *Optional\<String>*                                           | :heavy_minus_sign:                                            | N/A                                                           | app-af469a92-5b45-4565-b3c4-b79878de67d2                      |

### Response

**[CreateBuildDeprecatedResponse](../../models/operations/CreateBuildDeprecatedResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## ~~deleteBuildDeprecated~~

Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build). All associated metadata is deleted.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="DeleteBuildDeprecated" method="delete" path="/builds/v1/{appId}/delete/{buildId}" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.DeleteBuildDeprecatedResponse;
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

        DeleteBuildDeprecatedResponse res = sdk.buildsV1().deleteBuildDeprecated()
                .buildId(1)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `buildId`                                | *int*                                    | :heavy_check_mark:                       | N/A                                      | 1                                        |

### Response

**[DeleteBuildDeprecatedResponse](../../models/operations/DeleteBuildDeprecatedResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## ~~getBuildInfoDeprecated~~

Get details for a [build](https://hathora.dev/docs/concepts/hathora-entities#build).

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetBuildInfoDeprecated" method="get" path="/builds/v1/{appId}/info/{buildId}" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetBuildInfoDeprecatedResponse;
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

        GetBuildInfoDeprecatedResponse res = sdk.buildsV1().getBuildInfoDeprecated()
                .buildId(1)
                .call();

        if (res.build().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `buildId`                                | *int*                                    | :heavy_check_mark:                       | N/A                                      | 1                                        |

### Response

**[GetBuildInfoDeprecatedResponse](../../models/operations/GetBuildInfoDeprecatedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 408, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~getBuildsDeprecated~~

Returns an array of [builds](https://hathora.dev/docs/concepts/hathora-entities#build) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetBuildsDeprecated" method="get" path="/builds/v1/{appId}/list" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetBuildsDeprecatedResponse;
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

        GetBuildsDeprecatedResponse res = sdk.buildsV1().getBuildsDeprecated()
                .call();

        if (res.classes().isPresent()) {
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

**[GetBuildsDeprecatedResponse](../../models/operations/GetBuildsDeprecatedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 408, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~runBuildDeprecated~~

Builds a game server artifact from a tarball you provide. Pass in the `buildId` generated from [`CreateBuild()`](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild).

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="RunBuildDeprecated" method="post" path="/builds/v1/{appId}/run/{buildId}" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.*;
import dev.hathora.cloud_sdk.models.shared.Security;
import dev.hathora.cloud_sdk.utils.Utils;
import java.io.FileInputStream;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        RunBuildDeprecatedResponse res = sdk.buildsV1().runBuildDeprecated()
                .requestBody(RunBuildDeprecatedRequestBody.builder()
                    .file(File.builder()
                        .content(Utils.readBytesAndClose(new FileInputStream("example.file")))
                        .fileName("example.file")
                        .build())
                    .build())
                .buildId(1)
                .call();

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `requestBody`                                                                             | [RunBuildDeprecatedRequestBody](../../models/operations/RunBuildDeprecatedRequestBody.md) | :heavy_check_mark:                                                                        | N/A                                                                                       |                                                                                           |
| `appId`                                                                                   | *Optional\<String>*                                                                       | :heavy_minus_sign:                                                                        | N/A                                                                                       | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                  |
| `buildId`                                                                                 | *int*                                                                                     | :heavy_check_mark:                                                                        | N/A                                                                                       | 1                                                                                         |

### Response

**[RunBuildDeprecatedResponse](../../models/operations/RunBuildDeprecatedResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ApiError       | 400, 401, 404, 408, 422, 429 | application/json             |
| models/errors/ApiError       | 500                          | application/json             |
| models/errors/SDKError       | 4XX, 5XX                     | \*/\*                        |