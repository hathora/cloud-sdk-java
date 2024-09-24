/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.models.shared.ProcessStatus;
import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public class GetLatestProcessesV2DeprecatedRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private Optional<? extends List<Region>> region = Optional.empty();
    private Optional<? extends List<ProcessStatus>> status = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetLatestProcessesV2Deprecated sdk;

    public GetLatestProcessesV2DeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallGetLatestProcessesV2Deprecated sdk) {
        this.sdk = sdk;
    }
                
    public GetLatestProcessesV2DeprecatedRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public GetLatestProcessesV2DeprecatedRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }
                
    public GetLatestProcessesV2DeprecatedRequestBuilder region(List<Region> region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.of(region);
        return this;
    }

    public GetLatestProcessesV2DeprecatedRequestBuilder region(Optional<? extends List<Region>> region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }
                
    public GetLatestProcessesV2DeprecatedRequestBuilder status(List<ProcessStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.of(status);
        return this;
    }

    public GetLatestProcessesV2DeprecatedRequestBuilder status(Optional<? extends List<ProcessStatus>> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public GetLatestProcessesV2DeprecatedResponse call() throws Exception {

        return sdk.getLatestProcessesV2Deprecated(
            appId,
            region,
            status);
    }
}
