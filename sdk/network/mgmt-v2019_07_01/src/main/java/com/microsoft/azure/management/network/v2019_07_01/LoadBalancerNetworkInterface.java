/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2019_07_01.implementation.NetworkInterfaceInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_07_01.implementation.NetworkManager;
import java.util.List;
import java.util.Map;
import com.microsoft.azure.SubResource;

/**
 * Type representing LoadBalancerNetworkInterface.
 */
public interface LoadBalancerNetworkInterface extends HasInner<NetworkInterfaceInner>, HasManager<NetworkManager> {
    /**
     * @return the dnsSettings value.
     */
    NetworkInterfaceDnsSettings dnsSettings();

    /**
     * @return the enableAcceleratedNetworking value.
     */
    Boolean enableAcceleratedNetworking();

    /**
     * @return the enableIPForwarding value.
     */
    Boolean enableIPForwarding();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the hostedWorkloads value.
     */
    List<String> hostedWorkloads();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the ipConfigurations value.
     */
    List<VirtualMachineScaleSetNetworkInterfaceIPConfiguration> ipConfigurations();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the macAddress value.
     */
    String macAddress();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the networkSecurityGroup value.
     */
    NetworkSecurityGroup networkSecurityGroup();

    /**
     * @return the primary value.
     */
    Boolean primary();

    /**
     * @return the privateEndpoint value.
     */
    PrivateEndpoint privateEndpoint();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the tapConfigurations value.
     */
    List<NetworkInterfaceTapConfiguration> tapConfigurations();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the virtualMachine value.
     */
    SubResource virtualMachine();

}
