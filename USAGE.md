<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import dev.hathora.cloud_api.Hathora-Cloud;
import dev.hathora.cloud_api.models.operations.*;
import dev.hathora.cloud_api.models.operations.CreateAppResponse;
import dev.hathora.cloud_api.models.shared.*;
import dev.hathora.cloud_api.models.shared.AppConfig;
import dev.hathora.cloud_api.models.shared.AuthConfiguration;
import dev.hathora.cloud_api.models.shared.Google;
import dev.hathora.cloud_api.models.shared.RecordStringNever;
import dev.hathora.cloud_api.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
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

            AppConfig req = AppConfig.builder()
                .appName("minecraft")
                .authConfiguration(AuthConfiguration.builder()
                        .anonymous(RecordStringNever.builder()
                            .build())
                        .google(Google.builder()
                            .clientId("string")
                            .build())
                        .nickname(RecordStringNever.builder()
                            .build())
                        .build())
                .build();

            CreateAppResponse res = sdk.appV1().createApp()
                .request(req)
                .call();

            if (res.application().isPresent()) {
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
<!-- End SDK Example Usage [usage] -->