/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.consumption.v2018_03_31.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.consumption.v2018_03_31.GetBalancesByBillingAccounts;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.consumption.v2018_03_31.Balance;

class GetBalancesByBillingAccountsImpl extends WrapperImpl<GetBalancesByBillingAccountsInner> implements GetBalancesByBillingAccounts {
    private final ConsumptionManager manager;

    GetBalancesByBillingAccountsImpl(ConsumptionManager manager) {
        super(manager.inner().getBalancesByBillingAccounts());
        this.manager = manager;
    }

    public ConsumptionManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Balance> byBillingPeriodAsync(String billingAccountId, String billingPeriodName) {
        GetBalancesByBillingAccountsInner client = this.inner();
        return client.byBillingPeriodAsync(billingAccountId, billingPeriodName)
        .map(new Func1<BalanceInner, Balance>() {
            @Override
            public Balance call(BalanceInner inner) {
                return new BalanceImpl(inner, manager());
            }
        });
    }

}
