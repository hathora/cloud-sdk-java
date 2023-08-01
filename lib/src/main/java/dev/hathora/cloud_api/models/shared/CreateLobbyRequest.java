/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateLobbyRequest {
    /**
     * User input to initialize the game state. Object must be smaller than 64KB.
     */
    @JsonProperty("initialConfig")
    public LobbyInitialConfig initialConfig;

    public CreateLobbyRequest withInitialConfig(LobbyInitialConfig initialConfig) {
        this.initialConfig = initialConfig;
        return this;
    }
    
    /**
     * Available regions to request a game server.
     */
    @JsonProperty("region")
    public Region region;

    public CreateLobbyRequest withRegion(Region region) {
        this.region = region;
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
    @JsonProperty("visibility")
    public LobbyVisibility visibility;

    public CreateLobbyRequest withVisibility(LobbyVisibility visibility) {
        this.visibility = visibility;
        return this;
    }
    
    public CreateLobbyRequest(@JsonProperty("initialConfig") LobbyInitialConfig initialConfig, @JsonProperty("region") Region region, @JsonProperty("visibility") LobbyVisibility visibility) {
        this.initialConfig = initialConfig;
        this.region = region;
        this.visibility = visibility;
  }
}