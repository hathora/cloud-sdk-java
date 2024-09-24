/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetInactiveRoomsForProcessRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private String processId;
    private final SDKMethodInterfaces.MethodCallGetInactiveRoomsForProcess sdk;

    public GetInactiveRoomsForProcessRequestBuilder(SDKMethodInterfaces.MethodCallGetInactiveRoomsForProcess sdk) {
        this.sdk = sdk;
    }
                
    public GetInactiveRoomsForProcessRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public GetInactiveRoomsForProcessRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetInactiveRoomsForProcessRequestBuilder processId(String processId) {
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
