/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class GetPaymentMethodRequestBuilder {

    private Optional<String> orgId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetPaymentMethod sdk;

    public GetPaymentMethodRequestBuilder(SDKMethodInterfaces.MethodCallGetPaymentMethod sdk) {
        this.sdk = sdk;
    }
                
    public GetPaymentMethodRequestBuilder orgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = Optional.of(orgId);
        return this;
    }

    public GetPaymentMethodRequestBuilder orgId(Optional<String> orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    public GetPaymentMethodResponse call() throws Exception {

        return sdk.getPaymentMethod(
            orgId);
    }
}
