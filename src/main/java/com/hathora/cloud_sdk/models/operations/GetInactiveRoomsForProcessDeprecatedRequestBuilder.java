/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.hathora.cloud_sdk.models.errors.SDKError;
import com.hathora.cloud_sdk.utils.LazySingletonValue;
import com.hathora.cloud_sdk.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetInactiveRoomsForProcessDeprecatedRequestBuilder {

    private Optional<? extends String> appId = Optional.empty();
    private String processId;
    private final SDKMethodInterfaces.MethodCallGetInactiveRoomsForProcessDeprecated sdk;

    public GetInactiveRoomsForProcessDeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallGetInactiveRoomsForProcessDeprecated sdk) {
        this.sdk = sdk;
    }
                
    public GetInactiveRoomsForProcessDeprecatedRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public GetInactiveRoomsForProcessDeprecatedRequestBuilder appId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetInactiveRoomsForProcessDeprecatedRequestBuilder processId(String processId) {
        Utils.checkNotNull(processId, "processId");
        this.processId = processId;
        return this;
    }

    public GetInactiveRoomsForProcessDeprecatedResponse call() throws Exception {

        return sdk.getInactiveRoomsForProcessDeprecated(
            appId,
            processId);
    }
}