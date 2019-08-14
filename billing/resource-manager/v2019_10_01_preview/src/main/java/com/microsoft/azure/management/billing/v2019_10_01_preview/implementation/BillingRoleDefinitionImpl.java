/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.management.billing.v2019_10_01_preview.BillingRoleDefinition;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.billing.v2019_10_01_preview.BillingPermissionsProperties;

class BillingRoleDefinitionImpl extends IndexableRefreshableWrapperImpl<BillingRoleDefinition, BillingRoleDefinitionInner> implements BillingRoleDefinition {
    private final BillingManager manager;
    private String billingAccountName;
    private String billingRoleDefinitionName;

    BillingRoleDefinitionImpl(BillingRoleDefinitionInner inner,  BillingManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.billingAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "billingAccounts");
        this.billingRoleDefinitionName = IdParsingUtils.getValueFromIdByName(inner.id(), "billingRoleDefinitions");
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<BillingRoleDefinitionInner> getInnerAsync() {
        BillingRoleDefinitionsInner client = this.manager().inner().billingRoleDefinitions();
        return client.getByBillingAccountAsync(this.billingAccountName, this.billingRoleDefinitionName);
    }



    @Override
    public String description() {
        return this.inner().description();
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
    public String roleName() {
        return this.inner().roleName();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public List<BillingPermissionsProperties> value() {
        return this.inner().value();
    }

}
