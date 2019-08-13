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
import com.microsoft.azure.management.billing.v2019_10_01_preview.Agreements;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.billing.v2019_10_01_preview.AgreementListResult;
import com.microsoft.azure.management.billing.v2019_10_01_preview.Agreement;

class AgreementsImpl extends WrapperImpl<AgreementsInner> implements Agreements {
    private final BillingManager manager;

    AgreementsImpl(BillingManager manager) {
        super(manager.inner().agreements());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    private AgreementImpl wrapModel(AgreementInner inner) {
        return  new AgreementImpl(inner, manager());
    }

    @Override
    public Observable<AgreementListResult> listByBillingAccountNameAsync(String billingAccountName) {
        AgreementsInner client = this.inner();
        return client.listByBillingAccountNameAsync(billingAccountName)
        .map(new Func1<AgreementListResultInner, AgreementListResult>() {
            @Override
            public AgreementListResult call(AgreementListResultInner inner) {
                return new AgreementListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Agreement> getAsync(String billingAccountName, String agreementName) {
        AgreementsInner client = this.inner();
        return client.getAsync(billingAccountName, agreementName)
        .map(new Func1<AgreementInner, Agreement>() {
            @Override
            public Agreement call(AgreementInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
