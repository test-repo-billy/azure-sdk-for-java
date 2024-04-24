// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for SharedGalleryImages Get.
 */
public final class SharedGalleryImagesGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2023-07-03/examples/sharedGalleryExamples/SharedGalleryImage_Get.json
     */
    /**
     * Sample code: Get a shared gallery image.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void getASharedGalleryImage(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.sharedGalleryImages()
            .getWithResponse("myLocation", "galleryUniqueName", "myGalleryImageName", com.azure.core.util.Context.NONE);
    }
}
