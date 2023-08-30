# deploymentV1

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

import dev.hathora.cloud_api.SDK;
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
            SDK sdk = SDK.builder()
                .build();

            CreateDeploymentRequest req = new CreateDeploymentRequest(                new DeploymentConfig(4000,                 new dev.hathora.cloud_api.models.shared.DeploymentConfigEnv[]{{
                                                add(new DeploymentConfigEnv("EULA", "TRUE") {{
                                                    name = "EULA";
                                                    value = "TRUE";
                                                }}),
                                                add(new DeploymentConfigEnv("EULA", "TRUE") {{
                                                    name = "EULA";
                                                    value = "TRUE";
                                                }}),
                                            }}, PlanName.TINY, 3, TransportType.UDP) {{
                                additionalContainerPorts = new dev.hathora.cloud_api.models.shared.ContainerPort[]{{
                                    add(new ContainerPort("default", 8000, TransportType.TLS) {{
                                        name = "default";
                                        port = 8000;
                                        transportType = TransportType.TLS;
                                    }}),
                                    add(new ContainerPort("default", 8000, TransportType.UDP) {{
                                        name = "default";
                                        port = 8000;
                                        transportType = TransportType.TCP;
                                    }}),
                                }};
                            }};, "app-af469a92-5b45-4565-b3c4-b79878de67d2", 1);            

            CreateDeploymentResponse res = sdk.deploymentV1.createDeployment(req, new CreateDeploymentSecurity("veritatis") {{
                auth0 = "";
            }});

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

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [dev.hathora.cloud_api.models.operations.CreateDeploymentRequest](../../models/operations/CreateDeploymentRequest.md)   | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |
| `security`                                                                                                              | [dev.hathora.cloud_api.models.operations.CreateDeploymentSecurity](../../models/operations/CreateDeploymentSecurity.md) | :heavy_check_mark:                                                                                                      | The security requirements to use for the request.                                                                       |


### Response

**[dev.hathora.cloud_api.models.operations.CreateDeploymentResponse](../../models/operations/CreateDeploymentResponse.md)**


## getDeploymentInfo

Get details for an existing [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) using `appId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.GetDeploymentInfoRequest;
import dev.hathora.cloud_api.models.operations.GetDeploymentInfoResponse;
import dev.hathora.cloud_api.models.operations.GetDeploymentInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetDeploymentInfoRequest req = new GetDeploymentInfoRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2", 1);            

            GetDeploymentInfoResponse res = sdk.deploymentV1.getDeploymentInfo(req, new GetDeploymentInfoSecurity("deserunt") {{
                auth0 = "";
            }});

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

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [dev.hathora.cloud_api.models.operations.GetDeploymentInfoRequest](../../models/operations/GetDeploymentInfoRequest.md)   | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |
| `security`                                                                                                                | [dev.hathora.cloud_api.models.operations.GetDeploymentInfoSecurity](../../models/operations/GetDeploymentInfoSecurity.md) | :heavy_check_mark:                                                                                                        | The security requirements to use for the request.                                                                         |


### Response

**[dev.hathora.cloud_api.models.operations.GetDeploymentInfoResponse](../../models/operations/GetDeploymentInfoResponse.md)**


## getDeployments

Returns an array of [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) objects for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.GetDeploymentsRequest;
import dev.hathora.cloud_api.models.operations.GetDeploymentsResponse;
import dev.hathora.cloud_api.models.operations.GetDeploymentsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetDeploymentsRequest req = new GetDeploymentsRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2");            

            GetDeploymentsResponse res = sdk.deploymentV1.getDeployments(req, new GetDeploymentsSecurity("perferendis") {{
                auth0 = "";
            }});

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

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [dev.hathora.cloud_api.models.operations.GetDeploymentsRequest](../../models/operations/GetDeploymentsRequest.md)   | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |
| `security`                                                                                                          | [dev.hathora.cloud_api.models.operations.GetDeploymentsSecurity](../../models/operations/GetDeploymentsSecurity.md) | :heavy_check_mark:                                                                                                  | The security requirements to use for the request.                                                                   |


### Response

**[dev.hathora.cloud_api.models.operations.GetDeploymentsResponse](../../models/operations/GetDeploymentsResponse.md)**

