# OrganizationsV1
(*organizationsV1()*)

## Overview

### Available Operations

* [acceptInvite](#acceptinvite) - AcceptInvite
* [getOrgMembers](#getorgmembers) - GetOrgMembers
* [getOrgPendingInvites](#getorgpendinginvites) - GetOrgPendingInvites
* [getOrgs](#getorgs) - GetOrgs
* [getUserPendingInvites](#getuserpendinginvites) - GetUserPendingInvites
* [inviteUser](#inviteuser) - InviteUser
* [rejectInvite](#rejectinvite) - RejectInvite
* [rescindInvite](#rescindinvite) - RescindInvite

## acceptInvite

AcceptInvite

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.AcceptInviteResponse;
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

        AcceptInviteResponse res = sdk.organizationsV1().acceptInvite()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `orgId`                                  | *String*                                 | :heavy_check_mark:                       | N/A                                      | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39 |

### Response

**[AcceptInviteResponse](../../models/operations/AcceptInviteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getOrgMembers

GetOrgMembers

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetOrgMembersResponse;
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

        GetOrgMembersResponse res = sdk.organizationsV1().getOrgMembers()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

        if (res.orgMembersPage().isPresent()) {
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

**[GetOrgMembersResponse](../../models/operations/GetOrgMembersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 429               | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getOrgPendingInvites

GetOrgPendingInvites

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetOrgPendingInvitesResponse;
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

        GetOrgPendingInvitesResponse res = sdk.organizationsV1().getOrgPendingInvites()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

        if (res.pendingOrgInvitesPage().isPresent()) {
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

**[GetOrgPendingInvitesResponse](../../models/operations/GetOrgPendingInvitesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 429               | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getOrgs

Returns an unsorted list of all organizations that you are a member of (an accepted membership invite). An organization is uniquely identified by an `orgId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetOrgsResponse;
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

        GetOrgsResponse res = sdk.organizationsV1().getOrgs()
                .call();

        if (res.orgsPage().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetOrgsResponse](../../models/operations/GetOrgsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUserPendingInvites

GetUserPendingInvites

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetUserPendingInvitesResponse;
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

        GetUserPendingInvitesResponse res = sdk.organizationsV1().getUserPendingInvites()
                .call();

        if (res.pendingOrgInvitesPage().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetUserPendingInvitesResponse](../../models/operations/GetUserPendingInvitesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 429               | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## inviteUser

InviteUser

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.InviteUserResponse;
import dev.hathora.cloud_sdk.models.shared.CreateUserInvite;
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

        InviteUserResponse res = sdk.organizationsV1().inviteUser()
                .createUserInvite(CreateUserInvite.builder()
                    .userEmail("noreply@hathora.dev")
                    .build())
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

        if (res.pendingOrgInvite().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 | Example                                                     |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `createUserInvite`                                          | [CreateUserInvite](../../models/shared/CreateUserInvite.md) | :heavy_check_mark:                                          | N/A                                                         |                                                             |
| `orgId`                                                     | *String*                                                    | :heavy_check_mark:                                          | N/A                                                         | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39                    |

### Response

**[InviteUserResponse](../../models/operations/InviteUserResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 422, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## rejectInvite

RejectInvite

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.RejectInviteResponse;
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

        RejectInviteResponse res = sdk.organizationsV1().rejectInvite()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `orgId`                                  | *String*                                 | :heavy_check_mark:                       | N/A                                      | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39 |

### Response

**[RejectInviteResponse](../../models/operations/RejectInviteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## rescindInvite

RescindInvite

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.RescindInviteResponse;
import dev.hathora.cloud_sdk.models.shared.RescindUserInvite;
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

        RescindInviteResponse res = sdk.organizationsV1().rescindInvite()
                .rescindUserInvite(RescindUserInvite.builder()
                    .userEmail("noreply@hathora.dev")
                    .build())
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `rescindUserInvite`                                           | [RescindUserInvite](../../models/shared/RescindUserInvite.md) | :heavy_check_mark:                                            | N/A                                                           |                                                               |
| `orgId`                                                       | *String*                                                      | :heavy_check_mark:                                            | N/A                                                           | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39                      |

### Response

**[RescindInviteResponse](../../models/operations/RescindInviteResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 422, 429, 500 | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |