/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2018_12_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ComputeNodeDeallocationOption.
 */
public enum ComputeNodeDeallocationOption {
    /** Terminate running task processes and requeue the tasks. The tasks will run again when a node is available. Remove nodes as soon as tasks have been terminated. */
    REQUEUE("Requeue"),

    /** Terminate running tasks. The tasks will be completed with failureInfo indicating that they were terminated, and will not run again. Remove nodes as soon as tasks have been terminated. */
    TERMINATE("Terminate"),

    /** Allow currently running tasks to complete. Schedule no new tasks while waiting. Remove nodes when all tasks have completed. */
    TASK_COMPLETION("TaskCompletion"),

    /** Allow currently running tasks to complete, then wait for all task data retention periods to expire. Schedule no new tasks while waiting. Remove nodes when all task retention periods have expired. */
    RETAINED_DATA("RetainedData");

    /** The actual serialized value for a ComputeNodeDeallocationOption instance. */
    private String value;

    ComputeNodeDeallocationOption(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ComputeNodeDeallocationOption instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ComputeNodeDeallocationOption object, or null if unable to parse.
     */
    @JsonCreator
    public static ComputeNodeDeallocationOption fromString(String value) {
        ComputeNodeDeallocationOption[] items = ComputeNodeDeallocationOption.values();
        for (ComputeNodeDeallocationOption item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
