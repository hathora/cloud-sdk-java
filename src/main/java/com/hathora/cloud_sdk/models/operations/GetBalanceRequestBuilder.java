/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;


public class GetBalanceRequestBuilder {

    private final SDKMethodInterfaces.MethodCallGetBalance sdk;

    public GetBalanceRequestBuilder(SDKMethodInterfaces.MethodCallGetBalance sdk) {
        this.sdk = sdk;
    }

    public GetBalanceResponse call() throws Exception {

        return sdk.getBalanceDirect();
    }
}
