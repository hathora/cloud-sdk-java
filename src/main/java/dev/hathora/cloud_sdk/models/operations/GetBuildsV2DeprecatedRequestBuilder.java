/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class GetBuildsV2DeprecatedRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetBuildsV2Deprecated sdk;

    public GetBuildsV2DeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallGetBuildsV2Deprecated sdk) {
        this.sdk = sdk;
    }
                
    public GetBuildsV2DeprecatedRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public GetBuildsV2DeprecatedRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetBuildsV2DeprecatedResponse call() throws Exception {

        return sdk.getBuildsV2Deprecated(
            appId);
    }
}
