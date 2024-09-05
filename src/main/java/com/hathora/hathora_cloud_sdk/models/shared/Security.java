/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.hathora_cloud_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hathora.hathora_cloud_sdk.utils.SpeakeasyMetadata;
import com.hathora.hathora_cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class Security {

    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer,name=Authorization")
    private Optional<String> hathoraDevToken;

    @JsonCreator
    public Security(
            Optional<String> hathoraDevToken) {
        Utils.checkNotNull(hathoraDevToken, "hathoraDevToken");
        this.hathoraDevToken = hathoraDevToken;
    }
    
    public Security() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<String> hathoraDevToken() {
        return hathoraDevToken;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Security withHathoraDevToken(String hathoraDevToken) {
        Utils.checkNotNull(hathoraDevToken, "hathoraDevToken");
        this.hathoraDevToken = Optional.ofNullable(hathoraDevToken);
        return this;
    }

    public Security withHathoraDevToken(Optional<String> hathoraDevToken) {
        Utils.checkNotNull(hathoraDevToken, "hathoraDevToken");
        this.hathoraDevToken = hathoraDevToken;
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
        Security other = (Security) o;
        return 
            Objects.deepEquals(this.hathoraDevToken, other.hathoraDevToken);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            hathoraDevToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Security.class,
                "hathoraDevToken", hathoraDevToken);
    }
    
    public final static class Builder {
 
        private Optional<String> hathoraDevToken = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder hathoraDevToken(String hathoraDevToken) {
            Utils.checkNotNull(hathoraDevToken, "hathoraDevToken");
            this.hathoraDevToken = Optional.ofNullable(hathoraDevToken);
            return this;
        }

        public Builder hathoraDevToken(Optional<String> hathoraDevToken) {
            Utils.checkNotNull(hathoraDevToken, "hathoraDevToken");
            this.hathoraDevToken = hathoraDevToken;
            return this;
        }
        
        public Security build() {
            return new Security(
                hathoraDevToken);
        }
    }
}
