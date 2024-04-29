// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.resourcemanager.compute.generated.models.GalleryApplicationCustomAction;
import com.azure.resourcemanager.compute.generated.models.GalleryApplicationCustomActionParameter;
import com.azure.resourcemanager.compute.generated.models.GalleryApplicationCustomActionParameterType;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;
import java.util.Arrays;

/**
 * Samples for GalleryApplications CreateOrUpdate.
 */
public final class GalleryApplicationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2023-07-03/examples/galleryExamples/GalleryApplication_Create.json
     */
    /**
     * Sample code: Create or update a simple gallery Application.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        createOrUpdateASimpleGalleryApplication(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.galleryApplications()
            .define("myGalleryApplicationName")
            .withRegion("West US")
            .withExistingGallery("myResourceGroup", "myGalleryName")
            .withDescription("This is the gallery application description.")
            .withEula("This is the gallery application EULA.")
            .withPrivacyStatementUri("myPrivacyStatementUri}")
            .withReleaseNoteUri("myReleaseNoteUri")
            .withSupportedOSType(OperatingSystemTypes.WINDOWS)
            .withCustomActions(
                Arrays
                    .asList(new GalleryApplicationCustomAction().withName("myCustomAction")
                        .withScript("myCustomActionScript")
                        .withDescription("This is the custom action description.")
                        .withParameters(Arrays
                            .asList(new GalleryApplicationCustomActionParameter().withName("myCustomActionParameter")
                                .withRequired(false)
                                .withType(GalleryApplicationCustomActionParameterType.STRING)
                                .withDefaultValue("default value of parameter.")
                                .withDescription("This is the description of the parameter")))))
            .create();
    }
}
