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

public class UpdateAppRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private dev.hathora.cloud_api.models.shared.AppConfig appConfig;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<? extends String> appId;

    @JsonCreator
    public UpdateAppRequest(
            dev.hathora.cloud_api.models.shared.AppConfig appConfig,
            Optional<? extends String> appId) {
        Utils.checkNotNull(appConfig, "appConfig");
        Utils.checkNotNull(appId, "appId");
        this.appConfig = appConfig;
        this.appId = appId;
    }
    
    public UpdateAppRequest(
            dev.hathora.cloud_api.models.shared.AppConfig appConfig) {
        this(appConfig, Optional.empty());
    }

    @JsonIgnore
    public dev.hathora.cloud_api.models.shared.AppConfig appConfig() {
        return appConfig;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> appId() {
        return (Optional<String>) appId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateAppRequest withAppConfig(dev.hathora.cloud_api.models.shared.AppConfig appConfig) {
        Utils.checkNotNull(appConfig, "appConfig");
        this.appConfig = appConfig;
        return this;
    }

    public UpdateAppRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public UpdateAppRequest withAppId(Optional<? extends String> appId) {
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
        UpdateAppRequest other = (UpdateAppRequest) o;
        return 
            java.util.Objects.deepEquals(this.appConfig, other.appConfig) &&
            java.util.Objects.deepEquals(this.appId, other.appId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            appConfig,
            appId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateAppRequest.class,
                "appConfig", appConfig,
                "appId", appId);
    }
    
    public final static class Builder {
 
        private dev.hathora.cloud_api.models.shared.AppConfig appConfig;
 
        private Optional<? extends String> appId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder appConfig(dev.hathora.cloud_api.models.shared.AppConfig appConfig) {
            Utils.checkNotNull(appConfig, "appConfig");
            this.appConfig = appConfig;
            return this;
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
        
        public UpdateAppRequest build() {
            return new UpdateAppRequest(
                appConfig,
                appId);
        }
    }
}

