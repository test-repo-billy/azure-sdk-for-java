// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.generated;

import com.azure.resourcemanager.apicenter.models.MetadataAssignmentEntity;
import com.azure.resourcemanager.apicenter.models.MetadataSchemaExportRequest;

/**
 * Samples for Services ExportMetadataSchema.
 */
public final class ServicesExportMetadataSchemaSamples {
    /*
     * x-ms-original-file: specification/apicenter/resource-manager/Microsoft.ApiCenter/stable/2024-03-01/examples/
     * Services_ExportMetadataSchema.json
     */
    /**
     * Sample code: Services_ExportMetadataSchema.
     * 
     * @param manager Entry point to ApiCenterManager.
     */
    public static void servicesExportMetadataSchema(com.azure.resourcemanager.apicenter.ApiCenterManager manager) {
        manager.services().exportMetadataSchemaWithResponse("contoso-resources", "contoso",
            new MetadataSchemaExportRequest().withAssignedTo(MetadataAssignmentEntity.API),
            com.azure.core.util.Context.NONE);
    }
}
