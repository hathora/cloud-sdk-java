/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class RegistryConfig {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth")
    private Optional<String> auth;

    @JsonProperty("image")
    private String image;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("registryUrl")
    private Optional<String> registryUrl;

    @JsonCreator
    public RegistryConfig(
            @JsonProperty("auth") Optional<String> auth,
            @JsonProperty("image") String image,
            @JsonProperty("registryUrl") Optional<String> registryUrl) {
        Utils.checkNotNull(auth, "auth");
        Utils.checkNotNull(image, "image");
        Utils.checkNotNull(registryUrl, "registryUrl");
        this.auth = auth;
        this.image = image;
        this.registryUrl = registryUrl;
    }
    
    public RegistryConfig(
            String image) {
        this(Optional.empty(), image, Optional.empty());
    }

    @JsonIgnore
    public Optional<String> auth() {
        return auth;
    }

    @JsonIgnore
    public String image() {
        return image;
    }

    @JsonIgnore
    public Optional<String> registryUrl() {
        return registryUrl;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public RegistryConfig withAuth(String auth) {
        Utils.checkNotNull(auth, "auth");
        this.auth = Optional.ofNullable(auth);
        return this;
    }

    public RegistryConfig withAuth(Optional<String> auth) {
        Utils.checkNotNull(auth, "auth");
        this.auth = auth;
        return this;
    }

    public RegistryConfig withImage(String image) {
        Utils.checkNotNull(image, "image");
        this.image = image;
        return this;
    }

    public RegistryConfig withRegistryUrl(String registryUrl) {
        Utils.checkNotNull(registryUrl, "registryUrl");
        this.registryUrl = Optional.ofNullable(registryUrl);
        return this;
    }

    public RegistryConfig withRegistryUrl(Optional<String> registryUrl) {
        Utils.checkNotNull(registryUrl, "registryUrl");
        this.registryUrl = registryUrl;
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
        RegistryConfig other = (RegistryConfig) o;
        return 
            Objects.deepEquals(this.auth, other.auth) &&
            Objects.deepEquals(this.image, other.image) &&
            Objects.deepEquals(this.registryUrl, other.registryUrl);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            auth,
            image,
            registryUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RegistryConfig.class,
                "auth", auth,
                "image", image,
                "registryUrl", registryUrl);
    }
    
    public final static class Builder {
 
        private Optional<String> auth = Optional.empty();
 
        private String image;
 
        private Optional<String> registryUrl = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder auth(String auth) {
            Utils.checkNotNull(auth, "auth");
            this.auth = Optional.ofNullable(auth);
            return this;
        }

        public Builder auth(Optional<String> auth) {
            Utils.checkNotNull(auth, "auth");
            this.auth = auth;
            return this;
        }

        public Builder image(String image) {
            Utils.checkNotNull(image, "image");
            this.image = image;
            return this;
        }

        public Builder registryUrl(String registryUrl) {
            Utils.checkNotNull(registryUrl, "registryUrl");
            this.registryUrl = Optional.ofNullable(registryUrl);
            return this;
        }

        public Builder registryUrl(Optional<String> registryUrl) {
            Utils.checkNotNull(registryUrl, "registryUrl");
            this.registryUrl = registryUrl;
            return this;
        }
        
        public RegistryConfig build() {
            return new RegistryConfig(
                auth,
                image,
                registryUrl);
        }
    }
}
