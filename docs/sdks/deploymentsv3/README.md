# DeploymentsV3
(*deploymentsV3()*)

## Overview

Operations that allow you configure and manage an application's [build](https://hathora.dev/docs/concepts/hathora-entities#build) at runtime.

### Available Operations

* [createDeployment](#createdeployment) - CreateDeployment
* [getDeployment](#getdeployment) - GetDeployment
* [getDeployments](#getdeployments) - GetDeployments
* [getLatestDeployment](#getlatestdeployment) - GetLatestDeployment

## createDeployment

Create a new [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment). Creating a new deployment means all new rooms created will use the latest deployment configuration, but existing games in progress will not be affected.

### Example Usage

<!-- UsageSnippet language="java" operationID="CreateDeployment" method="post" path="/deployments/v3/apps/{appId}/deployments" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateDeploymentResponse;
import dev.hathora.cloud_sdk.models.shared.*;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        CreateDeploymentResponse res = sdk.deploymentsV3().createDeployment()
                .deploymentConfigV3(DeploymentConfigV3.builder()
                    .buildId("bld-6d4c6a71-2d75-4b42-94e1-f312f57f33c5")
                    .containerPort(4000)
                    .env(List.of(
                        DeploymentConfigV3Env.builder()
                            .name("EULA")
                            .value("TRUE")
                            .build(),
                        DeploymentConfigV3Env.builder()
                            .name("EULA")
                            .value("TRUE")
                            .build()))
                    .idleTimeoutEnabled(true)
                    .requestedCPU(0.5)
                    .requestedMemoryMB(1024d)
                    .roomsPerProcess(3)
                    .transportType(TransportType.UDP)
                    .additionalContainerPorts(List.of(
                        ContainerPort.builder()
                            .name("default")
                            .port(8000)
                            .transportType(TransportType.UDP)
                            .build(),
                        ContainerPort.builder()
                            .name("default")
                            .port(8000)
                            .transportType(TransportType.UDP)
                            .build()))
                    .deploymentTag("alpha")
                    .experimentalRequestedGPU(1d)
                    .requestedGPU(1d)
                    .build())
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
| models/errors/ApiError       | 400, 401, 404, 408, 422, 429 | application/json             |
| models/errors/ApiError       | 500                          | application/json             |
| models/errors/SDKError       | 4XX, 5XX                     | \*/\*                        |

## getDeployment

Get details for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment).

### Example Usage

<!-- UsageSnippet language="java" operationID="GetDeployment" method="get" path="/deployments/v3/apps/{appId}/deployments/{deploymentId}" -->
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
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        GetDeploymentResponse res = sdk.deploymentsV3().getDeployment()
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
| models/errors/ApiError | 401, 404, 408, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDeployments

Returns an array of [deployments](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application), optionally filtered by deploymentTag or buildTag.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetDeployments" method="get" path="/deployments/v3/apps/{appId}/deployments" -->
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
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        GetDeploymentsResponse res = sdk.deploymentsV3().getDeployments()
                .buildTag("0.1.14-14c793")
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
| `buildTag`                               | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | 0.1.14-14c793                            |
| `deploymentTag`                          | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | alpha                                    |

### Response

**[GetDeploymentsResponse](../../models/operations/GetDeploymentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 408, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLatestDeployment

Get the latest [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).

### Example Usage

<!-- UsageSnippet language="java" operationID="GetLatestDeployment" method="get" path="/deployments/v3/apps/{appId}/deployments/latest" -->
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
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        GetLatestDeploymentResponse res = sdk.deploymentsV3().getLatestDeployment()
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

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |