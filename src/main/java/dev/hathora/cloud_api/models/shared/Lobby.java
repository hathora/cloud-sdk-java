/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Lobby - A lobby object allows you to store and manage metadata for your rooms.
 */

public class Lobby {

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
    private CreatedBy createdBy;

    /**
     * User input to initialize the game state. Object must be smaller than 64KB.
     */
    @JsonProperty("initialConfig")
    private java.lang.Object initialConfig;

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonProperty("local")
    @Deprecated
    private boolean local;

    @JsonProperty("region")
    private Region region;

    /**
     * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own.
     * Note: error will be returned if `roomId` is not globally unique.
     */
    @JsonProperty("roomId")
    private String roomId;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("shortCode")
    private Optional<? extends String> shortCode;

    /**
     * JSON blob to store metadata for a room. Must be smaller than 1MB.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    private JsonNullable<? extends java.lang.Object> state;

    /**
     * Types of lobbies a player can create.
     * 
     * `private`: the player who created the room must share the roomId with their friends
     * 
     * `public`: visible in the public lobby list, anyone can join
     * 
     * `local`: for testing with a server running locally
     */
    @JsonProperty("visibility")
    private LobbyVisibility visibility;

    @JsonCreator
    public Lobby(
            @JsonProperty("appId") String appId,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("createdBy") CreatedBy createdBy,
            @JsonProperty("initialConfig") java.lang.Object initialConfig,
            @JsonProperty("local") boolean local,
            @JsonProperty("region") Region region,
            @JsonProperty("roomId") String roomId,
            @JsonProperty("shortCode") Optional<? extends String> shortCode,
            @JsonProperty("state") JsonNullable<? extends java.lang.Object> state,
            @JsonProperty("visibility") LobbyVisibility visibility) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(createdBy, "createdBy");
        Utils.checkNotNull(initialConfig, "initialConfig");
        Utils.checkNotNull(local, "local");
        Utils.checkNotNull(region, "region");
        Utils.checkNotNull(roomId, "roomId");
        Utils.checkNotNull(shortCode, "shortCode");
        Utils.checkNotNull(state, "state");
        Utils.checkNotNull(visibility, "visibility");
        this.appId = appId;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.initialConfig = initialConfig;
        this.local = local;
        this.region = region;
        this.roomId = roomId;
        this.shortCode = shortCode;
        this.state = state;
        this.visibility = visibility;
    }
    
    public Lobby(
            String appId,
            OffsetDateTime createdAt,
            CreatedBy createdBy,
            java.lang.Object initialConfig,
            boolean local,
            Region region,
            String roomId,
            LobbyVisibility visibility) {
        this(appId, createdAt, createdBy, initialConfig, local, region, roomId, Optional.empty(), JsonNullable.undefined(), visibility);
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
    public CreatedBy createdBy() {
        return createdBy;
    }

    /**
     * User input to initialize the game state. Object must be smaller than 64KB.
     */
    @JsonIgnore
    public java.lang.Object initialConfig() {
        return initialConfig;
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public boolean local() {
        return local;
    }

    @JsonIgnore
    public Region region() {
        return region;
    }

    /**
     * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own.
     * Note: error will be returned if `roomId` is not globally unique.
     */
    @JsonIgnore
    public String roomId() {
        return roomId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> shortCode() {
        return (Optional<String>) shortCode;
    }

    /**
     * JSON blob to store metadata for a room. Must be smaller than 1MB.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<java.lang.Object> state() {
        return (JsonNullable<java.lang.Object>) state;
    }

    /**
     * Types of lobbies a player can create.
     * 
     * `private`: the player who created the room must share the roomId with their friends
     * 
     * `public`: visible in the public lobby list, anyone can join
     * 
     * `local`: for testing with a server running locally
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
    public Lobby withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * When the lobby was created.
     */
    public Lobby withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * UserId or email address for the user that created the lobby.
     */
    public Lobby withCreatedBy(CreatedBy createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = createdBy;
        return this;
    }

    /**
     * User input to initialize the game state. Object must be smaller than 64KB.
     */
    public Lobby withInitialConfig(java.lang.Object initialConfig) {
        Utils.checkNotNull(initialConfig, "initialConfig");
        this.initialConfig = initialConfig;
        return this;
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public Lobby withLocal(boolean local) {
        Utils.checkNotNull(local, "local");
        this.local = local;
        return this;
    }

    public Lobby withRegion(Region region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    /**
     * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own.
     * Note: error will be returned if `roomId` is not globally unique.
     */
    public Lobby withRoomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
        return this;
    }

    public Lobby withShortCode(String shortCode) {
        Utils.checkNotNull(shortCode, "shortCode");
        this.shortCode = Optional.ofNullable(shortCode);
        return this;
    }

    public Lobby withShortCode(Optional<? extends String> shortCode) {
        Utils.checkNotNull(shortCode, "shortCode");
        this.shortCode = shortCode;
        return this;
    }

    /**
     * JSON blob to store metadata for a room. Must be smaller than 1MB.
     */
    public Lobby withState(java.lang.Object state) {
        Utils.checkNotNull(state, "state");
        this.state = JsonNullable.of(state);
        return this;
    }

    /**
     * JSON blob to store metadata for a room. Must be smaller than 1MB.
     */
    public Lobby withState(JsonNullable<? extends java.lang.Object> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    /**
     * Types of lobbies a player can create.
     * 
     * `private`: the player who created the room must share the roomId with their friends
     * 
     * `public`: visible in the public lobby list, anyone can join
     * 
     * `local`: for testing with a server running locally
     */
    public Lobby withVisibility(LobbyVisibility visibility) {
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
        Lobby other = (Lobby) o;
        return 
            java.util.Objects.deepEquals(this.appId, other.appId) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.createdBy, other.createdBy) &&
            java.util.Objects.deepEquals(this.initialConfig, other.initialConfig) &&
            java.util.Objects.deepEquals(this.local, other.local) &&
            java.util.Objects.deepEquals(this.region, other.region) &&
            java.util.Objects.deepEquals(this.roomId, other.roomId) &&
            java.util.Objects.deepEquals(this.shortCode, other.shortCode) &&
            java.util.Objects.deepEquals(this.state, other.state) &&
            java.util.Objects.deepEquals(this.visibility, other.visibility);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            appId,
            createdAt,
            createdBy,
            initialConfig,
            local,
            region,
            roomId,
            shortCode,
            state,
            visibility);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Lobby.class,
                "appId", appId,
                "createdAt", createdAt,
                "createdBy", createdBy,
                "initialConfig", initialConfig,
                "local", local,
                "region", region,
                "roomId", roomId,
                "shortCode", shortCode,
                "state", state,
                "visibility", visibility);
    }
    
    public final static class Builder {
 
        private String appId;
 
        private OffsetDateTime createdAt;
 
        private CreatedBy createdBy;
 
        private java.lang.Object initialConfig;
 
        @Deprecated
        private Boolean local;
 
        private Region region;
 
        private String roomId;
 
        private Optional<? extends String> shortCode = Optional.empty();
 
        private JsonNullable<? extends java.lang.Object> state = JsonNullable.undefined();
 
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
        public Builder createdBy(CreatedBy createdBy) {
            Utils.checkNotNull(createdBy, "createdBy");
            this.createdBy = createdBy;
            return this;
        }

        /**
         * User input to initialize the game state. Object must be smaller than 64KB.
         */
        public Builder initialConfig(java.lang.Object initialConfig) {
            Utils.checkNotNull(initialConfig, "initialConfig");
            this.initialConfig = initialConfig;
            return this;
        }

        /**
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder local(boolean local) {
            Utils.checkNotNull(local, "local");
            this.local = local;
            return this;
        }

        public Builder region(Region region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
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

        public Builder shortCode(String shortCode) {
            Utils.checkNotNull(shortCode, "shortCode");
            this.shortCode = Optional.ofNullable(shortCode);
            return this;
        }

        public Builder shortCode(Optional<? extends String> shortCode) {
            Utils.checkNotNull(shortCode, "shortCode");
            this.shortCode = shortCode;
            return this;
        }

        /**
         * JSON blob to store metadata for a room. Must be smaller than 1MB.
         */
        public Builder state(java.lang.Object state) {
            Utils.checkNotNull(state, "state");
            this.state = JsonNullable.of(state);
            return this;
        }

        /**
         * JSON blob to store metadata for a room. Must be smaller than 1MB.
         */
        public Builder state(JsonNullable<? extends java.lang.Object> state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }

        /**
         * Types of lobbies a player can create.
         * 
         * `private`: the player who created the room must share the roomId with their friends
         * 
         * `public`: visible in the public lobby list, anyone can join
         * 
         * `local`: for testing with a server running locally
         */
        public Builder visibility(LobbyVisibility visibility) {
            Utils.checkNotNull(visibility, "visibility");
            this.visibility = visibility;
            return this;
        }
        
        public Lobby build() {
            return new Lobby(
                appId,
                createdAt,
                createdBy,
                initialConfig,
                local,
                region,
                roomId,
                shortCode,
                state,
                visibility);
        }
    }
}

