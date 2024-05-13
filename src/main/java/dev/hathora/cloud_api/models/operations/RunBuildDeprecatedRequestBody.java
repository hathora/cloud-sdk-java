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


public class RunBuildDeprecatedRequestBody {

    @SpeakeasyMetadata("multipartForm:file")
    private File file;

    @JsonCreator
    public RunBuildDeprecatedRequestBody(
            File file) {
        Utils.checkNotNull(file, "file");
        this.file = file;
    }

    @JsonIgnore
    public File file() {
        return file;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RunBuildDeprecatedRequestBody withFile(File file) {
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
        RunBuildDeprecatedRequestBody other = (RunBuildDeprecatedRequestBody) o;
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
        return Utils.toString(RunBuildDeprecatedRequestBody.class,
                "file", file);
    }
    
    public final static class Builder {
 
        private File file;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder file(File file) {
            Utils.checkNotNull(file, "file");
            this.file = file;
            return this;
        }
        
        public RunBuildDeprecatedRequestBody build() {
            return new RunBuildDeprecatedRequestBody(
                file);
        }
    }
}

