# ManagementV1
(*managementV1()*)

### Available Operations

* [sendVerificationEmail](#sendverificationemail)

## sendVerificationEmail

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.SendVerificationEmailResponse;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.VerificationEmailRequest;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
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

            if (res.verificationEmailResponse().isPresent()) {
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

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [dev.hathora.cloud_api.models.shared.VerificationEmailRequest](../../models/shared/VerificationEmailRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[Optional<? extends dev.hathora.cloud_api.models.operations.SendVerificationEmailResponse>](../../models/operations/SendVerificationEmailResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
