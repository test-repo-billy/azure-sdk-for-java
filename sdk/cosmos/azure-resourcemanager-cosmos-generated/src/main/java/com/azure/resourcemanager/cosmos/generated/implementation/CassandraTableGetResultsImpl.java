// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.fluent.models.CassandraTableGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.models.CassandraTableCreateUpdateParameters;
import com.azure.resourcemanager.cosmos.generated.models.CassandraTableGetPropertiesOptions;
import com.azure.resourcemanager.cosmos.generated.models.CassandraTableGetPropertiesResource;
import com.azure.resourcemanager.cosmos.generated.models.CassandraTableGetResults;
import com.azure.resourcemanager.cosmos.generated.models.CassandraTableResource;
import com.azure.resourcemanager.cosmos.generated.models.CreateUpdateOptions;
import com.azure.resourcemanager.cosmos.generated.models.ManagedServiceIdentity;
import java.util.Collections;
import java.util.Map;

public final class CassandraTableGetResultsImpl
    implements CassandraTableGetResults, CassandraTableGetResults.Definition, CassandraTableGetResults.Update {
    private CassandraTableGetResultsInner innerObject;

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

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public CassandraTableGetPropertiesResource resource() {
        return this.innerModel().resource();
    }

    public CassandraTableGetPropertiesOptions options() {
        return this.innerModel().options();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public CassandraTableGetResultsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String keyspaceName;

    private String tableName;

    private CassandraTableCreateUpdateParameters createCreateUpdateCassandraTableParameters;

    private CassandraTableCreateUpdateParameters updateCreateUpdateCassandraTableParameters;

    public CassandraTableGetResultsImpl withExistingCassandraKeyspace(String resourceGroupName, String accountName,
        String keyspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.keyspaceName = keyspaceName;
        return this;
    }

    public CassandraTableGetResults create() {
        this.innerObject
            = serviceManager.serviceClient().getCassandraResources().createUpdateCassandraTable(resourceGroupName,
                accountName, keyspaceName, tableName, createCreateUpdateCassandraTableParameters, Context.NONE);
        return this;
    }

    public CassandraTableGetResults create(Context context) {
        this.innerObject
            = serviceManager.serviceClient().getCassandraResources().createUpdateCassandraTable(resourceGroupName,
                accountName, keyspaceName, tableName, createCreateUpdateCassandraTableParameters, context);
        return this;
    }

    CassandraTableGetResultsImpl(String name,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = new CassandraTableGetResultsInner();
        this.serviceManager = serviceManager;
        this.tableName = name;
        this.createCreateUpdateCassandraTableParameters = new CassandraTableCreateUpdateParameters();
    }

    public CassandraTableGetResultsImpl update() {
        this.updateCreateUpdateCassandraTableParameters = new CassandraTableCreateUpdateParameters();
        return this;
    }

    public CassandraTableGetResults apply() {
        this.innerObject
            = serviceManager.serviceClient().getCassandraResources().createUpdateCassandraTable(resourceGroupName,
                accountName, keyspaceName, tableName, updateCreateUpdateCassandraTableParameters, Context.NONE);
        return this;
    }

    public CassandraTableGetResults apply(Context context) {
        this.innerObject
            = serviceManager.serviceClient().getCassandraResources().createUpdateCassandraTable(resourceGroupName,
                accountName, keyspaceName, tableName, updateCreateUpdateCassandraTableParameters, context);
        return this;
    }

    CassandraTableGetResultsImpl(CassandraTableGetResultsInner innerObject,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "databaseAccounts");
        this.keyspaceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "cassandraKeyspaces");
        this.tableName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "tables");
    }

    public CassandraTableGetResults refresh() {
        this.innerObject = serviceManager.serviceClient().getCassandraResources()
            .getCassandraTableWithResponse(resourceGroupName, accountName, keyspaceName, tableName, Context.NONE)
            .getValue();
        return this;
    }

    public CassandraTableGetResults refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getCassandraResources()
            .getCassandraTableWithResponse(resourceGroupName, accountName, keyspaceName, tableName, context).getValue();
        return this;
    }

    public CassandraTableGetResultsImpl withRegion(Region location) {
        this.createCreateUpdateCassandraTableParameters.withLocation(location.toString());
        return this;
    }

    public CassandraTableGetResultsImpl withRegion(String location) {
        this.createCreateUpdateCassandraTableParameters.withLocation(location);
        return this;
    }

    public CassandraTableGetResultsImpl withResource(CassandraTableResource resource) {
        if (isInCreateMode()) {
            this.createCreateUpdateCassandraTableParameters.withResource(resource);
            return this;
        } else {
            this.updateCreateUpdateCassandraTableParameters.withResource(resource);
            return this;
        }
    }

    public CassandraTableGetResultsImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createCreateUpdateCassandraTableParameters.withTags(tags);
            return this;
        } else {
            this.updateCreateUpdateCassandraTableParameters.withTags(tags);
            return this;
        }
    }

    public CassandraTableGetResultsImpl withIdentity(ManagedServiceIdentity identity) {
        if (isInCreateMode()) {
            this.createCreateUpdateCassandraTableParameters.withIdentity(identity);
            return this;
        } else {
            this.updateCreateUpdateCassandraTableParameters.withIdentity(identity);
            return this;
        }
    }

    public CassandraTableGetResultsImpl withOptions(CreateUpdateOptions options) {
        if (isInCreateMode()) {
            this.createCreateUpdateCassandraTableParameters.withOptions(options);
            return this;
        } else {
            this.updateCreateUpdateCassandraTableParameters.withOptions(options);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
