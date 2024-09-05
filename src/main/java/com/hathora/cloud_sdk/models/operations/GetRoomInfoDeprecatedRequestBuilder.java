/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;

import com.hathora.cloud_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetRoomInfoDeprecatedRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private String roomId;
    private final SDKMethodInterfaces.MethodCallGetRoomInfoDeprecated sdk;

    public GetRoomInfoDeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallGetRoomInfoDeprecated sdk) {
        this.sdk = sdk;
    }
                
    public GetRoomInfoDeprecatedRequestBuilder appId(java.lang.String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public GetRoomInfoDeprecatedRequestBuilder appId(java.util.Optional<java.lang.String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetRoomInfoDeprecatedRequestBuilder roomId(java.lang.String roomId) {
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