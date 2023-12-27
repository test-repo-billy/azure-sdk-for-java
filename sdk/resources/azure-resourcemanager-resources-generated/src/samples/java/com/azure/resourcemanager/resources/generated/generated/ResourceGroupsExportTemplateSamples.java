// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.generated;

import com.azure.resourcemanager.resources.generated.models.ExportTemplateRequest;
import java.util.Arrays;

/**
 * Samples for ResourceGroups ExportTemplate.
 */
public final class ResourceGroupsExportTemplateSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2023-07-01/examples/ExportResourceGroup.json
     */
    /**
     * Sample code: Export a resource group.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void exportAResourceGroup(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.resourceGroups().exportTemplate("my-resource-group", new ExportTemplateRequest()
            .withResources(Arrays.asList("*")).withOptions("IncludeParameterDefaultValue,IncludeComments"),
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2023-07-01/examples/
     * ExportResourceGroupWithFiltering.json
     */
    /**
     * Sample code: Export a resource group with filtering.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        exportAResourceGroupWithFiltering(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.resourceGroups().exportTemplate("my-resource-group",
            new ExportTemplateRequest().withResources(Arrays.asList(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/my-resource-group/providers/My.RP/myResourceType/myFirstResource"))
                .withOptions("SkipResourceNameParameterization"),
            com.azure.core.util.Context.NONE);
    }
}
