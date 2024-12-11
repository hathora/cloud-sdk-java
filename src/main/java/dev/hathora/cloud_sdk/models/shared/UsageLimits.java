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
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class UsageLimits {

    @JsonProperty("concurrentProcessVcpus7DayMax")
    private double concurrentProcessVcpus7DayMax;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("concurrentProcessVcpusLimit")
    private Optional<Double> concurrentProcessVcpusLimit;

    @JsonProperty("monthlyProcessVcpuHoursConsumed")
    private double monthlyProcessVcpuHoursConsumed;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("monthlyProcessVcpuHoursLimit")
    private Optional<Double> monthlyProcessVcpuHoursLimit;

    @JsonCreator
    public UsageLimits(
            @JsonProperty("concurrentProcessVcpus7DayMax") double concurrentProcessVcpus7DayMax,
            @JsonProperty("concurrentProcessVcpusLimit") Optional<Double> concurrentProcessVcpusLimit,
            @JsonProperty("monthlyProcessVcpuHoursConsumed") double monthlyProcessVcpuHoursConsumed,
            @JsonProperty("monthlyProcessVcpuHoursLimit") Optional<Double> monthlyProcessVcpuHoursLimit) {
        Utils.checkNotNull(concurrentProcessVcpus7DayMax, "concurrentProcessVcpus7DayMax");
        Utils.checkNotNull(concurrentProcessVcpusLimit, "concurrentProcessVcpusLimit");
        Utils.checkNotNull(monthlyProcessVcpuHoursConsumed, "monthlyProcessVcpuHoursConsumed");
        Utils.checkNotNull(monthlyProcessVcpuHoursLimit, "monthlyProcessVcpuHoursLimit");
        this.concurrentProcessVcpus7DayMax = concurrentProcessVcpus7DayMax;
        this.concurrentProcessVcpusLimit = concurrentProcessVcpusLimit;
        this.monthlyProcessVcpuHoursConsumed = monthlyProcessVcpuHoursConsumed;
        this.monthlyProcessVcpuHoursLimit = monthlyProcessVcpuHoursLimit;
    }
    
    public UsageLimits(
            double concurrentProcessVcpus7DayMax,
            double monthlyProcessVcpuHoursConsumed) {
        this(concurrentProcessVcpus7DayMax, Optional.empty(), monthlyProcessVcpuHoursConsumed, Optional.empty());
    }

    @JsonIgnore
    public double concurrentProcessVcpus7DayMax() {
        return concurrentProcessVcpus7DayMax;
    }

    @JsonIgnore
    public Optional<Double> concurrentProcessVcpusLimit() {
        return concurrentProcessVcpusLimit;
    }

    @JsonIgnore
    public double monthlyProcessVcpuHoursConsumed() {
        return monthlyProcessVcpuHoursConsumed;
    }

    @JsonIgnore
    public Optional<Double> monthlyProcessVcpuHoursLimit() {
        return monthlyProcessVcpuHoursLimit;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UsageLimits withConcurrentProcessVcpus7DayMax(double concurrentProcessVcpus7DayMax) {
        Utils.checkNotNull(concurrentProcessVcpus7DayMax, "concurrentProcessVcpus7DayMax");
        this.concurrentProcessVcpus7DayMax = concurrentProcessVcpus7DayMax;
        return this;
    }

    public UsageLimits withConcurrentProcessVcpusLimit(double concurrentProcessVcpusLimit) {
        Utils.checkNotNull(concurrentProcessVcpusLimit, "concurrentProcessVcpusLimit");
        this.concurrentProcessVcpusLimit = Optional.ofNullable(concurrentProcessVcpusLimit);
        return this;
    }

    public UsageLimits withConcurrentProcessVcpusLimit(Optional<Double> concurrentProcessVcpusLimit) {
        Utils.checkNotNull(concurrentProcessVcpusLimit, "concurrentProcessVcpusLimit");
        this.concurrentProcessVcpusLimit = concurrentProcessVcpusLimit;
        return this;
    }

    public UsageLimits withMonthlyProcessVcpuHoursConsumed(double monthlyProcessVcpuHoursConsumed) {
        Utils.checkNotNull(monthlyProcessVcpuHoursConsumed, "monthlyProcessVcpuHoursConsumed");
        this.monthlyProcessVcpuHoursConsumed = monthlyProcessVcpuHoursConsumed;
        return this;
    }

    public UsageLimits withMonthlyProcessVcpuHoursLimit(double monthlyProcessVcpuHoursLimit) {
        Utils.checkNotNull(monthlyProcessVcpuHoursLimit, "monthlyProcessVcpuHoursLimit");
        this.monthlyProcessVcpuHoursLimit = Optional.ofNullable(monthlyProcessVcpuHoursLimit);
        return this;
    }

    public UsageLimits withMonthlyProcessVcpuHoursLimit(Optional<Double> monthlyProcessVcpuHoursLimit) {
        Utils.checkNotNull(monthlyProcessVcpuHoursLimit, "monthlyProcessVcpuHoursLimit");
        this.monthlyProcessVcpuHoursLimit = monthlyProcessVcpuHoursLimit;
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
        UsageLimits other = (UsageLimits) o;
        return 
            Objects.deepEquals(this.concurrentProcessVcpus7DayMax, other.concurrentProcessVcpus7DayMax) &&
            Objects.deepEquals(this.concurrentProcessVcpusLimit, other.concurrentProcessVcpusLimit) &&
            Objects.deepEquals(this.monthlyProcessVcpuHoursConsumed, other.monthlyProcessVcpuHoursConsumed) &&
            Objects.deepEquals(this.monthlyProcessVcpuHoursLimit, other.monthlyProcessVcpuHoursLimit);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            concurrentProcessVcpus7DayMax,
            concurrentProcessVcpusLimit,
            monthlyProcessVcpuHoursConsumed,
            monthlyProcessVcpuHoursLimit);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UsageLimits.class,
                "concurrentProcessVcpus7DayMax", concurrentProcessVcpus7DayMax,
                "concurrentProcessVcpusLimit", concurrentProcessVcpusLimit,
                "monthlyProcessVcpuHoursConsumed", monthlyProcessVcpuHoursConsumed,
                "monthlyProcessVcpuHoursLimit", monthlyProcessVcpuHoursLimit);
    }
    
    public final static class Builder {
 
        private Double concurrentProcessVcpus7DayMax;
 
        private Optional<Double> concurrentProcessVcpusLimit = Optional.empty();
 
        private Double monthlyProcessVcpuHoursConsumed;
 
        private Optional<Double> monthlyProcessVcpuHoursLimit = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder concurrentProcessVcpus7DayMax(double concurrentProcessVcpus7DayMax) {
            Utils.checkNotNull(concurrentProcessVcpus7DayMax, "concurrentProcessVcpus7DayMax");
            this.concurrentProcessVcpus7DayMax = concurrentProcessVcpus7DayMax;
            return this;
        }

        public Builder concurrentProcessVcpusLimit(double concurrentProcessVcpusLimit) {
            Utils.checkNotNull(concurrentProcessVcpusLimit, "concurrentProcessVcpusLimit");
            this.concurrentProcessVcpusLimit = Optional.ofNullable(concurrentProcessVcpusLimit);
            return this;
        }

        public Builder concurrentProcessVcpusLimit(Optional<Double> concurrentProcessVcpusLimit) {
            Utils.checkNotNull(concurrentProcessVcpusLimit, "concurrentProcessVcpusLimit");
            this.concurrentProcessVcpusLimit = concurrentProcessVcpusLimit;
            return this;
        }

        public Builder monthlyProcessVcpuHoursConsumed(double monthlyProcessVcpuHoursConsumed) {
            Utils.checkNotNull(monthlyProcessVcpuHoursConsumed, "monthlyProcessVcpuHoursConsumed");
            this.monthlyProcessVcpuHoursConsumed = monthlyProcessVcpuHoursConsumed;
            return this;
        }

        public Builder monthlyProcessVcpuHoursLimit(double monthlyProcessVcpuHoursLimit) {
            Utils.checkNotNull(monthlyProcessVcpuHoursLimit, "monthlyProcessVcpuHoursLimit");
            this.monthlyProcessVcpuHoursLimit = Optional.ofNullable(monthlyProcessVcpuHoursLimit);
            return this;
        }

        public Builder monthlyProcessVcpuHoursLimit(Optional<Double> monthlyProcessVcpuHoursLimit) {
            Utils.checkNotNull(monthlyProcessVcpuHoursLimit, "monthlyProcessVcpuHoursLimit");
            this.monthlyProcessVcpuHoursLimit = monthlyProcessVcpuHoursLimit;
            return this;
        }
        
        public UsageLimits build() {
            return new UsageLimits(
                concurrentProcessVcpus7DayMax,
                concurrentProcessVcpusLimit,
                monthlyProcessVcpuHoursConsumed,
                monthlyProcessVcpuHoursLimit);
        }
    }
}
