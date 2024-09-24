/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.models.shared.CreateOrgToken;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.String;

public class CreateOrgTokenRequestBuilder {

    private CreateOrgToken createOrgToken;
    private String orgId;
    private final SDKMethodInterfaces.MethodCallCreateOrgToken sdk;

    public CreateOrgTokenRequestBuilder(SDKMethodInterfaces.MethodCallCreateOrgToken sdk) {
        this.sdk = sdk;
    }

    public CreateOrgTokenRequestBuilder createOrgToken(CreateOrgToken createOrgToken) {
        Utils.checkNotNull(createOrgToken, "createOrgToken");
        this.createOrgToken = createOrgToken;
        return this;
    }

    public CreateOrgTokenRequestBuilder orgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    public CreateOrgTokenResponse call() throws Exception {

        return sdk.createOrgToken(
            createOrgToken,
            orgId);
    }
}
