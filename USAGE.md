<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.hathora.cloud_sdk.HathoraCloud;
import com.hathora.cloud_sdk.models.errors.SDKError;
import com.hathora.cloud_sdk.models.operations.CreateAppV1DeprecatedResponse;
import com.hathora.cloud_sdk.models.shared.AppConfig;
import com.hathora.cloud_sdk.models.shared.AuthConfiguration;
import com.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            AppConfig req = AppConfig.builder()
                .appName("minecraft")
                .authConfiguration(AuthConfiguration.builder()
                    .build())
                .build();

            CreateAppV1DeprecatedResponse res = sdk.appsV1().createAppV1Deprecated()
                .request(req)
                .call();

            if (res.application().isPresent()) {
                // handle response
            }
        } catch (com.hathora.cloud_sdk.models.errors.ApiError e) {
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
<!-- End SDK Example Usage [usage] -->