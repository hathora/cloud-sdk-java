/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.hathora.cloud_sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class GetStoppedProcessesRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=region")
    private Optional<? extends Region> region;

    @JsonCreator
    public GetStoppedProcessesRequest(
            Optional<String> appId,
            Optional<? extends Region> region) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(region, "region");
        this.appId = appId;
        this.region = region;
    }
    
    public GetStoppedProcessesRequest() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Region> region() {
        return (Optional<Region>) region;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetStoppedProcessesRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public GetStoppedProcessesRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetStoppedProcessesRequest withRegion(Region region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.ofNullable(region);
        return this;
    }

    public GetStoppedProcessesRequest withRegion(Optional<? extends Region> region) {
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
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.region, other.region);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<String> appId = Optional.empty();
 
        private Optional<? extends Region> region = Optional.empty();  
        
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

        public Builder region(Region region) {
            Utils.checkNotNull(region, "region");
            this.region = Optional.ofNullable(region);
            return this;
        }

        public Builder region(Optional<? extends Region> region) {
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

