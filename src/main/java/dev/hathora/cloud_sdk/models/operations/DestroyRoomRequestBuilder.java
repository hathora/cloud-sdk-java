/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class DestroyRoomRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private String roomId;
    private final SDKMethodInterfaces.MethodCallDestroyRoom sdk;

    public DestroyRoomRequestBuilder(SDKMethodInterfaces.MethodCallDestroyRoom sdk) {
        this.sdk = sdk;
    }
                
    public DestroyRoomRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public DestroyRoomRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public DestroyRoomRequestBuilder roomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
        return this;
    }

    public DestroyRoomResponse call() throws Exception {

        return sdk.destroyRoom(
            appId,
            roomId);
    }
}
