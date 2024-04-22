// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cluster log analytics profile to enable or disable OMS agent for cluster.
 */
@Fluent
public final class ClusterLogAnalyticsProfile {
    /*
     * True if log analytics is enabled for the cluster, otherwise false.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * Collection of logs to be enabled or disabled for log analytics.
     */
    @JsonProperty(value = "applicationLogs")
    private ClusterLogAnalyticsApplicationLogs applicationLogs;

    /*
     * True if metrics are enabled, otherwise false.
     */
    @JsonProperty(value = "metricsEnabled")
    private Boolean metricsEnabled;

    /**
     * Creates an instance of ClusterLogAnalyticsProfile class.
     */
    public ClusterLogAnalyticsProfile() {
    }

    /**
     * Get the enabled property: True if log analytics is enabled for the cluster, otherwise false.
     * 
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: True if log analytics is enabled for the cluster, otherwise false.
     * 
     * @param enabled the enabled value to set.
     * @return the ClusterLogAnalyticsProfile object itself.
     */
    public ClusterLogAnalyticsProfile withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the applicationLogs property: Collection of logs to be enabled or disabled for log analytics.
     * 
     * @return the applicationLogs value.
     */
    public ClusterLogAnalyticsApplicationLogs applicationLogs() {
        return this.applicationLogs;
    }

    /**
     * Set the applicationLogs property: Collection of logs to be enabled or disabled for log analytics.
     * 
     * @param applicationLogs the applicationLogs value to set.
     * @return the ClusterLogAnalyticsProfile object itself.
     */
    public ClusterLogAnalyticsProfile withApplicationLogs(ClusterLogAnalyticsApplicationLogs applicationLogs) {
        this.applicationLogs = applicationLogs;
        return this;
    }

    /**
     * Get the metricsEnabled property: True if metrics are enabled, otherwise false.
     * 
     * @return the metricsEnabled value.
     */
    public Boolean metricsEnabled() {
        return this.metricsEnabled;
    }

    /**
     * Set the metricsEnabled property: True if metrics are enabled, otherwise false.
     * 
     * @param metricsEnabled the metricsEnabled value to set.
     * @return the ClusterLogAnalyticsProfile object itself.
     */
    public ClusterLogAnalyticsProfile withMetricsEnabled(Boolean metricsEnabled) {
        this.metricsEnabled = metricsEnabled;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (applicationLogs() != null) {
            applicationLogs().validate();
        }
    }
}
