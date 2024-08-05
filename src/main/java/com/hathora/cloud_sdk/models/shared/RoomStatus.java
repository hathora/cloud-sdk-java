/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.hathora.cloud_sdk.utils.Utils;
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
 * `destroyed`: all associated metadata is deleted
 */
public enum RoomStatus {
    SCHEDULING("scheduling"),
    ACTIVE("active"),
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