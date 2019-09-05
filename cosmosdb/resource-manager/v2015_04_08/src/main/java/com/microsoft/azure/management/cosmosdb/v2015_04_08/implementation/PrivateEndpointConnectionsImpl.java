/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.PrivateEndpointConnections;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.PrivateEndpointConnection;

class PrivateEndpointConnectionsImpl extends WrapperImpl<PrivateEndpointConnectionsInner> implements PrivateEndpointConnections {
    private final CosmosDBManager manager;

    PrivateEndpointConnectionsImpl(CosmosDBManager manager) {
        super(manager.inner().privateEndpointConnections());
        this.manager = manager;
    }

    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public PrivateEndpointConnectionImpl define(String name) {
        return wrapModel(name);
    }

    private PrivateEndpointConnectionImpl wrapModel(PrivateEndpointConnectionInner inner) {
        return  new PrivateEndpointConnectionImpl(inner, manager());
    }

    private PrivateEndpointConnectionImpl wrapModel(String name) {
        return new PrivateEndpointConnectionImpl(name, this.manager());
    }

    @Override
    public Observable<PrivateEndpointConnection> getAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        PrivateEndpointConnectionsInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, privateEndpointConnectionName)
        .map(new Func1<PrivateEndpointConnectionInner, PrivateEndpointConnection>() {
            @Override
            public PrivateEndpointConnection call(PrivateEndpointConnectionInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        PrivateEndpointConnectionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, privateEndpointConnectionName).toCompletable();
    }

}
