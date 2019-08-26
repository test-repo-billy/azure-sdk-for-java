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
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationRecoveryPlans;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.RecoveryPlan;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.RecoveryPlanTestFailoverCleanupInputProperties;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.RecoveryPlanTestFailoverInputProperties;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.RecoveryPlanUnplannedFailoverInputProperties;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.RecoveryPlanPlannedFailoverInputProperties;

class ReplicationRecoveryPlansImpl extends WrapperImpl<ReplicationRecoveryPlansInner> implements ReplicationRecoveryPlans {
    private final RecoveryServicesManager manager;

    ReplicationRecoveryPlansImpl(RecoveryServicesManager manager) {
        super(manager.inner().replicationRecoveryPlans());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public RecoveryPlanImpl define(String name) {
        return wrapModel(name);
    }

    private RecoveryPlanImpl wrapModel(RecoveryPlanInner inner) {
        return  new RecoveryPlanImpl(inner, manager());
    }

    private RecoveryPlanImpl wrapModel(String name) {
        return new RecoveryPlanImpl(name, this.manager());
    }

    @Override
    public Observable<RecoveryPlan> reprotectAsync(String recoveryPlanName) {
        ReplicationRecoveryPlansInner client = this.inner();
        return client.reprotectAsync(recoveryPlanName)
        .map(new Func1<RecoveryPlanInner, RecoveryPlan>() {
            @Override
            public RecoveryPlan call(RecoveryPlanInner inner) {
                return new RecoveryPlanImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RecoveryPlan> failoverCommitAsync(String recoveryPlanName) {
        ReplicationRecoveryPlansInner client = this.inner();
        return client.failoverCommitAsync(recoveryPlanName)
        .map(new Func1<RecoveryPlanInner, RecoveryPlan>() {
            @Override
            public RecoveryPlan call(RecoveryPlanInner inner) {
                return new RecoveryPlanImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RecoveryPlan> testFailoverCleanupAsync(String recoveryPlanName, RecoveryPlanTestFailoverCleanupInputProperties properties) {
        ReplicationRecoveryPlansInner client = this.inner();
        return client.testFailoverCleanupAsync(recoveryPlanName, properties)
        .map(new Func1<RecoveryPlanInner, RecoveryPlan>() {
            @Override
            public RecoveryPlan call(RecoveryPlanInner inner) {
                return new RecoveryPlanImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RecoveryPlan> testFailoverAsync(String recoveryPlanName, RecoveryPlanTestFailoverInputProperties properties) {
        ReplicationRecoveryPlansInner client = this.inner();
        return client.testFailoverAsync(recoveryPlanName, properties)
        .map(new Func1<RecoveryPlanInner, RecoveryPlan>() {
            @Override
            public RecoveryPlan call(RecoveryPlanInner inner) {
                return new RecoveryPlanImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RecoveryPlan> unplannedFailoverAsync(String recoveryPlanName, RecoveryPlanUnplannedFailoverInputProperties properties) {
        ReplicationRecoveryPlansInner client = this.inner();
        return client.unplannedFailoverAsync(recoveryPlanName, properties)
        .map(new Func1<RecoveryPlanInner, RecoveryPlan>() {
            @Override
            public RecoveryPlan call(RecoveryPlanInner inner) {
                return new RecoveryPlanImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RecoveryPlan> plannedFailoverAsync(String recoveryPlanName, RecoveryPlanPlannedFailoverInputProperties properties) {
        ReplicationRecoveryPlansInner client = this.inner();
        return client.plannedFailoverAsync(recoveryPlanName, properties)
        .map(new Func1<RecoveryPlanInner, RecoveryPlan>() {
            @Override
            public RecoveryPlan call(RecoveryPlanInner inner) {
                return new RecoveryPlanImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RecoveryPlan> listAsync() {
        ReplicationRecoveryPlansInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<RecoveryPlanInner>, Iterable<RecoveryPlanInner>>() {
            @Override
            public Iterable<RecoveryPlanInner> call(Page<RecoveryPlanInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RecoveryPlanInner, RecoveryPlan>() {
            @Override
            public RecoveryPlan call(RecoveryPlanInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<RecoveryPlan> getAsync(String recoveryPlanName) {
        ReplicationRecoveryPlansInner client = this.inner();
        return client.getAsync(recoveryPlanName)
        .map(new Func1<RecoveryPlanInner, RecoveryPlan>() {
            @Override
            public RecoveryPlan call(RecoveryPlanInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String recoveryPlanName) {
        ReplicationRecoveryPlansInner client = this.inner();
        return client.deleteAsync(recoveryPlanName).toCompletable();
    }

}
