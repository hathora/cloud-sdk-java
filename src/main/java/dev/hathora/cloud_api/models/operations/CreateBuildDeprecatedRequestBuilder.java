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


public class CreateBuildDeprecatedRequestBuilder {

    private dev.hathora.cloud_api.models.shared.CreateBuildParams createBuildParams;
    private Optional<? extends String> appId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateBuildDeprecated sdk;

    public CreateBuildDeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallCreateBuildDeprecated sdk) {
        this.sdk = sdk;
    }

    public CreateBuildDeprecatedRequestBuilder createBuildParams(dev.hathora.cloud_api.models.shared.CreateBuildParams createBuildParams) {
        Utils.checkNotNull(createBuildParams, "createBuildParams");
        this.createBuildParams = createBuildParams;
        return this;
    }
                
    public CreateBuildDeprecatedRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public CreateBuildDeprecatedRequestBuilder appId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public CreateBuildDeprecatedResponse call() throws Exception {

        return sdk.createBuildDeprecated(
            createBuildParams,
            appId);
    }
}
