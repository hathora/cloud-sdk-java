/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_sdk.models.shared.FleetMetricName;
import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.utils.LazySingletonValue;
import dev.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class GetFleetMetricsRequest {

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=end")
    private Optional<Double> end;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=fleetId")
    private String fleetId;

    /**
     * Available metrics to query over time.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=metrics")
    private Optional<? extends List<FleetMetricName>> metrics;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=orgId")
    private Optional<String> orgId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=region")
    private Region region;

    /**
     * Unix timestamp. Default is -1 hour from `end`.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=start")
    private Optional<Double> start;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=step")
    private Optional<Integer> step;

    @JsonCreator
    public GetFleetMetricsRequest(
            Optional<Double> end,
            String fleetId,
            Optional<? extends List<FleetMetricName>> metrics,
            Optional<String> orgId,
            Region region,
            Optional<Double> start,
            Optional<Integer> step) {
        Utils.checkNotNull(end, "end");
        Utils.checkNotNull(fleetId, "fleetId");
        Utils.checkNotNull(metrics, "metrics");
        Utils.checkNotNull(orgId, "orgId");
        Utils.checkNotNull(region, "region");
        Utils.checkNotNull(start, "start");
        Utils.checkNotNull(step, "step");
        this.end = end;
        this.fleetId = fleetId;
        this.metrics = metrics;
        this.orgId = orgId;
        this.region = region;
        this.start = start;
        this.step = step;
    }
    
    public GetFleetMetricsRequest(
            String fleetId,
            Region region) {
        this(Optional.empty(), fleetId, Optional.empty(), Optional.empty(), region, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Double> end() {
        return end;
    }

    @JsonIgnore
    public String fleetId() {
        return fleetId;
    }

    /**
     * Available metrics to query over time.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<FleetMetricName>> metrics() {
        return (Optional<List<FleetMetricName>>) metrics;
    }

    @JsonIgnore
    public Optional<String> orgId() {
        return orgId;
    }

    @JsonIgnore
    public Region region() {
        return region;
    }

    /**
     * Unix timestamp. Default is -1 hour from `end`.
     */
    @JsonIgnore
    public Optional<Double> start() {
        return start;
    }

    @JsonIgnore
    public Optional<Integer> step() {
        return step;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetFleetMetricsRequest withEnd(double end) {
        Utils.checkNotNull(end, "end");
        this.end = Optional.ofNullable(end);
        return this;
    }

    public GetFleetMetricsRequest withEnd(Optional<Double> end) {
        Utils.checkNotNull(end, "end");
        this.end = end;
        return this;
    }

    public GetFleetMetricsRequest withFleetId(String fleetId) {
        Utils.checkNotNull(fleetId, "fleetId");
        this.fleetId = fleetId;
        return this;
    }

    /**
     * Available metrics to query over time.
     */
    public GetFleetMetricsRequest withMetrics(List<FleetMetricName> metrics) {
        Utils.checkNotNull(metrics, "metrics");
        this.metrics = Optional.ofNullable(metrics);
        return this;
    }

    /**
     * Available metrics to query over time.
     */
    public GetFleetMetricsRequest withMetrics(Optional<? extends List<FleetMetricName>> metrics) {
        Utils.checkNotNull(metrics, "metrics");
        this.metrics = metrics;
        return this;
    }

    public GetFleetMetricsRequest withOrgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = Optional.ofNullable(orgId);
        return this;
    }

    public GetFleetMetricsRequest withOrgId(Optional<String> orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    public GetFleetMetricsRequest withRegion(Region region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    /**
     * Unix timestamp. Default is -1 hour from `end`.
     */
    public GetFleetMetricsRequest withStart(double start) {
        Utils.checkNotNull(start, "start");
        this.start = Optional.ofNullable(start);
        return this;
    }

    /**
     * Unix timestamp. Default is -1 hour from `end`.
     */
    public GetFleetMetricsRequest withStart(Optional<Double> start) {
        Utils.checkNotNull(start, "start");
        this.start = start;
        return this;
    }

    public GetFleetMetricsRequest withStep(int step) {
        Utils.checkNotNull(step, "step");
        this.step = Optional.ofNullable(step);
        return this;
    }

    public GetFleetMetricsRequest withStep(Optional<Integer> step) {
        Utils.checkNotNull(step, "step");
        this.step = step;
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
        GetFleetMetricsRequest other = (GetFleetMetricsRequest) o;
        return 
            Objects.deepEquals(this.end, other.end) &&
            Objects.deepEquals(this.fleetId, other.fleetId) &&
            Objects.deepEquals(this.metrics, other.metrics) &&
            Objects.deepEquals(this.orgId, other.orgId) &&
            Objects.deepEquals(this.region, other.region) &&
            Objects.deepEquals(this.start, other.start) &&
            Objects.deepEquals(this.step, other.step);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            end,
            fleetId,
            metrics,
            orgId,
            region,
            start,
            step);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetFleetMetricsRequest.class,
                "end", end,
                "fleetId", fleetId,
                "metrics", metrics,
                "orgId", orgId,
                "region", region,
                "start", start,
                "step", step);
    }
    
    public final static class Builder {
 
        private Optional<Double> end = Optional.empty();
 
        private String fleetId;
 
        private Optional<? extends List<FleetMetricName>> metrics = Optional.empty();
 
        private Optional<String> orgId = Optional.empty();
 
        private Region region;
 
        private Optional<Double> start = Optional.empty();
 
        private Optional<Integer> step;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder end(double end) {
            Utils.checkNotNull(end, "end");
            this.end = Optional.ofNullable(end);
            return this;
        }

        public Builder end(Optional<Double> end) {
            Utils.checkNotNull(end, "end");
            this.end = end;
            return this;
        }

        public Builder fleetId(String fleetId) {
            Utils.checkNotNull(fleetId, "fleetId");
            this.fleetId = fleetId;
            return this;
        }

        /**
         * Available metrics to query over time.
         */
        public Builder metrics(List<FleetMetricName> metrics) {
            Utils.checkNotNull(metrics, "metrics");
            this.metrics = Optional.ofNullable(metrics);
            return this;
        }

        /**
         * Available metrics to query over time.
         */
        public Builder metrics(Optional<? extends List<FleetMetricName>> metrics) {
            Utils.checkNotNull(metrics, "metrics");
            this.metrics = metrics;
            return this;
        }

        public Builder orgId(String orgId) {
            Utils.checkNotNull(orgId, "orgId");
            this.orgId = Optional.ofNullable(orgId);
            return this;
        }

        public Builder orgId(Optional<String> orgId) {
            Utils.checkNotNull(orgId, "orgId");
            this.orgId = orgId;
            return this;
        }

        public Builder region(Region region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }

        /**
         * Unix timestamp. Default is -1 hour from `end`.
         */
        public Builder start(double start) {
            Utils.checkNotNull(start, "start");
            this.start = Optional.ofNullable(start);
            return this;
        }

        /**
         * Unix timestamp. Default is -1 hour from `end`.
         */
        public Builder start(Optional<Double> start) {
            Utils.checkNotNull(start, "start");
            this.start = start;
            return this;
        }

        public Builder step(int step) {
            Utils.checkNotNull(step, "step");
            this.step = Optional.ofNullable(step);
            return this;
        }

        public Builder step(Optional<Integer> step) {
            Utils.checkNotNull(step, "step");
            this.step = step;
            return this;
        }
        
        public GetFleetMetricsRequest build() {
            if (step == null) {
                step = _SINGLETON_VALUE_Step.value();
            }            return new GetFleetMetricsRequest(
                end,
                fleetId,
                metrics,
                orgId,
                region,
                start,
                step);
        }

        private static final LazySingletonValue<Optional<Integer>> _SINGLETON_VALUE_Step =
                new LazySingletonValue<>(
                        "step",
                        "60",
                        new TypeReference<Optional<Integer>>() {});
    }
}

