/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;

import com.hathora.cloud_sdk.models.shared.VerificationEmailRequest;
import com.hathora.cloud_sdk.utils.Utils;

public class SendVerificationEmailRequestBuilder {

    private VerificationEmailRequest request;
    private final SDKMethodInterfaces.MethodCallSendVerificationEmail sdk;

    public SendVerificationEmailRequestBuilder(SDKMethodInterfaces.MethodCallSendVerificationEmail sdk) {
        this.sdk = sdk;
    }

    public SendVerificationEmailRequestBuilder request(com.hathora.cloud_sdk.models.shared.VerificationEmailRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public SendVerificationEmailResponse call() throws Exception {

        return sdk.sendVerificationEmail(
            request);
    }
}
