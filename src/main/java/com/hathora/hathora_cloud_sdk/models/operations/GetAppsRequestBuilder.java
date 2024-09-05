/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.hathora_cloud_sdk.models.operations;

import com.hathora.hathora_cloud_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetAppsRequestBuilder {

    private Optional<String> orgId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetApps sdk;

    public GetAppsRequestBuilder(SDKMethodInterfaces.MethodCallGetApps sdk) {
        this.sdk = sdk;
    }
                
    public GetAppsRequestBuilder orgId(java.lang.String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = Optional.of(orgId);
        return this;
    }

    public GetAppsRequestBuilder orgId(java.util.Optional<java.lang.String> orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    public GetAppsResponse call() throws Exception {

        return sdk.getApps(
            orgId);
    }
}