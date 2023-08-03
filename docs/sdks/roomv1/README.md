# roomV1

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

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.CreateRoomDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.CreateRoomDeprecatedResponse;
import dev.hathora.cloud_api.models.operations.CreateRoomDeprecatedSecurity;
import dev.hathora.cloud_api.models.shared.CreateRoomRequest;
import dev.hathora.cloud_api.models.shared.Region;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            CreateRoomDeprecatedRequest req = new CreateRoomDeprecatedRequest(                new CreateRoomRequest(Region.TOKYO);, "app-af469a92-5b45-4565-b3c4-b79878de67d2") {{
                roomId = "2swovpy1fnunu";
            }};            

            CreateRoomDeprecatedResponse res = sdk.roomV1.createRoomDeprecated(req, new CreateRoomDeprecatedSecurity("esse") {{
                auth0 = "";
            }});

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

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                       | [dev.hathora.cloud_api.models.operations.CreateRoomDeprecatedRequest](../../models/operations/CreateRoomDeprecatedRequest.md)   | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |
| `security`                                                                                                                      | [dev.hathora.cloud_api.models.operations.CreateRoomDeprecatedSecurity](../../models/operations/CreateRoomDeprecatedSecurity.md) | :heavy_check_mark:                                                                                                              | The security requirements to use for the request.                                                                               |


### Response

**[dev.hathora.cloud_api.models.operations.CreateRoomDeprecatedResponse](../../models/operations/CreateRoomDeprecatedResponse.md)**


## ~~destroyRoomDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.DestroyRoomDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.DestroyRoomDeprecatedResponse;
import dev.hathora.cloud_api.models.operations.DestroyRoomDeprecatedSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            DestroyRoomDeprecatedRequest req = new DestroyRoomDeprecatedRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");            

            DestroyRoomDeprecatedResponse res = sdk.roomV1.destroyRoomDeprecated(req, new DestroyRoomDeprecatedSecurity("ipsum") {{
                auth0 = "";
            }});

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

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [dev.hathora.cloud_api.models.operations.DestroyRoomDeprecatedRequest](../../models/operations/DestroyRoomDeprecatedRequest.md)   | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |
| `security`                                                                                                                        | [dev.hathora.cloud_api.models.operations.DestroyRoomDeprecatedSecurity](../../models/operations/DestroyRoomDeprecatedSecurity.md) | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |


### Response

**[dev.hathora.cloud_api.models.operations.DestroyRoomDeprecatedResponse](../../models/operations/DestroyRoomDeprecatedResponse.md)**


## ~~getActiveRoomsForProcessDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessDeprecatedResponse;
import dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessDeprecatedSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetActiveRoomsForProcessDeprecatedRequest req = new GetActiveRoomsForProcessDeprecatedRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2", "cbfcddd2-0006-43ae-996c-995fff7bed2e");            

            GetActiveRoomsForProcessDeprecatedResponse res = sdk.roomV1.getActiveRoomsForProcessDeprecated(req, new GetActiveRoomsForProcessDeprecatedSecurity("excepturi") {{
                auth0 = "";
            }});

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

| Parameter                                                                                                                                                   | Type                                                                                                                                                        | Required                                                                                                                                                    | Description                                                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                   | [dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessDeprecatedRequest](../../models/operations/GetActiveRoomsForProcessDeprecatedRequest.md)   | :heavy_check_mark:                                                                                                                                          | The request object to use for the request.                                                                                                                  |
| `security`                                                                                                                                                  | [dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessDeprecatedSecurity](../../models/operations/GetActiveRoomsForProcessDeprecatedSecurity.md) | :heavy_check_mark:                                                                                                                                          | The security requirements to use for the request.                                                                                                           |


### Response

**[dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessDeprecatedResponse](../../models/operations/GetActiveRoomsForProcessDeprecatedResponse.md)**


## ~~getConnectionInfoDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.GetConnectionInfoDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.GetConnectionInfoDeprecatedResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetConnectionInfoDeprecatedRequest req = new GetConnectionInfoDeprecatedRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");            

            GetConnectionInfoDeprecatedResponse res = sdk.roomV1.getConnectionInfoDeprecated(req);

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

| Parameter                                                                                                                                   | Type                                                                                                                                        | Required                                                                                                                                    | Description                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                   | [dev.hathora.cloud_api.models.operations.GetConnectionInfoDeprecatedRequest](../../models/operations/GetConnectionInfoDeprecatedRequest.md) | :heavy_check_mark:                                                                                                                          | The request object to use for the request.                                                                                                  |


### Response

**[dev.hathora.cloud_api.models.operations.GetConnectionInfoDeprecatedResponse](../../models/operations/GetConnectionInfoDeprecatedResponse.md)**


## ~~getInactiveRoomsForProcessDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessDeprecatedResponse;
import dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessDeprecatedSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetInactiveRoomsForProcessDeprecatedRequest req = new GetInactiveRoomsForProcessDeprecatedRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2", "cbfcddd2-0006-43ae-996c-995fff7bed2e");            

            GetInactiveRoomsForProcessDeprecatedResponse res = sdk.roomV1.getInactiveRoomsForProcessDeprecated(req, new GetInactiveRoomsForProcessDeprecatedSecurity("aspernatur") {{
                auth0 = "";
            }});

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

| Parameter                                                                                                                                                       | Type                                                                                                                                                            | Required                                                                                                                                                        | Description                                                                                                                                                     |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                       | [dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessDeprecatedRequest](../../models/operations/GetInactiveRoomsForProcessDeprecatedRequest.md)   | :heavy_check_mark:                                                                                                                                              | The request object to use for the request.                                                                                                                      |
| `security`                                                                                                                                                      | [dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessDeprecatedSecurity](../../models/operations/GetInactiveRoomsForProcessDeprecatedSecurity.md) | :heavy_check_mark:                                                                                                                                              | The security requirements to use for the request.                                                                                                               |


### Response

**[dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessDeprecatedResponse](../../models/operations/GetInactiveRoomsForProcessDeprecatedResponse.md)**


## ~~getRoomInfoDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.GetRoomInfoDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.GetRoomInfoDeprecatedResponse;
import dev.hathora.cloud_api.models.operations.GetRoomInfoDeprecatedSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetRoomInfoDeprecatedRequest req = new GetRoomInfoDeprecatedRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");            

            GetRoomInfoDeprecatedResponse res = sdk.roomV1.getRoomInfoDeprecated(req, new GetRoomInfoDeprecatedSecurity("perferendis") {{
                auth0 = "";
            }});

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

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [dev.hathora.cloud_api.models.operations.GetRoomInfoDeprecatedRequest](../../models/operations/GetRoomInfoDeprecatedRequest.md)   | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |
| `security`                                                                                                                        | [dev.hathora.cloud_api.models.operations.GetRoomInfoDeprecatedSecurity](../../models/operations/GetRoomInfoDeprecatedSecurity.md) | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |


### Response

**[dev.hathora.cloud_api.models.operations.GetRoomInfoDeprecatedResponse](../../models/operations/GetRoomInfoDeprecatedResponse.md)**


## ~~suspendRoomDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.SuspendRoomDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.SuspendRoomDeprecatedResponse;
import dev.hathora.cloud_api.models.operations.SuspendRoomDeprecatedSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            SuspendRoomDeprecatedRequest req = new SuspendRoomDeprecatedRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");            

            SuspendRoomDeprecatedResponse res = sdk.roomV1.suspendRoomDeprecated(req, new SuspendRoomDeprecatedSecurity("ad") {{
                auth0 = "";
            }});

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

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [dev.hathora.cloud_api.models.operations.SuspendRoomDeprecatedRequest](../../models/operations/SuspendRoomDeprecatedRequest.md)   | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |
| `security`                                                                                                                        | [dev.hathora.cloud_api.models.operations.SuspendRoomDeprecatedSecurity](../../models/operations/SuspendRoomDeprecatedSecurity.md) | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |


### Response

**[dev.hathora.cloud_api.models.operations.SuspendRoomDeprecatedResponse](../../models/operations/SuspendRoomDeprecatedResponse.md)**

