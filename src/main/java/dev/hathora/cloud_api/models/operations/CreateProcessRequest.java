/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
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


public class CreateProcessRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<? extends String> appId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=region")
    private dev.hathora.cloud_api.models.shared.Region region;

    @JsonCreator
    public CreateProcessRequest(
            Optional<? extends String> appId,
            dev.hathora.cloud_api.models.shared.Region region) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(region, "region");
        this.appId = appId;
        this.region = region;
    }
    
    public CreateProcessRequest(
            dev.hathora.cloud_api.models.shared.Region region) {
        this(Optional.empty(), region);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> appId() {
        return (Optional<String>) appId;
    }

    @JsonIgnore
    public dev.hathora.cloud_api.models.shared.Region region() {
        return region;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateProcessRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public CreateProcessRequest withAppId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public CreateProcessRequest withRegion(dev.hathora.cloud_api.models.shared.Region region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
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
        CreateProcessRequest other = (CreateProcessRequest) o;
        return 
            java.util.Objects.deepEquals(this.appId, other.appId) &&
            java.util.Objects.deepEquals(this.region, other.region);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            appId,
            region);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateProcessRequest.class,
                "appId", appId,
                "region", region);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> appId = Optional.empty();
 
        private dev.hathora.cloud_api.models.shared.Region region;  
        
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

        public Builder region(dev.hathora.cloud_api.models.shared.Region region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }
        
        public CreateProcessRequest build() {
            return new CreateProcessRequest(
                appId,
                region);
        }
    }
}

