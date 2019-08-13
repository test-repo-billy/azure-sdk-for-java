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
import com.microsoft.azure.management.billing.v2019_10_01_preview.PartnerTransfersTransfers;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.billing.v2019_10_01_preview.CustomerBillingAccountTransferDetailsModel;

class PartnerTransfersTransfersImpl extends WrapperImpl<PartnerTransfersTransfersInner> implements PartnerTransfersTransfers {
    private final BillingManager manager;

    PartnerTransfersTransfersImpl(BillingManager manager) {
        super(manager.inner().partnerTransfersTransfers());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    private CustomerBillingAccountTransferDetailsModelImpl wrapModel(TransferDetailsInner inner) {
        return  new CustomerBillingAccountTransferDetailsModelImpl(inner, manager());
    }

    @Override
    public Observable<CustomerBillingAccountTransferDetailsModel> listAsync(final String billingAccountName, final String customerName) {
        PartnerTransfersTransfersInner client = this.inner();
        return client.listAsync(billingAccountName, customerName)
        .flatMapIterable(new Func1<Page<TransferDetailsInner>, Iterable<TransferDetailsInner>>() {
            @Override
            public Iterable<TransferDetailsInner> call(Page<TransferDetailsInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TransferDetailsInner, CustomerBillingAccountTransferDetailsModel>() {
            @Override
            public CustomerBillingAccountTransferDetailsModel call(TransferDetailsInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
