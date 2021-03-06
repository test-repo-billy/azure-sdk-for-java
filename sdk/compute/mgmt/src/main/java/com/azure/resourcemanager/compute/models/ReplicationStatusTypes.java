// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ReplicationStatusTypes. */
public enum ReplicationStatusTypes {
    /** Enum value ReplicationStatus. */
    REPLICATION_STATUS("ReplicationStatus");

    /** The actual serialized value for a ReplicationStatusTypes instance. */
    private final String value;

    ReplicationStatusTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ReplicationStatusTypes instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ReplicationStatusTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static ReplicationStatusTypes fromString(String value) {
        ReplicationStatusTypes[] items = ReplicationStatusTypes.values();
        for (ReplicationStatusTypes item : items) {
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
