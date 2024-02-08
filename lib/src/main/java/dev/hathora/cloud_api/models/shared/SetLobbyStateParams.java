/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;


public class SetLobbyStateParams {

    /**
     * JSON blob to store metadata for a room. Must be smaller than 1MB.
     */
    @JsonProperty("state")
    private SetLobbyStateParamsState state;

    public SetLobbyStateParams(
            @JsonProperty("state") SetLobbyStateParamsState state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
    }

    /**
     * JSON blob to store metadata for a room. Must be smaller than 1MB.
     */
    public SetLobbyStateParamsState state() {
        return state;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * JSON blob to store metadata for a room. Must be smaller than 1MB.
     */
    public SetLobbyStateParams withState(SetLobbyStateParamsState state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
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
        SetLobbyStateParams other = (SetLobbyStateParams) o;
        return 
            java.util.Objects.deepEquals(this.state, other.state);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            state);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SetLobbyStateParams.class,
                "state", state);
    }
    
    public final static class Builder {
 
        private SetLobbyStateParamsState state;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * JSON blob to store metadata for a room. Must be smaller than 1MB.
         */
        public Builder state(SetLobbyStateParamsState state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }        
        
        public SetLobbyStateParams build() {
            return new SetLobbyStateParams(
                state);
        }
    }
}
