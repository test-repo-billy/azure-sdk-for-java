/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2017_03_01_preview.DataWarehouseUserActivities;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.sql.v2017_03_01_preview.DataWarehouseUserActivity;

class DataWarehouseUserActivitiesImpl extends WrapperImpl<DataWarehouseUserActivitiesInner> implements DataWarehouseUserActivities {
    private final SqlManager manager;

    DataWarehouseUserActivitiesImpl(SqlManager manager) {
        super(manager.inner().dataWarehouseUserActivities());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    private DataWarehouseUserActivityImpl wrapModel(DataWarehouseUserActivityInner inner) {
        return  new DataWarehouseUserActivityImpl(inner, manager());
    }

    @Override
    public Observable<DataWarehouseUserActivity> getAsync(String resourceGroupName, String serverName, String databaseName) {
        DataWarehouseUserActivitiesInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, databaseName)
        .flatMap(new Func1<DataWarehouseUserActivityInner, Observable<DataWarehouseUserActivity>>() {
            @Override
            public Observable<DataWarehouseUserActivity> call(DataWarehouseUserActivityInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((DataWarehouseUserActivity)wrapModel(inner));
                }
            }
       });
    }

}
