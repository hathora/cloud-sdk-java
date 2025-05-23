/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class GetBuildsDeprecatedRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetBuildsDeprecated sdk;

    public GetBuildsDeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallGetBuildsDeprecated sdk) {
        this.sdk = sdk;
    }
                
    public GetBuildsDeprecatedRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public GetBuildsDeprecatedRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetBuildsDeprecatedResponse call() throws Exception {

        return sdk.getBuildsDeprecated(
            appId);
    }
}
