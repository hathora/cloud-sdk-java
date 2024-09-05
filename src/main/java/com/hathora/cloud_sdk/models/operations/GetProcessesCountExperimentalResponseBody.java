/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hathora.cloud_sdk.utils.Utils;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * GetProcessesCountExperimentalResponseBody - Ok
 */

public class GetProcessesCountExperimentalResponseBody {

    @JsonProperty("count")
    private double count;

    @JsonCreator
    public GetProcessesCountExperimentalResponseBody(
            @JsonProperty("count") double count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
    }

    @JsonIgnore
    public double count() {
        return count;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetProcessesCountExperimentalResponseBody withCount(double count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
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
        GetProcessesCountExperimentalResponseBody other = (GetProcessesCountExperimentalResponseBody) o;
        return 
            Objects.deepEquals(this.count, other.count);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            count);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetProcessesCountExperimentalResponseBody.class,
                "count", count);
    }
    
    public final static class Builder {
 
        private Double count;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder count(double count) {
            Utils.checkNotNull(count, "count");
            this.count = count;
            return this;
        }
        
        public GetProcessesCountExperimentalResponseBody build() {
            return new GetProcessesCountExperimentalResponseBody(
                count);
        }
    }
}

