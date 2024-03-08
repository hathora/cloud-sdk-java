# LobbyV3
(*lobbyV3()*)

## Overview

Operations to create and manage lobbies using our [Lobby Service](https://hathora.dev/docs/lobbies-and-matchmaking/lobby-service).

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

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.CreateLobbyRequest;
import dev.hathora.cloud_api.models.operations.CreateLobbyResponse;
import dev.hathora.cloud_api.models.operations.CreateLobbySecurity;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.CreateLobbyV3Params;
import dev.hathora.cloud_api.models.shared.LobbyVisibility;
import dev.hathora.cloud_api.models.shared.Region;
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
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            CreateLobbyRequest req = CreateLobbyRequest.builder()
                .createLobbyV3Params(CreateLobbyV3Params.builder()
                        .region(Region.SEATTLE)
                        .visibility(LobbyVisibility.PRIVATE_)
                        .roomConfig("{\"name\":\"my-room\"}")
                        .build())
                .roomId("2swovpy1fnunu")
                .shortCode("LFG4")
                .build();

            CreateLobbyResponse res = sdk.lobbyV3().createLobby()
                .request(req)
                .security(CreateLobbySecurity.builder()
                    .playerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .call();

            if (res.lobbyV3().isPresent()) {
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [dev.hathora.cloud_api.models.operations.CreateLobbyRequest](../../models/operations/CreateLobbyRequest.md)   | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |
| `security`                                                                                                    | [dev.hathora.cloud_api.models.operations.CreateLobbySecurity](../../models/operations/CreateLobbySecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.CreateLobbyResponse>](../../models/operations/CreateLobbyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getLobbyInfoByRoomId

Get details for a lobby.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.GetLobbyInfoByRoomIdRequest;
import dev.hathora.cloud_api.models.operations.GetLobbyInfoByRoomIdResponse;
import dev.hathora.cloud_api.models.shared.*;
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
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            GetLobbyInfoByRoomIdResponse res = sdk.lobbyV3().getLobbyInfoByRoomId()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

            if (res.lobbyV3().isPresent()) {
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
| `appId`                                  | *Optional<? extends String>*             | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `roomId`                                 | *String*                                 | :heavy_check_mark:                       | N/A                                      | 2swovpy1fnunu                            |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.GetLobbyInfoByRoomIdResponse>](../../models/operations/GetLobbyInfoByRoomIdResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getLobbyInfoByShortCode

Get details for a lobby. If 2 or more lobbies have the same `shortCode`, then the most recently created lobby will be returned.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.GetLobbyInfoByShortCodeRequest;
import dev.hathora.cloud_api.models.operations.GetLobbyInfoByShortCodeResponse;
import dev.hathora.cloud_api.models.shared.*;
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
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            GetLobbyInfoByShortCodeResponse res = sdk.lobbyV3().getLobbyInfoByShortCode()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .shortCode("LFG4")
                .call();

            if (res.lobbyV3().isPresent()) {
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
| `appId`                                  | *Optional<? extends String>*             | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `shortCode`                              | *String*                                 | :heavy_check_mark:                       | N/A                                      | LFG4                                     |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.GetLobbyInfoByShortCodeResponse>](../../models/operations/GetLobbyInfoByShortCodeResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listActivePublicLobbies

Get all active lobbies for a given [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`. Use this endpoint to display all public lobbies that a player can join in the game client.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesRequest;
import dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesResponse;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.Region;
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
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            ListActivePublicLobbiesResponse res = sdk.lobbyV3().listActivePublicLobbies()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .region(Region.SEATTLE)
                .call();

            if (res.classes().isPresent()) {
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

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     | Example                                                                                         |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `appId`                                                                                         | *Optional<? extends String>*                                                                    | :heavy_minus_sign:                                                                              | N/A                                                                                             | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                        |
| `region`                                                                                        | [Optional<? extends dev.hathora.cloud_api.models.shared.Region>](../../models/shared/Region.md) | :heavy_minus_sign:                                                                              | If omitted, active public lobbies in all regions will be returned.                              |                                                                                                 |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesResponse>](../../models/operations/ListActivePublicLobbiesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
