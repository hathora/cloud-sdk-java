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


public class GetRoomInfoRequestBuilder {

    private Optional<? extends String> appId = Optional.empty();
    private String roomId;
    private final SDKMethodInterfaces.MethodCallGetRoomInfo sdk;

    public GetRoomInfoRequestBuilder(SDKMethodInterfaces.MethodCallGetRoomInfo sdk) {
        this.sdk = sdk;
    }
                
    public GetRoomInfoRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public GetRoomInfoRequestBuilder appId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetRoomInfoRequestBuilder roomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
        return this;
    }

    public GetRoomInfoResponse call() throws Exception {

        return sdk.getRoomInfo(
            appId,
            roomId);
    }
}
