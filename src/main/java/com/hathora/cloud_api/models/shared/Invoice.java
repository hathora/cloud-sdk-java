/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;

public class Invoice {

    @JsonProperty("amountDue")
    private double amountDue;

    @JsonProperty("dueDate")
    private OffsetDateTime dueDate;

    @JsonProperty("id")
    private String id;

    @JsonProperty("month")
    private double month;

    @JsonProperty("pdfUrl")
    private String pdfUrl;

    @JsonProperty("status")
    private InvoiceStatus status;

    @JsonProperty("year")
    private double year;

    @JsonCreator
    public Invoice(
            @JsonProperty("amountDue") double amountDue,
            @JsonProperty("dueDate") OffsetDateTime dueDate,
            @JsonProperty("id") String id,
            @JsonProperty("month") double month,
            @JsonProperty("pdfUrl") String pdfUrl,
            @JsonProperty("status") InvoiceStatus status,
            @JsonProperty("year") double year) {
        Utils.checkNotNull(amountDue, "amountDue");
        Utils.checkNotNull(dueDate, "dueDate");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(month, "month");
        Utils.checkNotNull(pdfUrl, "pdfUrl");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(year, "year");
        this.amountDue = amountDue;
        this.dueDate = dueDate;
        this.id = id;
        this.month = month;
        this.pdfUrl = pdfUrl;
        this.status = status;
        this.year = year;
    }

    @JsonIgnore
    public double amountDue() {
        return amountDue;
    }

    @JsonIgnore
    public OffsetDateTime dueDate() {
        return dueDate;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public double month() {
        return month;
    }

    @JsonIgnore
    public String pdfUrl() {
        return pdfUrl;
    }

    @JsonIgnore
    public InvoiceStatus status() {
        return status;
    }

    @JsonIgnore
    public double year() {
        return year;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Invoice withAmountDue(double amountDue) {
        Utils.checkNotNull(amountDue, "amountDue");
        this.amountDue = amountDue;
        return this;
    }

    public Invoice withDueDate(OffsetDateTime dueDate) {
        Utils.checkNotNull(dueDate, "dueDate");
        this.dueDate = dueDate;
        return this;
    }

    public Invoice withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Invoice withMonth(double month) {
        Utils.checkNotNull(month, "month");
        this.month = month;
        return this;
    }

    public Invoice withPdfUrl(String pdfUrl) {
        Utils.checkNotNull(pdfUrl, "pdfUrl");
        this.pdfUrl = pdfUrl;
        return this;
    }

    public Invoice withStatus(InvoiceStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public Invoice withYear(double year) {
        Utils.checkNotNull(year, "year");
        this.year = year;
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
        Invoice other = (Invoice) o;
        return 
            java.util.Objects.deepEquals(this.amountDue, other.amountDue) &&
            java.util.Objects.deepEquals(this.dueDate, other.dueDate) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.month, other.month) &&
            java.util.Objects.deepEquals(this.pdfUrl, other.pdfUrl) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.year, other.year);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            amountDue,
            dueDate,
            id,
            month,
            pdfUrl,
            status,
            year);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Invoice.class,
                "amountDue", amountDue,
                "dueDate", dueDate,
                "id", id,
                "month", month,
                "pdfUrl", pdfUrl,
                "status", status,
                "year", year);
    }
    
    public final static class Builder {
 
        private Double amountDue;
 
        private OffsetDateTime dueDate;
 
        private String id;
 
        private Double month;
 
        private String pdfUrl;
 
        private InvoiceStatus status;
 
        private Double year;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder amountDue(double amountDue) {
            Utils.checkNotNull(amountDue, "amountDue");
            this.amountDue = amountDue;
            return this;
        }

        public Builder dueDate(OffsetDateTime dueDate) {
            Utils.checkNotNull(dueDate, "dueDate");
            this.dueDate = dueDate;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder month(double month) {
            Utils.checkNotNull(month, "month");
            this.month = month;
            return this;
        }

        public Builder pdfUrl(String pdfUrl) {
            Utils.checkNotNull(pdfUrl, "pdfUrl");
            this.pdfUrl = pdfUrl;
            return this;
        }

        public Builder status(InvoiceStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder year(double year) {
            Utils.checkNotNull(year, "year");
            this.year = year;
            return this;
        }
        
        public Invoice build() {
            return new Invoice(
                amountDue,
                dueDate,
                id,
                month,
                pdfUrl,
                status,
                year);
        }
    }
}
