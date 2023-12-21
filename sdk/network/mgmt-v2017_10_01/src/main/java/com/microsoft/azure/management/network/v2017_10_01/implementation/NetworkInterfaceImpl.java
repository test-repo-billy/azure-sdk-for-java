/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2017_10_01.NetworkInterface;
import rx.Observable;
import com.microsoft.azure.SubResource;
import java.util.List;
import com.microsoft.azure.management.network.v2017_10_01.NetworkInterfaceDnsSettings;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2017_10_01.VirtualMachineScaleSetNetworkInterfaceIPConfiguration;
import com.microsoft.azure.management.network.v2017_10_01.NetworkSecurityGroup;

class NetworkInterfaceImpl extends GroupableResourceCoreImpl<NetworkInterface, NetworkInterfaceInner, NetworkInterfaceImpl, NetworkManager> implements NetworkInterface, NetworkInterface.Definition, NetworkInterface.Update {
    NetworkInterfaceImpl(String name, NetworkInterfaceInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<NetworkInterface> createResourceAsync() {
        NetworkInterfacesInner client = this.manager().inner().networkInterfaces();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<NetworkInterface> updateResourceAsync() {
        NetworkInterfacesInner client = this.manager().inner().networkInterfaces();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<NetworkInterfaceInner> getInnerAsync() {
        NetworkInterfacesInner client = this.manager().inner().networkInterfaces();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public NetworkInterfaceDnsSettings dnsSettings() {
        return this.inner().dnsSettings();
    }

    @Override
    public Boolean enableAcceleratedNetworking() {
        return this.inner().enableAcceleratedNetworking();
    }

    @Override
    public Boolean enableIPForwarding() {
        return this.inner().enableIPForwarding();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public List<VirtualMachineScaleSetNetworkInterfaceIPConfiguration> ipConfigurations() {
        List<VirtualMachineScaleSetNetworkInterfaceIPConfiguration> lst = new ArrayList<VirtualMachineScaleSetNetworkInterfaceIPConfiguration>();
        if (this.inner().ipConfigurations() != null) {
            for (NetworkInterfaceIPConfigurationInner inner : this.inner().ipConfigurations()) {
                lst.add( new VirtualMachineScaleSetNetworkInterfaceIPConfigurationImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String macAddress() {
        return this.inner().macAddress();
    }

    @Override
    public NetworkSecurityGroup networkSecurityGroup() {
        NetworkSecurityGroupInner inner = this.inner().networkSecurityGroup();
        if (inner != null) {
            return  new NetworkSecurityGroupImpl(inner.name(), inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public Boolean primary() {
        return this.inner().primary();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String resourceGuid() {
        return this.inner().resourceGuid();
    }

    @Override
    public SubResource virtualMachine() {
        return this.inner().virtualMachine();
    }

    @Override
    public NetworkInterfaceImpl withDnsSettings(NetworkInterfaceDnsSettings dnsSettings) {
        this.inner().withDnsSettings(dnsSettings);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withEnableAcceleratedNetworking(Boolean enableAcceleratedNetworking) {
        this.inner().withEnableAcceleratedNetworking(enableAcceleratedNetworking);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withEnableIPForwarding(Boolean enableIPForwarding) {
        this.inner().withEnableIPForwarding(enableIPForwarding);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withIpConfigurations(List<NetworkInterfaceIPConfigurationInner> ipConfigurations) {
        this.inner().withIpConfigurations(ipConfigurations);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withMacAddress(String macAddress) {
        this.inner().withMacAddress(macAddress);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withNetworkSecurityGroup(NetworkSecurityGroupInner networkSecurityGroup) {
        this.inner().withNetworkSecurityGroup(networkSecurityGroup);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withPrimary(Boolean primary) {
        this.inner().withPrimary(primary);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withProvisioningState(String provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withResourceGuid(String resourceGuid) {
        this.inner().withResourceGuid(resourceGuid);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withVirtualMachine(SubResource virtualMachine) {
        this.inner().withVirtualMachine(virtualMachine);
        return this;
    }

}
