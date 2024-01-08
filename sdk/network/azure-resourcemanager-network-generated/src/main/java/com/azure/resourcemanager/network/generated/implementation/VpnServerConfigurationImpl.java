// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.P2SVpnGatewayInner;
import com.azure.resourcemanager.network.generated.fluent.models.VpnServerConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.VpnServerConfigurationPolicyGroupInner;
import com.azure.resourcemanager.network.generated.models.AadAuthenticationParameters;
import com.azure.resourcemanager.network.generated.models.IpsecPolicy;
import com.azure.resourcemanager.network.generated.models.P2SVpnGateway;
import com.azure.resourcemanager.network.generated.models.RadiusServer;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import com.azure.resourcemanager.network.generated.models.VpnAuthenticationType;
import com.azure.resourcemanager.network.generated.models.VpnGatewayTunnelingProtocol;
import com.azure.resourcemanager.network.generated.models.VpnServerConfigRadiusClientRootCertificate;
import com.azure.resourcemanager.network.generated.models.VpnServerConfigRadiusServerRootCertificate;
import com.azure.resourcemanager.network.generated.models.VpnServerConfigVpnClientRevokedCertificate;
import com.azure.resourcemanager.network.generated.models.VpnServerConfigVpnClientRootCertificate;
import com.azure.resourcemanager.network.generated.models.VpnServerConfiguration;
import com.azure.resourcemanager.network.generated.models.VpnServerConfigurationPolicyGroup;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class VpnServerConfigurationImpl
    implements VpnServerConfiguration, VpnServerConfiguration.Definition, VpnServerConfiguration.Update {
    private VpnServerConfigurationInner innerObject;

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

    public String namePropertiesName() {
        return this.innerModel().namePropertiesName();
    }

    public List<VpnGatewayTunnelingProtocol> vpnProtocols() {
        List<VpnGatewayTunnelingProtocol> inner = this.innerModel().vpnProtocols();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<VpnAuthenticationType> vpnAuthenticationTypes() {
        List<VpnAuthenticationType> inner = this.innerModel().vpnAuthenticationTypes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<VpnServerConfigVpnClientRootCertificate> vpnClientRootCertificates() {
        List<VpnServerConfigVpnClientRootCertificate> inner = this.innerModel().vpnClientRootCertificates();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<VpnServerConfigVpnClientRevokedCertificate> vpnClientRevokedCertificates() {
        List<VpnServerConfigVpnClientRevokedCertificate> inner = this.innerModel().vpnClientRevokedCertificates();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<VpnServerConfigRadiusServerRootCertificate> radiusServerRootCertificates() {
        List<VpnServerConfigRadiusServerRootCertificate> inner = this.innerModel().radiusServerRootCertificates();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<VpnServerConfigRadiusClientRootCertificate> radiusClientRootCertificates() {
        List<VpnServerConfigRadiusClientRootCertificate> inner = this.innerModel().radiusClientRootCertificates();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<IpsecPolicy> vpnClientIpsecPolicies() {
        List<IpsecPolicy> inner = this.innerModel().vpnClientIpsecPolicies();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String radiusServerAddress() {
        return this.innerModel().radiusServerAddress();
    }

    public String radiusServerSecret() {
        return this.innerModel().radiusServerSecret();
    }

    public List<RadiusServer> radiusServers() {
        List<RadiusServer> inner = this.innerModel().radiusServers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public AadAuthenticationParameters aadAuthenticationParameters() {
        return this.innerModel().aadAuthenticationParameters();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<P2SVpnGateway> p2SVpnGateways() {
        List<P2SVpnGatewayInner> inner = this.innerModel().p2SVpnGateways();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new P2SVpnGatewayImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<VpnServerConfigurationPolicyGroup> configurationPolicyGroups() {
        List<VpnServerConfigurationPolicyGroupInner> inner = this.innerModel().configurationPolicyGroups();
        if (inner != null) {
            return Collections.unmodifiableList(
                inner.stream().map(inner1 -> new VpnServerConfigurationPolicyGroupImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String etagPropertiesEtag() {
        return this.innerModel().etagPropertiesEtag();
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

    public VpnServerConfigurationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String vpnServerConfigurationName;

    private TagsObject updateVpnServerConfigurationParameters;

    public VpnServerConfigurationImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public VpnServerConfiguration create() {
        this.innerObject = serviceManager.serviceClient().getVpnServerConfigurations().createOrUpdate(resourceGroupName,
            vpnServerConfigurationName, this.innerModel(), Context.NONE);
        return this;
    }

    public VpnServerConfiguration create(Context context) {
        this.innerObject = serviceManager.serviceClient().getVpnServerConfigurations().createOrUpdate(resourceGroupName,
            vpnServerConfigurationName, this.innerModel(), context);
        return this;
    }

    VpnServerConfigurationImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new VpnServerConfigurationInner();
        this.serviceManager = serviceManager;
        this.vpnServerConfigurationName = name;
    }

    public VpnServerConfigurationImpl update() {
        this.updateVpnServerConfigurationParameters = new TagsObject();
        return this;
    }

    public VpnServerConfiguration apply() {
        this.innerObject
            = serviceManager.serviceClient().getVpnServerConfigurations().updateTagsWithResponse(resourceGroupName,
                vpnServerConfigurationName, updateVpnServerConfigurationParameters, Context.NONE).getValue();
        return this;
    }

    public VpnServerConfiguration apply(Context context) {
        this.innerObject
            = serviceManager.serviceClient().getVpnServerConfigurations().updateTagsWithResponse(resourceGroupName,
                vpnServerConfigurationName, updateVpnServerConfigurationParameters, context).getValue();
        return this;
    }

    VpnServerConfigurationImpl(VpnServerConfigurationInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.vpnServerConfigurationName = Utils.getValueFromIdByName(innerObject.id(), "vpnServerConfigurations");
    }

    public VpnServerConfiguration refresh() {
        this.innerObject = serviceManager.serviceClient().getVpnServerConfigurations()
            .getByResourceGroupWithResponse(resourceGroupName, vpnServerConfigurationName, Context.NONE).getValue();
        return this;
    }

    public VpnServerConfiguration refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getVpnServerConfigurations()
            .getByResourceGroupWithResponse(resourceGroupName, vpnServerConfigurationName, context).getValue();
        return this;
    }

    public VpnServerConfigurationImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VpnServerConfigurationImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VpnServerConfigurationImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateVpnServerConfigurationParameters.withTags(tags);
            return this;
        }
    }

    public VpnServerConfigurationImpl withNamePropertiesName(String namePropertiesName) {
        this.innerModel().withNamePropertiesName(namePropertiesName);
        return this;
    }

    public VpnServerConfigurationImpl withVpnProtocols(List<VpnGatewayTunnelingProtocol> vpnProtocols) {
        this.innerModel().withVpnProtocols(vpnProtocols);
        return this;
    }

    public VpnServerConfigurationImpl withVpnAuthenticationTypes(List<VpnAuthenticationType> vpnAuthenticationTypes) {
        this.innerModel().withVpnAuthenticationTypes(vpnAuthenticationTypes);
        return this;
    }

    public VpnServerConfigurationImpl
        withVpnClientRootCertificates(List<VpnServerConfigVpnClientRootCertificate> vpnClientRootCertificates) {
        this.innerModel().withVpnClientRootCertificates(vpnClientRootCertificates);
        return this;
    }

    public VpnServerConfigurationImpl withVpnClientRevokedCertificates(
        List<VpnServerConfigVpnClientRevokedCertificate> vpnClientRevokedCertificates) {
        this.innerModel().withVpnClientRevokedCertificates(vpnClientRevokedCertificates);
        return this;
    }

    public VpnServerConfigurationImpl withRadiusServerRootCertificates(
        List<VpnServerConfigRadiusServerRootCertificate> radiusServerRootCertificates) {
        this.innerModel().withRadiusServerRootCertificates(radiusServerRootCertificates);
        return this;
    }

    public VpnServerConfigurationImpl withRadiusClientRootCertificates(
        List<VpnServerConfigRadiusClientRootCertificate> radiusClientRootCertificates) {
        this.innerModel().withRadiusClientRootCertificates(radiusClientRootCertificates);
        return this;
    }

    public VpnServerConfigurationImpl withVpnClientIpsecPolicies(List<IpsecPolicy> vpnClientIpsecPolicies) {
        this.innerModel().withVpnClientIpsecPolicies(vpnClientIpsecPolicies);
        return this;
    }

    public VpnServerConfigurationImpl withRadiusServerAddress(String radiusServerAddress) {
        this.innerModel().withRadiusServerAddress(radiusServerAddress);
        return this;
    }

    public VpnServerConfigurationImpl withRadiusServerSecret(String radiusServerSecret) {
        this.innerModel().withRadiusServerSecret(radiusServerSecret);
        return this;
    }

    public VpnServerConfigurationImpl withRadiusServers(List<RadiusServer> radiusServers) {
        this.innerModel().withRadiusServers(radiusServers);
        return this;
    }

    public VpnServerConfigurationImpl
        withAadAuthenticationParameters(AadAuthenticationParameters aadAuthenticationParameters) {
        this.innerModel().withAadAuthenticationParameters(aadAuthenticationParameters);
        return this;
    }

    public VpnServerConfigurationImpl
        withConfigurationPolicyGroups(List<VpnServerConfigurationPolicyGroupInner> configurationPolicyGroups) {
        this.innerModel().withConfigurationPolicyGroups(configurationPolicyGroups);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
