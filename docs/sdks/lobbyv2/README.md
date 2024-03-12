# LobbyV2
(*lobbyV2()*)

## Overview

Deprecated. Use [LobbyV3](https://hathora.dev/api#tag/LobbyV3).

### Available Operations

* [~~createLobbyDeprecated~~](#createlobbydeprecated) - Create a new lobby for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). A lobby object is a wrapper around a [room](https://hathora.dev/docs/concepts/hathora-entities#room) object. With a lobby, you get additional functionality like configuring the visibility of the room, managing the state of a match, and retrieving a list of public lobbies to display to players. :warning: **Deprecated**
* [~~createLocalLobby~~](#createlocallobby) - :warning: **Deprecated**
* [~~createPrivateLobby~~](#createprivatelobby) - :warning: **Deprecated**
* [~~createPublicLobby~~](#createpubliclobby) - :warning: **Deprecated**
* [~~getLobbyInfo~~](#getlobbyinfo) - Get details for a lobby. :warning: **Deprecated**
* [~~listActivePublicLobbiesDeprecatedV2~~](#listactivepubliclobbiesdeprecatedv2) - Get all active lobbies for a an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter by optionally passing in a `region`. Use this endpoint to display all public lobbies that a player can join in the game client. :warning: **Deprecated**
* [~~setLobbyState~~](#setlobbystate) - Set the state of a lobby. State is intended to be set by the server and must be smaller than 1MB. Use this endpoint to store match data like live player count to enforce max number of clients or persist end-game data (i.e. winner or final scores). :warning: **Deprecated**

## ~~createLobbyDeprecated~~

Create a new lobby for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). A lobby object is a wrapper around a [room](https://hathora.dev/docs/concepts/hathora-entities#room) object. With a lobby, you get additional functionality like configuring the visibility of the room, managing the state of a match, and retrieving a list of public lobbies to display to players.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.CreateLobbyDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.CreateLobbyDeprecatedResponse;
import dev.hathora.cloud_api.models.operations.CreateLobbyDeprecatedSecurity;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.CreateLobbyParams;
import dev.hathora.cloud_api.models.shared.LobbyInitialConfig;
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

            CreateLobbyDeprecatedResponse res = sdk.lobbyV2().createLobbyDeprecated()
                .security(CreateLobbyDeprecatedSecurity.builder()
                    .playerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .createLobbyParams(CreateLobbyParams.builder()
                    .initialConfig(LobbyInitialConfig.builder()
                            .build())
                    .region(Region.CHICAGO)
                    .visibility(LobbyVisibility.PRIVATE_)
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

            if (res.lobby().isPresent()) {
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

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       | Example                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                        | [dev.hathora.cloud_api.models.operations.CreateLobbyDeprecatedSecurity](../../models/operations/CreateLobbyDeprecatedSecurity.md) | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |                                                                                                                                   |
| `createLobbyParams`                                                                                                               | [dev.hathora.cloud_api.models.shared.CreateLobbyParams](../../models/shared/CreateLobbyParams.md)                                 | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               |                                                                                                                                   |
| `appId`                                                                                                                           | *Optional<? extends String>*                                                                                                      | :heavy_minus_sign:                                                                                                                | N/A                                                                                                                               | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                          |
| `roomId`                                                                                                                          | *Optional<? extends String>*                                                                                                      | :heavy_minus_sign:                                                                                                                | N/A                                                                                                                               | 2swovpy1fnunu                                                                                                                     |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.CreateLobbyDeprecatedResponse>](../../models/operations/CreateLobbyDeprecatedResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## ~~createLocalLobby~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.CreateLocalLobbyRequest;
import dev.hathora.cloud_api.models.operations.CreateLocalLobbyRequestBody;
import dev.hathora.cloud_api.models.operations.CreateLocalLobbyResponse;
import dev.hathora.cloud_api.models.operations.CreateLocalLobbySecurity;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.LobbyInitialConfig;
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

            CreateLocalLobbyResponse res = sdk.lobbyV2().createLocalLobby()
                .security(CreateLocalLobbySecurity.builder()
                    .playerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .requestBody(CreateLocalLobbyRequestBody.builder()
                    .initialConfig(LobbyInitialConfig.builder()
                            .build())
                    .region(Region.WASHINGTON_DC)
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

            if (res.lobby().isPresent()) {
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

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   | Example                                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                    | [dev.hathora.cloud_api.models.operations.CreateLocalLobbySecurity](../../models/operations/CreateLocalLobbySecurity.md)       | :heavy_check_mark:                                                                                                            | The security requirements to use for the request.                                                                             |                                                                                                                               |
| `requestBody`                                                                                                                 | [dev.hathora.cloud_api.models.operations.CreateLocalLobbyRequestBody](../../models/operations/CreateLocalLobbyRequestBody.md) | :heavy_check_mark:                                                                                                            | N/A                                                                                                                           |                                                                                                                               |
| `appId`                                                                                                                       | *Optional<? extends String>*                                                                                                  | :heavy_minus_sign:                                                                                                            | N/A                                                                                                                           | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                      |
| `roomId`                                                                                                                      | *Optional<? extends String>*                                                                                                  | :heavy_minus_sign:                                                                                                            | N/A                                                                                                                           | 2swovpy1fnunu                                                                                                                 |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.CreateLocalLobbyResponse>](../../models/operations/CreateLocalLobbyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## ~~createPrivateLobby~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.CreatePrivateLobbyRequest;
import dev.hathora.cloud_api.models.operations.CreatePrivateLobbyRequestBody;
import dev.hathora.cloud_api.models.operations.CreatePrivateLobbyResponse;
import dev.hathora.cloud_api.models.operations.CreatePrivateLobbySecurity;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.LobbyInitialConfig;
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

            CreatePrivateLobbyResponse res = sdk.lobbyV2().createPrivateLobby()
                .security(CreatePrivateLobbySecurity.builder()
                    .playerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .requestBody(CreatePrivateLobbyRequestBody.builder()
                    .initialConfig(LobbyInitialConfig.builder()
                            .build())
                    .region(Region.LOS_ANGELES)
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

            if (res.lobby().isPresent()) {
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

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       | Example                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                        | [dev.hathora.cloud_api.models.operations.CreatePrivateLobbySecurity](../../models/operations/CreatePrivateLobbySecurity.md)       | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |                                                                                                                                   |
| `requestBody`                                                                                                                     | [dev.hathora.cloud_api.models.operations.CreatePrivateLobbyRequestBody](../../models/operations/CreatePrivateLobbyRequestBody.md) | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               |                                                                                                                                   |
| `appId`                                                                                                                           | *Optional<? extends String>*                                                                                                      | :heavy_minus_sign:                                                                                                                | N/A                                                                                                                               | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                          |
| `roomId`                                                                                                                          | *Optional<? extends String>*                                                                                                      | :heavy_minus_sign:                                                                                                                | N/A                                                                                                                               | 2swovpy1fnunu                                                                                                                     |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.CreatePrivateLobbyResponse>](../../models/operations/CreatePrivateLobbyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## ~~createPublicLobby~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.CreatePublicLobbyRequest;
import dev.hathora.cloud_api.models.operations.CreatePublicLobbyRequestBody;
import dev.hathora.cloud_api.models.operations.CreatePublicLobbyResponse;
import dev.hathora.cloud_api.models.operations.CreatePublicLobbySecurity;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.LobbyInitialConfig;
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

            CreatePublicLobbyResponse res = sdk.lobbyV2().createPublicLobby()
                .security(CreatePublicLobbySecurity.builder()
                    .playerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .requestBody(CreatePublicLobbyRequestBody.builder()
                    .initialConfig(LobbyInitialConfig.builder()
                            .build())
                    .region(Region.WASHINGTON_DC)
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

            if (res.lobby().isPresent()) {
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

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     | Example                                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                      | [dev.hathora.cloud_api.models.operations.CreatePublicLobbySecurity](../../models/operations/CreatePublicLobbySecurity.md)       | :heavy_check_mark:                                                                                                              | The security requirements to use for the request.                                                                               |                                                                                                                                 |
| `requestBody`                                                                                                                   | [dev.hathora.cloud_api.models.operations.CreatePublicLobbyRequestBody](../../models/operations/CreatePublicLobbyRequestBody.md) | :heavy_check_mark:                                                                                                              | N/A                                                                                                                             |                                                                                                                                 |
| `appId`                                                                                                                         | *Optional<? extends String>*                                                                                                    | :heavy_minus_sign:                                                                                                              | N/A                                                                                                                             | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                        |
| `roomId`                                                                                                                        | *Optional<? extends String>*                                                                                                    | :heavy_minus_sign:                                                                                                              | N/A                                                                                                                             | 2swovpy1fnunu                                                                                                                   |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.CreatePublicLobbyResponse>](../../models/operations/CreatePublicLobbyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## ~~getLobbyInfo~~

Get details for a lobby.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.GetLobbyInfoRequest;
import dev.hathora.cloud_api.models.operations.GetLobbyInfoResponse;
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

            GetLobbyInfoResponse res = sdk.lobbyV2().getLobbyInfo()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

            if (res.lobby().isPresent()) {
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

**[Optional<? extends dev.hathora.cloud_api.models.operations.GetLobbyInfoResponse>](../../models/operations/GetLobbyInfoResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## ~~listActivePublicLobbiesDeprecatedV2~~

Get all active lobbies for a an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter by optionally passing in a `region`. Use this endpoint to display all public lobbies that a player can join in the game client.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedV2Request;
import dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedV2Response;
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

            ListActivePublicLobbiesDeprecatedV2Response res = sdk.lobbyV2().listActivePublicLobbiesDeprecatedV2()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .region(Region.FRANKFURT)
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
| `region`                                                                                        | [Optional<? extends dev.hathora.cloud_api.models.shared.Region>](../../models/shared/Region.md) | :heavy_minus_sign:                                                                              | Region to filter by. If omitted, active public lobbies in all regions will be returned.         |                                                                                                 |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedV2Response>](../../models/operations/ListActivePublicLobbiesDeprecatedV2Response.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## ~~setLobbyState~~

Set the state of a lobby. State is intended to be set by the server and must be smaller than 1MB. Use this endpoint to store match data like live player count to enforce max number of clients or persist end-game data (i.e. winner or final scores).

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.SetLobbyStateRequest;
import dev.hathora.cloud_api.models.operations.SetLobbyStateResponse;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.Security;
import dev.hathora.cloud_api.models.shared.SetLobbyStateParams;
import dev.hathora.cloud_api.models.shared.SetLobbyStateParamsState;
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

            SetLobbyStateResponse res = sdk.lobbyV2().setLobbyState()
                .setLobbyStateParams(SetLobbyStateParams.builder()
                    .state(SetLobbyStateParamsState.builder()
                            .build())
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

            if (res.lobby().isPresent()) {
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

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           | Example                                                                                               |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `setLobbyStateParams`                                                                                 | [dev.hathora.cloud_api.models.shared.SetLobbyStateParams](../../models/shared/SetLobbyStateParams.md) | :heavy_check_mark:                                                                                    | N/A                                                                                                   |                                                                                                       |
| `appId`                                                                                               | *Optional<? extends String>*                                                                          | :heavy_minus_sign:                                                                                    | N/A                                                                                                   | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                              |
| `roomId`                                                                                              | *String*                                                                                              | :heavy_check_mark:                                                                                    | N/A                                                                                                   | 2swovpy1fnunu                                                                                         |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.SetLobbyStateResponse>](../../models/operations/SetLobbyStateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
