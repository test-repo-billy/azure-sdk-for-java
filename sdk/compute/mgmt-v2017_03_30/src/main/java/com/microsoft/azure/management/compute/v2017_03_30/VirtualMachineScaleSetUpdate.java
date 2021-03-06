/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes a Virtual Machine Scale Set.
 */
@JsonFlatten
public class VirtualMachineScaleSetUpdate extends UpdateResource {
    /**
     * The virtual machine scale set sku.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * The purchase plan when deploying a virtual machine scale set from VM
     * Marketplace images.
     */
    @JsonProperty(value = "plan")
    private Plan plan;

    /**
     * The upgrade policy.
     */
    @JsonProperty(value = "properties.upgradePolicy")
    private UpgradePolicy upgradePolicy;

    /**
     * The virtual machine profile.
     */
    @JsonProperty(value = "properties.virtualMachineProfile")
    private VirtualMachineScaleSetUpdateVMProfile virtualMachineProfile;

    /**
     * Specifies whether the Virtual Machine Scale Set should be
     * overprovisioned.
     */
    @JsonProperty(value = "properties.overprovision")
    private Boolean overprovision;

    /**
     * When true this limits the scale set to a single placement group, of max
     * size 100 virtual machines.
     */
    @JsonProperty(value = "properties.singlePlacementGroup")
    private Boolean singlePlacementGroup;

    /**
     * The identity of the virtual machine scale set, if configured.
     */
    @JsonProperty(value = "identity")
    private VirtualMachineScaleSetIdentity identity;

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the plan value.
     *
     * @return the plan value
     */
    public Plan plan() {
        return this.plan;
    }

    /**
     * Set the plan value.
     *
     * @param plan the plan value to set
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the upgradePolicy value.
     *
     * @return the upgradePolicy value
     */
    public UpgradePolicy upgradePolicy() {
        return this.upgradePolicy;
    }

    /**
     * Set the upgradePolicy value.
     *
     * @param upgradePolicy the upgradePolicy value to set
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withUpgradePolicy(UpgradePolicy upgradePolicy) {
        this.upgradePolicy = upgradePolicy;
        return this;
    }

    /**
     * Get the virtualMachineProfile value.
     *
     * @return the virtualMachineProfile value
     */
    public VirtualMachineScaleSetUpdateVMProfile virtualMachineProfile() {
        return this.virtualMachineProfile;
    }

    /**
     * Set the virtualMachineProfile value.
     *
     * @param virtualMachineProfile the virtualMachineProfile value to set
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withVirtualMachineProfile(VirtualMachineScaleSetUpdateVMProfile virtualMachineProfile) {
        this.virtualMachineProfile = virtualMachineProfile;
        return this;
    }

    /**
     * Get the overprovision value.
     *
     * @return the overprovision value
     */
    public Boolean overprovision() {
        return this.overprovision;
    }

    /**
     * Set the overprovision value.
     *
     * @param overprovision the overprovision value to set
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withOverprovision(Boolean overprovision) {
        this.overprovision = overprovision;
        return this;
    }

    /**
     * Get the singlePlacementGroup value.
     *
     * @return the singlePlacementGroup value
     */
    public Boolean singlePlacementGroup() {
        return this.singlePlacementGroup;
    }

    /**
     * Set the singlePlacementGroup value.
     *
     * @param singlePlacementGroup the singlePlacementGroup value to set
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withSinglePlacementGroup(Boolean singlePlacementGroup) {
        this.singlePlacementGroup = singlePlacementGroup;
        return this;
    }

    /**
     * Get the identity value.
     *
     * @return the identity value
     */
    public VirtualMachineScaleSetIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity value.
     *
     * @param identity the identity value to set
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withIdentity(VirtualMachineScaleSetIdentity identity) {
        this.identity = identity;
        return this;
    }

}
