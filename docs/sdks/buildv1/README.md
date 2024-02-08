# BuildV1
(*buildV1()*)

## Overview

Operations that allow you create and manage your [builds](https://hathora.dev/docs/concepts/hathora-entities#build).

### Available Operations

* [createBuild](#createbuild) - Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build). Responds with a `buildId` that you must pass to [`RunBuild()`](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a `buildTag` to associate an external version with a build.
* [deleteBuild](#deletebuild) - Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build). All associated metadata is deleted.
* [getBuildInfo](#getbuildinfo) - Get details for a [build](https://hathora.dev/docs/concepts/hathora-entities#build).
* [getBuilds](#getbuilds) - Returns an array of [builds](https://hathora.dev/docs/concepts/hathora-entities#build) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).
* [runBuild](#runbuild) - Builds a game server artifact from a tarball you provide. Pass in the `buildId` generated from [`CreateBuild()`](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild).

## createBuild

Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build). Responds with a `buildId` that you must pass to [`RunBuild()`](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a `buildTag` to associate an external version with a build.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.CreateBuildRequest;
import dev.hathora.cloud_api.models.operations.CreateBuildResponse;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.CreateBuildParams;
import dev.hathora.cloud_api.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            CreateBuildResponse res = sdk.buildV1().createBuild()
                .createBuildParams(CreateBuildParams.builder()
                    .buildTag("0.1.14-14c793")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .call();

            if (res.build().isPresent()) {
                // handle response
            }

        } catch (dev.hathora.cloud_api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       | Example                                                                                           |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `createBuildParams`                                                                               | [dev.hathora.cloud_api.models.shared.CreateBuildParams](../../models/shared/CreateBuildParams.md) | :heavy_check_mark:                                                                                | N/A                                                                                               |                                                                                                   |
| `appId`                                                                                           | *Optional<? extends String>*                                                                      | :heavy_minus_sign:                                                                                | N/A                                                                                               | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                          |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.CreateBuildResponse>](../../models/operations/CreateBuildResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## deleteBuild

Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build). All associated metadata is deleted.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.DeleteBuildRequest;
import dev.hathora.cloud_api.models.operations.DeleteBuildResponse;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            DeleteBuildResponse res = sdk.buildV1().deleteBuild()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .buildId(1)
                .call();

            // handle response

        } catch (dev.hathora.cloud_api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional<? extends String>*             | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `buildId`                                | *int*                                    | :heavy_check_mark:                       | N/A                                      | 1                                        |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.DeleteBuildResponse>](../../models/operations/DeleteBuildResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getBuildInfo

Get details for a [build](https://hathora.dev/docs/concepts/hathora-entities#build).

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.GetBuildInfoRequest;
import dev.hathora.cloud_api.models.operations.GetBuildInfoResponse;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            GetBuildInfoResponse res = sdk.buildV1().getBuildInfo()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .buildId(1)
                .call();

            if (res.build().isPresent()) {
                // handle response
            }

        } catch (dev.hathora.cloud_api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional<? extends String>*             | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `buildId`                                | *int*                                    | :heavy_check_mark:                       | N/A                                      | 1                                        |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.GetBuildInfoResponse>](../../models/operations/GetBuildInfoResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getBuilds

Returns an array of [builds](https://hathora.dev/docs/concepts/hathora-entities#build) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.GetBuildsRequest;
import dev.hathora.cloud_api.models.operations.GetBuildsResponse;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            GetBuildsResponse res = sdk.buildV1().getBuilds()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .call();

            if (res.classes().isPresent()) {
                // handle response
            }

        } catch (dev.hathora.cloud_api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional<? extends String>*             | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.GetBuildsResponse>](../../models/operations/GetBuildsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## runBuild

Builds a game server artifact from a tarball you provide. Pass in the `buildId` generated from [`CreateBuild()`](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild).

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.File;
import dev.hathora.cloud_api.models.operations.RunBuildRequest;
import dev.hathora.cloud_api.models.operations.RunBuildRequestBody;
import dev.hathora.cloud_api.models.operations.RunBuildResponse;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            RunBuildResponse res = sdk.buildV1().runBuild()
                .requestBody(RunBuildRequestBody.builder()
                    .file(File.builder()
                            .content("0xCb8B3aFD88".getBytes())
                            .fileName("string")
                            .build())
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .buildId(1)
                .call();

            if (res.res().isPresent()) {
                // handle response
            }

        } catch (dev.hathora.cloud_api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   | Example                                                                                                       |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                 | [dev.hathora.cloud_api.models.operations.RunBuildRequestBody](../../models/operations/RunBuildRequestBody.md) | :heavy_check_mark:                                                                                            | N/A                                                                                                           |                                                                                                               |
| `appId`                                                                                                       | *Optional<? extends String>*                                                                                  | :heavy_minus_sign:                                                                                            | N/A                                                                                                           | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                      |
| `buildId`                                                                                                     | *int*                                                                                                         | :heavy_check_mark:                                                                                            | N/A                                                                                                           | 1                                                                                                             |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.RunBuildResponse>](../../models/operations/RunBuildResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
