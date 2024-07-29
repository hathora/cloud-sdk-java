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


public class GetActiveRoomsForProcessDeprecatedRequestBuilder {

    private Optional<? extends String> appId = Optional.empty();
    private String processId;
    private final SDKMethodInterfaces.MethodCallGetActiveRoomsForProcessDeprecated sdk;

    public GetActiveRoomsForProcessDeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallGetActiveRoomsForProcessDeprecated sdk) {
        this.sdk = sdk;
    }
                
    public GetActiveRoomsForProcessDeprecatedRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public GetActiveRoomsForProcessDeprecatedRequestBuilder appId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetActiveRoomsForProcessDeprecatedRequestBuilder processId(String processId) {
        Utils.checkNotNull(processId, "processId");
        this.processId = processId;
        return this;
    }

    public GetActiveRoomsForProcessDeprecatedResponse call() throws Exception {

        return sdk.getActiveRoomsForProcessDeprecated(
            appId,
            processId);
    }
}
