/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies how tasks should be distributed across compute nodes.
 */
public class TaskSchedulingPolicy {
    /**
     * How tasks should be distributed across compute nodes.
     * Possible values include: 'Spread', 'Pack'.
     */
    @JsonProperty(value = "nodeFillType", required = true)
    private ComputeNodeFillType nodeFillType;

    /**
     * Get possible values include: 'Spread', 'Pack'.
     *
     * @return the nodeFillType value
     */
    public ComputeNodeFillType nodeFillType() {
        return this.nodeFillType;
    }

    /**
     * Set possible values include: 'Spread', 'Pack'.
     *
     * @param nodeFillType the nodeFillType value to set
     * @return the TaskSchedulingPolicy object itself.
     */
    public TaskSchedulingPolicy withNodeFillType(ComputeNodeFillType nodeFillType) {
        this.nodeFillType = nodeFillType;
        return this;
    }

}
