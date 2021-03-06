/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.compute.v2019_11_01.implementation.GalleryImageVersionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2019_11_01.implementation.ComputeManager;
import java.util.Map;

/**
 * Type representing GalleryImageVersion.
 */
public interface GalleryImageVersion extends HasInner<GalleryImageVersionInner>, Indexable, Refreshable<GalleryImageVersion>, Updatable<GalleryImageVersion.Update>, HasManager<ComputeManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the publishingProfile value.
     */
    GalleryImageVersionPublishingProfile publishingProfile();

    /**
     * @return the replicationStatus value.
     */
    ReplicationStatus replicationStatus();

    /**
     * @return the storageProfile value.
     */
    GalleryImageVersionStorageProfile storageProfile();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the GalleryImageVersion definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithImage, DefinitionStages.WithLocation, DefinitionStages.WithStorageProfile, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of GalleryImageVersion definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a GalleryImageVersion definition.
         */
        interface Blank extends WithImage {
        }

        /**
         * The stage of the galleryimageversion definition allowing to specify Image.
         */
        interface WithImage {
           /**
            * Specifies resourceGroupName, galleryName, galleryImageName.
            * @param resourceGroupName The name of the resource group
            * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides
            * @param galleryImageName The name of the gallery Image Definition in which the Image Version is to be created
            * @return the next definition stage
            */
            WithLocation withExistingImage(String resourceGroupName, String galleryName, String galleryImageName);
        }

        /**
         * The stage of the galleryimageversion definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location Resource location
            * @return the next definition stage
            */
            WithStorageProfile withLocation(String location);
        }

        /**
         * The stage of the galleryimageversion definition allowing to specify StorageProfile.
         */
        interface WithStorageProfile {
           /**
            * Specifies storageProfile.
            * @param storageProfile the storageProfile parameter value
            * @return the next definition stage
            */
            WithCreate withStorageProfile(GalleryImageVersionStorageProfile storageProfile);
        }

        /**
         * The stage of the galleryimageversion definition allowing to specify PublishingProfile.
         */
        interface WithPublishingProfile {
            /**
             * Specifies publishingProfile.
             * @param publishingProfile the publishingProfile parameter value
             * @return the next definition stage
             */
            WithCreate withPublishingProfile(GalleryImageVersionPublishingProfile publishingProfile);
        }

        /**
         * The stage of the galleryimageversion definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<GalleryImageVersion>, DefinitionStages.WithPublishingProfile, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a GalleryImageVersion update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<GalleryImageVersion>, UpdateStages.WithPublishingProfile, UpdateStages.WithTags {
    }

    /**
     * Grouping of GalleryImageVersion update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the galleryimageversion update allowing to specify PublishingProfile.
         */
        interface WithPublishingProfile {
            /**
             * Specifies publishingProfile.
             * @param publishingProfile the publishingProfile parameter value
             * @return the next update stage
             */
            Update withPublishingProfile(GalleryImageVersionPublishingProfile publishingProfile);
        }

        /**
         * The stage of the galleryimageversion update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
