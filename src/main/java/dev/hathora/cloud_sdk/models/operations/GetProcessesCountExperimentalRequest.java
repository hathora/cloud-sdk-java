/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hathora.cloud_sdk.models.shared.ProcessStatus;
import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class GetProcessesCountExperimentalRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=region")
    private Optional<? extends List<Region>> region;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=status")
    private Optional<? extends List<ProcessStatus>> status;

    @JsonCreator
    public GetProcessesCountExperimentalRequest(
            Optional<String> appId,
            Optional<? extends List<Region>> region,
            Optional<? extends List<ProcessStatus>> status) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(region, "region");
        Utils.checkNotNull(status, "status");
        this.appId = appId;
        this.region = region;
        this.status = status;
    }
    
    public GetProcessesCountExperimentalRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Region>> region() {
        return (Optional<List<Region>>) region;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ProcessStatus>> status() {
        return (Optional<List<ProcessStatus>>) status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetProcessesCountExperimentalRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public GetProcessesCountExperimentalRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetProcessesCountExperimentalRequest withRegion(List<Region> region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.ofNullable(region);
        return this;
    }

    public GetProcessesCountExperimentalRequest withRegion(Optional<? extends List<Region>> region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    public GetProcessesCountExperimentalRequest withStatus(List<ProcessStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    public GetProcessesCountExperimentalRequest withStatus(Optional<? extends List<ProcessStatus>> status) {
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
        GetProcessesCountExperimentalRequest other = (GetProcessesCountExperimentalRequest) o;
        return 
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.region, other.region) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            appId,
            region,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetProcessesCountExperimentalRequest.class,
                "appId", appId,
                "region", region,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<String> appId = Optional.empty();
 
        private Optional<? extends List<Region>> region = Optional.empty();
 
        private Optional<? extends List<ProcessStatus>> status = Optional.empty();  
        
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

        public Builder region(List<Region> region) {
            Utils.checkNotNull(region, "region");
            this.region = Optional.ofNullable(region);
            return this;
        }

        public Builder region(Optional<? extends List<Region>> region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }

        public Builder status(List<ProcessStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        public Builder status(Optional<? extends List<ProcessStatus>> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public GetProcessesCountExperimentalRequest build() {
            return new GetProcessesCountExperimentalRequest(
                appId,
                region,
                status);
        }
    }
}
