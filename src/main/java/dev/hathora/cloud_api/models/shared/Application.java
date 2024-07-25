/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
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
/**
 * Application - An application object is the top level namespace for the game server.
 */

public class Application {

    /**
     * System generated unique identifier for an application.
     */
    @JsonProperty("appId")
    private String appId;

    /**
     * Readable name for an application. Must be unique within an organization.
     */
    @JsonProperty("appName")
    private String appName;

    /**
     * Secret that is used for identity and access management.
     */
    @JsonProperty("appSecret")
    private String appSecret;

    /**
     * Configure [player authentication](https://hathora.dev/docs/lobbies-and-matchmaking/auth-service) for your application. Use Hathora's built-in auth providers or use your own [custom authentication](https://hathora.dev/docs/lobbies-and-matchmaking/auth-service#custom-auth-provider).
     */
    @JsonProperty("authConfiguration")
    private AuthConfiguration authConfiguration;

    /**
     * When the application was created.
     */
    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("createdBy")
    private String createdBy;

    /**
     * When the application was deleted.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("deletedAt")
    private Optional<? extends OffsetDateTime> deletedAt;

    /**
     * The email address or token id for the user that deleted the application.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("deletedBy")
    private Optional<? extends String> deletedBy;

    /**
     * System generated unique identifier for an organization. Not guaranteed to have a specific format.
     */
    @JsonProperty("orgId")
    private String orgId;

    @JsonCreator
    public Application(
            @JsonProperty("appId") String appId,
            @JsonProperty("appName") String appName,
            @JsonProperty("appSecret") String appSecret,
            @JsonProperty("authConfiguration") AuthConfiguration authConfiguration,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("createdBy") String createdBy,
            @JsonProperty("deletedAt") Optional<? extends OffsetDateTime> deletedAt,
            @JsonProperty("deletedBy") Optional<? extends String> deletedBy,
            @JsonProperty("orgId") String orgId) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(appName, "appName");
        Utils.checkNotNull(appSecret, "appSecret");
        Utils.checkNotNull(authConfiguration, "authConfiguration");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(createdBy, "createdBy");
        Utils.checkNotNull(deletedAt, "deletedAt");
        Utils.checkNotNull(deletedBy, "deletedBy");
        Utils.checkNotNull(orgId, "orgId");
        this.appId = appId;
        this.appName = appName;
        this.appSecret = appSecret;
        this.authConfiguration = authConfiguration;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.deletedAt = deletedAt;
        this.deletedBy = deletedBy;
        this.orgId = orgId;
    }
    
    public Application(
            String appId,
            String appName,
            String appSecret,
            AuthConfiguration authConfiguration,
            OffsetDateTime createdAt,
            String createdBy,
            String orgId) {
        this(appId, appName, appSecret, authConfiguration, createdAt, createdBy, Optional.empty(), Optional.empty(), orgId);
    }

    /**
     * System generated unique identifier for an application.
     */
    @JsonIgnore
    public String appId() {
        return appId;
    }

    /**
     * Readable name for an application. Must be unique within an organization.
     */
    @JsonIgnore
    public String appName() {
        return appName;
    }

    /**
     * Secret that is used for identity and access management.
     */
    @JsonIgnore
    public String appSecret() {
        return appSecret;
    }

    /**
     * Configure [player authentication](https://hathora.dev/docs/lobbies-and-matchmaking/auth-service) for your application. Use Hathora's built-in auth providers or use your own [custom authentication](https://hathora.dev/docs/lobbies-and-matchmaking/auth-service#custom-auth-provider).
     */
    @JsonIgnore
    public AuthConfiguration authConfiguration() {
        return authConfiguration;
    }

    /**
     * When the application was created.
     */
    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public String createdBy() {
        return createdBy;
    }

    /**
     * When the application was deleted.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> deletedAt() {
        return (Optional<OffsetDateTime>) deletedAt;
    }

    /**
     * The email address or token id for the user that deleted the application.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> deletedBy() {
        return (Optional<String>) deletedBy;
    }

    /**
     * System generated unique identifier for an organization. Not guaranteed to have a specific format.
     */
    @JsonIgnore
    public String orgId() {
        return orgId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * System generated unique identifier for an application.
     */
    public Application withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * Readable name for an application. Must be unique within an organization.
     */
    public Application withAppName(String appName) {
        Utils.checkNotNull(appName, "appName");
        this.appName = appName;
        return this;
    }

    /**
     * Secret that is used for identity and access management.
     */
    public Application withAppSecret(String appSecret) {
        Utils.checkNotNull(appSecret, "appSecret");
        this.appSecret = appSecret;
        return this;
    }

    /**
     * Configure [player authentication](https://hathora.dev/docs/lobbies-and-matchmaking/auth-service) for your application. Use Hathora's built-in auth providers or use your own [custom authentication](https://hathora.dev/docs/lobbies-and-matchmaking/auth-service#custom-auth-provider).
     */
    public Application withAuthConfiguration(AuthConfiguration authConfiguration) {
        Utils.checkNotNull(authConfiguration, "authConfiguration");
        this.authConfiguration = authConfiguration;
        return this;
    }

    /**
     * When the application was created.
     */
    public Application withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public Application withCreatedBy(String createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = createdBy;
        return this;
    }

    /**
     * When the application was deleted.
     */
    public Application withDeletedAt(OffsetDateTime deletedAt) {
        Utils.checkNotNull(deletedAt, "deletedAt");
        this.deletedAt = Optional.ofNullable(deletedAt);
        return this;
    }

    /**
     * When the application was deleted.
     */
    public Application withDeletedAt(Optional<? extends OffsetDateTime> deletedAt) {
        Utils.checkNotNull(deletedAt, "deletedAt");
        this.deletedAt = deletedAt;
        return this;
    }

    /**
     * The email address or token id for the user that deleted the application.
     */
    public Application withDeletedBy(String deletedBy) {
        Utils.checkNotNull(deletedBy, "deletedBy");
        this.deletedBy = Optional.ofNullable(deletedBy);
        return this;
    }

    /**
     * The email address or token id for the user that deleted the application.
     */
    public Application withDeletedBy(Optional<? extends String> deletedBy) {
        Utils.checkNotNull(deletedBy, "deletedBy");
        this.deletedBy = deletedBy;
        return this;
    }

    /**
     * System generated unique identifier for an organization. Not guaranteed to have a specific format.
     */
    public Application withOrgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
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
        Application other = (Application) o;
        return 
            java.util.Objects.deepEquals(this.appId, other.appId) &&
            java.util.Objects.deepEquals(this.appName, other.appName) &&
            java.util.Objects.deepEquals(this.appSecret, other.appSecret) &&
            java.util.Objects.deepEquals(this.authConfiguration, other.authConfiguration) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.createdBy, other.createdBy) &&
            java.util.Objects.deepEquals(this.deletedAt, other.deletedAt) &&
            java.util.Objects.deepEquals(this.deletedBy, other.deletedBy) &&
            java.util.Objects.deepEquals(this.orgId, other.orgId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            appId,
            appName,
            appSecret,
            authConfiguration,
            createdAt,
            createdBy,
            deletedAt,
            deletedBy,
            orgId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Application.class,
                "appId", appId,
                "appName", appName,
                "appSecret", appSecret,
                "authConfiguration", authConfiguration,
                "createdAt", createdAt,
                "createdBy", createdBy,
                "deletedAt", deletedAt,
                "deletedBy", deletedBy,
                "orgId", orgId);
    }
    
    public final static class Builder {
 
        private String appId;
 
        private String appName;
 
        private String appSecret;
 
        private AuthConfiguration authConfiguration;
 
        private OffsetDateTime createdAt;
 
        private String createdBy;
 
        private Optional<? extends OffsetDateTime> deletedAt = Optional.empty();
 
        private Optional<? extends String> deletedBy = Optional.empty();
 
        private String orgId;  
        
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
         * Readable name for an application. Must be unique within an organization.
         */
        public Builder appName(String appName) {
            Utils.checkNotNull(appName, "appName");
            this.appName = appName;
            return this;
        }

        /**
         * Secret that is used for identity and access management.
         */
        public Builder appSecret(String appSecret) {
            Utils.checkNotNull(appSecret, "appSecret");
            this.appSecret = appSecret;
            return this;
        }

        /**
         * Configure [player authentication](https://hathora.dev/docs/lobbies-and-matchmaking/auth-service) for your application. Use Hathora's built-in auth providers or use your own [custom authentication](https://hathora.dev/docs/lobbies-and-matchmaking/auth-service#custom-auth-provider).
         */
        public Builder authConfiguration(AuthConfiguration authConfiguration) {
            Utils.checkNotNull(authConfiguration, "authConfiguration");
            this.authConfiguration = authConfiguration;
            return this;
        }

        /**
         * When the application was created.
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder createdBy(String createdBy) {
            Utils.checkNotNull(createdBy, "createdBy");
            this.createdBy = createdBy;
            return this;
        }

        /**
         * When the application was deleted.
         */
        public Builder deletedAt(OffsetDateTime deletedAt) {
            Utils.checkNotNull(deletedAt, "deletedAt");
            this.deletedAt = Optional.ofNullable(deletedAt);
            return this;
        }

        /**
         * When the application was deleted.
         */
        public Builder deletedAt(Optional<? extends OffsetDateTime> deletedAt) {
            Utils.checkNotNull(deletedAt, "deletedAt");
            this.deletedAt = deletedAt;
            return this;
        }

        /**
         * The email address or token id for the user that deleted the application.
         */
        public Builder deletedBy(String deletedBy) {
            Utils.checkNotNull(deletedBy, "deletedBy");
            this.deletedBy = Optional.ofNullable(deletedBy);
            return this;
        }

        /**
         * The email address or token id for the user that deleted the application.
         */
        public Builder deletedBy(Optional<? extends String> deletedBy) {
            Utils.checkNotNull(deletedBy, "deletedBy");
            this.deletedBy = deletedBy;
            return this;
        }

        /**
         * System generated unique identifier for an organization. Not guaranteed to have a specific format.
         */
        public Builder orgId(String orgId) {
            Utils.checkNotNull(orgId, "orgId");
            this.orgId = orgId;
            return this;
        }
        
        public Application build() {
            return new Application(
                appId,
                appName,
                appSecret,
                authConfiguration,
                createdAt,
                createdBy,
                deletedAt,
                deletedBy,
                orgId);
        }
    }
}

