/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.models.errors.SDKError;
import dev.hathora.cloud_api.utils.LazySingletonValue;
import dev.hathora.cloud_api.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class UpdateAppRequestBuilder {

    private dev.hathora.cloud_api.models.shared.AppConfig appConfig;
    private Optional<? extends String> appId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallUpdateApp sdk;

    public UpdateAppRequestBuilder(SDKMethodInterfaces.MethodCallUpdateApp sdk) {
        this.sdk = sdk;
    }

    public UpdateAppRequestBuilder appConfig(dev.hathora.cloud_api.models.shared.AppConfig appConfig) {
        Utils.checkNotNull(appConfig, "appConfig");
        this.appConfig = appConfig;
        return this;
    }
                
    public UpdateAppRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public UpdateAppRequestBuilder appId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public UpdateAppResponse call() throws Exception {

        return sdk.updateApp(
            appConfig,
            appId);
    }
}
