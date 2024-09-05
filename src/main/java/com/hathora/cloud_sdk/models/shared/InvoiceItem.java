/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hathora.cloud_sdk.utils.Utils;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class InvoiceItem {

    @JsonProperty("amount")
    private double amount;

    @JsonProperty("productName")
    private String productName;

    @JsonProperty("quantity")
    private double quantity;

    @JsonProperty("unit")
    private String unit;

    @JsonProperty("unitPrice")
    private double unitPrice;

    @JsonCreator
    public InvoiceItem(
            @JsonProperty("amount") double amount,
            @JsonProperty("productName") String productName,
            @JsonProperty("quantity") double quantity,
            @JsonProperty("unit") String unit,
            @JsonProperty("unitPrice") double unitPrice) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(productName, "productName");
        Utils.checkNotNull(quantity, "quantity");
        Utils.checkNotNull(unit, "unit");
        Utils.checkNotNull(unitPrice, "unitPrice");
        this.amount = amount;
        this.productName = productName;
        this.quantity = quantity;
        this.unit = unit;
        this.unitPrice = unitPrice;
    }

    @JsonIgnore
    public double amount() {
        return amount;
    }

    @JsonIgnore
    public String productName() {
        return productName;
    }

    @JsonIgnore
    public double quantity() {
        return quantity;
    }

    @JsonIgnore
    public String unit() {
        return unit;
    }

    @JsonIgnore
    public double unitPrice() {
        return unitPrice;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public InvoiceItem withAmount(double amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    public InvoiceItem withProductName(String productName) {
        Utils.checkNotNull(productName, "productName");
        this.productName = productName;
        return this;
    }

    public InvoiceItem withQuantity(double quantity) {
        Utils.checkNotNull(quantity, "quantity");
        this.quantity = quantity;
        return this;
    }

    public InvoiceItem withUnit(String unit) {
        Utils.checkNotNull(unit, "unit");
        this.unit = unit;
        return this;
    }

    public InvoiceItem withUnitPrice(double unitPrice) {
        Utils.checkNotNull(unitPrice, "unitPrice");
        this.unitPrice = unitPrice;
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
        InvoiceItem other = (InvoiceItem) o;
        return 
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.productName, other.productName) &&
            Objects.deepEquals(this.quantity, other.quantity) &&
            Objects.deepEquals(this.unit, other.unit) &&
            Objects.deepEquals(this.unitPrice, other.unitPrice);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            amount,
            productName,
            quantity,
            unit,
            unitPrice);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InvoiceItem.class,
                "amount", amount,
                "productName", productName,
                "quantity", quantity,
                "unit", unit,
                "unitPrice", unitPrice);
    }
    
    public final static class Builder {
 
        private Double amount;
 
        private String productName;
 
        private Double quantity;
 
        private String unit;
 
        private Double unitPrice;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder amount(double amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        public Builder productName(String productName) {
            Utils.checkNotNull(productName, "productName");
            this.productName = productName;
            return this;
        }

        public Builder quantity(double quantity) {
            Utils.checkNotNull(quantity, "quantity");
            this.quantity = quantity;
            return this;
        }

        public Builder unit(String unit) {
            Utils.checkNotNull(unit, "unit");
            this.unit = unit;
            return this;
        }

        public Builder unitPrice(double unitPrice) {
            Utils.checkNotNull(unitPrice, "unitPrice");
            this.unitPrice = unitPrice;
            return this;
        }
        
        public InvoiceItem build() {
            return new InvoiceItem(
                amount,
                productName,
                quantity,
                unit,
                unitPrice);
        }
    }
}
