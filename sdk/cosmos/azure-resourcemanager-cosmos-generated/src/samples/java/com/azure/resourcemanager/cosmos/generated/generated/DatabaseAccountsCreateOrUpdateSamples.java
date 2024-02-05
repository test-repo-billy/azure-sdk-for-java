// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.resourcemanager.cosmos.generated.models.AnalyticalStorageConfiguration;
import com.azure.resourcemanager.cosmos.generated.models.AnalyticalStorageSchemaType;
import com.azure.resourcemanager.cosmos.generated.models.ApiProperties;
import com.azure.resourcemanager.cosmos.generated.models.BackupStorageRedundancy;
import com.azure.resourcemanager.cosmos.generated.models.Capacity;
import com.azure.resourcemanager.cosmos.generated.models.ConsistencyPolicy;
import com.azure.resourcemanager.cosmos.generated.models.ContinuousModeBackupPolicy;
import com.azure.resourcemanager.cosmos.generated.models.ContinuousModeProperties;
import com.azure.resourcemanager.cosmos.generated.models.ContinuousTier;
import com.azure.resourcemanager.cosmos.generated.models.CorsPolicy;
import com.azure.resourcemanager.cosmos.generated.models.CreateMode;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseAccountKind;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseRestoreResource;
import com.azure.resourcemanager.cosmos.generated.models.DefaultConsistencyLevel;
import com.azure.resourcemanager.cosmos.generated.models.DefaultPriorityLevel;
import com.azure.resourcemanager.cosmos.generated.models.IpAddressOrRange;
import com.azure.resourcemanager.cosmos.generated.models.Location;
import com.azure.resourcemanager.cosmos.generated.models.ManagedServiceIdentity;
import com.azure.resourcemanager.cosmos.generated.models.ManagedServiceIdentityUserAssignedIdentities;
import com.azure.resourcemanager.cosmos.generated.models.MinimalTlsVersion;
import com.azure.resourcemanager.cosmos.generated.models.NetworkAclBypass;
import com.azure.resourcemanager.cosmos.generated.models.PeriodicModeBackupPolicy;
import com.azure.resourcemanager.cosmos.generated.models.PeriodicModeProperties;
import com.azure.resourcemanager.cosmos.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.cosmos.generated.models.ResourceIdentityType;
import com.azure.resourcemanager.cosmos.generated.models.RestoreMode;
import com.azure.resourcemanager.cosmos.generated.models.RestoreParameters;
import com.azure.resourcemanager.cosmos.generated.models.ServerVersion;
import com.azure.resourcemanager.cosmos.generated.models.VirtualNetworkRule;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for DatabaseAccounts CreateOrUpdate.
 */
public final class DatabaseAccountsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-01-15-preview/examples/
     * CosmosDBRestoreDatabaseAccountCreateUpdate.json
     */
    /**
     * Sample code: CosmosDBRestoreDatabaseAccountCreateUpdate.json.
     * 
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBRestoreDatabaseAccountCreateUpdateJson(
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.databaseAccounts().define("ddb1").withRegion("westus").withExistingResourceGroup("rg1")
            .withLocations(Arrays.asList(
                new Location().withLocationName("southcentralus").withFailoverPriority(0).withIsZoneRedundant(false)))
            .withTags(mapOf()).withKind(DatabaseAccountKind.GLOBAL_DOCUMENT_DB)
            .withConsistencyPolicy(
                new ConsistencyPolicy().withDefaultConsistencyLevel(DefaultConsistencyLevel.BOUNDED_STALENESS)
                    .withMaxStalenessPrefix(200L).withMaxIntervalInSeconds(10))
            .withKeyVaultKeyUri("https://myKeyVault.vault.azure.net").withEnableFreeTier(false)
            .withApiProperties(new ApiProperties().withServerVersion(ServerVersion.THREE_TWO))
            .withEnableAnalyticalStorage(true).withCreateMode(CreateMode.RESTORE)
            .withBackupPolicy(new ContinuousModeBackupPolicy()
                .withContinuousModeProperties(new ContinuousModeProperties().withTier(ContinuousTier.CONTINUOUS30DAYS)))
            .withRestoreParameters(new RestoreParameters().withRestoreSource(
                "/subscriptions/subid/providers/Microsoft.DocumentDB/locations/westus/restorableDatabaseAccounts/1a97b4bb-f6a0-430e-ade1-638d781830cc")
                .withRestoreTimestampInUtc(OffsetDateTime.parse("2021-03-11T22:05:09Z"))
                .withRestoreMode(RestoreMode.POINT_IN_TIME)
                .withDatabasesToRestore(Arrays.asList(
                    new DatabaseRestoreResource().withDatabaseName("db1")
                        .withCollectionNames(Arrays.asList("collection1", "collection2")),
                    new DatabaseRestoreResource().withDatabaseName("db2")
                        .withCollectionNames(Arrays.asList("collection3", "collection4"))))
                .withSourceBackupLocation("westus"))
            .withEnableMaterializedViews(false).withMinimalTlsVersion(MinimalTlsVersion.TLS).create();
    }

    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-01-15-preview/examples/
     * CosmosDBDatabaseAccountCreateMax.json
     */
    /**
     * Sample code: CosmosDBDatabaseAccountCreateMax.
     * 
     * @param manager Entry point to CosmosDBManager.
     */
    public static void
        cosmosDBDatabaseAccountCreateMax(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.databaseAccounts().define("ddb1").withRegion("westus").withExistingResourceGroup("rg1")
            .withLocations(Arrays.asList(
                new Location().withLocationName("southcentralus").withFailoverPriority(0).withIsZoneRedundant(false),
                new Location().withLocationName("eastus").withFailoverPriority(1).withIsZoneRedundant(false)))
            .withTags(mapOf())
            .withIdentity(new ManagedServiceIdentity().withType(ResourceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/fa5fc227-a624-475e-b696-cdd604c735bc/resourceGroups/eu2cgroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/id1",
                    new ManagedServiceIdentityUserAssignedIdentities())))
            .withKind(DatabaseAccountKind.MONGO_DB)
            .withConsistencyPolicy(
                new ConsistencyPolicy().withDefaultConsistencyLevel(DefaultConsistencyLevel.BOUNDED_STALENESS)
                    .withMaxStalenessPrefix(200L).withMaxIntervalInSeconds(10))
            .withIpRules(
                Arrays.asList(new IpAddressOrRange().withIpAddressOrRange("23.43.230.120"),
                    new IpAddressOrRange().withIpAddressOrRange("110.12.240.0/12")))
            .withIsVirtualNetworkFilterEnabled(true)
            .withVirtualNetworkRules(Arrays.asList(new VirtualNetworkRule().withId(
                "/subscriptions/subId/resourceGroups/rg/providers/Microsoft.Network/virtualNetworks/vnet1/subnets/subnet1")
                .withIgnoreMissingVNetServiceEndpoint(false)))
            .withKeyVaultKeyUri("https://myKeyVault.vault.azure.net").withDefaultIdentity("FirstPartyIdentity")
            .withPublicNetworkAccess(PublicNetworkAccess.ENABLED).withEnableFreeTier(false)
            .withApiProperties(new ApiProperties().withServerVersion(ServerVersion.THREE_TWO))
            .withEnableAnalyticalStorage(true)
            .withAnalyticalStorageConfiguration(
                new AnalyticalStorageConfiguration().withSchemaType(AnalyticalStorageSchemaType.WELL_DEFINED))
            .withCreateMode(CreateMode.DEFAULT)
            .withBackupPolicy(new PeriodicModeBackupPolicy()
                .withPeriodicModeProperties(new PeriodicModeProperties().withBackupIntervalInMinutes(240)
                    .withBackupRetentionIntervalInHours(8).withBackupStorageRedundancy(BackupStorageRedundancy.GEO)))
            .withCors(Arrays.asList(new CorsPolicy().withAllowedOrigins("https://test")))
            .withNetworkAclBypass(NetworkAclBypass.AZURE_SERVICES)
            .withNetworkAclBypassResourceIds(Arrays.asList(
                "/subscriptions/subId/resourcegroups/rgName/providers/Microsoft.Synapse/workspaces/workspaceName"))
            .withCapacity(new Capacity().withTotalThroughputLimit(2000)).withEnableMaterializedViews(false)
            .withEnableBurstCapacity(true).withMinimalTlsVersion(MinimalTlsVersion.TLS12)
            .withEnablePriorityBasedExecution(true).withDefaultPriorityLevel(DefaultPriorityLevel.LOW).create();
    }

    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-01-15-preview/examples/
     * CosmosDBDatabaseAccountCreateMin.json
     */
    /**
     * Sample code: CosmosDBDatabaseAccountCreateMin.
     * 
     * @param manager Entry point to CosmosDBManager.
     */
    public static void
        cosmosDBDatabaseAccountCreateMin(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.databaseAccounts().define("ddb1").withRegion("westus").withExistingResourceGroup("rg1")
            .withLocations(Arrays.asList(
                new Location().withLocationName("southcentralus").withFailoverPriority(0).withIsZoneRedundant(false)))
            .withCreateMode(CreateMode.DEFAULT).create();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
