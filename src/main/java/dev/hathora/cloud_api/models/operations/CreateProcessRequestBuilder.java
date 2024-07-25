/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
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


public class CreateProcessRequestBuilder {

    private Optional<? extends String> appId = Optional.empty();
    private dev.hathora.cloud_api.models.shared.Region region;
    private final SDKMethodInterfaces.MethodCallCreateProcess sdk;

    public CreateProcessRequestBuilder(SDKMethodInterfaces.MethodCallCreateProcess sdk) {
        this.sdk = sdk;
    }
                
    public CreateProcessRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public CreateProcessRequestBuilder appId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public CreateProcessRequestBuilder region(dev.hathora.cloud_api.models.shared.Region region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    public CreateProcessResponse call() throws Exception {

        return sdk.createProcess(
            appId,
            region);
    }
}
