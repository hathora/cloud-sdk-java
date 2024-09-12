# DeploymentsV2
(*deploymentsV2()*)

## Overview

### Available Operations

* [createDeploymentV2Deprecated](#createdeploymentv2deprecated) - Create a new [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment). Creating a new deployment means all new rooms created will use the latest deployment configuration, but existing games in progress will not be affected.
* [getDeploymentInfoV2Deprecated](#getdeploymentinfov2deprecated) - Get details for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment).
* [getDeploymentsV2Deprecated](#getdeploymentsv2deprecated) - Returns an array of [deployments](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).
* [getLatestDeploymentV2Deprecated](#getlatestdeploymentv2deprecated) - Get the latest [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).

## createDeploymentV2Deprecated

Create a new [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment). Creating a new deployment means all new rooms created will use the latest deployment configuration, but existing games in progress will not be affected.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.SDKError;
import dev.hathora.cloud_sdk.models.operations.CreateDeploymentV2DeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.ContainerPort;
import dev.hathora.cloud_sdk.models.shared.DeploymentConfigV2;
import dev.hathora.cloud_sdk.models.shared.DeploymentConfigV2Env;
import dev.hathora.cloud_sdk.models.shared.Security;
import dev.hathora.cloud_sdk.models.shared.TransportType;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            CreateDeploymentV2DeprecatedResponse res = sdk.deploymentsV2().createDeploymentV2Deprecated()
                .deploymentConfigV2(DeploymentConfigV2.builder()
                    .containerPort(4000)
                    .env(List.of(
                        DeploymentConfigV2Env.builder()
                            .name("EULA")
                            .value("TRUE")
                            .build()))
                    .idleTimeoutEnabled(false)
                    .requestedCPU(0.5d)
                    .requestedMemoryMB(1024d)
                    .roomsPerProcess(3)
                    .transportType(TransportType.TLS)
                    .additionalContainerPorts(List.of(
                        ContainerPort.builder()
                            .name("default")
                            .port(8000)
                            .transportType(TransportType.TCP)
                            .build()))
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .buildId(1)
                .call();

            if (res.deploymentV2().isPresent()) {
                // handle response
            }
        } catch (dev.hathora.cloud_sdk.models.errors.ApiError e) {
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

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `deploymentConfigV2`                                            | [DeploymentConfigV2](../../models/shared/DeploymentConfigV2.md) | :heavy_check_mark:                                              | N/A                                                             |                                                                 |
| `appId`                                                         | *Optional<String>*                                              | :heavy_minus_sign:                                              | N/A                                                             | app-af469a92-5b45-4565-b3c4-b79878de67d2                        |
| `buildId`                                                       | *int*                                                           | :heavy_check_mark:                                              | N/A                                                             | 1                                                               |

### Response

**[CreateDeploymentV2DeprecatedResponse](../../models/operations/CreateDeploymentV2DeprecatedResponse.md)**

### Errors

| Error Object            | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 400,401,404,422,429,500 | application/json        |
| models/errors/SDKError  | 4xx-5xx                 | \*\/*                   |


## getDeploymentInfoV2Deprecated

Get details for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment).

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.SDKError;
import dev.hathora.cloud_sdk.models.operations.GetDeploymentInfoV2DeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
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

            GetDeploymentInfoV2DeprecatedResponse res = sdk.deploymentsV2().getDeploymentInfoV2Deprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .deploymentId(1)
                .call();

            if (res.deploymentV2().isPresent()) {
                // handle response
            }
        } catch (dev.hathora.cloud_sdk.models.errors.ApiError e) {
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
| `deploymentId`                           | *int*                                    | :heavy_check_mark:                       | N/A                                      | 1                                        |

### Response

**[GetDeploymentInfoV2DeprecatedResponse](../../models/operations/GetDeploymentInfoV2DeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getDeploymentsV2Deprecated

Returns an array of [deployments](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.SDKError;
import dev.hathora.cloud_sdk.models.operations.GetDeploymentsV2DeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
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

            GetDeploymentsV2DeprecatedResponse res = sdk.deploymentsV2().getDeploymentsV2Deprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .call();

            if (res.classes().isPresent()) {
                // handle response
            }
        } catch (dev.hathora.cloud_sdk.models.errors.ApiError e) {
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

**[GetDeploymentsV2DeprecatedResponse](../../models/operations/GetDeploymentsV2DeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getLatestDeploymentV2Deprecated

Get the latest [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.SDKError;
import dev.hathora.cloud_sdk.models.operations.GetLatestDeploymentV2DeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
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

            GetLatestDeploymentV2DeprecatedResponse res = sdk.deploymentsV2().getLatestDeploymentV2Deprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .call();

            if (res.deploymentV2().isPresent()) {
                // handle response
            }
        } catch (dev.hathora.cloud_sdk.models.errors.ApiError e) {
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

**[GetLatestDeploymentV2DeprecatedResponse](../../models/operations/GetLatestDeploymentV2DeprecatedResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,422,429        | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
