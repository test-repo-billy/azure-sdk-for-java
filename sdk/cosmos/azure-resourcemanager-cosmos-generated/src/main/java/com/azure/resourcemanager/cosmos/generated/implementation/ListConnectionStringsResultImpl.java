// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.resourcemanager.cosmos.generated.fluent.models.ListConnectionStringsResultInner;
import com.azure.resourcemanager.cosmos.generated.models.ConnectionString;
import com.azure.resourcemanager.cosmos.generated.models.ListConnectionStringsResult;
import java.util.Collections;
import java.util.List;

public final class ListConnectionStringsResultImpl implements ListConnectionStringsResult {
    private ListConnectionStringsResultInner innerObject;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    ListConnectionStringsResultImpl(ListConnectionStringsResultInner innerObject,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ConnectionString> connectionStrings() {
        List<ConnectionString> inner = this.innerModel().connectionStrings();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ListConnectionStringsResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }
}
