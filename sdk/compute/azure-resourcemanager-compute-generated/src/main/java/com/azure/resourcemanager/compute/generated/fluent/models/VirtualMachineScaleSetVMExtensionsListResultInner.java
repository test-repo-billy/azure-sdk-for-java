// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The List VMSS VM Extension operation response.
 */
@Fluent
public final class VirtualMachineScaleSetVMExtensionsListResultInner {
    /*
     * The list of VMSS VM extensions
     */
    @JsonProperty(value = "value")
    private List<VirtualMachineScaleSetVMExtensionInner> value;

    /**
     * Creates an instance of VirtualMachineScaleSetVMExtensionsListResultInner class.
     */
    public VirtualMachineScaleSetVMExtensionsListResultInner() {
    }

    /**
     * Get the value property: The list of VMSS VM extensions.
     * 
     * @return the value value.
     */
    public List<VirtualMachineScaleSetVMExtensionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of VMSS VM extensions.
     * 
     * @param value the value value to set.
     * @return the VirtualMachineScaleSetVMExtensionsListResultInner object itself.
     */
    public VirtualMachineScaleSetVMExtensionsListResultInner
        withValue(List<VirtualMachineScaleSetVMExtensionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
