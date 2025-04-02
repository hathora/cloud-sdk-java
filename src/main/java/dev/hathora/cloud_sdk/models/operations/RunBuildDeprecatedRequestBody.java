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

public class RunBuildDeprecatedRequestBody {

    @SpeakeasyMetadata("multipartForm:file,name=file")
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
            Objects.deepEquals(this.file, other.file);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
