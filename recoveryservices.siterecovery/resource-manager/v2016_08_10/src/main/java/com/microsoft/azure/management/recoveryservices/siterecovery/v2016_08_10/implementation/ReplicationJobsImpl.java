/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationJobs;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.Job;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.JobQueryParameter;

class ReplicationJobsImpl extends WrapperImpl<ReplicationJobsInner> implements ReplicationJobs {
    private final RecoveryServicesManager manager;

    ReplicationJobsImpl(RecoveryServicesManager manager) {
        super(manager.inner().replicationJobs());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private JobImpl wrapModel(JobInner inner) {
        return  new JobImpl(inner, manager());
    }

    @Override
    public Observable<Job> resumeAsync(String jobName) {
        ReplicationJobsInner client = this.inner();
        return client.resumeAsync(jobName)
        .map(new Func1<JobInner, Job>() {
            @Override
            public Job call(JobInner inner) {
                return new JobImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Job> restartAsync(String jobName) {
        ReplicationJobsInner client = this.inner();
        return client.restartAsync(jobName)
        .map(new Func1<JobInner, Job>() {
            @Override
            public Job call(JobInner inner) {
                return new JobImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Job> cancelAsync(String jobName) {
        ReplicationJobsInner client = this.inner();
        return client.cancelAsync(jobName)
        .map(new Func1<JobInner, Job>() {
            @Override
            public Job call(JobInner inner) {
                return new JobImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Job> exportAsync(JobQueryParameter jobQueryParameter) {
        ReplicationJobsInner client = this.inner();
        return client.exportAsync(jobQueryParameter)
        .map(new Func1<JobInner, Job>() {
            @Override
            public Job call(JobInner inner) {
                return new JobImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Job> listAsync() {
        ReplicationJobsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<JobInner>, Iterable<JobInner>>() {
            @Override
            public Iterable<JobInner> call(Page<JobInner> page) {
                return page.items();
            }
        })
        .map(new Func1<JobInner, Job>() {
            @Override
            public Job call(JobInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Job> getAsync(String jobName) {
        ReplicationJobsInner client = this.inner();
        return client.getAsync(jobName)
        .map(new Func1<JobInner, Job>() {
            @Override
            public Job call(JobInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
