/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DomainType.
 */
public enum DomainType {
    /** Enum value Regular. */
    REGULAR("Regular"),

    /** Enum value SoftDeleted. */
    SOFT_DELETED("SoftDeleted");

    /** The actual serialized value for a DomainType instance. */
    private String value;

    DomainType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DomainType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DomainType object, or null if unable to parse.
     */
    @JsonCreator
    public static DomainType fromString(String value) {
        DomainType[] items = DomainType.values();
        for (DomainType item : items) {
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
