/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DeploymentResourceStatus.
 */
public final class DeploymentResourceStatus extends ExpandableStringEnum<DeploymentResourceStatus> {
    /** Static value Unknown for DeploymentResourceStatus. */
    public static final DeploymentResourceStatus UNKNOWN = fromString("Unknown");

    /** Static value Stopped for DeploymentResourceStatus. */
    public static final DeploymentResourceStatus STOPPED = fromString("Stopped");

    /** Static value Running for DeploymentResourceStatus. */
    public static final DeploymentResourceStatus RUNNING = fromString("Running");

    /** Static value Failed for DeploymentResourceStatus. */
    public static final DeploymentResourceStatus FAILED = fromString("Failed");

    /** Static value Processing for DeploymentResourceStatus. */
    public static final DeploymentResourceStatus PROCESSING = fromString("Processing");

    /**
     * Creates or finds a DeploymentResourceStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding DeploymentResourceStatus
     */
    @JsonCreator
    public static DeploymentResourceStatus fromString(String name) {
        return fromString(name, DeploymentResourceStatus.class);
    }

    /**
     * @return known DeploymentResourceStatus values
     */
    public static Collection<DeploymentResourceStatus> values() {
        return values(DeploymentResourceStatus.class);
    }
}
