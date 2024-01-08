// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineImageInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of VirtualMachineImage.
 */
public interface VirtualMachineImage {
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
     * Gets the location property: The supported Azure location of the resource.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Specifies the tags that are assigned to the virtual machine. For more information about
     * using tags, see [Using tags to organize your Azure
     * resources](https://docs.microsoft.com/azure/azure-resource-manager/resource-group-using-tags.md).
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the extendedLocation property: The extended location of the Virtual Machine.
     * 
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * Gets the plan property: Used for establishing the purchase context of any 3rd Party artifact through MarketPlace.
     * 
     * @return the plan value.
     */
    PurchasePlan plan();

    /**
     * Gets the osDiskImage property: Contains the os disk image information.
     * 
     * @return the osDiskImage value.
     */
    OSDiskImage osDiskImage();

    /**
     * Gets the dataDiskImages property: The dataDiskImages property.
     * 
     * @return the dataDiskImages value.
     */
    List<DataDiskImage> dataDiskImages();

    /**
     * Gets the automaticOSUpgradeProperties property: Describes automatic OS upgrade properties on the image.
     * 
     * @return the automaticOSUpgradeProperties value.
     */
    AutomaticOSUpgradeProperties automaticOSUpgradeProperties();

    /**
     * Gets the hyperVGeneration property: Specifies the HyperVGeneration Type.
     * 
     * @return the hyperVGeneration value.
     */
    HyperVGenerationTypes hyperVGeneration();

    /**
     * Gets the disallowed property: Specifies disallowed configuration for the VirtualMachine created from the image.
     * 
     * @return the disallowed value.
     */
    DisallowedConfiguration disallowed();

    /**
     * Gets the features property: The features property.
     * 
     * @return the features value.
     */
    List<VirtualMachineImageFeature> features();

    /**
     * Gets the architecture property: Specifies the Architecture Type.
     * 
     * @return the architecture value.
     */
    ArchitectureTypes architecture();

    /**
     * Gets the imageDeprecationStatus property: Describes image deprecation status properties on the image.
     * 
     * @return the imageDeprecationStatus value.
     */
    ImageDeprecationStatus imageDeprecationStatus();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineImageInner object.
     * 
     * @return the inner object.
     */
    VirtualMachineImageInner innerModel();
}
