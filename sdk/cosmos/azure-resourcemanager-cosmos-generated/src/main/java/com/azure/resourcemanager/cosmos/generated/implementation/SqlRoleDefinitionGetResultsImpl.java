// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.fluent.models.SqlRoleDefinitionGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.models.Permission;
import com.azure.resourcemanager.cosmos.generated.models.RoleDefinitionType;
import com.azure.resourcemanager.cosmos.generated.models.SqlRoleDefinitionCreateUpdateParameters;
import com.azure.resourcemanager.cosmos.generated.models.SqlRoleDefinitionGetResults;
import java.util.Collections;
import java.util.List;

public final class SqlRoleDefinitionGetResultsImpl
    implements SqlRoleDefinitionGetResults, SqlRoleDefinitionGetResults.Definition, SqlRoleDefinitionGetResults.Update {
    private SqlRoleDefinitionGetResultsInner innerObject;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String roleName() {
        return this.innerModel().roleName();
    }

    public RoleDefinitionType typePropertiesType() {
        return this.innerModel().typePropertiesType();
    }

    public List<String> assignableScopes() {
        List<String> inner = this.innerModel().assignableScopes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<Permission> permissions() {
        List<Permission> inner = this.innerModel().permissions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public SqlRoleDefinitionGetResultsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }

    private String roleDefinitionId;

    private String resourceGroupName;

    private String accountName;

    private SqlRoleDefinitionCreateUpdateParameters createCreateUpdateSqlRoleDefinitionParameters;

    private SqlRoleDefinitionCreateUpdateParameters updateCreateUpdateSqlRoleDefinitionParameters;

    public SqlRoleDefinitionGetResultsImpl withExistingDatabaseAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public SqlRoleDefinitionGetResults create() {
        this.innerObject
            = serviceManager.serviceClient().getSqlResources().createUpdateSqlRoleDefinition(roleDefinitionId,
                resourceGroupName, accountName, createCreateUpdateSqlRoleDefinitionParameters, Context.NONE);
        return this;
    }

    public SqlRoleDefinitionGetResults create(Context context) {
        this.innerObject = serviceManager.serviceClient().getSqlResources().createUpdateSqlRoleDefinition(
            roleDefinitionId, resourceGroupName, accountName, createCreateUpdateSqlRoleDefinitionParameters, context);
        return this;
    }

    SqlRoleDefinitionGetResultsImpl(String name,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = new SqlRoleDefinitionGetResultsInner();
        this.serviceManager = serviceManager;
        this.roleDefinitionId = name;
        this.createCreateUpdateSqlRoleDefinitionParameters = new SqlRoleDefinitionCreateUpdateParameters();
    }

    public SqlRoleDefinitionGetResultsImpl update() {
        this.updateCreateUpdateSqlRoleDefinitionParameters = new SqlRoleDefinitionCreateUpdateParameters();
        return this;
    }

    public SqlRoleDefinitionGetResults apply() {
        this.innerObject
            = serviceManager.serviceClient().getSqlResources().createUpdateSqlRoleDefinition(roleDefinitionId,
                resourceGroupName, accountName, updateCreateUpdateSqlRoleDefinitionParameters, Context.NONE);
        return this;
    }

    public SqlRoleDefinitionGetResults apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getSqlResources().createUpdateSqlRoleDefinition(
            roleDefinitionId, resourceGroupName, accountName, updateCreateUpdateSqlRoleDefinitionParameters, context);
        return this;
    }

    SqlRoleDefinitionGetResultsImpl(SqlRoleDefinitionGetResultsInner innerObject,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.roleDefinitionId = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "sqlRoleDefinitions");
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "databaseAccounts");
    }

    public SqlRoleDefinitionGetResults refresh() {
        this.innerObject = serviceManager.serviceClient().getSqlResources()
            .getSqlRoleDefinitionWithResponse(roleDefinitionId, resourceGroupName, accountName, Context.NONE)
            .getValue();
        return this;
    }

    public SqlRoleDefinitionGetResults refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getSqlResources()
            .getSqlRoleDefinitionWithResponse(roleDefinitionId, resourceGroupName, accountName, context).getValue();
        return this;
    }

    public SqlRoleDefinitionGetResultsImpl withRoleName(String roleName) {
        if (isInCreateMode()) {
            this.createCreateUpdateSqlRoleDefinitionParameters.withRoleName(roleName);
            return this;
        } else {
            this.updateCreateUpdateSqlRoleDefinitionParameters.withRoleName(roleName);
            return this;
        }
    }

    public SqlRoleDefinitionGetResultsImpl withType(RoleDefinitionType type) {
        if (isInCreateMode()) {
            this.createCreateUpdateSqlRoleDefinitionParameters.withType(type);
            return this;
        } else {
            this.updateCreateUpdateSqlRoleDefinitionParameters.withType(type);
            return this;
        }
    }

    public SqlRoleDefinitionGetResultsImpl withAssignableScopes(List<String> assignableScopes) {
        if (isInCreateMode()) {
            this.createCreateUpdateSqlRoleDefinitionParameters.withAssignableScopes(assignableScopes);
            return this;
        } else {
            this.updateCreateUpdateSqlRoleDefinitionParameters.withAssignableScopes(assignableScopes);
            return this;
        }
    }

    public SqlRoleDefinitionGetResultsImpl withPermissions(List<Permission> permissions) {
        if (isInCreateMode()) {
            this.createCreateUpdateSqlRoleDefinitionParameters.withPermissions(permissions);
            return this;
        } else {
            this.updateCreateUpdateSqlRoleDefinitionParameters.withPermissions(permissions);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
