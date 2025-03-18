/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.models.shared.CreateBuildParams;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class CreateBuildWithUploadUrlV2DeprecatedRequestBuilder {

    private CreateBuildParams createBuildParams;
    private Optional<String> appId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateBuildWithUploadUrlV2Deprecated sdk;

    public CreateBuildWithUploadUrlV2DeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallCreateBuildWithUploadUrlV2Deprecated sdk) {
        this.sdk = sdk;
    }

    public CreateBuildWithUploadUrlV2DeprecatedRequestBuilder createBuildParams(CreateBuildParams createBuildParams) {
        Utils.checkNotNull(createBuildParams, "createBuildParams");
        this.createBuildParams = createBuildParams;
        return this;
    }
                
    public CreateBuildWithUploadUrlV2DeprecatedRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public CreateBuildWithUploadUrlV2DeprecatedRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public CreateBuildWithUploadUrlV2DeprecatedResponse call() throws Exception {

        return sdk.createBuildWithUploadUrlV2Deprecated(
            createBuildParams,
            appId);
    }
}
