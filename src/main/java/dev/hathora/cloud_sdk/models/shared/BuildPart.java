/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class BuildPart {

    @JsonProperty("partNumber")
    private double partNumber;

    @JsonProperty("putRequestUrl")
    private String putRequestUrl;

    @JsonCreator
    public BuildPart(
            @JsonProperty("partNumber") double partNumber,
            @JsonProperty("putRequestUrl") String putRequestUrl) {
        Utils.checkNotNull(partNumber, "partNumber");
        Utils.checkNotNull(putRequestUrl, "putRequestUrl");
        this.partNumber = partNumber;
        this.putRequestUrl = putRequestUrl;
    }

    @JsonIgnore
    public double partNumber() {
        return partNumber;
    }

    @JsonIgnore
    public String putRequestUrl() {
        return putRequestUrl;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public BuildPart withPartNumber(double partNumber) {
        Utils.checkNotNull(partNumber, "partNumber");
        this.partNumber = partNumber;
        return this;
    }

    public BuildPart withPutRequestUrl(String putRequestUrl) {
        Utils.checkNotNull(putRequestUrl, "putRequestUrl");
        this.putRequestUrl = putRequestUrl;
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
        BuildPart other = (BuildPart) o;
        return 
            Objects.deepEquals(this.partNumber, other.partNumber) &&
            Objects.deepEquals(this.putRequestUrl, other.putRequestUrl);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            partNumber,
            putRequestUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BuildPart.class,
                "partNumber", partNumber,
                "putRequestUrl", putRequestUrl);
    }
    
    public final static class Builder {
 
        private Double partNumber;
 
        private String putRequestUrl;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder partNumber(double partNumber) {
            Utils.checkNotNull(partNumber, "partNumber");
            this.partNumber = partNumber;
            return this;
        }

        public Builder putRequestUrl(String putRequestUrl) {
            Utils.checkNotNull(putRequestUrl, "putRequestUrl");
            this.putRequestUrl = putRequestUrl;
            return this;
        }
        
        public BuildPart build() {
            return new BuildPart(
                partNumber,
                putRequestUrl);
        }
    }
}
