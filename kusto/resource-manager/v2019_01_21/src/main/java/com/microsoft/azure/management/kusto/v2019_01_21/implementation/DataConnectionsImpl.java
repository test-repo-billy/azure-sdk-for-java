/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.kusto.v2019_01_21.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.kusto.v2019_01_21.DataConnections;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.kusto.v2019_01_21.DataConnection;
import com.microsoft.azure.management.kusto.v2019_01_21.DataConnectionValidationListResult;
import com.microsoft.azure.management.kusto.v2019_01_21.CheckNameResult;
import com.microsoft.azure.management.kusto.v2019_01_21.DataConnectionValidation;

class DataConnectionsImpl extends WrapperImpl<DataConnectionsInner> implements DataConnections {
    private final KustoManager manager;

    DataConnectionsImpl(KustoManager manager) {
        super(manager.inner().dataConnections());
        this.manager = manager;
    }

    public KustoManager manager() {
        return this.manager;
    }

    @Override
    public DataConnectionImpl define(String name) {
        return wrapModel(name);
    }

    private DataConnectionImpl wrapModel(DataConnectionInner inner) {
        return  new DataConnectionImpl(inner, manager());
    }

    private DataConnectionImpl wrapModel(String name) {
        return new DataConnectionImpl(name, this.manager());
    }

    @Override
    public Observable<DataConnection> listByDatabaseAsync(String resourceGroupName, String clusterName, String databaseName) {
        DataConnectionsInner client = this.inner();
        return client.listByDatabaseAsync(resourceGroupName, clusterName, databaseName)
        .flatMap(new Func1<List<DataConnectionInner>, Observable<DataConnectionInner>>() {
            @Override
            public Observable<DataConnectionInner> call(List<DataConnectionInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<DataConnectionInner, DataConnection>() {
            @Override
            public DataConnection call(DataConnectionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<DataConnection> getAsync(String resourceGroupName, String clusterName, String databaseName, String dataConnectionName) {
        DataConnectionsInner client = this.inner();
        return client.getAsync(resourceGroupName, clusterName, databaseName, dataConnectionName)
        .map(new Func1<DataConnectionInner, DataConnection>() {
            @Override
            public DataConnection call(DataConnectionInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String clusterName, String databaseName, String dataConnectionName) {
        DataConnectionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, clusterName, databaseName, dataConnectionName).toCompletable();
    }

    @Override
    public Observable<DataConnectionValidationListResult> dataConnectionValidationMethodAsync(String resourceGroupName, String clusterName, String databaseName, DataConnectionValidation parameters) {
        DataConnectionsInner client = this.inner();
        return client.dataConnectionValidationMethodAsync(resourceGroupName, clusterName, databaseName, parameters)
        .map(new Func1<DataConnectionValidationListResultInner, DataConnectionValidationListResult>() {
            @Override
            public DataConnectionValidationListResult call(DataConnectionValidationListResultInner inner) {
                return new DataConnectionValidationListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CheckNameResult> checkNameAvailabilityAsync(String resourceGroupName, String clusterName, String databaseName, String name) {
        DataConnectionsInner client = this.inner();
        return client.checkNameAvailabilityAsync(resourceGroupName, clusterName, databaseName, name)
        .map(new Func1<CheckNameResultInner, CheckNameResult>() {
            @Override
            public CheckNameResult call(CheckNameResultInner inner) {
                return new CheckNameResultImpl(inner, manager());
            }
        });
    }

}
