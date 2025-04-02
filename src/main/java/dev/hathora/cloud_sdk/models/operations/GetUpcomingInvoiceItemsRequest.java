/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class GetUpcomingInvoiceItemsRequest {

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=orgId")
    private Optional<String> orgId;

    @JsonCreator
    public GetUpcomingInvoiceItemsRequest(
            Optional<String> orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
    }
    
    public GetUpcomingInvoiceItemsRequest() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<String> orgId() {
        return orgId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetUpcomingInvoiceItemsRequest withOrgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = Optional.ofNullable(orgId);
        return this;
    }

    public GetUpcomingInvoiceItemsRequest withOrgId(Optional<String> orgId) {
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
        GetUpcomingInvoiceItemsRequest other = (GetUpcomingInvoiceItemsRequest) o;
        return 
            Objects.deepEquals(this.orgId, other.orgId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            orgId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetUpcomingInvoiceItemsRequest.class,
                "orgId", orgId);
    }
    
    public final static class Builder {
 
        private Optional<String> orgId = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
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
        
        public GetUpcomingInvoiceItemsRequest build() {
            return new GetUpcomingInvoiceItemsRequest(
                orgId);
        }
    }
}
