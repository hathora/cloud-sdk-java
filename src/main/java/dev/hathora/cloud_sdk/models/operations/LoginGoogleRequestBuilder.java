/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.models.shared.GoogleIdTokenObject;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class LoginGoogleRequestBuilder {

    private GoogleIdTokenObject googleIdTokenObject;
    private Optional<String> appId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallLoginGoogle sdk;

    public LoginGoogleRequestBuilder(SDKMethodInterfaces.MethodCallLoginGoogle sdk) {
        this.sdk = sdk;
    }

    public LoginGoogleRequestBuilder googleIdTokenObject(GoogleIdTokenObject googleIdTokenObject) {
        Utils.checkNotNull(googleIdTokenObject, "googleIdTokenObject");
        this.googleIdTokenObject = googleIdTokenObject;
        return this;
    }
                
    public LoginGoogleRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public LoginGoogleRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public LoginGoogleResponse call() throws Exception {

        return sdk.loginGoogle(
            googleIdTokenObject,
            appId);
    }
}
