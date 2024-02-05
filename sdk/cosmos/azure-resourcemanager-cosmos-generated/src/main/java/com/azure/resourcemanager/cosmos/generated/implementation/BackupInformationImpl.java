// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.resourcemanager.cosmos.generated.fluent.models.BackupInformationInner;
import com.azure.resourcemanager.cosmos.generated.models.BackupInformation;
import com.azure.resourcemanager.cosmos.generated.models.ContinuousBackupInformation;

public final class BackupInformationImpl implements BackupInformation {
    private BackupInformationInner innerObject;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    BackupInformationImpl(BackupInformationInner innerObject,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public ContinuousBackupInformation continuousBackupInformation() {
        return this.innerModel().continuousBackupInformation();
    }

    public BackupInformationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }
}
