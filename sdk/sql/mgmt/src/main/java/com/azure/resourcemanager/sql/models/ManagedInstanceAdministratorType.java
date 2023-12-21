// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ManagedInstanceAdministratorType. */
public enum ManagedInstanceAdministratorType {
    /** Enum value ActiveDirectory. */
    ACTIVE_DIRECTORY("ActiveDirectory");

    /** The actual serialized value for a ManagedInstanceAdministratorType instance. */
    private final String value;

    ManagedInstanceAdministratorType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ManagedInstanceAdministratorType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ManagedInstanceAdministratorType object, or null if unable to parse.
     */
    @JsonCreator
    public static ManagedInstanceAdministratorType fromString(String value) {
        ManagedInstanceAdministratorType[] items = ManagedInstanceAdministratorType.values();
        for (ManagedInstanceAdministratorType item : items) {
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
