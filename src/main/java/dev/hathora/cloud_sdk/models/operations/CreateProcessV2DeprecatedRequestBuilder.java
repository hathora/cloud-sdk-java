/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class CreateProcessV2DeprecatedRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private Region region;
    private final SDKMethodInterfaces.MethodCallCreateProcessV2Deprecated sdk;

    public CreateProcessV2DeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallCreateProcessV2Deprecated sdk) {
        this.sdk = sdk;
    }
                
    public CreateProcessV2DeprecatedRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public CreateProcessV2DeprecatedRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public CreateProcessV2DeprecatedRequestBuilder region(Region region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    public CreateProcessV2DeprecatedResponse call() throws Exception {

        return sdk.createProcessV2Deprecated(
            appId,
            region);
    }
}
