/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.resources.v2019_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resources.v2019_07_01.ResourceGroups;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.resources.v2019_07_01.ResourceGroupExportResult;
import com.microsoft.azure.management.resources.v2019_07_01.ExportTemplateRequest;
import com.microsoft.azure.management.resources.v2019_07_01.ResourceGroup;

class ResourceGroupsImpl extends WrapperImpl<ResourceGroupsInner> implements ResourceGroups {
    private final ResourcesManager manager;

    ResourceGroupsImpl(ResourcesManager manager) {
        super(manager.inner().resourceGroups());
        this.manager = manager;
    }

    public ResourcesManager manager() {
        return this.manager;
    }

    @Override
    public ResourceGroupImpl define(String name) {
        return wrapModel(name);
    }

    private ResourceGroupImpl wrapModel(ResourceGroupInner inner) {
        return  new ResourceGroupImpl(inner, manager());
    }

    private ResourceGroupImpl wrapModel(String name) {
        return new ResourceGroupImpl(name, this.manager());
    }

    @Override
    public Observable<Boolean> checkExistenceAsync(String resourceGroupName) {
        ResourceGroupsInner client = this.inner();
        return client.checkExistenceAsync(resourceGroupName)
    ;}

    @Override
    public Observable<ResourceGroupExportResult> exportTemplateAsync(String resourceGroupName, ExportTemplateRequest parameters) {
        ResourceGroupsInner client = this.inner();
        return client.exportTemplateAsync(resourceGroupName, parameters)
        .map(new Func1<ResourceGroupExportResultInner, ResourceGroupExportResult>() {
            @Override
            public ResourceGroupExportResult call(ResourceGroupExportResultInner inner) {
                return new ResourceGroupExportResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ResourceGroup> listAsync() {
        ResourceGroupsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ResourceGroupInner>, Iterable<ResourceGroupInner>>() {
            @Override
            public Iterable<ResourceGroupInner> call(Page<ResourceGroupInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ResourceGroupInner, ResourceGroup>() {
            @Override
            public ResourceGroup call(ResourceGroupInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ResourceGroup> getAsync(String resourceGroupName) {
        ResourceGroupsInner client = this.inner();
        return client.getAsync(resourceGroupName)
        .map(new Func1<ResourceGroupInner, ResourceGroup>() {
            @Override
            public ResourceGroup call(ResourceGroupInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName) {
        ResourceGroupsInner client = this.inner();
        return client.deleteAsync(resourceGroupName).toCompletable();
    }

}
