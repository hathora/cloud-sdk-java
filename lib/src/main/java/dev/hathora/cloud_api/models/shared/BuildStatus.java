/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;

/**
 * BuildStatus - Current status of your build.
 * 
 * `created`: a build was created but not yet run
 * 
 * `running`: the build process is actively executing
 * 
 * `succeeded`: the game server artifact was successfully built and stored in the Hathora registries
 * 
 * `failed`: the build process was unsuccessful, most likely due to an error with the `Dockerfile`
 */
public enum BuildStatus {
    CREATED("created"),
    RUNNING("running"),
    SUCCEEDED("succeeded"),
    FAILED("failed");

    @JsonValue
    private final String value;

    private BuildStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
