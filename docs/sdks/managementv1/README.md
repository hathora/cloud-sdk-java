# ManagementV1
(*managementV1()*)

## Overview

 

### Available Operations

* [sendVerificationEmail](#sendverificationemail)

## sendVerificationEmail

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

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.hathora.cloud_sdk.models.shared.VerificationEmailRequest](../../models/shared/VerificationEmailRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[com.hathora.cloud_sdk.models.operations.SendVerificationEmailResponse](../../models/operations/SendVerificationEmailResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,429,500            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
