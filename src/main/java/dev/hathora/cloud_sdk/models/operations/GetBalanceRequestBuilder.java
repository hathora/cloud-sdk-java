/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetBalanceRequestBuilder {

    private Optional<String> orgId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetBalance sdk;

    public GetBalanceRequestBuilder(SDKMethodInterfaces.MethodCallGetBalance sdk) {
        this.sdk = sdk;
    }
                
    public GetBalanceRequestBuilder orgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = Optional.of(orgId);
        return this;
    }

    public GetBalanceRequestBuilder orgId(Optional<String> orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    public GetBalanceResponse call() throws Exception {

        return sdk.getBalance(
            orgId);
    }
}
