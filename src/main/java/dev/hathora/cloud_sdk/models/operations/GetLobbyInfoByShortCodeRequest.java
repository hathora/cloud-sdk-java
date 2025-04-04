/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class GetLobbyInfoByShortCodeRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=shortCode")
    private String shortCode;

    @JsonCreator
    public GetLobbyInfoByShortCodeRequest(
            Optional<String> appId,
            String shortCode) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(shortCode, "shortCode");
        this.appId = appId;
        this.shortCode = shortCode;
    }
    
    public GetLobbyInfoByShortCodeRequest(
            String shortCode) {
        this(Optional.empty(), shortCode);
    }

    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    @JsonIgnore
    public String shortCode() {
        return shortCode;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetLobbyInfoByShortCodeRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public GetLobbyInfoByShortCodeRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetLobbyInfoByShortCodeRequest withShortCode(String shortCode) {
        Utils.checkNotNull(shortCode, "shortCode");
        this.shortCode = shortCode;
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
        GetLobbyInfoByShortCodeRequest other = (GetLobbyInfoByShortCodeRequest) o;
        return 
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.shortCode, other.shortCode);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            appId,
            shortCode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLobbyInfoByShortCodeRequest.class,
                "appId", appId,
                "shortCode", shortCode);
    }
    
    public final static class Builder {
 
        private Optional<String> appId = Optional.empty();
 
        private String shortCode;
        
        private Builder() {
          // force use of static builder() method
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

        public Builder shortCode(String shortCode) {
            Utils.checkNotNull(shortCode, "shortCode");
            this.shortCode = shortCode;
            return this;
        }
        
        public GetLobbyInfoByShortCodeRequest build() {
            return new GetLobbyInfoByShortCodeRequest(
                appId,
                shortCode);
        }
    }
}
