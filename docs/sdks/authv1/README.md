# authV1

## Overview

Operations that allow you to configure authentication for your [applications](https://hathora.dev/docs/concepts/hathora-entities#application).

### Available Operations

* [loginAnonymous](#loginanonymous)
* [loginGoogle](#logingoogle)
* [loginNickname](#loginnickname)

## loginAnonymous

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.LoginAnonymousRequest;
import dev.hathora.cloud_api.models.operations.LoginAnonymousResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            LoginAnonymousRequest req = new LoginAnonymousRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2");            

            LoginAnonymousResponse res = sdk.authV1.loginAnonymous(req);

            if (res.loginResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [dev.hathora.cloud_api.models.operations.LoginAnonymousRequest](../../models/operations/LoginAnonymousRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[dev.hathora.cloud_api.models.operations.LoginAnonymousResponse](../../models/operations/LoginAnonymousResponse.md)**


## loginGoogle

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.LoginGoogleRequest;
import dev.hathora.cloud_api.models.operations.LoginGoogleResponse;
import dev.hathora.cloud_api.models.shared.LoginGoogleRequest;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            LoginGoogleRequest req = new LoginGoogleRequest(                new LoginGoogleRequest("error");, "app-af469a92-5b45-4565-b3c4-b79878de67d2");            

            LoginGoogleResponse res = sdk.authV1.loginGoogle(req);

            if (res.loginResponse != null) {
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
| `request`                                                                                                   | [dev.hathora.cloud_api.models.operations.LoginGoogleRequest](../../models/operations/LoginGoogleRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[dev.hathora.cloud_api.models.operations.LoginGoogleResponse](../../models/operations/LoginGoogleResponse.md)**


## loginNickname

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.LoginNicknameRequest;
import dev.hathora.cloud_api.models.operations.LoginNicknameResponse;
import dev.hathora.cloud_api.models.shared.LoginNicknameRequest;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            LoginNicknameRequest req = new LoginNicknameRequest(                new LoginNicknameRequest("deserunt");, "app-af469a92-5b45-4565-b3c4-b79878de67d2");            

            LoginNicknameResponse res = sdk.authV1.loginNickname(req);

            if (res.loginResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [dev.hathora.cloud_api.models.operations.LoginNicknameRequest](../../models/operations/LoginNicknameRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[dev.hathora.cloud_api.models.operations.LoginNicknameResponse](../../models/operations/LoginNicknameResponse.md)**

