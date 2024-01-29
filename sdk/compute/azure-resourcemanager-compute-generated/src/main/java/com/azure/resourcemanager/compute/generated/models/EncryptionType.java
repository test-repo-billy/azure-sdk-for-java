// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The type of key used to encrypt the data of the disk.
 */
public final class EncryptionType extends ExpandableStringEnum<EncryptionType> {
    /**
     * Static value EncryptionAtRestWithPlatformKey for EncryptionType.
     */
    public static final EncryptionType ENCRYPTION_AT_REST_WITH_PLATFORM_KEY
        = fromString("EncryptionAtRestWithPlatformKey");

    /**
     * Static value EncryptionAtRestWithCustomerKey for EncryptionType.
     */
    public static final EncryptionType ENCRYPTION_AT_REST_WITH_CUSTOMER_KEY
        = fromString("EncryptionAtRestWithCustomerKey");

    /**
     * Static value EncryptionAtRestWithPlatformAndCustomerKeys for EncryptionType.
     */
    public static final EncryptionType ENCRYPTION_AT_REST_WITH_PLATFORM_AND_CUSTOMER_KEYS
        = fromString("EncryptionAtRestWithPlatformAndCustomerKeys");

    /**
     * Creates a new instance of EncryptionType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EncryptionType() {
    }

    /**
     * Creates or finds a EncryptionType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding EncryptionType.
     */
    @JsonCreator
    public static EncryptionType fromString(String name) {
        return fromString(name, EncryptionType.class);
    }

    /**
     * Gets known EncryptionType values.
     * 
     * @return known EncryptionType values.
     */
    public static Collection<EncryptionType> values() {
        return values(EncryptionType.class);
    }
}
