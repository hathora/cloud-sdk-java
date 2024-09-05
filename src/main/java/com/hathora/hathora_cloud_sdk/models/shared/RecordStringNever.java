/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.hathora_cloud_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.hathora.hathora_cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * RecordStringNever - Construct a type with a set of properties K of type T
 */

public class RecordStringNever {

    @JsonCreator
    public RecordStringNever() {
        
        
    }

    public final static Builder builder() {
        return new Builder();
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            );
    }
    
    @Override
    public String toString() {
        return Utils.toString(RecordStringNever.class);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public RecordStringNever build() {
            return new RecordStringNever(
                );
        }
    }
}
