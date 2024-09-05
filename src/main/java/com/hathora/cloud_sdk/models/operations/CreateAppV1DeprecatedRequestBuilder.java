/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;

import com.hathora.cloud_sdk.models.shared.AppConfig;
import com.hathora.cloud_sdk.utils.Utils;

public class CreateAppV1DeprecatedRequestBuilder {

    private AppConfig request;
    private final SDKMethodInterfaces.MethodCallCreateAppV1Deprecated sdk;

    public CreateAppV1DeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallCreateAppV1Deprecated sdk) {
        this.sdk = sdk;
    }

    public CreateAppV1DeprecatedRequestBuilder request(com.hathora.cloud_sdk.models.shared.AppConfig request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateAppV1DeprecatedResponse call() throws Exception {

        return sdk.createAppV1Deprecated(
            request);
    }
}
