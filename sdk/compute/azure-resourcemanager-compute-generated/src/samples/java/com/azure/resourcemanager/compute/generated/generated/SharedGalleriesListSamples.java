// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for SharedGalleries List.
 */
public final class SharedGalleriesListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2023-07-03/examples/sharedGalleryExamples/SharedGallery_List.json
     */
    /**
     * Sample code: List shared galleries.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void listSharedGalleries(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.sharedGalleries().list("myLocation", null, com.azure.core.util.Context.NONE);
    }
}
