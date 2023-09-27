# RoomV1
(*roomV1*)

### Available Operations

* [~~createRoomDeprecated~~](#createroomdeprecated) - :warning: **Deprecated**
* [~~destroyRoomDeprecated~~](#destroyroomdeprecated) - :warning: **Deprecated**
* [~~getActiveRoomsForProcessDeprecated~~](#getactiveroomsforprocessdeprecated) - :warning: **Deprecated**
* [~~getConnectionInfoDeprecated~~](#getconnectioninfodeprecated) - :warning: **Deprecated**
* [~~getInactiveRoomsForProcessDeprecated~~](#getinactiveroomsforprocessdeprecated) - :warning: **Deprecated**
* [~~getRoomInfoDeprecated~~](#getroominfodeprecated) - :warning: **Deprecated**
* [~~suspendRoomDeprecated~~](#suspendroomdeprecated) - :warning: **Deprecated**

## ~~createRoomDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.CreateRoomDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.CreateRoomDeprecatedResponse;
import dev.hathora.cloud_api.models.shared.CreateRoomRequest;
import dev.hathora.cloud_api.models.shared.Region;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("architecto") {{
                    auth0 = "";
                }})
                .build();

            CreateRoomDeprecatedResponse res = sdk.roomV1.createRoomDeprecated(new CreateRoomRequest(Region.SAO_PAULO) {{
                region = Region.SEATTLE;
            }}, "app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");

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

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       | Example                                                                                           |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `createRoomRequest`                                                                               | [dev.hathora.cloud_api.models.shared.CreateRoomRequest](../../models/shared/CreateRoomRequest.md) | :heavy_check_mark:                                                                                | N/A                                                                                               |                                                                                                   |
| `appId`                                                                                           | *String*                                                                                          | :heavy_check_mark:                                                                                | N/A                                                                                               | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                          |
| `roomId`                                                                                          | *String*                                                                                          | :heavy_minus_sign:                                                                                | N/A                                                                                               | 2swovpy1fnunu                                                                                     |


### Response

**[dev.hathora.cloud_api.models.operations.CreateRoomDeprecatedResponse](../../models/operations/CreateRoomDeprecatedResponse.md)**


## ~~destroyRoomDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.DestroyRoomDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.DestroyRoomDeprecatedResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("est") {{
                    auth0 = "";
                }})
                .build();

            DestroyRoomDeprecatedResponse res = sdk.roomV1.destroyRoomDeprecated("app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");

            if (res.statusCode == 200) {
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

**[dev.hathora.cloud_api.models.operations.DestroyRoomDeprecatedResponse](../../models/operations/DestroyRoomDeprecatedResponse.md)**


## ~~getActiveRoomsForProcessDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessDeprecatedResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("mollitia") {{
                    auth0 = "";
                }})
                .build();

            GetActiveRoomsForProcessDeprecatedResponse res = sdk.roomV1.getActiveRoomsForProcessDeprecated("app-af469a92-5b45-4565-b3c4-b79878de67d2", "cbfcddd2-0006-43ae-996c-995fff7bed2e");

            if (res.roomWithoutAllocations != null) {
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
| `processId`                              | *String*                                 | :heavy_check_mark:                       | N/A                                      | cbfcddd2-0006-43ae-996c-995fff7bed2e     |


### Response

**[dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessDeprecatedResponse](../../models/operations/GetActiveRoomsForProcessDeprecatedResponse.md)**


## ~~getConnectionInfoDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.GetConnectionInfoDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.GetConnectionInfoDeprecatedResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("laborum") {{
                    auth0 = "";
                }})
                .build();

            GetConnectionInfoDeprecatedResponse res = sdk.roomV1.getConnectionInfoDeprecated("app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");

            if (res.connectionInfo != null) {
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

**[dev.hathora.cloud_api.models.operations.GetConnectionInfoDeprecatedResponse](../../models/operations/GetConnectionInfoDeprecatedResponse.md)**


## ~~getInactiveRoomsForProcessDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessDeprecatedResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("dolores") {{
                    auth0 = "";
                }})
                .build();

            GetInactiveRoomsForProcessDeprecatedResponse res = sdk.roomV1.getInactiveRoomsForProcessDeprecated("app-af469a92-5b45-4565-b3c4-b79878de67d2", "cbfcddd2-0006-43ae-996c-995fff7bed2e");

            if (res.roomWithoutAllocations != null) {
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
| `processId`                              | *String*                                 | :heavy_check_mark:                       | N/A                                      | cbfcddd2-0006-43ae-996c-995fff7bed2e     |


### Response

**[dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessDeprecatedResponse](../../models/operations/GetInactiveRoomsForProcessDeprecatedResponse.md)**


## ~~getRoomInfoDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.GetRoomInfoDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.GetRoomInfoDeprecatedResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("dolorem") {{
                    auth0 = "";
                }})
                .build();

            GetRoomInfoDeprecatedResponse res = sdk.roomV1.getRoomInfoDeprecated("app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");

            if (res.room != null) {
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

**[dev.hathora.cloud_api.models.operations.GetRoomInfoDeprecatedResponse](../../models/operations/GetRoomInfoDeprecatedResponse.md)**


## ~~suspendRoomDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.SuspendRoomDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.SuspendRoomDeprecatedResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("corporis") {{
                    auth0 = "";
                }})
                .build();

            SuspendRoomDeprecatedResponse res = sdk.roomV1.suspendRoomDeprecated("app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");

            if (res.statusCode == 200) {
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

**[dev.hathora.cloud_api.models.operations.SuspendRoomDeprecatedResponse](../../models/operations/SuspendRoomDeprecatedResponse.md)**

