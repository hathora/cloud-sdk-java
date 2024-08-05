# ProcessesV2
(*processesV2()*)

## Overview

Operations to get data on active and stopped [processes](https://hathora.dev/docs/concepts/hathora-entities#process).

### Available Operations

* [createProcess](#createprocess) - Creates a [process](https://hathora.dev/docs/concepts/hathora-entities#process) without a room. Use this to pre-allocate processes ahead of time so that subsequent room assignment via [CreateRoom()](https://hathora.dev/api#tag/RoomV2/operation/CreateRoom) can be instant.
* [getLatestProcesses](#getlatestprocesses) - Retrieve the 10 most recent [processes](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `status` or `region`.
* [getProcessInfo](#getprocessinfo) - Get details for a [process](https://hathora.dev/docs/concepts/hathora-entities#process).
* [stopProcess](#stopprocess) - Stops a [process](https://hathora.dev/docs/concepts/hathora-entities#process) immediately.

## createProcess

Creates a [process](https://hathora.dev/docs/concepts/hathora-entities#process) without a room. Use this to pre-allocate processes ahead of time so that subsequent room assignment via [CreateRoom()](https://hathora.dev/api#tag/RoomV2/operation/CreateRoom) can be instant.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_sdk.HathoraCloud;
import com.hathora.cloud_sdk.models.operations.*;
import com.hathora.cloud_sdk.models.shared.*;
import com.hathora.cloud_sdk.utils.EventStream;
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
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            CreateProcessResponse res = sdk.processesV2().createProcess()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .region(Region.TOKYO)
                .call();

            if (res.processV2().isPresent()) {
                // handle response
            }
        } catch (com.hathora.cloud_sdk.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_sdk.models.errors.SDKError e) {
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

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 | Example                                                                     |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `appId`                                                                     | *Optional<? extends String>*                                                | :heavy_minus_sign:                                                          | N/A                                                                         | app-af469a92-5b45-4565-b3c4-b79878de67d2                                    |
| `region`                                                                    | [com.hathora.cloud_sdk.models.shared.Region](../../models/shared/Region.md) | :heavy_check_mark:                                                          | N/A                                                                         |                                                                             |


### Response

**[com.hathora.cloud_sdk.models.operations.CreateProcessResponse](../../models/operations/CreateProcessResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,402,404,429,500    | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## getLatestProcesses

Retrieve the 10 most recent [processes](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `status` or `region`.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_sdk.HathoraCloud;
import com.hathora.cloud_sdk.models.operations.*;
import com.hathora.cloud_sdk.models.shared.*;
import com.hathora.cloud_sdk.utils.EventStream;
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
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            GetLatestProcessesResponse res = sdk.processesV2().getLatestProcesses()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .region(java.util.List.of(
                    Region.TOKYO))
                .status(java.util.List.of(
                    ProcessStatus.DRAINING))
                .call();

            if (res.classes().isPresent()) {
                // handle response
            }
        } catch (com.hathora.cloud_sdk.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_sdk.models.errors.SDKError e) {
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
| `region`                                                                                        | List<[com.hathora.cloud_sdk.models.shared.Region](../../models/shared/Region.md)>               | :heavy_minus_sign:                                                                              | N/A                                                                                             |                                                                                                 |
| `status`                                                                                        | List<[com.hathora.cloud_sdk.models.shared.ProcessStatus](../../models/shared/ProcessStatus.md)> | :heavy_minus_sign:                                                                              | N/A                                                                                             |                                                                                                 |


### Response

**[com.hathora.cloud_sdk.models.operations.GetLatestProcessesResponse](../../models/operations/GetLatestProcessesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## getProcessInfo

Get details for a [process](https://hathora.dev/docs/concepts/hathora-entities#process).

### Example Usage

```java
package hello.world;

import com.hathora.cloud_sdk.HathoraCloud;
import com.hathora.cloud_sdk.models.operations.*;
import com.hathora.cloud_sdk.models.shared.*;
import com.hathora.cloud_sdk.utils.EventStream;
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
        } catch (com.hathora.cloud_sdk.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_sdk.models.errors.SDKError e) {
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

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional<? extends String>*             | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `processId`                              | *String*                                 | :heavy_check_mark:                       | N/A                                      | cbfcddd2-0006-43ae-996c-995fff7bed2e     |


### Response

**[com.hathora.cloud_sdk.models.operations.GetProcessInfoResponse](../../models/operations/GetProcessInfoResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## stopProcess

Stops a [process](https://hathora.dev/docs/concepts/hathora-entities#process) immediately.

### Example Usage

```java
package hello.world;

import com.hathora.cloud_sdk.HathoraCloud;
import com.hathora.cloud_sdk.models.operations.*;
import com.hathora.cloud_sdk.models.shared.*;
import com.hathora.cloud_sdk.utils.EventStream;
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
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            StopProcessResponse res = sdk.processesV2().stopProcess()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .processId("cbfcddd2-0006-43ae-996c-995fff7bed2e")
                .call();

            // handle response
        } catch (com.hathora.cloud_sdk.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_sdk.models.errors.SDKError e) {
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

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `appId`                                  | *Optional<? extends String>*             | :heavy_minus_sign:                       | N/A                                      | app-af469a92-5b45-4565-b3c4-b79878de67d2 |
| `processId`                              | *String*                                 | :heavy_check_mark:                       | N/A                                      | cbfcddd2-0006-43ae-996c-995fff7bed2e     |


### Response

**[com.hathora.cloud_sdk.models.operations.StopProcessResponse](../../models/operations/StopProcessResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429,500        | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
