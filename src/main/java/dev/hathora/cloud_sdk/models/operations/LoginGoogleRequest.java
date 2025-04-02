/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hathora.cloud_sdk.models.shared.GoogleIdTokenObject;
import dev.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class LoginGoogleRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private GoogleIdTokenObject googleIdTokenObject;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @JsonCreator
    public LoginGoogleRequest(
            GoogleIdTokenObject googleIdTokenObject,
            Optional<String> appId) {
        Utils.checkNotNull(googleIdTokenObject, "googleIdTokenObject");
        Utils.checkNotNull(appId, "appId");
        this.googleIdTokenObject = googleIdTokenObject;
        this.appId = appId;
    }
    
    public LoginGoogleRequest(
            GoogleIdTokenObject googleIdTokenObject) {
        this(googleIdTokenObject, Optional.empty());
    }

    @JsonIgnore
    public GoogleIdTokenObject googleIdTokenObject() {
        return googleIdTokenObject;
    }

    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public LoginGoogleRequest withGoogleIdTokenObject(GoogleIdTokenObject googleIdTokenObject) {
        Utils.checkNotNull(googleIdTokenObject, "googleIdTokenObject");
        this.googleIdTokenObject = googleIdTokenObject;
        return this;
    }

    public LoginGoogleRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public LoginGoogleRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoginGoogleRequest other = (LoginGoogleRequest) o;
        return 
            Objects.deepEquals(this.googleIdTokenObject, other.googleIdTokenObject) &&
            Objects.deepEquals(this.appId, other.appId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            googleIdTokenObject,
            appId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LoginGoogleRequest.class,
                "googleIdTokenObject", googleIdTokenObject,
                "appId", appId);
    }
    
    public final static class Builder {
 
        private GoogleIdTokenObject googleIdTokenObject;
 
        private Optional<String> appId = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder googleIdTokenObject(GoogleIdTokenObject googleIdTokenObject) {
            Utils.checkNotNull(googleIdTokenObject, "googleIdTokenObject");
            this.googleIdTokenObject = googleIdTokenObject;
            return this;
        }

        public Builder appId(String appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = Optional.ofNullable(appId);
            return this;
        }

        public Builder appId(Optional<String> appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = appId;
            return this;
        }
        
        public LoginGoogleRequest build() {
            return new LoginGoogleRequest(
                googleIdTokenObject,
                appId);
        }
    }
}
