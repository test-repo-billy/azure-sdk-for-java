// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Round-Robin load balancing settings for a backend pool.
 */
@Fluent
public final class LoadBalancingSettingsParameters {
    /*
     * The number of samples to consider for load balancing decisions
     */
    @JsonProperty(value = "sampleSize")
    private Integer sampleSize;

    /*
     * The number of samples within the sample period that must succeed
     */
    @JsonProperty(value = "successfulSamplesRequired")
    private Integer successfulSamplesRequired;

    /*
     * The additional latency in milliseconds for probes to fall into the lowest latency bucket
     */
    @JsonProperty(value = "additionalLatencyInMilliseconds")
    private Integer additionalLatencyInMilliseconds;

    /**
     * Creates an instance of LoadBalancingSettingsParameters class.
     */
    public LoadBalancingSettingsParameters() {
    }

    /**
     * Get the sampleSize property: The number of samples to consider for load balancing decisions.
     * 
     * @return the sampleSize value.
     */
    public Integer sampleSize() {
        return this.sampleSize;
    }

    /**
     * Set the sampleSize property: The number of samples to consider for load balancing decisions.
     * 
     * @param sampleSize the sampleSize value to set.
     * @return the LoadBalancingSettingsParameters object itself.
     */
    public LoadBalancingSettingsParameters withSampleSize(Integer sampleSize) {
        this.sampleSize = sampleSize;
        return this;
    }

    /**
     * Get the successfulSamplesRequired property: The number of samples within the sample period that must succeed.
     * 
     * @return the successfulSamplesRequired value.
     */
    public Integer successfulSamplesRequired() {
        return this.successfulSamplesRequired;
    }

    /**
     * Set the successfulSamplesRequired property: The number of samples within the sample period that must succeed.
     * 
     * @param successfulSamplesRequired the successfulSamplesRequired value to set.
     * @return the LoadBalancingSettingsParameters object itself.
     */
    public LoadBalancingSettingsParameters withSuccessfulSamplesRequired(Integer successfulSamplesRequired) {
        this.successfulSamplesRequired = successfulSamplesRequired;
        return this;
    }

    /**
     * Get the additionalLatencyInMilliseconds property: The additional latency in milliseconds for probes to fall into
     * the lowest latency bucket.
     * 
     * @return the additionalLatencyInMilliseconds value.
     */
    public Integer additionalLatencyInMilliseconds() {
        return this.additionalLatencyInMilliseconds;
    }

    /**
     * Set the additionalLatencyInMilliseconds property: The additional latency in milliseconds for probes to fall into
     * the lowest latency bucket.
     * 
     * @param additionalLatencyInMilliseconds the additionalLatencyInMilliseconds value to set.
     * @return the LoadBalancingSettingsParameters object itself.
     */
    public LoadBalancingSettingsParameters
        withAdditionalLatencyInMilliseconds(Integer additionalLatencyInMilliseconds) {
        this.additionalLatencyInMilliseconds = additionalLatencyInMilliseconds;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
