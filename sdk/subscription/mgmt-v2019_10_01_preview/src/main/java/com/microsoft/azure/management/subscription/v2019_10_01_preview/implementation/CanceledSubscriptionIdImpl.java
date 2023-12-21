/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.subscription.v2019_10_01_preview.implementation;

import com.microsoft.azure.management.subscription.v2019_10_01_preview.CanceledSubscriptionId;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class CanceledSubscriptionIdImpl extends WrapperImpl<CanceledSubscriptionIdInner> implements CanceledSubscriptionId {
    private final BillingManager manager;
    CanceledSubscriptionIdImpl(CanceledSubscriptionIdInner inner, BillingManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public String value() {
        return this.inner().value();
    }

}
