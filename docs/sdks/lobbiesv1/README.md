# LobbiesV1
(*lobbiesV1()*)

### Available Operations

* [~~createPrivateLobbyDeprecated~~](#createprivatelobbydeprecated) - :warning: **Deprecated**
* [~~createPublicLobbyDeprecated~~](#createpubliclobbydeprecated) - :warning: **Deprecated**
* [~~listActivePublicLobbiesDeprecatedV1~~](#listactivepubliclobbiesdeprecatedv1) - :warning: **Deprecated**

## ~~createPrivateLobbyDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedSecurity;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            CreatePrivateLobbyDeprecatedResponse res = sdk.lobbiesV1().createPrivateLobbyDeprecated()
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
        } catch (dev.hathora.cloud_api.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (dev.hathora.cloud_api.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
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

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ApiError      | 400,401,402,404,422,429,500 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | */*                         |

## ~~createPublicLobbyDeprecated~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedSecurity;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            CreatePublicLobbyDeprecatedResponse res = sdk.lobbiesV1().createPublicLobbyDeprecated()
                .security(CreatePublicLobbyDeprecatedSecurity.builder()
                    .playerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .local(false)
                .region(Region.FRANKFURT)
                .call();

            if (res.roomId().isPresent()) {
                // handle response
            }
        } catch (dev.hathora.cloud_api.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (dev.hathora.cloud_api.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
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

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ApiError      | 400,401,402,404,422,429,500 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | */*                         |

## ~~listActivePublicLobbiesDeprecatedV1~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            ListActivePublicLobbiesDeprecatedV1Response res = sdk.lobbiesV1().listActivePublicLobbiesDeprecatedV1()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .local(false)
                .region(Region.SYDNEY)
                .call();

            if (res.classes().isPresent()) {
                // handle response
            }
        } catch (dev.hathora.cloud_api.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (dev.hathora.cloud_api.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
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

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 404,429                | application/json       |
| models/errors/SDKError | 4xx-5xx                | */*                    |
