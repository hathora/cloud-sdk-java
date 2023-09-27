# BuildV1
(*buildV1*)

## Overview

Operations that allow you create and manage your [build](https://hathora.dev/docs/concepts/hathora-entities#build).

### Available Operations

* [createBuild](#createbuild) - Generate a new `buildId` for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. You need `buildId` to run a [build](https://hathora.dev/docs/concepts/hathora-entities#build).
* [deleteBuild](#deletebuild) - Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build) for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId` and `buildId`.
* [getBuildInfo](#getbuildinfo) - Get details for an existing [build](https://hathora.dev/docs/concepts/hathora-entities#build) using `appId` and `buildId`.
* [getBuilds](#getbuilds) - Returns an array of [build](https://hathora.dev/docs/concepts/hathora-entities#build) objects for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.
* [runBuild](#runbuild) - Provide a tarball that will generate a container image for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Pass in `buildId` generated from Create Build.

## createBuild

Generate a new `buildId` for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. You need `buildId` to run a [build](https://hathora.dev/docs/concepts/hathora-entities#build).

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.CreateBuildRequest;
import dev.hathora.cloud_api.models.operations.CreateBuildResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("nisi") {{
                    auth0 = "";
                }})
                .build();

            CreateBuildResponse res = sdk.buildV1.createBuild("app-af469a92-5b45-4565-b3c4-b79878de67d2");

            if (res.build != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *String*                                 | :heavy_check_mark:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |


### Response

**[dev.hathora.cloud_api.models.operations.CreateBuildResponse](../../models/operations/CreateBuildResponse.md)**


## deleteBuild

Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build) for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId` and `buildId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.DeleteBuildRequest;
import dev.hathora.cloud_api.models.operations.DeleteBuildResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("recusandae") {{
                    auth0 = "";
                }})
                .build();

            DeleteBuildResponse res = sdk.buildV1.deleteBuild("app-af469a92-5b45-4565-b3c4-b79878de67d2", 1);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *String*                                 | :heavy_check_mark:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `buildId`                                | *Integer*                                | :heavy_check_mark:                       | N/A                                      | 1                                        |


### Response

**[dev.hathora.cloud_api.models.operations.DeleteBuildResponse](../../models/operations/DeleteBuildResponse.md)**


## getBuildInfo

Get details for an existing [build](https://hathora.dev/docs/concepts/hathora-entities#build) using `appId` and `buildId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.GetBuildInfoRequest;
import dev.hathora.cloud_api.models.operations.GetBuildInfoResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("temporibus") {{
                    auth0 = "";
                }})
                .build();

            GetBuildInfoResponse res = sdk.buildV1.getBuildInfo("app-af469a92-5b45-4565-b3c4-b79878de67d2", 1);

            if (res.build != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *String*                                 | :heavy_check_mark:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `buildId`                                | *Integer*                                | :heavy_check_mark:                       | N/A                                      | 1                                        |


### Response

**[dev.hathora.cloud_api.models.operations.GetBuildInfoResponse](../../models/operations/GetBuildInfoResponse.md)**


## getBuilds

Returns an array of [build](https://hathora.dev/docs/concepts/hathora-entities#build) objects for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.GetBuildsRequest;
import dev.hathora.cloud_api.models.operations.GetBuildsResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("ab") {{
                    auth0 = "";
                }})
                .build();

            GetBuildsResponse res = sdk.buildV1.getBuilds("app-af469a92-5b45-4565-b3c4-b79878de67d2");

            if (res.builds != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *String*                                 | :heavy_check_mark:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |


### Response

**[dev.hathora.cloud_api.models.operations.GetBuildsResponse](../../models/operations/GetBuildsResponse.md)**


## runBuild

Provide a tarball that will generate a container image for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Pass in `buildId` generated from Create Build.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.RunBuildRequest;
import dev.hathora.cloud_api.models.operations.RunBuildRequestBody;
import dev.hathora.cloud_api.models.operations.RunBuildRequestBodyFile;
import dev.hathora.cloud_api.models.operations.RunBuildResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("quis") {{
                    auth0 = "";
                }})
                .build();

            RunBuildResponse res = sdk.buildV1.runBuild(new RunBuildRequestBody(                new RunBuildRequestBodyFile("repellendus".getBytes(), "sapiente");) {{
                file = new RunBuildRequestBodyFile("perferendis".getBytes(), "ipsam") {{
                    content = "veritatis".getBytes();
                    file = "deserunt";
                }};
            }}, "app-af469a92-5b45-4565-b3c4-b79878de67d2", 1);

            if (res.runBuild200TextPlainByteString != null) {
                // handle response
            }
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
| `appId`                                                                                                       | *String*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                      |
| `buildId`                                                                                                     | *Integer*                                                                                                     | :heavy_check_mark:                                                                                            | N/A                                                                                                           | 1                                                                                                             |


### Response

**[dev.hathora.cloud_api.models.operations.RunBuildResponse](../../models/operations/RunBuildResponse.md)**

