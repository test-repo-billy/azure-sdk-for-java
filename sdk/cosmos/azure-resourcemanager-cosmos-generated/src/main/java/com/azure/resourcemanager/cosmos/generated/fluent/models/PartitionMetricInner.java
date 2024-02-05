// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The metric values for a single partition.
 */
@Immutable
public final class PartitionMetricInner extends MetricInner {
    /*
     * The partition id (GUID identifier) of the metric values.
     */
    @JsonProperty(value = "partitionId", access = JsonProperty.Access.WRITE_ONLY)
    private String partitionId;

    /*
     * The partition key range id (integer identifier) of the metric values.
     */
    @JsonProperty(value = "partitionKeyRangeId", access = JsonProperty.Access.WRITE_ONLY)
    private String partitionKeyRangeId;

    /**
     * Creates an instance of PartitionMetricInner class.
     */
    public PartitionMetricInner() {
    }

    /**
     * Get the partitionId property: The partition id (GUID identifier) of the metric values.
     * 
     * @return the partitionId value.
     */
    public String partitionId() {
        return this.partitionId;
    }

    /**
     * Get the partitionKeyRangeId property: The partition key range id (integer identifier) of the metric values.
     * 
     * @return the partitionKeyRangeId value.
     */
    public String partitionKeyRangeId() {
        return this.partitionKeyRangeId;
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
