/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2018_11_01_preview.InvoiceSections;
import rx.Observable;
import rx.functions.Func1;
import rx.Completable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.billing.v2018_11_01_preview.InvoiceSectionListResult;
import com.microsoft.azure.management.billing.v2018_11_01_preview.InvoiceSection;
import com.microsoft.azure.management.billing.v2018_11_01_preview.InvoiceSectionCreationRequest;

class InvoiceSectionsImpl extends WrapperImpl<InvoiceSectionsInner> implements InvoiceSections {
    private final BillingManager manager;

    InvoiceSectionsImpl(BillingManager manager) {
        super(manager.inner().invoiceSections());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    private InvoiceSectionImpl wrapModel(InvoiceSectionInner inner) {
        return  new InvoiceSectionImpl(inner, manager());
    }

    @Override
    public Observable<InvoiceSectionListResult> listByBillingAccountNameAsync(String billingAccountName) {
        InvoiceSectionsInner client = this.inner();
        return client.listByBillingAccountNameAsync(billingAccountName)
        .map(new Func1<InvoiceSectionListResultInner, InvoiceSectionListResult>() {
            @Override
            public InvoiceSectionListResult call(InvoiceSectionListResultInner inner) {
                return new InvoiceSectionListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<InvoiceSection> listByBillingProfileNameAsync(final String billingAccountName, final String billingProfileName) {
        InvoiceSectionsInner client = this.inner();
        return client.listByBillingProfileNameAsync(billingAccountName, billingProfileName)
        .flatMapIterable(new Func1<Page<InvoiceSectionInner>, Iterable<InvoiceSectionInner>>() {
            @Override
            public Iterable<InvoiceSectionInner> call(Page<InvoiceSectionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<InvoiceSectionInner, InvoiceSection>() {
            @Override
            public InvoiceSection call(InvoiceSectionInner inner) {
                return new InvoiceSectionImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable elevateToBillingProfileAsync(String billingAccountName, String invoiceSectionName) {
        InvoiceSectionsInner client = this.inner();
        return client.elevateToBillingProfileAsync(billingAccountName, invoiceSectionName).toCompletable();
    }

    @Override
    public Observable<InvoiceSection> getAsync(String billingAccountName, String invoiceSectionName) {
        InvoiceSectionsInner client = this.inner();
        return client.getAsync(billingAccountName, invoiceSectionName)
        .map(new Func1<InvoiceSectionInner, InvoiceSection>() {
            @Override
            public InvoiceSection call(InvoiceSectionInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Observable<InvoiceSection> createAsync(String billingAccountName, InvoiceSectionCreationRequest parameters) {
        InvoiceSectionsInner client = this.inner();
        return client.createAsync(billingAccountName, parameters)
        .map(new Func1<InvoiceSectionInner, InvoiceSection>() {
            @Override
            public InvoiceSection call(InvoiceSectionInner inner) {
                return new InvoiceSectionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<InvoiceSection> listByCreateSubscriptionPermissionAsync(final String billingAccountName) {
        InvoiceSectionsInner client = this.inner();
        return client.listByCreateSubscriptionPermissionAsync(billingAccountName)
        .flatMapIterable(new Func1<Page<InvoiceSectionInner>, Iterable<InvoiceSectionInner>>() {
            @Override
            public Iterable<InvoiceSectionInner> call(Page<InvoiceSectionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<InvoiceSectionInner, InvoiceSection>() {
            @Override
            public InvoiceSection call(InvoiceSectionInner inner) {
                return new InvoiceSectionImpl(inner, manager());
            }
        });
    }

}
