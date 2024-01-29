// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes a Virtual Machine Scale Set VM Reimage Parameters.
 */
@Fluent
public final class VirtualMachineScaleSetReimageParameters extends VirtualMachineScaleSetVMReimageParameters {
    /*
     * The virtual machine scale set instance ids. Omitting the virtual machine scale set instance ids will result in
     * the operation being performed on all virtual machines in the virtual machine scale set.
     */
    @JsonProperty(value = "instanceIds")
    private List<String> instanceIds;

    /**
     * Creates an instance of VirtualMachineScaleSetReimageParameters class.
     */
    public VirtualMachineScaleSetReimageParameters() {
    }

    /**
     * Get the instanceIds property: The virtual machine scale set instance ids. Omitting the virtual machine scale set
     * instance ids will result in the operation being performed on all virtual machines in the virtual machine scale
     * set.
     * 
     * @return the instanceIds value.
     */
    public List<String> instanceIds() {
        return this.instanceIds;
    }

    /**
     * Set the instanceIds property: The virtual machine scale set instance ids. Omitting the virtual machine scale set
     * instance ids will result in the operation being performed on all virtual machines in the virtual machine scale
     * set.
     * 
     * @param instanceIds the instanceIds value to set.
     * @return the VirtualMachineScaleSetReimageParameters object itself.
     */
    public VirtualMachineScaleSetReimageParameters withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualMachineScaleSetReimageParameters withTempDisk(Boolean tempDisk) {
        super.withTempDisk(tempDisk);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualMachineScaleSetReimageParameters withExactVersion(String exactVersion) {
        super.withExactVersion(exactVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualMachineScaleSetReimageParameters withOsProfile(OSProfileProvisioningData osProfile) {
        super.withOsProfile(osProfile);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
