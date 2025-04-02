/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class GetInvoicesRequestBuilder {

    private Optional<String> orgId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetInvoices sdk;

    public GetInvoicesRequestBuilder(SDKMethodInterfaces.MethodCallGetInvoices sdk) {
        this.sdk = sdk;
    }
                
    public GetInvoicesRequestBuilder orgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = Optional.of(orgId);
        return this;
    }

    public GetInvoicesRequestBuilder orgId(Optional<String> orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    public GetInvoicesResponse call() throws Exception {

        return sdk.getInvoices(
            orgId);
    }
}
