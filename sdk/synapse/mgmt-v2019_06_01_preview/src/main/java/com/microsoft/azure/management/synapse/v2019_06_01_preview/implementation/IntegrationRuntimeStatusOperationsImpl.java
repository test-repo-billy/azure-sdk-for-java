/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeStatusOperations;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeStatusResponse;

class IntegrationRuntimeStatusOperationsImpl extends WrapperImpl<IntegrationRuntimeStatusOperationsInner> implements IntegrationRuntimeStatusOperations {
    private final SynapseManager manager;

    IntegrationRuntimeStatusOperationsImpl(SynapseManager manager) {
        super(manager.inner().integrationRuntimeStatusOperations());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public Observable<IntegrationRuntimeStatusResponse> getAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        IntegrationRuntimeStatusOperationsInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, integrationRuntimeName)
        .map(new Func1<IntegrationRuntimeStatusResponseInner, IntegrationRuntimeStatusResponse>() {
            @Override
            public IntegrationRuntimeStatusResponse call(IntegrationRuntimeStatusResponseInner inner) {
                return new IntegrationRuntimeStatusResponseImpl(inner, manager());
            }
        });
    }

}
