/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.hathora_cloud_sdk.models.operations;

import com.hathora.hathora_cloud_sdk.models.shared.Region;
import com.hathora.hathora_cloud_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class ListActivePublicLobbiesRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private Optional<? extends Region> region = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListActivePublicLobbies sdk;

    public ListActivePublicLobbiesRequestBuilder(SDKMethodInterfaces.MethodCallListActivePublicLobbies sdk) {
        this.sdk = sdk;
    }
                
    public ListActivePublicLobbiesRequestBuilder appId(java.lang.String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public ListActivePublicLobbiesRequestBuilder appId(java.util.Optional<java.lang.String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }
                
    public ListActivePublicLobbiesRequestBuilder region(com.hathora.hathora_cloud_sdk.models.shared.Region region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.of(region);
        return this;
    }

    public ListActivePublicLobbiesRequestBuilder region(java.util.Optional<? extends com.hathora.hathora_cloud_sdk.models.shared.Region> region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    public ListActivePublicLobbiesResponse call() throws Exception {

        return sdk.listActivePublicLobbies(
            appId,
            region);
    }
}