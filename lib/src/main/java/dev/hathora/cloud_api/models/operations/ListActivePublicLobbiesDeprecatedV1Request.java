/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.utils.LazySingletonValue;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.util.Optional;


public class ListActivePublicLobbiesDeprecatedV1Request {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<? extends String> appId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=local")
    private Optional<? extends Boolean> local;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=region")
    private Optional<? extends dev.hathora.cloud_api.models.shared.Region> region;

    public ListActivePublicLobbiesDeprecatedV1Request(
            Optional<? extends String> appId,
            Optional<? extends Boolean> local,
            Optional<? extends dev.hathora.cloud_api.models.shared.Region> region) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(local, "local");
        Utils.checkNotNull(region, "region");
        this.appId = appId;
        this.local = local;
        this.region = region;
    }

    public Optional<? extends String> appId() {
        return appId;
    }

    public Optional<? extends Boolean> local() {
        return local;
    }

    public Optional<? extends dev.hathora.cloud_api.models.shared.Region> region() {
        return region;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public ListActivePublicLobbiesDeprecatedV1Request withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }
    
    public ListActivePublicLobbiesDeprecatedV1Request withAppId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public ListActivePublicLobbiesDeprecatedV1Request withLocal(boolean local) {
        Utils.checkNotNull(local, "local");
        this.local = Optional.ofNullable(local);
        return this;
    }
    
    public ListActivePublicLobbiesDeprecatedV1Request withLocal(Optional<? extends Boolean> local) {
        Utils.checkNotNull(local, "local");
        this.local = local;
        return this;
    }

    public ListActivePublicLobbiesDeprecatedV1Request withRegion(dev.hathora.cloud_api.models.shared.Region region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.ofNullable(region);
        return this;
    }
    
    public ListActivePublicLobbiesDeprecatedV1Request withRegion(Optional<? extends dev.hathora.cloud_api.models.shared.Region> region) {
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
        ListActivePublicLobbiesDeprecatedV1Request other = (ListActivePublicLobbiesDeprecatedV1Request) o;
        return 
            java.util.Objects.deepEquals(this.appId, other.appId) &&
            java.util.Objects.deepEquals(this.local, other.local) &&
            java.util.Objects.deepEquals(this.region, other.region);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            appId,
            local,
            region);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListActivePublicLobbiesDeprecatedV1Request.class,
                "appId", appId,
                "local", local,
                "region", region);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> appId = Optional.empty();
 
        private Optional<? extends Boolean> local;
 
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

        public Builder local(boolean local) {
            Utils.checkNotNull(local, "local");
            this.local = Optional.ofNullable(local);
            return this;
        }
        
        public Builder local(Optional<? extends Boolean> local) {
            Utils.checkNotNull(local, "local");
            this.local = local;
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
        
        public ListActivePublicLobbiesDeprecatedV1Request build() {
            if (local == null) {
                local = _SINGLETON_VALUE_Local.value();
            }
            return new ListActivePublicLobbiesDeprecatedV1Request(
                appId,
                local,
                region);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_Local =
                new LazySingletonValue<>(
                        "local",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});
    }
}

