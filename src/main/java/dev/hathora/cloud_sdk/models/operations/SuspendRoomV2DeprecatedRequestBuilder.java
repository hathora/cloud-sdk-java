/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class SuspendRoomV2DeprecatedRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private String roomId;
    private final SDKMethodInterfaces.MethodCallSuspendRoomV2Deprecated sdk;

    public SuspendRoomV2DeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallSuspendRoomV2Deprecated sdk) {
        this.sdk = sdk;
    }
                
    public SuspendRoomV2DeprecatedRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public SuspendRoomV2DeprecatedRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public SuspendRoomV2DeprecatedRequestBuilder roomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
        return this;
    }

    public SuspendRoomV2DeprecatedResponse call() throws Exception {

        return sdk.suspendRoomV2Deprecated(
            appId,
            roomId);
    }
}
