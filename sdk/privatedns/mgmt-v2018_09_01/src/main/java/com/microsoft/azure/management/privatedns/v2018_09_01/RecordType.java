/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.privatedns.v2018_09_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for RecordType.
 */
public enum RecordType {
    /** Enum value A. */
    A("A"),

    /** Enum value AAAA. */
    AAAA("AAAA"),

    /** Enum value CNAME. */
    CNAME("CNAME"),

    /** Enum value MX. */
    MX("MX"),

    /** Enum value PTR. */
    PTR("PTR"),

    /** Enum value SOA. */
    SOA("SOA"),

    /** Enum value SRV. */
    SRV("SRV"),

    /** Enum value TXT. */
    TXT("TXT");

    /** The actual serialized value for a RecordType instance. */
    private String value;

    RecordType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RecordType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RecordType object, or null if unable to parse.
     */
    @JsonCreator
    public static RecordType fromString(String value) {
        RecordType[] items = RecordType.values();
        for (RecordType item : items) {
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
