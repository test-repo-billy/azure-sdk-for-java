/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.management.synapse.v2019_06_01_preview.CurrentSensitivityLabels;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;

class CurrentSensitivityLabelsImpl extends WrapperImpl<SensitivityLabelInner> implements CurrentSensitivityLabels {
    private final SynapseManager manager;

    CurrentSensitivityLabelsImpl(SensitivityLabelInner inner,  SynapseManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SynapseManager manager() {
        return this.manager;
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String informationType() {
        return this.inner().informationType();
    }

    @Override
    public String informationTypeId() {
        return this.inner().informationTypeId();
    }

    @Override
    public Boolean isDisabled() {
        return this.inner().isDisabled();
    }

    @Override
    public String labelId() {
        return this.inner().labelId();
    }

    @Override
    public String labelName() {
        return this.inner().labelName();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
