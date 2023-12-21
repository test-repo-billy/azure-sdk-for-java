/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupOperationStatuses;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.VaultOperationStatus;

class BackupOperationStatusesImpl extends WrapperImpl<BackupOperationStatusesInner> implements BackupOperationStatuses {
    private final RecoveryServicesManager manager;

    BackupOperationStatusesImpl(RecoveryServicesManager manager) {
        super(manager.inner().backupOperationStatuses());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private VaultOperationStatusImpl wrapModel(OperationStatusInner inner) {
        return  new VaultOperationStatusImpl(inner, manager());
    }

    @Override
    public Observable<VaultOperationStatus> getAsync(String vaultName, String resourceGroupName, String operationId) {
        BackupOperationStatusesInner client = this.inner();
        return client.getAsync(vaultName, resourceGroupName, operationId)
        .map(new Func1<OperationStatusInner, VaultOperationStatus>() {
            @Override
            public VaultOperationStatus call(OperationStatusInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
