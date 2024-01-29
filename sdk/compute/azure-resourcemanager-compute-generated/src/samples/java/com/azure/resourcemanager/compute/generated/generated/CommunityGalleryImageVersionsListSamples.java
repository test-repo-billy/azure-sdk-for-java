// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for CommunityGalleryImageVersions List.
 */
public final class CommunityGalleryImageVersionsListSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/
     * communityGalleryExamples/CommunityGalleryImageVersion_List.json
     */
    /**
     * Sample code: List community gallery image versions.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        listCommunityGalleryImageVersions(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.communityGalleryImageVersions().list("myLocation", "publicGalleryName", "myGalleryImageName",
            com.azure.core.util.Context.NONE);
    }
}
