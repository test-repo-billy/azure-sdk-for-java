/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.WorkItemConfigurations;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.WorkItemConfiguration;
import java.util.List;
import rx.Completable;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.WorkItemCreateConfiguration;

class WorkItemConfigurationsImpl extends WrapperImpl<WorkItemConfigurationsInner> implements WorkItemConfigurations {
    private final InsightsManager manager;

    WorkItemConfigurationsImpl(InsightsManager manager) {
        super(manager.inner().workItemConfigurations());
        this.manager = manager;
    }

    public InsightsManager manager() {
        return this.manager;
    }

    private WorkItemConfigurationImpl wrapWorkItemConfigurationModel(WorkItemConfigurationInner inner) {
        return  new WorkItemConfigurationImpl(inner, manager());
    }

    private Observable<WorkItemConfigurationInner> getWorkItemConfigurationInnerUsingWorkItemConfigurationsInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String resourceName = IdParsingUtils.getValueFromIdByName(id, "components");
        String workItemConfigId = IdParsingUtils.getValueFromIdByName(id, "WorkItemConfigs");
        WorkItemConfigurationsInner client = this.inner();
        return client.getItemAsync(resourceGroupName, resourceName, workItemConfigId);
    }

    @Override
    public Observable<WorkItemConfiguration> getItemAsync(String resourceGroupName, String resourceName, String workItemConfigId) {
        WorkItemConfigurationsInner client = this.inner();
        return client.getItemAsync(resourceGroupName, resourceName, workItemConfigId)
        .map(new Func1<WorkItemConfigurationInner, WorkItemConfiguration>() {
            @Override
            public WorkItemConfiguration call(WorkItemConfigurationInner inner) {
                return wrapWorkItemConfigurationModel(inner);
            }
       });
    }

    @Override
    public Observable<WorkItemConfiguration> listAsync(String resourceGroupName, String resourceName) {
        WorkItemConfigurationsInner client = this.inner();
        return client.listAsync(resourceGroupName, resourceName)
        .flatMap(new Func1<List<WorkItemConfigurationInner>, Observable<WorkItemConfigurationInner>>() {
            @Override
            public Observable<WorkItemConfigurationInner> call(List<WorkItemConfigurationInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<WorkItemConfigurationInner, WorkItemConfiguration>() {
            @Override
            public WorkItemConfiguration call(WorkItemConfigurationInner inner) {
                return wrapWorkItemConfigurationModel(inner);
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String resourceName, String workItemConfigId) {
        WorkItemConfigurationsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, resourceName, workItemConfigId).toCompletable();
    }

    @Override
    public Observable<WorkItemConfiguration> updateItemAsync(String resourceGroupName, String resourceName, String workItemConfigId, WorkItemCreateConfiguration workItemConfigurationProperties) {
        WorkItemConfigurationsInner client = this.inner();
        return client.updateItemAsync(resourceGroupName, resourceName, workItemConfigId, workItemConfigurationProperties)
        .map(new Func1<WorkItemConfigurationInner, WorkItemConfiguration>() {
            @Override
            public WorkItemConfiguration call(WorkItemConfigurationInner inner) {
                return new WorkItemConfigurationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<WorkItemConfiguration> createAsync(String resourceGroupName, String resourceName, WorkItemCreateConfiguration workItemConfigurationProperties) {
        WorkItemConfigurationsInner client = this.inner();
        return client.createAsync(resourceGroupName, resourceName, workItemConfigurationProperties)
        .map(new Func1<WorkItemConfigurationInner, WorkItemConfiguration>() {
            @Override
            public WorkItemConfiguration call(WorkItemConfigurationInner inner) {
                return new WorkItemConfigurationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<WorkItemConfiguration> getDefaultAsync(String resourceGroupName, String resourceName) {
        WorkItemConfigurationsInner client = this.inner();
        return client.getDefaultAsync(resourceGroupName, resourceName)
        .map(new Func1<WorkItemConfigurationInner, WorkItemConfiguration>() {
            @Override
            public WorkItemConfiguration call(WorkItemConfigurationInner inner) {
                return new WorkItemConfigurationImpl(inner, manager());
            }
        });
    }

}
