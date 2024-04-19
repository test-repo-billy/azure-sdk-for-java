// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The installation state of the packet core.
 */
public final class InstallationState extends ExpandableStringEnum<InstallationState> {
    /**
     * Static value Uninstalled for InstallationState.
     */
    public static final InstallationState UNINSTALLED = fromString("Uninstalled");

    /**
     * Static value Installing for InstallationState.
     */
    public static final InstallationState INSTALLING = fromString("Installing");

    /**
     * Static value Installed for InstallationState.
     */
    public static final InstallationState INSTALLED = fromString("Installed");

    /**
     * Static value Updating for InstallationState.
     */
    public static final InstallationState UPDATING = fromString("Updating");

    /**
     * Static value Upgrading for InstallationState.
     */
    public static final InstallationState UPGRADING = fromString("Upgrading");

    /**
     * Static value Uninstalling for InstallationState.
     */
    public static final InstallationState UNINSTALLING = fromString("Uninstalling");

    /**
     * Static value Reinstalling for InstallationState.
     */
    public static final InstallationState REINSTALLING = fromString("Reinstalling");

    /**
     * Static value RollingBack for InstallationState.
     */
    public static final InstallationState ROLLING_BACK = fromString("RollingBack");

    /**
     * Static value Failed for InstallationState.
     */
    public static final InstallationState FAILED = fromString("Failed");

    /**
     * Creates a new instance of InstallationState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public InstallationState() {
    }

    /**
     * Creates or finds a InstallationState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding InstallationState.
     */
    @JsonCreator
    public static InstallationState fromString(String name) {
        return fromString(name, InstallationState.class);
    }

    /**
     * Gets known InstallationState values.
     * 
     * @return known InstallationState values.
     */
    public static Collection<InstallationState> values() {
        return values(InstallationState.class);
    }
}
