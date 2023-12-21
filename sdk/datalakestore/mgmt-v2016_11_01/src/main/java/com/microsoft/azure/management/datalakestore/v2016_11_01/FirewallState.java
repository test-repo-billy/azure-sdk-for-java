/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2016_11_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for FirewallState.
 */
public enum FirewallState {
    /** Enum value Enabled. */
    ENABLED("Enabled"),

    /** Enum value Disabled. */
    DISABLED("Disabled");

    /** The actual serialized value for a FirewallState instance. */
    private String value;

    FirewallState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a FirewallState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed FirewallState object, or null if unable to parse.
     */
    @JsonCreator
    public static FirewallState fromString(String value) {
        FirewallState[] items = FirewallState.values();
        for (FirewallState item : items) {
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
