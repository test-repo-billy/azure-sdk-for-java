/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.resourcehealth.v2018_08_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resourcehealth.v2018_08_01_preview.AvailabilityStatuses;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.resourcehealth.v2018_08_01_preview.AvailabilityStatus;
import com.microsoft.azure.arm.utils.PagedListConverter;

class AvailabilityStatusesImpl extends WrapperImpl<AvailabilityStatusesInner> implements AvailabilityStatuses {
    private PagedListConverter<AvailabilityStatusInner, AvailabilityStatus> converter;
    private final ResourceHealthManager manager;

    AvailabilityStatusesImpl(ResourceHealthManager manager) {
        super(manager.inner().availabilityStatuses());
        this.manager = manager;
        this.converter = new PagedListConverter<AvailabilityStatusInner, AvailabilityStatus>() {
            @Override
            public Observable<AvailabilityStatus> typeConvertAsync(AvailabilityStatusInner inner) {
                return Observable.just((AvailabilityStatus) wrapModel(inner));
            }
        };
    }

    public ResourceHealthManager manager() {
        return this.manager;
    }

    private AvailabilityStatusImpl wrapModel(AvailabilityStatusInner inner) {
        return  new AvailabilityStatusImpl(inner, manager());
    }

    @Override
    public Observable<AvailabilityStatus> getByResourceAsync(String resourceUri) {
        AvailabilityStatusesInner client = this.inner();
        return client.getByResourceAsync(resourceUri)
        .map(new Func1<AvailabilityStatusInner, AvailabilityStatus>() {
            @Override
            public AvailabilityStatus call(AvailabilityStatusInner inner) {
                return new AvailabilityStatusImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AvailabilityStatus> list1Async(final String resourceUri) {
        AvailabilityStatusesInner client = this.inner();
        return client.list1Async(resourceUri)
        .flatMapIterable(new Func1<Page<AvailabilityStatusInner>, Iterable<AvailabilityStatusInner>>() {
            @Override
            public Iterable<AvailabilityStatusInner> call(Page<AvailabilityStatusInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AvailabilityStatusInner, AvailabilityStatus>() {
            @Override
            public AvailabilityStatus call(AvailabilityStatusInner inner) {
                return new AvailabilityStatusImpl(inner, manager());
            }
        });
    }

    @Override
    public PagedList<AvailabilityStatus> list() {
        AvailabilityStatusesInner client = this.inner();
        return converter.convert(client.list());
    }

    @Override
    public Observable<AvailabilityStatus> listAsync() {
        AvailabilityStatusesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<AvailabilityStatusInner>, Iterable<AvailabilityStatusInner>>() {
            @Override
            public Iterable<AvailabilityStatusInner> call(Page<AvailabilityStatusInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AvailabilityStatusInner, AvailabilityStatus>() {
            @Override
            public AvailabilityStatus call(AvailabilityStatusInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<AvailabilityStatus> listByResourceGroup(String resourceGroupName) {
        AvailabilityStatusesInner client = this.inner();
        return converter.convert(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<AvailabilityStatus> listByResourceGroupAsync(String resourceGroupName) {
        AvailabilityStatusesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<AvailabilityStatusInner>, Iterable<AvailabilityStatusInner>>() {
            @Override
            public Iterable<AvailabilityStatusInner> call(Page<AvailabilityStatusInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AvailabilityStatusInner, AvailabilityStatus>() {
            @Override
            public AvailabilityStatus call(AvailabilityStatusInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
