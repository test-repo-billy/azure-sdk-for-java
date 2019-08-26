/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2019_10_01_preview.Policies;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.billing.v2019_10_01_preview.Policy;

class PoliciesImpl extends WrapperImpl<PoliciesInner> implements Policies {
    private final BillingManager manager;

    PoliciesImpl(BillingManager manager) {
        super(manager.inner().policies());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Policy> getByBillingProfileAsync(String billingAccountName, String billingProfileName) {
        PoliciesInner client = this.inner();
        return client.getByBillingProfileAsync(billingAccountName, billingProfileName)
        .map(new Func1<PolicyInner, Policy>() {
            @Override
            public Policy call(PolicyInner inner) {
                return new PolicyImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Policy> updateAsync(String billingAccountName, String billingProfileName, PolicyInner parameters) {
        PoliciesInner client = this.inner();
        return client.updateAsync(billingAccountName, billingProfileName, parameters)
        .map(new Func1<PolicyInner, Policy>() {
            @Override
            public Policy call(PolicyInner inner) {
                return new PolicyImpl(inner, manager());
            }
        });
    }

}
