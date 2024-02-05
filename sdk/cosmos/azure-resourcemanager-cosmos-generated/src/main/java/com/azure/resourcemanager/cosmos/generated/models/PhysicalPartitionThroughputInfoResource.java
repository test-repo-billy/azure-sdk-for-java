// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PhysicalPartitionThroughputInfo object.
 */
@Fluent
public final class PhysicalPartitionThroughputInfoResource {
    /*
     * Id of a physical partition
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Throughput of a physical partition
     */
    @JsonProperty(value = "throughput")
    private Double throughput;

    /**
     * Creates an instance of PhysicalPartitionThroughputInfoResource class.
     */
    public PhysicalPartitionThroughputInfoResource() {
    }

    /**
     * Get the id property: Id of a physical partition.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Id of a physical partition.
     * 
     * @param id the id value to set.
     * @return the PhysicalPartitionThroughputInfoResource object itself.
     */
    public PhysicalPartitionThroughputInfoResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the throughput property: Throughput of a physical partition.
     * 
     * @return the throughput value.
     */
    public Double throughput() {
        return this.throughput;
    }

    /**
     * Set the throughput property: Throughput of a physical partition.
     * 
     * @param throughput the throughput value to set.
     * @return the PhysicalPartitionThroughputInfoResource object itself.
     */
    public PhysicalPartitionThroughputInfoResource withThroughput(Double throughput) {
        this.throughput = throughput;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property id in model PhysicalPartitionThroughputInfoResource"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PhysicalPartitionThroughputInfoResource.class);
}
