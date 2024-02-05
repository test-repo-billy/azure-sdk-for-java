// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.resourcemanager.compute.generated.models.GalleryImageIdentifier;
import com.azure.resourcemanager.compute.generated.models.HyperVGeneration;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemStateTypes;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;

/**
 * Samples for GalleryImages CreateOrUpdate.
 */
public final class GalleryImagesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/
     * GalleryImage_Create.json
     */
    /**
     * Sample code: Create or update a simple gallery image.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        createOrUpdateASimpleGalleryImage(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.galleryImages().define("myGalleryImageName").withRegion("West US")
            .withExistingGallery("myResourceGroup", "myGalleryName").withOsType(OperatingSystemTypes.WINDOWS)
            .withOsState(OperatingSystemStateTypes.GENERALIZED).withHyperVGeneration(HyperVGeneration.V1)
            .withIdentifier(new GalleryImageIdentifier().withPublisher("myPublisherName").withOffer("myOfferName")
                .withSku("mySkuName"))
            .create();
    }
}
