# DeploymentsV1
(*deploymentsV1()*)

## Overview

### Available Operations

* [~~createDeploymentV1Deprecated~~](#createdeploymentv1deprecated) - CreateDeploymentV1Deprecated :warning: **Deprecated**
* [~~getDeploymentInfoV1Deprecated~~](#getdeploymentinfov1deprecated) - GetDeploymentInfoV1Deprecated :warning: **Deprecated**
* [~~getDeploymentsV1Deprecated~~](#getdeploymentsv1deprecated) - GetDeploymentsV1Deprecated :warning: **Deprecated**
* [~~getLatestDeploymentV1Deprecated~~](#getlatestdeploymentv1deprecated) - GetLatestDeploymentV1Deprecated :warning: **Deprecated**

## ~~createDeploymentV1Deprecated~~

Create a new [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment). Creating a new deployment means all new rooms created will use the latest deployment configuration, but existing games in progress will not be affected.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateDeploymentV1DeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.*;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ApiError, ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        CreateDeploymentV1DeprecatedResponse res = sdk.deploymentsV1().createDeploymentV1Deprecated()
                .deploymentConfig(DeploymentConfig.builder()
                    .containerPort(4000)
                    .env(List.of(
                        Env.builder()
                            .name("EULA")
                            .value("TRUE")
                            .build(),
                        Env.builder()
                            .name("EULA")
                            .value("TRUE")
                            .build()))
                    .planName(PlanName.TINY)
                    .roomsPerProcess(3)
                    .transportType(TransportType.TLS)
                    .additionalContainerPorts(List.of(
                        ContainerPort.builder()
                            .name("default")
                            .port(8000)
                            .transportType(TransportType.TCP)
                            .build(),
                        ContainerPort.builder()
                            .name("default")
                            .port(8000)
                            .transportType(TransportType.TCP)
                            .build(),
                        ContainerPort.builder()
                            .name("default")
                            .port(8000)
                            .transportType(TransportType.TCP)
                            .build()))
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .buildId(1)
                .call();

        if (res.deploymentV1().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 | Example                                                     |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `deploymentConfig`                                          | [DeploymentConfig](../../models/shared/DeploymentConfig.md) | :heavy_check_mark:                                          | N/A                                                         |                                                             |
| `appId`                                                     | *Optional\<String>*                                         | :heavy_minus_sign:                                          | N/A                                                         | app-af469a92-5b45-4565-b3c4-b79878de67d2                    |
| `buildId`                                                   | *int*                                                       | :heavy_check_mark:                                          | N/A                                                         | 1                                                           |

### Response

**[CreateDeploymentV1DeprecatedResponse](../../models/operations/CreateDeploymentV1DeprecatedResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 400, 401, 404, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## ~~getDeploymentInfoV1Deprecated~~

Get details for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment).

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetDeploymentInfoV1DeprecatedResponse;
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

        GetDeploymentInfoV1DeprecatedResponse res = sdk.deploymentsV1().getDeploymentInfoV1Deprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .deploymentId(1)
                .call();

        if (res.deploymentV1().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `deploymentId`                           | *int*                                    | :heavy_check_mark:                       | N/A                                      | 1                                        |

### Response

**[GetDeploymentInfoV1DeprecatedResponse](../../models/operations/GetDeploymentInfoV1DeprecatedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~getDeploymentsV1Deprecated~~

Returns an array of [deployments](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetDeploymentsV1DeprecatedResponse;
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

        GetDeploymentsV1DeprecatedResponse res = sdk.deploymentsV1().getDeploymentsV1Deprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
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

**[GetDeploymentsV1DeprecatedResponse](../../models/operations/GetDeploymentsV1DeprecatedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~getLatestDeploymentV1Deprecated~~

Get the latest [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetLatestDeploymentV1DeprecatedResponse;
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

        GetLatestDeploymentV1DeprecatedResponse res = sdk.deploymentsV1().getLatestDeploymentV1Deprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .call();

        if (res.deploymentV1().isPresent()) {
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

**[GetLatestDeploymentV1DeprecatedResponse](../../models/operations/GetLatestDeploymentV1DeprecatedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 422, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |