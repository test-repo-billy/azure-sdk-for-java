// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineExtensionImageInner;
import java.util.Map;

/**
 * An immutable client-side representation of VirtualMachineExtensionImage.
 */
public interface VirtualMachineExtensionImage {
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
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the operatingSystem property: The operating system this extension supports.
     * 
     * @return the operatingSystem value.
     */
    String operatingSystem();

    /**
     * Gets the computeRole property: The type of role (IaaS or PaaS) this extension supports.
     * 
     * @return the computeRole value.
     */
    String computeRole();

    /**
     * Gets the handlerSchema property: The schema defined by publisher, where extension consumers should provide
     * settings in a matching schema.
     * 
     * @return the handlerSchema value.
     */
    String handlerSchema();

    /**
     * Gets the vmScaleSetEnabled property: Whether the extension can be used on xRP VMScaleSets. By default existing
     * extensions are usable on scalesets, but there might be cases where a publisher wants to explicitly indicate the
     * extension is only enabled for CRP VMs but not VMSS.
     * 
     * @return the vmScaleSetEnabled value.
     */
    Boolean vmScaleSetEnabled();

    /**
     * Gets the supportsMultipleExtensions property: Whether the handler can support multiple extensions.
     * 
     * @return the supportsMultipleExtensions value.
     */
    Boolean supportsMultipleExtensions();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineExtensionImageInner
     * object.
     * 
     * @return the inner object.
     */
    VirtualMachineExtensionImageInner innerModel();
}
