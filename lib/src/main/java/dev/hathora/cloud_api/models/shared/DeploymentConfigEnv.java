/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;


public class DeploymentConfigEnv {

    @JsonProperty("name")
    private String name;

    @JsonProperty("value")
    private String value;

    public DeploymentConfigEnv(
            @JsonProperty("name") String name,
            @JsonProperty("value") String value) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(value, "value");
        this.name = name;
        this.value = value;
    }

    public String name() {
        return name;
    }

    public String value() {
        return value;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public DeploymentConfigEnv withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public DeploymentConfigEnv withValue(String value) {
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
        DeploymentConfigEnv other = (DeploymentConfigEnv) o;
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
        return Utils.toString(DeploymentConfigEnv.class,
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
        
        public DeploymentConfigEnv build() {
            return new DeploymentConfigEnv(
                name,
                value);
        }
    }
}

