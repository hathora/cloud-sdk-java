/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum StartingConnectionInfoStatus {
    STARTING("starting");

    @JsonValue
    private final String value;

    private StartingConnectionInfoStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
