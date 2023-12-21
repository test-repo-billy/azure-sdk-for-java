/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2019_06_01.ExpressRouteGateway;
import rx.Observable;
import com.microsoft.azure.management.network.v2019_06_01.ExpressRouteGatewayPropertiesAutoScaleConfiguration;
import java.util.List;
import com.microsoft.azure.management.network.v2019_06_01.ProvisioningState;
import com.microsoft.azure.management.network.v2019_06_01.VirtualHubId;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2019_06_01.ExpressRouteConnection;

class ExpressRouteGatewayImpl extends GroupableResourceCoreImpl<ExpressRouteGateway, ExpressRouteGatewayInner, ExpressRouteGatewayImpl, NetworkManager> implements ExpressRouteGateway, ExpressRouteGateway.Definition, ExpressRouteGateway.Update {
    ExpressRouteGatewayImpl(String name, ExpressRouteGatewayInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<ExpressRouteGateway> createResourceAsync() {
        ExpressRouteGatewaysInner client = this.manager().inner().expressRouteGateways();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ExpressRouteGateway> updateResourceAsync() {
        ExpressRouteGatewaysInner client = this.manager().inner().expressRouteGateways();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ExpressRouteGatewayInner> getInnerAsync() {
        ExpressRouteGatewaysInner client = this.manager().inner().expressRouteGateways();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public ExpressRouteGatewayPropertiesAutoScaleConfiguration autoScaleConfiguration() {
        return this.inner().autoScaleConfiguration();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public List<ExpressRouteConnection> expressRouteConnections() {
        List<ExpressRouteConnection> lst = new ArrayList<ExpressRouteConnection>();
        if (this.inner().expressRouteConnections() != null) {
            for (ExpressRouteConnectionInner inner : this.inner().expressRouteConnections()) {
                lst.add( new ExpressRouteConnectionImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public VirtualHubId virtualHub() {
        return this.inner().virtualHub();
    }

    @Override
    public ExpressRouteGatewayImpl withVirtualHub(VirtualHubId virtualHub) {
        this.inner().withVirtualHub(virtualHub);
        return this;
    }

    @Override
    public ExpressRouteGatewayImpl withAutoScaleConfiguration(ExpressRouteGatewayPropertiesAutoScaleConfiguration autoScaleConfiguration) {
        this.inner().withAutoScaleConfiguration(autoScaleConfiguration);
        return this;
    }

    @Override
    public ExpressRouteGatewayImpl withProvisioningState(ProvisioningState provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

}
