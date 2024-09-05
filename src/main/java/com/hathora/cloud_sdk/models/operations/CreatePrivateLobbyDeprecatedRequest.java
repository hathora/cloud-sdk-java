/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.hathora.cloud_sdk.models.shared.Region;
import com.hathora.cloud_sdk.utils.LazySingletonValue;
import com.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import com.hathora.cloud_sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreatePrivateLobbyDeprecatedRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=local")
    private Optional<Boolean> local;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=region")
    private Optional<? extends Region> region;

    @JsonCreator
    public CreatePrivateLobbyDeprecatedRequest(
            Optional<String> appId,
            Optional<Boolean> local,
            Optional<? extends Region> region) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(local, "local");
        Utils.checkNotNull(region, "region");
        this.appId = appId;
        this.local = local;
        this.region = region;
    }
    
    public CreatePrivateLobbyDeprecatedRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    @JsonIgnore
    public Optional<Boolean> local() {
        return local;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Region> region() {
        return (Optional<Region>) region;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreatePrivateLobbyDeprecatedRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public CreatePrivateLobbyDeprecatedRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public CreatePrivateLobbyDeprecatedRequest withLocal(boolean local) {
        Utils.checkNotNull(local, "local");
        this.local = Optional.ofNullable(local);
        return this;
    }

    public CreatePrivateLobbyDeprecatedRequest withLocal(Optional<Boolean> local) {
        Utils.checkNotNull(local, "local");
        this.local = local;
        return this;
    }

    public CreatePrivateLobbyDeprecatedRequest withRegion(Region region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.ofNullable(region);
        return this;
    }

    public CreatePrivateLobbyDeprecatedRequest withRegion(Optional<? extends Region> region) {
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
        CreatePrivateLobbyDeprecatedRequest other = (CreatePrivateLobbyDeprecatedRequest) o;
        return 
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.local, other.local) &&
            Objects.deepEquals(this.region, other.region);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            appId,
            local,
            region);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreatePrivateLobbyDeprecatedRequest.class,
                "appId", appId,
                "local", local,
                "region", region);
    }
    
    public final static class Builder {
 
        private Optional<String> appId = Optional.empty();
 
        private Optional<Boolean> local;
 
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

        public Builder local(boolean local) {
            Utils.checkNotNull(local, "local");
            this.local = Optional.ofNullable(local);
            return this;
        }

        public Builder local(Optional<Boolean> local) {
            Utils.checkNotNull(local, "local");
            this.local = local;
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
        
        public CreatePrivateLobbyDeprecatedRequest build() {
            if (local == null) {
                local = _SINGLETON_VALUE_Local.value();
            }            return new CreatePrivateLobbyDeprecatedRequest(
                appId,
                local,
                region);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_Local =
                new LazySingletonValue<>(
                        "local",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});
    }
}

