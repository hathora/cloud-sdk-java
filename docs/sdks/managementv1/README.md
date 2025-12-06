# ManagementV1

## Overview

 

### Available Operations

* [sendVerificationEmail](#sendverificationemail) - SendVerificationEmail

## sendVerificationEmail

SendVerificationEmail

### Example Usage

<!-- UsageSnippet language="java" operationID="SendVerificationEmail" method="post" path="/management/v1/sendverificationemail" -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.SendVerificationEmailResponse;
import dev.hathora.cloud_sdk.models.shared.VerificationEmailRequest;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
            .build();

        VerificationEmailRequest req = VerificationEmailRequest.builder()
                .userId("<id>")
                .build();

        SendVerificationEmailResponse res = sdk.managementV1().sendVerificationEmail()
                .request(req)
                .call();

        if (res.verificationEmailSuccess().isPresent()) {
            // handle response
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

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401, 408, 429          | application/json       |
| models/errors/ApiError | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |