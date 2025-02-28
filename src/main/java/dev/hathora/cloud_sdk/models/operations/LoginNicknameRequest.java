/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.hathora.cloud_sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hathora.cloud_sdk.models.shared.NicknameObject;
import dev.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class LoginNicknameRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private NicknameObject nicknameObject;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @JsonCreator
    public LoginNicknameRequest(
            NicknameObject nicknameObject,
            Optional<String> appId) {
        Utils.checkNotNull(nicknameObject, "nicknameObject");
        Utils.checkNotNull(appId, "appId");
        this.nicknameObject = nicknameObject;
        this.appId = appId;
    }
    
    public LoginNicknameRequest(
            NicknameObject nicknameObject) {
        this(nicknameObject, Optional.empty());
    }

    @JsonIgnore
    public NicknameObject nicknameObject() {
        return nicknameObject;
    }

    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public LoginNicknameRequest withNicknameObject(NicknameObject nicknameObject) {
        Utils.checkNotNull(nicknameObject, "nicknameObject");
        this.nicknameObject = nicknameObject;
        return this;
    }

    public LoginNicknameRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public LoginNicknameRequest withAppId(Optional<String> appId) {
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
        LoginNicknameRequest other = (LoginNicknameRequest) o;
        return 
            Objects.deepEquals(this.nicknameObject, other.nicknameObject) &&
            Objects.deepEquals(this.appId, other.appId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            nicknameObject,
            appId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LoginNicknameRequest.class,
                "nicknameObject", nicknameObject,
                "appId", appId);
    }
    
    public final static class Builder {
 
        private NicknameObject nicknameObject;
 
        private Optional<String> appId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder nicknameObject(NicknameObject nicknameObject) {
            Utils.checkNotNull(nicknameObject, "nicknameObject");
            this.nicknameObject = nicknameObject;
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
        
        public LoginNicknameRequest build() {
            return new LoginNicknameRequest(
                nicknameObject,
                appId);
        }
    }
}

