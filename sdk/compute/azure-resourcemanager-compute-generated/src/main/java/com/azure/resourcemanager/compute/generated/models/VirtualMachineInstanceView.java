// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineInstanceViewInner;
import java.util.List;

/**
 * An immutable client-side representation of VirtualMachineInstanceView.
 */
public interface VirtualMachineInstanceView {
    /**
     * Gets the platformUpdateDomain property: Specifies the update domain of the virtual machine.
     * 
     * @return the platformUpdateDomain value.
     */
    Integer platformUpdateDomain();

    /**
     * Gets the platformFaultDomain property: Specifies the fault domain of the virtual machine.
     * 
     * @return the platformFaultDomain value.
     */
    Integer platformFaultDomain();

    /**
     * Gets the computerName property: The computer name assigned to the virtual machine.
     * 
     * @return the computerName value.
     */
    String computerName();

    /**
     * Gets the osName property: The Operating System running on the virtual machine.
     * 
     * @return the osName value.
     */
    String osName();

    /**
     * Gets the osVersion property: The version of Operating System running on the virtual machine.
     * 
     * @return the osVersion value.
     */
    String osVersion();

    /**
     * Gets the hyperVGeneration property: Specifies the HyperVGeneration Type associated with a resource.
     * 
     * @return the hyperVGeneration value.
     */
    HyperVGenerationType hyperVGeneration();

    /**
     * Gets the rdpThumbPrint property: The Remote desktop certificate thumbprint.
     * 
     * @return the rdpThumbPrint value.
     */
    String rdpThumbPrint();

    /**
     * Gets the vmAgent property: The VM Agent running on the virtual machine.
     * 
     * @return the vmAgent value.
     */
    VirtualMachineAgentInstanceView vmAgent();

    /**
     * Gets the maintenanceRedeployStatus property: The Maintenance Operation status on the virtual machine.
     * 
     * @return the maintenanceRedeployStatus value.
     */
    MaintenanceRedeployStatus maintenanceRedeployStatus();

    /**
     * Gets the disks property: The virtual machine disk information.
     * 
     * @return the disks value.
     */
    List<DiskInstanceView> disks();

    /**
     * Gets the extensions property: The extensions information.
     * 
     * @return the extensions value.
     */
    List<VirtualMachineExtensionInstanceView> extensions();

    /**
     * Gets the vmHealth property: The health status for the VM.
     * 
     * @return the vmHealth value.
     */
    VirtualMachineHealthStatus vmHealth();

    /**
     * Gets the bootDiagnostics property: Boot Diagnostics is a debugging feature which allows you to view Console
     * Output and Screenshot to diagnose VM status. You can easily view the output of your console log. Azure also
     * enables you to see a screenshot of the VM from the hypervisor.
     * 
     * @return the bootDiagnostics value.
     */
    BootDiagnosticsInstanceView bootDiagnostics();

    /**
     * Gets the assignedHost property: Resource id of the dedicated host, on which the virtual machine is allocated
     * through automatic placement, when the virtual machine is associated with a dedicated host group that has
     * automatic placement enabled. Minimum api-version: 2020-06-01.
     * 
     * @return the assignedHost value.
     */
    String assignedHost();

    /**
     * Gets the statuses property: The resource status information.
     * 
     * @return the statuses value.
     */
    List<InstanceViewStatus> statuses();

    /**
     * Gets the patchStatus property: [Preview Feature] The status of virtual machine patch operations.
     * 
     * @return the patchStatus value.
     */
    VirtualMachinePatchStatus patchStatus();

    /**
     * Gets the isVMInStandbyPool property: [Preview Feature] Specifies whether the VM is currently in or out of the
     * Standby Pool.
     * 
     * @return the isVMInStandbyPool value.
     */
    Boolean isVMInStandbyPool();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineInstanceViewInner object.
     * 
     * @return the inner object.
     */
    VirtualMachineInstanceViewInner innerModel();
}
