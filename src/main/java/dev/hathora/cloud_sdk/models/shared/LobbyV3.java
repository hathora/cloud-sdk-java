/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * LobbyV3
 * 
 * <p>A lobby object allows you to store and manage metadata for your rooms.
 */
public class LobbyV3 {

    /**
     * System generated unique identifier for an application.
     */
    @JsonProperty("appId")
    private String appId;

    /**
     * When the lobby was created.
     */
    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    /**
     * UserId or email address for the user that created the lobby.
     */
    @JsonProperty("createdBy")
    private LobbyV3CreatedBy createdBy;

    @JsonProperty("region")
    private Region region;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("roomConfig")
    private JsonNullable<String> roomConfig;

    /**
     * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own.
     * Note: error will be returned if `roomId` is not globally unique.
     */
    @JsonProperty("roomId")
    private String roomId;

    /**
     * User-defined identifier for a lobby.
     */
    @JsonProperty("shortCode")
    private String shortCode;

    /**
     * Types of lobbies a player can create.
     * 
     * <p>`private`: the player who created the room must share the roomId with their friends
     * 
     * <p>`public`: visible in the public lobby list, anyone can join
     * 
     * <p>`local`: for testing with a server running locally
     */
    @JsonProperty("visibility")
    private LobbyVisibility visibility;

    @JsonCreator
    public LobbyV3(
            @JsonProperty("appId") String appId,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("createdBy") LobbyV3CreatedBy createdBy,
            @JsonProperty("region") Region region,
            @JsonProperty("roomConfig") JsonNullable<String> roomConfig,
            @JsonProperty("roomId") String roomId,
            @JsonProperty("shortCode") String shortCode,
            @JsonProperty("visibility") LobbyVisibility visibility) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(createdBy, "createdBy");
        Utils.checkNotNull(region, "region");
        Utils.checkNotNull(roomConfig, "roomConfig");
        Utils.checkNotNull(roomId, "roomId");
        Utils.checkNotNull(shortCode, "shortCode");
        Utils.checkNotNull(visibility, "visibility");
        this.appId = appId;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.region = region;
        this.roomConfig = roomConfig;
        this.roomId = roomId;
        this.shortCode = shortCode;
        this.visibility = visibility;
    }
    
    public LobbyV3(
            String appId,
            OffsetDateTime createdAt,
            LobbyV3CreatedBy createdBy,
            Region region,
            String roomId,
            String shortCode,
            LobbyVisibility visibility) {
        this(appId, createdAt, createdBy, region, JsonNullable.undefined(), roomId, shortCode, visibility);
    }

    /**
     * System generated unique identifier for an application.
     */
    @JsonIgnore
    public String appId() {
        return appId;
    }

    /**
     * When the lobby was created.
     */
    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    /**
     * UserId or email address for the user that created the lobby.
     */
    @JsonIgnore
    public LobbyV3CreatedBy createdBy() {
        return createdBy;
    }

    @JsonIgnore
    public Region region() {
        return region;
    }

    @JsonIgnore
    public JsonNullable<String> roomConfig() {
        return roomConfig;
    }

    /**
     * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own.
     * Note: error will be returned if `roomId` is not globally unique.
     */
    @JsonIgnore
    public String roomId() {
        return roomId;
    }

    /**
     * User-defined identifier for a lobby.
     */
    @JsonIgnore
    public String shortCode() {
        return shortCode;
    }

    /**
     * Types of lobbies a player can create.
     * 
     * <p>`private`: the player who created the room must share the roomId with their friends
     * 
     * <p>`public`: visible in the public lobby list, anyone can join
     * 
     * <p>`local`: for testing with a server running locally
     */
    @JsonIgnore
    public LobbyVisibility visibility() {
        return visibility;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * System generated unique identifier for an application.
     */
    public LobbyV3 withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * When the lobby was created.
     */
    public LobbyV3 withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * UserId or email address for the user that created the lobby.
     */
    public LobbyV3 withCreatedBy(LobbyV3CreatedBy createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = createdBy;
        return this;
    }

    public LobbyV3 withRegion(Region region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    public LobbyV3 withRoomConfig(String roomConfig) {
        Utils.checkNotNull(roomConfig, "roomConfig");
        this.roomConfig = JsonNullable.of(roomConfig);
        return this;
    }

    public LobbyV3 withRoomConfig(JsonNullable<String> roomConfig) {
        Utils.checkNotNull(roomConfig, "roomConfig");
        this.roomConfig = roomConfig;
        return this;
    }

    /**
     * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own.
     * Note: error will be returned if `roomId` is not globally unique.
     */
    public LobbyV3 withRoomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
        return this;
    }

    /**
     * User-defined identifier for a lobby.
     */
    public LobbyV3 withShortCode(String shortCode) {
        Utils.checkNotNull(shortCode, "shortCode");
        this.shortCode = shortCode;
        return this;
    }

    /**
     * Types of lobbies a player can create.
     * 
     * <p>`private`: the player who created the room must share the roomId with their friends
     * 
     * <p>`public`: visible in the public lobby list, anyone can join
     * 
     * <p>`local`: for testing with a server running locally
     */
    public LobbyV3 withVisibility(LobbyVisibility visibility) {
        Utils.checkNotNull(visibility, "visibility");
        this.visibility = visibility;
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
        LobbyV3 other = (LobbyV3) o;
        return 
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.createdBy, other.createdBy) &&
            Objects.deepEquals(this.region, other.region) &&
            Objects.deepEquals(this.roomConfig, other.roomConfig) &&
            Objects.deepEquals(this.roomId, other.roomId) &&
            Objects.deepEquals(this.shortCode, other.shortCode) &&
            Objects.deepEquals(this.visibility, other.visibility);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            appId,
            createdAt,
            createdBy,
            region,
            roomConfig,
            roomId,
            shortCode,
            visibility);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LobbyV3.class,
                "appId", appId,
                "createdAt", createdAt,
                "createdBy", createdBy,
                "region", region,
                "roomConfig", roomConfig,
                "roomId", roomId,
                "shortCode", shortCode,
                "visibility", visibility);
    }
    
    public final static class Builder {
 
        private String appId;
 
        private OffsetDateTime createdAt;
 
        private LobbyV3CreatedBy createdBy;
 
        private Region region;
 
        private JsonNullable<String> roomConfig = JsonNullable.undefined();
 
        private String roomId;
 
        private String shortCode;
 
        private LobbyVisibility visibility;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * System generated unique identifier for an application.
         */
        public Builder appId(String appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = appId;
            return this;
        }

        /**
         * When the lobby was created.
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * UserId or email address for the user that created the lobby.
         */
        public Builder createdBy(LobbyV3CreatedBy createdBy) {
            Utils.checkNotNull(createdBy, "createdBy");
            this.createdBy = createdBy;
            return this;
        }

        public Builder region(Region region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }

        public Builder roomConfig(String roomConfig) {
            Utils.checkNotNull(roomConfig, "roomConfig");
            this.roomConfig = JsonNullable.of(roomConfig);
            return this;
        }

        public Builder roomConfig(JsonNullable<String> roomConfig) {
            Utils.checkNotNull(roomConfig, "roomConfig");
            this.roomConfig = roomConfig;
            return this;
        }

        /**
         * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own.
         * Note: error will be returned if `roomId` is not globally unique.
         */
        public Builder roomId(String roomId) {
            Utils.checkNotNull(roomId, "roomId");
            this.roomId = roomId;
            return this;
        }

        /**
         * User-defined identifier for a lobby.
         */
        public Builder shortCode(String shortCode) {
            Utils.checkNotNull(shortCode, "shortCode");
            this.shortCode = shortCode;
            return this;
        }

        /**
         * Types of lobbies a player can create.
         * 
         * <p>`private`: the player who created the room must share the roomId with their friends
         * 
         * <p>`public`: visible in the public lobby list, anyone can join
         * 
         * <p>`local`: for testing with a server running locally
         */
        public Builder visibility(LobbyVisibility visibility) {
            Utils.checkNotNull(visibility, "visibility");
            this.visibility = visibility;
            return this;
        }
        
        public LobbyV3 build() {
            return new LobbyV3(
                appId,
                createdAt,
                createdBy,
                region,
                roomConfig,
                roomId,
                shortCode,
                visibility);
        }
    }
}
