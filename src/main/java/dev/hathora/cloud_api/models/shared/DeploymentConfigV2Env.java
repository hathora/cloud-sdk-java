/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class DeploymentConfigV2Env {

    @JsonProperty("name")
    private String name;

    @JsonProperty("value")
    private String value;

    @JsonCreator
    public DeploymentConfigV2Env(
            @JsonProperty("name") String name,
            @JsonProperty("value") String value) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(value, "value");
        this.name = name;
        this.value = value;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public String value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DeploymentConfigV2Env withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public DeploymentConfigV2Env withValue(String value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        DeploymentConfigV2Env other = (DeploymentConfigV2Env) o;
        return 
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            name,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeploymentConfigV2Env.class,
                "name", name,
                "value", value);
    }
    
    public final static class Builder {
 
        private String name;
 
        private String value;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder value(String value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public DeploymentConfigV2Env build() {
            return new DeploymentConfigV2Env(
                name,
                value);
        }
    }
}

