# BuildsV1
(*buildsV1()*)

## Overview

### Available Operations

* [~~createBuildDeprecated~~](#createbuilddeprecated) - Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build). Responds with a `buildId` that you must pass to [`RunBuild()`](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a `buildTag` to associate an external version with a build. :warning: **Deprecated**
* [~~deleteBuildDeprecated~~](#deletebuilddeprecated) - Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build). All associated metadata is deleted. :warning: **Deprecated**
* [~~getBuildInfoDeprecated~~](#getbuildinfodeprecated) - Get details for a [build](https://hathora.dev/docs/concepts/hathora-entities#build). :warning: **Deprecated**
* [~~getBuildsDeprecated~~](#getbuildsdeprecated) - Returns an array of [builds](https://hathora.dev/docs/concepts/hathora-entities#build) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). :warning: **Deprecated**
* [~~runBuildDeprecated~~](#runbuilddeprecated) - Builds a game server artifact from a tarball you provide. Pass in the `buildId` generated from [`CreateBuild()`](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild). :warning: **Deprecated**

## ~~createBuildDeprecated~~

Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build). Responds with a `buildId` that you must pass to [`RunBuild()`](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a `buildTag` to associate an external version with a build.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_sdk.HathoraCloud;
import com.hathora.cloud_sdk.models.errors.SDKError;
import com.hathora.cloud_sdk.models.operations.CreateBuildDeprecatedResponse;
import com.hathora.cloud_sdk.models.shared.CreateBuildParams;
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

            CreateBuildDeprecatedResponse res = sdk.buildsV1().createBuildDeprecated()
                .createBuildParams(CreateBuildParams.builder()
                    .buildTag("0.1.14-14c793")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .call();

            if (res.build().isPresent()) {
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

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `createBuildParams`                                           | [CreateBuildParams](../../models/shared/CreateBuildParams.md) | :heavy_check_mark:                                            | N/A                                                           |                                                               |
| `appId`                                                       | *Optional<String>*                                            | :heavy_minus_sign:                                            | N/A                                                           | app-af469a92-5b45-4565-b3c4-b79878de67d2                      |

### Response

**[CreateBuildDeprecatedResponse](../../models/operations/CreateBuildDeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429,500        | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## ~~deleteBuildDeprecated~~

Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build). All associated metadata is deleted.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_sdk.HathoraCloud;
import com.hathora.cloud_sdk.models.errors.SDKError;
import com.hathora.cloud_sdk.models.operations.DeleteBuildDeprecatedResponse;
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

            DeleteBuildDeprecatedResponse res = sdk.buildsV1().deleteBuildDeprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .buildId(1)
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
| `buildId`                                | *int*                                    | :heavy_check_mark:                       | N/A                                      | 1                                        |

### Response

**[DeleteBuildDeprecatedResponse](../../models/operations/DeleteBuildDeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,422,429,500    | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## ~~getBuildInfoDeprecated~~

Get details for a [build](https://hathora.dev/docs/concepts/hathora-entities#build).

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_sdk.HathoraCloud;
import com.hathora.cloud_sdk.models.errors.SDKError;
import com.hathora.cloud_sdk.models.operations.GetBuildInfoDeprecatedResponse;
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

            GetBuildInfoDeprecatedResponse res = sdk.buildsV1().getBuildInfoDeprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .buildId(1)
                .call();

            if (res.build().isPresent()) {
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
| `buildId`                                | *int*                                    | :heavy_check_mark:                       | N/A                                      | 1                                        |

### Response

**[GetBuildInfoDeprecatedResponse](../../models/operations/GetBuildInfoDeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## ~~getBuildsDeprecated~~

Returns an array of [builds](https://hathora.dev/docs/concepts/hathora-entities#build) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_sdk.HathoraCloud;
import com.hathora.cloud_sdk.models.errors.SDKError;
import com.hathora.cloud_sdk.models.operations.GetBuildsDeprecatedResponse;
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

            GetBuildsDeprecatedResponse res = sdk.buildsV1().getBuildsDeprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
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

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional<String>*                       | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |

### Response

**[GetBuildsDeprecatedResponse](../../models/operations/GetBuildsDeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## ~~runBuildDeprecated~~

Builds a game server artifact from a tarball you provide. Pass in the `buildId` generated from [`CreateBuild()`](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild).

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_sdk.HathoraCloud;
import com.hathora.cloud_sdk.models.errors.SDKError;
import com.hathora.cloud_sdk.models.operations.File;
import com.hathora.cloud_sdk.models.operations.RunBuildDeprecatedRequestBody;
import com.hathora.cloud_sdk.models.operations.RunBuildDeprecatedResponse;
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

            RunBuildDeprecatedResponse res = sdk.buildsV1().runBuildDeprecated()
                .requestBody(RunBuildDeprecatedRequestBody.builder()
                    .file(File.builder()
                        .content("0x96Cf4be63b".getBytes())
                        .fileName("example.file")
                        .build())
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .buildId(1)
                .call();

            if (res.res().isPresent()) {
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

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `requestBody`                                                                             | [RunBuildDeprecatedRequestBody](../../models/operations/RunBuildDeprecatedRequestBody.md) | :heavy_check_mark:                                                                        | N/A                                                                                       |                                                                                           |
| `appId`                                                                                   | *Optional<String>*                                                                        | :heavy_minus_sign:                                                                        | N/A                                                                                       | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                  |
| `buildId`                                                                                 | *int*                                                                                     | :heavy_check_mark:                                                                        | N/A                                                                                       | 1                                                                                         |

### Response

**[RunBuildDeprecatedResponse](../../models/operations/RunBuildDeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 400,401,404,429,500    | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
