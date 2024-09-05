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


public class CreatePrivateLobbyRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private CreatePrivateLobbyRequestBody requestBody;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=roomId")
    private Optional<String> roomId;

    @JsonCreator
    public CreatePrivateLobbyRequest(
            CreatePrivateLobbyRequestBody requestBody,
            Optional<String> appId,
            Optional<String> roomId) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(roomId, "roomId");
        this.requestBody = requestBody;
        this.appId = appId;
        this.roomId = roomId;
    }
    
    public CreatePrivateLobbyRequest(
            CreatePrivateLobbyRequestBody requestBody) {
        this(requestBody, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public CreatePrivateLobbyRequestBody requestBody() {
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

    public CreatePrivateLobbyRequest withRequestBody(CreatePrivateLobbyRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public CreatePrivateLobbyRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public CreatePrivateLobbyRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public CreatePrivateLobbyRequest withRoomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = Optional.ofNullable(roomId);
        return this;
    }

    public CreatePrivateLobbyRequest withRoomId(Optional<String> roomId) {
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
        CreatePrivateLobbyRequest other = (CreatePrivateLobbyRequest) o;
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
        return Utils.toString(CreatePrivateLobbyRequest.class,
                "requestBody", requestBody,
                "appId", appId,
                "roomId", roomId);
    }
    
    public final static class Builder {
 
        private CreatePrivateLobbyRequestBody requestBody;
 
        private Optional<String> appId = Optional.empty();
 
        private Optional<String> roomId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requestBody(CreatePrivateLobbyRequestBody requestBody) {
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
        
        public CreatePrivateLobbyRequest build() {
            return new CreatePrivateLobbyRequest(
                requestBody,
                appId,
                roomId);
        }
    }
}
