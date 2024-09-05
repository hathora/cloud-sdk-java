/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class BuildWithUploadUrlRegionalContainerTags {

    @JsonProperty("containerTag")
    private String containerTag;

    @JsonProperty("region")
    private Region region;

    @JsonCreator
    public BuildWithUploadUrlRegionalContainerTags(
            @JsonProperty("containerTag") String containerTag,
            @JsonProperty("region") Region region) {
        Utils.checkNotNull(containerTag, "containerTag");
        Utils.checkNotNull(region, "region");
        this.containerTag = containerTag;
        this.region = region;
    }

    @JsonIgnore
    public String containerTag() {
        return containerTag;
    }

    @JsonIgnore
    public Region region() {
        return region;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public BuildWithUploadUrlRegionalContainerTags withContainerTag(String containerTag) {
        Utils.checkNotNull(containerTag, "containerTag");
        this.containerTag = containerTag;
        return this;
    }

    public BuildWithUploadUrlRegionalContainerTags withRegion(Region region) {
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
        BuildWithUploadUrlRegionalContainerTags other = (BuildWithUploadUrlRegionalContainerTags) o;
        return 
            Objects.deepEquals(this.containerTag, other.containerTag) &&
            Objects.deepEquals(this.region, other.region);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            containerTag,
            region);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BuildWithUploadUrlRegionalContainerTags.class,
                "containerTag", containerTag,
                "region", region);
    }
    
    public final static class Builder {
 
        private String containerTag;
 
        private Region region;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder containerTag(String containerTag) {
            Utils.checkNotNull(containerTag, "containerTag");
            this.containerTag = containerTag;
            return this;
        }

        public Builder region(Region region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }
        
        public BuildWithUploadUrlRegionalContainerTags build() {
            return new BuildWithUploadUrlRegionalContainerTags(
                containerTag,
                region);
        }
    }
}

