// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The RuleMetricDataSource model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "odata\\.type")
@JsonTypeName("Microsoft.Azure.Management.Insights.Models.RuleMetricDataSource")
@JsonFlatten
@Fluent
public class RuleMetricDataSource extends RuleDataSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RuleMetricDataSource.class);

    /*
     * the name of the metric that defines what the rule monitors.
     */
    @JsonProperty(value = "metricName")
    private String metricName;

    /**
     * Get the metricName property: the name of the metric that defines what the rule monitors.
     *
     * @return the metricName value.
     */
    public String metricName() {
        return this.metricName;
    }

    /**
     * Set the metricName property: the name of the metric that defines what the rule monitors.
     *
     * @param metricName the metricName value to set.
     * @return the RuleMetricDataSource object itself.
     */
    public RuleMetricDataSource withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
