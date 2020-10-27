/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15.implementation;

import com.microsoft.azure.management.cdn.v2020_04_15.ValidateCustomDomainOutput;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class ValidateCustomDomainOutputImpl extends WrapperImpl<ValidateCustomDomainOutputInner> implements ValidateCustomDomainOutput {
    private final CdnManager manager;
    ValidateCustomDomainOutputImpl(ValidateCustomDomainOutputInner inner, CdnManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public Boolean customDomainValidated() {
        return this.inner().customDomainValidated();
    }

    @Override
    public String message() {
        return this.inner().message();
    }

    @Override
    public String reason() {
        return this.inner().reason();
    }

}
