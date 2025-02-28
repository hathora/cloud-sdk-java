/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.hathora.cloud_sdk.models.shared;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class SetLobbyStateParams {

    /**
     * JSON blob to store metadata for a room. Must be smaller than 1MB.
     */
    @JsonProperty("state")
    private Object state;

    @JsonCreator
    public SetLobbyStateParams(
            @JsonProperty("state") Object state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
    }

    /**
     * JSON blob to store metadata for a room. Must be smaller than 1MB.
     */
    @JsonIgnore
    public Object state() {
        return state;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * JSON blob to store metadata for a room. Must be smaller than 1MB.
     */
    public SetLobbyStateParams withState(Object state) {
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
            Objects.deepEquals(this.state, other.state);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            state);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SetLobbyStateParams.class,
                "state", state);
    }
    
    public final static class Builder {
 
        private Object state;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * JSON blob to store metadata for a room. Must be smaller than 1MB.
         */
        public Builder state(Object state) {
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

