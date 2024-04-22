// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for PasswordAuth.
 */
public final class PasswordAuth extends ExpandableStringEnum<PasswordAuth> {
    /**
     * Static value enabled for PasswordAuth.
     */
    public static final PasswordAuth ENABLED = fromString("enabled");

    /**
     * Static value disabled for PasswordAuth.
     */
    public static final PasswordAuth DISABLED = fromString("disabled");

    /**
     * Creates a new instance of PasswordAuth value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PasswordAuth() {
    }

    /**
     * Creates or finds a PasswordAuth from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PasswordAuth.
     */
    @JsonCreator
    public static PasswordAuth fromString(String name) {
        return fromString(name, PasswordAuth.class);
    }

    /**
     * Gets known PasswordAuth values.
     * 
     * @return known PasswordAuth values.
     */
    public static Collection<PasswordAuth> values() {
        return values(PasswordAuth.class);
    }
}
