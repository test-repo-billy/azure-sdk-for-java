// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * TLS protocol version that will be used for Https.
 */
public enum AfdMinimumTlsVersion {
    /**
     * Enum value TLS10.
     */
    TLS10("TLS10"),

    /**
     * Enum value TLS12.
     */
    TLS12("TLS12");

    /**
     * The actual serialized value for a AfdMinimumTlsVersion instance.
     */
    private final String value;

    AfdMinimumTlsVersion(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AfdMinimumTlsVersion instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed AfdMinimumTlsVersion object, or null if unable to parse.
     */
    @JsonCreator
    public static AfdMinimumTlsVersion fromString(String value) {
        if (value == null) {
            return null;
        }
        AfdMinimumTlsVersion[] items = AfdMinimumTlsVersion.values();
        for (AfdMinimumTlsVersion item : items) {
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
