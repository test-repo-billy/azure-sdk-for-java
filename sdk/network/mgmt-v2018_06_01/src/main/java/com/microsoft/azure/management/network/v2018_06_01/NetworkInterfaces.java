/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_06_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2018_06_01.NetworkInterface;
import rx.Completable;
import com.microsoft.azure.management.network.v2018_06_01.VirtualMachineScaleSetNetworkInterfaceIPConfiguration;

/**
 * Type representing NetworkInterfaces.
 */
public interface NetworkInterfaces {
    /**
     * Begins definition for a new NetworkInterface resource.
     * @param name resource name.
     * @return the first stage of the new NetworkInterface definition.
     */
    NetworkInterface.DefinitionStages.Blank defineNetworkInterface(String name);

    /**
     * Gets information about the specified network interface.
     *
     * @param resourceGroupName resource group name
     * @param name resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NetworkInterface> getByResourceGroupAsync(String resourceGroupName, String name);

    /**
     * Gets all network interfaces in a resource group.
     *
     * @param resourceGroupName resource group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NetworkInterface> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Gets all network interfaces in a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NetworkInterface> listAsync();

    /**
     * Deletes the specified network interface.
     *
     * @param resourceGroupName resource group name
     * @param name resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String name);

    /**
     * Gets all route tables applied to a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EffectiveRouteListResult> getEffectiveRouteTableAsync(String resourceGroupName, String networkInterfaceName);

    /**
     * Gets all network security groups applied to a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EffectiveNetworkSecurityGroupListResult> listEffectiveNetworkSecurityGroupsAsync(String resourceGroupName, String networkInterfaceName);

    /**
     * Gets information about all network interfaces in a virtual machine in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LoadBalancerNetworkInterface> listVirtualMachineScaleSetVMNetworkInterfacesAsync(final String resourceGroupName, final String virtualMachineScaleSetName, final String virtualmachineIndex);

    /**
     * Gets all network interfaces in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LoadBalancerNetworkInterface> listVirtualMachineScaleSetNetworkInterfacesAsync(final String resourceGroupName, final String virtualMachineScaleSetName);

    /**
     * Get the specified network interface in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LoadBalancerNetworkInterface> getVirtualMachineScaleSetNetworkInterfaceAsync(String resourceGroupName, String virtualMachineScaleSetName, String virtualmachineIndex, String networkInterfaceName);

    /**
     * Get the specified network interface ip configuration in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The name of the network interface.
     * @param ipConfigurationName The name of the ip configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineScaleSetNetworkInterfaceIPConfiguration> getVirtualMachineScaleSetIpConfigurationAsync(String resourceGroupName, String virtualMachineScaleSetName, String virtualmachineIndex, String networkInterfaceName, String ipConfigurationName);

    /**
     * Get the specified network interface ip configuration in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineScaleSetNetworkInterfaceIPConfiguration> listVirtualMachineScaleSetIpConfigurationsAsync(final String resourceGroupName, final String virtualMachineScaleSetName, final String virtualmachineIndex, final String networkInterfaceName);

}
