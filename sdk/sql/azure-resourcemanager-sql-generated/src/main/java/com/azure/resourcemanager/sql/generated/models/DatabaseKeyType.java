// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The database key type. Only supported value is 'AzureKeyVault'.
 */
public final class DatabaseKeyType extends ExpandableStringEnum<DatabaseKeyType> {
    /**
     * Static value AzureKeyVault for DatabaseKeyType.
     */
    public static final DatabaseKeyType AZURE_KEY_VAULT = fromString("AzureKeyVault");

    /**
     * Creates a new instance of DatabaseKeyType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DatabaseKeyType() {
    }

    /**
     * Creates or finds a DatabaseKeyType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DatabaseKeyType.
     */
    @JsonCreator
    public static DatabaseKeyType fromString(String name) {
        return fromString(name, DatabaseKeyType.class);
    }

    /**
     * Gets known DatabaseKeyType values.
     * 
     * @return known DatabaseKeyType values.
     */
    public static Collection<DatabaseKeyType> values() {
        return values(DatabaseKeyType.class);
    }
}
