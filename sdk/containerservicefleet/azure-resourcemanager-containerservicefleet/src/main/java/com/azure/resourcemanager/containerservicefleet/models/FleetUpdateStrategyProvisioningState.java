// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The provisioning state of the UpdateStrategy resource.
 */
public final class FleetUpdateStrategyProvisioningState
    extends ExpandableStringEnum<FleetUpdateStrategyProvisioningState> {
    /**
     * Static value Succeeded for FleetUpdateStrategyProvisioningState.
     */
    public static final FleetUpdateStrategyProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for FleetUpdateStrategyProvisioningState.
     */
    public static final FleetUpdateStrategyProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Canceled for FleetUpdateStrategyProvisioningState.
     */
    public static final FleetUpdateStrategyProvisioningState CANCELED = fromString("Canceled");

    /**
     * Creates a new instance of FleetUpdateStrategyProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FleetUpdateStrategyProvisioningState() {
    }

    /**
     * Creates or finds a FleetUpdateStrategyProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FleetUpdateStrategyProvisioningState.
     */
    @JsonCreator
    public static FleetUpdateStrategyProvisioningState fromString(String name) {
        return fromString(name, FleetUpdateStrategyProvisioningState.class);
    }

    /**
     * Gets known FleetUpdateStrategyProvisioningState values.
     * 
     * @return known FleetUpdateStrategyProvisioningState values.
     */
    public static Collection<FleetUpdateStrategyProvisioningState> values() {
        return values(FleetUpdateStrategyProvisioningState.class);
    }
}
