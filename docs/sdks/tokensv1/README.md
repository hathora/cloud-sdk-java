# TokensV1
(*tokensV1()*)

## Overview

 

### Available Operations

* [createOrgToken](#createorgtoken) - Create a new organization token.
* [getOrgTokens](#getorgtokens) - List all organization tokens for a given org.
* [revokeOrgToken](#revokeorgtoken) - Revoke an organization token.

## createOrgToken

Create a new organization token.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_sdk.HathoraCloud;
import com.hathora.cloud_sdk.models.operations.*;
import com.hathora.cloud_sdk.models.shared.*;
import com.hathora.cloud_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
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
        } catch (com.hathora.cloud_sdk.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_sdk.models.errors.SDKError e) {
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

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 | Example                                                                                     |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `createOrgToken`                                                                            | [com.hathora.cloud_sdk.models.shared.CreateOrgToken](../../models/shared/CreateOrgToken.md) | :heavy_check_mark:                                                                          | N/A                                                                                         |                                                                                             |
| `orgId`                                                                                     | *String*                                                                                    | :heavy_check_mark:                                                                          | N/A                                                                                         | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39                                                    |


### Response

**[com.hathora.cloud_sdk.models.operations.CreateOrgTokenResponse](../../models/operations/CreateOrgTokenResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,422,429        | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## getOrgTokens

List all organization tokens for a given org.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_sdk.HathoraCloud;
import com.hathora.cloud_sdk.models.operations.*;
import com.hathora.cloud_sdk.models.shared.*;
import com.hathora.cloud_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            GetOrgTokensResponse res = sdk.tokensV1().getOrgTokens()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

            if (res.listOrgTokens().isPresent()) {
                // handle response
            }
        } catch (com.hathora.cloud_sdk.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_sdk.models.errors.SDKError e) {
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
| `orgId`                                  | *String*                                 | :heavy_check_mark:                       | N/A                                      | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39 |


### Response

**[com.hathora.cloud_sdk.models.operations.GetOrgTokensResponse](../../models/operations/GetOrgTokensResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## revokeOrgToken

Revoke an organization token.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_sdk.HathoraCloud;
import com.hathora.cloud_sdk.models.operations.*;
import com.hathora.cloud_sdk.models.shared.*;
import com.hathora.cloud_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            RevokeOrgTokenResponse res = sdk.tokensV1().revokeOrgToken()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .orgTokenId("org-token-af469a92-5b45-4565-b3c4-b79878de67d2")
                .call();

            if (res.boolean_().isPresent()) {
                // handle response
            }
        } catch (com.hathora.cloud_sdk.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_sdk.models.errors.SDKError e) {
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

| Parameter                                      | Type                                           | Required                                       | Description                                    | Example                                        |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `orgId`                                        | *String*                                       | :heavy_check_mark:                             | N/A                                            | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39       |
| `orgTokenId`                                   | *String*                                       | :heavy_check_mark:                             | N/A                                            | org-token-af469a92-5b45-4565-b3c4-b79878de67d2 |


### Response

**[com.hathora.cloud_sdk.models.operations.RevokeOrgTokenResponse](../../models/operations/RevokeOrgTokenResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
