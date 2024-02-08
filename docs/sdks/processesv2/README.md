# ProcessesV2
(*processesV2()*)

## Overview

Operations to get data on active and stopped [processes](https://hathora.dev/docs/concepts/hathora-entities#process).

### Available Operations

* [getLatestProcesses](#getlatestprocesses) - Retrieve the 10 most recent [processes](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `status` or `region`.
* [getProcessInfo](#getprocessinfo) - Get details for a [process](https://hathora.dev/docs/concepts/hathora-entities#process).

## getLatestProcesses

Retrieve the 10 most recent [processes](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `status` or `region`.

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.GetLatestProcessesRequest;
import dev.hathora.cloud_api.models.operations.GetLatestProcessesResponse;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.ProcessStatus;
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

            GetLatestProcessesResponse res = sdk.processesV2().getLatestProcesses()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .region(java.util.List.of(
                    Region.SINGAPORE))
                .status(java.util.List.of(
                    ProcessStatus.DRAINING))
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
| `region`                                                                                        | List<[dev.hathora.cloud_api.models.shared.Region](../../models/shared/Region.md)>               | :heavy_minus_sign:                                                                              | N/A                                                                                             |                                                                                                 |
| `status`                                                                                        | List<[dev.hathora.cloud_api.models.shared.ProcessStatus](../../models/shared/ProcessStatus.md)> | :heavy_minus_sign:                                                                              | N/A                                                                                             |                                                                                                 |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.GetLatestProcessesResponse>](../../models/operations/GetLatestProcessesResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getProcessInfo

Get details for a [process](https://hathora.dev/docs/concepts/hathora-entities#process).

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.GetProcessInfoRequest;
import dev.hathora.cloud_api.models.operations.GetProcessInfoResponse;
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

            GetProcessInfoResponse res = sdk.processesV2().getProcessInfo()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .processId("cbfcddd2-0006-43ae-996c-995fff7bed2e")
                .call();

            if (res.processV2().isPresent()) {
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
| `processId`                              | *String*                                 | :heavy_check_mark:                       | N/A                                      | cbfcddd2-0006-43ae-996c-995fff7bed2e     |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.GetProcessInfoResponse>](../../models/operations/GetProcessInfoResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
