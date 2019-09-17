/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2019_04_01.implementation;

import com.microsoft.azure.management.batch.v2019_04_01.CheckNameAvailabilityResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.batch.v2019_04_01.NameAvailabilityReason;

class CheckNameAvailabilityResultImpl extends WrapperImpl<CheckNameAvailabilityResultInner> implements CheckNameAvailabilityResult {
    private final BatchManager manager;
    CheckNameAvailabilityResultImpl(CheckNameAvailabilityResultInner inner, BatchManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BatchManager manager() {
        return this.manager;
    }

    @Override
    public String message() {
        return this.inner().message();
    }

    @Override
    public Boolean nameAvailable() {
        return this.inner().nameAvailable();
    }

    @Override
    public NameAvailabilityReason reason() {
        return this.inner().reason();
    }

}
