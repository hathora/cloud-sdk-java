<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateAppResponse;
import dev.hathora.cloud_sdk.models.shared.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        CreateAppResponse res = sdk.appsV2().createApp()
                .appConfig(AppConfig.builder()
                    .appName("minecraft")
                    .authConfiguration(AuthConfiguration.builder()
                        .build())
                    .build())
                .call();

        if (res.application().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->