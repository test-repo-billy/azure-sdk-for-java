/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.storagecache.v2019_11_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storagecache.v2019_11_01.StorageTargets;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.storagecache.v2019_11_01.StorageTarget;

class StorageTargetsImpl extends WrapperImpl<StorageTargetsInner> implements StorageTargets {
    private final StorageCacheManager manager;

    StorageTargetsImpl(StorageCacheManager manager) {
        super(manager.inner().storageTargets());
        this.manager = manager;
    }

    public StorageCacheManager manager() {
        return this.manager;
    }

    @Override
    public StorageTargetImpl define(String name) {
        return wrapModel(name);
    }

    private StorageTargetImpl wrapModel(StorageTargetInner inner) {
        return  new StorageTargetImpl(inner, manager());
    }

    private StorageTargetImpl wrapModel(String name) {
        return new StorageTargetImpl(name, this.manager());
    }

    @Override
    public Observable<StorageTarget> listByCacheAsync(final String resourceGroupName, final String cacheName) {
        StorageTargetsInner client = this.inner();
        return client.listByCacheAsync(resourceGroupName, cacheName)
        .flatMapIterable(new Func1<Page<StorageTargetInner>, Iterable<StorageTargetInner>>() {
            @Override
            public Iterable<StorageTargetInner> call(Page<StorageTargetInner> page) {
                return page.items();
            }
        })
        .map(new Func1<StorageTargetInner, StorageTarget>() {
            @Override
            public StorageTarget call(StorageTargetInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<StorageTarget> getAsync(String resourceGroupName, String cacheName, String storageTargetName) {
        StorageTargetsInner client = this.inner();
        return client.getAsync(resourceGroupName, cacheName, storageTargetName)
        .map(new Func1<StorageTargetInner, StorageTarget>() {
            @Override
            public StorageTarget call(StorageTargetInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String cacheName, String storageTargetName) {
        StorageTargetsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, cacheName, storageTargetName).toCompletable();
    }

}
