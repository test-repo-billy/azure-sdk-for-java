/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.JobDetails;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.VaultJobResourceModel;

class JobDetailsImpl extends WrapperImpl<JobDetailsInner> implements JobDetails {
    private final RecoveryServicesManager manager;

    JobDetailsImpl(RecoveryServicesManager manager) {
        super(manager.inner().jobDetails());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private VaultJobResourceModelImpl wrapModel(JobResourceInner inner) {
        return  new VaultJobResourceModelImpl(inner, manager());
    }

    @Override
    public Observable<VaultJobResourceModel> getAsync(String vaultName, String resourceGroupName, String jobName) {
        JobDetailsInner client = this.inner();
        return client.getAsync(vaultName, resourceGroupName, jobName)
        .map(new Func1<JobResourceInner, VaultJobResourceModel>() {
            @Override
            public VaultJobResourceModel call(JobResourceInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
