/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class RunBuildRequestBody {

    @SpeakeasyMetadata("multipartForm:file")
    private RunBuildFile file;

    @JsonCreator
    public RunBuildRequestBody(
            RunBuildFile file) {
        Utils.checkNotNull(file, "file");
        this.file = file;
    }

    @JsonIgnore
    public RunBuildFile file() {
        return file;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RunBuildRequestBody withFile(RunBuildFile file) {
        Utils.checkNotNull(file, "file");
        this.file = file;
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
        RunBuildRequestBody other = (RunBuildRequestBody) o;
        return 
            java.util.Objects.deepEquals(this.file, other.file);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            file);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RunBuildRequestBody.class,
                "file", file);
    }
    
    public final static class Builder {
 
        private RunBuildFile file;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder file(RunBuildFile file) {
            Utils.checkNotNull(file, "file");
            this.file = file;
            return this;
        }
        
        public RunBuildRequestBody build() {
            return new RunBuildRequestBody(
                file);
        }
    }
}

