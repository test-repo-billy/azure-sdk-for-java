/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.management.sql.v2014_04_01.Database;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.sql.v2014_04_01.DatabaseUpdate;
import java.util.Map;
import org.joda.time.DateTime;
import java.util.UUID;
import java.util.List;
import com.microsoft.azure.management.sql.v2014_04_01.CreateMode;
import com.microsoft.azure.management.sql.v2014_04_01.DatabaseEdition;
import com.microsoft.azure.management.sql.v2014_04_01.ServiceObjectiveName;
import com.microsoft.azure.management.sql.v2014_04_01.RecommendedIndex;
import com.microsoft.azure.management.sql.v2014_04_01.ReadScale;
import com.microsoft.azure.management.sql.v2014_04_01.SampleName;
import java.util.ArrayList;
import com.microsoft.azure.management.sql.v2014_04_01.ServiceTierAdvisor;
import com.microsoft.azure.management.sql.v2014_04_01.TransparentDataEncryption;
import rx.functions.Func1;

class DatabaseImpl extends CreatableUpdatableImpl<Database, DatabaseInner, DatabaseImpl> implements Database, Database.Definition, Database.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private String databaseName;
    private DatabaseUpdate updateParameter;

    DatabaseImpl(String name, SqlManager manager) {
        super(name, new DatabaseInner());
        this.manager = manager;
        // Set resource name
        this.databaseName = name;
        //
        this.updateParameter = new DatabaseUpdate();
    }

    DatabaseImpl(DatabaseInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.databaseName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "databases");
        //
        this.updateParameter = new DatabaseUpdate();
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Database> createResourceAsync() {
        DatabasesInner client = this.manager().inner().databases();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.databaseName, this.inner())
            .map(new Func1<DatabaseInner, DatabaseInner>() {
               @Override
               public DatabaseInner call(DatabaseInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Database> updateResourceAsync() {
        DatabasesInner client = this.manager().inner().databases();
        return client.updateAsync(this.resourceGroupName, this.serverName, this.databaseName, this.updateParameter)
            .map(new Func1<DatabaseInner, DatabaseInner>() {
               @Override
               public DatabaseInner call(DatabaseInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DatabaseInner> getInnerAsync() {
        DatabasesInner client = this.manager().inner().databases();
        return client.getAsync(this.resourceGroupName, this.serverName, this.databaseName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new DatabaseUpdate();
    }

    @Override
    public String collation() {
        return this.inner().collation();
    }

    @Override
    public Long containmentState() {
        return this.inner().containmentState();
    }

    @Override
    public CreateMode createMode() {
        return this.inner().createMode();
    }

    @Override
    public DateTime creationDate() {
        return this.inner().creationDate();
    }

    @Override
    public UUID currentServiceObjectiveId() {
        return this.inner().currentServiceObjectiveId();
    }

    @Override
    public UUID databaseId() {
        return this.inner().databaseId();
    }

    @Override
    public String defaultSecondaryLocation() {
        return this.inner().defaultSecondaryLocation();
    }

    @Override
    public DateTime earliestRestoreDate() {
        return this.inner().earliestRestoreDate();
    }

    @Override
    public DatabaseEdition edition() {
        return this.inner().edition();
    }

    @Override
    public String elasticPoolName() {
        return this.inner().elasticPoolName();
    }

    @Override
    public String failoverGroupId() {
        return this.inner().failoverGroupId();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String maxSizeBytes() {
        return this.inner().maxSizeBytes();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ReadScale readScale() {
        return this.inner().readScale();
    }

    @Override
    public List<RecommendedIndex> recommendedIndex() {
        return this.inner().recommendedIndex();
    }

    @Override
    public String recoveryServicesRecoveryPointResourceId() {
        return this.inner().recoveryServicesRecoveryPointResourceId();
    }

    @Override
    public UUID requestedServiceObjectiveId() {
        return this.inner().requestedServiceObjectiveId();
    }

    @Override
    public ServiceObjectiveName requestedServiceObjectiveName() {
        return this.inner().requestedServiceObjectiveName();
    }

    @Override
    public DateTime restorePointInTime() {
        return this.inner().restorePointInTime();
    }

    @Override
    public SampleName sampleName() {
        return this.inner().sampleName();
    }

    @Override
    public ServiceObjectiveName serviceLevelObjective() {
        return this.inner().serviceLevelObjective();
    }

    @Override
    public List<ServiceTierAdvisor> serviceTierAdvisors() {
        List<ServiceTierAdvisor> lst = new ArrayList<ServiceTierAdvisor>();
        if (this.inner().serviceTierAdvisors() != null) {
            for (ServiceTierAdvisorInner inner : this.inner().serviceTierAdvisors()) {
                lst.add( new ServiceTierAdvisorImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public DateTime sourceDatabaseDeletionDate() {
        return this.inner().sourceDatabaseDeletionDate();
    }

    @Override
    public String sourceDatabaseId() {
        return this.inner().sourceDatabaseId();
    }

    @Override
    public String status() {
        return this.inner().status();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public List<TransparentDataEncryption> transparentDataEncryption() {
        List<TransparentDataEncryption> lst = new ArrayList<TransparentDataEncryption>();
        if (this.inner().transparentDataEncryption() != null) {
            for (TransparentDataEncryptionInner inner : this.inner().transparentDataEncryption()) {
                lst.add( new TransparentDataEncryptionImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public Boolean zoneRedundant() {
        return this.inner().zoneRedundant();
    }

    @Override
    public DatabaseImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    @Override
    public DatabaseImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public DatabaseImpl withCollation(String collation) {
        if (isInCreateMode()) {
            this.inner().withCollation(collation);
        } else {
            this.updateParameter.withCollation(collation);
        }
        return this;
    }

    @Override
    public DatabaseImpl withCreateMode(CreateMode createMode) {
        if (isInCreateMode()) {
            this.inner().withCreateMode(createMode);
        } else {
            this.updateParameter.withCreateMode(createMode);
        }
        return this;
    }

    @Override
    public DatabaseImpl withEdition(DatabaseEdition edition) {
        if (isInCreateMode()) {
            this.inner().withEdition(edition);
        } else {
            this.updateParameter.withEdition(edition);
        }
        return this;
    }

    @Override
    public DatabaseImpl withElasticPoolName(String elasticPoolName) {
        if (isInCreateMode()) {
            this.inner().withElasticPoolName(elasticPoolName);
        } else {
            this.updateParameter.withElasticPoolName(elasticPoolName);
        }
        return this;
    }

    @Override
    public DatabaseImpl withMaxSizeBytes(String maxSizeBytes) {
        if (isInCreateMode()) {
            this.inner().withMaxSizeBytes(maxSizeBytes);
        } else {
            this.updateParameter.withMaxSizeBytes(maxSizeBytes);
        }
        return this;
    }

    @Override
    public DatabaseImpl withReadScale(ReadScale readScale) {
        if (isInCreateMode()) {
            this.inner().withReadScale(readScale);
        } else {
            this.updateParameter.withReadScale(readScale);
        }
        return this;
    }

    @Override
    public DatabaseImpl withRecoveryServicesRecoveryPointResourceId(String recoveryServicesRecoveryPointResourceId) {
        if (isInCreateMode()) {
            this.inner().withRecoveryServicesRecoveryPointResourceId(recoveryServicesRecoveryPointResourceId);
        } else {
            this.updateParameter.withRecoveryServicesRecoveryPointResourceId(recoveryServicesRecoveryPointResourceId);
        }
        return this;
    }

    @Override
    public DatabaseImpl withRequestedServiceObjectiveId(UUID requestedServiceObjectiveId) {
        if (isInCreateMode()) {
            this.inner().withRequestedServiceObjectiveId(requestedServiceObjectiveId);
        } else {
            this.updateParameter.withRequestedServiceObjectiveId(requestedServiceObjectiveId);
        }
        return this;
    }

    @Override
    public DatabaseImpl withRequestedServiceObjectiveName(ServiceObjectiveName requestedServiceObjectiveName) {
        if (isInCreateMode()) {
            this.inner().withRequestedServiceObjectiveName(requestedServiceObjectiveName);
        } else {
            this.updateParameter.withRequestedServiceObjectiveName(requestedServiceObjectiveName);
        }
        return this;
    }

    @Override
    public DatabaseImpl withRestorePointInTime(DateTime restorePointInTime) {
        if (isInCreateMode()) {
            this.inner().withRestorePointInTime(restorePointInTime);
        } else {
            this.updateParameter.withRestorePointInTime(restorePointInTime);
        }
        return this;
    }

    @Override
    public DatabaseImpl withSampleName(SampleName sampleName) {
        if (isInCreateMode()) {
            this.inner().withSampleName(sampleName);
        } else {
            this.updateParameter.withSampleName(sampleName);
        }
        return this;
    }

    @Override
    public DatabaseImpl withSourceDatabaseDeletionDate(DateTime sourceDatabaseDeletionDate) {
        if (isInCreateMode()) {
            this.inner().withSourceDatabaseDeletionDate(sourceDatabaseDeletionDate);
        } else {
            this.updateParameter.withSourceDatabaseDeletionDate(sourceDatabaseDeletionDate);
        }
        return this;
    }

    @Override
    public DatabaseImpl withSourceDatabaseId(String sourceDatabaseId) {
        if (isInCreateMode()) {
            this.inner().withSourceDatabaseId(sourceDatabaseId);
        } else {
            this.updateParameter.withSourceDatabaseId(sourceDatabaseId);
        }
        return this;
    }

    @Override
    public DatabaseImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

    @Override
    public DatabaseImpl withZoneRedundant(Boolean zoneRedundant) {
        if (isInCreateMode()) {
            this.inner().withZoneRedundant(zoneRedundant);
        } else {
            this.updateParameter.withZoneRedundant(zoneRedundant);
        }
        return this;
    }

}
