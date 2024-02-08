# LobbyV1
(*lobbyV1()*)

## Overview

Deprecated. Use [LobbyV3](https://hathora.dev/api#tag/LobbyV3).

### Available Operations

* [~~createPrivateLobbyDeprecated~~](#createprivatelobbydeprecated) - :warning: **Deprecated**
* [~~createPublicLobbyDeprecated~~](#createpubliclobbydeprecated) - :warning: **Deprecated**
* [~~listActivePublicLobbiesDeprecatedV1~~](#listactivepubliclobbiesdeprecatedv1) - :warning: **Deprecated**

## ~~createPrivateLobbyDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedResponse;
import dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedSecurity;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.Region;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            CreatePrivateLobbyDeprecatedResponse res = sdk.lobbyV1().createPrivateLobbyDeprecated()
                .security(CreatePrivateLobbyDeprecatedSecurity.builder()
                    .playerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .local(false)
                .region(Region.LONDON)
                .call();

            if (res.roomId().isPresent()) {
                // handle response
            }

        } catch (dev.hathora.cloud_api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                       | Type                                                                                                                                            | Required                                                                                                                                        | Description                                                                                                                                     | Example                                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                      | [dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedSecurity](../../models/operations/CreatePrivateLobbyDeprecatedSecurity.md) | :heavy_check_mark:                                                                                                                              | The security requirements to use for the request.                                                                                               |                                                                                                                                                 |
| `appId`                                                                                                                                         | *Optional<? extends String>*                                                                                                                    | :heavy_minus_sign:                                                                                                                              | N/A                                                                                                                                             | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                                        |
| `local`                                                                                                                                         | *Optional<? extends Boolean>*                                                                                                                   | :heavy_minus_sign:                                                                                                                              | N/A                                                                                                                                             |                                                                                                                                                 |
| `region`                                                                                                                                        | [Optional<? extends dev.hathora.cloud_api.models.shared.Region>](../../models/shared/Region.md)                                                 | :heavy_minus_sign:                                                                                                                              | N/A                                                                                                                                             |                                                                                                                                                 |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedResponse>](../../models/operations/CreatePrivateLobbyDeprecatedResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## ~~createPublicLobbyDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedRequest;
import dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedResponse;
import dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedSecurity;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.Region;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            CreatePublicLobbyDeprecatedResponse res = sdk.lobbyV1().createPublicLobbyDeprecated()
                .security(CreatePublicLobbyDeprecatedSecurity.builder()
                    .playerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .local(false)
                .region(Region.LONDON)
                .call();

            if (res.roomId().isPresent()) {
                // handle response
            }

        } catch (dev.hathora.cloud_api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                     | Type                                                                                                                                          | Required                                                                                                                                      | Description                                                                                                                                   | Example                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                    | [dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedSecurity](../../models/operations/CreatePublicLobbyDeprecatedSecurity.md) | :heavy_check_mark:                                                                                                                            | The security requirements to use for the request.                                                                                             |                                                                                                                                               |
| `appId`                                                                                                                                       | *Optional<? extends String>*                                                                                                                  | :heavy_minus_sign:                                                                                                                            | N/A                                                                                                                                           | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                                                      |
| `local`                                                                                                                                       | *Optional<? extends Boolean>*                                                                                                                 | :heavy_minus_sign:                                                                                                                            | N/A                                                                                                                                           |                                                                                                                                               |
| `region`                                                                                                                                      | [Optional<? extends dev.hathora.cloud_api.models.shared.Region>](../../models/shared/Region.md)                                               | :heavy_minus_sign:                                                                                                                            | N/A                                                                                                                                           |                                                                                                                                               |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedResponse>](../../models/operations/CreatePublicLobbyDeprecatedResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## ~~listActivePublicLobbiesDeprecatedV1~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedV1Request;
import dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedV1Response;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.Region;
import dev.hathora.cloud_api.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            ListActivePublicLobbiesDeprecatedV1Response res = sdk.lobbyV1().listActivePublicLobbiesDeprecatedV1()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .local(false)
                .region(Region.TOKYO)
                .call();

            if (res.classes().isPresent()) {
                // handle response
            }

        } catch (dev.hathora.cloud_api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     | Example                                                                                         |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `appId`                                                                                         | *Optional<? extends String>*                                                                    | :heavy_minus_sign:                                                                              | N/A                                                                                             | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                        |
| `local`                                                                                         | *Optional<? extends Boolean>*                                                                   | :heavy_minus_sign:                                                                              | N/A                                                                                             |                                                                                                 |
| `region`                                                                                        | [Optional<? extends dev.hathora.cloud_api.models.shared.Region>](../../models/shared/Region.md) | :heavy_minus_sign:                                                                              | N/A                                                                                             |                                                                                                 |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedV1Response>](../../models/operations/ListActivePublicLobbiesDeprecatedV1Response.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
