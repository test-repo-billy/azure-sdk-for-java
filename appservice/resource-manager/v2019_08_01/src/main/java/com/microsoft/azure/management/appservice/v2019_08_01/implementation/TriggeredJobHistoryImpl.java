/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.TriggeredJobHistory;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.appservice.v2019_08_01.TriggeredJobRun;

class TriggeredJobHistoryImpl extends WrapperImpl<TriggeredJobHistoryInner> implements TriggeredJobHistory {
    private final CertificateRegistrationManager manager;
    TriggeredJobHistoryImpl(TriggeredJobHistoryInner inner, CertificateRegistrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<TriggeredJobRun> runs() {
        return this.inner().runs();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
