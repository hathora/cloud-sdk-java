/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum Region {
    SEATTLE("Seattle"),
    LOS_ANGELES("Los_Angeles"),
    WASHINGTON_DC("Washington_DC"),
    CHICAGO("Chicago"),
    LONDON("London"),
    FRANKFURT("Frankfurt"),
    MUMBAI("Mumbai"),
    SINGAPORE("Singapore"),
    TOKYO("Tokyo"),
    SYDNEY("Sydney"),
    SAO_PAULO("Sao_Paulo"),
    DALLAS("Dallas"),
    JOHANNESBURG("Johannesburg"),
    DUBAI("Dubai");

    @JsonValue
    private final String value;

    private Region(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
