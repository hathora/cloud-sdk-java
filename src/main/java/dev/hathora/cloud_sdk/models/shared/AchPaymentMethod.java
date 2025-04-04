/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class AchPaymentMethod {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bankName")
    private Optional<String> bankName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last4")
    private Optional<String> last4;

    @JsonCreator
    public AchPaymentMethod(
            @JsonProperty("bankName") Optional<String> bankName,
            @JsonProperty("last4") Optional<String> last4) {
        Utils.checkNotNull(bankName, "bankName");
        Utils.checkNotNull(last4, "last4");
        this.bankName = bankName;
        this.last4 = last4;
    }
    
    public AchPaymentMethod() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> bankName() {
        return bankName;
    }

    @JsonIgnore
    public Optional<String> last4() {
        return last4;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public AchPaymentMethod withBankName(String bankName) {
        Utils.checkNotNull(bankName, "bankName");
        this.bankName = Optional.ofNullable(bankName);
        return this;
    }

    public AchPaymentMethod withBankName(Optional<String> bankName) {
        Utils.checkNotNull(bankName, "bankName");
        this.bankName = bankName;
        return this;
    }

    public AchPaymentMethod withLast4(String last4) {
        Utils.checkNotNull(last4, "last4");
        this.last4 = Optional.ofNullable(last4);
        return this;
    }

    public AchPaymentMethod withLast4(Optional<String> last4) {
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
        AchPaymentMethod other = (AchPaymentMethod) o;
        return 
            Objects.deepEquals(this.bankName, other.bankName) &&
            Objects.deepEquals(this.last4, other.last4);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            bankName,
            last4);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AchPaymentMethod.class,
                "bankName", bankName,
                "last4", last4);
    }
    
    public final static class Builder {
 
        private Optional<String> bankName = Optional.empty();
 
        private Optional<String> last4 = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder bankName(String bankName) {
            Utils.checkNotNull(bankName, "bankName");
            this.bankName = Optional.ofNullable(bankName);
            return this;
        }

        public Builder bankName(Optional<String> bankName) {
            Utils.checkNotNull(bankName, "bankName");
            this.bankName = bankName;
            return this;
        }

        public Builder last4(String last4) {
            Utils.checkNotNull(last4, "last4");
            this.last4 = Optional.ofNullable(last4);
            return this;
        }

        public Builder last4(Optional<String> last4) {
            Utils.checkNotNull(last4, "last4");
            this.last4 = last4;
            return this;
        }
        
        public AchPaymentMethod build() {
            return new AchPaymentMethod(
                bankName,
                last4);
        }
    }
}
