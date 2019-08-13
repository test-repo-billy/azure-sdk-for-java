/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingSubscriptionSummary;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Amount;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingSubscriptionStatusType;
import java.util.UUID;

class BillingSubscriptionSummaryImpl extends WrapperImpl<BillingSubscriptionSummaryInner> implements BillingSubscriptionSummary {
    private final BillingManager manager;

    BillingSubscriptionSummaryImpl(BillingSubscriptionSummaryInner inner,  BillingManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }



    @Override
    public String billingProfileId() {
        return this.inner().billingProfileId();
    }

    @Override
    public String billingProfileName() {
        return this.inner().billingProfileName();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String invoiceSectionId() {
        return this.inner().invoiceSectionId();
    }

    @Override
    public String invoiceSectionName() {
        return this.inner().invoiceSectionName();
    }

    @Override
    public Amount lastMonthCharges() {
        return this.inner().lastMonthCharges();
    }

    @Override
    public Amount monthToDateCharges() {
        return this.inner().monthToDateCharges();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String skuDescription() {
        return this.inner().skuDescription();
    }

    @Override
    public String skuId() {
        return this.inner().skuId();
    }

    @Override
    public BillingSubscriptionStatusType subscriptionBillingStatus() {
        return this.inner().subscriptionBillingStatus();
    }

    @Override
    public UUID subscriptionId() {
        return this.inner().subscriptionId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
