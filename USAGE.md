<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.hathora.cloud_api.HathoraCloud;
import com.hathora.cloud_api.models.operations.*;
import com.hathora.cloud_api.models.shared.*;
import com.hathora.cloud_api.models.shared.Security;
import com.hathora.cloud_api.utils.EventStream;
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

            AppConfig req = AppConfig.builder()
                .appName("minecraft")
                .authConfiguration(AuthConfiguration.builder()
                        .build())
                .build();

            CreateAppResponse res = sdk.appsV1().createApp()
                .request(req)
                .call();

            if (res.application().isPresent()) {
                // handle response
            }
        } catch (com.hathora.cloud_api.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_api.models.errors.SDKError e) {
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