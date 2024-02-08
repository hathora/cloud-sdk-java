/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;

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
    SAO_PAULO("Sao_Paulo");

    @JsonValue
    private final String value;

    private Region(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
