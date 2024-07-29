/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * TransportType - Transport type specifies the underlying communication protocol to the exposed port.
 */
public enum TransportType {
    TCP("tcp"),
    UDP("udp"),
    TLS("tls");

    @JsonValue
    private final String value;

    private TransportType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
