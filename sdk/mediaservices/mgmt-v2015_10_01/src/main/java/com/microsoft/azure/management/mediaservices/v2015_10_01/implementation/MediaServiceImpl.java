/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2015_10_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.mediaservices.v2015_10_01.MediaService;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2015_10_01.ApiEndpoint;
import com.microsoft.azure.management.mediaservices.v2015_10_01.StorageAccount;

class MediaServiceImpl extends GroupableResourceCoreImpl<MediaService, MediaServiceInner, MediaServiceImpl, MediaManager> implements MediaService, MediaService.Definition, MediaService.Update {
    MediaServiceImpl(String name, MediaServiceInner inner, MediaManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<MediaService> createResourceAsync() {
        MediaServicesInner client = this.manager().inner().mediaServices();
        return client.createAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<MediaService> updateResourceAsync() {
        MediaServicesInner client = this.manager().inner().mediaServices();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<MediaServiceInner> getInnerAsync() {
        MediaServicesInner client = this.manager().inner().mediaServices();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<ApiEndpoint> apiEndpoints() {
        return this.inner().apiEndpoints();
    }

    @Override
    public List<StorageAccount> storageAccounts() {
        return this.inner().storageAccounts();
    }

    @Override
    public MediaServiceImpl withStorageAccounts(List<StorageAccount> storageAccounts) {
        this.inner().withStorageAccounts(storageAccounts);
        return this;
    }

}
