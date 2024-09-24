# LobbiesV3
(*lobbiesV3()*)

## Overview

### Available Operations

* [createLobby](#createlobby) - Create a new lobby for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). A lobby object is a wrapper around a [room](https://hathora.dev/docs/concepts/hathora-entities#room) object. With a lobby, you get additional functionality like configuring the visibility of the room, managing the state of a match, and retrieving a list of public lobbies to display to players.
* [getLobbyInfoByRoomId](#getlobbyinfobyroomid) - Get details for a lobby.
* [getLobbyInfoByShortCode](#getlobbyinfobyshortcode) - Get details for a lobby. If 2 or more lobbies have the same `shortCode`, then the most recently created lobby will be returned.
* [listActivePublicLobbies](#listactivepubliclobbies) - Get all active lobbies for a given [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`. Use this endpoint to display all public lobbies that a player can join in the game client.

## createLobby

Create a new lobby for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). A lobby object is a wrapper around a [room](https://hathora.dev/docs/concepts/hathora-entities#room) object. With a lobby, you get additional functionality like configuring the visibility of the room, managing the state of a match, and retrieving a list of public lobbies to display to players.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateLobbyRequest;
import dev.hathora.cloud_sdk.models.operations.CreateLobbyResponse;
import dev.hathora.cloud_sdk.models.operations.CreateLobbySecurity;
import dev.hathora.cloud_sdk.models.shared.CreateLobbyV3Params;
import dev.hathora.cloud_sdk.models.shared.LobbyVisibility;
import dev.hathora.cloud_sdk.models.shared.Region;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        CreateLobbyRequest req = CreateLobbyRequest.builder()
                .createLobbyV3Params(CreateLobbyV3Params.builder()
                    .region(Region.SEATTLE)
                    .visibility(LobbyVisibility.PRIVATE)
                    .roomConfig("{\"name\":\"my-room\"}")
                    .build())
                .roomId("2swovpy1fnunu")
                .shortCode("LFG4")
                .build();

        CreateLobbyResponse res = sdk.lobbiesV3().createLobby()
                .request(req)
                .security(CreateLobbySecurity.builder()
                    .playerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .call();

        if (res.lobbyV3().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [CreateLobbyRequest](../../models/operations/CreateLobbyRequest.md)                                           | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |
| `security`                                                                                                    | [dev.hathora.cloud_sdk.models.operations.CreateLobbySecurity](../../models/operations/CreateLobbySecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |

### Response

**[CreateLobbyResponse](../../models/operations/CreateLobbyResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ApiError      | 400,401,402,404,422,429,500 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## getLobbyInfoByRoomId

Get details for a lobby.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetLobbyInfoByRoomIdResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        GetLobbyInfoByRoomIdResponse res = sdk.lobbiesV3().getLobbyInfoByRoomId()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

        if (res.lobbyV3().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional<String>*                       | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `roomId`                                 | *String*                                 | :heavy_check_mark:                       | N/A                                      | 2swovpy1fnunu                            |

### Response

**[GetLobbyInfoByRoomIdResponse](../../models/operations/GetLobbyInfoByRoomIdResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 404,422,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getLobbyInfoByShortCode

Get details for a lobby. If 2 or more lobbies have the same `shortCode`, then the most recently created lobby will be returned.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetLobbyInfoByShortCodeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        GetLobbyInfoByShortCodeResponse res = sdk.lobbiesV3().getLobbyInfoByShortCode()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .shortCode("LFG4")
                .call();

        if (res.lobbyV3().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional<String>*                       | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `shortCode`                              | *String*                                 | :heavy_check_mark:                       | N/A                                      | LFG4                                     |

### Response

**[GetLobbyInfoByShortCodeResponse](../../models/operations/GetLobbyInfoByShortCodeResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 404,429                | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## listActivePublicLobbies

Get all active lobbies for a given [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`. Use this endpoint to display all public lobbies that a player can join in the game client.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.ListActivePublicLobbiesResponse;
import dev.hathora.cloud_sdk.models.shared.Region;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        ListActivePublicLobbiesResponse res = sdk.lobbiesV3().listActivePublicLobbies()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .region(Region.SEATTLE)
                .call();

        if (res.classes().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                          | Type                                                               | Required                                                           | Description                                                        | Example                                                            |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `appId`                                                            | *Optional<String>*                                                 | :heavy_minus_sign:                                                 | N/A                                                                | app-af469a92-5b45-4565-b3c4-b79878de67d2                           |
| `region`                                                           | [Optional<Region>](../../models/shared/Region.md)                  | :heavy_minus_sign:                                                 | If omitted, active public lobbies in all regions will be returned. |                                                                    |

### Response

**[ListActivePublicLobbiesResponse](../../models/operations/ListActivePublicLobbiesResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,429                | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
