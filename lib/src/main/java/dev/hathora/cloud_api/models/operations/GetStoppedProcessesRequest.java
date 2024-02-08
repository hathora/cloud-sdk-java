/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import dev.hathora.cloud_api.utils.SpeakeasyMetadata;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.util.Optional;


public class GetStoppedProcessesRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<? extends String> appId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=region")
    private Optional<? extends dev.hathora.cloud_api.models.shared.Region> region;

    public GetStoppedProcessesRequest(
            Optional<? extends String> appId,
            Optional<? extends dev.hathora.cloud_api.models.shared.Region> region) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(region, "region");
        this.appId = appId;
        this.region = region;
    }

    public Optional<? extends String> appId() {
        return appId;
    }

    public Optional<? extends dev.hathora.cloud_api.models.shared.Region> region() {
        return region;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public GetStoppedProcessesRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }
    
    public GetStoppedProcessesRequest withAppId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetStoppedProcessesRequest withRegion(dev.hathora.cloud_api.models.shared.Region region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.ofNullable(region);
        return this;
    }
    
    public GetStoppedProcessesRequest withRegion(Optional<? extends dev.hathora.cloud_api.models.shared.Region> region) {
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
        GetStoppedProcessesRequest other = (GetStoppedProcessesRequest) o;
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
        return Utils.toString(GetStoppedProcessesRequest.class,
                "appId", appId,
                "region", region);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> appId = Optional.empty();
 
        private Optional<? extends dev.hathora.cloud_api.models.shared.Region> region = Optional.empty();  
        
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
            this.region = Optional.ofNullable(region);
            return this;
        }
        
        public Builder region(Optional<? extends dev.hathora.cloud_api.models.shared.Region> region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }        
        
        public GetStoppedProcessesRequest build() {
            return new GetStoppedProcessesRequest(
                appId,
                region);
        }
    }
}

