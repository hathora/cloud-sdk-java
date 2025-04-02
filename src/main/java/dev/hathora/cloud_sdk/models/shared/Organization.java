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
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Organization {

    /**
     * The maximum number of concurrent processes that can be run by the organization
     * If undefined, the organization has no limit.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("concurrentProcessVcpusLimit")
    private Optional<Double> concurrentProcessVcpusLimit;

    /**
     * The features enabled for this org and user.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enabledFeatureFlags")
    private Optional<? extends List<String>> enabledFeatureFlags;

    @JsonProperty("isSingleTenant")
    private boolean isSingleTenant;

    /**
     * The maximum memory in MB that can be used by any process in this org.
     */
    @JsonProperty("maxRequestedMemoryMB")
    private double maxRequestedMemoryMB;

    /**
     * The maximum number of monthly process vcpu hours that can be run by the organization
     * If undefined, the organization has no limit.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("monthlyProcessVcpuHoursLimit")
    private Optional<Double> monthlyProcessVcpuHoursLimit;

    /**
     * The name of an organization.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    /**
     * System generated unique identifier for an organization. Not guaranteed to have a specific format.
     */
    @JsonProperty("orgId")
    private String orgId;

    /**
     * The maximum lifespan in hours of a pod.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("podMaxLifespanHrs")
    private Optional<Double> podMaxLifespanHrs;

    /**
     * The scopes the user who loaded this has on this org.
     */
    @JsonProperty("scopes")
    private List<Scope> scopes;

    @JsonProperty("stripeCustomerId")
    private String stripeCustomerId;

    @JsonCreator
    public Organization(
            @JsonProperty("concurrentProcessVcpusLimit") Optional<Double> concurrentProcessVcpusLimit,
            @JsonProperty("enabledFeatureFlags") Optional<? extends List<String>> enabledFeatureFlags,
            @JsonProperty("isSingleTenant") boolean isSingleTenant,
            @JsonProperty("maxRequestedMemoryMB") double maxRequestedMemoryMB,
            @JsonProperty("monthlyProcessVcpuHoursLimit") Optional<Double> monthlyProcessVcpuHoursLimit,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("orgId") String orgId,
            @JsonProperty("podMaxLifespanHrs") Optional<Double> podMaxLifespanHrs,
            @JsonProperty("scopes") List<Scope> scopes,
            @JsonProperty("stripeCustomerId") String stripeCustomerId) {
        Utils.checkNotNull(concurrentProcessVcpusLimit, "concurrentProcessVcpusLimit");
        Utils.checkNotNull(enabledFeatureFlags, "enabledFeatureFlags");
        Utils.checkNotNull(isSingleTenant, "isSingleTenant");
        Utils.checkNotNull(maxRequestedMemoryMB, "maxRequestedMemoryMB");
        Utils.checkNotNull(monthlyProcessVcpuHoursLimit, "monthlyProcessVcpuHoursLimit");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(orgId, "orgId");
        Utils.checkNotNull(podMaxLifespanHrs, "podMaxLifespanHrs");
        Utils.checkNotNull(scopes, "scopes");
        Utils.checkNotNull(stripeCustomerId, "stripeCustomerId");
        this.concurrentProcessVcpusLimit = concurrentProcessVcpusLimit;
        this.enabledFeatureFlags = enabledFeatureFlags;
        this.isSingleTenant = isSingleTenant;
        this.maxRequestedMemoryMB = maxRequestedMemoryMB;
        this.monthlyProcessVcpuHoursLimit = monthlyProcessVcpuHoursLimit;
        this.name = name;
        this.orgId = orgId;
        this.podMaxLifespanHrs = podMaxLifespanHrs;
        this.scopes = scopes;
        this.stripeCustomerId = stripeCustomerId;
    }
    
    public Organization(
            boolean isSingleTenant,
            double maxRequestedMemoryMB,
            String orgId,
            List<Scope> scopes,
            String stripeCustomerId) {
        this(Optional.empty(), Optional.empty(), isSingleTenant, maxRequestedMemoryMB, Optional.empty(), Optional.empty(), orgId, Optional.empty(), scopes, stripeCustomerId);
    }

    /**
     * The maximum number of concurrent processes that can be run by the organization
     * If undefined, the organization has no limit.
     */
    @JsonIgnore
    public Optional<Double> concurrentProcessVcpusLimit() {
        return concurrentProcessVcpusLimit;
    }

    /**
     * The features enabled for this org and user.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> enabledFeatureFlags() {
        return (Optional<List<String>>) enabledFeatureFlags;
    }

    @JsonIgnore
    public boolean isSingleTenant() {
        return isSingleTenant;
    }

    /**
     * The maximum memory in MB that can be used by any process in this org.
     */
    @JsonIgnore
    public double maxRequestedMemoryMB() {
        return maxRequestedMemoryMB;
    }

    /**
     * The maximum number of monthly process vcpu hours that can be run by the organization
     * If undefined, the organization has no limit.
     */
    @JsonIgnore
    public Optional<Double> monthlyProcessVcpuHoursLimit() {
        return monthlyProcessVcpuHoursLimit;
    }

    /**
     * The name of an organization.
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * System generated unique identifier for an organization. Not guaranteed to have a specific format.
     */
    @JsonIgnore
    public String orgId() {
        return orgId;
    }

    /**
     * The maximum lifespan in hours of a pod.
     */
    @JsonIgnore
    public Optional<Double> podMaxLifespanHrs() {
        return podMaxLifespanHrs;
    }

    /**
     * The scopes the user who loaded this has on this org.
     */
    @JsonIgnore
    public List<Scope> scopes() {
        return scopes;
    }

    @JsonIgnore
    public String stripeCustomerId() {
        return stripeCustomerId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The maximum number of concurrent processes that can be run by the organization
     * If undefined, the organization has no limit.
     */
    public Organization withConcurrentProcessVcpusLimit(double concurrentProcessVcpusLimit) {
        Utils.checkNotNull(concurrentProcessVcpusLimit, "concurrentProcessVcpusLimit");
        this.concurrentProcessVcpusLimit = Optional.ofNullable(concurrentProcessVcpusLimit);
        return this;
    }

    /**
     * The maximum number of concurrent processes that can be run by the organization
     * If undefined, the organization has no limit.
     */
    public Organization withConcurrentProcessVcpusLimit(Optional<Double> concurrentProcessVcpusLimit) {
        Utils.checkNotNull(concurrentProcessVcpusLimit, "concurrentProcessVcpusLimit");
        this.concurrentProcessVcpusLimit = concurrentProcessVcpusLimit;
        return this;
    }

    /**
     * The features enabled for this org and user.
     */
    public Organization withEnabledFeatureFlags(List<String> enabledFeatureFlags) {
        Utils.checkNotNull(enabledFeatureFlags, "enabledFeatureFlags");
        this.enabledFeatureFlags = Optional.ofNullable(enabledFeatureFlags);
        return this;
    }

    /**
     * The features enabled for this org and user.
     */
    public Organization withEnabledFeatureFlags(Optional<? extends List<String>> enabledFeatureFlags) {
        Utils.checkNotNull(enabledFeatureFlags, "enabledFeatureFlags");
        this.enabledFeatureFlags = enabledFeatureFlags;
        return this;
    }

    public Organization withIsSingleTenant(boolean isSingleTenant) {
        Utils.checkNotNull(isSingleTenant, "isSingleTenant");
        this.isSingleTenant = isSingleTenant;
        return this;
    }

    /**
     * The maximum memory in MB that can be used by any process in this org.
     */
    public Organization withMaxRequestedMemoryMB(double maxRequestedMemoryMB) {
        Utils.checkNotNull(maxRequestedMemoryMB, "maxRequestedMemoryMB");
        this.maxRequestedMemoryMB = maxRequestedMemoryMB;
        return this;
    }

    /**
     * The maximum number of monthly process vcpu hours that can be run by the organization
     * If undefined, the organization has no limit.
     */
    public Organization withMonthlyProcessVcpuHoursLimit(double monthlyProcessVcpuHoursLimit) {
        Utils.checkNotNull(monthlyProcessVcpuHoursLimit, "monthlyProcessVcpuHoursLimit");
        this.monthlyProcessVcpuHoursLimit = Optional.ofNullable(monthlyProcessVcpuHoursLimit);
        return this;
    }

    /**
     * The maximum number of monthly process vcpu hours that can be run by the organization
     * If undefined, the organization has no limit.
     */
    public Organization withMonthlyProcessVcpuHoursLimit(Optional<Double> monthlyProcessVcpuHoursLimit) {
        Utils.checkNotNull(monthlyProcessVcpuHoursLimit, "monthlyProcessVcpuHoursLimit");
        this.monthlyProcessVcpuHoursLimit = monthlyProcessVcpuHoursLimit;
        return this;
    }

    /**
     * The name of an organization.
     */
    public Organization withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The name of an organization.
     */
    public Organization withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * System generated unique identifier for an organization. Not guaranteed to have a specific format.
     */
    public Organization withOrgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    /**
     * The maximum lifespan in hours of a pod.
     */
    public Organization withPodMaxLifespanHrs(double podMaxLifespanHrs) {
        Utils.checkNotNull(podMaxLifespanHrs, "podMaxLifespanHrs");
        this.podMaxLifespanHrs = Optional.ofNullable(podMaxLifespanHrs);
        return this;
    }

    /**
     * The maximum lifespan in hours of a pod.
     */
    public Organization withPodMaxLifespanHrs(Optional<Double> podMaxLifespanHrs) {
        Utils.checkNotNull(podMaxLifespanHrs, "podMaxLifespanHrs");
        this.podMaxLifespanHrs = podMaxLifespanHrs;
        return this;
    }

    /**
     * The scopes the user who loaded this has on this org.
     */
    public Organization withScopes(List<Scope> scopes) {
        Utils.checkNotNull(scopes, "scopes");
        this.scopes = scopes;
        return this;
    }

    public Organization withStripeCustomerId(String stripeCustomerId) {
        Utils.checkNotNull(stripeCustomerId, "stripeCustomerId");
        this.stripeCustomerId = stripeCustomerId;
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
        Organization other = (Organization) o;
        return 
            Objects.deepEquals(this.concurrentProcessVcpusLimit, other.concurrentProcessVcpusLimit) &&
            Objects.deepEquals(this.enabledFeatureFlags, other.enabledFeatureFlags) &&
            Objects.deepEquals(this.isSingleTenant, other.isSingleTenant) &&
            Objects.deepEquals(this.maxRequestedMemoryMB, other.maxRequestedMemoryMB) &&
            Objects.deepEquals(this.monthlyProcessVcpuHoursLimit, other.monthlyProcessVcpuHoursLimit) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.orgId, other.orgId) &&
            Objects.deepEquals(this.podMaxLifespanHrs, other.podMaxLifespanHrs) &&
            Objects.deepEquals(this.scopes, other.scopes) &&
            Objects.deepEquals(this.stripeCustomerId, other.stripeCustomerId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            concurrentProcessVcpusLimit,
            enabledFeatureFlags,
            isSingleTenant,
            maxRequestedMemoryMB,
            monthlyProcessVcpuHoursLimit,
            name,
            orgId,
            podMaxLifespanHrs,
            scopes,
            stripeCustomerId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Organization.class,
                "concurrentProcessVcpusLimit", concurrentProcessVcpusLimit,
                "enabledFeatureFlags", enabledFeatureFlags,
                "isSingleTenant", isSingleTenant,
                "maxRequestedMemoryMB", maxRequestedMemoryMB,
                "monthlyProcessVcpuHoursLimit", monthlyProcessVcpuHoursLimit,
                "name", name,
                "orgId", orgId,
                "podMaxLifespanHrs", podMaxLifespanHrs,
                "scopes", scopes,
                "stripeCustomerId", stripeCustomerId);
    }
    
    public final static class Builder {
 
        private Optional<Double> concurrentProcessVcpusLimit = Optional.empty();
 
        private Optional<? extends List<String>> enabledFeatureFlags = Optional.empty();
 
        private Boolean isSingleTenant;
 
        private Double maxRequestedMemoryMB;
 
        private Optional<Double> monthlyProcessVcpuHoursLimit = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private String orgId;
 
        private Optional<Double> podMaxLifespanHrs = Optional.empty();
 
        private List<Scope> scopes;
 
        private String stripeCustomerId;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The maximum number of concurrent processes that can be run by the organization
         * If undefined, the organization has no limit.
         */
        public Builder concurrentProcessVcpusLimit(double concurrentProcessVcpusLimit) {
            Utils.checkNotNull(concurrentProcessVcpusLimit, "concurrentProcessVcpusLimit");
            this.concurrentProcessVcpusLimit = Optional.ofNullable(concurrentProcessVcpusLimit);
            return this;
        }

        /**
         * The maximum number of concurrent processes that can be run by the organization
         * If undefined, the organization has no limit.
         */
        public Builder concurrentProcessVcpusLimit(Optional<Double> concurrentProcessVcpusLimit) {
            Utils.checkNotNull(concurrentProcessVcpusLimit, "concurrentProcessVcpusLimit");
            this.concurrentProcessVcpusLimit = concurrentProcessVcpusLimit;
            return this;
        }

        /**
         * The features enabled for this org and user.
         */
        public Builder enabledFeatureFlags(List<String> enabledFeatureFlags) {
            Utils.checkNotNull(enabledFeatureFlags, "enabledFeatureFlags");
            this.enabledFeatureFlags = Optional.ofNullable(enabledFeatureFlags);
            return this;
        }

        /**
         * The features enabled for this org and user.
         */
        public Builder enabledFeatureFlags(Optional<? extends List<String>> enabledFeatureFlags) {
            Utils.checkNotNull(enabledFeatureFlags, "enabledFeatureFlags");
            this.enabledFeatureFlags = enabledFeatureFlags;
            return this;
        }

        public Builder isSingleTenant(boolean isSingleTenant) {
            Utils.checkNotNull(isSingleTenant, "isSingleTenant");
            this.isSingleTenant = isSingleTenant;
            return this;
        }

        /**
         * The maximum memory in MB that can be used by any process in this org.
         */
        public Builder maxRequestedMemoryMB(double maxRequestedMemoryMB) {
            Utils.checkNotNull(maxRequestedMemoryMB, "maxRequestedMemoryMB");
            this.maxRequestedMemoryMB = maxRequestedMemoryMB;
            return this;
        }

        /**
         * The maximum number of monthly process vcpu hours that can be run by the organization
         * If undefined, the organization has no limit.
         */
        public Builder monthlyProcessVcpuHoursLimit(double monthlyProcessVcpuHoursLimit) {
            Utils.checkNotNull(monthlyProcessVcpuHoursLimit, "monthlyProcessVcpuHoursLimit");
            this.monthlyProcessVcpuHoursLimit = Optional.ofNullable(monthlyProcessVcpuHoursLimit);
            return this;
        }

        /**
         * The maximum number of monthly process vcpu hours that can be run by the organization
         * If undefined, the organization has no limit.
         */
        public Builder monthlyProcessVcpuHoursLimit(Optional<Double> monthlyProcessVcpuHoursLimit) {
            Utils.checkNotNull(monthlyProcessVcpuHoursLimit, "monthlyProcessVcpuHoursLimit");
            this.monthlyProcessVcpuHoursLimit = monthlyProcessVcpuHoursLimit;
            return this;
        }

        /**
         * The name of an organization.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * The name of an organization.
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * System generated unique identifier for an organization. Not guaranteed to have a specific format.
         */
        public Builder orgId(String orgId) {
            Utils.checkNotNull(orgId, "orgId");
            this.orgId = orgId;
            return this;
        }

        /**
         * The maximum lifespan in hours of a pod.
         */
        public Builder podMaxLifespanHrs(double podMaxLifespanHrs) {
            Utils.checkNotNull(podMaxLifespanHrs, "podMaxLifespanHrs");
            this.podMaxLifespanHrs = Optional.ofNullable(podMaxLifespanHrs);
            return this;
        }

        /**
         * The maximum lifespan in hours of a pod.
         */
        public Builder podMaxLifespanHrs(Optional<Double> podMaxLifespanHrs) {
            Utils.checkNotNull(podMaxLifespanHrs, "podMaxLifespanHrs");
            this.podMaxLifespanHrs = podMaxLifespanHrs;
            return this;
        }

        /**
         * The scopes the user who loaded this has on this org.
         */
        public Builder scopes(List<Scope> scopes) {
            Utils.checkNotNull(scopes, "scopes");
            this.scopes = scopes;
            return this;
        }

        public Builder stripeCustomerId(String stripeCustomerId) {
            Utils.checkNotNull(stripeCustomerId, "stripeCustomerId");
            this.stripeCustomerId = stripeCustomerId;
            return this;
        }
        
        public Organization build() {
            return new Organization(
                concurrentProcessVcpusLimit,
                enabledFeatureFlags,
                isSingleTenant,
                maxRequestedMemoryMB,
                monthlyProcessVcpuHoursLimit,
                name,
                orgId,
                podMaxLifespanHrs,
                scopes,
                stripeCustomerId);
        }
    }
}
