/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class ListActivePublicLobbiesDeprecatedV2RequestBuilder {

    private Optional<String> appId = Optional.empty();
    private Optional<? extends Region> region = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListActivePublicLobbiesDeprecatedV2 sdk;

    public ListActivePublicLobbiesDeprecatedV2RequestBuilder(SDKMethodInterfaces.MethodCallListActivePublicLobbiesDeprecatedV2 sdk) {
        this.sdk = sdk;
    }
                
    public ListActivePublicLobbiesDeprecatedV2RequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public ListActivePublicLobbiesDeprecatedV2RequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }
                
    public ListActivePublicLobbiesDeprecatedV2RequestBuilder region(Region region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.of(region);
        return this;
    }

    public ListActivePublicLobbiesDeprecatedV2RequestBuilder region(Optional<? extends Region> region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    public ListActivePublicLobbiesDeprecatedV2Response call() throws Exception {

        return sdk.listActivePublicLobbiesDeprecatedV2(
            appId,
            region);
    }
}
