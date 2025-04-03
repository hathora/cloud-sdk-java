/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk;

import dev.hathora.cloud_sdk.utils.HTTPClient;
import dev.hathora.cloud_sdk.utils.RetryConfig;
import dev.hathora.cloud_sdk.utils.SpeakeasyHTTPClient;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Hathora Cloud API: Welcome to the Hathora Cloud API documentation! Learn how to use the Hathora Cloud APIs to build and scale your game servers globally.
 */
public class HathoraCloud {


    /**
     * SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] SERVERS = {
        "https://api.hathora.dev",
        "/",
    };

    private final AppsV1 appsV1;

    /**
     * Operations that allow you manage your [applications](https://hathora.dev/docs/concepts/hathora-entities#application).
     */
    private final AppsV2 appsV2;

    /**
     * Operations that allow you to generate a Hathora-signed [JSON web token (JWT)](https://jwt.io/) for [player authentication](https://hathora.dev/docs/lobbies-and-matchmaking/auth-service).
     */
    private final AuthV1 authV1;

    private final BillingV1 billingV1;

    private final BuildsV1 buildsV1;

    private final BuildsV2 buildsV2;

    /**
     * Operations that allow you create and manage your [builds](https://hathora.dev/docs/concepts/hathora-entities#build).
     */
    private final BuildsV3 buildsV3;

    private final DeploymentsV1 deploymentsV1;

    private final DeploymentsV2 deploymentsV2;

    /**
     * Operations that allow you configure and manage an application's [build](https://hathora.dev/docs/concepts/hathora-entities#build) at runtime.
     */
    private final DeploymentsV3 deploymentsV3;

    /**
     * Deprecated. Does not include latest Regions (missing Dallas region). Use [DiscoveryV2](https://hathora.dev/api#tag/DiscoveryV2).
     */
    private final DiscoveryV1 discoveryV1;

    /**
     * Service that allows clients to directly ping all Hathora regions to get latency information
     */
    private final DiscoveryV2 discoveryV2;

    /**
     * Operations to manage and view a [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet).
     */
    private final FleetsV1 fleetsV1;

    private final LobbiesV1 lobbiesV1;

    private final LobbiesV2 lobbiesV2;

    private final LobbiesV3 lobbiesV3;

    private final LogsV1 logsV1;

    private final ManagementV1 managementV1;

    /**
     * Deprecated. Use [ProcessesV3#GetProcessMetrics](https://hathora.dev/api#tag/ProcessesV3/operation/GetProcessMetrics) to fetch metrics about a specific process.
     */
    private final MetricsV1 metricsV1;

    private final OrganizationsV1 organizationsV1;

    /**
     * Deprecated. Use [ProcessesV3](https://hathora.dev/api#tag/ProcessesV3).
     */
    private final ProcessesV1 processesV1;

    /**
     * Deprecated. Use [ProcessesV3](https://hathora.dev/api#tag/ProcessesV3).
     */
    private final ProcessesV2 processesV2;

    /**
     * Operations to get data on active and stopped [processes](https://hathora.dev/docs/concepts/hathora-entities#process).
     */
    private final ProcessesV3 processesV3;

    private final RoomsV1 roomsV1;

    private final RoomsV2 roomsV2;

    private final TokensV1 tokensV1;

    public AppsV1 appsV1() {
        return appsV1;
    }

    /**
     * Operations that allow you manage your [applications](https://hathora.dev/docs/concepts/hathora-entities#application).
     */
    public AppsV2 appsV2() {
        return appsV2;
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

    public BuildsV1 buildsV1() {
        return buildsV1;
    }

    public BuildsV2 buildsV2() {
        return buildsV2;
    }

    /**
     * Operations that allow you create and manage your [builds](https://hathora.dev/docs/concepts/hathora-entities#build).
     */
    public BuildsV3 buildsV3() {
        return buildsV3;
    }

    public DeploymentsV1 deploymentsV1() {
        return deploymentsV1;
    }

    public DeploymentsV2 deploymentsV2() {
        return deploymentsV2;
    }

    /**
     * Operations that allow you configure and manage an application's [build](https://hathora.dev/docs/concepts/hathora-entities#build) at runtime.
     */
    public DeploymentsV3 deploymentsV3() {
        return deploymentsV3;
    }

    /**
     * Deprecated. Does not include latest Regions (missing Dallas region). Use [DiscoveryV2](https://hathora.dev/api#tag/DiscoveryV2).
     */
    public DiscoveryV1 discoveryV1() {
        return discoveryV1;
    }

    /**
     * Service that allows clients to directly ping all Hathora regions to get latency information
     */
    public DiscoveryV2 discoveryV2() {
        return discoveryV2;
    }

    /**
     * Operations to manage and view a [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet).
     */
    public FleetsV1 fleetsV1() {
        return fleetsV1;
    }

    public LobbiesV1 lobbiesV1() {
        return lobbiesV1;
    }

    public LobbiesV2 lobbiesV2() {
        return lobbiesV2;
    }

    public LobbiesV3 lobbiesV3() {
        return lobbiesV3;
    }

    public LogsV1 logsV1() {
        return logsV1;
    }

    public ManagementV1 managementV1() {
        return managementV1;
    }

    /**
     * Deprecated. Use [ProcessesV3#GetProcessMetrics](https://hathora.dev/api#tag/ProcessesV3/operation/GetProcessMetrics) to fetch metrics about a specific process.
     */
    public MetricsV1 metricsV1() {
        return metricsV1;
    }

    public OrganizationsV1 organizationsV1() {
        return organizationsV1;
    }

    /**
     * Deprecated. Use [ProcessesV3](https://hathora.dev/api#tag/ProcessesV3).
     */
    public ProcessesV1 processesV1() {
        return processesV1;
    }

    /**
     * Deprecated. Use [ProcessesV3](https://hathora.dev/api#tag/ProcessesV3).
     */
    public ProcessesV2 processesV2() {
        return processesV2;
    }

    /**
     * Operations to get data on active and stopped [processes](https://hathora.dev/docs/concepts/hathora-entities#process).
     */
    public ProcessesV3 processesV3() {
        return processesV3;
    }

    public RoomsV1 roomsV1() {
        return roomsV1;
    }

    public RoomsV2 roomsV2() {
        return roomsV2;
    }

    public TokensV1 tokensV1() {
        return tokensV1;
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
         *
         * @param client The HTTP client to use for all requests.
         * @return The builder instance.
         */
        public Builder client(HTTPClient client) {
            this.sdkConfiguration.defaultClient = client;
            return this;
        }
        
        /**
         * Configures the SDK to use the provided security details.
         *
         * @param security The security details to use for all requests.
         * @return The builder instance.
         */
        public Builder security(dev.hathora.cloud_sdk.models.shared.Security security) {
            this.sdkConfiguration.securitySource = SecuritySource.of(security);
            return this;
        }

        /**
         * Configures the SDK to use a custom security source.
         *
         * @param securitySource The security source to use for all requests.
         * @return The builder instance.
         */
        public Builder securitySource(SecuritySource securitySource) {
            this.sdkConfiguration.securitySource = securitySource;
            return this;
        }
        
        /**
         * Overrides the default server URL.
         *
         * @param serverUrl The server URL to use for all requests.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl) {
            this.sdkConfiguration.serverUrl = serverUrl;
            return this;
        }

        /**
         * Overrides the default server URL  with a templated URL populated with the provided parameters.
         *
         * @param serverUrl The server URL to use for all requests.
         * @param params The parameters to use when templating the URL.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl, Map<String, String> params) {
            this.sdkConfiguration.serverUrl = Utils.templateUrl(serverUrl, params);
            return this;
        }
        
        /**
         * Overrides the default server by index.
         *
         * @param serverIdx The server to use for all requests.
         * @return The builder instance.
         */
        public Builder serverIndex(int serverIdx) {
            this.sdkConfiguration.serverIdx = serverIdx;
            this.sdkConfiguration.serverUrl = SERVERS[serverIdx];
            return this;
        }
        
        /**
         * Overrides the default configuration for retries
         *
         * @param retryConfig The retry configuration to use for all requests.
         * @return The builder instance.
         */
        public Builder retryConfig(RetryConfig retryConfig) {
            this.sdkConfiguration.retryConfig = Optional.of(retryConfig);
            return this;
        }
        /**
         * Allows setting the appId parameter for all supported operations.
         *
         * @param appId The value to set.
         * @return The builder instance.
         */
        public Builder appId(String appId) {
            if (!this.sdkConfiguration.globals.get("parameters").containsKey("pathParam")) {
                this.sdkConfiguration.globals.get("parameters").put("pathParam", new HashMap<>());
            }

            this.sdkConfiguration.globals.get("parameters").get("pathParam").put("appId", appId);

            return this;
        }
        
        /**
         * Allows setting the orgId parameter for all supported operations.
         *
         * @param orgId The value to set.
         * @return The builder instance.
         */
        public Builder orgId(String orgId) {
            if (!this.sdkConfiguration.globals.get("parameters").containsKey("queryParam")) {
                this.sdkConfiguration.globals.get("parameters").put("queryParam", new HashMap<>());
            }

            this.sdkConfiguration.globals.get("parameters").get("queryParam").put("orgId", orgId);

            return this;
        }
        
        /**
         * Builds a new instance of the SDK.
         *
         * @return The SDK instance.
         */
        public HathoraCloud build() {
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
     *
     * @return The SDK builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    private HathoraCloud(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.appsV1 = new AppsV1(sdkConfiguration);
        this.appsV2 = new AppsV2(sdkConfiguration);
        this.authV1 = new AuthV1(sdkConfiguration);
        this.billingV1 = new BillingV1(sdkConfiguration);
        this.buildsV1 = new BuildsV1(sdkConfiguration);
        this.buildsV2 = new BuildsV2(sdkConfiguration);
        this.buildsV3 = new BuildsV3(sdkConfiguration);
        this.deploymentsV1 = new DeploymentsV1(sdkConfiguration);
        this.deploymentsV2 = new DeploymentsV2(sdkConfiguration);
        this.deploymentsV3 = new DeploymentsV3(sdkConfiguration);
        this.discoveryV1 = new DiscoveryV1(sdkConfiguration);
        this.discoveryV2 = new DiscoveryV2(sdkConfiguration);
        this.fleetsV1 = new FleetsV1(sdkConfiguration);
        this.lobbiesV1 = new LobbiesV1(sdkConfiguration);
        this.lobbiesV2 = new LobbiesV2(sdkConfiguration);
        this.lobbiesV3 = new LobbiesV3(sdkConfiguration);
        this.logsV1 = new LogsV1(sdkConfiguration);
        this.managementV1 = new ManagementV1(sdkConfiguration);
        this.metricsV1 = new MetricsV1(sdkConfiguration);
        this.organizationsV1 = new OrganizationsV1(sdkConfiguration);
        this.processesV1 = new ProcessesV1(sdkConfiguration);
        this.processesV2 = new ProcessesV2(sdkConfiguration);
        this.processesV3 = new ProcessesV3(sdkConfiguration);
        this.roomsV1 = new RoomsV1(sdkConfiguration);
        this.roomsV2 = new RoomsV2(sdkConfiguration);
        this.tokensV1 = new TokensV1(sdkConfiguration);
        this.sdkConfiguration.initialize();
    }}
