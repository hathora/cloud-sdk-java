# ManagementV1
(*managementV1()*)

## Overview

 

### Available Operations

* [sendVerificationEmail](#sendverificationemail)

## sendVerificationEmail

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.SDKError;
import dev.hathora.cloud_sdk.models.operations.SendVerificationEmailResponse;
import dev.hathora.cloud_sdk.models.shared.VerificationEmailRequest;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            VerificationEmailRequest req = VerificationEmailRequest.builder()
                .userId("<value>")
                .build();

            SendVerificationEmailResponse res = sdk.managementV1().sendVerificationEmail()
                .request(req)
                .call();

            if (res.verificationEmailSuccess().isPresent()) {
                // handle response
            }
        } catch (dev.hathora.cloud_sdk.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [VerificationEmailRequest](../../models/shared/VerificationEmailRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[SendVerificationEmailResponse](../../models/operations/SendVerificationEmailResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,429,500            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
