# ManagementV1
(*managementV1*)

### Available Operations

* [sendVerificationEmail](#sendverificationemail)

## sendVerificationEmail

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.SendVerificationEmailResponse;
import dev.hathora.cloud_api.models.shared.Security;
import dev.hathora.cloud_api.models.shared.VerificationEmailRequest;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("dolor") {{
                    auth0 = "";
                }})
                .build();

            dev.hathora.cloud_api.models.shared.VerificationEmailRequest req = new VerificationEmailRequest("natus");            

            SendVerificationEmailResponse res = sdk.managementV1.sendVerificationEmail(req);

            if (res.verificationEmailResponse != null) {
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
| `request`                                                                                                       | [dev.hathora.cloud_api.models.shared.VerificationEmailRequest](../../models/shared/VerificationEmailRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[dev.hathora.cloud_api.models.operations.SendVerificationEmailResponse](../../models/operations/SendVerificationEmailResponse.md)**

