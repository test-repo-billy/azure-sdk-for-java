// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Provisioning state of the .NET Component.
 */
public final class DotNetComponentProvisioningState extends ExpandableStringEnum<DotNetComponentProvisioningState> {
    /**
     * Static value Succeeded for DotNetComponentProvisioningState.
     */
    public static final DotNetComponentProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for DotNetComponentProvisioningState.
     */
    public static final DotNetComponentProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Canceled for DotNetComponentProvisioningState.
     */
    public static final DotNetComponentProvisioningState CANCELED = fromString("Canceled");

    /**
     * Static value Deleting for DotNetComponentProvisioningState.
     */
    public static final DotNetComponentProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value InProgress for DotNetComponentProvisioningState.
     */
    public static final DotNetComponentProvisioningState IN_PROGRESS = fromString("InProgress");

    /**
     * Creates a new instance of DotNetComponentProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DotNetComponentProvisioningState() {
    }

    /**
     * Creates or finds a DotNetComponentProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DotNetComponentProvisioningState.
     */
    @JsonCreator
    public static DotNetComponentProvisioningState fromString(String name) {
        return fromString(name, DotNetComponentProvisioningState.class);
    }

    /**
     * Gets known DotNetComponentProvisioningState values.
     * 
     * @return known DotNetComponentProvisioningState values.
     */
    public static Collection<DotNetComponentProvisioningState> values() {
        return values(DotNetComponentProvisioningState.class);
    }
}
