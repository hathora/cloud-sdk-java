/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;

public class GetOrgTokensRequestBuilder {

    private String orgId;
    private final SDKMethodInterfaces.MethodCallGetOrgTokens sdk;

    public GetOrgTokensRequestBuilder(SDKMethodInterfaces.MethodCallGetOrgTokens sdk) {
        this.sdk = sdk;
    }

    public GetOrgTokensRequestBuilder orgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    public GetOrgTokensResponse call() throws Exception {

        return sdk.getOrgTokens(
            orgId);
    }
}
