/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2018_10_01.implementation;

import com.microsoft.azure.management.signalr.v2018_10_01.SignalRUsage;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.signalr.v2018_10_01.SignalRUsageName;

class SignalRUsageImpl extends WrapperImpl<SignalRUsageInner> implements SignalRUsage {
    private final SignalRServiceManager manager;

    SignalRUsageImpl(SignalRUsageInner inner,  SignalRServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SignalRServiceManager manager() {
        return this.manager;
    }



    @Override
    public Long currentValue() {
        return this.inner().currentValue();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Long limit() {
        return this.inner().limit();
    }

    @Override
    public SignalRUsageName name() {
        return this.inner().name();
    }

    @Override
    public String unit() {
        return this.inner().unit();
    }

}
