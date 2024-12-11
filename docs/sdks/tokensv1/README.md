# TokensV1
(*tokensV1()*)

## Overview

 

### Available Operations

* [createOrgToken](#createorgtoken) - CreateOrgToken
* [getOrgTokens](#getorgtokens) - GetOrgTokens
* [revokeOrgToken](#revokeorgtoken) - RevokeOrgToken

## createOrgToken

Create a new organization token.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateOrgTokenResponse;
import dev.hathora.cloud_sdk.models.shared.CreateOrgToken;
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

        CreateOrgTokenResponse res = sdk.tokensV1().createOrgToken()
                .createOrgToken(CreateOrgToken.builder()
                    .name("ci-token")
                    .build())
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

        if (res.createdOrgToken().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `createOrgToken`                                        | [CreateOrgToken](../../models/shared/CreateOrgToken.md) | :heavy_check_mark:                                      | N/A                                                     |                                                         |
| `orgId`                                                 | *String*                                                | :heavy_check_mark:                                      | N/A                                                     | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39                |

### Response

**[CreateOrgTokenResponse](../../models/operations/CreateOrgTokenResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 422, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getOrgTokens

List all organization tokens for a given org.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetOrgTokensResponse;
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

        GetOrgTokensResponse res = sdk.tokensV1().getOrgTokens()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

        if (res.listOrgTokens().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `orgId`                                  | *String*                                 | :heavy_check_mark:                       | N/A                                      | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39 |

### Response

**[GetOrgTokensResponse](../../models/operations/GetOrgTokensResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## revokeOrgToken

Revoke an organization token.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.RevokeOrgTokenResponse;
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

        RevokeOrgTokenResponse res = sdk.tokensV1().revokeOrgToken()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .orgTokenId("org-token-af469a92-5b45-4565-b3c4-b79878de67d2")
                .call();

        if (res.boolean_().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                      | Type                                           | Required                                       | Description                                    | Example                                        |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `orgId`                                        | *String*                                       | :heavy_check_mark:                             | N/A                                            | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39       |
| `orgTokenId`                                   | *String*                                       | :heavy_check_mark:                             | N/A                                            | org-token-af469a92-5b45-4565-b3c4-b79878de67d2 |

### Response

**[RevokeOrgTokenResponse](../../models/operations/RevokeOrgTokenResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |