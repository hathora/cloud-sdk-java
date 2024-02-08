# AuthV1
(*authV1()*)

## Overview

Operations that allow you to generate a Hathora-signed [JSON web token (JWT)](https://jwt.io/) for [player authentication](https://hathora.dev/docs/lobbies-and-matchmaking/auth-service).

### Available Operations

* [loginAnonymous](#loginanonymous) - Returns a unique player token for an anonymous user.
* [loginGoogle](#logingoogle) - Returns a unique player token using a Google-signed OIDC `idToken`.
* [loginNickname](#loginnickname) - Returns a unique player token with a specified nickname for a user.

## loginAnonymous

Returns a unique player token for an anonymous user.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.LoginAnonymousRequest;
import dev.hathora.cloud_api.models.operations.LoginAnonymousResponse;
import dev.hathora.cloud_api.models.shared.*;
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

            LoginAnonymousResponse res = sdk.authV1().loginAnonymous()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .call();

            if (res.loginResponse().isPresent()) {
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

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional<? extends String>*             | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.LoginAnonymousResponse>](../../models/operations/LoginAnonymousResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## loginGoogle

Returns a unique player token using a Google-signed OIDC `idToken`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.LoginGoogleRequest;
import dev.hathora.cloud_api.models.operations.LoginGoogleResponse;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.LoginGoogleRequest;
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

            LoginGoogleResponse res = sdk.authV1().loginGoogle()
                .loginGoogleRequest(LoginGoogleRequest.builder()
                    .idToken("eyJhbGciOiJSUzI1NiIsImtpZCI6ImZkNDhhNzUxMzhkOWQ0OGYwYWE2MzVlZjU2OWM0ZTE5NmY3YWU4ZDYiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiJhY2NvdW50cy5nb29nbGUuY29tIiwiYXpwIjoiODQ4NDEyODI2Nzg4LW00bXNyYjZxNDRkbTJ1ZTNrZ3Z1aTBmcTdrZGE1NWxzLmFwcHMuZ29vZ2xldXNlcmNvbnRlbnQuY29tIiwiYXVkIjoiODQ4NDEyODI2Nzg4LW00bXNyYjZxNDRkbTJ1ZTNrZ3Z1aTBmcTdrZGE1NWxzLmFwcHMuZ29vZ2xldXNlcmNvbnRlbnQuY29tIiwic3ViIjoiMTE0NTQyMzMwNzI3MTU2MTMzNzc2IiwiZW1haWwiOiJocGFdkeivmeuzQGdtYWlsLmNvbSIsImVtYWlsX3ZlcmlmaWVkIjp0cnVlLCJhdF9oYXNoIjoidno1NGhhdTNxbnVR")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .call();

            if (res.loginResponse().isPresent()) {
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

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         | Example                                                                                             |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `loginGoogleRequest`                                                                                | [dev.hathora.cloud_api.models.shared.LoginGoogleRequest](../../models/shared/LoginGoogleRequest.md) | :heavy_check_mark:                                                                                  | N/A                                                                                                 |                                                                                                     |
| `appId`                                                                                             | *Optional<? extends String>*                                                                        | :heavy_minus_sign:                                                                                  | N/A                                                                                                 | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                            |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.LoginGoogleResponse>](../../models/operations/LoginGoogleResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## loginNickname

Returns a unique player token with a specified nickname for a user.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.LoginNicknameRequest;
import dev.hathora.cloud_api.models.operations.LoginNicknameResponse;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.LoginNicknameRequest;
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

            LoginNicknameResponse res = sdk.authV1().loginNickname()
                .loginNicknameRequest(LoginNicknameRequest.builder()
                    .nickname("squiddytwoshoes")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .call();

            if (res.loginResponse().isPresent()) {
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

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             | Example                                                                                                 |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `loginNicknameRequest`                                                                                  | [dev.hathora.cloud_api.models.shared.LoginNicknameRequest](../../models/shared/LoginNicknameRequest.md) | :heavy_check_mark:                                                                                      | N/A                                                                                                     |                                                                                                         |
| `appId`                                                                                                 | *Optional<? extends String>*                                                                            | :heavy_minus_sign:                                                                                      | N/A                                                                                                     | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.LoginNicknameResponse>](../../models/operations/LoginNicknameResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
