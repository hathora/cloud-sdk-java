/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;

public class GetLatestProcessesRequestBuilder {

    private GetLatestProcessesRequest request;
    private final SDKMethodInterfaces.MethodCallGetLatestProcesses sdk;

    public GetLatestProcessesRequestBuilder(SDKMethodInterfaces.MethodCallGetLatestProcesses sdk) {
        this.sdk = sdk;
    }

    public GetLatestProcessesRequestBuilder request(GetLatestProcessesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetLatestProcessesResponse call() throws Exception {

        return sdk.getLatestProcesses(
            request);
    }
}
