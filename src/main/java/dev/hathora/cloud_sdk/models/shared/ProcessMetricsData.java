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

public class ProcessMetricsData {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("activeConnections")
    private Optional<? extends List<MetricValue>> activeConnections;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cpu")
    private Optional<? extends List<MetricValue>> cpu;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("memory")
    private Optional<? extends List<MetricValue>> memory;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rateEgress")
    private Optional<? extends List<MetricValue>> rateEgress;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("totalEgress")
    private Optional<? extends List<MetricValue>> totalEgress;

    @JsonCreator
    public ProcessMetricsData(
            @JsonProperty("activeConnections") Optional<? extends List<MetricValue>> activeConnections,
            @JsonProperty("cpu") Optional<? extends List<MetricValue>> cpu,
            @JsonProperty("memory") Optional<? extends List<MetricValue>> memory,
            @JsonProperty("rateEgress") Optional<? extends List<MetricValue>> rateEgress,
            @JsonProperty("totalEgress") Optional<? extends List<MetricValue>> totalEgress) {
        Utils.checkNotNull(activeConnections, "activeConnections");
        Utils.checkNotNull(cpu, "cpu");
        Utils.checkNotNull(memory, "memory");
        Utils.checkNotNull(rateEgress, "rateEgress");
        Utils.checkNotNull(totalEgress, "totalEgress");
        this.activeConnections = activeConnections;
        this.cpu = cpu;
        this.memory = memory;
        this.rateEgress = rateEgress;
        this.totalEgress = totalEgress;
    }
    
    public ProcessMetricsData() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<MetricValue>> activeConnections() {
        return (Optional<List<MetricValue>>) activeConnections;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<MetricValue>> cpu() {
        return (Optional<List<MetricValue>>) cpu;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<MetricValue>> memory() {
        return (Optional<List<MetricValue>>) memory;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<MetricValue>> rateEgress() {
        return (Optional<List<MetricValue>>) rateEgress;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<MetricValue>> totalEgress() {
        return (Optional<List<MetricValue>>) totalEgress;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public ProcessMetricsData withActiveConnections(List<MetricValue> activeConnections) {
        Utils.checkNotNull(activeConnections, "activeConnections");
        this.activeConnections = Optional.ofNullable(activeConnections);
        return this;
    }

    public ProcessMetricsData withActiveConnections(Optional<? extends List<MetricValue>> activeConnections) {
        Utils.checkNotNull(activeConnections, "activeConnections");
        this.activeConnections = activeConnections;
        return this;
    }

    public ProcessMetricsData withCpu(List<MetricValue> cpu) {
        Utils.checkNotNull(cpu, "cpu");
        this.cpu = Optional.ofNullable(cpu);
        return this;
    }

    public ProcessMetricsData withCpu(Optional<? extends List<MetricValue>> cpu) {
        Utils.checkNotNull(cpu, "cpu");
        this.cpu = cpu;
        return this;
    }

    public ProcessMetricsData withMemory(List<MetricValue> memory) {
        Utils.checkNotNull(memory, "memory");
        this.memory = Optional.ofNullable(memory);
        return this;
    }

    public ProcessMetricsData withMemory(Optional<? extends List<MetricValue>> memory) {
        Utils.checkNotNull(memory, "memory");
        this.memory = memory;
        return this;
    }

    public ProcessMetricsData withRateEgress(List<MetricValue> rateEgress) {
        Utils.checkNotNull(rateEgress, "rateEgress");
        this.rateEgress = Optional.ofNullable(rateEgress);
        return this;
    }

    public ProcessMetricsData withRateEgress(Optional<? extends List<MetricValue>> rateEgress) {
        Utils.checkNotNull(rateEgress, "rateEgress");
        this.rateEgress = rateEgress;
        return this;
    }

    public ProcessMetricsData withTotalEgress(List<MetricValue> totalEgress) {
        Utils.checkNotNull(totalEgress, "totalEgress");
        this.totalEgress = Optional.ofNullable(totalEgress);
        return this;
    }

    public ProcessMetricsData withTotalEgress(Optional<? extends List<MetricValue>> totalEgress) {
        Utils.checkNotNull(totalEgress, "totalEgress");
        this.totalEgress = totalEgress;
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
        ProcessMetricsData other = (ProcessMetricsData) o;
        return 
            Objects.deepEquals(this.activeConnections, other.activeConnections) &&
            Objects.deepEquals(this.cpu, other.cpu) &&
            Objects.deepEquals(this.memory, other.memory) &&
            Objects.deepEquals(this.rateEgress, other.rateEgress) &&
            Objects.deepEquals(this.totalEgress, other.totalEgress);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            activeConnections,
            cpu,
            memory,
            rateEgress,
            totalEgress);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ProcessMetricsData.class,
                "activeConnections", activeConnections,
                "cpu", cpu,
                "memory", memory,
                "rateEgress", rateEgress,
                "totalEgress", totalEgress);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<MetricValue>> activeConnections = Optional.empty();
 
        private Optional<? extends List<MetricValue>> cpu = Optional.empty();
 
        private Optional<? extends List<MetricValue>> memory = Optional.empty();
 
        private Optional<? extends List<MetricValue>> rateEgress = Optional.empty();
 
        private Optional<? extends List<MetricValue>> totalEgress = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder activeConnections(List<MetricValue> activeConnections) {
            Utils.checkNotNull(activeConnections, "activeConnections");
            this.activeConnections = Optional.ofNullable(activeConnections);
            return this;
        }

        public Builder activeConnections(Optional<? extends List<MetricValue>> activeConnections) {
            Utils.checkNotNull(activeConnections, "activeConnections");
            this.activeConnections = activeConnections;
            return this;
        }

        public Builder cpu(List<MetricValue> cpu) {
            Utils.checkNotNull(cpu, "cpu");
            this.cpu = Optional.ofNullable(cpu);
            return this;
        }

        public Builder cpu(Optional<? extends List<MetricValue>> cpu) {
            Utils.checkNotNull(cpu, "cpu");
            this.cpu = cpu;
            return this;
        }

        public Builder memory(List<MetricValue> memory) {
            Utils.checkNotNull(memory, "memory");
            this.memory = Optional.ofNullable(memory);
            return this;
        }

        public Builder memory(Optional<? extends List<MetricValue>> memory) {
            Utils.checkNotNull(memory, "memory");
            this.memory = memory;
            return this;
        }

        public Builder rateEgress(List<MetricValue> rateEgress) {
            Utils.checkNotNull(rateEgress, "rateEgress");
            this.rateEgress = Optional.ofNullable(rateEgress);
            return this;
        }

        public Builder rateEgress(Optional<? extends List<MetricValue>> rateEgress) {
            Utils.checkNotNull(rateEgress, "rateEgress");
            this.rateEgress = rateEgress;
            return this;
        }

        public Builder totalEgress(List<MetricValue> totalEgress) {
            Utils.checkNotNull(totalEgress, "totalEgress");
            this.totalEgress = Optional.ofNullable(totalEgress);
            return this;
        }

        public Builder totalEgress(Optional<? extends List<MetricValue>> totalEgress) {
            Utils.checkNotNull(totalEgress, "totalEgress");
            this.totalEgress = totalEgress;
            return this;
        }
        
        public ProcessMetricsData build() {
            return new ProcessMetricsData(
                activeConnections,
                cpu,
                memory,
                rateEgress,
                totalEgress);
        }
    }
}
