# LobbyV1

### Available Operations

* [~~createPrivateLobbyDeprecated~~](#createprivatelobbydeprecated) - :warning: **Deprecated**
* [~~createPublicLobbyDeprecated~~](#createpubliclobbydeprecated) - :warning: **Deprecated**
* [~~listActivePublicLobbiesDeprecated~~](#listactivepubliclobbiesdeprecated) - :warning: **Deprecated**

## ~~createPrivateLobbyDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedResponse;
import dev.hathora.cloud_api.models.shared.Region;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("esse") {{
                    auth0 = "";
                }})
                .build();

            CreatePrivateLobbyDeprecatedResponse res = sdk.lobbyV1.createPrivateLobbyDeprecated("app-af469a92-5b45-4565-b3c4-b79878de67d2", false, Region.MUMBAI);

            if (res.roomId != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 | Example                                                                     |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `appId`                                                                     | *String*                                                                    | :heavy_check_mark:                                                          | N/A                                                                         | app-af469a92-5b45-4565-b3c4-b79878de67d2                                    |
| `local`                                                                     | *Boolean*                                                                   | :heavy_minus_sign:                                                          | N/A                                                                         |                                                                             |
| `region`                                                                    | [dev.hathora.cloud_api.models.shared.Region](../../models/shared/Region.md) | :heavy_minus_sign:                                                          | Available regions to request a game server.                                 |                                                                             |


### Response

**[dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedResponse](../../models/operations/CreatePrivateLobbyDeprecatedResponse.md)**


## ~~createPublicLobbyDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedResponse;
import dev.hathora.cloud_api.models.shared.Region;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("porro") {{
                    auth0 = "";
                }})
                .build();

            CreatePublicLobbyDeprecatedResponse res = sdk.lobbyV1.createPublicLobbyDeprecated("app-af469a92-5b45-4565-b3c4-b79878de67d2", false, Region.SINGAPORE);

            if (res.roomId != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 | Example                                                                     |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `appId`                                                                     | *String*                                                                    | :heavy_check_mark:                                                          | N/A                                                                         | app-af469a92-5b45-4565-b3c4-b79878de67d2                                    |
| `local`                                                                     | *Boolean*                                                                   | :heavy_minus_sign:                                                          | N/A                                                                         |                                                                             |
| `region`                                                                    | [dev.hathora.cloud_api.models.shared.Region](../../models/shared/Region.md) | :heavy_minus_sign:                                                          | Available regions to request a game server.                                 |                                                                             |


### Response

**[dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedResponse](../../models/operations/CreatePublicLobbyDeprecatedResponse.md)**


## ~~listActivePublicLobbiesDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedResponse;
import dev.hathora.cloud_api.models.shared.Region;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("dicta") {{
                    auth0 = "";
                }})
                .build();

            ListActivePublicLobbiesDeprecatedResponse res = sdk.lobbyV1.listActivePublicLobbiesDeprecated("app-af469a92-5b45-4565-b3c4-b79878de67d2", false, Region.TOKYO);

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

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 | Example                                                                     |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `appId`                                                                     | *String*                                                                    | :heavy_check_mark:                                                          | N/A                                                                         | app-af469a92-5b45-4565-b3c4-b79878de67d2                                    |
| `local`                                                                     | *Boolean*                                                                   | :heavy_minus_sign:                                                          | N/A                                                                         |                                                                             |
| `region`                                                                    | [dev.hathora.cloud_api.models.shared.Region](../../models/shared/Region.md) | :heavy_minus_sign:                                                          | Available regions to request a game server.                                 |                                                                             |


### Response

**[dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedResponse](../../models/operations/ListActivePublicLobbiesDeprecatedResponse.md)**

