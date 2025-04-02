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
import java.util.Objects;
import java.util.Optional;

public class GetFleetRegionRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=fleetId")
    private String fleetId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=orgId")
    private Optional<String> orgId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=region")
    private Region region;

    @JsonCreator
    public GetFleetRegionRequest(
            String fleetId,
            Optional<String> orgId,
            Region region) {
        Utils.checkNotNull(fleetId, "fleetId");
        Utils.checkNotNull(orgId, "orgId");
        Utils.checkNotNull(region, "region");
        this.fleetId = fleetId;
        this.orgId = orgId;
        this.region = region;
    }
    
    public GetFleetRegionRequest(
            String fleetId,
            Region region) {
        this(fleetId, Optional.empty(), region);
    }

    @JsonIgnore
    public String fleetId() {
        return fleetId;
    }

    @JsonIgnore
    public Optional<String> orgId() {
        return orgId;
    }

    @JsonIgnore
    public Region region() {
        return region;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetFleetRegionRequest withFleetId(String fleetId) {
        Utils.checkNotNull(fleetId, "fleetId");
        this.fleetId = fleetId;
        return this;
    }

    public GetFleetRegionRequest withOrgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = Optional.ofNullable(orgId);
        return this;
    }

    public GetFleetRegionRequest withOrgId(Optional<String> orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    public GetFleetRegionRequest withRegion(Region region) {
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
        GetFleetRegionRequest other = (GetFleetRegionRequest) o;
        return 
            Objects.deepEquals(this.fleetId, other.fleetId) &&
            Objects.deepEquals(this.orgId, other.orgId) &&
            Objects.deepEquals(this.region, other.region);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            fleetId,
            orgId,
            region);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetFleetRegionRequest.class,
                "fleetId", fleetId,
                "orgId", orgId,
                "region", region);
    }
    
    public final static class Builder {
 
        private String fleetId;
 
        private Optional<String> orgId = Optional.empty();
 
        private Region region;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder fleetId(String fleetId) {
            Utils.checkNotNull(fleetId, "fleetId");
            this.fleetId = fleetId;
            return this;
        }

        public Builder orgId(String orgId) {
            Utils.checkNotNull(orgId, "orgId");
            this.orgId = Optional.ofNullable(orgId);
            return this;
        }

        public Builder orgId(Optional<String> orgId) {
            Utils.checkNotNull(orgId, "orgId");
            this.orgId = orgId;
            return this;
        }

        public Builder region(Region region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }
        
        public GetFleetRegionRequest build() {
            return new GetFleetRegionRequest(
                fleetId,
                orgId,
                region);
        }
    }
}
