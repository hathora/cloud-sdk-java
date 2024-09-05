/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;

import com.hathora.cloud_sdk.utils.Utils;

public class GetLogsForAppRequestBuilder {

    private GetLogsForAppRequest request;
    private final SDKMethodInterfaces.MethodCallGetLogsForApp sdk;

    public GetLogsForAppRequestBuilder(SDKMethodInterfaces.MethodCallGetLogsForApp sdk) {
        this.sdk = sdk;
    }

    public GetLogsForAppRequestBuilder request(com.hathora.cloud_sdk.models.operations.GetLogsForAppRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetLogsForAppResponse call() throws Exception {

        return sdk.getLogsForApp(
            request);
    }
}
