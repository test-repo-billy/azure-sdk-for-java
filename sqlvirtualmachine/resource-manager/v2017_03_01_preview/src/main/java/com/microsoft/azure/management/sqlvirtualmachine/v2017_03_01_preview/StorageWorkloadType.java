/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for StorageWorkloadType.
 */
public final class StorageWorkloadType extends ExpandableStringEnum<StorageWorkloadType> {
    /** Static value GENERAL for StorageWorkloadType. */
    public static final StorageWorkloadType GENERAL = fromString("GENERAL");

    /** Static value OLTP for StorageWorkloadType. */
    public static final StorageWorkloadType OLTP = fromString("OLTP");

    /** Static value DW for StorageWorkloadType. */
    public static final StorageWorkloadType DW = fromString("DW");

    /**
     * Creates or finds a StorageWorkloadType from its string representation.
     * @param name a name to look for
     * @return the corresponding StorageWorkloadType
     */
    @JsonCreator
    public static StorageWorkloadType fromString(String name) {
        return fromString(name, StorageWorkloadType.class);
    }

    /**
     * @return known StorageWorkloadType values
     */
    public static Collection<StorageWorkloadType> values() {
        return values(StorageWorkloadType.class);
    }
}
