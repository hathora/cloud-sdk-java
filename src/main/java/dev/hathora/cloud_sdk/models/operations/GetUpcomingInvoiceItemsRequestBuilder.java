/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;


public class GetUpcomingInvoiceItemsRequestBuilder {

    private final SDKMethodInterfaces.MethodCallGetUpcomingInvoiceItems sdk;

    public GetUpcomingInvoiceItemsRequestBuilder(SDKMethodInterfaces.MethodCallGetUpcomingInvoiceItems sdk) {
        this.sdk = sdk;
    }

    public GetUpcomingInvoiceItemsResponse call() throws Exception {

        return sdk.getUpcomingInvoiceItemsDirect();
    }
}