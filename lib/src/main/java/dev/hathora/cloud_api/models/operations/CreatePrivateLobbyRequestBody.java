/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;


public class CreatePrivateLobbyRequestBody {

    /**
     * User input to initialize the game state. Object must be smaller than 64KB.
     */
    @JsonProperty("initialConfig")
    private dev.hathora.cloud_api.models.shared.LobbyInitialConfig initialConfig;

    @JsonProperty("region")
    private dev.hathora.cloud_api.models.shared.Region region;

    public CreatePrivateLobbyRequestBody(
            @JsonProperty("initialConfig") dev.hathora.cloud_api.models.shared.LobbyInitialConfig initialConfig,
            @JsonProperty("region") dev.hathora.cloud_api.models.shared.Region region) {
        Utils.checkNotNull(initialConfig, "initialConfig");
        Utils.checkNotNull(region, "region");
        this.initialConfig = initialConfig;
        this.region = region;
    }

    /**
     * User input to initialize the game state. Object must be smaller than 64KB.
     */
    public dev.hathora.cloud_api.models.shared.LobbyInitialConfig initialConfig() {
        return initialConfig;
    }

    public dev.hathora.cloud_api.models.shared.Region region() {
        return region;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * User input to initialize the game state. Object must be smaller than 64KB.
     */
    public CreatePrivateLobbyRequestBody withInitialConfig(dev.hathora.cloud_api.models.shared.LobbyInitialConfig initialConfig) {
        Utils.checkNotNull(initialConfig, "initialConfig");
        this.initialConfig = initialConfig;
        return this;
    }

    public CreatePrivateLobbyRequestBody withRegion(dev.hathora.cloud_api.models.shared.Region region) {
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
        CreatePrivateLobbyRequestBody other = (CreatePrivateLobbyRequestBody) o;
        return 
            java.util.Objects.deepEquals(this.initialConfig, other.initialConfig) &&
            java.util.Objects.deepEquals(this.region, other.region);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            initialConfig,
            region);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreatePrivateLobbyRequestBody.class,
                "initialConfig", initialConfig,
                "region", region);
    }
    
    public final static class Builder {
 
        private dev.hathora.cloud_api.models.shared.LobbyInitialConfig initialConfig;
 
        private dev.hathora.cloud_api.models.shared.Region region;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * User input to initialize the game state. Object must be smaller than 64KB.
         */
        public Builder initialConfig(dev.hathora.cloud_api.models.shared.LobbyInitialConfig initialConfig) {
            Utils.checkNotNull(initialConfig, "initialConfig");
            this.initialConfig = initialConfig;
            return this;
        }

        public Builder region(dev.hathora.cloud_api.models.shared.Region region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }        
        
        public CreatePrivateLobbyRequestBody build() {
            return new CreatePrivateLobbyRequestBody(
                initialConfig,
                region);
        }
    }
}

