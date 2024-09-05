/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;

import com.hathora.cloud_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class CreatePrivateLobbyRequestBuilder {

    private CreatePrivateLobbySecurity security;
    private CreatePrivateLobbyRequestBody requestBody;
    private Optional<String> appId = Optional.empty();
    private Optional<String> roomId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreatePrivateLobby sdk;

    public CreatePrivateLobbyRequestBuilder(SDKMethodInterfaces.MethodCallCreatePrivateLobby sdk) {
        this.sdk = sdk;
    }

    public CreatePrivateLobbyRequestBuilder security(CreatePrivateLobbySecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }

    public CreatePrivateLobbyRequestBuilder requestBody(com.hathora.cloud_sdk.models.operations.CreatePrivateLobbyRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }
                
    public CreatePrivateLobbyRequestBuilder appId(java.lang.String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public CreatePrivateLobbyRequestBuilder appId(java.util.Optional<java.lang.String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }
                
    public CreatePrivateLobbyRequestBuilder roomId(java.lang.String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = Optional.of(roomId);
        return this;
    }

    public CreatePrivateLobbyRequestBuilder roomId(java.util.Optional<java.lang.String> roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
        return this;
    }

    public CreatePrivateLobbyResponse call() throws Exception {

        return sdk.createPrivateLobby(
            security,
            requestBody,
            appId,
            roomId);
    }
}
