/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.hathora.cloud_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class CreatePrivateLobbyRequestBody {

    /**
     * User input to initialize the game state. Object must be smaller than 64KB.
     */
    @JsonProperty("initialConfig")
    private java.lang.Object initialConfig;

    @JsonProperty("region")
    private com.hathora.cloud_sdk.models.shared.Region region;

    @JsonCreator
    public CreatePrivateLobbyRequestBody(
            @JsonProperty("initialConfig") java.lang.Object initialConfig,
            @JsonProperty("region") com.hathora.cloud_sdk.models.shared.Region region) {
        Utils.checkNotNull(initialConfig, "initialConfig");
        Utils.checkNotNull(region, "region");
        this.initialConfig = initialConfig;
        this.region = region;
    }

    /**
     * User input to initialize the game state. Object must be smaller than 64KB.
     */
    @JsonIgnore
    public java.lang.Object initialConfig() {
        return initialConfig;
    }

    @JsonIgnore
    public com.hathora.cloud_sdk.models.shared.Region region() {
        return region;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * User input to initialize the game state. Object must be smaller than 64KB.
     */
    public CreatePrivateLobbyRequestBody withInitialConfig(java.lang.Object initialConfig) {
        Utils.checkNotNull(initialConfig, "initialConfig");
        this.initialConfig = initialConfig;
        return this;
    }

    public CreatePrivateLobbyRequestBody withRegion(com.hathora.cloud_sdk.models.shared.Region region) {
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
 
        private java.lang.Object initialConfig;
 
        private com.hathora.cloud_sdk.models.shared.Region region;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * User input to initialize the game state. Object must be smaller than 64KB.
         */
        public Builder initialConfig(java.lang.Object initialConfig) {
            Utils.checkNotNull(initialConfig, "initialConfig");
            this.initialConfig = initialConfig;
            return this;
        }

        public Builder region(com.hathora.cloud_sdk.models.shared.Region region) {
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
