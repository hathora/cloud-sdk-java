# LobbyV2
(*lobbyV2*)

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

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.CreateLobbyRequest;
import dev.hathora.cloud_api.models.operations.CreateLobbyResponse;
import dev.hathora.cloud_api.models.shared.CreateLobbyRequest;
import dev.hathora.cloud_api.models.shared.LobbyInitialConfig;
import dev.hathora.cloud_api.models.shared.LobbyVisibility;
import dev.hathora.cloud_api.models.shared.Region;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("officia") {{
                    auth0 = "";
                }})
                .build();

            CreateLobbyResponse res = sdk.lobbyV2.createLobby(new CreateLobbyRequest(                new LobbyInitialConfig();, Region.WASHINGTON_DC, LobbyVisibility.PRIVATE_) {{
                initialConfig = new LobbyInitialConfig() {{}};
                region = Region.MUMBAI;
                visibility = LobbyVisibility.PRIVATE_;
            }}, "app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");

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

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         | Example                                                                                             |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `createLobbyRequest`                                                                                | [dev.hathora.cloud_api.models.shared.CreateLobbyRequest](../../models/shared/CreateLobbyRequest.md) | :heavy_check_mark:                                                                                  | N/A                                                                                                 |                                                                                                     |
| `appId`                                                                                             | *String*                                                                                            | :heavy_check_mark:                                                                                  | N/A                                                                                                 | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                            |
| `roomId`                                                                                            | *String*                                                                                            | :heavy_minus_sign:                                                                                  | N/A                                                                                                 | 2swovpy1fnunu                                                                                       |


### Response

**[dev.hathora.cloud_api.models.operations.CreateLobbyResponse](../../models/operations/CreateLobbyResponse.md)**


## ~~createLocalLobby~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.CreateLocalLobbyRequest;
import dev.hathora.cloud_api.models.operations.CreateLocalLobbyRequestBody;
import dev.hathora.cloud_api.models.operations.CreateLocalLobbyResponse;
import dev.hathora.cloud_api.models.shared.LobbyInitialConfig;
import dev.hathora.cloud_api.models.shared.Region;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("deleniti") {{
                    auth0 = "";
                }})
                .build();

            CreateLocalLobbyResponse res = sdk.lobbyV2.createLocalLobby(new CreateLocalLobbyRequestBody(                new LobbyInitialConfig();, Region.TOKYO) {{
                initialConfig = new LobbyInitialConfig() {{}};
                region = Region.SAO_PAULO;
            }}, "app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");

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

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   | Example                                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                 | [dev.hathora.cloud_api.models.operations.CreateLocalLobbyRequestBody](../../models/operations/CreateLocalLobbyRequestBody.md) | :heavy_check_mark:                                                                                                            | N/A                                                                                                                           |                                                                                                                               |
| `appId`                                                                                                                       | *String*                                                                                                                      | :heavy_check_mark:                                                                                                            | N/A                                                                                                                           | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                      |
| `roomId`                                                                                                                      | *String*                                                                                                                      | :heavy_minus_sign:                                                                                                            | N/A                                                                                                                           | 2swovpy1fnunu                                                                                                                 |


### Response

**[dev.hathora.cloud_api.models.operations.CreateLocalLobbyResponse](../../models/operations/CreateLocalLobbyResponse.md)**


## ~~createPrivateLobby~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.CreatePrivateLobbyRequest;
import dev.hathora.cloud_api.models.operations.CreatePrivateLobbyRequestBody;
import dev.hathora.cloud_api.models.operations.CreatePrivateLobbyResponse;
import dev.hathora.cloud_api.models.shared.LobbyInitialConfig;
import dev.hathora.cloud_api.models.shared.Region;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("totam") {{
                    auth0 = "";
                }})
                .build();

            CreatePrivateLobbyResponse res = sdk.lobbyV2.createPrivateLobby(new CreatePrivateLobbyRequestBody(                new LobbyInitialConfig();, Region.FRANKFURT) {{
                initialConfig = new LobbyInitialConfig() {{}};
                region = Region.WASHINGTON_DC;
            }}, "app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");

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

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       | Example                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                     | [dev.hathora.cloud_api.models.operations.CreatePrivateLobbyRequestBody](../../models/operations/CreatePrivateLobbyRequestBody.md) | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               |                                                                                                                                   |
| `appId`                                                                                                                           | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                          |
| `roomId`                                                                                                                          | *String*                                                                                                                          | :heavy_minus_sign:                                                                                                                | N/A                                                                                                                               | 2swovpy1fnunu                                                                                                                     |


### Response

**[dev.hathora.cloud_api.models.operations.CreatePrivateLobbyResponse](../../models/operations/CreatePrivateLobbyResponse.md)**


## ~~createPublicLobby~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.CreatePublicLobbyRequest;
import dev.hathora.cloud_api.models.operations.CreatePublicLobbyRequestBody;
import dev.hathora.cloud_api.models.operations.CreatePublicLobbyResponse;
import dev.hathora.cloud_api.models.shared.LobbyInitialConfig;
import dev.hathora.cloud_api.models.shared.Region;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("molestiae") {{
                    auth0 = "";
                }})
                .build();

            CreatePublicLobbyResponse res = sdk.lobbyV2.createPublicLobby(new CreatePublicLobbyRequestBody(                new LobbyInitialConfig();, Region.WASHINGTON_DC) {{
                initialConfig = new LobbyInitialConfig() {{}};
                region = Region.CHICAGO;
            }}, "app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");

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

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     | Example                                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                   | [dev.hathora.cloud_api.models.operations.CreatePublicLobbyRequestBody](../../models/operations/CreatePublicLobbyRequestBody.md) | :heavy_check_mark:                                                                                                              | N/A                                                                                                                             |                                                                                                                                 |
| `appId`                                                                                                                         | *String*                                                                                                                        | :heavy_check_mark:                                                                                                              | N/A                                                                                                                             | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                        |
| `roomId`                                                                                                                        | *String*                                                                                                                        | :heavy_minus_sign:                                                                                                              | N/A                                                                                                                             | 2swovpy1fnunu                                                                                                                   |


### Response

**[dev.hathora.cloud_api.models.operations.CreatePublicLobbyResponse](../../models/operations/CreatePublicLobbyResponse.md)**


## getLobbyInfo

Get details for an existing [lobby](https://hathora.dev/docs/concepts/hathora-entities#lobby) using `appId` and `roomId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.GetLobbyInfoRequest;
import dev.hathora.cloud_api.models.operations.GetLobbyInfoResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("impedit") {{
                    auth0 = "";
                }})
                .build();

            GetLobbyInfoResponse res = sdk.lobbyV2.getLobbyInfo("app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");

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

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *String*                                 | :heavy_check_mark:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `roomId`                                 | *String*                                 | :heavy_check_mark:                       | N/A                                      | 2swovpy1fnunu                            |


### Response

**[dev.hathora.cloud_api.models.operations.GetLobbyInfoResponse](../../models/operations/GetLobbyInfoResponse.md)**


## listActivePublicLobbies

Get all active [lobbies](https://hathora.dev/docs/concepts/hathora-entities#lobby) for a given [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Filter the array by optionally passing in a `region`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesRequest;
import dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesResponse;
import dev.hathora.cloud_api.models.shared.Region;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("cum") {{
                    auth0 = "";
                }})
                .build();

            ListActivePublicLobbiesResponse res = sdk.lobbyV2.listActivePublicLobbies("app-af469a92-5b45-4565-b3c4-b79878de67d2", Region.FRANKFURT);

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

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             | Example                                                                                 |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `appId`                                                                                 | *String*                                                                                | :heavy_check_mark:                                                                      | N/A                                                                                     | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                |
| `region`                                                                                | [dev.hathora.cloud_api.models.shared.Region](../../models/shared/Region.md)             | :heavy_minus_sign:                                                                      | Region to filter by. If omitted, active public lobbies in all regions will be returned. |                                                                                         |


### Response

**[dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesResponse](../../models/operations/ListActivePublicLobbiesResponse.md)**


## setLobbyState

Set the state of a [lobby](https://hathora.dev/docs/concepts/hathora-entities#lobby) using `appId` and `roomId`. State is intended to be set by the server and must be smaller than 1MB.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.SetLobbyStateRequest;
import dev.hathora.cloud_api.models.operations.SetLobbyStateResponse;
import dev.hathora.cloud_api.models.shared.Security;
import dev.hathora.cloud_api.models.shared.SetLobbyStateRequest;
import dev.hathora.cloud_api.models.shared.SetLobbyStateRequestState;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("ipsum") {{
                    auth0 = "";
                }})
                .build();

            SetLobbyStateResponse res = sdk.lobbyV2.setLobbyState(new SetLobbyStateRequest(                new SetLobbyStateRequestState();) {{
                state = new SetLobbyStateRequestState() {{}};
            }}, "app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");

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

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             | Example                                                                                                 |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `setLobbyStateRequest`                                                                                  | [dev.hathora.cloud_api.models.shared.SetLobbyStateRequest](../../models/shared/SetLobbyStateRequest.md) | :heavy_check_mark:                                                                                      | N/A                                                                                                     |                                                                                                         |
| `appId`                                                                                                 | *String*                                                                                                | :heavy_check_mark:                                                                                      | N/A                                                                                                     | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                |
| `roomId`                                                                                                | *String*                                                                                                | :heavy_check_mark:                                                                                      | N/A                                                                                                     | 2swovpy1fnunu                                                                                           |


### Response

**[dev.hathora.cloud_api.models.operations.SetLobbyStateResponse](../../models/operations/SetLobbyStateResponse.md)**

