/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;


public class GetPaymentMethodRequestBuilder {

    private final SDKMethodInterfaces.MethodCallGetPaymentMethod sdk;

    public GetPaymentMethodRequestBuilder(SDKMethodInterfaces.MethodCallGetPaymentMethod sdk) {
        this.sdk = sdk;
    }

    public GetPaymentMethodResponse call() throws Exception {

        return sdk.getPaymentMethodDirect();
    }
}
