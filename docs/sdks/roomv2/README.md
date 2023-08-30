# roomV2

## Overview

Operations to create, manage, and connect to [rooms](https://hathora.dev/docs/concepts/hathora-entities#room).

### Available Operations

* [createRoom](#createroom) - Create a new [room](https://hathora.dev/docs/concepts/hathora-entities#room) for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId` and `region`.
* [destroyRoom](#destroyroom) - Destroy a [room](https://hathora.dev/docs/concepts/hathora-entities#room) using `appId` and `roomId`. All associated metadata is deleted.
* [getActiveRoomsForProcess](#getactiveroomsforprocess) - Get all active [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) for a given [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.
* [getConnectionInfo](#getconnectioninfo) - Get connection details to a [room](https://hathora.dev/docs/concepts/hathora-entities#room) using `appId` and `roomId`. Clients can call this endpoint without authentication.
* [getInactiveRoomsForProcess](#getinactiveroomsforprocess) - Get all inactive [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) for a given [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.
* [getRoomInfo](#getroominfo) - Get details for an existing [room](https://hathora.dev/docs/concepts/hathora-entities#room) using `appId` and `roomId`.
* [suspendRoom](#suspendroom) - Suspend a [room](https://hathora.dev/docs/concepts/hathora-entities#room) using `appId` and `roomId`. The room is unallocated from the process but can be rescheduled later using the same `roomId`.

## createRoom

Create a new [room](https://hathora.dev/docs/concepts/hathora-entities#room) for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId` and `region`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.CreateRoomRequest;
import dev.hathora.cloud_api.models.operations.CreateRoomResponse;
import dev.hathora.cloud_api.models.operations.CreateRoomSecurity;
import dev.hathora.cloud_api.models.shared.CreateRoomRequest;
import dev.hathora.cloud_api.models.shared.Region;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            CreateRoomRequest req = new CreateRoomRequest(                new CreateRoomRequest(Region.SINGAPORE);, "app-af469a92-5b45-4565-b3c4-b79878de67d2") {{
                roomId = "2swovpy1fnunu";
            }};            

            CreateRoomResponse res = sdk.roomV2.createRoom(req, new CreateRoomSecurity("sed") {{
                auth0 = "";
            }});

            if (res.connectionInfoV2 != null) {
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
| `request`                                                                                                   | [dev.hathora.cloud_api.models.operations.CreateRoomRequest](../../models/operations/CreateRoomRequest.md)   | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |
| `security`                                                                                                  | [dev.hathora.cloud_api.models.operations.CreateRoomSecurity](../../models/operations/CreateRoomSecurity.md) | :heavy_check_mark:                                                                                          | The security requirements to use for the request.                                                           |


### Response

**[dev.hathora.cloud_api.models.operations.CreateRoomResponse](../../models/operations/CreateRoomResponse.md)**


## destroyRoom

Destroy a [room](https://hathora.dev/docs/concepts/hathora-entities#room) using `appId` and `roomId`. All associated metadata is deleted.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.DestroyRoomRequest;
import dev.hathora.cloud_api.models.operations.DestroyRoomResponse;
import dev.hathora.cloud_api.models.operations.DestroyRoomSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            DestroyRoomRequest req = new DestroyRoomRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");            

            DestroyRoomResponse res = sdk.roomV2.destroyRoom(req, new DestroyRoomSecurity("iste") {{
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [dev.hathora.cloud_api.models.operations.DestroyRoomRequest](../../models/operations/DestroyRoomRequest.md)   | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |
| `security`                                                                                                    | [dev.hathora.cloud_api.models.operations.DestroyRoomSecurity](../../models/operations/DestroyRoomSecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |


### Response

**[dev.hathora.cloud_api.models.operations.DestroyRoomResponse](../../models/operations/DestroyRoomResponse.md)**


## getActiveRoomsForProcess

Get all active [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) for a given [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessRequest;
import dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessResponse;
import dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetActiveRoomsForProcessRequest req = new GetActiveRoomsForProcessRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2", "cbfcddd2-0006-43ae-996c-995fff7bed2e");            

            GetActiveRoomsForProcessResponse res = sdk.roomV2.getActiveRoomsForProcess(req, new GetActiveRoomsForProcessSecurity("dolor") {{
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

| Parameter                                                                                                                               | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                               | [dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessRequest](../../models/operations/GetActiveRoomsForProcessRequest.md)   | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |
| `security`                                                                                                                              | [dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessSecurity](../../models/operations/GetActiveRoomsForProcessSecurity.md) | :heavy_check_mark:                                                                                                                      | The security requirements to use for the request.                                                                                       |


### Response

**[dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessResponse](../../models/operations/GetActiveRoomsForProcessResponse.md)**


## getConnectionInfo

Get connection details to a [room](https://hathora.dev/docs/concepts/hathora-entities#room) using `appId` and `roomId`. Clients can call this endpoint without authentication.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.GetConnectionInfoRequest;
import dev.hathora.cloud_api.models.operations.GetConnectionInfoResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetConnectionInfoRequest req = new GetConnectionInfoRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");            

            GetConnectionInfoResponse res = sdk.roomV2.getConnectionInfo(req);

            if (res.connectionInfoV2 != null) {
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
| `request`                                                                                                               | [dev.hathora.cloud_api.models.operations.GetConnectionInfoRequest](../../models/operations/GetConnectionInfoRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[dev.hathora.cloud_api.models.operations.GetConnectionInfoResponse](../../models/operations/GetConnectionInfoResponse.md)**


## getInactiveRoomsForProcess

Get all inactive [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) for a given [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessRequest;
import dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessResponse;
import dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetInactiveRoomsForProcessRequest req = new GetInactiveRoomsForProcessRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2", "cbfcddd2-0006-43ae-996c-995fff7bed2e");            

            GetInactiveRoomsForProcessResponse res = sdk.roomV2.getInactiveRoomsForProcess(req, new GetInactiveRoomsForProcessSecurity("natus") {{
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

| Parameter                                                                                                                                   | Type                                                                                                                                        | Required                                                                                                                                    | Description                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                   | [dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessRequest](../../models/operations/GetInactiveRoomsForProcessRequest.md)   | :heavy_check_mark:                                                                                                                          | The request object to use for the request.                                                                                                  |
| `security`                                                                                                                                  | [dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessSecurity](../../models/operations/GetInactiveRoomsForProcessSecurity.md) | :heavy_check_mark:                                                                                                                          | The security requirements to use for the request.                                                                                           |


### Response

**[dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessResponse](../../models/operations/GetInactiveRoomsForProcessResponse.md)**


## getRoomInfo

Get details for an existing [room](https://hathora.dev/docs/concepts/hathora-entities#room) using `appId` and `roomId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.GetRoomInfoRequest;
import dev.hathora.cloud_api.models.operations.GetRoomInfoResponse;
import dev.hathora.cloud_api.models.operations.GetRoomInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetRoomInfoRequest req = new GetRoomInfoRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");            

            GetRoomInfoResponse res = sdk.roomV2.getRoomInfo(req, new GetRoomInfoSecurity("laboriosam") {{
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [dev.hathora.cloud_api.models.operations.GetRoomInfoRequest](../../models/operations/GetRoomInfoRequest.md)   | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |
| `security`                                                                                                    | [dev.hathora.cloud_api.models.operations.GetRoomInfoSecurity](../../models/operations/GetRoomInfoSecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |


### Response

**[dev.hathora.cloud_api.models.operations.GetRoomInfoResponse](../../models/operations/GetRoomInfoResponse.md)**


## suspendRoom

Suspend a [room](https://hathora.dev/docs/concepts/hathora-entities#room) using `appId` and `roomId`. The room is unallocated from the process but can be rescheduled later using the same `roomId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.SuspendRoomRequest;
import dev.hathora.cloud_api.models.operations.SuspendRoomResponse;
import dev.hathora.cloud_api.models.operations.SuspendRoomSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            SuspendRoomRequest req = new SuspendRoomRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");            

            SuspendRoomResponse res = sdk.roomV2.suspendRoom(req, new SuspendRoomSecurity("hic") {{
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [dev.hathora.cloud_api.models.operations.SuspendRoomRequest](../../models/operations/SuspendRoomRequest.md)   | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |
| `security`                                                                                                    | [dev.hathora.cloud_api.models.operations.SuspendRoomSecurity](../../models/operations/SuspendRoomSecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |


### Response

**[dev.hathora.cloud_api.models.operations.SuspendRoomResponse](../../models/operations/SuspendRoomResponse.md)**

