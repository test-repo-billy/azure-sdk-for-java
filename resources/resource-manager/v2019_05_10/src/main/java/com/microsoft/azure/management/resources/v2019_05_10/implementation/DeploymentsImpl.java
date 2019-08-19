/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.resources.v2019_05_10.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resources.v2019_05_10.Deployments;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.resources.v2019_05_10.DeploymentExtended;
import com.microsoft.azure.management.resources.v2019_05_10.DeploymentValidateResult;
import com.microsoft.azure.management.resources.v2019_05_10.DeploymentExportResult;

class DeploymentsImpl extends WrapperImpl<DeploymentsInner> implements Deployments {
    private final ResourcesManager manager;

    DeploymentsImpl(ResourcesManager manager) {
        super(manager.inner().deployments());
        this.manager = manager;
    }

    public ResourcesManager manager() {
        return this.manager;
    }

    @Override
    public DeploymentExtendedImpl define(String name) {
        return wrapModel(name);
    }

    private DeploymentExtendedImpl wrapModel(DeploymentExtendedInner inner) {
        return  new DeploymentExtendedImpl(inner, manager());
    }

    private DeploymentExtendedImpl wrapModel(String name) {
        return new DeploymentExtendedImpl(name, this.manager());
    }

    @Override
    public Completable deleteAtManagementGroupScopeAsync(String groupId, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.deleteAtManagementGroupScopeAsync(groupId, deploymentName).toCompletable();
    }

    @Override
    public Observable<Boolean> checkExistenceAtManagementGroupScopeAsync(String groupId, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.checkExistenceAtManagementGroupScopeAsync(groupId, deploymentName)
    ;}

    @Override
    public Observable<DeploymentExtended> getAtManagementGroupScopeAsync(String groupId, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.getAtManagementGroupScopeAsync(groupId, deploymentName)
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return new DeploymentExtendedImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable cancelAtManagementGroupScopeAsync(String groupId, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.cancelAtManagementGroupScopeAsync(groupId, deploymentName).toCompletable();
    }

    @Override
    public Observable<DeploymentValidateResult> validateAtManagementGroupScopeAsync(String groupId, String deploymentName, DeploymentInner parameters) {
        DeploymentsInner client = this.inner();
        return client.validateAtManagementGroupScopeAsync(groupId, deploymentName, parameters)
        .map(new Func1<DeploymentValidateResultInner, DeploymentValidateResult>() {
            @Override
            public DeploymentValidateResult call(DeploymentValidateResultInner inner) {
                return new DeploymentValidateResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentExportResult> exportTemplateAtManagementGroupScopeAsync(String groupId, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.exportTemplateAtManagementGroupScopeAsync(groupId, deploymentName)
        .map(new Func1<DeploymentExportResultInner, DeploymentExportResult>() {
            @Override
            public DeploymentExportResult call(DeploymentExportResultInner inner) {
                return new DeploymentExportResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentExtended> listAtManagementGroupScopeAsync(final String groupId) {
        DeploymentsInner client = this.inner();
        return client.listAtManagementGroupScopeAsync(groupId)
        .flatMapIterable(new Func1<Page<DeploymentExtendedInner>, Iterable<DeploymentExtendedInner>>() {
            @Override
            public Iterable<DeploymentExtendedInner> call(Page<DeploymentExtendedInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return new DeploymentExtendedImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAtSubscriptionScopeAsync(String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.deleteAtSubscriptionScopeAsync(deploymentName).toCompletable();
    }

    @Override
    public Observable<Boolean> checkExistenceAtSubscriptionScopeAsync(String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.checkExistenceAtSubscriptionScopeAsync(deploymentName)
    ;}

    @Override
    public Observable<DeploymentExtended> createOrUpdateAtSubscriptionScopeAsync(String deploymentName, DeploymentInner parameters) {
        DeploymentsInner client = this.inner();
        return client.createOrUpdateAtSubscriptionScopeAsync(deploymentName, parameters)
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return new DeploymentExtendedImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentExtended> getAtSubscriptionScopeAsync(String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.getAtSubscriptionScopeAsync(deploymentName)
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return new DeploymentExtendedImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable cancelAtSubscriptionScopeAsync(String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.cancelAtSubscriptionScopeAsync(deploymentName).toCompletable();
    }

    @Override
    public Observable<DeploymentValidateResult> validateAtSubscriptionScopeAsync(String deploymentName, DeploymentInner parameters) {
        DeploymentsInner client = this.inner();
        return client.validateAtSubscriptionScopeAsync(deploymentName, parameters)
        .map(new Func1<DeploymentValidateResultInner, DeploymentValidateResult>() {
            @Override
            public DeploymentValidateResult call(DeploymentValidateResultInner inner) {
                return new DeploymentValidateResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentExportResult> exportTemplateAtSubscriptionScopeAsync(String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.exportTemplateAtSubscriptionScopeAsync(deploymentName)
        .map(new Func1<DeploymentExportResultInner, DeploymentExportResult>() {
            @Override
            public DeploymentExportResult call(DeploymentExportResultInner inner) {
                return new DeploymentExportResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, deploymentName).toCompletable();
    }

    @Override
    public Observable<Boolean> checkExistenceAsync(String resourceGroupName, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.checkExistenceAsync(resourceGroupName, deploymentName)
    ;}

    @Override
    public Observable<DeploymentExtended> createOrUpdateAsync(String resourceGroupName, String deploymentName, DeploymentInner parameters) {
        DeploymentsInner client = this.inner();
        return client.createOrUpdateAsync(resourceGroupName, deploymentName, parameters)
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return new DeploymentExtendedImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentExtended> getByResourceGroupAsync(String resourceGroupName, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, deploymentName)
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return new DeploymentExtendedImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable cancelAsync(String resourceGroupName, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.cancelAsync(resourceGroupName, deploymentName).toCompletable();
    }

    @Override
    public Observable<DeploymentValidateResult> validateAsync(String resourceGroupName, String deploymentName, DeploymentInner parameters) {
        DeploymentsInner client = this.inner();
        return client.validateAsync(resourceGroupName, deploymentName, parameters)
        .map(new Func1<DeploymentValidateResultInner, DeploymentValidateResult>() {
            @Override
            public DeploymentValidateResult call(DeploymentValidateResultInner inner) {
                return new DeploymentValidateResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentExportResult> exportTemplateAsync(String resourceGroupName, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.exportTemplateAsync(resourceGroupName, deploymentName)
        .map(new Func1<DeploymentExportResultInner, DeploymentExportResult>() {
            @Override
            public DeploymentExportResult call(DeploymentExportResultInner inner) {
                return new DeploymentExportResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentExtended> listAsync() {
        DeploymentsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<DeploymentExtendedInner>, Iterable<DeploymentExtendedInner>>() {
            @Override
            public Iterable<DeploymentExtendedInner> call(Page<DeploymentExtendedInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return new DeploymentExtendedImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentExtended> listByResourceGroupAsync(final String resourceGroupName) {
        DeploymentsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<DeploymentExtendedInner>, Iterable<DeploymentExtendedInner>>() {
            @Override
            public Iterable<DeploymentExtendedInner> call(Page<DeploymentExtendedInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return new DeploymentExtendedImpl(inner, manager());
            }
        });
    }

}
