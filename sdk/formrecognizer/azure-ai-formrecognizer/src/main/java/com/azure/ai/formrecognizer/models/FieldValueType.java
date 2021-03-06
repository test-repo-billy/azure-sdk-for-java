// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for FieldValueType. */
public enum FieldValueType {
    /** Enum value string. */
    STRING("string"),

    /** Enum value date. */
    DATE("date"),

    /** Enum value time. */
    TIME("time"),

    /** Enum value phoneNumber. */
    PHONE_NUMBER("phoneNumber"),

    /** Enum value number. */
    FLOAT("float"),

    /** Enum value integer. */
    INTEGER("integer"),

    /** Enum value array. */
    LIST("list"),

    /** Enum value object. */
    MAP("map");

    /** The actual serialized value for a FieldValueType instance. */
    private final String value;

    FieldValueType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a FieldValueType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed FieldValueType object, or null if unable to parse.
     */
    @JsonCreator
    public static FieldValueType fromString(String value) {
        FieldValueType[] items = FieldValueType.values();
        for (FieldValueType item : items) {
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
