/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class DestroyRoomDeprecatedRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private String roomId;
    private final SDKMethodInterfaces.MethodCallDestroyRoomDeprecated sdk;

    public DestroyRoomDeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallDestroyRoomDeprecated sdk) {
        this.sdk = sdk;
    }
                
    public DestroyRoomDeprecatedRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public DestroyRoomDeprecatedRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public DestroyRoomDeprecatedRequestBuilder roomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
        return this;
    }

    public DestroyRoomDeprecatedResponse call() throws Exception {

        return sdk.destroyRoomDeprecated(
            appId,
            roomId);
    }
}
