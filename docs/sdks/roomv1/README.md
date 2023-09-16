# RoomV1

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
import dev.hathora.cloud_api.models.operations.CreateRoomDeprecatedSecurity;
import dev.hathora.cloud_api.models.shared.CreateRoomRequest;
import dev.hathora.cloud_api.models.shared.Region;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .build();

            CreateRoomDeprecatedResponse res = sdk.roomV1.createRoomDeprecated(new CreateRoomDeprecatedSecurity("ad") {{
                auth0 = "";
            }}, new CreateRoomRequest(Region.WASHINGTON_DC) {{
                region = Region.SINGAPORE;
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

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     | Example                                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                      | [dev.hathora.cloud_api.models.operations.CreateRoomDeprecatedSecurity](../../models/operations/CreateRoomDeprecatedSecurity.md) | :heavy_check_mark:                                                                                                              | The security requirements to use for the request.                                                                               |                                                                                                                                 |
| `createRoomRequest`                                                                                                             | [dev.hathora.cloud_api.models.shared.CreateRoomRequest](../../models/shared/CreateRoomRequest.md)                               | :heavy_check_mark:                                                                                                              | N/A                                                                                                                             |                                                                                                                                 |
| `appId`                                                                                                                         | *String*                                                                                                                        | :heavy_check_mark:                                                                                                              | N/A                                                                                                                             | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                        |
| `roomId`                                                                                                                        | *String*                                                                                                                        | :heavy_minus_sign:                                                                                                              | N/A                                                                                                                             | 2swovpy1fnunu                                                                                                                   |


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
import dev.hathora.cloud_api.models.operations.DestroyRoomDeprecatedSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .build();

            DestroyRoomDeprecatedResponse res = sdk.roomV1.destroyRoomDeprecated(new DestroyRoomDeprecatedSecurity("iste") {{
                auth0 = "";
            }}, "app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");

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

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       | Example                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                        | [dev.hathora.cloud_api.models.operations.DestroyRoomDeprecatedSecurity](../../models/operations/DestroyRoomDeprecatedSecurity.md) | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |                                                                                                                                   |
| `appId`                                                                                                                           | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                          |
| `roomId`                                                                                                                          | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               | 2swovpy1fnunu                                                                                                                     |


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
import dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessDeprecatedSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .build();

            GetActiveRoomsForProcessDeprecatedResponse res = sdk.roomV1.getActiveRoomsForProcessDeprecated(new GetActiveRoomsForProcessDeprecatedSecurity("dolor") {{
                auth0 = "";
            }}, "app-af469a92-5b45-4565-b3c4-b79878de67d2", "cbfcddd2-0006-43ae-996c-995fff7bed2e");

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

| Parameter                                                                                                                                                   | Type                                                                                                                                                        | Required                                                                                                                                                    | Description                                                                                                                                                 | Example                                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                                  | [dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessDeprecatedSecurity](../../models/operations/GetActiveRoomsForProcessDeprecatedSecurity.md) | :heavy_check_mark:                                                                                                                                          | The security requirements to use for the request.                                                                                                           |                                                                                                                                                             |
| `appId`                                                                                                                                                     | *String*                                                                                                                                                    | :heavy_check_mark:                                                                                                                                          | N/A                                                                                                                                                         | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                                                    |
| `processId`                                                                                                                                                 | *String*                                                                                                                                                    | :heavy_check_mark:                                                                                                                                          | N/A                                                                                                                                                         | cbfcddd2-0006-43ae-996c-995fff7bed2e                                                                                                                        |


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

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
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
import dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessDeprecatedSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .build();

            GetInactiveRoomsForProcessDeprecatedResponse res = sdk.roomV1.getInactiveRoomsForProcessDeprecated(new GetInactiveRoomsForProcessDeprecatedSecurity("natus") {{
                auth0 = "";
            }}, "app-af469a92-5b45-4565-b3c4-b79878de67d2", "cbfcddd2-0006-43ae-996c-995fff7bed2e");

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

| Parameter                                                                                                                                                       | Type                                                                                                                                                            | Required                                                                                                                                                        | Description                                                                                                                                                     | Example                                                                                                                                                         |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                                      | [dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessDeprecatedSecurity](../../models/operations/GetInactiveRoomsForProcessDeprecatedSecurity.md) | :heavy_check_mark:                                                                                                                                              | The security requirements to use for the request.                                                                                                               |                                                                                                                                                                 |
| `appId`                                                                                                                                                         | *String*                                                                                                                                                        | :heavy_check_mark:                                                                                                                                              | N/A                                                                                                                                                             | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                                                        |
| `processId`                                                                                                                                                     | *String*                                                                                                                                                        | :heavy_check_mark:                                                                                                                                              | N/A                                                                                                                                                             | cbfcddd2-0006-43ae-996c-995fff7bed2e                                                                                                                            |


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
import dev.hathora.cloud_api.models.operations.GetRoomInfoDeprecatedSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .build();

            GetRoomInfoDeprecatedResponse res = sdk.roomV1.getRoomInfoDeprecated(new GetRoomInfoDeprecatedSecurity("laboriosam") {{
                auth0 = "";
            }}, "app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");

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

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       | Example                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                        | [dev.hathora.cloud_api.models.operations.GetRoomInfoDeprecatedSecurity](../../models/operations/GetRoomInfoDeprecatedSecurity.md) | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |                                                                                                                                   |
| `appId`                                                                                                                           | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                          |
| `roomId`                                                                                                                          | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               | 2swovpy1fnunu                                                                                                                     |


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
import dev.hathora.cloud_api.models.operations.SuspendRoomDeprecatedSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .build();

            SuspendRoomDeprecatedResponse res = sdk.roomV1.suspendRoomDeprecated(new SuspendRoomDeprecatedSecurity("hic") {{
                auth0 = "";
            }}, "app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");

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

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       | Example                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                        | [dev.hathora.cloud_api.models.operations.SuspendRoomDeprecatedSecurity](../../models/operations/SuspendRoomDeprecatedSecurity.md) | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |                                                                                                                                   |
| `appId`                                                                                                                           | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                          |
| `roomId`                                                                                                                          | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               | 2swovpy1fnunu                                                                                                                     |


### Response

**[dev.hathora.cloud_api.models.operations.SuspendRoomDeprecatedResponse](../../models/operations/SuspendRoomDeprecatedResponse.md)**

