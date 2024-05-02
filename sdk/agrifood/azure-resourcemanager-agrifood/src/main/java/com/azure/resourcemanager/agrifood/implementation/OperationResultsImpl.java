// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.agrifood.fluent.OperationResultsClient;
import com.azure.resourcemanager.agrifood.fluent.models.ArmAsyncOperationInner;
import com.azure.resourcemanager.agrifood.models.ArmAsyncOperation;
import com.azure.resourcemanager.agrifood.models.OperationResults;

public final class OperationResultsImpl implements OperationResults {
    private static final ClientLogger LOGGER = new ClientLogger(OperationResultsImpl.class);

    private final OperationResultsClient innerClient;

    private final com.azure.resourcemanager.agrifood.AgriFoodManager serviceManager;

    public OperationResultsImpl(OperationResultsClient innerClient,
        com.azure.resourcemanager.agrifood.AgriFoodManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ArmAsyncOperation> getWithResponse(String locations, String operationResultsId, Context context) {
        Response<ArmAsyncOperationInner> inner
            = this.serviceClient().getWithResponse(locations, operationResultsId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ArmAsyncOperationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ArmAsyncOperation get(String locations, String operationResultsId) {
        ArmAsyncOperationInner inner = this.serviceClient().get(locations, operationResultsId);
        if (inner != null) {
            return new ArmAsyncOperationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private OperationResultsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.agrifood.AgriFoodManager manager() {
        return this.serviceManager;
    }
}
