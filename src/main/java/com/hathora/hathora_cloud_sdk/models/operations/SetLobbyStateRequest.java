/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.hathora_cloud_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hathora.hathora_cloud_sdk.models.shared.SetLobbyStateParams;
import com.hathora.hathora_cloud_sdk.utils.SpeakeasyMetadata;
import com.hathora.hathora_cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class SetLobbyStateRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private SetLobbyStateParams setLobbyStateParams;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=roomId")
    private String roomId;

    @JsonCreator
    public SetLobbyStateRequest(
            SetLobbyStateParams setLobbyStateParams,
            Optional<String> appId,
            String roomId) {
        Utils.checkNotNull(setLobbyStateParams, "setLobbyStateParams");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(roomId, "roomId");
        this.setLobbyStateParams = setLobbyStateParams;
        this.appId = appId;
        this.roomId = roomId;
    }
    
    public SetLobbyStateRequest(
            SetLobbyStateParams setLobbyStateParams,
            String roomId) {
        this(setLobbyStateParams, Optional.empty(), roomId);
    }

    @JsonIgnore
    public SetLobbyStateParams setLobbyStateParams() {
        return setLobbyStateParams;
    }

    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    @JsonIgnore
    public String roomId() {
        return roomId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SetLobbyStateRequest withSetLobbyStateParams(SetLobbyStateParams setLobbyStateParams) {
        Utils.checkNotNull(setLobbyStateParams, "setLobbyStateParams");
        this.setLobbyStateParams = setLobbyStateParams;
        return this;
    }

    public SetLobbyStateRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public SetLobbyStateRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public SetLobbyStateRequest withRoomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
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
        SetLobbyStateRequest other = (SetLobbyStateRequest) o;
        return 
            Objects.deepEquals(this.setLobbyStateParams, other.setLobbyStateParams) &&
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.roomId, other.roomId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            setLobbyStateParams,
            appId,
            roomId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SetLobbyStateRequest.class,
                "setLobbyStateParams", setLobbyStateParams,
                "appId", appId,
                "roomId", roomId);
    }
    
    public final static class Builder {
 
        private SetLobbyStateParams setLobbyStateParams;
 
        private Optional<String> appId = Optional.empty();
 
        private String roomId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder setLobbyStateParams(SetLobbyStateParams setLobbyStateParams) {
            Utils.checkNotNull(setLobbyStateParams, "setLobbyStateParams");
            this.setLobbyStateParams = setLobbyStateParams;
            return this;
        }

        public Builder appId(String appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = Optional.ofNullable(appId);
            return this;
        }

        public Builder appId(Optional<String> appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = appId;
            return this;
        }

        public Builder roomId(String roomId) {
            Utils.checkNotNull(roomId, "roomId");
            this.roomId = roomId;
            return this;
        }
        
        public SetLobbyStateRequest build() {
            return new SetLobbyStateRequest(
                setLobbyStateParams,
                appId,
                roomId);
        }
    }
}
