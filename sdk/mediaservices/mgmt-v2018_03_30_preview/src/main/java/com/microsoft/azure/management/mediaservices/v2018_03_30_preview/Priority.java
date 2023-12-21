/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for Priority.
 */
public enum Priority {
    /** Used for TransformOutputs that can be generated after Normal and High priority TransformOutputs. */
    LOW("Low"),

    /** Used for TransformOutputs that can be generated at Normal priority. */
    NORMAL("Normal"),

    /** Used for TransformOutputs that should take precedence over others. */
    HIGH("High");

    /** The actual serialized value for a Priority instance. */
    private String value;

    Priority(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Priority instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Priority object, or null if unable to parse.
     */
    @JsonCreator
    public static Priority fromString(String value) {
        Priority[] items = Priority.values();
        for (Priority item : items) {
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
