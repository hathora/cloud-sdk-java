# LobbiesV2
(*lobbiesV2()*)

## Overview

### Available Operations

* [~~createLobbyDeprecated~~](#createlobbydeprecated) - CreateLobbyDeprecated :warning: **Deprecated**
* [~~createLocalLobby~~](#createlocallobby) - CreateLocalLobby :warning: **Deprecated**
* [~~createPrivateLobby~~](#createprivatelobby) - CreatePrivateLobby :warning: **Deprecated**
* [~~createPublicLobby~~](#createpubliclobby) - CreatePublicLobby :warning: **Deprecated**
* [~~getLobbyInfo~~](#getlobbyinfo) - GetLobbyInfo :warning: **Deprecated**
* [~~listActivePublicLobbiesDeprecatedV2~~](#listactivepubliclobbiesdeprecatedv2) - ListActivePublicLobbiesDeprecatedV2 :warning: **Deprecated**
* [~~setLobbyState~~](#setlobbystate) - SetLobbyState :warning: **Deprecated**

## ~~createLobbyDeprecated~~

Create a new lobby for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). A lobby object is a wrapper around a [room](https://hathora.dev/docs/concepts/hathora-entities#room) object. With a lobby, you get additional functionality like configuring the visibility of the room, managing the state of a match, and retrieving a list of public lobbies to display to players.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateLobbyDeprecatedResponse;
import dev.hathora.cloud_sdk.models.operations.CreateLobbyDeprecatedSecurity;
import dev.hathora.cloud_sdk.models.shared.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        CreateLobbyDeprecatedResponse res = sdk.lobbiesV2().createLobbyDeprecated()
                .security(CreateLobbyDeprecatedSecurity.builder()
                    .playerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .createLobbyParams(CreateLobbyParams.builder()
                    .initialConfig("<value>")
                    .region(Region.SAO_PAULO)
                    .visibility(LobbyVisibility.PRIVATE)
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

        if (res.lobby().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       | Example                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                        | [dev.hathora.cloud_sdk.models.operations.CreateLobbyDeprecatedSecurity](../../models/operations/CreateLobbyDeprecatedSecurity.md) | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |                                                                                                                                   |
| `createLobbyParams`                                                                                                               | [CreateLobbyParams](../../models/shared/CreateLobbyParams.md)                                                                     | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               |                                                                                                                                   |
| `appId`                                                                                                                           | *Optional\<String>*                                                                                                               | :heavy_minus_sign:                                                                                                                | N/A                                                                                                                               | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                          |
| `roomId`                                                                                                                          | *Optional\<String>*                                                                                                               | :heavy_minus_sign:                                                                                                                | N/A                                                                                                                               | 2swovpy1fnunu                                                                                                                     |

### Response

**[CreateLobbyDeprecatedResponse](../../models/operations/CreateLobbyDeprecatedResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ApiError       | 400, 401, 402, 404, 422, 429 | application/json             |
| models/errors/ApiError       | 500                          | application/json             |
| models/errors/SDKError       | 4XX, 5XX                     | \*/\*                        |

## ~~createLocalLobby~~

CreateLocalLobby

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.*;
import dev.hathora.cloud_sdk.models.shared.Region;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        CreateLocalLobbyResponse res = sdk.lobbiesV2().createLocalLobby()
                .security(CreateLocalLobbySecurity.builder()
                    .playerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .requestBody(CreateLocalLobbyRequestBody.builder()
                    .initialConfig("<value>")
                    .region(Region.JOHANNESBURG)
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

        if (res.lobby().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             | Example                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                              | [dev.hathora.cloud_sdk.models.operations.CreateLocalLobbySecurity](../../models/operations/CreateLocalLobbySecurity.md) | :heavy_check_mark:                                                                                                      | The security requirements to use for the request.                                                                       |                                                                                                                         |
| `requestBody`                                                                                                           | [CreateLocalLobbyRequestBody](../../models/operations/CreateLocalLobbyRequestBody.md)                                   | :heavy_check_mark:                                                                                                      | N/A                                                                                                                     |                                                                                                                         |
| `appId`                                                                                                                 | *Optional\<String>*                                                                                                     | :heavy_minus_sign:                                                                                                      | N/A                                                                                                                     | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                |
| `roomId`                                                                                                                | *Optional\<String>*                                                                                                     | :heavy_minus_sign:                                                                                                      | N/A                                                                                                                     | 2swovpy1fnunu                                                                                                           |

### Response

**[CreateLocalLobbyResponse](../../models/operations/CreateLocalLobbyResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ApiError       | 400, 401, 402, 404, 422, 429 | application/json             |
| models/errors/ApiError       | 500                          | application/json             |
| models/errors/SDKError       | 4XX, 5XX                     | \*/\*                        |

## ~~createPrivateLobby~~

CreatePrivateLobby

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.*;
import dev.hathora.cloud_sdk.models.shared.Region;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        CreatePrivateLobbyResponse res = sdk.lobbiesV2().createPrivateLobby()
                .security(CreatePrivateLobbySecurity.builder()
                    .playerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .requestBody(CreatePrivateLobbyRequestBody.builder()
                    .initialConfig("<value>")
                    .region(Region.LONDON)
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

        if (res.lobby().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 | Example                                                                                                                     |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                  | [dev.hathora.cloud_sdk.models.operations.CreatePrivateLobbySecurity](../../models/operations/CreatePrivateLobbySecurity.md) | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |                                                                                                                             |
| `requestBody`                                                                                                               | [CreatePrivateLobbyRequestBody](../../models/operations/CreatePrivateLobbyRequestBody.md)                                   | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         |                                                                                                                             |
| `appId`                                                                                                                     | *Optional\<String>*                                                                                                         | :heavy_minus_sign:                                                                                                          | N/A                                                                                                                         | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                    |
| `roomId`                                                                                                                    | *Optional\<String>*                                                                                                         | :heavy_minus_sign:                                                                                                          | N/A                                                                                                                         | 2swovpy1fnunu                                                                                                               |

### Response

**[CreatePrivateLobbyResponse](../../models/operations/CreatePrivateLobbyResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ApiError       | 400, 401, 402, 404, 422, 429 | application/json             |
| models/errors/ApiError       | 500                          | application/json             |
| models/errors/SDKError       | 4XX, 5XX                     | \*/\*                        |

## ~~createPublicLobby~~

CreatePublicLobby

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.*;
import dev.hathora.cloud_sdk.models.shared.Region;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        CreatePublicLobbyResponse res = sdk.lobbiesV2().createPublicLobby()
                .security(CreatePublicLobbySecurity.builder()
                    .playerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .requestBody(CreatePublicLobbyRequestBody.builder()
                    .initialConfig("<value>")
                    .region(Region.JOHANNESBURG)
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

        if (res.lobby().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               | Example                                                                                                                   |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                | [dev.hathora.cloud_sdk.models.operations.CreatePublicLobbySecurity](../../models/operations/CreatePublicLobbySecurity.md) | :heavy_check_mark:                                                                                                        | The security requirements to use for the request.                                                                         |                                                                                                                           |
| `requestBody`                                                                                                             | [CreatePublicLobbyRequestBody](../../models/operations/CreatePublicLobbyRequestBody.md)                                   | :heavy_check_mark:                                                                                                        | N/A                                                                                                                       |                                                                                                                           |
| `appId`                                                                                                                   | *Optional\<String>*                                                                                                       | :heavy_minus_sign:                                                                                                        | N/A                                                                                                                       | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                  |
| `roomId`                                                                                                                  | *Optional\<String>*                                                                                                       | :heavy_minus_sign:                                                                                                        | N/A                                                                                                                       | 2swovpy1fnunu                                                                                                             |

### Response

**[CreatePublicLobbyResponse](../../models/operations/CreatePublicLobbyResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ApiError       | 400, 401, 402, 404, 422, 429 | application/json             |
| models/errors/ApiError       | 500                          | application/json             |
| models/errors/SDKError       | 4XX, 5XX                     | \*/\*                        |

## ~~getLobbyInfo~~

Get details for a lobby.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetLobbyInfoResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        GetLobbyInfoResponse res = sdk.lobbiesV2().getLobbyInfo()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

        if (res.lobby().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `roomId`                                 | *String*                                 | :heavy_check_mark:                       | N/A                                      | 2swovpy1fnunu                            |

### Response

**[GetLobbyInfoResponse](../../models/operations/GetLobbyInfoResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 404, 429               | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~listActivePublicLobbiesDeprecatedV2~~

Get all active lobbies for a an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter by optionally passing in a `region`. Use this endpoint to display all public lobbies that a player can join in the game client.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.ListActivePublicLobbiesDeprecatedV2Response;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        ListActivePublicLobbiesDeprecatedV2Response res = sdk.lobbiesV2().listActivePublicLobbiesDeprecatedV2()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .call();

        if (res.classes().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             | Example                                                                                 |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `appId`                                                                                 | *Optional\<String>*                                                                     | :heavy_minus_sign:                                                                      | N/A                                                                                     | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                |
| `region`                                                                                | [Optional\<Region>](../../models/shared/Region.md)                                      | :heavy_minus_sign:                                                                      | Region to filter by. If omitted, active public lobbies in all regions will be returned. |                                                                                         |

### Response

**[ListActivePublicLobbiesDeprecatedV2Response](../../models/operations/ListActivePublicLobbiesDeprecatedV2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 429               | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~setLobbyState~~

Set the state of a lobby. State is intended to be set by the server and must be smaller than 1MB. Use this endpoint to store match data like live player count to enforce max number of clients or persist end-game data (i.e. winner or final scores).

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.SetLobbyStateResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import dev.hathora.cloud_sdk.models.shared.SetLobbyStateParams;
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

        SetLobbyStateResponse res = sdk.lobbiesV2().setLobbyState()
                .setLobbyStateParams(SetLobbyStateParams.builder()
                    .state("South Dakota")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

        if (res.lobby().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       | Example                                                           |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `setLobbyStateParams`                                             | [SetLobbyStateParams](../../models/shared/SetLobbyStateParams.md) | :heavy_check_mark:                                                | N/A                                                               |                                                                   |
| `appId`                                                           | *Optional\<String>*                                               | :heavy_minus_sign:                                                | N/A                                                               | app-af469a92-5b45-4565-b3c4-b79878de67d2                          |
| `roomId`                                                          | *String*                                                          | :heavy_check_mark:                                                | N/A                                                               | 2swovpy1fnunu                                                     |

### Response

**[SetLobbyStateResponse](../../models/operations/SetLobbyStateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 422, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |