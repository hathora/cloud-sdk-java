# LobbiesV2
(*lobbiesV2()*)

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

import com.hathora.cloud_api.HathoraCloud;
import com.hathora.cloud_api.models.operations.*;
import com.hathora.cloud_api.models.operations.CreateLobbyDeprecatedSecurity;
import com.hathora.cloud_api.models.shared.*;
import com.hathora.cloud_api.utils.EventStream;
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
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            CreateLobbyDeprecatedResponse res = sdk.lobbiesV2().createLobbyDeprecated()
                .security(CreateLobbyDeprecatedSecurity.builder()
                    .playerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .createLobbyParams(CreateLobbyParams.builder()
                    .initialConfig("<value>")
                    .region(Region.TOKYO)
                    .visibility(LobbyVisibility.PRIVATE_)
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

            if (res.lobby().isPresent()) {
                // handle response
            }
        } catch (com.hathora.cloud_api.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_api.models.errors.SDKError e) {
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

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       | Example                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                        | [com.hathora.cloud_api.models.operations.CreateLobbyDeprecatedSecurity](../../models/operations/CreateLobbyDeprecatedSecurity.md) | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |                                                                                                                                   |
| `createLobbyParams`                                                                                                               | [com.hathora.cloud_api.models.shared.CreateLobbyParams](../../models/shared/CreateLobbyParams.md)                                 | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               |                                                                                                                                   |
| `appId`                                                                                                                           | *Optional<? extends String>*                                                                                                      | :heavy_minus_sign:                                                                                                                | N/A                                                                                                                               | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                          |
| `roomId`                                                                                                                          | *Optional<? extends String>*                                                                                                      | :heavy_minus_sign:                                                                                                                | N/A                                                                                                                               | 2swovpy1fnunu                                                                                                                     |


### Response

**[com.hathora.cloud_api.models.operations.CreateLobbyDeprecatedResponse](../../models/operations/CreateLobbyDeprecatedResponse.md)**
### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ApiError      | 400,401,402,404,422,429,500 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |

## ~~createLocalLobby~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_api.HathoraCloud;
import com.hathora.cloud_api.models.operations.*;
import com.hathora.cloud_api.models.operations.CreateLocalLobbySecurity;
import com.hathora.cloud_api.models.shared.*;
import com.hathora.cloud_api.utils.EventStream;
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
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            CreateLocalLobbyResponse res = sdk.lobbiesV2().createLocalLobby()
                .security(CreateLocalLobbySecurity.builder()
                    .playerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .requestBody(CreateLocalLobbyRequestBody.builder()
                    .initialConfig("<value>")
                    .region(Region.SAO_PAULO)
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

            if (res.lobby().isPresent()) {
                // handle response
            }
        } catch (com.hathora.cloud_api.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_api.models.errors.SDKError e) {
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

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   | Example                                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                    | [com.hathora.cloud_api.models.operations.CreateLocalLobbySecurity](../../models/operations/CreateLocalLobbySecurity.md)       | :heavy_check_mark:                                                                                                            | The security requirements to use for the request.                                                                             |                                                                                                                               |
| `requestBody`                                                                                                                 | [com.hathora.cloud_api.models.operations.CreateLocalLobbyRequestBody](../../models/operations/CreateLocalLobbyRequestBody.md) | :heavy_check_mark:                                                                                                            | N/A                                                                                                                           |                                                                                                                               |
| `appId`                                                                                                                       | *Optional<? extends String>*                                                                                                  | :heavy_minus_sign:                                                                                                            | N/A                                                                                                                           | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                      |
| `roomId`                                                                                                                      | *Optional<? extends String>*                                                                                                  | :heavy_minus_sign:                                                                                                            | N/A                                                                                                                           | 2swovpy1fnunu                                                                                                                 |


### Response

**[com.hathora.cloud_api.models.operations.CreateLocalLobbyResponse](../../models/operations/CreateLocalLobbyResponse.md)**
### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ApiError      | 400,401,402,404,422,429,500 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |

## ~~createPrivateLobby~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_api.HathoraCloud;
import com.hathora.cloud_api.models.operations.*;
import com.hathora.cloud_api.models.operations.CreatePrivateLobbySecurity;
import com.hathora.cloud_api.models.shared.*;
import com.hathora.cloud_api.utils.EventStream;
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
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            CreatePrivateLobbyResponse res = sdk.lobbiesV2().createPrivateLobby()
                .security(CreatePrivateLobbySecurity.builder()
                    .playerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .requestBody(CreatePrivateLobbyRequestBody.builder()
                    .initialConfig("<value>")
                    .region(Region.CHICAGO)
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

            if (res.lobby().isPresent()) {
                // handle response
            }
        } catch (com.hathora.cloud_api.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_api.models.errors.SDKError e) {
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

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       | Example                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                        | [com.hathora.cloud_api.models.operations.CreatePrivateLobbySecurity](../../models/operations/CreatePrivateLobbySecurity.md)       | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |                                                                                                                                   |
| `requestBody`                                                                                                                     | [com.hathora.cloud_api.models.operations.CreatePrivateLobbyRequestBody](../../models/operations/CreatePrivateLobbyRequestBody.md) | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               |                                                                                                                                   |
| `appId`                                                                                                                           | *Optional<? extends String>*                                                                                                      | :heavy_minus_sign:                                                                                                                | N/A                                                                                                                               | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                          |
| `roomId`                                                                                                                          | *Optional<? extends String>*                                                                                                      | :heavy_minus_sign:                                                                                                                | N/A                                                                                                                               | 2swovpy1fnunu                                                                                                                     |


### Response

**[com.hathora.cloud_api.models.operations.CreatePrivateLobbyResponse](../../models/operations/CreatePrivateLobbyResponse.md)**
### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ApiError      | 400,401,402,404,422,429,500 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |

## ~~createPublicLobby~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_api.HathoraCloud;
import com.hathora.cloud_api.models.operations.*;
import com.hathora.cloud_api.models.operations.CreatePublicLobbySecurity;
import com.hathora.cloud_api.models.shared.*;
import com.hathora.cloud_api.utils.EventStream;
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
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            CreatePublicLobbyResponse res = sdk.lobbiesV2().createPublicLobby()
                .security(CreatePublicLobbySecurity.builder()
                    .playerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .requestBody(CreatePublicLobbyRequestBody.builder()
                    .initialConfig("<value>")
                    .region(Region.SAO_PAULO)
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

            if (res.lobby().isPresent()) {
                // handle response
            }
        } catch (com.hathora.cloud_api.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_api.models.errors.SDKError e) {
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

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     | Example                                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                      | [com.hathora.cloud_api.models.operations.CreatePublicLobbySecurity](../../models/operations/CreatePublicLobbySecurity.md)       | :heavy_check_mark:                                                                                                              | The security requirements to use for the request.                                                                               |                                                                                                                                 |
| `requestBody`                                                                                                                   | [com.hathora.cloud_api.models.operations.CreatePublicLobbyRequestBody](../../models/operations/CreatePublicLobbyRequestBody.md) | :heavy_check_mark:                                                                                                              | N/A                                                                                                                             |                                                                                                                                 |
| `appId`                                                                                                                         | *Optional<? extends String>*                                                                                                    | :heavy_minus_sign:                                                                                                              | N/A                                                                                                                             | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                        |
| `roomId`                                                                                                                        | *Optional<? extends String>*                                                                                                    | :heavy_minus_sign:                                                                                                              | N/A                                                                                                                             | 2swovpy1fnunu                                                                                                                   |


### Response

**[com.hathora.cloud_api.models.operations.CreatePublicLobbyResponse](../../models/operations/CreatePublicLobbyResponse.md)**
### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ApiError      | 400,401,402,404,422,429,500 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |

## ~~getLobbyInfo~~

Get details for a lobby.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_api.HathoraCloud;
import com.hathora.cloud_api.models.operations.*;
import com.hathora.cloud_api.models.shared.*;
import com.hathora.cloud_api.utils.EventStream;
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
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            GetLobbyInfoResponse res = sdk.lobbiesV2().getLobbyInfo()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

            if (res.lobby().isPresent()) {
                // handle response
            }
        } catch (com.hathora.cloud_api.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_api.models.errors.SDKError e) {
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
| `appId`                                  | *Optional<? extends String>*             | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `roomId`                                 | *String*                                 | :heavy_check_mark:                       | N/A                                      | 2swovpy1fnunu                            |


### Response

**[com.hathora.cloud_api.models.operations.GetLobbyInfoResponse](../../models/operations/GetLobbyInfoResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 404,429                | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## ~~listActivePublicLobbiesDeprecatedV2~~

Get all active lobbies for a an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter by optionally passing in a `region`. Use this endpoint to display all public lobbies that a player can join in the game client.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_api.HathoraCloud;
import com.hathora.cloud_api.models.operations.*;
import com.hathora.cloud_api.models.shared.*;
import com.hathora.cloud_api.utils.EventStream;
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
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            ListActivePublicLobbiesDeprecatedV2Response res = sdk.lobbiesV2().listActivePublicLobbiesDeprecatedV2()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .region(Region.FRANKFURT)
                .call();

            if (res.classes().isPresent()) {
                // handle response
            }
        } catch (com.hathora.cloud_api.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_api.models.errors.SDKError e) {
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

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     | Example                                                                                         |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `appId`                                                                                         | *Optional<? extends String>*                                                                    | :heavy_minus_sign:                                                                              | N/A                                                                                             | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                        |
| `region`                                                                                        | [Optional<? extends com.hathora.cloud_api.models.shared.Region>](../../models/shared/Region.md) | :heavy_minus_sign:                                                                              | Region to filter by. If omitted, active public lobbies in all regions will be returned.         |                                                                                                 |


### Response

**[com.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedV2Response](../../models/operations/ListActivePublicLobbiesDeprecatedV2Response.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,429                | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## ~~setLobbyState~~

Set the state of a lobby. State is intended to be set by the server and must be smaller than 1MB. Use this endpoint to store match data like live player count to enforce max number of clients or persist end-game data (i.e. winner or final scores).

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_api.HathoraCloud;
import com.hathora.cloud_api.models.operations.*;
import com.hathora.cloud_api.models.shared.*;
import com.hathora.cloud_api.models.shared.Security;
import com.hathora.cloud_api.utils.EventStream;
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

            SetLobbyStateResponse res = sdk.lobbiesV2().setLobbyState()
                .setLobbyStateParams(SetLobbyStateParams.builder()
                    .state("<value>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

            if (res.lobby().isPresent()) {
                // handle response
            }
        } catch (com.hathora.cloud_api.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_api.models.errors.SDKError e) {
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

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           | Example                                                                                               |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `setLobbyStateParams`                                                                                 | [com.hathora.cloud_api.models.shared.SetLobbyStateParams](../../models/shared/SetLobbyStateParams.md) | :heavy_check_mark:                                                                                    | N/A                                                                                                   |                                                                                                       |
| `appId`                                                                                               | *Optional<? extends String>*                                                                          | :heavy_minus_sign:                                                                                    | N/A                                                                                                   | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                              |
| `roomId`                                                                                              | *String*                                                                                              | :heavy_check_mark:                                                                                    | N/A                                                                                                   | 2swovpy1fnunu                                                                                         |


### Response

**[com.hathora.cloud_api.models.operations.SetLobbyStateResponse](../../models/operations/SetLobbyStateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,422,429        | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
