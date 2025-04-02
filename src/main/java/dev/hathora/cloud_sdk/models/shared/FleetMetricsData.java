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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class FleetMetricsData {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provisionedBareMetal")
    private Optional<? extends List<MetricValue>> provisionedBareMetal;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provisionedCloud")
    private Optional<? extends List<MetricValue>> provisionedCloud;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provisionedTotal")
    private Optional<? extends List<MetricValue>> provisionedTotal;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("utilized")
    private Optional<? extends List<MetricValue>> utilized;

    @JsonCreator
    public FleetMetricsData(
            @JsonProperty("provisionedBareMetal") Optional<? extends List<MetricValue>> provisionedBareMetal,
            @JsonProperty("provisionedCloud") Optional<? extends List<MetricValue>> provisionedCloud,
            @JsonProperty("provisionedTotal") Optional<? extends List<MetricValue>> provisionedTotal,
            @JsonProperty("utilized") Optional<? extends List<MetricValue>> utilized) {
        Utils.checkNotNull(provisionedBareMetal, "provisionedBareMetal");
        Utils.checkNotNull(provisionedCloud, "provisionedCloud");
        Utils.checkNotNull(provisionedTotal, "provisionedTotal");
        Utils.checkNotNull(utilized, "utilized");
        this.provisionedBareMetal = provisionedBareMetal;
        this.provisionedCloud = provisionedCloud;
        this.provisionedTotal = provisionedTotal;
        this.utilized = utilized;
    }
    
    public FleetMetricsData() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<MetricValue>> provisionedBareMetal() {
        return (Optional<List<MetricValue>>) provisionedBareMetal;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<MetricValue>> provisionedCloud() {
        return (Optional<List<MetricValue>>) provisionedCloud;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<MetricValue>> provisionedTotal() {
        return (Optional<List<MetricValue>>) provisionedTotal;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<MetricValue>> utilized() {
        return (Optional<List<MetricValue>>) utilized;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public FleetMetricsData withProvisionedBareMetal(List<MetricValue> provisionedBareMetal) {
        Utils.checkNotNull(provisionedBareMetal, "provisionedBareMetal");
        this.provisionedBareMetal = Optional.ofNullable(provisionedBareMetal);
        return this;
    }

    public FleetMetricsData withProvisionedBareMetal(Optional<? extends List<MetricValue>> provisionedBareMetal) {
        Utils.checkNotNull(provisionedBareMetal, "provisionedBareMetal");
        this.provisionedBareMetal = provisionedBareMetal;
        return this;
    }

    public FleetMetricsData withProvisionedCloud(List<MetricValue> provisionedCloud) {
        Utils.checkNotNull(provisionedCloud, "provisionedCloud");
        this.provisionedCloud = Optional.ofNullable(provisionedCloud);
        return this;
    }

    public FleetMetricsData withProvisionedCloud(Optional<? extends List<MetricValue>> provisionedCloud) {
        Utils.checkNotNull(provisionedCloud, "provisionedCloud");
        this.provisionedCloud = provisionedCloud;
        return this;
    }

    public FleetMetricsData withProvisionedTotal(List<MetricValue> provisionedTotal) {
        Utils.checkNotNull(provisionedTotal, "provisionedTotal");
        this.provisionedTotal = Optional.ofNullable(provisionedTotal);
        return this;
    }

    public FleetMetricsData withProvisionedTotal(Optional<? extends List<MetricValue>> provisionedTotal) {
        Utils.checkNotNull(provisionedTotal, "provisionedTotal");
        this.provisionedTotal = provisionedTotal;
        return this;
    }

    public FleetMetricsData withUtilized(List<MetricValue> utilized) {
        Utils.checkNotNull(utilized, "utilized");
        this.utilized = Optional.ofNullable(utilized);
        return this;
    }

    public FleetMetricsData withUtilized(Optional<? extends List<MetricValue>> utilized) {
        Utils.checkNotNull(utilized, "utilized");
        this.utilized = utilized;
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
        FleetMetricsData other = (FleetMetricsData) o;
        return 
            Objects.deepEquals(this.provisionedBareMetal, other.provisionedBareMetal) &&
            Objects.deepEquals(this.provisionedCloud, other.provisionedCloud) &&
            Objects.deepEquals(this.provisionedTotal, other.provisionedTotal) &&
            Objects.deepEquals(this.utilized, other.utilized);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            provisionedBareMetal,
            provisionedCloud,
            provisionedTotal,
            utilized);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FleetMetricsData.class,
                "provisionedBareMetal", provisionedBareMetal,
                "provisionedCloud", provisionedCloud,
                "provisionedTotal", provisionedTotal,
                "utilized", utilized);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<MetricValue>> provisionedBareMetal = Optional.empty();
 
        private Optional<? extends List<MetricValue>> provisionedCloud = Optional.empty();
 
        private Optional<? extends List<MetricValue>> provisionedTotal = Optional.empty();
 
        private Optional<? extends List<MetricValue>> utilized = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder provisionedBareMetal(List<MetricValue> provisionedBareMetal) {
            Utils.checkNotNull(provisionedBareMetal, "provisionedBareMetal");
            this.provisionedBareMetal = Optional.ofNullable(provisionedBareMetal);
            return this;
        }

        public Builder provisionedBareMetal(Optional<? extends List<MetricValue>> provisionedBareMetal) {
            Utils.checkNotNull(provisionedBareMetal, "provisionedBareMetal");
            this.provisionedBareMetal = provisionedBareMetal;
            return this;
        }

        public Builder provisionedCloud(List<MetricValue> provisionedCloud) {
            Utils.checkNotNull(provisionedCloud, "provisionedCloud");
            this.provisionedCloud = Optional.ofNullable(provisionedCloud);
            return this;
        }

        public Builder provisionedCloud(Optional<? extends List<MetricValue>> provisionedCloud) {
            Utils.checkNotNull(provisionedCloud, "provisionedCloud");
            this.provisionedCloud = provisionedCloud;
            return this;
        }

        public Builder provisionedTotal(List<MetricValue> provisionedTotal) {
            Utils.checkNotNull(provisionedTotal, "provisionedTotal");
            this.provisionedTotal = Optional.ofNullable(provisionedTotal);
            return this;
        }

        public Builder provisionedTotal(Optional<? extends List<MetricValue>> provisionedTotal) {
            Utils.checkNotNull(provisionedTotal, "provisionedTotal");
            this.provisionedTotal = provisionedTotal;
            return this;
        }

        public Builder utilized(List<MetricValue> utilized) {
            Utils.checkNotNull(utilized, "utilized");
            this.utilized = Optional.ofNullable(utilized);
            return this;
        }

        public Builder utilized(Optional<? extends List<MetricValue>> utilized) {
            Utils.checkNotNull(utilized, "utilized");
            this.utilized = utilized;
            return this;
        }
        
        public FleetMetricsData build() {
            return new FleetMetricsData(
                provisionedBareMetal,
                provisionedCloud,
                provisionedTotal,
                utilized);
        }
    }
}
