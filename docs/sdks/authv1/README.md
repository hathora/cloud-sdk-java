# AuthV1
(*authV1*)

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

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.LoginAnonymousRequest;
import dev.hathora.cloud_api.models.operations.LoginAnonymousResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("magnam") {{
                    auth0 = "";
                }})
                .build();

            LoginAnonymousResponse res = sdk.authV1.loginAnonymous("app-af469a92-5b45-4565-b3c4-b79878de67d2");

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

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *String*                                 | :heavy_check_mark:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |


### Response

**[dev.hathora.cloud_api.models.operations.LoginAnonymousResponse](../../models/operations/LoginAnonymousResponse.md)**


## loginGoogle

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.LoginGoogleRequest;
import dev.hathora.cloud_api.models.operations.LoginGoogleResponse;
import dev.hathora.cloud_api.models.shared.LoginGoogleRequest;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("debitis") {{
                    auth0 = "";
                }})
                .build();

            LoginGoogleResponse res = sdk.authV1.loginGoogle(new LoginGoogleRequest("delectus") {{
                idToken = "ipsa";
            }}, "app-af469a92-5b45-4565-b3c4-b79878de67d2");

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

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         | Example                                                                                             |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `loginGoogleRequest`                                                                                | [dev.hathora.cloud_api.models.shared.LoginGoogleRequest](../../models/shared/LoginGoogleRequest.md) | :heavy_check_mark:                                                                                  | N/A                                                                                                 |                                                                                                     |
| `appId`                                                                                             | *String*                                                                                            | :heavy_check_mark:                                                                                  | N/A                                                                                                 | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                            |


### Response

**[dev.hathora.cloud_api.models.operations.LoginGoogleResponse](../../models/operations/LoginGoogleResponse.md)**


## loginNickname

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.LoginNicknameRequest;
import dev.hathora.cloud_api.models.operations.LoginNicknameResponse;
import dev.hathora.cloud_api.models.shared.LoginNicknameRequest;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("tempora") {{
                    auth0 = "";
                }})
                .build();

            LoginNicknameResponse res = sdk.authV1.loginNickname(new LoginNicknameRequest("molestiae") {{
                nickname = "suscipit";
            }}, "app-af469a92-5b45-4565-b3c4-b79878de67d2");

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

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             | Example                                                                                                 |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `loginNicknameRequest`                                                                                  | [dev.hathora.cloud_api.models.shared.LoginNicknameRequest](../../models/shared/LoginNicknameRequest.md) | :heavy_check_mark:                                                                                      | N/A                                                                                                     |                                                                                                         |
| `appId`                                                                                                 | *String*                                                                                                | :heavy_check_mark:                                                                                      | N/A                                                                                                     | app-af469a92-5b45-4565-b3c4-b79878de67d2                                                                |


### Response

**[dev.hathora.cloud_api.models.operations.LoginNicknameResponse](../../models/operations/LoginNicknameResponse.md)**

