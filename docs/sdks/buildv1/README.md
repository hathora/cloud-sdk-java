# buildV1

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

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.CreateBuildRequest;
import dev.hathora.cloud_api.models.operations.CreateBuildResponse;
import dev.hathora.cloud_api.models.operations.CreateBuildSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            CreateBuildRequest req = new CreateBuildRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2");            

            CreateBuildResponse res = sdk.buildV1.createBuild(req, new CreateBuildSecurity("delectus") {{
                auth0 = "";
            }});

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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [dev.hathora.cloud_api.models.operations.CreateBuildRequest](../../models/operations/CreateBuildRequest.md)   | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |
| `security`                                                                                                    | [dev.hathora.cloud_api.models.operations.CreateBuildSecurity](../../models/operations/CreateBuildSecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |


### Response

**[dev.hathora.cloud_api.models.operations.CreateBuildResponse](../../models/operations/CreateBuildResponse.md)**


## deleteBuild

Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build) for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId` and `buildId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.DeleteBuildRequest;
import dev.hathora.cloud_api.models.operations.DeleteBuildResponse;
import dev.hathora.cloud_api.models.operations.DeleteBuildSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            DeleteBuildRequest req = new DeleteBuildRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2", 1);            

            DeleteBuildResponse res = sdk.buildV1.deleteBuild(req, new DeleteBuildSecurity("tempora") {{
                auth0 = "";
            }});

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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [dev.hathora.cloud_api.models.operations.DeleteBuildRequest](../../models/operations/DeleteBuildRequest.md)   | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |
| `security`                                                                                                    | [dev.hathora.cloud_api.models.operations.DeleteBuildSecurity](../../models/operations/DeleteBuildSecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |


### Response

**[dev.hathora.cloud_api.models.operations.DeleteBuildResponse](../../models/operations/DeleteBuildResponse.md)**


## getBuildInfo

Get details for an existing [build](https://hathora.dev/docs/concepts/hathora-entities#build) using `appId` and `buildId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.GetBuildInfoRequest;
import dev.hathora.cloud_api.models.operations.GetBuildInfoResponse;
import dev.hathora.cloud_api.models.operations.GetBuildInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetBuildInfoRequest req = new GetBuildInfoRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2", 1);            

            GetBuildInfoResponse res = sdk.buildV1.getBuildInfo(req, new GetBuildInfoSecurity("suscipit") {{
                auth0 = "";
            }});

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

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [dev.hathora.cloud_api.models.operations.GetBuildInfoRequest](../../models/operations/GetBuildInfoRequest.md)   | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |
| `security`                                                                                                      | [dev.hathora.cloud_api.models.operations.GetBuildInfoSecurity](../../models/operations/GetBuildInfoSecurity.md) | :heavy_check_mark:                                                                                              | The security requirements to use for the request.                                                               |


### Response

**[dev.hathora.cloud_api.models.operations.GetBuildInfoResponse](../../models/operations/GetBuildInfoResponse.md)**


## getBuilds

Returns an array of [build](https://hathora.dev/docs/concepts/hathora-entities#build) objects for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.GetBuildsRequest;
import dev.hathora.cloud_api.models.operations.GetBuildsResponse;
import dev.hathora.cloud_api.models.operations.GetBuildsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetBuildsRequest req = new GetBuildsRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2");            

            GetBuildsResponse res = sdk.buildV1.getBuilds(req, new GetBuildsSecurity("molestiae") {{
                auth0 = "";
            }});

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

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [dev.hathora.cloud_api.models.operations.GetBuildsRequest](../../models/operations/GetBuildsRequest.md)   | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |
| `security`                                                                                                | [dev.hathora.cloud_api.models.operations.GetBuildsSecurity](../../models/operations/GetBuildsSecurity.md) | :heavy_check_mark:                                                                                        | The security requirements to use for the request.                                                         |


### Response

**[dev.hathora.cloud_api.models.operations.GetBuildsResponse](../../models/operations/GetBuildsResponse.md)**


## runBuild

Provide a tarball that will generate a container image for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Pass in `buildId` generated from Create Build.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.RunBuildRequest;
import dev.hathora.cloud_api.models.operations.RunBuildRequestBody;
import dev.hathora.cloud_api.models.operations.RunBuildRequestBodyFile;
import dev.hathora.cloud_api.models.operations.RunBuildResponse;
import dev.hathora.cloud_api.models.operations.RunBuildSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            RunBuildRequest req = new RunBuildRequest(                new RunBuildRequestBody(                new RunBuildRequestBodyFile("minus".getBytes(), "placeat"););, "app-af469a92-5b45-4565-b3c4-b79878de67d2", 1);            

            RunBuildResponse res = sdk.buildV1.runBuild(req, new RunBuildSecurity("voluptatum") {{
                auth0 = "";
            }});

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

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [dev.hathora.cloud_api.models.operations.RunBuildRequest](../../models/operations/RunBuildRequest.md)   | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |
| `security`                                                                                              | [dev.hathora.cloud_api.models.operations.RunBuildSecurity](../../models/operations/RunBuildSecurity.md) | :heavy_check_mark:                                                                                      | The security requirements to use for the request.                                                       |


### Response

**[dev.hathora.cloud_api.models.operations.RunBuildResponse](../../models/operations/RunBuildResponse.md)**

