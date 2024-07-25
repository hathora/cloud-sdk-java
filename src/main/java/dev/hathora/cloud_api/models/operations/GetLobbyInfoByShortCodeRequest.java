/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class GetLobbyInfoByShortCodeRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<? extends String> appId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=shortCode")
    private String shortCode;

    @JsonCreator
    public GetLobbyInfoByShortCodeRequest(
            Optional<? extends String> appId,
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

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> appId() {
        return (Optional<String>) appId;
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

    public GetLobbyInfoByShortCodeRequest withAppId(Optional<? extends String> appId) {
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
            java.util.Objects.deepEquals(this.appId, other.appId) &&
            java.util.Objects.deepEquals(this.shortCode, other.shortCode);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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
 
        private Optional<? extends String> appId = Optional.empty();
 
        private String shortCode;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder appId(String appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = Optional.ofNullable(appId);
            return this;
        }

        public Builder appId(Optional<? extends String> appId) {
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

