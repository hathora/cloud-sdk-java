/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class GetLatestDeploymentRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<? extends String> appId;

    public GetLatestDeploymentRequest(
            Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
    }

    public Optional<? extends String> appId() {
        return appId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetLatestDeploymentRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public GetLatestDeploymentRequest withAppId(Optional<? extends String> appId) {
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
        GetLatestDeploymentRequest other = (GetLatestDeploymentRequest) o;
        return 
            java.util.Objects.deepEquals(this.appId, other.appId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            appId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLatestDeploymentRequest.class,
                "appId", appId);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> appId = Optional.empty();  
        
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
        
        public GetLatestDeploymentRequest build() {
            return new GetLatestDeploymentRequest(
                appId);
        }
    }
}

