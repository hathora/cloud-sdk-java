# lobbyV2

## Overview

Operations to create and manage [lobbies](https://hathora.dev/docs/concepts/hathora-entities#lobby).

### Available Operations

* [createLobby](#createlobby) - Create a new [lobby](https://hathora.dev/docs/concepts/hathora-entities#lobby) for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.
* [~~createLocalLobby~~](#createlocallobby) - :warning: **Deprecated**
* [~~createPrivateLobby~~](#createprivatelobby) - :warning: **Deprecated**
* [~~createPublicLobby~~](#createpubliclobby) - :warning: **Deprecated**
* [getLobbyInfo](#getlobbyinfo) - Get details for an existing [lobby](https://hathora.dev/docs/concepts/hathora-entities#lobby) using `appId` and `roomId`.
* [listActivePublicLobbies](#listactivepubliclobbies) - Get all active [lobbies](https://hathora.dev/docs/concepts/hathora-entities#lobby) for a given [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Filter the array by optionally passing in a `region`.
* [setLobbyState](#setlobbystate) - Set the state of a [lobby](https://hathora.dev/docs/concepts/hathora-entities#lobby) using `appId` and `roomId`. State is intended to be set by the server and must be smaller than 1MB.

## createLobby

Create a new [lobby](https://hathora.dev/docs/concepts/hathora-entities#lobby) for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.CreateLobbyRequest;
import dev.hathora.cloud_api.models.operations.CreateLobbyResponse;
import dev.hathora.cloud_api.models.shared.CreateLobbyRequest;
import dev.hathora.cloud_api.models.shared.LobbyInitialConfig;
import dev.hathora.cloud_api.models.shared.LobbyVisibility;
import dev.hathora.cloud_api.models.shared.Region;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            CreateLobbyRequest req = new CreateLobbyRequest(                new CreateLobbyRequest(                new LobbyInitialConfig();, Region.TOKYO, LobbyVisibility.PRIVATE_);, "app-af469a92-5b45-4565-b3c4-b79878de67d2") {{
                roomId = "2swovpy1fnunu";
            }};            

            CreateLobbyResponse res = sdk.lobbyV2.createLobby(req);

            if (res.lobby != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [dev.hathora.cloud_api.models.operations.CreateLobbyRequest](../../models/operations/CreateLobbyRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[dev.hathora.cloud_api.models.operations.CreateLobbyResponse](../../models/operations/CreateLobbyResponse.md)**


## ~~createLocalLobby~~

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.CreateLocalLobbyRequest;
import dev.hathora.cloud_api.models.operations.CreateLocalLobbyRequestBody;
import dev.hathora.cloud_api.models.operations.CreateLocalLobbyResponse;
import dev.hathora.cloud_api.models.shared.LobbyInitialConfig;
import dev.hathora.cloud_api.models.shared.Region;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            CreateLocalLobbyRequest req = new CreateLocalLobbyRequest(                new CreateLocalLobbyRequestBody(                new LobbyInitialConfig();, Region.WASHINGTON_DC);, "app-af469a92-5b45-4565-b3c4-b79878de67d2") {{
                roomId = "2swovpy1fnunu";
            }};            

            CreateLocalLobbyResponse res = sdk.lobbyV2.createLocalLobby(req);

            if (res.lobby != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [dev.hathora.cloud_api.models.operations.CreateLocalLobbyRequest](../../models/operations/CreateLocalLobbyRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[dev.hathora.cloud_api.models.operations.CreateLocalLobbyResponse](../../models/operations/CreateLocalLobbyResponse.md)**


## ~~createPrivateLobby~~

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.CreatePrivateLobbyRequest;
import dev.hathora.cloud_api.models.operations.CreatePrivateLobbyRequestBody;
import dev.hathora.cloud_api.models.operations.CreatePrivateLobbyResponse;
import dev.hathora.cloud_api.models.shared.LobbyInitialConfig;
import dev.hathora.cloud_api.models.shared.Region;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            CreatePrivateLobbyRequest req = new CreatePrivateLobbyRequest(                new CreatePrivateLobbyRequestBody(                new LobbyInitialConfig();, Region.SYDNEY);, "app-af469a92-5b45-4565-b3c4-b79878de67d2") {{
                roomId = "2swovpy1fnunu";
            }};            

            CreatePrivateLobbyResponse res = sdk.lobbyV2.createPrivateLobby(req);

            if (res.lobby != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [dev.hathora.cloud_api.models.operations.CreatePrivateLobbyRequest](../../models/operations/CreatePrivateLobbyRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[dev.hathora.cloud_api.models.operations.CreatePrivateLobbyResponse](../../models/operations/CreatePrivateLobbyResponse.md)**


## ~~createPublicLobby~~

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.CreatePublicLobbyRequest;
import dev.hathora.cloud_api.models.operations.CreatePublicLobbyRequestBody;
import dev.hathora.cloud_api.models.operations.CreatePublicLobbyResponse;
import dev.hathora.cloud_api.models.shared.LobbyInitialConfig;
import dev.hathora.cloud_api.models.shared.Region;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            CreatePublicLobbyRequest req = new CreatePublicLobbyRequest(                new CreatePublicLobbyRequestBody(                new LobbyInitialConfig();, Region.SYDNEY);, "app-af469a92-5b45-4565-b3c4-b79878de67d2") {{
                roomId = "2swovpy1fnunu";
            }};            

            CreatePublicLobbyResponse res = sdk.lobbyV2.createPublicLobby(req);

            if (res.lobby != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [dev.hathora.cloud_api.models.operations.CreatePublicLobbyRequest](../../models/operations/CreatePublicLobbyRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[dev.hathora.cloud_api.models.operations.CreatePublicLobbyResponse](../../models/operations/CreatePublicLobbyResponse.md)**


## getLobbyInfo

Get details for an existing [lobby](https://hathora.dev/docs/concepts/hathora-entities#lobby) using `appId` and `roomId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.GetLobbyInfoRequest;
import dev.hathora.cloud_api.models.operations.GetLobbyInfoResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetLobbyInfoRequest req = new GetLobbyInfoRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");            

            GetLobbyInfoResponse res = sdk.lobbyV2.getLobbyInfo(req);

            if (res.lobby != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [dev.hathora.cloud_api.models.operations.GetLobbyInfoRequest](../../models/operations/GetLobbyInfoRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[dev.hathora.cloud_api.models.operations.GetLobbyInfoResponse](../../models/operations/GetLobbyInfoResponse.md)**


## listActivePublicLobbies

Get all active [lobbies](https://hathora.dev/docs/concepts/hathora-entities#lobby) for a given [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Filter the array by optionally passing in a `region`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesRequest;
import dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesResponse;
import dev.hathora.cloud_api.models.shared.Region;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            ListActivePublicLobbiesRequest req = new ListActivePublicLobbiesRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2") {{
                region = Region.SAO_PAULO;
            }};            

            ListActivePublicLobbiesResponse res = sdk.lobbyV2.listActivePublicLobbies(req);

            if (res.lobbies != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                           | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                           | [dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesRequest](../../models/operations/ListActivePublicLobbiesRequest.md) | :heavy_check_mark:                                                                                                                  | The request object to use for the request.                                                                                          |


### Response

**[dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesResponse](../../models/operations/ListActivePublicLobbiesResponse.md)**


## setLobbyState

Set the state of a [lobby](https://hathora.dev/docs/concepts/hathora-entities#lobby) using `appId` and `roomId`. State is intended to be set by the server and must be smaller than 1MB.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.SetLobbyStateRequest;
import dev.hathora.cloud_api.models.operations.SetLobbyStateResponse;
import dev.hathora.cloud_api.models.operations.SetLobbyStateSecurity;
import dev.hathora.cloud_api.models.shared.SetLobbyStateRequest;
import dev.hathora.cloud_api.models.shared.SetLobbyStateRequestState;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            SetLobbyStateRequest req = new SetLobbyStateRequest(                new SetLobbyStateRequest(                new SetLobbyStateRequestState(););, "app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");            

            SetLobbyStateResponse res = sdk.lobbyV2.setLobbyState(req, new SetLobbyStateSecurity("molestiae") {{
                auth0 = "";
            }});

            if (res.lobby != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [dev.hathora.cloud_api.models.operations.SetLobbyStateRequest](../../models/operations/SetLobbyStateRequest.md)   | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |
| `security`                                                                                                        | [dev.hathora.cloud_api.models.operations.SetLobbyStateSecurity](../../models/operations/SetLobbyStateSecurity.md) | :heavy_check_mark:                                                                                                | The security requirements to use for the request.                                                                 |


### Response

**[dev.hathora.cloud_api.models.operations.SetLobbyStateResponse](../../models/operations/SetLobbyStateResponse.md)**

