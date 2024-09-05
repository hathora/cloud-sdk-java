/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;

import com.hathora.cloud_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetInactiveRoomsForProcessRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private String processId;
    private final SDKMethodInterfaces.MethodCallGetInactiveRoomsForProcess sdk;

    public GetInactiveRoomsForProcessRequestBuilder(SDKMethodInterfaces.MethodCallGetInactiveRoomsForProcess sdk) {
        this.sdk = sdk;
    }
                
    public GetInactiveRoomsForProcessRequestBuilder appId(java.lang.String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public GetInactiveRoomsForProcessRequestBuilder appId(java.util.Optional<java.lang.String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetInactiveRoomsForProcessRequestBuilder processId(java.lang.String processId) {
        Utils.checkNotNull(processId, "processId");
        this.processId = processId;
        return this;
    }

    public GetInactiveRoomsForProcessResponse call() throws Exception {

        return sdk.getInactiveRoomsForProcess(
            appId,
            processId);
    }
}
