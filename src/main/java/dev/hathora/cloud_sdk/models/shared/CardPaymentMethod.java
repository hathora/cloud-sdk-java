/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CardPaymentMethod {

    @JsonProperty("brand")
    private CardBrand brand;

    @JsonProperty("last4")
    private String last4;

    @JsonCreator
    public CardPaymentMethod(
            @JsonProperty("brand") CardBrand brand,
            @JsonProperty("last4") String last4) {
        Utils.checkNotNull(brand, "brand");
        Utils.checkNotNull(last4, "last4");
        this.brand = brand;
        this.last4 = last4;
    }

    @JsonIgnore
    public CardBrand brand() {
        return brand;
    }

    @JsonIgnore
    public String last4() {
        return last4;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CardPaymentMethod withBrand(CardBrand brand) {
        Utils.checkNotNull(brand, "brand");
        this.brand = brand;
        return this;
    }

    public CardPaymentMethod withLast4(String last4) {
        Utils.checkNotNull(last4, "last4");
        this.last4 = last4;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CardPaymentMethod other = (CardPaymentMethod) o;
        return 
            Objects.deepEquals(this.brand, other.brand) &&
            Objects.deepEquals(this.last4, other.last4);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            brand,
            last4);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CardPaymentMethod.class,
                "brand", brand,
                "last4", last4);
    }
    
    public final static class Builder {
 
        private CardBrand brand;
 
        private String last4;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder brand(CardBrand brand) {
            Utils.checkNotNull(brand, "brand");
            this.brand = brand;
            return this;
        }

        public Builder last4(String last4) {
            Utils.checkNotNull(last4, "last4");
            this.last4 = last4;
            return this;
        }
        
        public CardPaymentMethod build() {
            return new CardPaymentMethod(
                brand,
                last4);
        }
    }
}
