/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import com.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class GetLobbyInfoByRoomIdRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=roomId")
    private String roomId;

    @JsonCreator
    public GetLobbyInfoByRoomIdRequest(
            Optional<String> appId,
            String roomId) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(roomId, "roomId");
        this.appId = appId;
        this.roomId = roomId;
    }
    
    public GetLobbyInfoByRoomIdRequest(
            String roomId) {
        this(Optional.empty(), roomId);
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

    public GetLobbyInfoByRoomIdRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public GetLobbyInfoByRoomIdRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetLobbyInfoByRoomIdRequest withRoomId(String roomId) {
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
        GetLobbyInfoByRoomIdRequest other = (GetLobbyInfoByRoomIdRequest) o;
        return 
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.roomId, other.roomId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            appId,
            roomId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLobbyInfoByRoomIdRequest.class,
                "appId", appId,
                "roomId", roomId);
    }
    
    public final static class Builder {
 
        private Optional<String> appId = Optional.empty();
 
        private String roomId;  
        
        private Builder() {
          // force use of static builder() method
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
        
        public GetLobbyInfoByRoomIdRequest build() {
            return new GetLobbyInfoByRoomIdRequest(
                appId,
                roomId);
        }
    }
}

