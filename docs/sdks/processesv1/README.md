# processesV1

## Overview

Operations to get data on active and stopped [processes](https://hathora.dev/docs/concepts/hathora-entities#process).

### Available Operations

* [getProcessInfo](#getprocessinfo) - Get details for an existing [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.
* [getRunningProcesses](#getrunningprocesses) - Returns an array of active [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Filter the array by optionally passing in a region.
* [getStoppedProcesses](#getstoppedprocesses) - Returns an array of stopped [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Filter the array by optionally passing in a region.

## getProcessInfo

Get details for an existing [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.GetProcessInfoRequest;
import dev.hathora.cloud_api.models.operations.GetProcessInfoResponse;
import dev.hathora.cloud_api.models.operations.GetProcessInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetProcessInfoRequest req = new GetProcessInfoRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2", "cbfcddd2-0006-43ae-996c-995fff7bed2e");            

            GetProcessInfoResponse res = sdk.processesV1.getProcessInfo(req, new GetProcessInfoSecurity("commodi") {{
                auth0 = "";
            }});

            if (res.process != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [dev.hathora.cloud_api.models.operations.GetProcessInfoRequest](../../models/operations/GetProcessInfoRequest.md)   | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |
| `security`                                                                                                          | [dev.hathora.cloud_api.models.operations.GetProcessInfoSecurity](../../models/operations/GetProcessInfoSecurity.md) | :heavy_check_mark:                                                                                                  | The security requirements to use for the request.                                                                   |


### Response

**[dev.hathora.cloud_api.models.operations.GetProcessInfoResponse](../../models/operations/GetProcessInfoResponse.md)**


## getRunningProcesses

Returns an array of active [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Filter the array by optionally passing in a region.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.GetRunningProcessesRequest;
import dev.hathora.cloud_api.models.operations.GetRunningProcessesResponse;
import dev.hathora.cloud_api.models.operations.GetRunningProcessesSecurity;
import dev.hathora.cloud_api.models.shared.Region;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetRunningProcessesRequest req = new GetRunningProcessesRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2") {{
                region = Region.FRANKFURT;
            }};            

            GetRunningProcessesResponse res = sdk.processesV1.getRunningProcesses(req, new GetRunningProcessesSecurity("modi") {{
                auth0 = "";
            }});

            if (res.processWithRooms != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [dev.hathora.cloud_api.models.operations.GetRunningProcessesRequest](../../models/operations/GetRunningProcessesRequest.md)   | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |
| `security`                                                                                                                    | [dev.hathora.cloud_api.models.operations.GetRunningProcessesSecurity](../../models/operations/GetRunningProcessesSecurity.md) | :heavy_check_mark:                                                                                                            | The security requirements to use for the request.                                                                             |


### Response

**[dev.hathora.cloud_api.models.operations.GetRunningProcessesResponse](../../models/operations/GetRunningProcessesResponse.md)**


## getStoppedProcesses

Returns an array of stopped [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Filter the array by optionally passing in a region.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.GetStoppedProcessesRequest;
import dev.hathora.cloud_api.models.operations.GetStoppedProcessesResponse;
import dev.hathora.cloud_api.models.operations.GetStoppedProcessesSecurity;
import dev.hathora.cloud_api.models.shared.Region;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetStoppedProcessesRequest req = new GetStoppedProcessesRequest("app-af469a92-5b45-4565-b3c4-b79878de67d2") {{
                region = Region.WASHINGTON_DC;
            }};            

            GetStoppedProcessesResponse res = sdk.processesV1.getStoppedProcesses(req, new GetStoppedProcessesSecurity("impedit") {{
                auth0 = "";
            }});

            if (res.processes != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [dev.hathora.cloud_api.models.operations.GetStoppedProcessesRequest](../../models/operations/GetStoppedProcessesRequest.md)   | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |
| `security`                                                                                                                    | [dev.hathora.cloud_api.models.operations.GetStoppedProcessesSecurity](../../models/operations/GetStoppedProcessesSecurity.md) | :heavy_check_mark:                                                                                                            | The security requirements to use for the request.                                                                             |


### Response

**[dev.hathora.cloud_api.models.operations.GetStoppedProcessesResponse](../../models/operations/GetStoppedProcessesResponse.md)**

