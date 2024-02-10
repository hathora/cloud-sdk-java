/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.utils.LazySingletonValue;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class GetLogsForProcessRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<? extends String> appId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=follow")
    private Optional<? extends Boolean> follow;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=processId")
    private String processId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=tailLines")
    private Optional<? extends Integer> tailLines;

    public GetLogsForProcessRequest(
            Optional<? extends String> appId,
            Optional<? extends Boolean> follow,
            String processId,
            Optional<? extends Integer> tailLines) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(follow, "follow");
        Utils.checkNotNull(processId, "processId");
        Utils.checkNotNull(tailLines, "tailLines");
        this.appId = appId;
        this.follow = follow;
        this.processId = processId;
        this.tailLines = tailLines;
    }

    public Optional<? extends String> appId() {
        return appId;
    }

    public Optional<? extends Boolean> follow() {
        return follow;
    }

    public String processId() {
        return processId;
    }

    public Optional<? extends Integer> tailLines() {
        return tailLines;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public GetLogsForProcessRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }
    
    public GetLogsForProcessRequest withAppId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetLogsForProcessRequest withFollow(boolean follow) {
        Utils.checkNotNull(follow, "follow");
        this.follow = Optional.ofNullable(follow);
        return this;
    }
    
    public GetLogsForProcessRequest withFollow(Optional<? extends Boolean> follow) {
        Utils.checkNotNull(follow, "follow");
        this.follow = follow;
        return this;
    }

    public GetLogsForProcessRequest withProcessId(String processId) {
        Utils.checkNotNull(processId, "processId");
        this.processId = processId;
        return this;
    }

    public GetLogsForProcessRequest withTailLines(int tailLines) {
        Utils.checkNotNull(tailLines, "tailLines");
        this.tailLines = Optional.ofNullable(tailLines);
        return this;
    }
    
    public GetLogsForProcessRequest withTailLines(Optional<? extends Integer> tailLines) {
        Utils.checkNotNull(tailLines, "tailLines");
        this.tailLines = tailLines;
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
        GetLogsForProcessRequest other = (GetLogsForProcessRequest) o;
        return 
            java.util.Objects.deepEquals(this.appId, other.appId) &&
            java.util.Objects.deepEquals(this.follow, other.follow) &&
            java.util.Objects.deepEquals(this.processId, other.processId) &&
            java.util.Objects.deepEquals(this.tailLines, other.tailLines);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            appId,
            follow,
            processId,
            tailLines);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLogsForProcessRequest.class,
                "appId", appId,
                "follow", follow,
                "processId", processId,
                "tailLines", tailLines);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> appId = Optional.empty();
 
        private Optional<? extends Boolean> follow;
 
        private String processId;
 
        private Optional<? extends Integer> tailLines;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder appId(String appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = Optional.ofNullable(appId);
            return this;
        }
        
        public Builder appId(Optional<? extends String> appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = appId;
            return this;
        }

        public Builder follow(boolean follow) {
            Utils.checkNotNull(follow, "follow");
            this.follow = Optional.ofNullable(follow);
            return this;
        }
        
        public Builder follow(Optional<? extends Boolean> follow) {
            Utils.checkNotNull(follow, "follow");
            this.follow = follow;
            return this;
        }

        public Builder processId(String processId) {
            Utils.checkNotNull(processId, "processId");
            this.processId = processId;
            return this;
        }

        public Builder tailLines(int tailLines) {
            Utils.checkNotNull(tailLines, "tailLines");
            this.tailLines = Optional.ofNullable(tailLines);
            return this;
        }
        
        public Builder tailLines(Optional<? extends Integer> tailLines) {
            Utils.checkNotNull(tailLines, "tailLines");
            this.tailLines = tailLines;
            return this;
        }
        
        public GetLogsForProcessRequest build() {
            if (follow == null) {
                follow = _SINGLETON_VALUE_Follow.value();
            }
            if (tailLines == null) {
                tailLines = _SINGLETON_VALUE_TailLines.value();
            }
            return new GetLogsForProcessRequest(
                appId,
                follow,
                processId,
                tailLines);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_Follow =
                new LazySingletonValue<>(
                        "follow",
                        "\"false\"",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends Integer>> _SINGLETON_VALUE_TailLines =
                new LazySingletonValue<>(
                        "tailLines",
                        "\"100\"",
                        new TypeReference<Optional<? extends Integer>>() {});
    }
}

