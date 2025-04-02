/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hathora.cloud_sdk.models.shared.CreateRoomParams;
import dev.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class CreateRoomDeprecatedRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private CreateRoomParams createRoomParams;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=roomId")
    private Optional<String> roomId;

    @JsonCreator
    public CreateRoomDeprecatedRequest(
            CreateRoomParams createRoomParams,
            Optional<String> appId,
            Optional<String> roomId) {
        Utils.checkNotNull(createRoomParams, "createRoomParams");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(roomId, "roomId");
        this.createRoomParams = createRoomParams;
        this.appId = appId;
        this.roomId = roomId;
    }
    
    public CreateRoomDeprecatedRequest(
            CreateRoomParams createRoomParams) {
        this(createRoomParams, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public CreateRoomParams createRoomParams() {
        return createRoomParams;
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

    public CreateRoomDeprecatedRequest withCreateRoomParams(CreateRoomParams createRoomParams) {
        Utils.checkNotNull(createRoomParams, "createRoomParams");
        this.createRoomParams = createRoomParams;
        return this;
    }

    public CreateRoomDeprecatedRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public CreateRoomDeprecatedRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public CreateRoomDeprecatedRequest withRoomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = Optional.ofNullable(roomId);
        return this;
    }

    public CreateRoomDeprecatedRequest withRoomId(Optional<String> roomId) {
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
        CreateRoomDeprecatedRequest other = (CreateRoomDeprecatedRequest) o;
        return 
            Objects.deepEquals(this.createRoomParams, other.createRoomParams) &&
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.roomId, other.roomId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createRoomParams,
            appId,
            roomId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateRoomDeprecatedRequest.class,
                "createRoomParams", createRoomParams,
                "appId", appId,
                "roomId", roomId);
    }
    
    public final static class Builder {
 
        private CreateRoomParams createRoomParams;
 
        private Optional<String> appId = Optional.empty();
 
        private Optional<String> roomId = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createRoomParams(CreateRoomParams createRoomParams) {
            Utils.checkNotNull(createRoomParams, "createRoomParams");
            this.createRoomParams = createRoomParams;
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
        
        public CreateRoomDeprecatedRequest build() {
            return new CreateRoomDeprecatedRequest(
                createRoomParams,
                appId,
                roomId);
        }
    }
}
