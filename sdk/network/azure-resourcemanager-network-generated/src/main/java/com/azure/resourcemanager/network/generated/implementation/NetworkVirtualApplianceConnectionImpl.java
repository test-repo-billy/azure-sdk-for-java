// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.NetworkVirtualApplianceConnectionInner;
import com.azure.resourcemanager.network.generated.models.NetworkVirtualApplianceConnection;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.RoutingConfiguration;
import java.util.Collections;
import java.util.List;

public final class NetworkVirtualApplianceConnectionImpl implements NetworkVirtualApplianceConnection {
    private NetworkVirtualApplianceConnectionInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    NetworkVirtualApplianceConnectionImpl(NetworkVirtualApplianceConnectionInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String namePropertiesName() {
        return this.innerModel().namePropertiesName();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Long asn() {
        return this.innerModel().asn();
    }

    public Long tunnelIdentifier() {
        return this.innerModel().tunnelIdentifier();
    }

    public List<String> bgpPeerAddress() {
        List<String> inner = this.innerModel().bgpPeerAddress();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean enableInternetSecurity() {
        return this.innerModel().enableInternetSecurity();
    }

    public RoutingConfiguration routingConfiguration() {
        return this.innerModel().routingConfiguration();
    }

    public NetworkVirtualApplianceConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
