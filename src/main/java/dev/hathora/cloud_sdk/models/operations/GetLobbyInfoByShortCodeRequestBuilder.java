/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class GetLobbyInfoByShortCodeRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private String shortCode;
    private final SDKMethodInterfaces.MethodCallGetLobbyInfoByShortCode sdk;

    public GetLobbyInfoByShortCodeRequestBuilder(SDKMethodInterfaces.MethodCallGetLobbyInfoByShortCode sdk) {
        this.sdk = sdk;
    }
                
    public GetLobbyInfoByShortCodeRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public GetLobbyInfoByShortCodeRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetLobbyInfoByShortCodeRequestBuilder shortCode(String shortCode) {
        Utils.checkNotNull(shortCode, "shortCode");
        this.shortCode = shortCode;
        return this;
    }

    public GetLobbyInfoByShortCodeResponse call() throws Exception {

        return sdk.getLobbyInfoByShortCode(
            appId,
            shortCode);
    }
}
