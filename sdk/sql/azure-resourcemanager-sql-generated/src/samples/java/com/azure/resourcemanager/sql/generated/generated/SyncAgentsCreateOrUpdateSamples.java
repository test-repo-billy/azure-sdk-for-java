// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.resourcemanager.sql.generated.models.SyncAgent;

/**
 * Samples for SyncAgents CreateOrUpdate.
 */
public final class SyncAgentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/SyncAgentCreate.json
     */
    /**
     * Sample code: Create a new sync agent.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void createANewSyncAgent(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.syncAgents().define("syncagentcrud-3187")
            .withExistingServer("syncagentcrud-65440", "syncagentcrud-8475")
            .withSyncDatabaseId(
                "/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default-SQL-Onebox/providers/Microsoft.Sql/servers/syncagentcrud-8475/databases/sync")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/SyncAgentUpdate.json
     */
    /**
     * Sample code: Update a sync agent.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void updateASyncAgent(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        SyncAgent resource = manager.syncAgents().getWithResponse("syncagentcrud-65440", "syncagentcrud-8475",
            "syncagentcrud-3187", com.azure.core.util.Context.NONE).getValue();
        resource.update().withSyncDatabaseId(
            "/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default-SQL-Onebox/providers/Microsoft.Sql/servers/syncagentcrud-8475/databases/sync")
            .apply();
    }
}
