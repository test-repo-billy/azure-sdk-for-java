/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.PolicyContract;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.PolicyContentFormat;

class PolicyContractImpl extends CreatableUpdatableImpl<PolicyContract, PolicyContractInner, PolicyContractImpl> implements PolicyContract, PolicyContract.Definition, PolicyContract.Update {
    private String resourceGroupName;
    private String serviceName;
    private String cifMatch;
    private String uifMatch;
    private final ApiManagementManager manager;

    PolicyContractImpl(String name, ApiManagementManager manager) {
        super(name, new PolicyContractInner());
        this.manager = manager;
        // Set resource name
        this.serviceName = name;
        //
    }

    PolicyContractImpl(PolicyContractInner inner, ApiManagementManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.serviceName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "service");
        // set other parameters for create and update
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PolicyContract> createResourceAsync() {
        PolicysInner client = this.manager().inner().policys();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.inner(), this.cifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PolicyContract> updateResourceAsync() {
        PolicysInner client = this.manager().inner().policys();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.inner(), this.uifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PolicyContractInner> getInnerAsync() {
        PolicysInner client = this.manager().inner().policys();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public PolicyContentFormat contentFormat() {
        return this.inner().contentFormat();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String policyContent() {
        return this.inner().policyContent();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public PolicyContractImpl withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public PolicyContractImpl withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    @Override
    public PolicyContractImpl withPolicyContent(String policyContent) {
        this.inner().withPolicyContent(policyContent);
        return this;
    }

    @Override
    public PolicyContractImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.cifMatch = ifMatch;
        } else {
            this.uifMatch = ifMatch;
        }
        return this;
    }

    @Override
    public PolicyContractImpl withContentFormat(PolicyContentFormat contentFormat) {
        this.inner().withContentFormat(contentFormat);
        return this;
    }

}
