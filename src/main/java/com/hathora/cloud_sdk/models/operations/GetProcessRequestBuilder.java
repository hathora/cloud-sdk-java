/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;

import com.hathora.cloud_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetProcessRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private String processId;
    private final SDKMethodInterfaces.MethodCallGetProcess sdk;

    public GetProcessRequestBuilder(SDKMethodInterfaces.MethodCallGetProcess sdk) {
        this.sdk = sdk;
    }
                
    public GetProcessRequestBuilder appId(java.lang.String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public GetProcessRequestBuilder appId(java.util.Optional<java.lang.String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetProcessRequestBuilder processId(java.lang.String processId) {
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
