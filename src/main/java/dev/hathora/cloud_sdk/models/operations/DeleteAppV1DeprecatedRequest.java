/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class DeleteAppV1DeprecatedRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @JsonCreator
    public DeleteAppV1DeprecatedRequest(
            Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
    }
    
    public DeleteAppV1DeprecatedRequest() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public DeleteAppV1DeprecatedRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public DeleteAppV1DeprecatedRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
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
        DeleteAppV1DeprecatedRequest other = (DeleteAppV1DeprecatedRequest) o;
        return 
            Objects.deepEquals(this.appId, other.appId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            appId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteAppV1DeprecatedRequest.class,
                "appId", appId);
    }
    
    public final static class Builder {
 
        private Optional<String> appId = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
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
        
        public DeleteAppV1DeprecatedRequest build() {
            return new DeleteAppV1DeprecatedRequest(
                appId);
        }
    }
}
