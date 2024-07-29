/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
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

public class ListActivePublicLobbiesRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<? extends String> appId;

    /**
     * If omitted, active public lobbies in all regions will be returned.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=region")
    private Optional<? extends dev.hathora.cloud_api.models.shared.Region> region;

    @JsonCreator
    public ListActivePublicLobbiesRequest(
            Optional<? extends String> appId,
            Optional<? extends dev.hathora.cloud_api.models.shared.Region> region) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(region, "region");
        this.appId = appId;
        this.region = region;
    }
    
    public ListActivePublicLobbiesRequest() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> appId() {
        return (Optional<String>) appId;
    }

    /**
     * If omitted, active public lobbies in all regions will be returned.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<dev.hathora.cloud_api.models.shared.Region> region() {
        return (Optional<dev.hathora.cloud_api.models.shared.Region>) region;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ListActivePublicLobbiesRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public ListActivePublicLobbiesRequest withAppId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * If omitted, active public lobbies in all regions will be returned.
     */
    public ListActivePublicLobbiesRequest withRegion(dev.hathora.cloud_api.models.shared.Region region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.ofNullable(region);
        return this;
    }

    /**
     * If omitted, active public lobbies in all regions will be returned.
     */
    public ListActivePublicLobbiesRequest withRegion(Optional<? extends dev.hathora.cloud_api.models.shared.Region> region) {
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
        ListActivePublicLobbiesRequest other = (ListActivePublicLobbiesRequest) o;
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
        return Utils.toString(ListActivePublicLobbiesRequest.class,
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

        /**
         * If omitted, active public lobbies in all regions will be returned.
         */
        public Builder region(dev.hathora.cloud_api.models.shared.Region region) {
            Utils.checkNotNull(region, "region");
            this.region = Optional.ofNullable(region);
            return this;
        }

        /**
         * If omitted, active public lobbies in all regions will be returned.
         */
        public Builder region(Optional<? extends dev.hathora.cloud_api.models.shared.Region> region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }
        
        public ListActivePublicLobbiesRequest build() {
            return new ListActivePublicLobbiesRequest(
                appId,
                region);
        }
    }
}

