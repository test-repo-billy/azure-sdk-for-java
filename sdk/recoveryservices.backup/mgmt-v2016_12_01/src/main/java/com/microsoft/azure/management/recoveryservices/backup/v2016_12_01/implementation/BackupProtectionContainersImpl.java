/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.BackupProtectionContainers;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.VaultProtectionContainerResource;

class BackupProtectionContainersImpl extends WrapperImpl<BackupProtectionContainersInner> implements BackupProtectionContainers {
    private final RecoveryServicesManager manager;

    BackupProtectionContainersImpl(RecoveryServicesManager manager) {
        super(manager.inner().backupProtectionContainers());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private VaultProtectionContainerResourceImpl wrapModel(ProtectionContainerResourceInner inner) {
        return  new VaultProtectionContainerResourceImpl(inner, manager());
    }

    @Override
    public Observable<VaultProtectionContainerResource> listAsync(final String vaultName, final String resourceGroupName) {
        BackupProtectionContainersInner client = this.inner();
        return client.listAsync(vaultName, resourceGroupName)
        .flatMapIterable(new Func1<Page<ProtectionContainerResourceInner>, Iterable<ProtectionContainerResourceInner>>() {
            @Override
            public Iterable<ProtectionContainerResourceInner> call(Page<ProtectionContainerResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProtectionContainerResourceInner, VaultProtectionContainerResource>() {
            @Override
            public VaultProtectionContainerResource call(ProtectionContainerResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
