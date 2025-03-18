/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class GetProcessRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private String processId;
    private final SDKMethodInterfaces.MethodCallGetProcess sdk;

    public GetProcessRequestBuilder(SDKMethodInterfaces.MethodCallGetProcess sdk) {
        this.sdk = sdk;
    }
                
    public GetProcessRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public GetProcessRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetProcessRequestBuilder processId(String processId) {
        Utils.checkNotNull(processId, "processId");
        this.processId = processId;
        return this;
    }

    public GetProcessResponse call() throws Exception {

        return sdk.getProcess(
            appId,
            processId);
    }
}
