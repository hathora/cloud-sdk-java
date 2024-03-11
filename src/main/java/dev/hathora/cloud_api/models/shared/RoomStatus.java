/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * RoomStatus - The allocation status of a room.
 * 
 * `scheduling`: a process is not allocated yet and the room is waiting to be scheduled
 * 
 * `active`: ready to accept connections
 * 
 * `suspended`: room is unallocated from the process but can be rescheduled later with the same `roomId`
 * 
 * `destroyed`: all associated metadata is deleted
 */
public enum RoomStatus {
    SCHEDULING("scheduling"),
    ACTIVE("active"),
    SUSPENDED("suspended"),
    DESTROYED("destroyed");

    @JsonValue
    private final String value;

    private RoomStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}