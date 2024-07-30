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


public class GetInactiveRoomsForProcessRequestBuilder {

    private Optional<? extends String> appId = Optional.empty();
    private String processId;
    private final SDKMethodInterfaces.MethodCallGetInactiveRoomsForProcess sdk;

    public GetInactiveRoomsForProcessRequestBuilder(SDKMethodInterfaces.MethodCallGetInactiveRoomsForProcess sdk) {
        this.sdk = sdk;
    }
                
    public GetInactiveRoomsForProcessRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public GetInactiveRoomsForProcessRequestBuilder appId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetInactiveRoomsForProcessRequestBuilder processId(String processId) {
        Utils.checkNotNull(processId, "processId");
        this.processId = processId;
        return this;
    }

    public GetInactiveRoomsForProcessResponse call() throws Exception {

        return sdk.getInactiveRoomsForProcess(
            appId,
            processId);
    }
}
