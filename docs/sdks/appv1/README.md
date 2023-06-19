# appV1

## Overview

Operations that allow you manage your [applications](https://hathora.dev/docs/concepts/hathora-entities#application).

### Available Operations

* [createApp](#createapp) - Create a new [application](https://hathora.dev/docs/concepts/hathora-entities#application).
* [deleteApp](#deleteapp) - Delete an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Your organization will lose access to this application.
* [getAppInfo](#getappinfo) - Get details for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.
* [getApps](#getapps) - Returns an unsorted list of your organization’s [applications](https://hathora.dev/docs/concepts/hathora-entities#application). An application is uniquely identified by an `appId`.
* [updateApp](#updateapp) - Update data for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

## createApp

Create a new [application](https://hathora.dev/docs/concepts/hathora-entities#application).

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.CreateAppResponse;
import dev.hathora.cloud_api.models.operations.CreateAppSecurity;
import dev.hathora.cloud_api.models.shared.AppConfig;
import dev.hathora.cloud_api.models.shared.AppConfigAuthConfiguration;
import dev.hathora.cloud_api.models.shared.AppConfigAuthConfigurationGoogle;
import dev.hathora.cloud_api.models.shared.RecordStringNever;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            dev.hathora.cloud_api.models.shared.AppConfig req = new AppConfig("minecraft",                 new AppConfigAuthConfiguration() {{
                                anonymous = new RecordStringNever();;
                                google = new AppConfigAuthConfigurationGoogle("distinctio");;
                                nickname = new RecordStringNever();;
                            }};);            

            CreateAppResponse res = sdk.appV1.createApp(req, new CreateAppSecurity("quibusdam") {{
                auth0 = "";
            }});

            if (res.application != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [dev.hathora.cloud_api.models.shared.AppConfig](../../models/shared/AppConfig.md)                         | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |
| `security`                                                                                                | [dev.hathora.cloud_api.models.operations.CreateAppSecurity](../../models/operations/CreateAppSecurity.md) | :heavy_check_mark:                                                                                        | The security requirements to use for the request.                                                         |


### Response

**[dev.hathora.cloud_api.models.operations.CreateAppResponse](../../models/operations/CreateAppResponse.md)**


## deleteApp

Delete an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Your organization will lose access to this application.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.DeleteAppRequest;
import dev.hathora.cloud_api.models.operations.DeleteAppResponse;
import dev.hathora.cloud_api.models.operations.DeleteAppSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            DeleteAppRequest req = new DeleteAppRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2");            

            DeleteAppResponse res = sdk.appV1.deleteApp(req, new DeleteAppSecurity("unde") {{
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

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [dev.hathora.cloud_api.models.operations.DeleteAppRequest](../../models/operations/DeleteAppRequest.md)   | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |
| `security`                                                                                                | [dev.hathora.cloud_api.models.operations.DeleteAppSecurity](../../models/operations/DeleteAppSecurity.md) | :heavy_check_mark:                                                                                        | The security requirements to use for the request.                                                         |


### Response

**[dev.hathora.cloud_api.models.operations.DeleteAppResponse](../../models/operations/DeleteAppResponse.md)**


## getAppInfo

Get details for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.GetAppInfoRequest;
import dev.hathora.cloud_api.models.operations.GetAppInfoResponse;
import dev.hathora.cloud_api.models.operations.GetAppInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetAppInfoRequest req = new GetAppInfoRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2");            

            GetAppInfoResponse res = sdk.appV1.getAppInfo(req, new GetAppInfoSecurity("nulla") {{
                auth0 = "";
            }});

            if (res.application != null) {
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
| `request`                                                                                                   | [dev.hathora.cloud_api.models.operations.GetAppInfoRequest](../../models/operations/GetAppInfoRequest.md)   | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |
| `security`                                                                                                  | [dev.hathora.cloud_api.models.operations.GetAppInfoSecurity](../../models/operations/GetAppInfoSecurity.md) | :heavy_check_mark:                                                                                          | The security requirements to use for the request.                                                           |


### Response

**[dev.hathora.cloud_api.models.operations.GetAppInfoResponse](../../models/operations/GetAppInfoResponse.md)**


## getApps

Returns an unsorted list of your organization’s [applications](https://hathora.dev/docs/concepts/hathora-entities#application). An application is uniquely identified by an `appId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.GetAppsResponse;
import dev.hathora.cloud_api.models.operations.GetAppsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetAppsResponse res = sdk.appV1.getApps(new GetAppsSecurity("corrupti") {{
                auth0 = "";
            }});

            if (res.applicationWithDeployments != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `security`                                                                                            | [dev.hathora.cloud_api.models.operations.GetAppsSecurity](../../models/operations/GetAppsSecurity.md) | :heavy_check_mark:                                                                                    | The security requirements to use for the request.                                                     |


### Response

**[dev.hathora.cloud_api.models.operations.GetAppsResponse](../../models/operations/GetAppsResponse.md)**


## updateApp

Update data for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.UpdateAppRequest;
import dev.hathora.cloud_api.models.operations.UpdateAppResponse;
import dev.hathora.cloud_api.models.operations.UpdateAppSecurity;
import dev.hathora.cloud_api.models.shared.AppConfig;
import dev.hathora.cloud_api.models.shared.AppConfigAuthConfiguration;
import dev.hathora.cloud_api.models.shared.AppConfigAuthConfigurationGoogle;
import dev.hathora.cloud_api.models.shared.RecordStringNever;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            UpdateAppRequest req = new UpdateAppRequest(                new AppConfig("minecraft",                 new AppConfigAuthConfiguration() {{
                                                anonymous = new RecordStringNever();;
                                                google = new AppConfigAuthConfigurationGoogle("illum");;
                                                nickname = new RecordStringNever();;
                                            }};);, "app-af469a92-5b45-4565-b3c4-b79878de67d2");            

            UpdateAppResponse res = sdk.appV1.updateApp(req, new UpdateAppSecurity("vel") {{
                auth0 = "";
            }});

            if (res.application != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [dev.hathora.cloud_api.models.operations.UpdateAppRequest](../../models/operations/UpdateAppRequest.md)   | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |
| `security`                                                                                                | [dev.hathora.cloud_api.models.operations.UpdateAppSecurity](../../models/operations/UpdateAppSecurity.md) | :heavy_check_mark:                                                                                        | The security requirements to use for the request.                                                         |


### Response

**[dev.hathora.cloud_api.models.operations.UpdateAppResponse](../../models/operations/UpdateAppResponse.md)**

