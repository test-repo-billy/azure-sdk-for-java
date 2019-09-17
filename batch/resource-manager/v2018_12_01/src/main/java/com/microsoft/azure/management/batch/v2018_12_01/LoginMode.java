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
 * Defines values for LoginMode.
 */
public enum LoginMode {
    /** The LOGON32_LOGON_BATCH Win32 login mode. The batch login mode is recommended for long running parallel processes. */
    BATCH("Batch"),

    /** The LOGON32_LOGON_INTERACTIVE Win32 login mode. Some applications require having permissions associated with the interactive login mode. If this is the case for an application used in your task, then this option is recommended. */
    INTERACTIVE("Interactive");

    /** The actual serialized value for a LoginMode instance. */
    private String value;

    LoginMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a LoginMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed LoginMode object, or null if unable to parse.
     */
    @JsonCreator
    public static LoginMode fromString(String value) {
        LoginMode[] items = LoginMode.values();
        for (LoginMode item : items) {
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
