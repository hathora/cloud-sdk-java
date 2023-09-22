# RoomV2

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

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.CreateRoomRequest;
import dev.hathora.cloud_api.models.operations.CreateRoomResponse;
import dev.hathora.cloud_api.models.shared.CreateRoomRequest;
import dev.hathora.cloud_api.models.shared.Region;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("explicabo") {{
                    auth0 = "";
                }})
                .build();

            CreateRoomResponse res = sdk.roomV2.createRoom(new CreateRoomRequest(Region.LONDON) {{
                region = Region.TOKYO;
            }}, "app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");

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

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       | Example                                                                                           |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `createRoomRequest`                                                                               | [dev.hathora.cloud_api.models.shared.CreateRoomRequest](../../models/shared/CreateRoomRequest.md) | :heavy_check_mark:                                                                                | N/A                                                                                               |                                                                                                   |
| `appId`                                                                                           | *String*                                                                                          | :heavy_check_mark:                                                                                | N/A                                                                                               | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                          |
| `roomId`                                                                                          | *String*                                                                                          | :heavy_minus_sign:                                                                                | N/A                                                                                               | 2swovpy1fnunu                                                                                     |


### Response

**[dev.hathora.cloud_api.models.operations.CreateRoomResponse](../../models/operations/CreateRoomResponse.md)**


## destroyRoom

Destroy a [room](https://hathora.dev/docs/concepts/hathora-entities#room) using `appId` and `roomId`. All associated metadata is deleted.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.DestroyRoomRequest;
import dev.hathora.cloud_api.models.operations.DestroyRoomResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("omnis") {{
                    auth0 = "";
                }})
                .build();

            DestroyRoomResponse res = sdk.roomV2.destroyRoom("app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");

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

**[dev.hathora.cloud_api.models.operations.DestroyRoomResponse](../../models/operations/DestroyRoomResponse.md)**


## getActiveRoomsForProcess

Get all active [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) for a given [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessRequest;
import dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("nemo") {{
                    auth0 = "";
                }})
                .build();

            GetActiveRoomsForProcessResponse res = sdk.roomV2.getActiveRoomsForProcess("app-af469a92-5b45-4565-b3c4-b79878de67d2", "cbfcddd2-0006-43ae-996c-995fff7bed2e");

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

**[dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessResponse](../../models/operations/GetActiveRoomsForProcessResponse.md)**


## getConnectionInfo

Get connection details to a [room](https://hathora.dev/docs/concepts/hathora-entities#room) using `appId` and `roomId`. Clients can call this endpoint without authentication.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.GetConnectionInfoRequest;
import dev.hathora.cloud_api.models.operations.GetConnectionInfoResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("minima") {{
                    auth0 = "";
                }})
                .build();

            GetConnectionInfoResponse res = sdk.roomV2.getConnectionInfo("app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");

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

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *String*                                 | :heavy_check_mark:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `roomId`                                 | *String*                                 | :heavy_check_mark:                       | N/A                                      | 2swovpy1fnunu                            |


### Response

**[dev.hathora.cloud_api.models.operations.GetConnectionInfoResponse](../../models/operations/GetConnectionInfoResponse.md)**


## getInactiveRoomsForProcess

Get all inactive [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) for a given [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessRequest;
import dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("excepturi") {{
                    auth0 = "";
                }})
                .build();

            GetInactiveRoomsForProcessResponse res = sdk.roomV2.getInactiveRoomsForProcess("app-af469a92-5b45-4565-b3c4-b79878de67d2", "cbfcddd2-0006-43ae-996c-995fff7bed2e");

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

**[dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessResponse](../../models/operations/GetInactiveRoomsForProcessResponse.md)**


## getRoomInfo

Get details for an existing [room](https://hathora.dev/docs/concepts/hathora-entities#room) using `appId` and `roomId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.GetRoomInfoRequest;
import dev.hathora.cloud_api.models.operations.GetRoomInfoResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("accusantium") {{
                    auth0 = "";
                }})
                .build();

            GetRoomInfoResponse res = sdk.roomV2.getRoomInfo("app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");

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

**[dev.hathora.cloud_api.models.operations.GetRoomInfoResponse](../../models/operations/GetRoomInfoResponse.md)**


## suspendRoom

Suspend a [room](https://hathora.dev/docs/concepts/hathora-entities#room) using `appId` and `roomId`. The room is unallocated from the process but can be rescheduled later using the same `roomId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.SuspendRoomRequest;
import dev.hathora.cloud_api.models.operations.SuspendRoomResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("iure") {{
                    auth0 = "";
                }})
                .build();

            SuspendRoomResponse res = sdk.roomV2.suspendRoom("app-af469a92-5b45-4565-b3c4-b79878de67d2", "2swovpy1fnunu");

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

**[dev.hathora.cloud_api.models.operations.SuspendRoomResponse](../../models/operations/SuspendRoomResponse.md)**

