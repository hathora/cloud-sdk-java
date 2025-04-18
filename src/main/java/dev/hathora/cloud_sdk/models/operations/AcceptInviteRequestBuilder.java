/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;

public class AcceptInviteRequestBuilder {

    private String orgId;
    private final SDKMethodInterfaces.MethodCallAcceptInvite sdk;

    public AcceptInviteRequestBuilder(SDKMethodInterfaces.MethodCallAcceptInvite sdk) {
        this.sdk = sdk;
    }

    public AcceptInviteRequestBuilder orgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    public AcceptInviteResponse call() throws Exception {

        return sdk.acceptInvite(
            orgId);
    }
}
