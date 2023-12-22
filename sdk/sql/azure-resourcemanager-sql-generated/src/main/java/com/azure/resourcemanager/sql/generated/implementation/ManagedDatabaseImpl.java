// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedDatabaseInner;
import com.azure.resourcemanager.sql.generated.models.CatalogCollationType;
import com.azure.resourcemanager.sql.generated.models.CompleteDatabaseRestoreDefinition;
import com.azure.resourcemanager.sql.generated.models.ManagedDatabase;
import com.azure.resourcemanager.sql.generated.models.ManagedDatabaseCreateMode;
import com.azure.resourcemanager.sql.generated.models.ManagedDatabaseMoveDefinition;
import com.azure.resourcemanager.sql.generated.models.ManagedDatabaseStartMoveDefinition;
import com.azure.resourcemanager.sql.generated.models.ManagedDatabaseStatus;
import com.azure.resourcemanager.sql.generated.models.ManagedDatabaseUpdate;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class ManagedDatabaseImpl implements ManagedDatabase, ManagedDatabase.Definition, ManagedDatabase.Update {
    private ManagedDatabaseInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

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

    public String collation() {
        return this.innerModel().collation();
    }

    public ManagedDatabaseStatus status() {
        return this.innerModel().status();
    }

    public OffsetDateTime creationDate() {
        return this.innerModel().creationDate();
    }

    public OffsetDateTime earliestRestorePoint() {
        return this.innerModel().earliestRestorePoint();
    }

    public OffsetDateTime restorePointInTime() {
        return this.innerModel().restorePointInTime();
    }

    public String defaultSecondaryLocation() {
        return this.innerModel().defaultSecondaryLocation();
    }

    public CatalogCollationType catalogCollation() {
        return this.innerModel().catalogCollation();
    }

    public ManagedDatabaseCreateMode createMode() {
        return this.innerModel().createMode();
    }

    public String storageContainerUri() {
        return this.innerModel().storageContainerUri();
    }

    public String sourceDatabaseId() {
        return this.innerModel().sourceDatabaseId();
    }

    public String crossSubscriptionSourceDatabaseId() {
        return this.innerModel().crossSubscriptionSourceDatabaseId();
    }

    public String restorableDroppedDatabaseId() {
        return this.innerModel().restorableDroppedDatabaseId();
    }

    public String crossSubscriptionRestorableDroppedDatabaseId() {
        return this.innerModel().crossSubscriptionRestorableDroppedDatabaseId();
    }

    public String storageContainerIdentity() {
        return this.innerModel().storageContainerIdentity();
    }

    public String storageContainerSasToken() {
        return this.innerModel().storageContainerSasToken();
    }

    public String failoverGroupId() {
        return this.innerModel().failoverGroupId();
    }

    public String recoverableDatabaseId() {
        return this.innerModel().recoverableDatabaseId();
    }

    public String longTermRetentionBackupResourceId() {
        return this.innerModel().longTermRetentionBackupResourceId();
    }

    public Boolean autoCompleteRestore() {
        return this.innerModel().autoCompleteRestore();
    }

    public String lastBackupName() {
        return this.innerModel().lastBackupName();
    }

    public String crossSubscriptionTargetManagedInstanceId() {
        return this.innerModel().crossSubscriptionTargetManagedInstanceId();
    }

    public Boolean isLedgerOn() {
        return this.innerModel().isLedgerOn();
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

    public ManagedDatabaseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String managedInstanceName;

    private String databaseName;

    private ManagedDatabaseUpdate updateParameters;

    public ManagedDatabaseImpl withExistingManagedInstance(String resourceGroupName, String managedInstanceName) {
        this.resourceGroupName = resourceGroupName;
        this.managedInstanceName = managedInstanceName;
        return this;
    }

    public ManagedDatabase create() {
        this.innerObject = serviceManager.serviceClient().getManagedDatabases().createOrUpdate(resourceGroupName,
            managedInstanceName, databaseName, this.innerModel(), Context.NONE);
        return this;
    }

    public ManagedDatabase create(Context context) {
        this.innerObject = serviceManager.serviceClient().getManagedDatabases().createOrUpdate(resourceGroupName,
            managedInstanceName, databaseName, this.innerModel(), context);
        return this;
    }

    ManagedDatabaseImpl(String name, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = new ManagedDatabaseInner();
        this.serviceManager = serviceManager;
        this.databaseName = name;
    }

    public ManagedDatabaseImpl update() {
        this.updateParameters = new ManagedDatabaseUpdate();
        return this;
    }

    public ManagedDatabase apply() {
        this.innerObject = serviceManager.serviceClient().getManagedDatabases().update(resourceGroupName,
            managedInstanceName, databaseName, updateParameters, Context.NONE);
        return this;
    }

    public ManagedDatabase apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getManagedDatabases().update(resourceGroupName,
            managedInstanceName, databaseName, updateParameters, context);
        return this;
    }

    ManagedDatabaseImpl(ManagedDatabaseInner innerObject,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.managedInstanceName = Utils.getValueFromIdByName(innerObject.id(), "managedInstances");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "databases");
    }

    public ManagedDatabase refresh() {
        this.innerObject = serviceManager.serviceClient().getManagedDatabases()
            .getWithResponse(resourceGroupName, managedInstanceName, databaseName, Context.NONE).getValue();
        return this;
    }

    public ManagedDatabase refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getManagedDatabases()
            .getWithResponse(resourceGroupName, managedInstanceName, databaseName, context).getValue();
        return this;
    }

    public void cancelMove(ManagedDatabaseMoveDefinition parameters) {
        serviceManager.managedDatabases().cancelMove(resourceGroupName, managedInstanceName, databaseName, parameters);
    }

    public void cancelMove(ManagedDatabaseMoveDefinition parameters, Context context) {
        serviceManager.managedDatabases().cancelMove(resourceGroupName, managedInstanceName, databaseName, parameters,
            context);
    }

    public void completeMove(ManagedDatabaseMoveDefinition parameters) {
        serviceManager.managedDatabases().completeMove(resourceGroupName, managedInstanceName, databaseName,
            parameters);
    }

    public void completeMove(ManagedDatabaseMoveDefinition parameters, Context context) {
        serviceManager.managedDatabases().completeMove(resourceGroupName, managedInstanceName, databaseName, parameters,
            context);
    }

    public void completeRestore(CompleteDatabaseRestoreDefinition parameters) {
        serviceManager.managedDatabases().completeRestore(resourceGroupName, managedInstanceName, databaseName,
            parameters);
    }

    public void completeRestore(CompleteDatabaseRestoreDefinition parameters, Context context) {
        serviceManager.managedDatabases().completeRestore(resourceGroupName, managedInstanceName, databaseName,
            parameters, context);
    }

    public void startMove(ManagedDatabaseStartMoveDefinition parameters) {
        serviceManager.managedDatabases().startMove(resourceGroupName, managedInstanceName, databaseName, parameters);
    }

    public void startMove(ManagedDatabaseStartMoveDefinition parameters, Context context) {
        serviceManager.managedDatabases().startMove(resourceGroupName, managedInstanceName, databaseName, parameters,
            context);
    }

    public ManagedDatabaseImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ManagedDatabaseImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ManagedDatabaseImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ManagedDatabaseImpl withCollation(String collation) {
        this.innerModel().withCollation(collation);
        return this;
    }

    public ManagedDatabaseImpl withRestorePointInTime(OffsetDateTime restorePointInTime) {
        this.innerModel().withRestorePointInTime(restorePointInTime);
        return this;
    }

    public ManagedDatabaseImpl withCatalogCollation(CatalogCollationType catalogCollation) {
        this.innerModel().withCatalogCollation(catalogCollation);
        return this;
    }

    public ManagedDatabaseImpl withCreateMode(ManagedDatabaseCreateMode createMode) {
        this.innerModel().withCreateMode(createMode);
        return this;
    }

    public ManagedDatabaseImpl withStorageContainerUri(String storageContainerUri) {
        this.innerModel().withStorageContainerUri(storageContainerUri);
        return this;
    }

    public ManagedDatabaseImpl withSourceDatabaseId(String sourceDatabaseId) {
        this.innerModel().withSourceDatabaseId(sourceDatabaseId);
        return this;
    }

    public ManagedDatabaseImpl withCrossSubscriptionSourceDatabaseId(String crossSubscriptionSourceDatabaseId) {
        this.innerModel().withCrossSubscriptionSourceDatabaseId(crossSubscriptionSourceDatabaseId);
        return this;
    }

    public ManagedDatabaseImpl withRestorableDroppedDatabaseId(String restorableDroppedDatabaseId) {
        this.innerModel().withRestorableDroppedDatabaseId(restorableDroppedDatabaseId);
        return this;
    }

    public ManagedDatabaseImpl
        withCrossSubscriptionRestorableDroppedDatabaseId(String crossSubscriptionRestorableDroppedDatabaseId) {
        this.innerModel()
            .withCrossSubscriptionRestorableDroppedDatabaseId(crossSubscriptionRestorableDroppedDatabaseId);
        return this;
    }

    public ManagedDatabaseImpl withStorageContainerIdentity(String storageContainerIdentity) {
        this.innerModel().withStorageContainerIdentity(storageContainerIdentity);
        return this;
    }

    public ManagedDatabaseImpl withStorageContainerSasToken(String storageContainerSasToken) {
        this.innerModel().withStorageContainerSasToken(storageContainerSasToken);
        return this;
    }

    public ManagedDatabaseImpl withRecoverableDatabaseId(String recoverableDatabaseId) {
        this.innerModel().withRecoverableDatabaseId(recoverableDatabaseId);
        return this;
    }

    public ManagedDatabaseImpl withLongTermRetentionBackupResourceId(String longTermRetentionBackupResourceId) {
        this.innerModel().withLongTermRetentionBackupResourceId(longTermRetentionBackupResourceId);
        return this;
    }

    public ManagedDatabaseImpl withAutoCompleteRestore(Boolean autoCompleteRestore) {
        this.innerModel().withAutoCompleteRestore(autoCompleteRestore);
        return this;
    }

    public ManagedDatabaseImpl withLastBackupName(String lastBackupName) {
        this.innerModel().withLastBackupName(lastBackupName);
        return this;
    }

    public ManagedDatabaseImpl
        withCrossSubscriptionTargetManagedInstanceId(String crossSubscriptionTargetManagedInstanceId) {
        this.innerModel().withCrossSubscriptionTargetManagedInstanceId(crossSubscriptionTargetManagedInstanceId);
        return this;
    }

    public ManagedDatabaseImpl withIsLedgerOn(Boolean isLedgerOn) {
        this.innerModel().withIsLedgerOn(isLedgerOn);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
