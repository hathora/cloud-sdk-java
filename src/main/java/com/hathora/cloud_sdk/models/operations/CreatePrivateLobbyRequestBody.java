/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hathora.cloud_sdk.models.shared.Region;
import com.hathora.cloud_sdk.utils.Utils;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CreatePrivateLobbyRequestBody {

    /**
     * User input to initialize the game state. Object must be smaller than 64KB.
     */
    @JsonProperty("initialConfig")
    private Object initialConfig;

    @JsonProperty("region")
    private Region region;

    @JsonCreator
    public CreatePrivateLobbyRequestBody(
            @JsonProperty("initialConfig") Object initialConfig,
            @JsonProperty("region") Region region) {
        Utils.checkNotNull(initialConfig, "initialConfig");
        Utils.checkNotNull(region, "region");
        this.initialConfig = initialConfig;
        this.region = region;
    }

    /**
     * User input to initialize the game state. Object must be smaller than 64KB.
     */
    @JsonIgnore
    public Object initialConfig() {
        return initialConfig;
    }

    @JsonIgnore
    public Region region() {
        return region;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * User input to initialize the game state. Object must be smaller than 64KB.
     */
    public CreatePrivateLobbyRequestBody withInitialConfig(Object initialConfig) {
        Utils.checkNotNull(initialConfig, "initialConfig");
        this.initialConfig = initialConfig;
        return this;
    }

    public CreatePrivateLobbyRequestBody withRegion(Region region) {
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
            Objects.deepEquals(this.initialConfig, other.initialConfig) &&
            Objects.deepEquals(this.region, other.region);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Object initialConfig;
 
        private Region region;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * User input to initialize the game state. Object must be smaller than 64KB.
         */
        public Builder initialConfig(Object initialConfig) {
            Utils.checkNotNull(initialConfig, "initialConfig");
            this.initialConfig = initialConfig;
            return this;
        }

        public Builder region(Region region) {
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

