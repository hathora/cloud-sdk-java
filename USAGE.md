<!-- Start SDK Example Usage -->


```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.CreateAppResponse;
import dev.hathora.cloud_api.models.shared.AppConfig;
import dev.hathora.cloud_api.models.shared.AppConfigAuthConfiguration;
import dev.hathora.cloud_api.models.shared.AppConfigAuthConfigurationGoogle;
import dev.hathora.cloud_api.models.shared.RecordStringNever;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("newton") {{
                    auth0 = "";
                }})
                .build();

            dev.hathora.cloud_api.models.shared.AppConfig req = new AppConfig("minecraft",                 new AppConfigAuthConfiguration() {{
                                anonymous = new RecordStringNever();;
                                google = new AppConfigAuthConfigurationGoogle("Representative");;
                                nickname = new RecordStringNever();;
                            }};);            

            CreateAppResponse res = sdk.appV1.createApp(req);

            if (res.application != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->