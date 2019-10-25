/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2017_03_01_preview.JobTargetGroups;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.sql.v2017_03_01_preview.JobTargetGroup;

class JobTargetGroupsImpl extends WrapperImpl<JobTargetGroupsInner> implements JobTargetGroups {
    private final SqlManager manager;

    JobTargetGroupsImpl(SqlManager manager) {
        super(manager.inner().jobTargetGroups());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public JobTargetGroupImpl define(String name) {
        return wrapModel(name);
    }

    private JobTargetGroupImpl wrapModel(JobTargetGroupInner inner) {
        return  new JobTargetGroupImpl(inner, manager());
    }

    private JobTargetGroupImpl wrapModel(String name) {
        return new JobTargetGroupImpl(name, this.manager());
    }

    @Override
    public Observable<JobTargetGroup> listByAgentAsync(final String resourceGroupName, final String serverName, final String jobAgentName) {
        JobTargetGroupsInner client = this.inner();
        return client.listByAgentAsync(resourceGroupName, serverName, jobAgentName)
        .flatMapIterable(new Func1<Page<JobTargetGroupInner>, Iterable<JobTargetGroupInner>>() {
            @Override
            public Iterable<JobTargetGroupInner> call(Page<JobTargetGroupInner> page) {
                return page.items();
            }
        })
        .map(new Func1<JobTargetGroupInner, JobTargetGroup>() {
            @Override
            public JobTargetGroup call(JobTargetGroupInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<JobTargetGroup> getAsync(String resourceGroupName, String serverName, String jobAgentName, String targetGroupName) {
        JobTargetGroupsInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, jobAgentName, targetGroupName)
        .flatMap(new Func1<JobTargetGroupInner, Observable<JobTargetGroup>>() {
            @Override
            public Observable<JobTargetGroup> call(JobTargetGroupInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((JobTargetGroup)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serverName, String jobAgentName, String targetGroupName) {
        JobTargetGroupsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serverName, jobAgentName, targetGroupName).toCompletable();
    }

}
