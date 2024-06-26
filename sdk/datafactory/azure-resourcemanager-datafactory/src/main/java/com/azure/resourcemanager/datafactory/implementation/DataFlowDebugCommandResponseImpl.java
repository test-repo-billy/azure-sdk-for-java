// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.resourcemanager.datafactory.fluent.models.DataFlowDebugCommandResponseInner;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugCommandResponse;

public final class DataFlowDebugCommandResponseImpl implements DataFlowDebugCommandResponse {
    private DataFlowDebugCommandResponseInner innerObject;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    DataFlowDebugCommandResponseImpl(DataFlowDebugCommandResponseInner innerObject,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String status() {
        return this.innerModel().status();
    }

    public String data() {
        return this.innerModel().data();
    }

    public DataFlowDebugCommandResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }
}
