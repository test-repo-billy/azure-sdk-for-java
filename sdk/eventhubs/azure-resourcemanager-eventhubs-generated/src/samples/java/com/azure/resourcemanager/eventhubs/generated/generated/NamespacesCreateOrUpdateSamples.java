// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.generated;

import com.azure.resourcemanager.eventhubs.generated.models.Encryption;
import com.azure.resourcemanager.eventhubs.generated.models.GeoDataReplicationProperties;
import com.azure.resourcemanager.eventhubs.generated.models.GeoDRRoleType;
import com.azure.resourcemanager.eventhubs.generated.models.Identity;
import com.azure.resourcemanager.eventhubs.generated.models.KeySource;
import com.azure.resourcemanager.eventhubs.generated.models.KeyVaultProperties;
import com.azure.resourcemanager.eventhubs.generated.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.eventhubs.generated.models.NamespaceReplicaLocation;
import com.azure.resourcemanager.eventhubs.generated.models.UserAssignedIdentity;
import com.azure.resourcemanager.eventhubs.generated.models.UserAssignedIdentityProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Namespaces CreateOrUpdate.
 */
public final class NamespacesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/eventhub/resource-manager/Microsoft.EventHub/preview/2024-05-01-preview/examples/NameSpaces/EHNameSpaceCreate.json
     */
    /**
     * Sample code: NamespaceCreate.
     * 
     * @param manager Entry point to EventHubsManager.
     */
    public static void namespaceCreate(com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager) {
        manager.namespaces()
            .define("NamespaceSample")
            .withRegion("East US")
            .withExistingResourceGroup("ResurceGroupSample")
            .withIdentity(new Identity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/SampleSubscription/resourceGroups/ResurceGroupSample/providers/Microsoft.ManagedIdentity/userAssignedIdentities/ud1",
                    new UserAssignedIdentity(),
                    "/subscriptions/SampleSubscription/resourceGroups/ResurceGroupSample/providers/Microsoft.ManagedIdentity/userAssignedIdentities/ud2",
                    new UserAssignedIdentity())))
            .withClusterArmId(
                "/subscriptions/SampleSubscription/resourceGroups/ResurceGroupSample/providers/Microsoft.EventHub/clusters/enc-test")
            .withEncryption(new Encryption().withKeyVaultProperties(Arrays.asList(new KeyVaultProperties()
                .withKeyName("fakeTokenPlaceholder")
                .withKeyVaultUri("fakeTokenPlaceholder")
                .withIdentity(new UserAssignedIdentityProperties().withUserAssignedIdentity(
                    "/subscriptions/SampleSubscription/resourceGroups/ResurceGroupSample/providers/Microsoft.ManagedIdentity/userAssignedIdentities/ud1"))))
                .withKeySource(KeySource.MICROSOFT_KEY_VAULT))
            .withGeoDataReplication(new GeoDataReplicationProperties().withMaxReplicationLagDurationInSeconds(300)
                .withLocations(Arrays.asList(
                    new NamespaceReplicaLocation().withLocationName("eastus").withRoleType(GeoDRRoleType.PRIMARY),
                    new NamespaceReplicaLocation().withLocationName("southcentralus")
                        .withRoleType(GeoDRRoleType.SECONDARY))))
            .create();
    }

    /*
     * x-ms-original-file: specification/eventhub/resource-manager/Microsoft.EventHub/preview/2024-05-01-preview/examples/NameSpaces/NamespaceWithGeoDRCreate.json
     */
    /**
     * Sample code: NamespaceWithGeoDRCreate.
     * 
     * @param manager Entry point to EventHubsManager.
     */
    public static void
        namespaceWithGeoDRCreate(com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager) {
        manager.namespaces()
            .define("NamespaceGeoDRCreateSample")
            .withRegion("East US")
            .withExistingResourceGroup("ResurceGroupSample")
            .withGeoDataReplication(new GeoDataReplicationProperties().withMaxReplicationLagDurationInSeconds(60)
                .withLocations(Arrays.asList(
                    new NamespaceReplicaLocation().withLocationName("eastus").withRoleType(GeoDRRoleType.PRIMARY),
                    new NamespaceReplicaLocation().withLocationName("westus").withRoleType(GeoDRRoleType.SECONDARY),
                    new NamespaceReplicaLocation().withLocationName("centralus")
                        .withRoleType(GeoDRRoleType.SECONDARY))))
            .create();
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
