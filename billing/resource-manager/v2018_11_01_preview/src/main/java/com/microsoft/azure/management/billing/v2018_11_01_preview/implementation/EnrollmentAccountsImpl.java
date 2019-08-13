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
import com.microsoft.azure.management.billing.v2018_11_01_preview.EnrollmentAccounts;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.billing.v2018_11_01_preview.EnrollmentAccountListResult;
import com.microsoft.azure.management.billing.v2018_11_01_preview.EnrollmentAccount;

class EnrollmentAccountsImpl extends WrapperImpl<EnrollmentAccountsInner> implements EnrollmentAccounts {
    private final BillingManager manager;

    EnrollmentAccountsImpl(BillingManager manager) {
        super(manager.inner().enrollmentAccounts());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    private EnrollmentAccountImpl wrapModel(EnrollmentAccountInner inner) {
        return  new EnrollmentAccountImpl(inner, manager());
    }

    @Override
    public Observable<EnrollmentAccountListResult> listByBillingAccountNameAsync(String billingAccountName) {
        EnrollmentAccountsInner client = this.inner();
        return client.listByBillingAccountNameAsync(billingAccountName)
        .map(new Func1<EnrollmentAccountListResultInner, EnrollmentAccountListResult>() {
            @Override
            public EnrollmentAccountListResult call(EnrollmentAccountListResultInner inner) {
                return new EnrollmentAccountListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EnrollmentAccount> getByEnrollmentAccountIdAsync(String billingAccountName, String enrollmentAccountName) {
        EnrollmentAccountsInner client = this.inner();
        return client.getByEnrollmentAccountIdAsync(billingAccountName, enrollmentAccountName)
        .map(new Func1<EnrollmentAccountInner, EnrollmentAccount>() {
            @Override
            public EnrollmentAccount call(EnrollmentAccountInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
