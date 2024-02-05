// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for GalleryApplicationVersions ListByGalleryApplication.
 */
public final class GalleryApplicationVersionsListByGalleryApplicationSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/
     * GalleryApplicationVersion_ListByGalleryApplication.json
     */
    /**
     * Sample code: List gallery Application Versions in a gallery Application Definition.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void listGalleryApplicationVersionsInAGalleryApplicationDefinition(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.galleryApplicationVersions().listByGalleryApplication("myResourceGroup", "myGalleryName",
            "myGalleryApplicationName", com.azure.core.util.Context.NONE);
    }
}
