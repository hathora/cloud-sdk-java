/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class GetActiveRoomsForProcessDeprecatedRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private String processId;
    private final SDKMethodInterfaces.MethodCallGetActiveRoomsForProcessDeprecated sdk;

    public GetActiveRoomsForProcessDeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallGetActiveRoomsForProcessDeprecated sdk) {
        this.sdk = sdk;
    }
                
    public GetActiveRoomsForProcessDeprecatedRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public GetActiveRoomsForProcessDeprecatedRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetActiveRoomsForProcessDeprecatedRequestBuilder processId(String processId) {
        Utils.checkNotNull(processId, "processId");
        this.processId = processId;
        return this;
    }

    public GetActiveRoomsForProcessDeprecatedResponse call() throws Exception {

        return sdk.getActiveRoomsForProcessDeprecated(
            appId,
            processId);
    }
}
