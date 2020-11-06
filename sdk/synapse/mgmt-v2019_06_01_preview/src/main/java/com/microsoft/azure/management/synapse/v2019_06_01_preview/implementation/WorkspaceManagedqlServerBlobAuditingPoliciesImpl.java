/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.WorkspaceManagedqlServerBlobAuditingPolicies;

class WorkspaceManagedqlServerBlobAuditingPoliciesImpl extends WrapperImpl<WorkspaceManagedqlServerBlobAuditingPoliciesInner> implements WorkspaceManagedqlServerBlobAuditingPolicies {
    private final SynapseManager manager;

    WorkspaceManagedqlServerBlobAuditingPoliciesImpl(SynapseManager manager) {
        super(manager.inner().workspaceManagedqlServerBlobAuditingPolicies());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public WorkspaceServerBlobAuditingPolicyModelImpl define(String name) {
        return wrapModel(name);
    }

    private WorkspaceServerBlobAuditingPolicyModelImpl wrapModel(ServerBlobAuditingPolicyInner inner) {
        return  new WorkspaceServerBlobAuditingPolicyModelImpl(inner, manager());
    }

    private WorkspaceServerBlobAuditingPolicyModelImpl wrapModel(String name) {
        return new WorkspaceServerBlobAuditingPolicyModelImpl(name, this.manager());
    }

}
