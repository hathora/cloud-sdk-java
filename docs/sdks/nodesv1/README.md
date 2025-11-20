# NodesV1
(*nodesV1()*)

## Overview

### Available Operations

* [getNode](#getnode) - GetNode
* [listProvisionedNodes](#listprovisionednodes) - ListProvisionedNodes

## getNode

Returns information about the node identified by `appId`.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetNode" method="get" path="/nodes/v1/{nodeId}" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetNodeResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        GetNodeResponse res = sdk.nodesV1().getNode()
                .nodeId("<id>")
                .call();

        if (res.nodeV1().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `nodeId`           | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetNodeResponse](../../models/operations/GetNodeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 408, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listProvisionedNodes

List nodes that are running or draining. Filter the array by optionally passing in a `region`.

### Example Usage

<!-- UsageSnippet language="java" operationID="ListProvisionedNodes" method="get" path="/nodes/v1/fleet/{fleetId}/listProvisioned" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.ListProvisionedNodesResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        ListProvisionedNodesResponse res = sdk.nodesV1().listProvisionedNodes()
                .fleetId("<id>")
                .call();

        if (res.classes().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                          | Type                                               | Required                                           | Description                                        | Example                                            |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `fleetId`                                          | *String*                                           | :heavy_check_mark:                                 | N/A                                                |                                                    |
| `orgId`                                            | *Optional\<String>*                                | :heavy_minus_sign:                                 | N/A                                                | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39           |
| `region`                                           | [Optional\<Region>](../../models/shared/Region.md) | :heavy_minus_sign:                                 | N/A                                                |                                                    |

### Response

**[ListProvisionedNodesResponse](../../models/operations/ListProvisionedNodesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 408, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |