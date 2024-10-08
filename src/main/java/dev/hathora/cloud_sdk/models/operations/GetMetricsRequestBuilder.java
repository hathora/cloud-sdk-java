/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.utils.Utils;

public class GetMetricsRequestBuilder {

    private GetMetricsRequest request;
    private final SDKMethodInterfaces.MethodCallGetMetrics sdk;

    public GetMetricsRequestBuilder(SDKMethodInterfaces.MethodCallGetMetrics sdk) {
        this.sdk = sdk;
    }

    public GetMetricsRequestBuilder request(GetMetricsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetMetricsResponse call() throws Exception {

        return sdk.getMetrics(
            request);
    }
}
