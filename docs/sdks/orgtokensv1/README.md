# OrgTokensV1
(*orgTokensV1()*)

### Available Operations

* [createOrgToken](#createorgtoken) - Create a new organization token.
* [getOrgTokens](#getorgtokens) - List all organization tokens for a given org.
* [revokeOrgToken](#revokeorgtoken) - Revoke an organization token.

## createOrgToken

Create a new organization token.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.CreateOrgTokenRequest;
import dev.hathora.cloud_api.models.operations.CreateOrgTokenResponse;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.CreateOrgToken;
import dev.hathora.cloud_api.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            CreateOrgTokenResponse res = sdk.orgTokensV1().createOrgToken()
                .createOrgToken(CreateOrgToken.builder()
                    .name("ci-token")
                    .build())
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

            if (res.createdOrgToken().isPresent()) {
                // handle response
            }
        } catch (dev.hathora.cloud_api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 | Example                                                                                     |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `createOrgToken`                                                                            | [dev.hathora.cloud_api.models.shared.CreateOrgToken](../../models/shared/CreateOrgToken.md) | :heavy_check_mark:                                                                          | N/A                                                                                         |                                                                                             |
| `orgId`                                                                                     | *String*                                                                                    | :heavy_check_mark:                                                                          | N/A                                                                                         | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39                                                    |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.CreateOrgTokenResponse>](../../models/operations/CreateOrgTokenResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getOrgTokens

List all organization tokens for a given org.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.GetOrgTokensRequest;
import dev.hathora.cloud_api.models.operations.GetOrgTokensResponse;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            GetOrgTokensResponse res = sdk.orgTokensV1().getOrgTokens()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

            if (res.listOrgTokens().isPresent()) {
                // handle response
            }
        } catch (dev.hathora.cloud_api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `orgId`                                  | *String*                                 | :heavy_check_mark:                       | N/A                                      | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39 |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.GetOrgTokensResponse>](../../models/operations/GetOrgTokensResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## revokeOrgToken

Revoke an organization token.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.RevokeOrgTokenRequest;
import dev.hathora.cloud_api.models.operations.RevokeOrgTokenResponse;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            RevokeOrgTokenResponse res = sdk.orgTokensV1().revokeOrgToken()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .orgTokenId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

            if (res.boolean_().isPresent()) {
                // handle response
            }
        } catch (dev.hathora.cloud_api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `orgId`                                  | *String*                                 | :heavy_check_mark:                       | N/A                                      | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39 |
| `orgTokenId`                             | *String*                                 | :heavy_check_mark:                       | N/A                                      | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39 |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.RevokeOrgTokenResponse>](../../models/operations/RevokeOrgTokenResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
