/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import dev.hathora.cloud_api.utils.SpeakeasyMetadata;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.util.Optional;


public class GetLatestProcessesRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<? extends String> appId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=region")
    private Optional<? extends java.util.List<dev.hathora.cloud_api.models.shared.Region>> region;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=status")
    private Optional<? extends java.util.List<dev.hathora.cloud_api.models.shared.ProcessStatus>> status;

    public GetLatestProcessesRequest(
            Optional<? extends String> appId,
            Optional<? extends java.util.List<dev.hathora.cloud_api.models.shared.Region>> region,
            Optional<? extends java.util.List<dev.hathora.cloud_api.models.shared.ProcessStatus>> status) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(region, "region");
        Utils.checkNotNull(status, "status");
        this.appId = appId;
        this.region = region;
        this.status = status;
    }

    public Optional<? extends String> appId() {
        return appId;
    }

    public Optional<? extends java.util.List<dev.hathora.cloud_api.models.shared.Region>> region() {
        return region;
    }

    public Optional<? extends java.util.List<dev.hathora.cloud_api.models.shared.ProcessStatus>> status() {
        return status;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public GetLatestProcessesRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }
    
    public GetLatestProcessesRequest withAppId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetLatestProcessesRequest withRegion(java.util.List<dev.hathora.cloud_api.models.shared.Region> region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.ofNullable(region);
        return this;
    }
    
    public GetLatestProcessesRequest withRegion(Optional<? extends java.util.List<dev.hathora.cloud_api.models.shared.Region>> region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    public GetLatestProcessesRequest withStatus(java.util.List<dev.hathora.cloud_api.models.shared.ProcessStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }
    
    public GetLatestProcessesRequest withStatus(Optional<? extends java.util.List<dev.hathora.cloud_api.models.shared.ProcessStatus>> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        GetLatestProcessesRequest other = (GetLatestProcessesRequest) o;
        return 
            java.util.Objects.deepEquals(this.appId, other.appId) &&
            java.util.Objects.deepEquals(this.region, other.region) &&
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            appId,
            region,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLatestProcessesRequest.class,
                "appId", appId,
                "region", region,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> appId = Optional.empty();
 
        private Optional<? extends java.util.List<dev.hathora.cloud_api.models.shared.Region>> region = Optional.empty();
 
        private Optional<? extends java.util.List<dev.hathora.cloud_api.models.shared.ProcessStatus>> status = Optional.empty();  
        
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

        public Builder region(java.util.List<dev.hathora.cloud_api.models.shared.Region> region) {
            Utils.checkNotNull(region, "region");
            this.region = Optional.ofNullable(region);
            return this;
        }
        
        public Builder region(Optional<? extends java.util.List<dev.hathora.cloud_api.models.shared.Region>> region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }

        public Builder status(java.util.List<dev.hathora.cloud_api.models.shared.ProcessStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }
        
        public Builder status(Optional<? extends java.util.List<dev.hathora.cloud_api.models.shared.ProcessStatus>> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }        
        
        public GetLatestProcessesRequest build() {
            return new GetLatestProcessesRequest(
                appId,
                region,
                status);
        }
    }
}

