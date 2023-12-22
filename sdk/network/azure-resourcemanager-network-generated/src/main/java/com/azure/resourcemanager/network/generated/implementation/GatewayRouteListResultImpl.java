// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.GatewayRouteListResultInner;
import com.azure.resourcemanager.network.generated.models.GatewayRoute;
import com.azure.resourcemanager.network.generated.models.GatewayRouteListResult;
import java.util.Collections;
import java.util.List;

public final class GatewayRouteListResultImpl implements GatewayRouteListResult {
    private GatewayRouteListResultInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    GatewayRouteListResultImpl(GatewayRouteListResultInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<GatewayRoute> value() {
        List<GatewayRoute> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public GatewayRouteListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
