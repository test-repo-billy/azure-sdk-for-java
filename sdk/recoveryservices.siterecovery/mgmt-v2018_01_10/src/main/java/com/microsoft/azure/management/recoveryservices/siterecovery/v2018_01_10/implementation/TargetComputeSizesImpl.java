/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.TargetComputeSizes;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.TargetComputeSize;

class TargetComputeSizesImpl extends WrapperImpl<TargetComputeSizesInner> implements TargetComputeSizes {
    private final RecoveryServicesManager manager;

    TargetComputeSizesImpl(RecoveryServicesManager manager) {
        super(manager.inner().targetComputeSizes());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private TargetComputeSizeImpl wrapModel(TargetComputeSizeInner inner) {
        return  new TargetComputeSizeImpl(inner, manager());
    }

    @Override
    public Observable<TargetComputeSize> listByReplicationProtectedItemsAsync(final String fabricName, final String protectionContainerName, final String replicatedProtectedItemName) {
        TargetComputeSizesInner client = this.inner();
        return client.listByReplicationProtectedItemsAsync(fabricName, protectionContainerName, replicatedProtectedItemName)
        .flatMapIterable(new Func1<Page<TargetComputeSizeInner>, Iterable<TargetComputeSizeInner>>() {
            @Override
            public Iterable<TargetComputeSizeInner> call(Page<TargetComputeSizeInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TargetComputeSizeInner, TargetComputeSize>() {
            @Override
            public TargetComputeSize call(TargetComputeSizeInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
