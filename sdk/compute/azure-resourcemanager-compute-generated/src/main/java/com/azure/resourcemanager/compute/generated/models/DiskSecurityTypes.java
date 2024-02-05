// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Specifies the SecurityType of the VM. Applicable for OS disks only.
 */
public final class DiskSecurityTypes extends ExpandableStringEnum<DiskSecurityTypes> {
    /**
     * Static value TrustedLaunch for DiskSecurityTypes.
     */
    public static final DiskSecurityTypes TRUSTED_LAUNCH = fromString("TrustedLaunch");

    /**
     * Static value ConfidentialVM_VMGuestStateOnlyEncryptedWithPlatformKey for DiskSecurityTypes.
     */
    public static final DiskSecurityTypes CONFIDENTIAL_VM_VMGUEST_STATE_ONLY_ENCRYPTED_WITH_PLATFORM_KEY
        = fromString("ConfidentialVM_VMGuestStateOnlyEncryptedWithPlatformKey");

    /**
     * Static value ConfidentialVM_DiskEncryptedWithPlatformKey for DiskSecurityTypes.
     */
    public static final DiskSecurityTypes CONFIDENTIAL_VM_DISK_ENCRYPTED_WITH_PLATFORM_KEY
        = fromString("ConfidentialVM_DiskEncryptedWithPlatformKey");

    /**
     * Static value ConfidentialVM_DiskEncryptedWithCustomerKey for DiskSecurityTypes.
     */
    public static final DiskSecurityTypes CONFIDENTIAL_VM_DISK_ENCRYPTED_WITH_CUSTOMER_KEY
        = fromString("ConfidentialVM_DiskEncryptedWithCustomerKey");

    /**
     * Static value ConfidentialVM_NonPersistedTPM for DiskSecurityTypes.
     */
    public static final DiskSecurityTypes CONFIDENTIAL_VM_NON_PERSISTED_TPM
        = fromString("ConfidentialVM_NonPersistedTPM");

    /**
     * Creates a new instance of DiskSecurityTypes value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DiskSecurityTypes() {
    }

    /**
     * Creates or finds a DiskSecurityTypes from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DiskSecurityTypes.
     */
    @JsonCreator
    public static DiskSecurityTypes fromString(String name) {
        return fromString(name, DiskSecurityTypes.class);
    }

    /**
     * Gets known DiskSecurityTypes values.
     * 
     * @return known DiskSecurityTypes values.
     */
    public static Collection<DiskSecurityTypes> values() {
        return values(DiskSecurityTypes.class);
    }
}
