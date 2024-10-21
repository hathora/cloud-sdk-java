# RoomsV1
(*roomsV1()*)

## Overview

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

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateRoomDeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.CreateRoomParams;
import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        CreateRoomDeprecatedResponse res = sdk.roomsV1().createRoomDeprecated()
                .createRoomParams(CreateRoomParams.builder()
                    .region(Region.LONDON)
                    .clientIPs(List.of(
                        "123.123.123.123"))
                    .roomConfig("{\"name\":\"my-room\"}")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

        if (res.roomId().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 | Example                                                     |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `createRoomParams`                                          | [CreateRoomParams](../../models/shared/CreateRoomParams.md) | :heavy_check_mark:                                          | N/A                                                         |                                                             |
| `appId`                                                     | *Optional\<String>*                                         | :heavy_minus_sign:                                          | N/A                                                         | app-af469a92-5b45-4565-b3c4-b79878de67d2                    |
| `roomId`                                                    | *Optional\<String>*                                         | :heavy_minus_sign:                                          | N/A                                                         | 2swovpy1fnunu                                               |

### Response

**[CreateRoomDeprecatedResponse](../../models/operations/CreateRoomDeprecatedResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ApiError            | 400, 401, 402, 404, 422, 429, 500 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## ~~destroyRoomDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.DestroyRoomDeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        DestroyRoomDeprecatedResponse res = sdk.roomsV1().destroyRoomDeprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `roomId`                                 | *String*                                 | :heavy_check_mark:                       | N/A                                      | 2swovpy1fnunu                            |

### Response

**[DestroyRoomDeprecatedResponse](../../models/operations/DestroyRoomDeprecatedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 429, 500     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~getActiveRoomsForProcessDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetActiveRoomsForProcessDeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        GetActiveRoomsForProcessDeprecatedResponse res = sdk.roomsV1().getActiveRoomsForProcessDeprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .processId("cbfcddd2-0006-43ae-996c-995fff7bed2e")
                .call();

        if (res.classes().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `processId`                              | *String*                                 | :heavy_check_mark:                       | N/A                                      | cbfcddd2-0006-43ae-996c-995fff7bed2e     |

### Response

**[GetActiveRoomsForProcessDeprecatedResponse](../../models/operations/GetActiveRoomsForProcessDeprecatedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~getConnectionInfoDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetConnectionInfoDeprecatedResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        GetConnectionInfoDeprecatedResponse res = sdk.roomsV1().getConnectionInfoDeprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

        if (res.connectionInfo().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `roomId`                                 | *String*                                 | :heavy_check_mark:                       | N/A                                      | 2swovpy1fnunu                            |

### Response

**[GetConnectionInfoDeprecatedResponse](../../models/operations/GetConnectionInfoDeprecatedResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 400, 402, 404, 429, 500 | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## ~~getInactiveRoomsForProcessDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetInactiveRoomsForProcessDeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        GetInactiveRoomsForProcessDeprecatedResponse res = sdk.roomsV1().getInactiveRoomsForProcessDeprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .processId("cbfcddd2-0006-43ae-996c-995fff7bed2e")
                .call();

        if (res.classes().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `processId`                              | *String*                                 | :heavy_check_mark:                       | N/A                                      | cbfcddd2-0006-43ae-996c-995fff7bed2e     |

### Response

**[GetInactiveRoomsForProcessDeprecatedResponse](../../models/operations/GetInactiveRoomsForProcessDeprecatedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~getRoomInfoDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.GetRoomInfoDeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        GetRoomInfoDeprecatedResponse res = sdk.roomsV1().getRoomInfoDeprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

        if (res.room().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `roomId`                                 | *String*                                 | :heavy_check_mark:                       | N/A                                      | 2swovpy1fnunu                            |

### Response

**[GetRoomInfoDeprecatedResponse](../../models/operations/GetRoomInfoDeprecatedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 422, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~suspendRoomDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.SuspendRoomDeprecatedResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        SuspendRoomDeprecatedResponse res = sdk.roomsV1().suspendRoomDeprecated()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .roomId("2swovpy1fnunu")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `roomId`                                 | *String*                                 | :heavy_check_mark:                       | N/A                                      | 2swovpy1fnunu                            |

### Response

**[SuspendRoomDeprecatedResponse](../../models/operations/SuspendRoomDeprecatedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 404, 429, 500     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |