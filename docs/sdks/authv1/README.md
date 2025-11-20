# AuthV1
(*authV1()*)

## Overview

Operations that allow you to generate a Hathora-signed [JSON web token (JWT)](https://jwt.io/) for [player authentication](https://hathora.dev/docs/lobbies-and-matchmaking/auth-service).

### Available Operations

* [loginAnonymous](#loginanonymous) - LoginAnonymous
* [loginGoogle](#logingoogle) - LoginGoogle
* [loginNickname](#loginnickname) - LoginNickname

## loginAnonymous

Returns a unique player token for an anonymous user.

### Example Usage

<!-- UsageSnippet language="java" operationID="LoginAnonymous" method="post" path="/auth/v1/{appId}/login/anonymous" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.LoginAnonymousResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        LoginAnonymousResponse res = sdk.authV1().loginAnonymous()
                .call();

        if (res.playerTokenObject().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |

### Response

**[LoginAnonymousResponse](../../models/operations/LoginAnonymousResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 404, 408, 429          | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## loginGoogle

Returns a unique player token using a Google-signed OIDC `idToken`.

### Example Usage

<!-- UsageSnippet language="java" operationID="LoginGoogle" method="post" path="/auth/v1/{appId}/login/google" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.LoginGoogleResponse;
import dev.hathora.cloud_sdk.models.shared.GoogleIdTokenObject;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        LoginGoogleResponse res = sdk.authV1().loginGoogle()
                .googleIdTokenObject(GoogleIdTokenObject.builder()
                    .idToken("eyJhbGciOiJSUzI1NiIsImtpZCI6ImZkNDhhNzUxMzhkOWQ0OGYwYWE2MzVlZjU2OWM0ZTE5NmY3YWU4ZDYiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiJhY2NvdW50cy5nb29nbGUuY29tIiwiYXpwIjoiODQ4NDEyODI2Nzg4LW00bXNyYjZxNDRkbTJ1ZTNrZ3Z1aTBmcTdrZGE1NWxzLmFwcHMuZ29vZ2xldXNlcmNvbnRlbnQuY29tIiwiYXVkIjoiODQ4NDEyODI2Nzg4LW00bXNyYjZxNDRkbTJ1ZTNrZ3Z1aTBmcTdrZGE1NWxzLmFwcHMuZ29vZ2xldXNlcmNvbnRlbnQuY29tIiwic3ViIjoiMTE0NTQyMzMwNzI3MTU2MTMzNzc2IiwiZW1haWwiOiJocGFdkeivmeuzQGdtYWlsLmNvbSIsImVtYWlsX3ZlcmlmaWVkIjp0cnVlLCJhdF9oYXNoIjoidno1NGhhdTNxbnVR")
                    .build())
                .call();

        if (res.playerTokenObject().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       | Example                                                           |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `googleIdTokenObject`                                             | [GoogleIdTokenObject](../../models/shared/GoogleIdTokenObject.md) | :heavy_check_mark:                                                | N/A                                                               |                                                                   |
| `appId`                                                           | *Optional\<String>*                                               | :heavy_minus_sign:                                                | N/A                                                               | app-af469a92-5b45-4565-b3c4-b79878de67d2                          |

### Response

**[LoginGoogleResponse](../../models/operations/LoginGoogleResponse.md)**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 408, 422, 429 | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

## loginNickname

Returns a unique player token with a specified nickname for a user.

### Example Usage

<!-- UsageSnippet language="java" operationID="LoginNickname" method="post" path="/auth/v1/{appId}/login/nickname" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.LoginNicknameResponse;
import dev.hathora.cloud_sdk.models.shared.NicknameObject;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        LoginNicknameResponse res = sdk.authV1().loginNickname()
                .nicknameObject(NicknameObject.builder()
                    .nickname("squiddytwoshoes")
                    .build())
                .call();

        if (res.playerTokenObject().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `nicknameObject`                                        | [NicknameObject](../../models/shared/NicknameObject.md) | :heavy_check_mark:                                      | N/A                                                     |                                                         |
| `appId`                                                 | *Optional\<String>*                                     | :heavy_minus_sign:                                      | N/A                                                     | app-af469a92-5b45-4565-b3c4-b79878de67d2                |

### Response

**[LoginNicknameResponse](../../models/operations/LoginNicknameResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 404, 408, 422, 429     | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |