/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.hathora_cloud_sdk.models.operations;

import com.hathora.hathora_cloud_sdk.utils.Utils;

public class GetMetricsRequestBuilder {

    private GetMetricsRequest request;
    private final SDKMethodInterfaces.MethodCallGetMetrics sdk;

    public GetMetricsRequestBuilder(SDKMethodInterfaces.MethodCallGetMetrics sdk) {
        this.sdk = sdk;
    }

    public GetMetricsRequestBuilder request(com.hathora.hathora_cloud_sdk.models.operations.GetMetricsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetMetricsResponse call() throws Exception {

        return sdk.getMetrics(
            request);
    }
}