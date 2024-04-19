// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.iotfirmwaredefense.fluent.models.BinaryHardeningResourceInner;

/**
 * An immutable client-side representation of BinaryHardeningResource.
 */
public interface BinaryHardeningResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the binaryHardeningId property: ID for the binary hardening result.
     * 
     * @return the binaryHardeningId value.
     */
    String binaryHardeningId();

    /**
     * Gets the architecture property: The architecture of the uploaded firmware.
     * 
     * @return the architecture value.
     */
    String architecture();

    /**
     * Gets the filePath property: The executable path.
     * 
     * @return the filePath value.
     */
    String filePath();

    /**
     * Gets the classProperty property: The executable class to indicate 32 or 64 bit.
     * 
     * @return the classProperty value.
     */
    String classProperty();

    /**
     * Gets the runpath property: The runpath of the uploaded firmware.
     * 
     * @return the runpath value.
     */
    String runpath();

    /**
     * Gets the rpath property: The rpath of the uploaded firmware.
     * 
     * @return the rpath value.
     */
    String rpath();

    /**
     * Gets the nx property: NX (no-execute) flag.
     * 
     * @return the nx value.
     */
    Boolean nx();

    /**
     * Gets the pie property: PIE (position independent executable) flag.
     * 
     * @return the pie value.
     */
    Boolean pie();

    /**
     * Gets the relro property: RELRO (relocation read-only) flag.
     * 
     * @return the relro value.
     */
    Boolean relro();

    /**
     * Gets the canary property: Canary (stack canaries) flag.
     * 
     * @return the canary value.
     */
    Boolean canary();

    /**
     * Gets the stripped property: Stripped flag.
     * 
     * @return the stripped value.
     */
    Boolean stripped();

    /**
     * Gets the inner com.azure.resourcemanager.iotfirmwaredefense.fluent.models.BinaryHardeningResourceInner object.
     * 
     * @return the inner object.
     */
    BinaryHardeningResourceInner innerModel();
}
