// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkGatewayNatRuleInner;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayNatRule;
import com.azure.resourcemanager.network.generated.models.VpnNatRuleMapping;
import com.azure.resourcemanager.network.generated.models.VpnNatRuleMode;
import com.azure.resourcemanager.network.generated.models.VpnNatRuleType;
import java.util.Collections;
import java.util.List;

public final class VirtualNetworkGatewayNatRuleImpl implements VirtualNetworkGatewayNatRule,
    VirtualNetworkGatewayNatRule.Definition, VirtualNetworkGatewayNatRule.Update {
    private VirtualNetworkGatewayNatRuleInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String type() {
        return this.innerModel().type();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public VpnNatRuleType typePropertiesType() {
        return this.innerModel().typePropertiesType();
    }

    public VpnNatRuleMode mode() {
        return this.innerModel().mode();
    }

    public List<VpnNatRuleMapping> internalMappings() {
        List<VpnNatRuleMapping> inner = this.innerModel().internalMappings();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<VpnNatRuleMapping> externalMappings() {
        List<VpnNatRuleMapping> inner = this.innerModel().externalMappings();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String ipConfigurationId() {
        return this.innerModel().ipConfigurationId();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public VirtualNetworkGatewayNatRuleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String virtualNetworkGatewayName;

    private String natRuleName;

    public VirtualNetworkGatewayNatRuleImpl withExistingVirtualNetworkGateway(String resourceGroupName,
        String virtualNetworkGatewayName) {
        this.resourceGroupName = resourceGroupName;
        this.virtualNetworkGatewayName = virtualNetworkGatewayName;
        return this;
    }

    public VirtualNetworkGatewayNatRule create() {
        this.innerObject = serviceManager.serviceClient().getVirtualNetworkGatewayNatRules()
            .createOrUpdate(resourceGroupName, virtualNetworkGatewayName, natRuleName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualNetworkGatewayNatRule create(Context context) {
        this.innerObject = serviceManager.serviceClient().getVirtualNetworkGatewayNatRules()
            .createOrUpdate(resourceGroupName, virtualNetworkGatewayName, natRuleName, this.innerModel(), context);
        return this;
    }

    VirtualNetworkGatewayNatRuleImpl(String name,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new VirtualNetworkGatewayNatRuleInner();
        this.serviceManager = serviceManager;
        this.natRuleName = name;
    }

    public VirtualNetworkGatewayNatRuleImpl update() {
        return this;
    }

    public VirtualNetworkGatewayNatRule apply() {
        this.innerObject = serviceManager.serviceClient().getVirtualNetworkGatewayNatRules()
            .createOrUpdate(resourceGroupName, virtualNetworkGatewayName, natRuleName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualNetworkGatewayNatRule apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getVirtualNetworkGatewayNatRules()
            .createOrUpdate(resourceGroupName, virtualNetworkGatewayName, natRuleName, this.innerModel(), context);
        return this;
    }

    VirtualNetworkGatewayNatRuleImpl(VirtualNetworkGatewayNatRuleInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.virtualNetworkGatewayName = Utils.getValueFromIdByName(innerObject.id(), "virtualNetworkGateways");
        this.natRuleName = Utils.getValueFromIdByName(innerObject.id(), "natRules");
    }

    public VirtualNetworkGatewayNatRule refresh() {
        this.innerObject = serviceManager.serviceClient().getVirtualNetworkGatewayNatRules()
            .getWithResponse(resourceGroupName, virtualNetworkGatewayName, natRuleName, Context.NONE).getValue();
        return this;
    }

    public VirtualNetworkGatewayNatRule refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getVirtualNetworkGatewayNatRules()
            .getWithResponse(resourceGroupName, virtualNetworkGatewayName, natRuleName, context).getValue();
        return this;
    }

    public VirtualNetworkGatewayNatRuleImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public VirtualNetworkGatewayNatRuleImpl withTypePropertiesType(VpnNatRuleType typePropertiesType) {
        this.innerModel().withTypePropertiesType(typePropertiesType);
        return this;
    }

    public VirtualNetworkGatewayNatRuleImpl withMode(VpnNatRuleMode mode) {
        this.innerModel().withMode(mode);
        return this;
    }

    public VirtualNetworkGatewayNatRuleImpl withInternalMappings(List<VpnNatRuleMapping> internalMappings) {
        this.innerModel().withInternalMappings(internalMappings);
        return this;
    }

    public VirtualNetworkGatewayNatRuleImpl withExternalMappings(List<VpnNatRuleMapping> externalMappings) {
        this.innerModel().withExternalMappings(externalMappings);
        return this;
    }

    public VirtualNetworkGatewayNatRuleImpl withIpConfigurationId(String ipConfigurationId) {
        this.innerModel().withIpConfigurationId(ipConfigurationId);
        return this;
    }
}
