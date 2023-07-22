/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateLocalLobbyRequestBody {
    /**
     * User input to initialize the game state. Object must be smaller than 64KB.
     */
    @JsonProperty("initialConfig")
    public dev.hathora.cloud_api.models.shared.LobbyInitialConfig initialConfig;

    public CreateLocalLobbyRequestBody withInitialConfig(dev.hathora.cloud_api.models.shared.LobbyInitialConfig initialConfig) {
        this.initialConfig = initialConfig;
        return this;
    }
    
    /**
     * Available regions to request a game server.
     */
    @JsonProperty("region")
    public dev.hathora.cloud_api.models.shared.Region region;

    public CreateLocalLobbyRequestBody withRegion(dev.hathora.cloud_api.models.shared.Region region) {
        this.region = region;
        return this;
    }
    
    public CreateLocalLobbyRequestBody(@JsonProperty("initialConfig") dev.hathora.cloud_api.models.shared.LobbyInitialConfig initialConfig, @JsonProperty("region") dev.hathora.cloud_api.models.shared.Region region) {
        this.initialConfig = initialConfig;
        this.region = region;
  }
}
