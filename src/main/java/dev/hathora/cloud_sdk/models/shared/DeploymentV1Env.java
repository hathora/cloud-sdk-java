/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.hathora.cloud_sdk.models.shared;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class DeploymentV1Env {

    @JsonProperty("name")
    private String name;

    @JsonProperty("value")
    private String value;

    @JsonCreator
    public DeploymentV1Env(
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

    public DeploymentV1Env withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public DeploymentV1Env withValue(String value) {
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
        DeploymentV1Env other = (DeploymentV1Env) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeploymentV1Env.class,
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
        
        public DeploymentV1Env build() {
            return new DeploymentV1Env(
                name,
                value);
        }
    }
}

