// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ConfigReferenceSource.
 */
public enum ConfigReferenceSource {
    /**
     * Enum value KeyVault.
     */
    KEY_VAULT("KeyVault");

    /**
     * The actual serialized value for a ConfigReferenceSource instance.
     */
    private final String value;

    ConfigReferenceSource(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ConfigReferenceSource instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ConfigReferenceSource object, or null if unable to parse.
     */
    @JsonCreator
    public static ConfigReferenceSource fromString(String value) {
        if (value == null) {
            return null;
        }
        ConfigReferenceSource[] items = ConfigReferenceSource.values();
        for (ConfigReferenceSource item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
