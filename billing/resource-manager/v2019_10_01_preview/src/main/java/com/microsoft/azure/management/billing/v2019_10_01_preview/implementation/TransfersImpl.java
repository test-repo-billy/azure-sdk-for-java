/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2019_10_01_preview.Transfers;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.billing.v2019_10_01_preview.InvoiceSectionBillingProfileBillingAccountTransferDetails;
import com.microsoft.azure.management.billing.v2019_10_01_preview.InitiateTransferRequest;

class TransfersImpl extends WrapperImpl<TransfersInner> implements Transfers {
    private final BillingManager manager;

    TransfersImpl(BillingManager manager) {
        super(manager.inner().transfers());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    private InvoiceSectionBillingProfileBillingAccountTransferDetailsImpl wrapModel(TransferDetailsInner inner) {
        return  new InvoiceSectionBillingProfileBillingAccountTransferDetailsImpl(inner, manager());
    }

    @Override
    public Observable<InvoiceSectionBillingProfileBillingAccountTransferDetails> listAsync(final String billingAccountName, final String billingProfileName, final String invoiceSectionName) {
        TransfersInner client = this.inner();
        return client.listAsync(billingAccountName, billingProfileName, invoiceSectionName)
        .flatMapIterable(new Func1<Page<TransferDetailsInner>, Iterable<TransferDetailsInner>>() {
            @Override
            public Iterable<TransferDetailsInner> call(Page<TransferDetailsInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TransferDetailsInner, InvoiceSectionBillingProfileBillingAccountTransferDetails>() {
            @Override
            public InvoiceSectionBillingProfileBillingAccountTransferDetails call(TransferDetailsInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<InvoiceSectionBillingProfileBillingAccountTransferDetails> getAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String transferName) {
        TransfersInner client = this.inner();
        return client.getAsync(billingAccountName, billingProfileName, invoiceSectionName, transferName)
        .map(new Func1<TransferDetailsInner, InvoiceSectionBillingProfileBillingAccountTransferDetails>() {
            @Override
            public InvoiceSectionBillingProfileBillingAccountTransferDetails call(TransferDetailsInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable cancelAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String transferName) {
        TransfersInner client = this.inner();
        return client.cancelAsync(billingAccountName, billingProfileName, invoiceSectionName, transferName).toCompletable();
    }

    @Override
    public Observable<InvoiceSectionBillingProfileBillingAccountTransferDetails> initiateAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, InitiateTransferRequest parameters) {
        TransfersInner client = this.inner();
        return client.initiateAsync(billingAccountName, billingProfileName, invoiceSectionName, parameters)
        .map(new Func1<TransferDetailsInner, InvoiceSectionBillingProfileBillingAccountTransferDetails>() {
            @Override
            public InvoiceSectionBillingProfileBillingAccountTransferDetails call(TransferDetailsInner inner) {
                return new InvoiceSectionBillingProfileBillingAccountTransferDetailsImpl(inner, manager());
            }
        });
    }

}
