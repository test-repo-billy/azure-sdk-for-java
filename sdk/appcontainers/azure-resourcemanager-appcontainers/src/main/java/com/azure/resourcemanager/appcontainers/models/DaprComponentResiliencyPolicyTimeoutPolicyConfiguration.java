// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Dapr Component Resiliency Policy Timeout Policy Configuration.
 */
@Fluent
public final class DaprComponentResiliencyPolicyTimeoutPolicyConfiguration {
    /*
     * The optional response timeout in seconds
     */
    @JsonProperty(value = "responseTimeoutInSeconds")
    private Integer responseTimeoutInSeconds;

    /**
     * Creates an instance of DaprComponentResiliencyPolicyTimeoutPolicyConfiguration class.
     */
    public DaprComponentResiliencyPolicyTimeoutPolicyConfiguration() {
    }

    /**
     * Get the responseTimeoutInSeconds property: The optional response timeout in seconds.
     * 
     * @return the responseTimeoutInSeconds value.
     */
    public Integer responseTimeoutInSeconds() {
        return this.responseTimeoutInSeconds;
    }

    /**
     * Set the responseTimeoutInSeconds property: The optional response timeout in seconds.
     * 
     * @param responseTimeoutInSeconds the responseTimeoutInSeconds value to set.
     * @return the DaprComponentResiliencyPolicyTimeoutPolicyConfiguration object itself.
     */
    public DaprComponentResiliencyPolicyTimeoutPolicyConfiguration
        withResponseTimeoutInSeconds(Integer responseTimeoutInSeconds) {
        this.responseTimeoutInSeconds = responseTimeoutInSeconds;
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
