// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.fluent.models.MongoDBCollectionGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.models.BackupInformation;
import com.azure.resourcemanager.cosmos.generated.models.ContinuousBackupRestoreLocation;
import com.azure.resourcemanager.cosmos.generated.models.CreateUpdateOptions;
import com.azure.resourcemanager.cosmos.generated.models.ManagedServiceIdentity;
import com.azure.resourcemanager.cosmos.generated.models.MergeParameters;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBCollectionCreateUpdateParameters;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBCollectionGetPropertiesOptions;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBCollectionGetPropertiesResource;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBCollectionGetResults;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBCollectionResource;
import com.azure.resourcemanager.cosmos.generated.models.PhysicalPartitionStorageInfoCollection;
import java.util.Collections;
import java.util.Map;

public final class MongoDBCollectionGetResultsImpl
    implements MongoDBCollectionGetResults, MongoDBCollectionGetResults.Definition, MongoDBCollectionGetResults.Update {
    private MongoDBCollectionGetResultsInner innerObject;

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

    public MongoDBCollectionGetPropertiesResource resource() {
        return this.innerModel().resource();
    }

    public MongoDBCollectionGetPropertiesOptions options() {
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

    public MongoDBCollectionGetResultsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String databaseName;

    private String collectionName;

    private MongoDBCollectionCreateUpdateParameters createCreateUpdateMongoDBCollectionParameters;

    private MongoDBCollectionCreateUpdateParameters updateCreateUpdateMongoDBCollectionParameters;

    public MongoDBCollectionGetResultsImpl withExistingMongodbDatabase(String resourceGroupName, String accountName,
        String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.databaseName = databaseName;
        return this;
    }

    public MongoDBCollectionGetResults create() {
        this.innerObject
            = serviceManager.serviceClient().getMongoDBResources().createUpdateMongoDBCollection(resourceGroupName,
                accountName, databaseName, collectionName, createCreateUpdateMongoDBCollectionParameters, Context.NONE);
        return this;
    }

    public MongoDBCollectionGetResults create(Context context) {
        this.innerObject
            = serviceManager.serviceClient().getMongoDBResources().createUpdateMongoDBCollection(resourceGroupName,
                accountName, databaseName, collectionName, createCreateUpdateMongoDBCollectionParameters, context);
        return this;
    }

    MongoDBCollectionGetResultsImpl(String name,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = new MongoDBCollectionGetResultsInner();
        this.serviceManager = serviceManager;
        this.collectionName = name;
        this.createCreateUpdateMongoDBCollectionParameters = new MongoDBCollectionCreateUpdateParameters();
    }

    public MongoDBCollectionGetResultsImpl update() {
        this.updateCreateUpdateMongoDBCollectionParameters = new MongoDBCollectionCreateUpdateParameters();
        return this;
    }

    public MongoDBCollectionGetResults apply() {
        this.innerObject
            = serviceManager.serviceClient().getMongoDBResources().createUpdateMongoDBCollection(resourceGroupName,
                accountName, databaseName, collectionName, updateCreateUpdateMongoDBCollectionParameters, Context.NONE);
        return this;
    }

    public MongoDBCollectionGetResults apply(Context context) {
        this.innerObject
            = serviceManager.serviceClient().getMongoDBResources().createUpdateMongoDBCollection(resourceGroupName,
                accountName, databaseName, collectionName, updateCreateUpdateMongoDBCollectionParameters, context);
        return this;
    }

    MongoDBCollectionGetResultsImpl(MongoDBCollectionGetResultsInner innerObject,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "databaseAccounts");
        this.databaseName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "mongodbDatabases");
        this.collectionName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "collections");
    }

    public MongoDBCollectionGetResults refresh() {
        this.innerObject
            = serviceManager.serviceClient().getMongoDBResources().getMongoDBCollectionWithResponse(resourceGroupName,
                accountName, databaseName, collectionName, Context.NONE).getValue();
        return this;
    }

    public MongoDBCollectionGetResults refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getMongoDBResources()
            .getMongoDBCollectionWithResponse(resourceGroupName, accountName, databaseName, collectionName, context)
            .getValue();
        return this;
    }

    public PhysicalPartitionStorageInfoCollection listMongoDBCollectionPartitionMerge(MergeParameters mergeParameters) {
        return serviceManager.mongoDBResources().listMongoDBCollectionPartitionMerge(resourceGroupName, accountName,
            databaseName, collectionName, mergeParameters);
    }

    public PhysicalPartitionStorageInfoCollection listMongoDBCollectionPartitionMerge(MergeParameters mergeParameters,
        Context context) {
        return serviceManager.mongoDBResources().listMongoDBCollectionPartitionMerge(resourceGroupName, accountName,
            databaseName, collectionName, mergeParameters, context);
    }

    public BackupInformation retrieveContinuousBackupInformation(ContinuousBackupRestoreLocation location) {
        return serviceManager.mongoDBResources().retrieveContinuousBackupInformation(resourceGroupName, accountName,
            databaseName, collectionName, location);
    }

    public BackupInformation retrieveContinuousBackupInformation(ContinuousBackupRestoreLocation location,
        Context context) {
        return serviceManager.mongoDBResources().retrieveContinuousBackupInformation(resourceGroupName, accountName,
            databaseName, collectionName, location, context);
    }

    public MongoDBCollectionGetResultsImpl withRegion(Region location) {
        this.createCreateUpdateMongoDBCollectionParameters.withLocation(location.toString());
        return this;
    }

    public MongoDBCollectionGetResultsImpl withRegion(String location) {
        this.createCreateUpdateMongoDBCollectionParameters.withLocation(location);
        return this;
    }

    public MongoDBCollectionGetResultsImpl withResource(MongoDBCollectionResource resource) {
        if (isInCreateMode()) {
            this.createCreateUpdateMongoDBCollectionParameters.withResource(resource);
            return this;
        } else {
            this.updateCreateUpdateMongoDBCollectionParameters.withResource(resource);
            return this;
        }
    }

    public MongoDBCollectionGetResultsImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createCreateUpdateMongoDBCollectionParameters.withTags(tags);
            return this;
        } else {
            this.updateCreateUpdateMongoDBCollectionParameters.withTags(tags);
            return this;
        }
    }

    public MongoDBCollectionGetResultsImpl withIdentity(ManagedServiceIdentity identity) {
        if (isInCreateMode()) {
            this.createCreateUpdateMongoDBCollectionParameters.withIdentity(identity);
            return this;
        } else {
            this.updateCreateUpdateMongoDBCollectionParameters.withIdentity(identity);
            return this;
        }
    }

    public MongoDBCollectionGetResultsImpl withOptions(CreateUpdateOptions options) {
        if (isInCreateMode()) {
            this.createCreateUpdateMongoDBCollectionParameters.withOptions(options);
            return this;
        } else {
            this.updateCreateUpdateMongoDBCollectionParameters.withOptions(options);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
