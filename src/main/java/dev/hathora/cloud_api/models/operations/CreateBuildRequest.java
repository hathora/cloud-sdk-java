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

public class CreateBuildRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private dev.hathora.cloud_api.models.shared.CreateBuildParams createBuildParams;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<? extends String> appId;

    @JsonCreator
    public CreateBuildRequest(
            dev.hathora.cloud_api.models.shared.CreateBuildParams createBuildParams,
            Optional<? extends String> appId) {
        Utils.checkNotNull(createBuildParams, "createBuildParams");
        Utils.checkNotNull(appId, "appId");
        this.createBuildParams = createBuildParams;
        this.appId = appId;
    }
    
    public CreateBuildRequest(
            dev.hathora.cloud_api.models.shared.CreateBuildParams createBuildParams) {
        this(createBuildParams, Optional.empty());
    }

    @JsonIgnore
    public dev.hathora.cloud_api.models.shared.CreateBuildParams createBuildParams() {
        return createBuildParams;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> appId() {
        return (Optional<String>) appId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateBuildRequest withCreateBuildParams(dev.hathora.cloud_api.models.shared.CreateBuildParams createBuildParams) {
        Utils.checkNotNull(createBuildParams, "createBuildParams");
        this.createBuildParams = createBuildParams;
        return this;
    }

    public CreateBuildRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public CreateBuildRequest withAppId(Optional<? extends String> appId) {
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
        CreateBuildRequest other = (CreateBuildRequest) o;
        return 
            java.util.Objects.deepEquals(this.createBuildParams, other.createBuildParams) &&
            java.util.Objects.deepEquals(this.appId, other.appId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            createBuildParams,
            appId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateBuildRequest.class,
                "createBuildParams", createBuildParams,
                "appId", appId);
    }
    
    public final static class Builder {
 
        private dev.hathora.cloud_api.models.shared.CreateBuildParams createBuildParams;
 
        private Optional<? extends String> appId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createBuildParams(dev.hathora.cloud_api.models.shared.CreateBuildParams createBuildParams) {
            Utils.checkNotNull(createBuildParams, "createBuildParams");
            this.createBuildParams = createBuildParams;
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
        
        public CreateBuildRequest build() {
            return new CreateBuildRequest(
                createBuildParams,
                appId);
        }
    }
}

