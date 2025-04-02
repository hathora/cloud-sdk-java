/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

public class BuildsV3Page {

    @JsonProperty("builds")
    private List<BuildV3> builds;

    @JsonCreator
    public BuildsV3Page(
            @JsonProperty("builds") List<BuildV3> builds) {
        Utils.checkNotNull(builds, "builds");
        this.builds = builds;
    }

    @JsonIgnore
    public List<BuildV3> builds() {
        return builds;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public BuildsV3Page withBuilds(List<BuildV3> builds) {
        Utils.checkNotNull(builds, "builds");
        this.builds = builds;
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
        BuildsV3Page other = (BuildsV3Page) o;
        return 
            Objects.deepEquals(this.builds, other.builds);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            builds);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BuildsV3Page.class,
                "builds", builds);
    }
    
    public final static class Builder {
 
        private List<BuildV3> builds;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder builds(List<BuildV3> builds) {
            Utils.checkNotNull(builds, "builds");
            this.builds = builds;
            return this;
        }
        
        public BuildsV3Page build() {
            return new BuildsV3Page(
                builds);
        }
    }
}
