/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.User;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class UserImpl extends WrapperImpl<UserInner> implements User {
    private final CertificateRegistrationManager manager;
    UserImpl(UserInner inner, CertificateRegistrationManager manager) {
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
    public String publishingPassword() {
        return this.inner().publishingPassword();
    }

    @Override
    public String publishingPasswordHash() {
        return this.inner().publishingPasswordHash();
    }

    @Override
    public String publishingPasswordHashSalt() {
        return this.inner().publishingPasswordHashSalt();
    }

    @Override
    public String publishingUserName() {
        return this.inner().publishingUserName();
    }

    @Override
    public String scmUri() {
        return this.inner().scmUri();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
