# BuildsV3
(*buildsV3()*)

## Overview

### Available Operations

* [createBuild](#createbuild) - Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build) with optional `multipartUploadUrls` that can be used to upload larger builds in parts before calling `runBuild`. Responds with a `buildId` that you must pass to [`RunBuild()`](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a `buildTag` to associate an external version with a build.
* [deleteBuild](#deletebuild) - Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build). All associated metadata is deleted.
Be careful which builds you delete. This endpoint does not prevent you from deleting actively used builds.
Deleting a build that is actively build used by an app's deployment will cause failures when creating rooms.
* [getBuild](#getbuild) - Get details for a [build](https://hathora.dev/docs/concepts/hathora-entities#build).
* [getBuilds](#getbuilds) - Returns an array of [builds](https://hathora.dev/docs/concepts/hathora-entities#build) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).
* [runBuild](#runbuild) - Builds a game server artifact from a tarball you provide. Pass in the `buildId` generated from [`CreateBuild()`](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild).

## createBuild

Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build) with optional `multipartUploadUrls` that can be used to upload larger builds in parts before calling `runBuild`. Responds with a `buildId` that you must pass to [`RunBuild()`](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a `buildTag` to associate an external version with a build.

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.CreateBuildResponse;
import com.hathora.hathora_cloud_sdk.models.shared.CreateMultipartBuildParams;
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

            CreateBuildResponse res = sdk.buildsV3().createBuild()
                .createMultipartBuildParams(CreateMultipartBuildParams.builder()
                    .buildSizeInBytes(5387.85d)
                    .buildTag("0.1.14-14c793")
                    .build())
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

            if (res.createdBuildV3WithMultipartUrls().isPresent()) {
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

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     | Example                                                                         |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `createMultipartBuildParams`                                                    | [CreateMultipartBuildParams](../../models/shared/CreateMultipartBuildParams.md) | :heavy_check_mark:                                                              | N/A                                                                             |                                                                                 |
| `orgId`                                                                         | *Optional<String>*                                                              | :heavy_minus_sign:                                                              | N/A                                                                             | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39                                        |

### Response

**[CreateBuildResponse](../../models/operations/CreateBuildResponse.md)**

### Errors

| Error Object            | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 400,401,404,422,429,500 | application/json        |
| models/errors/SDKError  | 4xx-5xx                 | \*\/*                   |


## deleteBuild

Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build). All associated metadata is deleted.
Be careful which builds you delete. This endpoint does not prevent you from deleting actively used builds.
Deleting a build that is actively build used by an app's deployment will cause failures when creating rooms.

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.DeleteBuildResponse;
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

            DeleteBuildResponse res = sdk.buildsV3().deleteBuild()
                .buildId("<value>")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

            if (res.deletedBuild().isPresent()) {
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
| `buildId`                                | *String*                                 | :heavy_check_mark:                       | N/A                                      |                                          |
| `orgId`                                  | *Optional<String>*                       | :heavy_minus_sign:                       | N/A                                      | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39 |

### Response

**[DeleteBuildResponse](../../models/operations/DeleteBuildResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,422,429,500    | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getBuild

Get details for a [build](https://hathora.dev/docs/concepts/hathora-entities#build).

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.GetBuildResponse;
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

            GetBuildResponse res = sdk.buildsV3().getBuild()
                .buildId("<value>")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

            if (res.buildV3().isPresent()) {
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
| `buildId`                                | *String*                                 | :heavy_check_mark:                       | N/A                                      |                                          |
| `orgId`                                  | *Optional<String>*                       | :heavy_minus_sign:                       | N/A                                      | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39 |

### Response

**[GetBuildResponse](../../models/operations/GetBuildResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getBuilds

Returns an array of [builds](https://hathora.dev/docs/concepts/hathora-entities#build) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.GetBuildsResponse;
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

            GetBuildsResponse res = sdk.buildsV3().getBuilds()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

            if (res.buildsV3Page().isPresent()) {
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
| `orgId`                                  | *Optional<String>*                       | :heavy_minus_sign:                       | N/A                                      | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39 |

### Response

**[GetBuildsResponse](../../models/operations/GetBuildsResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## runBuild

Builds a game server artifact from a tarball you provide. Pass in the `buildId` generated from [`CreateBuild()`](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild).

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.RunBuildResponse;
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

            RunBuildResponse res = sdk.buildsV3().runBuild()
                .buildId("<value>")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

            if (res.responseStream().isPresent()) {
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
| `buildId`                                | *String*                                 | :heavy_check_mark:                       | N/A                                      |                                          |
| `orgId`                                  | *Optional<String>*                       | :heavy_minus_sign:                       | N/A                                      | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39 |

### Response

**[RunBuildResponse](../../models/operations/RunBuildResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 400,401,404,429,500    | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
