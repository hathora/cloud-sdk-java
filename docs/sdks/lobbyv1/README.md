# lobbyV1

### Available Operations

* [~~createPrivateLobbyDeprecated~~](#createprivatelobbydeprecated) - :warning: **Deprecated**
* [~~createPublicLobbyDeprecated~~](#createpubliclobbydeprecated) - :warning: **Deprecated**
* [~~listActivePublicLobbiesDeprecated~~](#listactivepubliclobbiesdeprecated) - :warning: **Deprecated**

## ~~createPrivateLobbyDeprecated~~

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedResponse;
import dev.hathora.cloud_api.models.shared.Region;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            CreatePrivateLobbyDeprecatedRequest req = new CreatePrivateLobbyDeprecatedRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2") {{
                local = false;
                region = Region.LONDON;
            }};            

            CreatePrivateLobbyDeprecatedResponse res = sdk.lobbyV1.createPrivateLobbyDeprecated(req);

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

| Parameter                                                                                                                                     | Type                                                                                                                                          | Required                                                                                                                                      | Description                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                     | [dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedRequest](../../models/operations/CreatePrivateLobbyDeprecatedRequest.md) | :heavy_check_mark:                                                                                                                            | The request object to use for the request.                                                                                                    |


### Response

**[dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedResponse](../../models/operations/CreatePrivateLobbyDeprecatedResponse.md)**


## ~~createPublicLobbyDeprecated~~

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedResponse;
import dev.hathora.cloud_api.models.shared.Region;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            CreatePublicLobbyDeprecatedRequest req = new CreatePublicLobbyDeprecatedRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2") {{
                local = false;
                region = Region.SYDNEY;
            }};            

            CreatePublicLobbyDeprecatedResponse res = sdk.lobbyV1.createPublicLobbyDeprecated(req);

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

| Parameter                                                                                                                                   | Type                                                                                                                                        | Required                                                                                                                                    | Description                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                   | [dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedRequest](../../models/operations/CreatePublicLobbyDeprecatedRequest.md) | :heavy_check_mark:                                                                                                                          | The request object to use for the request.                                                                                                  |


### Response

**[dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedResponse](../../models/operations/CreatePublicLobbyDeprecatedResponse.md)**


## ~~listActivePublicLobbiesDeprecated~~

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedResponse;
import dev.hathora.cloud_api.models.shared.Region;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            ListActivePublicLobbiesDeprecatedRequest req = new ListActivePublicLobbiesDeprecatedRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2") {{
                local = false;
                region = Region.SAO_PAULO;
            }};            

            ListActivePublicLobbiesDeprecatedResponse res = sdk.lobbyV1.listActivePublicLobbiesDeprecated(req);

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

| Parameter                                                                                                                                               | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                               | [dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedRequest](../../models/operations/ListActivePublicLobbiesDeprecatedRequest.md) | :heavy_check_mark:                                                                                                                                      | The request object to use for the request.                                                                                                              |


### Response

**[dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedResponse](../../models/operations/ListActivePublicLobbiesDeprecatedResponse.md)**

