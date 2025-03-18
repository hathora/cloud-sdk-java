/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.models.shared.CreateMultipartBuildParams;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class CreateBuildRequestBuilder {

    private CreateMultipartBuildParams createMultipartBuildParams;
    private Optional<String> orgId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateBuild sdk;

    public CreateBuildRequestBuilder(SDKMethodInterfaces.MethodCallCreateBuild sdk) {
        this.sdk = sdk;
    }

    public CreateBuildRequestBuilder createMultipartBuildParams(CreateMultipartBuildParams createMultipartBuildParams) {
        Utils.checkNotNull(createMultipartBuildParams, "createMultipartBuildParams");
        this.createMultipartBuildParams = createMultipartBuildParams;
        return this;
    }
                
    public CreateBuildRequestBuilder orgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = Optional.of(orgId);
        return this;
    }

    public CreateBuildRequestBuilder orgId(Optional<String> orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    public CreateBuildResponse call() throws Exception {

        return sdk.createBuild(
            createMultipartBuildParams,
            orgId);
    }
}
