/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.management.sql.v2014_04_01.DatabaseTableAuditingPolicyListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class DatabaseTableAuditingPolicyListResultImpl extends WrapperImpl<DatabaseTableAuditingPolicyListResultInner> implements DatabaseTableAuditingPolicyListResult {
    private final SqlManager manager;
    DatabaseTableAuditingPolicyListResultImpl(DatabaseTableAuditingPolicyListResultInner inner, SqlManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public List<DatabaseTableAuditingPolicyInner> value() {
        return this.inner().value();
    }

}
