/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;

import com.hathora.cloud_sdk.utils.Utils;

public class CreateLobbyRequestBuilder {

    private CreateLobbyRequest request;
    private CreateLobbySecurity security;
    private final SDKMethodInterfaces.MethodCallCreateLobby sdk;

    public CreateLobbyRequestBuilder(SDKMethodInterfaces.MethodCallCreateLobby sdk) {
        this.sdk = sdk;
    }

    public CreateLobbyRequestBuilder request(com.hathora.cloud_sdk.models.operations.CreateLobbyRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateLobbyRequestBuilder security(CreateLobbySecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }

    public CreateLobbyResponse call() throws Exception {

        return sdk.createLobby(
            request,
            security);
    }
}
