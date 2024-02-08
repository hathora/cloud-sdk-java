/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.utils.Utils;
import dev.hathora.cloud_api.utils.LazySingletonValue;

public class GetRoomInfoDeprecatedRequestBuilder {

    private Optional<? extends String> appId = Optional.empty();
    private String roomId;

    private final SDKMethodInterfaces.MethodCallGetRoomInfoDeprecated sdk;
    
    public GetRoomInfoDeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallGetRoomInfoDeprecated sdk) {
        this.sdk = sdk;
    }
                
    public GetRoomInfoDeprecatedRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }
             
    public GetRoomInfoDeprecatedRequestBuilder appId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }
             
    public GetRoomInfoDeprecatedRequestBuilder roomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
        return this;
    }

    public GetRoomInfoDeprecatedResponse call() throws Exception {
        return sdk.getRoomInfoDeprecated(
            appId,
            roomId);
    }
}