/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.CertificateEmail;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import org.joda.time.DateTime;

class CertificateEmailImpl extends WrapperImpl<CertificateEmailInner> implements CertificateEmail {
    private final AppServiceManager manager;
    CertificateEmailImpl(CertificateEmailInner inner, AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public String emailId() {
        return this.inner().emailId();
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
    public DateTime timeStamp() {
        return this.inner().timeStamp();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
