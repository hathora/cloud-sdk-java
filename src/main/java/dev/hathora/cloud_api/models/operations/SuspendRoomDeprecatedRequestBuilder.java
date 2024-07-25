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


public class SuspendRoomDeprecatedRequestBuilder {

    private Optional<? extends String> appId = Optional.empty();
    private String roomId;
    private final SDKMethodInterfaces.MethodCallSuspendRoomDeprecated sdk;

    public SuspendRoomDeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallSuspendRoomDeprecated sdk) {
        this.sdk = sdk;
    }
                
    public SuspendRoomDeprecatedRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public SuspendRoomDeprecatedRequestBuilder appId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public SuspendRoomDeprecatedRequestBuilder roomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
        return this;
    }

    public SuspendRoomDeprecatedResponse call() throws Exception {

        return sdk.suspendRoomDeprecated(
            appId,
            roomId);
    }
}
