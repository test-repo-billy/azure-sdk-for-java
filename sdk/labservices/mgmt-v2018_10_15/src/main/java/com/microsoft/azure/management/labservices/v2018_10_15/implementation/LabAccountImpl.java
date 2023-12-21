/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.labservices.v2018_10_15.LabAccount;
import rx.Observable;
import com.microsoft.azure.management.labservices.v2018_10_15.LabAccountFragment;
import com.microsoft.azure.management.labservices.v2018_10_15.SizeConfigurationProperties;
import com.microsoft.azure.management.labservices.v2018_10_15.LatestOperationResult;
import rx.functions.Func1;

class LabAccountImpl extends GroupableResourceCoreImpl<LabAccount, LabAccountInner, LabAccountImpl, LabServicesManager> implements LabAccount, LabAccount.Definition, LabAccount.Update {
    private LabAccountFragment updateParameter;
    LabAccountImpl(String name, LabAccountInner inner, LabServicesManager manager) {
        super(name, inner, manager);
        this.updateParameter = new LabAccountFragment();
    }

    @Override
    public Observable<LabAccount> createResourceAsync() {
        LabAccountsInner client = this.manager().inner().labAccounts();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<LabAccountInner, LabAccountInner>() {
               @Override
               public LabAccountInner call(LabAccountInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<LabAccount> updateResourceAsync() {
        LabAccountsInner client = this.manager().inner().labAccounts();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<LabAccountInner, LabAccountInner>() {
               @Override
               public LabAccountInner call(LabAccountInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<LabAccountInner> getInnerAsync() {
        LabAccountsInner client = this.manager().inner().labAccounts();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new LabAccountFragment();
    }

    @Override
    public Boolean enabledRegionSelection() {
        return this.inner().enabledRegionSelection();
    }

    @Override
    public LatestOperationResult latestOperationResult() {
        return this.inner().latestOperationResult();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public SizeConfigurationProperties sizeConfiguration() {
        return this.inner().sizeConfiguration();
    }

    @Override
    public String uniqueIdentifier() {
        return this.inner().uniqueIdentifier();
    }

    @Override
    public LabAccountImpl withEnabledRegionSelection(Boolean enabledRegionSelection) {
        if (isInCreateMode()) {
            this.inner().withEnabledRegionSelection(enabledRegionSelection);
        } else {
            this.updateParameter.withEnabledRegionSelection(enabledRegionSelection);
        }
        return this;
    }

    @Override
    public LabAccountImpl withProvisioningState(String provisioningState) {
        if (isInCreateMode()) {
            this.inner().withProvisioningState(provisioningState);
        } else {
            this.updateParameter.withProvisioningState(provisioningState);
        }
        return this;
    }

    @Override
    public LabAccountImpl withUniqueIdentifier(String uniqueIdentifier) {
        if (isInCreateMode()) {
            this.inner().withUniqueIdentifier(uniqueIdentifier);
        } else {
            this.updateParameter.withUniqueIdentifier(uniqueIdentifier);
        }
        return this;
    }

}
