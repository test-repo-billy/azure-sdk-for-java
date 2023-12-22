// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.LocalNetworkGatewayInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkGatewayConnectionInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkGatewayInner;
import com.azure.resourcemanager.network.generated.models.GatewayCustomBgpIpAddressIpConfiguration;
import com.azure.resourcemanager.network.generated.models.IpsecPolicy;
import com.azure.resourcemanager.network.generated.models.LocalNetworkGateway;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import com.azure.resourcemanager.network.generated.models.TrafficSelectorPolicy;
import com.azure.resourcemanager.network.generated.models.TunnelConnectionHealth;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGateway;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnection;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionMode;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionProtocol;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionStatus;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionType;
import com.azure.resourcemanager.network.generated.models.VpnPacketCaptureStartParameters;
import com.azure.resourcemanager.network.generated.models.VpnPacketCaptureStopParameters;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class VirtualNetworkGatewayConnectionImpl implements VirtualNetworkGatewayConnection,
    VirtualNetworkGatewayConnection.Definition, VirtualNetworkGatewayConnection.Update {
    private VirtualNetworkGatewayConnectionInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String id() {
        return this.innerModel().id();
    }

    public String authorizationKey() {
        return this.innerModel().authorizationKey();
    }

    public VirtualNetworkGateway virtualNetworkGateway1() {
        VirtualNetworkGatewayInner inner = this.innerModel().virtualNetworkGateway1();
        if (inner != null) {
            return new VirtualNetworkGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualNetworkGateway virtualNetworkGateway2() {
        VirtualNetworkGatewayInner inner = this.innerModel().virtualNetworkGateway2();
        if (inner != null) {
            return new VirtualNetworkGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public LocalNetworkGateway localNetworkGateway2() {
        LocalNetworkGatewayInner inner = this.innerModel().localNetworkGateway2();
        if (inner != null) {
            return new LocalNetworkGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public List<SubResource> ingressNatRules() {
        List<SubResource> inner = this.innerModel().ingressNatRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<SubResource> egressNatRules() {
        List<SubResource> inner = this.innerModel().egressNatRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public VirtualNetworkGatewayConnectionType connectionType() {
        return this.innerModel().connectionType();
    }

    public VirtualNetworkGatewayConnectionProtocol connectionProtocol() {
        return this.innerModel().connectionProtocol();
    }

    public Integer routingWeight() {
        return this.innerModel().routingWeight();
    }

    public Integer dpdTimeoutSeconds() {
        return this.innerModel().dpdTimeoutSeconds();
    }

    public VirtualNetworkGatewayConnectionMode connectionMode() {
        return this.innerModel().connectionMode();
    }

    public String sharedKey() {
        return this.innerModel().sharedKey();
    }

    public VirtualNetworkGatewayConnectionStatus connectionStatus() {
        return this.innerModel().connectionStatus();
    }

    public List<TunnelConnectionHealth> tunnelConnectionStatus() {
        List<TunnelConnectionHealth> inner = this.innerModel().tunnelConnectionStatus();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Long egressBytesTransferred() {
        return this.innerModel().egressBytesTransferred();
    }

    public Long ingressBytesTransferred() {
        return this.innerModel().ingressBytesTransferred();
    }

    public SubResource peer() {
        return this.innerModel().peer();
    }

    public Boolean enableBgp() {
        return this.innerModel().enableBgp();
    }

    public List<GatewayCustomBgpIpAddressIpConfiguration> gatewayCustomBgpIpAddresses() {
        List<GatewayCustomBgpIpAddressIpConfiguration> inner = this.innerModel().gatewayCustomBgpIpAddresses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean useLocalAzureIpAddress() {
        return this.innerModel().useLocalAzureIpAddress();
    }

    public Boolean usePolicyBasedTrafficSelectors() {
        return this.innerModel().usePolicyBasedTrafficSelectors();
    }

    public List<IpsecPolicy> ipsecPolicies() {
        List<IpsecPolicy> inner = this.innerModel().ipsecPolicies();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<TrafficSelectorPolicy> trafficSelectorPolicies() {
        List<TrafficSelectorPolicy> inner = this.innerModel().trafficSelectorPolicies();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceGuid() {
        return this.innerModel().resourceGuid();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Boolean expressRouteGatewayBypass() {
        return this.innerModel().expressRouteGatewayBypass();
    }

    public Boolean enablePrivateLinkFastPath() {
        return this.innerModel().enablePrivateLinkFastPath();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public VirtualNetworkGatewayConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String virtualNetworkGatewayConnectionName;

    private TagsObject updateParameters;

    public VirtualNetworkGatewayConnectionImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public VirtualNetworkGatewayConnection create() {
        this.innerObject = serviceManager.serviceClient().getVirtualNetworkGatewayConnections()
            .createOrUpdate(resourceGroupName, virtualNetworkGatewayConnectionName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualNetworkGatewayConnection create(Context context) {
        this.innerObject = serviceManager.serviceClient().getVirtualNetworkGatewayConnections()
            .createOrUpdate(resourceGroupName, virtualNetworkGatewayConnectionName, this.innerModel(), context);
        return this;
    }

    VirtualNetworkGatewayConnectionImpl(String name,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new VirtualNetworkGatewayConnectionInner();
        this.serviceManager = serviceManager;
        this.virtualNetworkGatewayConnectionName = name;
    }

    public VirtualNetworkGatewayConnectionImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public VirtualNetworkGatewayConnection apply() {
        this.innerObject = serviceManager.serviceClient().getVirtualNetworkGatewayConnections()
            .updateTags(resourceGroupName, virtualNetworkGatewayConnectionName, updateParameters, Context.NONE);
        return this;
    }

    public VirtualNetworkGatewayConnection apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getVirtualNetworkGatewayConnections()
            .updateTags(resourceGroupName, virtualNetworkGatewayConnectionName, updateParameters, context);
        return this;
    }

    VirtualNetworkGatewayConnectionImpl(VirtualNetworkGatewayConnectionInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.virtualNetworkGatewayConnectionName = Utils.getValueFromIdByName(innerObject.id(), "connections");
    }

    public VirtualNetworkGatewayConnection refresh() {
        this.innerObject = serviceManager.serviceClient().getVirtualNetworkGatewayConnections()
            .getByResourceGroupWithResponse(resourceGroupName, virtualNetworkGatewayConnectionName, Context.NONE)
            .getValue();
        return this;
    }

    public VirtualNetworkGatewayConnection refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getVirtualNetworkGatewayConnections()
            .getByResourceGroupWithResponse(resourceGroupName, virtualNetworkGatewayConnectionName, context).getValue();
        return this;
    }

    public String startPacketCapture() {
        return serviceManager.virtualNetworkGatewayConnections().startPacketCapture(resourceGroupName,
            virtualNetworkGatewayConnectionName);
    }

    public String startPacketCapture(VpnPacketCaptureStartParameters parameters, Context context) {
        return serviceManager.virtualNetworkGatewayConnections().startPacketCapture(resourceGroupName,
            virtualNetworkGatewayConnectionName, parameters, context);
    }

    public String stopPacketCapture(VpnPacketCaptureStopParameters parameters) {
        return serviceManager.virtualNetworkGatewayConnections().stopPacketCapture(resourceGroupName,
            virtualNetworkGatewayConnectionName, parameters);
    }

    public String stopPacketCapture(VpnPacketCaptureStopParameters parameters, Context context) {
        return serviceManager.virtualNetworkGatewayConnections().stopPacketCapture(resourceGroupName,
            virtualNetworkGatewayConnectionName, parameters, context);
    }

    public String getIkeSas() {
        return serviceManager.virtualNetworkGatewayConnections().getIkeSas(resourceGroupName,
            virtualNetworkGatewayConnectionName);
    }

    public String getIkeSas(Context context) {
        return serviceManager.virtualNetworkGatewayConnections().getIkeSas(resourceGroupName,
            virtualNetworkGatewayConnectionName, context);
    }

    public void resetConnection() {
        serviceManager.virtualNetworkGatewayConnections().resetConnection(resourceGroupName,
            virtualNetworkGatewayConnectionName);
    }

    public void resetConnection(Context context) {
        serviceManager.virtualNetworkGatewayConnections().resetConnection(resourceGroupName,
            virtualNetworkGatewayConnectionName, context);
    }

    public VirtualNetworkGatewayConnectionImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl
        withVirtualNetworkGateway1(VirtualNetworkGatewayInner virtualNetworkGateway1) {
        this.innerModel().withVirtualNetworkGateway1(virtualNetworkGateway1);
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl withConnectionType(VirtualNetworkGatewayConnectionType connectionType) {
        this.innerModel().withConnectionType(connectionType);
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public VirtualNetworkGatewayConnectionImpl withAuthorizationKey(String authorizationKey) {
        this.innerModel().withAuthorizationKey(authorizationKey);
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl
        withVirtualNetworkGateway2(VirtualNetworkGatewayInner virtualNetworkGateway2) {
        this.innerModel().withVirtualNetworkGateway2(virtualNetworkGateway2);
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl withLocalNetworkGateway2(LocalNetworkGatewayInner localNetworkGateway2) {
        this.innerModel().withLocalNetworkGateway2(localNetworkGateway2);
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl withIngressNatRules(List<SubResource> ingressNatRules) {
        this.innerModel().withIngressNatRules(ingressNatRules);
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl withEgressNatRules(List<SubResource> egressNatRules) {
        this.innerModel().withEgressNatRules(egressNatRules);
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl
        withConnectionProtocol(VirtualNetworkGatewayConnectionProtocol connectionProtocol) {
        this.innerModel().withConnectionProtocol(connectionProtocol);
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl withRoutingWeight(Integer routingWeight) {
        this.innerModel().withRoutingWeight(routingWeight);
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl withDpdTimeoutSeconds(Integer dpdTimeoutSeconds) {
        this.innerModel().withDpdTimeoutSeconds(dpdTimeoutSeconds);
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl withConnectionMode(VirtualNetworkGatewayConnectionMode connectionMode) {
        this.innerModel().withConnectionMode(connectionMode);
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl withSharedKey(String sharedKey) {
        this.innerModel().withSharedKey(sharedKey);
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl withPeer(SubResource peer) {
        this.innerModel().withPeer(peer);
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl withEnableBgp(Boolean enableBgp) {
        this.innerModel().withEnableBgp(enableBgp);
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl
        withGatewayCustomBgpIpAddresses(List<GatewayCustomBgpIpAddressIpConfiguration> gatewayCustomBgpIpAddresses) {
        this.innerModel().withGatewayCustomBgpIpAddresses(gatewayCustomBgpIpAddresses);
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl withUseLocalAzureIpAddress(Boolean useLocalAzureIpAddress) {
        this.innerModel().withUseLocalAzureIpAddress(useLocalAzureIpAddress);
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl
        withUsePolicyBasedTrafficSelectors(Boolean usePolicyBasedTrafficSelectors) {
        this.innerModel().withUsePolicyBasedTrafficSelectors(usePolicyBasedTrafficSelectors);
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl withIpsecPolicies(List<IpsecPolicy> ipsecPolicies) {
        this.innerModel().withIpsecPolicies(ipsecPolicies);
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl
        withTrafficSelectorPolicies(List<TrafficSelectorPolicy> trafficSelectorPolicies) {
        this.innerModel().withTrafficSelectorPolicies(trafficSelectorPolicies);
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl withExpressRouteGatewayBypass(Boolean expressRouteGatewayBypass) {
        this.innerModel().withExpressRouteGatewayBypass(expressRouteGatewayBypass);
        return this;
    }

    public VirtualNetworkGatewayConnectionImpl withEnablePrivateLinkFastPath(Boolean enablePrivateLinkFastPath) {
        this.innerModel().withEnablePrivateLinkFastPath(enablePrivateLinkFastPath);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
