/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetLobbyInfoByRoomIdRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private String roomId;
    private final SDKMethodInterfaces.MethodCallGetLobbyInfoByRoomId sdk;

    public GetLobbyInfoByRoomIdRequestBuilder(SDKMethodInterfaces.MethodCallGetLobbyInfoByRoomId sdk) {
        this.sdk = sdk;
    }
                
    public GetLobbyInfoByRoomIdRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public GetLobbyInfoByRoomIdRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetLobbyInfoByRoomIdRequestBuilder roomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
        return this;
    }

    public GetLobbyInfoByRoomIdResponse call() throws Exception {

        return sdk.getLobbyInfoByRoomId(
            appId,
            roomId);
    }
}
