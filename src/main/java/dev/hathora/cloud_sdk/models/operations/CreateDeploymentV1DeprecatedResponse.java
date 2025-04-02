/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hathora.cloud_sdk.models.shared.DeploymentV1;
import dev.hathora.cloud_sdk.utils.Response;
import dev.hathora.cloud_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;

public class CreateDeploymentV1DeprecatedResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    private Optional<? extends DeploymentV1> deploymentV1;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public CreateDeploymentV1DeprecatedResponse(
            String contentType,
            Optional<? extends DeploymentV1> deploymentV1,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(deploymentV1, "deploymentV1");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.deploymentV1 = deploymentV1;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public CreateDeploymentV1DeprecatedResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), statusCode, rawResponse);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DeploymentV1> deploymentV1() {
        return (Optional<DeploymentV1>) deploymentV1;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * HTTP response content type for this operation
     */
    public CreateDeploymentV1DeprecatedResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    public CreateDeploymentV1DeprecatedResponse withDeploymentV1(DeploymentV1 deploymentV1) {
        Utils.checkNotNull(deploymentV1, "deploymentV1");
        this.deploymentV1 = Optional.ofNullable(deploymentV1);
        return this;
    }

    public CreateDeploymentV1DeprecatedResponse withDeploymentV1(Optional<? extends DeploymentV1> deploymentV1) {
        Utils.checkNotNull(deploymentV1, "deploymentV1");
        this.deploymentV1 = deploymentV1;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateDeploymentV1DeprecatedResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateDeploymentV1DeprecatedResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
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
        CreateDeploymentV1DeprecatedResponse other = (CreateDeploymentV1DeprecatedResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.deploymentV1, other.deploymentV1) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            deploymentV1,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateDeploymentV1DeprecatedResponse.class,
                "contentType", contentType,
                "deploymentV1", deploymentV1,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends DeploymentV1> deploymentV1 = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        public Builder deploymentV1(DeploymentV1 deploymentV1) {
            Utils.checkNotNull(deploymentV1, "deploymentV1");
            this.deploymentV1 = Optional.ofNullable(deploymentV1);
            return this;
        }

        public Builder deploymentV1(Optional<? extends DeploymentV1> deploymentV1) {
            Utils.checkNotNull(deploymentV1, "deploymentV1");
            this.deploymentV1 = deploymentV1;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }
        
        public CreateDeploymentV1DeprecatedResponse build() {
            return new CreateDeploymentV1DeprecatedResponse(
                contentType,
                deploymentV1,
                statusCode,
                rawResponse);
        }
    }
}
