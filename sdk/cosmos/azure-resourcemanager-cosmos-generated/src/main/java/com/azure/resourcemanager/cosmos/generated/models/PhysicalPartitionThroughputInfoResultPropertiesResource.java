// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import java.util.List;

/**
 * properties of physical partition throughput info.
 */
@Fluent
public final class PhysicalPartitionThroughputInfoResultPropertiesResource
    extends PhysicalPartitionThroughputInfoProperties {
    /**
     * Creates an instance of PhysicalPartitionThroughputInfoResultPropertiesResource class.
     */
    public PhysicalPartitionThroughputInfoResultPropertiesResource() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalPartitionThroughputInfoResultPropertiesResource withPhysicalPartitionThroughputInfo(
        List<PhysicalPartitionThroughputInfoResource> physicalPartitionThroughputInfo) {
        super.withPhysicalPartitionThroughputInfo(physicalPartitionThroughputInfo);
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
