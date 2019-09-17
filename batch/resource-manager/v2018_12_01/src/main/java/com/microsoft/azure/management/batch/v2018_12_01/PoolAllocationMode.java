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
 * Defines values for PoolAllocationMode.
 */
public enum PoolAllocationMode {
    /** Pools will be allocated in subscriptions owned by the Batch service. */
    BATCH_SERVICE("BatchService"),

    /** Pools will be allocated in a subscription owned by the user. */
    USER_SUBSCRIPTION("UserSubscription");

    /** The actual serialized value for a PoolAllocationMode instance. */
    private String value;

    PoolAllocationMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PoolAllocationMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PoolAllocationMode object, or null if unable to parse.
     */
    @JsonCreator
    public static PoolAllocationMode fromString(String value) {
        PoolAllocationMode[] items = PoolAllocationMode.values();
        for (PoolAllocationMode item : items) {
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
