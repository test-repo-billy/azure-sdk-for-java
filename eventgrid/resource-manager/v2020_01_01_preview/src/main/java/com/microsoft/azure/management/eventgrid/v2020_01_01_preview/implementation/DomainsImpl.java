/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.eventgrid.v2020_01_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.eventgrid.v2020_01_01_preview.Domains;
import com.microsoft.azure.management.eventgrid.v2020_01_01_preview.Domain;
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
import com.microsoft.azure.management.eventgrid.v2020_01_01_preview.DomainSharedAccessKeys;

class DomainsImpl extends GroupableResourcesCoreImpl<Domain, DomainImpl, DomainInner, DomainsInner, EventGridManager>  implements Domains {
    protected DomainsImpl(EventGridManager manager) {
        super(manager.inner().domains(), manager);
    }

    @Override
    protected Observable<DomainInner> getInnerAsync(String resourceGroupName, String name) {
        DomainsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        DomainsInner client = this.inner();
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
    public PagedList<Domain> listByResourceGroup(String resourceGroupName) {
        DomainsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<Domain> listByResourceGroupAsync(String resourceGroupName) {
        DomainsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<DomainInner>, Iterable<DomainInner>>() {
            @Override
            public Iterable<DomainInner> call(Page<DomainInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DomainInner, Domain>() {
            @Override
            public Domain call(DomainInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<Domain> list() {
        DomainsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<Domain> listAsync() {
        DomainsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<DomainInner>, Iterable<DomainInner>>() {
            @Override
            public Iterable<DomainInner> call(Page<DomainInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DomainInner, Domain>() {
            @Override
            public Domain call(DomainInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public DomainImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<DomainSharedAccessKeys> listSharedAccessKeysAsync(String resourceGroupName, String domainName) {
        DomainsInner client = this.inner();
        return client.listSharedAccessKeysAsync(resourceGroupName, domainName)
        .map(new Func1<DomainSharedAccessKeysInner, DomainSharedAccessKeys>() {
            @Override
            public DomainSharedAccessKeys call(DomainSharedAccessKeysInner inner) {
                return new DomainSharedAccessKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DomainSharedAccessKeys> regenerateKeyAsync(String resourceGroupName, String domainName, String keyName) {
        DomainsInner client = this.inner();
        return client.regenerateKeyAsync(resourceGroupName, domainName, keyName)
        .map(new Func1<DomainSharedAccessKeysInner, DomainSharedAccessKeys>() {
            @Override
            public DomainSharedAccessKeys call(DomainSharedAccessKeysInner inner) {
                return new DomainSharedAccessKeysImpl(inner, manager());
            }
        });
    }

    @Override
    protected DomainImpl wrapModel(DomainInner inner) {
        return  new DomainImpl(inner.name(), inner, manager());
    }

    @Override
    protected DomainImpl wrapModel(String name) {
        return new DomainImpl(name, new DomainInner(), this.manager());
    }

}
