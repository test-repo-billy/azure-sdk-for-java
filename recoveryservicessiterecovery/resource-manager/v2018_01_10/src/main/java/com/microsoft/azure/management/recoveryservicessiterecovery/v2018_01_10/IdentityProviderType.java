/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for IdentityProviderType.
 */
public enum IdentityProviderType {
    /** Enum value RecoveryServicesActiveDirectory. */
    RECOVERY_SERVICES_ACTIVE_DIRECTORY("RecoveryServicesActiveDirectory"),

    /** Enum value CustomerActiveDirectory. */
    CUSTOMER_ACTIVE_DIRECTORY("CustomerActiveDirectory");

    /** The actual serialized value for a IdentityProviderType instance. */
    private String value;

    IdentityProviderType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a IdentityProviderType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed IdentityProviderType object, or null if unable to parse.
     */
    @JsonCreator
    public static IdentityProviderType fromString(String value) {
        IdentityProviderType[] items = IdentityProviderType.values();
        for (IdentityProviderType item : items) {
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
