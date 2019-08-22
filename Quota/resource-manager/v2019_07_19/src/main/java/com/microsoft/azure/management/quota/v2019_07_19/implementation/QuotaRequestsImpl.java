/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.quota.v2019_07_19.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.quota.v2019_07_19.QuotaRequests;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.quota.v2019_07_19.LocationProviderQuotaRequestDetails;
import com.microsoft.azure.management.quota.v2019_07_19.QuotaLimits;

class QuotaRequestsImpl extends WrapperImpl<QuotaRequestsInner> implements QuotaRequests {
    private final CapacityManager manager;

    QuotaRequestsImpl(CapacityManager manager) {
        super(manager.inner().quotaRequests());
        this.manager = manager;
    }

    public CapacityManager manager() {
        return this.manager;
    }

    private LocationProviderQuotaRequestDetailsImpl wrapModel(QuotaRequestDetailsInner inner) {
        return  new LocationProviderQuotaRequestDetailsImpl(inner, manager());
    }

    @Override
    public Observable<LocationProviderQuotaRequestDetails> listStatusAsync(final String providerId, final String location) {
        QuotaRequestsInner client = this.inner();
        return client.listStatusAsync(providerId, location)
        .flatMapIterable(new Func1<Page<QuotaRequestDetailsInner>, Iterable<QuotaRequestDetailsInner>>() {
            @Override
            public Iterable<QuotaRequestDetailsInner> call(Page<QuotaRequestDetailsInner> page) {
                return page.items();
            }
        })
        .map(new Func1<QuotaRequestDetailsInner, LocationProviderQuotaRequestDetails>() {
            @Override
            public LocationProviderQuotaRequestDetails call(QuotaRequestDetailsInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Object> createAsync(String providerId, String location, QuotaLimits createQuotaRequests) {
        QuotaRequestsInner client = this.inner();
        return client.createAsync(providerId, location, createQuotaRequests)
    ;}

}
