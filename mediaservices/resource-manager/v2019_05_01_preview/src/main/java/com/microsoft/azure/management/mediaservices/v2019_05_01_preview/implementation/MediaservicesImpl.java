/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.mediaservices.v2019_05_01_preview.Mediaservices;
import com.microsoft.azure.management.mediaservices.v2019_05_01_preview.MediaService;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.mediaservices.v2019_05_01_preview.SubscriptionMediaService;
import com.microsoft.azure.arm.utils.PagedListConverter;

class MediaservicesImpl extends GroupableResourcesCoreImpl<MediaService, MediaServiceImpl, MediaServiceInner, MediaservicesInner, MediaManager>  implements Mediaservices {
    protected MediaservicesImpl(MediaManager manager) {
        super(manager.inner().mediaservices(), manager);
    }

    @Override
    protected Observable<MediaServiceInner> getInnerAsync(String resourceGroupName, String name) {
        MediaservicesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        MediaservicesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<MediaService> listByResourceGroup(String resourceGroupName) {
        MediaservicesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<MediaService> listByResourceGroupAsync(String resourceGroupName) {
        MediaservicesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<MediaServiceInner>, Iterable<MediaServiceInner>>() {
            @Override
            public Iterable<MediaServiceInner> call(Page<MediaServiceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<MediaServiceInner, MediaService>() {
            @Override
            public MediaService call(MediaServiceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<MediaService> list() {
        MediaservicesInner client = this.inner();
        PagedListConverter<SubscriptionMediaServiceInner, MediaService> converter =
            new PagedListConverter<SubscriptionMediaServiceInner, MediaService>() {
            @Override
            public Observable<MediaService> typeConvertAsync(SubscriptionMediaServiceInner inner) {
                 return Observable.just(inner)
                        .flatMap(new Func1<SubscriptionMediaServiceInner, Observable<MediaServiceInner>>() {
                            @Override
                            public Observable<MediaServiceInner> call(SubscriptionMediaServiceInner inner) {
                                return getInnerAsync(ResourceUtilsCore.groupFromResourceId(inner.id()), ResourceUtilsCore.nameFromResourceId(inner.id()));
                            }
                        })
                        .map(new Func1<MediaServiceInner, MediaService>() {
                            @Override
                            public MediaService call(MediaServiceInner inner) {
                                return wrapModel(inner);
                            }
                        });
                }
            };
        return converter.convert(client.list());
    }

    @Override
    public Observable<MediaService> listAsync() {
        MediaservicesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<SubscriptionMediaServiceInner>, Iterable<SubscriptionMediaServiceInner>>() {
            @Override
            public Iterable<SubscriptionMediaServiceInner> call(Page<SubscriptionMediaServiceInner> page) {
                return page.items();
            }
        })
        .flatMap(new Func1<SubscriptionMediaServiceInner, Observable<MediaServiceInner>>() {
            @Override
            public Observable<MediaServiceInner> call(SubscriptionMediaServiceInner inner) {
                return getInnerAsync(ResourceUtilsCore.groupFromResourceId(inner.id()), ResourceUtilsCore.nameFromResourceId(inner.id()));
            }
        })
        .map(new Func1<MediaServiceInner, MediaService>() {
            @Override
            public MediaService call(MediaServiceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public MediaServiceImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Completable syncStorageKeysAsync(String resourceGroupName, String accountName) {
        MediaservicesInner client = this.inner();
        return client.syncStorageKeysAsync(resourceGroupName, accountName).toCompletable();
    }

    @Override
    public Observable<SubscriptionMediaService> getBySubscriptionAsync(String accountName) {
        MediaservicesInner client = this.inner();
        return client.getBySubscriptionAsync(accountName)
        .map(new Func1<SubscriptionMediaServiceInner, SubscriptionMediaService>() {
            @Override
            public SubscriptionMediaService call(SubscriptionMediaServiceInner inner) {
                return new SubscriptionMediaServiceImpl(inner, manager());
            }
        });
    }

    @Override
    protected MediaServiceImpl wrapModel(MediaServiceInner inner) {
        return  new MediaServiceImpl(inner.name(), inner, manager());
    }

    @Override
    protected MediaServiceImpl wrapModel(String name) {
        return new MediaServiceImpl(name, new MediaServiceInner(), this.manager());
    }

}
