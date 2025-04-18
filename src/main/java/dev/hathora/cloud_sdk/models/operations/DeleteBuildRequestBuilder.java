/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class DeleteBuildRequestBuilder {

    private String buildId;
    private Optional<String> orgId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallDeleteBuild sdk;

    public DeleteBuildRequestBuilder(SDKMethodInterfaces.MethodCallDeleteBuild sdk) {
        this.sdk = sdk;
    }

    public DeleteBuildRequestBuilder buildId(String buildId) {
        Utils.checkNotNull(buildId, "buildId");
        this.buildId = buildId;
        return this;
    }
                
    public DeleteBuildRequestBuilder orgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = Optional.of(orgId);
        return this;
    }

    public DeleteBuildRequestBuilder orgId(Optional<String> orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    public DeleteBuildResponse call() throws Exception {

        return sdk.deleteBuild(
            buildId,
            orgId);
    }
}
