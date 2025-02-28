/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.hathora.cloud_sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.utils.LazySingletonValue;
import dev.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class CreatePublicLobbyDeprecatedRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=local")
    private Optional<Boolean> local;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=region")
    private Optional<? extends Region> region;

    @JsonCreator
    public CreatePublicLobbyDeprecatedRequest(
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
    
    public CreatePublicLobbyDeprecatedRequest() {
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

    public CreatePublicLobbyDeprecatedRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public CreatePublicLobbyDeprecatedRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public CreatePublicLobbyDeprecatedRequest withLocal(boolean local) {
        Utils.checkNotNull(local, "local");
        this.local = Optional.ofNullable(local);
        return this;
    }

    public CreatePublicLobbyDeprecatedRequest withLocal(Optional<Boolean> local) {
        Utils.checkNotNull(local, "local");
        this.local = local;
        return this;
    }

    public CreatePublicLobbyDeprecatedRequest withRegion(Region region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.ofNullable(region);
        return this;
    }

    public CreatePublicLobbyDeprecatedRequest withRegion(Optional<? extends Region> region) {
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
        CreatePublicLobbyDeprecatedRequest other = (CreatePublicLobbyDeprecatedRequest) o;
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
        return Utils.toString(CreatePublicLobbyDeprecatedRequest.class,
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
        
        public CreatePublicLobbyDeprecatedRequest build() {
            if (local == null) {
                local = _SINGLETON_VALUE_Local.value();
            }            return new CreatePublicLobbyDeprecatedRequest(
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

