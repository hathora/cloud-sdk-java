/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class ResumeRoomRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private String roomId;
    private final SDKMethodInterfaces.MethodCallResumeRoom sdk;

    public ResumeRoomRequestBuilder(SDKMethodInterfaces.MethodCallResumeRoom sdk) {
        this.sdk = sdk;
    }
                
    public ResumeRoomRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public ResumeRoomRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public ResumeRoomRequestBuilder roomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
        return this;
    }

    public ResumeRoomResponse call() throws Exception {

        return sdk.resumeRoom(
            appId,
            roomId);
    }
}
