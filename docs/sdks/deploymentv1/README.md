# DeploymentV1

## Overview

Operations that allow you configure and manage an application's [build](https://hathora.dev/docs/concepts/hathora-entities#build) at runtime.

### Available Operations

* [createDeployment](#createdeployment) - Create a new [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) and [build](https://hathora.dev/docs/concepts/hathora-entities#build).
* [getDeploymentInfo](#getdeploymentinfo) - Get details for an existing [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) using `appId`.
* [getDeployments](#getdeployments) - Returns an array of [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) objects for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

## createDeployment

Create a new [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) and [build](https://hathora.dev/docs/concepts/hathora-entities#build).

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.CreateDeploymentRequest;
import dev.hathora.cloud_api.models.operations.CreateDeploymentResponse;
import dev.hathora.cloud_api.models.operations.CreateDeploymentSecurity;
import dev.hathora.cloud_api.models.shared.ContainerPort;
import dev.hathora.cloud_api.models.shared.DeploymentConfig;
import dev.hathora.cloud_api.models.shared.DeploymentConfigEnv;
import dev.hathora.cloud_api.models.shared.PlanName;
import dev.hathora.cloud_api.models.shared.TransportType;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .build();

            CreateDeploymentResponse res = sdk.deploymentV1.createDeployment(new CreateDeploymentSecurity("deserunt") {{
                auth0 = "";
            }}, new DeploymentConfig(4000,                 new dev.hathora.cloud_api.models.shared.DeploymentConfigEnv[]{{
                                add(new DeploymentConfigEnv("EULA", "TRUE") {{
                                    name = "EULA";
                                    value = "TRUE";
                                }}),
                            }}, PlanName.TINY, 3, TransportType.TLS) {{
                additionalContainerPorts = new dev.hathora.cloud_api.models.shared.ContainerPort[]{{
                    add(new ContainerPort("default", 8000, TransportType.UDP) {{
                        name = "default";
                        port = 8000;
                        transportType = TransportType.TCP;
                    }}),
                }};
                containerPort = 4000;
                env = new dev.hathora.cloud_api.models.shared.DeploymentConfigEnv[]{{
                    add(new DeploymentConfigEnv("EULA", "TRUE") {{
                        name = "EULA";
                        value = "TRUE";
                    }}),
                }};
                planName = PlanName.TINY;
                roomsPerProcess = 3;
                transportType = TransportType.TLS;
            }}, "app-af469a92-5b45-4565-b3c4-b79878de67d2", 1);

            if (res.deployment != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             | Example                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                              | [dev.hathora.cloud_api.models.operations.CreateDeploymentSecurity](../../models/operations/CreateDeploymentSecurity.md) | :heavy_check_mark:                                                                                                      | The security requirements to use for the request.                                                                       |                                                                                                                         |
| `deploymentConfig`                                                                                                      | [dev.hathora.cloud_api.models.shared.DeploymentConfig](../../models/shared/DeploymentConfig.md)                         | :heavy_check_mark:                                                                                                      | N/A                                                                                                                     |                                                                                                                         |
| `appId`                                                                                                                 | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | N/A                                                                                                                     | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                |
| `buildId`                                                                                                               | *Integer*                                                                                                               | :heavy_check_mark:                                                                                                      | N/A                                                                                                                     | 1                                                                                                                       |


### Response

**[dev.hathora.cloud_api.models.operations.CreateDeploymentResponse](../../models/operations/CreateDeploymentResponse.md)**


## getDeploymentInfo

Get details for an existing [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) using `appId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.GetDeploymentInfoRequest;
import dev.hathora.cloud_api.models.operations.GetDeploymentInfoResponse;
import dev.hathora.cloud_api.models.operations.GetDeploymentInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .build();

            GetDeploymentInfoResponse res = sdk.deploymentV1.getDeploymentInfo(new GetDeploymentInfoSecurity("quo") {{
                auth0 = "";
            }}, "app-af469a92-5b45-4565-b3c4-b79878de67d2", 1);

            if (res.deployment != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               | Example                                                                                                                   |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                | [dev.hathora.cloud_api.models.operations.GetDeploymentInfoSecurity](../../models/operations/GetDeploymentInfoSecurity.md) | :heavy_check_mark:                                                                                                        | The security requirements to use for the request.                                                                         |                                                                                                                           |
| `appId`                                                                                                                   | *String*                                                                                                                  | :heavy_check_mark:                                                                                                        | N/A                                                                                                                       | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                  |
| `deploymentId`                                                                                                            | *Integer*                                                                                                                 | :heavy_check_mark:                                                                                                        | N/A                                                                                                                       | 1                                                                                                                         |


### Response

**[dev.hathora.cloud_api.models.operations.GetDeploymentInfoResponse](../../models/operations/GetDeploymentInfoResponse.md)**


## getDeployments

Returns an array of [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) objects for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.GetDeploymentsRequest;
import dev.hathora.cloud_api.models.operations.GetDeploymentsResponse;
import dev.hathora.cloud_api.models.operations.GetDeploymentsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .build();

            GetDeploymentsResponse res = sdk.deploymentV1.getDeployments(new GetDeploymentsSecurity("odit") {{
                auth0 = "";
            }}, "app-af469a92-5b45-4565-b3c4-b79878de67d2");

            if (res.deployments != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         | Example                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                          | [dev.hathora.cloud_api.models.operations.GetDeploymentsSecurity](../../models/operations/GetDeploymentsSecurity.md) | :heavy_check_mark:                                                                                                  | The security requirements to use for the request.                                                                   |                                                                                                                     |
| `appId`                                                                                                             | *String*                                                                                                            | :heavy_check_mark:                                                                                                  | N/A                                                                                                                 | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                            |


### Response

**[dev.hathora.cloud_api.models.operations.GetDeploymentsResponse](../../models/operations/GetDeploymentsResponse.md)**

