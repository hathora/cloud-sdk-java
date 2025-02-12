# LobbiesV1
(*lobbiesV1()*)

## Overview

### Available Operations

* [~~createPrivateLobbyDeprecated~~](#createprivatelobbydeprecated) - CreatePrivateLobbyDeprecated :warning: **Deprecated**
* [~~createPublicLobbyDeprecated~~](#createpubliclobbydeprecated) - CreatePublicLobbyDeprecated :warning: **Deprecated**
* [~~listActivePublicLobbiesDeprecatedV1~~](#listactivepubliclobbiesdeprecatedv1) - ListActivePublicLobbiesDeprecatedV1 :warning: **Deprecated**

## ~~createPrivateLobbyDeprecated~~

CreatePrivateLobbyDeprecated

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreatePrivateLobbyDeprecatedResponse;
import dev.hathora.cloud_sdk.models.operations.CreatePrivateLobbyDeprecatedSecurity;
import dev.hathora.cloud_sdk.models.shared.Region;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        CreatePrivateLobbyDeprecatedResponse res = sdk.lobbiesV1().createPrivateLobbyDeprecated()
                .security(CreatePrivateLobbyDeprecatedSecurity.builder()
                    .playerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .local(false)
                .region(Region.FRANKFURT)
                .call();

        if (res.roomId().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                       | Type                                                                                                                                            | Required                                                                                                                                        | Description                                                                                                                                     | Example                                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                      | [dev.hathora.cloud_sdk.models.operations.CreatePrivateLobbyDeprecatedSecurity](../../models/operations/CreatePrivateLobbyDeprecatedSecurity.md) | :heavy_check_mark:                                                                                                                              | The security requirements to use for the request.                                                                                               |                                                                                                                                                 |
| `appId`                                                                                                                                         | *Optional\<String>*                                                                                                                             | :heavy_minus_sign:                                                                                                                              | N/A                                                                                                                                             | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                                        |
| `local`                                                                                                                                         | *Optional\<Boolean>*                                                                                                                            | :heavy_minus_sign:                                                                                                                              | N/A                                                                                                                                             |                                                                                                                                                 |
| `region`                                                                                                                                        | [Optional\<Region>](../../models/shared/Region.md)                                                                                              | :heavy_minus_sign:                                                                                                                              | N/A                                                                                                                                             |                                                                                                                                                 |

### Response

**[CreatePrivateLobbyDeprecatedResponse](../../models/operations/CreatePrivateLobbyDeprecatedResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ApiError       | 400, 401, 402, 404, 422, 429 | application/json             |
| models/errors/ApiError       | 500                          | application/json             |
| models/errors/SDKError       | 4XX, 5XX                     | \*/\*                        |

## ~~createPublicLobbyDeprecated~~

CreatePublicLobbyDeprecated

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreatePublicLobbyDeprecatedResponse;
import dev.hathora.cloud_sdk.models.operations.CreatePublicLobbyDeprecatedSecurity;
import dev.hathora.cloud_sdk.models.shared.Region;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        CreatePublicLobbyDeprecatedResponse res = sdk.lobbiesV1().createPublicLobbyDeprecated()
                .security(CreatePublicLobbyDeprecatedSecurity.builder()
                    .playerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .local(false)
                .region(Region.MUMBAI)
                .call();

        if (res.roomId().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                     | Type                                                                                                                                          | Required                                                                                                                                      | Description                                                                                                                                   | Example                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                    | [dev.hathora.cloud_sdk.models.operations.CreatePublicLobbyDeprecatedSecurity](../../models/operations/CreatePublicLobbyDeprecatedSecurity.md) | :heavy_check_mark:                                                                                                                            | The security requirements to use for the request.                                                                                             |                                                                                                                                               |
| `appId`                                                                                                                                       | *Optional\<String>*                                                                                                                           | :heavy_minus_sign:                                                                                                                            | N/A                                                                                                                                           | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                                      |
| `local`                                                                                                                                       | *Optional\<Boolean>*                                                                                                                          | :heavy_minus_sign:                                                                                                                            | N/A                                                                                                                                           |                                                                                                                                               |
| `region`                                                                                                                                      | [Optional\<Region>](../../models/shared/Region.md)                                                                                            | :heavy_minus_sign:                                                                                                                            | N/A                                                                                                                                           |                                                                                                                                               |

### Response

**[CreatePublicLobbyDeprecatedResponse](../../models/operations/CreatePublicLobbyDeprecatedResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ApiError       | 400, 401, 402, 404, 422, 429 | application/json             |
| models/errors/ApiError       | 500                          | application/json             |
| models/errors/SDKError       | 4XX, 5XX                     | \*/\*                        |

## ~~listActivePublicLobbiesDeprecatedV1~~

ListActivePublicLobbiesDeprecatedV1

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.ListActivePublicLobbiesDeprecatedV1Response;
import dev.hathora.cloud_sdk.models.shared.Region;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        ListActivePublicLobbiesDeprecatedV1Response res = sdk.lobbiesV1().listActivePublicLobbiesDeprecatedV1()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .local(false)
                .region(Region.DALLAS)
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
| `appId`                                            | *Optional\<String>*                                | :heavy_minus_sign:                                 | N/A                                                | app-af469a92-5b45-4565-b3c4-b79878de67d2           |
| `local`                                            | *Optional\<Boolean>*                               | :heavy_minus_sign:                                 | N/A                                                |                                                    |
| `region`                                           | [Optional\<Region>](../../models/shared/Region.md) | :heavy_minus_sign:                                 | N/A                                                |                                                    |

### Response

**[ListActivePublicLobbiesDeprecatedV1Response](../../models/operations/ListActivePublicLobbiesDeprecatedV1Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 404, 422, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |