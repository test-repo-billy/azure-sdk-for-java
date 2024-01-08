// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The storage account type for the database's backups.
 */
public final class StorageCapabilityStorageAccountType
    extends ExpandableStringEnum<StorageCapabilityStorageAccountType> {
    /**
     * Static value GRS for StorageCapabilityStorageAccountType.
     */
    public static final StorageCapabilityStorageAccountType GRS = fromString("GRS");

    /**
     * Static value LRS for StorageCapabilityStorageAccountType.
     */
    public static final StorageCapabilityStorageAccountType LRS = fromString("LRS");

    /**
     * Static value ZRS for StorageCapabilityStorageAccountType.
     */
    public static final StorageCapabilityStorageAccountType ZRS = fromString("ZRS");

    /**
     * Creates a new instance of StorageCapabilityStorageAccountType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public StorageCapabilityStorageAccountType() {
    }

    /**
     * Creates or finds a StorageCapabilityStorageAccountType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding StorageCapabilityStorageAccountType.
     */
    @JsonCreator
    public static StorageCapabilityStorageAccountType fromString(String name) {
        return fromString(name, StorageCapabilityStorageAccountType.class);
    }

    /**
     * Gets known StorageCapabilityStorageAccountType values.
     * 
     * @return known StorageCapabilityStorageAccountType values.
     */
    public static Collection<StorageCapabilityStorageAccountType> values() {
        return values(StorageCapabilityStorageAccountType.class);
    }
}
