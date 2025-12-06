# OrganizationsV1

## Overview

### Available Operations

* [acceptInvite](#acceptinvite) - AcceptInvite
* [getOrgMembers](#getorgmembers) - GetOrgMembers
* [getOrgPendingInvites](#getorgpendinginvites) - GetOrgPendingInvites
* [getOrgs](#getorgs) - GetOrgs
* [getUsageLimits](#getusagelimits) - GetUsageLimits
* [getUserPendingInvites](#getuserpendinginvites) - GetUserPendingInvites
* [inviteUser](#inviteuser) - InviteUser
* [rejectInvite](#rejectinvite) - RejectInvite
* [rescindInvite](#rescindinvite) - RescindInvite
* [updateUserInvite](#updateuserinvite) - UpdateUserInvite

## acceptInvite

AcceptInvite

### Example Usage

<!-- UsageSnippet language="java" operationID="AcceptInvite" method="post" path="/orgs/v1/{orgId}/invites/accept" -->
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
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
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
| models/errors/ApiError | 401, 404, 408, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getOrgMembers

GetOrgMembers

### Example Usage

<!-- UsageSnippet language="java" operationID="GetOrgMembers" method="get" path="/orgs/v1/{orgId}/members" -->
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
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
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
| models/errors/ApiError | 401, 408, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getOrgPendingInvites

GetOrgPendingInvites

### Example Usage

<!-- UsageSnippet language="java" operationID="GetOrgPendingInvites" method="get" path="/orgs/v1/{orgId}/invites/pending" -->
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
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
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
| models/errors/ApiError | 401, 408, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getOrgs

Returns an unsorted list of all organizations that you are a member of (an accepted membership invite). An organization is uniquely identified by an `orgId`.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetOrgs" method="get" path="/orgs/v1" -->
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
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
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
| models/errors/ApiError | 401, 404, 408, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUsageLimits

GetUsageLimits

### Example Usage

<!-- UsageSnippet language="java" operationID="GetUsageLimits" method="get" path="/orgs/v1/metadata/usageLimits" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetUsageLimitsResponse;
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

        GetUsageLimitsResponse res = sdk.organizationsV1().getUsageLimits()
                .call();

        if (res.usageLimits().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `orgId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39 |

### Response

**[GetUsageLimitsResponse](../../models/operations/GetUsageLimitsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 408, 429     | application/json       |
| models/errors/ApiError | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUserPendingInvites

GetUserPendingInvites

### Example Usage

<!-- UsageSnippet language="java" operationID="GetUserPendingInvites" method="get" path="/orgs/v1/user/invites/pending" -->
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
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
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
| models/errors/ApiError | 401, 408, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## inviteUser

InviteUser

### Example Usage

<!-- UsageSnippet language="java" operationID="InviteUser" method="put" path="/orgs/v1/{orgId}/invites" -->
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
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
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
| models/errors/ApiError | 401, 408, 422, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## rejectInvite

RejectInvite

### Example Usage

<!-- UsageSnippet language="java" operationID="RejectInvite" method="post" path="/orgs/v1/{orgId}/invites/reject" -->
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
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
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
| models/errors/ApiError | 401, 404, 408, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## rescindInvite

RescindInvite

### Example Usage

<!-- UsageSnippet language="java" operationID="RescindInvite" method="post" path="/orgs/v1/{orgId}/invites/rescind" -->
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
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
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
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/ApiError  | 500                     | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## updateUserInvite

UpdateUserInvite

### Example Usage

<!-- UsageSnippet language="java" operationID="UpdateUserInvite" method="post" path="/orgs/v1/{orgId}/invites" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.UpdateUserInviteResponse;
import dev.hathora.cloud_sdk.models.shared.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        UpdateUserInviteResponse res = sdk.organizationsV1().updateUserInvite()
                .updateUserInvite(UpdateUserInvite.builder()
                    .scopes(UpdateUserInviteScopes.of(UserRole.VIEWER))
                    .userEmail("noreply@hathora.dev")
                    .build())
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

        if (res.boolean_().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 | Example                                                     |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `updateUserInvite`                                          | [UpdateUserInvite](../../models/shared/UpdateUserInvite.md) | :heavy_check_mark:                                          | N/A                                                         |                                                             |
| `orgId`                                                     | *String*                                                    | :heavy_check_mark:                                          | N/A                                                         | org-6f706e83-0ec1-437a-9a46-7d4281eb2f39                    |

### Response

**[UpdateUserInviteResponse](../../models/operations/UpdateUserInviteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 408, 422, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |