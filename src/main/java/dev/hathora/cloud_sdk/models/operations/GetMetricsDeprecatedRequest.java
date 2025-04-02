/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_sdk.models.shared.DeprecatedProcessMetricName;
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

public class GetMetricsDeprecatedRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    /**
     * Unix timestamp. Default is current time.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=end")
    private Optional<Double> end;

    /**
     * Available metrics to query over time.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=metrics")
    private Optional<? extends List<DeprecatedProcessMetricName>> metrics;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=processId")
    private String processId;

    /**
     * Unix timestamp. Default is -1 hour from `end`.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=start")
    private Optional<Double> start;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=step")
    private Optional<Integer> step;

    @JsonCreator
    public GetMetricsDeprecatedRequest(
            Optional<String> appId,
            Optional<Double> end,
            Optional<? extends List<DeprecatedProcessMetricName>> metrics,
            String processId,
            Optional<Double> start,
            Optional<Integer> step) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(end, "end");
        Utils.checkNotNull(metrics, "metrics");
        Utils.checkNotNull(processId, "processId");
        Utils.checkNotNull(start, "start");
        Utils.checkNotNull(step, "step");
        this.appId = appId;
        this.end = end;
        this.metrics = metrics;
        this.processId = processId;
        this.start = start;
        this.step = step;
    }
    
    public GetMetricsDeprecatedRequest(
            String processId) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), processId, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    /**
     * Unix timestamp. Default is current time.
     */
    @JsonIgnore
    public Optional<Double> end() {
        return end;
    }

    /**
     * Available metrics to query over time.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<DeprecatedProcessMetricName>> metrics() {
        return (Optional<List<DeprecatedProcessMetricName>>) metrics;
    }

    @JsonIgnore
    public String processId() {
        return processId;
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

    public GetMetricsDeprecatedRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public GetMetricsDeprecatedRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * Unix timestamp. Default is current time.
     */
    public GetMetricsDeprecatedRequest withEnd(double end) {
        Utils.checkNotNull(end, "end");
        this.end = Optional.ofNullable(end);
        return this;
    }

    /**
     * Unix timestamp. Default is current time.
     */
    public GetMetricsDeprecatedRequest withEnd(Optional<Double> end) {
        Utils.checkNotNull(end, "end");
        this.end = end;
        return this;
    }

    /**
     * Available metrics to query over time.
     */
    public GetMetricsDeprecatedRequest withMetrics(List<DeprecatedProcessMetricName> metrics) {
        Utils.checkNotNull(metrics, "metrics");
        this.metrics = Optional.ofNullable(metrics);
        return this;
    }

    /**
     * Available metrics to query over time.
     */
    public GetMetricsDeprecatedRequest withMetrics(Optional<? extends List<DeprecatedProcessMetricName>> metrics) {
        Utils.checkNotNull(metrics, "metrics");
        this.metrics = metrics;
        return this;
    }

    public GetMetricsDeprecatedRequest withProcessId(String processId) {
        Utils.checkNotNull(processId, "processId");
        this.processId = processId;
        return this;
    }

    /**
     * Unix timestamp. Default is -1 hour from `end`.
     */
    public GetMetricsDeprecatedRequest withStart(double start) {
        Utils.checkNotNull(start, "start");
        this.start = Optional.ofNullable(start);
        return this;
    }

    /**
     * Unix timestamp. Default is -1 hour from `end`.
     */
    public GetMetricsDeprecatedRequest withStart(Optional<Double> start) {
        Utils.checkNotNull(start, "start");
        this.start = start;
        return this;
    }

    public GetMetricsDeprecatedRequest withStep(int step) {
        Utils.checkNotNull(step, "step");
        this.step = Optional.ofNullable(step);
        return this;
    }

    public GetMetricsDeprecatedRequest withStep(Optional<Integer> step) {
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
        GetMetricsDeprecatedRequest other = (GetMetricsDeprecatedRequest) o;
        return 
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.end, other.end) &&
            Objects.deepEquals(this.metrics, other.metrics) &&
            Objects.deepEquals(this.processId, other.processId) &&
            Objects.deepEquals(this.start, other.start) &&
            Objects.deepEquals(this.step, other.step);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            appId,
            end,
            metrics,
            processId,
            start,
            step);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetMetricsDeprecatedRequest.class,
                "appId", appId,
                "end", end,
                "metrics", metrics,
                "processId", processId,
                "start", start,
                "step", step);
    }
    
    public final static class Builder {
 
        private Optional<String> appId = Optional.empty();
 
        private Optional<Double> end = Optional.empty();
 
        private Optional<? extends List<DeprecatedProcessMetricName>> metrics = Optional.empty();
 
        private String processId;
 
        private Optional<Double> start = Optional.empty();
 
        private Optional<Integer> step;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder appId(String appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = Optional.ofNullable(appId);
            return this;
        }

        public Builder appId(Optional<String> appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = appId;
            return this;
        }

        /**
         * Unix timestamp. Default is current time.
         */
        public Builder end(double end) {
            Utils.checkNotNull(end, "end");
            this.end = Optional.ofNullable(end);
            return this;
        }

        /**
         * Unix timestamp. Default is current time.
         */
        public Builder end(Optional<Double> end) {
            Utils.checkNotNull(end, "end");
            this.end = end;
            return this;
        }

        /**
         * Available metrics to query over time.
         */
        public Builder metrics(List<DeprecatedProcessMetricName> metrics) {
            Utils.checkNotNull(metrics, "metrics");
            this.metrics = Optional.ofNullable(metrics);
            return this;
        }

        /**
         * Available metrics to query over time.
         */
        public Builder metrics(Optional<? extends List<DeprecatedProcessMetricName>> metrics) {
            Utils.checkNotNull(metrics, "metrics");
            this.metrics = metrics;
            return this;
        }

        public Builder processId(String processId) {
            Utils.checkNotNull(processId, "processId");
            this.processId = processId;
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
        
        public GetMetricsDeprecatedRequest build() {
            if (step == null) {
                step = _SINGLETON_VALUE_Step.value();
            }
            return new GetMetricsDeprecatedRequest(
                appId,
                end,
                metrics,
                processId,
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
