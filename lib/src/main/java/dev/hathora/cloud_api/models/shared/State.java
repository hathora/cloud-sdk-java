/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;

/**
 * State - JSON blob to store metadata for a room. Must be smaller than 1MB.
 */

public class State {

    public State() {
        
        
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
        return java.util.Objects.hash(
            );
    }
    
    @Override
    public String toString() {
        return Utils.toString(State.class);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }        
        
        public State build() {
            return new State(
                );
        }
    }
}

