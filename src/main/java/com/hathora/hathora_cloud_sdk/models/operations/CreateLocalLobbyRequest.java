/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.hathora_cloud_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hathora.hathora_cloud_sdk.utils.SpeakeasyMetadata;
import com.hathora.hathora_cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class CreateLocalLobbyRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private CreateLocalLobbyRequestBody requestBody;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=roomId")
    private Optional<String> roomId;

    @JsonCreator
    public CreateLocalLobbyRequest(
            CreateLocalLobbyRequestBody requestBody,
            Optional<String> appId,
            Optional<String> roomId) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(roomId, "roomId");
        this.requestBody = requestBody;
        this.appId = appId;
        this.roomId = roomId;
    }
    
    public CreateLocalLobbyRequest(
            CreateLocalLobbyRequestBody requestBody) {
        this(requestBody, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public CreateLocalLobbyRequestBody requestBody() {
        return requestBody;
    }

    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    @JsonIgnore
    public Optional<String> roomId() {
        return roomId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateLocalLobbyRequest withRequestBody(CreateLocalLobbyRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public CreateLocalLobbyRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public CreateLocalLobbyRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public CreateLocalLobbyRequest withRoomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = Optional.ofNullable(roomId);
        return this;
    }

    public CreateLocalLobbyRequest withRoomId(Optional<String> roomId) {
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
        CreateLocalLobbyRequest other = (CreateLocalLobbyRequest) o;
        return 
            Objects.deepEquals(this.requestBody, other.requestBody) &&
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.roomId, other.roomId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            requestBody,
            appId,
            roomId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateLocalLobbyRequest.class,
                "requestBody", requestBody,
                "appId", appId,
                "roomId", roomId);
    }
    
    public final static class Builder {
 
        private CreateLocalLobbyRequestBody requestBody;
 
        private Optional<String> appId = Optional.empty();
 
        private Optional<String> roomId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requestBody(CreateLocalLobbyRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
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
            this.roomId = Optional.ofNullable(roomId);
            return this;
        }

        public Builder roomId(Optional<String> roomId) {
            Utils.checkNotNull(roomId, "roomId");
            this.roomId = roomId;
            return this;
        }
        
        public CreateLocalLobbyRequest build() {
            return new CreateLocalLobbyRequest(
                requestBody,
                appId,
                roomId);
        }
    }
}
