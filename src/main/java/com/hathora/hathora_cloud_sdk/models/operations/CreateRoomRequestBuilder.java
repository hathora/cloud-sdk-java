/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.hathora_cloud_sdk.models.operations;

import com.hathora.hathora_cloud_sdk.models.shared.CreateRoomParams;
import com.hathora.hathora_cloud_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class CreateRoomRequestBuilder {

    private CreateRoomParams createRoomParams;
    private Optional<String> appId = Optional.empty();
    private Optional<String> roomId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateRoom sdk;

    public CreateRoomRequestBuilder(SDKMethodInterfaces.MethodCallCreateRoom sdk) {
        this.sdk = sdk;
    }

    public CreateRoomRequestBuilder createRoomParams(com.hathora.hathora_cloud_sdk.models.shared.CreateRoomParams createRoomParams) {
        Utils.checkNotNull(createRoomParams, "createRoomParams");
        this.createRoomParams = createRoomParams;
        return this;
    }
                
    public CreateRoomRequestBuilder appId(java.lang.String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public CreateRoomRequestBuilder appId(java.util.Optional<java.lang.String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }
                
    public CreateRoomRequestBuilder roomId(java.lang.String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = Optional.of(roomId);
        return this;
    }

    public CreateRoomRequestBuilder roomId(java.util.Optional<java.lang.String> roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
        return this;
    }

    public CreateRoomResponse call() throws Exception {

        return sdk.createRoom(
            createRoomParams,
            appId,
            roomId);
    }
}