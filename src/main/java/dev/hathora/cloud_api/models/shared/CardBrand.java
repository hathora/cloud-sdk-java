/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
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

public enum CardBrand {
    AMEX("amex"),
    CARTES_BANCAIRES("cartes_bancaires"),
    DINERS("diners"),
    DISCOVER("discover"),
    JCB("jcb"),
    MASTERCARD("mastercard"),
    VISA("visa"),
    UNIONPAY("unionpay"),
    CARD("card");

    @JsonValue
    private final String value;

    private CardBrand(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
