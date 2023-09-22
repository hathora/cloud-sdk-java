# LogV1

## Overview

Operations to get logs by [applications](https://hathora.dev/docs/concepts/hathora-entities#application), [processes](https://hathora.dev/docs/concepts/hathora-entities#process), and [deployments](https://hathora.dev/docs/concepts/hathora-entities#deployment). We store 20GB of logs data.

### Available Operations

* [getLogsForApp](#getlogsforapp) - Returns a stream of logs for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.
* [getLogsForDeployment](#getlogsfordeployment) - Returns a stream of logs for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) using `appId` and `deploymentId`.
* [getLogsForProcess](#getlogsforprocess) - Returns a stream of logs for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.

## getLogsForApp

Returns a stream of logs for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.GetLogsForAppRequest;
import dev.hathora.cloud_api.models.operations.GetLogsForAppResponse;
import dev.hathora.cloud_api.models.shared.Region;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("excepturi") {{
                    auth0 = "";
                }})
                .build();

            GetLogsForAppRequest req = new GetLogsForAppRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2") {{
                follow = false;
                region = Region.WASHINGTON_DC;
                tailLines = 18789;
            }};            

            GetLogsForAppResponse res = sdk.logV1.getLogsForApp(req);

            if (res.getLogsForApp200TextPlainByteString != null) {
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
| `request`                                                                                                       | [dev.hathora.cloud_api.models.operations.GetLogsForAppRequest](../../models/operations/GetLogsForAppRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[dev.hathora.cloud_api.models.operations.GetLogsForAppResponse](../../models/operations/GetLogsForAppResponse.md)**


## getLogsForDeployment

Returns a stream of logs for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) using `appId` and `deploymentId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.GetLogsForDeploymentRequest;
import dev.hathora.cloud_api.models.operations.GetLogsForDeploymentResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("ad") {{
                    auth0 = "";
                }})
                .build();

            GetLogsForDeploymentRequest req = new GetLogsForDeploymentRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2", 1) {{
                follow = false;
                tailLines = 617636;
            }};            

            GetLogsForDeploymentResponse res = sdk.logV1.getLogsForDeployment(req);

            if (res.getLogsForDeployment200TextPlainByteString != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [dev.hathora.cloud_api.models.operations.GetLogsForDeploymentRequest](../../models/operations/GetLogsForDeploymentRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |


### Response

**[dev.hathora.cloud_api.models.operations.GetLogsForDeploymentResponse](../../models/operations/GetLogsForDeploymentResponse.md)**


## getLogsForProcess

Returns a stream of logs for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.GetLogsForProcessRequest;
import dev.hathora.cloud_api.models.operations.GetLogsForProcessResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("sed") {{
                    auth0 = "";
                }})
                .build();

            GetLogsForProcessRequest req = new GetLogsForProcessRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2", "cbfcddd2-0006-43ae-996c-995fff7bed2e") {{
                follow = false;
                tailLines = 612096;
            }};            

            GetLogsForProcessResponse res = sdk.logV1.getLogsForProcess(req);

            if (res.getLogsForProcess200TextPlainByteString != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [dev.hathora.cloud_api.models.operations.GetLogsForProcessRequest](../../models/operations/GetLogsForProcessRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[dev.hathora.cloud_api.models.operations.GetLogsForProcessResponse](../../models/operations/GetLogsForProcessResponse.md)**

