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


public class DeleteBuildRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<? extends String> appId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=buildId")
    private int buildId;

    @JsonCreator
    public DeleteBuildRequest(
            Optional<? extends String> appId,
            int buildId) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(buildId, "buildId");
        this.appId = appId;
        this.buildId = buildId;
    }
    
    public DeleteBuildRequest(
            int buildId) {
        this(Optional.empty(), buildId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> appId() {
        return (Optional<String>) appId;
    }

    @JsonIgnore
    public int buildId() {
        return buildId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DeleteBuildRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public DeleteBuildRequest withAppId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public DeleteBuildRequest withBuildId(int buildId) {
        Utils.checkNotNull(buildId, "buildId");
        this.buildId = buildId;
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
        DeleteBuildRequest other = (DeleteBuildRequest) o;
        return 
            java.util.Objects.deepEquals(this.appId, other.appId) &&
            java.util.Objects.deepEquals(this.buildId, other.buildId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            appId,
            buildId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteBuildRequest.class,
                "appId", appId,
                "buildId", buildId);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> appId = Optional.empty();
 
        private Integer buildId;  
        
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

        public Builder buildId(int buildId) {
            Utils.checkNotNull(buildId, "buildId");
            this.buildId = buildId;
            return this;
        }
        
        public DeleteBuildRequest build() {
            return new DeleteBuildRequest(
                appId,
                buildId);
        }
    }
}

