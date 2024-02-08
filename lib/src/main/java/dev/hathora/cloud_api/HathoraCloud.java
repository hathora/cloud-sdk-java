/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api;

import dev.hathora.cloud_api.models.operations.SDKMethodInterfaces.*;
import dev.hathora.cloud_api.utils.HTTPClient;
import dev.hathora.cloud_api.utils.SpeakeasyHTTPClient;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Hathora Cloud API: Welcome to the Hathora Cloud API documentation! Learn how to use the Hathora Cloud APIs to build and scale your game servers globally.
 */
public class HathoraCloud {
    /**
     * SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] SERVERS = {
        "https://api.hathora.dev",
        "https:///",
    };

    /**
     * Operations that allow you manage your [applications](https://hathora.dev/docs/concepts/hathora-entities#application).
     */
    private final AppV1 appV1;

    /**
     * Operations that allow you to generate a Hathora-signed [JSON web token (JWT)](https://jwt.io/) for [player authentication](https://hathora.dev/docs/lobbies-and-matchmaking/auth-service).
     */
    private final AuthV1 authV1;

    private final BillingV1 billingV1;

    /**
     * Operations that allow you create and manage your [builds](https://hathora.dev/docs/concepts/hathora-entities#build).
     */
    private final BuildV1 buildV1;

    /**
     * Operations that allow you configure and manage an application's [build](https://hathora.dev/docs/concepts/hathora-entities#build) at runtime.
     */
    private final DeploymentV1 deploymentV1;

    /**
     * Service that allows clients to directly ping all Hathora regions to get latency information
     */
    private final DiscoveryV1 discoveryV1;

    /**
     * Deprecated. Use [LobbyV3](https://hathora.dev/api#tag/LobbyV3).
     */
    private final LobbyV1 lobbyV1;

    /**
     * Deprecated. Use [LobbyV3](https://hathora.dev/api#tag/LobbyV3).
     */
    private final LobbyV2 lobbyV2;

    /**
     * Operations to create and manage lobbies using our [Lobby Service](https://hathora.dev/docs/lobbies-and-matchmaking/lobby-service).
     */
    private final LobbyV3 lobbyV3;

    /**
     * Operations to get logs by [applications](https://hathora.dev/docs/concepts/hathora-entities#application), [processes](https://hathora.dev/docs/concepts/hathora-entities#process), and [deployments](https://hathora.dev/docs/concepts/hathora-entities#deployment). We store 20GB of logs data.
     */
    private final LogV1 logV1;

    private final ManagementV1 managementV1;

    /**
     * Operations to get metrics by [process](https://hathora.dev/docs/concepts/hathora-entities#process). We store 72 hours of metrics data.
     */
    private final MetricsV1 metricsV1;

    /**
     * Deprecated. Use [ProcessesV2](https://hathora.dev/api#tag/ProcessesV2).
     */
    private final ProcessesV1 processesV1;

    /**
     * Operations to get data on active and stopped [processes](https://hathora.dev/docs/concepts/hathora-entities#process).
     */
    private final ProcessesV2 processesV2;

    /**
     * Deprecated. Use [RoomV2](https://hathora.dev/api#tag/RoomV2).
     */
    private final RoomV1 roomV1;

    /**
     * Operations to create, manage, and connect to [rooms](https://hathora.dev/docs/concepts/hathora-entities#room).
     */
    private final RoomV2 roomV2;

    /**
     * Operations that allow you manage your [applications](https://hathora.dev/docs/concepts/hathora-entities#application).
     */
    public AppV1 appV1() {
        return appV1;
    }

    /**
     * Operations that allow you to generate a Hathora-signed [JSON web token (JWT)](https://jwt.io/) for [player authentication](https://hathora.dev/docs/lobbies-and-matchmaking/auth-service).
     */
    public AuthV1 authV1() {
        return authV1;
    }

    public BillingV1 billingV1() {
        return billingV1;
    }

    /**
     * Operations that allow you create and manage your [builds](https://hathora.dev/docs/concepts/hathora-entities#build).
     */
    public BuildV1 buildV1() {
        return buildV1;
    }

    /**
     * Operations that allow you configure and manage an application's [build](https://hathora.dev/docs/concepts/hathora-entities#build) at runtime.
     */
    public DeploymentV1 deploymentV1() {
        return deploymentV1;
    }

    /**
     * Service that allows clients to directly ping all Hathora regions to get latency information
     */
    public DiscoveryV1 discoveryV1() {
        return discoveryV1;
    }

    /**
     * Deprecated. Use [LobbyV3](https://hathora.dev/api#tag/LobbyV3).
     */
    public LobbyV1 lobbyV1() {
        return lobbyV1;
    }

    /**
     * Deprecated. Use [LobbyV3](https://hathora.dev/api#tag/LobbyV3).
     */
    public LobbyV2 lobbyV2() {
        return lobbyV2;
    }

    /**
     * Operations to create and manage lobbies using our [Lobby Service](https://hathora.dev/docs/lobbies-and-matchmaking/lobby-service).
     */
    public LobbyV3 lobbyV3() {
        return lobbyV3;
    }

    /**
     * Operations to get logs by [applications](https://hathora.dev/docs/concepts/hathora-entities#application), [processes](https://hathora.dev/docs/concepts/hathora-entities#process), and [deployments](https://hathora.dev/docs/concepts/hathora-entities#deployment). We store 20GB of logs data.
     */
    public LogV1 logV1() {
        return logV1;
    }

    public ManagementV1 managementV1() {
        return managementV1;
    }

    /**
     * Operations to get metrics by [process](https://hathora.dev/docs/concepts/hathora-entities#process). We store 72 hours of metrics data.
     */
    public MetricsV1 metricsV1() {
        return metricsV1;
    }

    /**
     * Deprecated. Use [ProcessesV2](https://hathora.dev/api#tag/ProcessesV2).
     */
    public ProcessesV1 processesV1() {
        return processesV1;
    }

    /**
     * Operations to get data on active and stopped [processes](https://hathora.dev/docs/concepts/hathora-entities#process).
     */
    public ProcessesV2 processesV2() {
        return processesV2;
    }

    /**
     * Deprecated. Use [RoomV2](https://hathora.dev/api#tag/RoomV2).
     */
    public RoomV1 roomV1() {
        return roomV1;
    }

    /**
     * Operations to create, manage, and connect to [rooms](https://hathora.dev/docs/concepts/hathora-entities#room).
     */
    public RoomV2 roomV2() {
        return roomV2;
    }  

    private final SDKConfiguration sdkConfiguration;

    /**
     * The Builder class allows the configuration of a new instance of the SDK.
     */
    public static class Builder {
  
        private final SDKConfiguration sdkConfiguration = new SDKConfiguration();

        private Builder() {
        }

        /**
         * Allows the default HTTP client to be overridden with a custom implementation.
         * @param client The HTTP client to use for all requests.
         * @return The builder instance.
         */
        public Builder client(HTTPClient client) {
            this.sdkConfiguration.defaultClient = client;
            return this;
        }
        
        /**
         * Configures the SDK to use the provided security details.
         * @param security The security details to use for all requests.
         * @return The builder instance.
         */
        public Builder security(dev.hathora.cloud_api.models.shared.Security security) {
            this.sdkConfiguration.securitySource = SecuritySource.of(security);
            return this;
        }

        public Builder securitySource(SecuritySource securitySource) {
            this.sdkConfiguration.securitySource = securitySource;
            return this;
        }
        
        /**
         * Allows the overriding of the default server URL.
         * @param serverUrl The server URL to use for all requests.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl) {
            this.sdkConfiguration.serverUrl = serverUrl;
            return this;
        }
        
        /**
         * Allows the overriding of the default server URL  with a templated URL populated with the provided parameters.
         * @param serverUrl The server URL to use for all requests.
         * @param params The parameters to use when templating the URL.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl, java.util.Map<String, String> params) {
            this.sdkConfiguration.serverUrl = dev.hathora.cloud_api.utils.Utils.templateUrl(serverUrl, params);
            return this;
        }
        
        /**
         * Allows the overriding of the default server by index
         * @param serverIdx The server to use for all requests.
         * @return The builder instance.
         */
        public Builder serverIndex(int serverIdx) {
            this.sdkConfiguration.serverIdx = serverIdx;
            this.sdkConfiguration.serverUrl = SERVERS[serverIdx];
            return this;
        }
        
        /**
         * Allows setting the appId parameter for all supported operations.
         * @param appId The value to set.
         * @return The builder instance.
         */
        public Builder appId(String appId) {
            if (!this.sdkConfiguration.globals.get("parameters").containsKey("pathParam")) {
                this.sdkConfiguration.globals.get("parameters").put("pathParam", new java.util.HashMap<>());
            }
    
            this.sdkConfiguration.globals.get("parameters").get("pathParam").put("appId", appId);
    
            return this;
        }
        
        /**
         * Builds a new instance of the SDK.
         * @return The SDK instance.
         * @throws Exception Thrown if the SDK could not be built.
         */
        public HathoraCloud build() throws Exception {
            if (sdkConfiguration.defaultClient == null) {
                sdkConfiguration.defaultClient = new SpeakeasyHTTPClient();
            }
	    if (sdkConfiguration.securitySource == null) {
	    	sdkConfiguration.securitySource = SecuritySource.of(null);
	    }
            if (sdkConfiguration.serverUrl == null || sdkConfiguration.serverUrl.isBlank()) {
                sdkConfiguration.serverUrl = SERVERS[0];
                sdkConfiguration.serverIdx = 0;
            }
            if (sdkConfiguration.serverUrl.endsWith("/")) {
                sdkConfiguration.serverUrl = sdkConfiguration.serverUrl.substring(0, sdkConfiguration.serverUrl.length() - 1);
            }
            return new HathoraCloud(sdkConfiguration);
        }
    }

    /**
     * Get a new instance of the SDK builder to configure a new instance of the SDK.
     * @return The SDK builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    private HathoraCloud(SDKConfiguration sdkConfiguration) throws Exception {
        this.sdkConfiguration = sdkConfiguration;
        this.appV1 = new AppV1(sdkConfiguration);
        this.authV1 = new AuthV1(sdkConfiguration);
        this.billingV1 = new BillingV1(sdkConfiguration);
        this.buildV1 = new BuildV1(sdkConfiguration);
        this.deploymentV1 = new DeploymentV1(sdkConfiguration);
        this.discoveryV1 = new DiscoveryV1(sdkConfiguration);
        this.lobbyV1 = new LobbyV1(sdkConfiguration);
        this.lobbyV2 = new LobbyV2(sdkConfiguration);
        this.lobbyV3 = new LobbyV3(sdkConfiguration);
        this.logV1 = new LogV1(sdkConfiguration);
        this.managementV1 = new ManagementV1(sdkConfiguration);
        this.metricsV1 = new MetricsV1(sdkConfiguration);
        this.processesV1 = new ProcessesV1(sdkConfiguration);
        this.processesV2 = new ProcessesV2(sdkConfiguration);
        this.roomV1 = new RoomV1(sdkConfiguration);
        this.roomV2 = new RoomV2(sdkConfiguration);
    }




























































}