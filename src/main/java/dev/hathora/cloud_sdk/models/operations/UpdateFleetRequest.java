/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hathora.cloud_sdk.models.shared.UpdateFleet;
import dev.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class UpdateFleetRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private UpdateFleet updateFleet;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=fleetId")
    private String fleetId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=orgId")
    private Optional<String> orgId;

    @JsonCreator
    public UpdateFleetRequest(
            UpdateFleet updateFleet,
            String fleetId,
            Optional<String> orgId) {
        Utils.checkNotNull(updateFleet, "updateFleet");
        Utils.checkNotNull(fleetId, "fleetId");
        Utils.checkNotNull(orgId, "orgId");
        this.updateFleet = updateFleet;
        this.fleetId = fleetId;
        this.orgId = orgId;
    }
    
    public UpdateFleetRequest(
            UpdateFleet updateFleet,
            String fleetId) {
        this(updateFleet, fleetId, Optional.empty());
    }

    @JsonIgnore
    public UpdateFleet updateFleet() {
        return updateFleet;
    }

    @JsonIgnore
    public String fleetId() {
        return fleetId;
    }

    @JsonIgnore
    public Optional<String> orgId() {
        return orgId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public UpdateFleetRequest withUpdateFleet(UpdateFleet updateFleet) {
        Utils.checkNotNull(updateFleet, "updateFleet");
        this.updateFleet = updateFleet;
        return this;
    }

    public UpdateFleetRequest withFleetId(String fleetId) {
        Utils.checkNotNull(fleetId, "fleetId");
        this.fleetId = fleetId;
        return this;
    }

    public UpdateFleetRequest withOrgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = Optional.ofNullable(orgId);
        return this;
    }

    public UpdateFleetRequest withOrgId(Optional<String> orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
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
        UpdateFleetRequest other = (UpdateFleetRequest) o;
        return 
            Objects.deepEquals(this.updateFleet, other.updateFleet) &&
            Objects.deepEquals(this.fleetId, other.fleetId) &&
            Objects.deepEquals(this.orgId, other.orgId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            updateFleet,
            fleetId,
            orgId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateFleetRequest.class,
                "updateFleet", updateFleet,
                "fleetId", fleetId,
                "orgId", orgId);
    }
    
    public final static class Builder {
 
        private UpdateFleet updateFleet;
 
        private String fleetId;
 
        private Optional<String> orgId = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder updateFleet(UpdateFleet updateFleet) {
            Utils.checkNotNull(updateFleet, "updateFleet");
            this.updateFleet = updateFleet;
            return this;
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
        
        public UpdateFleetRequest build() {
            return new UpdateFleetRequest(
                updateFleet,
                fleetId,
                orgId);
        }
    }
}
