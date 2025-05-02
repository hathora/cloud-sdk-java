# BuildsV3
(*buildsV3()*)

## Overview

Operations that allow you create and manage your [builds](https://hathora.dev/docs/concepts/hathora-entities#build).

### Available Operations

* [createBuild](#createbuild) - CreateBuild
* [createBuildRegistry](#createbuildregistry) - CreateBuildRegistry
* [deleteBuild](#deletebuild) - DeleteBuild
* [getBuild](#getbuild) - GetBuild
* [getBuilds](#getbuilds) - GetBuilds
* [runBuild](#runbuild) - RunBuild
* [runBuildRegistry](#runbuildregistry) - RunBuildRegistry

## createBuild

Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build) with optional `multipartUploadUrls` that can be used to upload larger builds in parts before calling `runBuild`. Responds with a `buildId` that you must pass to [`RunBuild()`](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a `buildTag` to associate an external version with a build.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateBuildResponse;
import dev.hathora.cloud_sdk.models.shared.CreateMultipartBuildParams;
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

        CreateBuildResponse res = sdk.buildsV3().createBuild()
                .createMultipartBuildParams(CreateMultipartBuildParams.builder()
                    .buildSizeInBytes(5387.85)
                    .buildId("bld-6d4c6a71-2d75-4b42-94e1-f312f57f33c5")
                    .buildTag("0.1.14-14c793")
                    .build())
                .call();

        if (res.createdBuildV3WithMultipartUrls().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     | Example                                                                         |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `createMultipartBuildParams`                                                    | [CreateMultipartBuildParams](../../models/shared/CreateMultipartBuildParams.md) | :heavy_check_mark:                                                              | N/A                                                                             |                                                                                 |
| `orgId`                                                                         | *Optional\<String>*                                                             | :heavy_minus_sign:                                                              | N/A                                                                             | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39                                        |

### Response

**[CreateBuildResponse](../../models/operations/CreateBuildResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 400, 401, 404, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## createBuildRegistry

Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build) to be used with `runBuildRegistry`. Responds with a `buildId` that you must pass to [`RunBuildRegistry()`](https://hathora.dev/api#tag/BuildV3/operation/RunBuildRegistry) to build the game server artifact. You can optionally pass in a `buildTag` to associate an external version with a build.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateBuildRegistryResponse;
import dev.hathora.cloud_sdk.models.shared.CreateBuildV3Params;
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

        CreateBuildRegistryResponse res = sdk.buildsV3().createBuildRegistry()
                .createBuildV3Params(CreateBuildV3Params.builder()
                    .buildId("bld-6d4c6a71-2d75-4b42-94e1-f312f57f33c5")
                    .buildTag("0.1.14-14c793")
                    .build())
                .call();

        if (res.buildV3().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       | Example                                                           |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `createBuildV3Params`                                             | [CreateBuildV3Params](../../models/shared/CreateBuildV3Params.md) | :heavy_check_mark:                                                | N/A                                                               |                                                                   |
| `orgId`                                                           | *Optional\<String>*                                               | :heavy_minus_sign:                                                | N/A                                                               | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39                          |

### Response

**[CreateBuildRegistryResponse](../../models/operations/CreateBuildRegistryResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 400, 401, 404, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## deleteBuild

Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build). All associated metadata is deleted.
Be careful which builds you delete. This endpoint does not prevent you from deleting actively used builds.
Deleting a build that is actively build used by an app's deployment will cause failures when creating rooms.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.DeleteBuildResponse;
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

        DeleteBuildResponse res = sdk.buildsV3().deleteBuild()
                .buildId("bld-6d4c6a71-2d75-4b42-94e1-f312f57f33c5")
                .call();

        if (res.deletedBuild().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `buildId`                                | *String*                                 | :heavy_check_mark:                       | N/A                                      | bld-6d4c6a71-2d75-4b42-94e1-f312f57f33c5 |
| `orgId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39 |

### Response

**[DeleteBuildResponse](../../models/operations/DeleteBuildResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 422, 429     | application/json       |
| models/errors/ApiError | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getBuild

Get details for a [build](https://hathora.dev/docs/concepts/hathora-entities#build).

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetBuildResponse;
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

        GetBuildResponse res = sdk.buildsV3().getBuild()
                .buildId("bld-6d4c6a71-2d75-4b42-94e1-f312f57f33c5")
                .call();

        if (res.buildV3().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `buildId`                                | *String*                                 | :heavy_check_mark:                       | N/A                                      | bld-6d4c6a71-2d75-4b42-94e1-f312f57f33c5 |
| `orgId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39 |

### Response

**[GetBuildResponse](../../models/operations/GetBuildResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getBuilds

Returns an array of [builds](https://hathora.dev/docs/concepts/hathora-entities#build) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetBuildsResponse;
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

        GetBuildsResponse res = sdk.buildsV3().getBuilds()
                .call();

        if (res.buildsV3Page().isPresent()) {
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

**[GetBuildsResponse](../../models/operations/GetBuildsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 422, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## runBuild

Builds a game server artifact from a tarball you provide. Pass in the `buildId` generated from [`CreateBuild()`](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild).

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.RunBuildResponse;
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

        RunBuildResponse res = sdk.buildsV3().runBuild()
                .buildId("bld-6d4c6a71-2d75-4b42-94e1-f312f57f33c5")
                .call();

        if (res.responseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `buildId`                                | *String*                                 | :heavy_check_mark:                       | N/A                                      | bld-6d4c6a71-2d75-4b42-94e1-f312f57f33c5 |
| `orgId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39 |

### Response

**[RunBuildResponse](../../models/operations/RunBuildResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 400, 401, 404, 429     | application/json       |
| models/errors/ApiError | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## runBuildRegistry

Builds a game server artifact from a public or private registry. Pass in the `buildId` generated from [`CreateBuild()`](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild).

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.RunBuildRegistryResponse;
import dev.hathora.cloud_sdk.models.shared.RegistryConfig;
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

        RunBuildRegistryResponse res = sdk.buildsV3().runBuildRegistry()
                .registryConfig(RegistryConfig.builder()
                    .image("https://loremflickr.com/1435/2196?lock=7778272511635490")
                    .build())
                .buildId("bld-6d4c6a71-2d75-4b42-94e1-f312f57f33c5")
                .call();

        if (res.responseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `registryConfig`                                        | [RegistryConfig](../../models/shared/RegistryConfig.md) | :heavy_check_mark:                                      | N/A                                                     |                                                         |
| `buildId`                                               | *String*                                                | :heavy_check_mark:                                      | N/A                                                     | bld-6d4c6a71-2d75-4b42-94e1-f312f57f33c5                |
| `orgId`                                                 | *Optional\<String>*                                     | :heavy_minus_sign:                                      | N/A                                                     | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39                |

### Response

**[RunBuildRegistryResponse](../../models/operations/RunBuildRegistryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 400, 401, 404, 429     | application/json       |
| models/errors/ApiError | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |