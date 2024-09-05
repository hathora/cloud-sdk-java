/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;

import com.hathora.cloud_sdk.models.shared.Region;
import com.hathora.cloud_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetRunningProcessesRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private Optional<? extends Region> region = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetRunningProcesses sdk;

    public GetRunningProcessesRequestBuilder(SDKMethodInterfaces.MethodCallGetRunningProcesses sdk) {
        this.sdk = sdk;
    }
                
    public GetRunningProcessesRequestBuilder appId(java.lang.String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public GetRunningProcessesRequestBuilder appId(java.util.Optional<java.lang.String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }
                
    public GetRunningProcessesRequestBuilder region(com.hathora.cloud_sdk.models.shared.Region region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.of(region);
        return this;
    }

    public GetRunningProcessesRequestBuilder region(java.util.Optional<? extends com.hathora.cloud_sdk.models.shared.Region> region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    public GetRunningProcessesResponse call() throws Exception {

        return sdk.getRunningProcesses(
            appId,
            region);
    }
}
