/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum StartingConnectionInfoStatus {
    STARTING("starting");

    @JsonValue
    public final String value;

    private StartingConnectionInfoStatus(String value) {
        this.value = value;
    }
}
