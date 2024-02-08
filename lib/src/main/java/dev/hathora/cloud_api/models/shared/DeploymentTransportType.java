/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;

/**
 * DeploymentTransportType
 * @deprecated enum: This will be removed in a future release, please migrate away from it as soon as possible.
 */
@Deprecated
public enum DeploymentTransportType {
    TCP("tcp"),
    UDP("udp"),
    TLS("tls");

    @JsonValue
    private final String value;

    private DeploymentTransportType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
