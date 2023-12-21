/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2019_02_01.NetworkSecurityGroup;
import rx.Observable;
import java.util.List;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2019_02_01.NetworkSecurityGroupSecurityRule;
import com.microsoft.azure.management.network.v2019_02_01.NetworkInterface;
import com.microsoft.azure.management.network.v2019_02_01.Subnet;

class NetworkSecurityGroupImpl extends GroupableResourceCoreImpl<NetworkSecurityGroup, NetworkSecurityGroupInner, NetworkSecurityGroupImpl, NetworkManager> implements NetworkSecurityGroup, NetworkSecurityGroup.Definition, NetworkSecurityGroup.Update {
    NetworkSecurityGroupImpl(String name, NetworkSecurityGroupInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<NetworkSecurityGroup> createResourceAsync() {
        NetworkSecurityGroupsInner client = this.manager().inner().networkSecurityGroups();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<NetworkSecurityGroup> updateResourceAsync() {
        NetworkSecurityGroupsInner client = this.manager().inner().networkSecurityGroups();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<NetworkSecurityGroupInner> getInnerAsync() {
        NetworkSecurityGroupsInner client = this.manager().inner().networkSecurityGroups();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<NetworkSecurityGroupSecurityRule> defaultSecurityRules() {
        List<NetworkSecurityGroupSecurityRule> lst = new ArrayList<NetworkSecurityGroupSecurityRule>();
        if (this.inner().defaultSecurityRules() != null) {
            for (SecurityRuleInner inner : this.inner().defaultSecurityRules()) {
                lst.add( new NetworkSecurityGroupSecurityRuleImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public List<NetworkInterface> networkInterfaces() {
        List<NetworkInterface> lst = new ArrayList<NetworkInterface>();
        if (this.inner().networkInterfaces() != null) {
            for (NetworkInterfaceInner inner : this.inner().networkInterfaces()) {
                lst.add( new NetworkInterfaceImpl(inner.name(), inner, manager()));
            }
        }
        return lst;
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
    public List<NetworkSecurityGroupSecurityRule> securityRules() {
        List<NetworkSecurityGroupSecurityRule> lst = new ArrayList<NetworkSecurityGroupSecurityRule>();
        if (this.inner().securityRules() != null) {
            for (SecurityRuleInner inner : this.inner().securityRules()) {
                lst.add( new NetworkSecurityGroupSecurityRuleImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public List<Subnet> subnets() {
        List<Subnet> lst = new ArrayList<Subnet>();
        if (this.inner().subnets() != null) {
            for (SubnetInner inner : this.inner().subnets()) {
                lst.add( new SubnetImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public NetworkSecurityGroupImpl withDefaultSecurityRules(List<SecurityRuleInner> defaultSecurityRules) {
        this.inner().withDefaultSecurityRules(defaultSecurityRules);
        return this;
    }

    @Override
    public NetworkSecurityGroupImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public NetworkSecurityGroupImpl withProvisioningState(String provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

    @Override
    public NetworkSecurityGroupImpl withResourceGuid(String resourceGuid) {
        this.inner().withResourceGuid(resourceGuid);
        return this;
    }

    @Override
    public NetworkSecurityGroupImpl withSecurityRules(List<SecurityRuleInner> securityRules) {
        this.inner().withSecurityRules(securityRules);
        return this;
    }

}
