# DeploymentsV3
(*deploymentsV3()*)

## Overview

Operations that allow you configure and manage an application's [build](https://hathora.dev/docs/concepts/hathora-entities#build) at runtime.

### Available Operations

* [createDeployment](#createdeployment) - Create a new [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment). Creating a new deployment means all new rooms created will use the latest deployment configuration, but existing games in progress will not be affected.
* [getDeployment](#getdeployment) - Get details for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment).
* [getDeployments](#getdeployments) - Returns an array of [deployments](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application), optionally filtered by deploymentTag.
* [getLatestDeployment](#getlatestdeployment) - Get the latest [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).

## createDeployment

Create a new [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment). Creating a new deployment means all new rooms created will use the latest deployment configuration, but existing games in progress will not be affected.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateDeploymentResponse;
import dev.hathora.cloud_sdk.models.shared.ContainerPort;
import dev.hathora.cloud_sdk.models.shared.DeploymentConfigV3;
import dev.hathora.cloud_sdk.models.shared.DeploymentConfigV3Env;
import dev.hathora.cloud_sdk.models.shared.Security;
import dev.hathora.cloud_sdk.models.shared.TransportType;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        CreateDeploymentResponse res = sdk.deploymentsV3().createDeployment()
                .deploymentConfigV3(DeploymentConfigV3.builder()
                    .buildId("bld-6d4c6a71-2d75-4b42-94e1-f312f57f33c5")
                    .containerPort(4000)
                    .env(List.of(
                        DeploymentConfigV3Env.builder()
                            .name("EULA")
                            .value("TRUE")
                            .build()))
                    .idleTimeoutEnabled(false)
                    .requestedCPU(0.5d)
                    .requestedMemoryMB(1024d)
                    .roomsPerProcess(3)
                    .transportType(TransportType.UDP)
                    .additionalContainerPorts(List.of(
                        ContainerPort.builder()
                            .name("default")
                            .port(8000)
                            .transportType(TransportType.TCP)
                            .build()))
                    .deploymentTag("alpha")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .call();

        if (res.deploymentV3().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `deploymentConfigV3`                                            | [DeploymentConfigV3](../../models/shared/DeploymentConfigV3.md) | :heavy_check_mark:                                              | N/A                                                             |                                                                 |
| `appId`                                                         | *Optional\<String>*                                             | :heavy_minus_sign:                                              | N/A                                                             | app-af469a92-5b45-4565-b3c4-b79878de67d2                        |

### Response

**[CreateDeploymentResponse](../../models/operations/CreateDeploymentResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ApiError       | 400, 401, 404, 422, 429, 500 | application/json             |
| models/errors/SDKError       | 4XX, 5XX                     | \*/\*                        |

## getDeployment

Get details for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment).

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetDeploymentResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        GetDeploymentResponse res = sdk.deploymentsV3().getDeployment()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .deploymentId("dep-6d4c6a71-2d75-4b42-94e1-f312f57f33c5")
                .call();

        if (res.deploymentV3().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `deploymentId`                           | *String*                                 | :heavy_check_mark:                       | N/A                                      | dep-6d4c6a71-2d75-4b42-94e1-f312f57f33c5 |

### Response

**[GetDeploymentResponse](../../models/operations/GetDeploymentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDeployments

Returns an array of [deployments](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application), optionally filtered by deploymentTag.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetDeploymentsResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        GetDeploymentsResponse res = sdk.deploymentsV3().getDeployments()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .deploymentTag("alpha")
                .call();

        if (res.deploymentsV3Page().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `deploymentTag`                          | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | alpha                                    |

### Response

**[GetDeploymentsResponse](../../models/operations/GetDeploymentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLatestDeployment

Get the latest [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetLatestDeploymentResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        GetLatestDeploymentResponse res = sdk.deploymentsV3().getLatestDeployment()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .call();

        if (res.deploymentV3().isPresent()) {
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

**[GetLatestDeploymentResponse](../../models/operations/GetLatestDeploymentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 422, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |