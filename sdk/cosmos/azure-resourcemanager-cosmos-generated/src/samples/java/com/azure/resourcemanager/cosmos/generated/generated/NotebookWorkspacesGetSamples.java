// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

import com.azure.resourcemanager.cosmos.generated.models.NotebookWorkspaceName;

/**
 * Samples for NotebookWorkspaces Get.
 */
public final class NotebookWorkspacesGetSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-01-15-preview/examples/
     * CosmosDBNotebookWorkspaceGet.json
     */
    /**
     * Sample code: CosmosDBNotebookWorkspaceGet.
     * 
     * @param manager Entry point to CosmosDBManager.
     */
    public static void
        cosmosDBNotebookWorkspaceGet(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.notebookWorkspaces().getWithResponse("rg1", "ddb1", NotebookWorkspaceName.DEFAULT,
            com.azure.core.util.Context.NONE);
    }
}
