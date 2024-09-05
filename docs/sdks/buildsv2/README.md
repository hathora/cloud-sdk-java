# BuildsV2
(*buildsV2()*)

## Overview

### Available Operations

* [createBuildV2Deprecated](#createbuildv2deprecated) - Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build). Responds with a `buildId` that you must pass to [`RunBuild()`](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a `buildTag` to associate an external version with a build.
* [createBuildWithUploadUrlV2Deprecated](#createbuildwithuploadurlv2deprecated) - Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build) with `uploadUrl` that can be used to upload the build to before calling `runBuild`. Responds with a `buildId` that you must pass to [`RunBuild()`](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a `buildTag` to associate an external version with a build.
* [createWithMultipartUploadsV2Deprecated](#createwithmultipartuploadsv2deprecated) - Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build) with optional `multipartUploadUrls` that can be used to upload larger builds in parts before calling `runBuild`. Responds with a `buildId` that you must pass to [`RunBuild()`](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a `buildTag` to associate an external version with a build.
* [deleteBuildV2Deprecated](#deletebuildv2deprecated) - Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build). All associated metadata is deleted.
* [getBuildInfoV2Deprecated](#getbuildinfov2deprecated) - Get details for a [build](https://hathora.dev/docs/concepts/hathora-entities#build).
* [getBuildsV2Deprecated](#getbuildsv2deprecated) - Returns an array of [builds](https://hathora.dev/docs/concepts/hathora-entities#build) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).
* [runBuildV2Deprecated](#runbuildv2deprecated) - Builds a game server artifact from a tarball you provide. Pass in the `buildId` generated from [`CreateBuild()`](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild).

## createBuildV2Deprecated

Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build). Responds with a `buildId` that you must pass to [`RunBuild()`](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a `buildTag` to associate an external version with a build.

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.CreateBuildV2DeprecatedResponse;
import com.hathora.hathora_cloud_sdk.models.shared.CreateBuildParams;
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

            CreateBuildV2DeprecatedResponse res = sdk.buildsV2().createBuildV2Deprecated()
                .createBuildParams(CreateBuildParams.builder()
                    .buildTag("0.1.14-14c793")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .call();

            if (res.build().isPresent()) {
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

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `createBuildParams`                                           | [CreateBuildParams](../../models/shared/CreateBuildParams.md) | :heavy_check_mark:                                            | N/A                                                           |                                                               |
| `appId`                                                       | *Optional<String>*                                            | :heavy_minus_sign:                                            | N/A                                                           | app-af469a92-5b45-4565-b3c4-b79878de67d2                      |

### Response

**[CreateBuildV2DeprecatedResponse](../../models/operations/CreateBuildV2DeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429,500        | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## createBuildWithUploadUrlV2Deprecated

Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build) with `uploadUrl` that can be used to upload the build to before calling `runBuild`. Responds with a `buildId` that you must pass to [`RunBuild()`](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a `buildTag` to associate an external version with a build.

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.CreateBuildWithUploadUrlV2DeprecatedResponse;
import com.hathora.hathora_cloud_sdk.models.shared.CreateBuildParams;
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

            CreateBuildWithUploadUrlV2DeprecatedResponse res = sdk.buildsV2().createBuildWithUploadUrlV2Deprecated()
                .createBuildParams(CreateBuildParams.builder()
                    .buildTag("0.1.14-14c793")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .call();

            if (res.buildWithUploadUrl().isPresent()) {
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

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `createBuildParams`                                           | [CreateBuildParams](../../models/shared/CreateBuildParams.md) | :heavy_check_mark:                                            | N/A                                                           |                                                               |
| `appId`                                                       | *Optional<String>*                                            | :heavy_minus_sign:                                            | N/A                                                           | app-af469a92-5b45-4565-b3c4-b79878de67d2                      |

### Response

**[CreateBuildWithUploadUrlV2DeprecatedResponse](../../models/operations/CreateBuildWithUploadUrlV2DeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429,500        | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## createWithMultipartUploadsV2Deprecated

Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build) with optional `multipartUploadUrls` that can be used to upload larger builds in parts before calling `runBuild`. Responds with a `buildId` that you must pass to [`RunBuild()`](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a `buildTag` to associate an external version with a build.

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.CreateWithMultipartUploadsV2DeprecatedResponse;
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

            CreateWithMultipartUploadsV2DeprecatedResponse res = sdk.buildsV2().createWithMultipartUploadsV2Deprecated()
                .createMultipartBuildParams(CreateMultipartBuildParams.builder()
                    .buildSizeInBytes(3146.66d)
                    .buildTag("0.1.14-14c793")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .call();

            if (res.buildWithMultipartUrls().isPresent()) {
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
| `appId`                                                                         | *Optional<String>*                                                              | :heavy_minus_sign:                                                              | N/A                                                                             | app-af469a92-5b45-4565-b3c4-b79878de67d2                                        |

### Response

**[CreateWithMultipartUploadsV2DeprecatedResponse](../../models/operations/CreateWithMultipartUploadsV2DeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 400,401,404,429,500    | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## deleteBuildV2Deprecated

Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build). All associated metadata is deleted.

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.DeleteBuildV2DeprecatedResponse;
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

            DeleteBuildV2DeprecatedResponse res = sdk.buildsV2().deleteBuildV2Deprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .buildId(1)
                .call();

            // handle response
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
| `buildId`                                | *int*                                    | :heavy_check_mark:                       | N/A                                      | 1                                        |

### Response

**[DeleteBuildV2DeprecatedResponse](../../models/operations/DeleteBuildV2DeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,422,429,500    | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getBuildInfoV2Deprecated

Get details for a [build](https://hathora.dev/docs/concepts/hathora-entities#build).

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.GetBuildInfoV2DeprecatedResponse;
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

            GetBuildInfoV2DeprecatedResponse res = sdk.buildsV2().getBuildInfoV2Deprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .buildId(1)
                .call();

            if (res.build().isPresent()) {
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
| `buildId`                                | *int*                                    | :heavy_check_mark:                       | N/A                                      | 1                                        |

### Response

**[GetBuildInfoV2DeprecatedResponse](../../models/operations/GetBuildInfoV2DeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getBuildsV2Deprecated

Returns an array of [builds](https://hathora.dev/docs/concepts/hathora-entities#build) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.GetBuildsV2DeprecatedResponse;
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

            GetBuildsV2DeprecatedResponse res = sdk.buildsV2().getBuildsV2Deprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
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

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional<String>*                       | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |

### Response

**[GetBuildsV2DeprecatedResponse](../../models/operations/GetBuildsV2DeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## runBuildV2Deprecated

Builds a game server artifact from a tarball you provide. Pass in the `buildId` generated from [`CreateBuild()`](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild).

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.RunBuildV2DeprecatedRequestBody;
import com.hathora.hathora_cloud_sdk.models.operations.RunBuildV2DeprecatedResponse;
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

            RunBuildV2DeprecatedResponse res = sdk.buildsV2().runBuildV2Deprecated()
                .requestBody(RunBuildV2DeprecatedRequestBody.builder()
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .buildId(1)
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

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                 | [RunBuildV2DeprecatedRequestBody](../../models/operations/RunBuildV2DeprecatedRequestBody.md) | :heavy_check_mark:                                                                            | N/A                                                                                           |                                                                                               |
| `appId`                                                                                       | *Optional<String>*                                                                            | :heavy_minus_sign:                                                                            | N/A                                                                                           | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                      |
| `buildId`                                                                                     | *int*                                                                                         | :heavy_check_mark:                                                                            | N/A                                                                                           | 1                                                                                             |

### Response

**[RunBuildV2DeprecatedResponse](../../models/operations/RunBuildV2DeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 400,401,404,429,500    | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
