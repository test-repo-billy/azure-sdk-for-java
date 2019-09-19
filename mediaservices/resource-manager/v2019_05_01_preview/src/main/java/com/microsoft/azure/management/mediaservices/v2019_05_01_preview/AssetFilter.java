/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mediaservices.v2019_05_01_preview.implementation.AssetFilterInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mediaservices.v2019_05_01_preview.implementation.MediaManager;
import java.util.List;

/**
 * Type representing AssetFilter.
 */
public interface AssetFilter extends HasInner<AssetFilterInner>, Indexable, Refreshable<AssetFilter>, Updatable<AssetFilter.Update>, HasManager<MediaManager> {
    /**
     * @return the firstQuality value.
     */
    FirstQuality firstQuality();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the presentationTimeRange value.
     */
    PresentationTimeRange presentationTimeRange();

    /**
     * @return the tracks value.
     */
    List<FilterTrackSelection> tracks();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the AssetFilter definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithAsset, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AssetFilter definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AssetFilter definition.
         */
        interface Blank extends WithAsset {
        }

        /**
         * The stage of the assetfilter definition allowing to specify Asset.
         */
        interface WithAsset {
           /**
            * Specifies resourceGroupName, accountName, assetName.
            * @param resourceGroupName The name of the resource group within the Azure subscription
            * @param accountName The Media Services account name
            * @param assetName The Asset name
            * @return the next definition stage
            */
            WithCreate withExistingAsset(String resourceGroupName, String accountName, String assetName);
        }

        /**
         * The stage of the assetfilter definition allowing to specify FirstQuality.
         */
        interface WithFirstQuality {
            /**
             * Specifies firstQuality.
             * @param firstQuality The first quality
             * @return the next definition stage
             */
            WithCreate withFirstQuality(FirstQuality firstQuality);
        }

        /**
         * The stage of the assetfilter definition allowing to specify PresentationTimeRange.
         */
        interface WithPresentationTimeRange {
            /**
             * Specifies presentationTimeRange.
             * @param presentationTimeRange The presentation time range
             * @return the next definition stage
             */
            WithCreate withPresentationTimeRange(PresentationTimeRange presentationTimeRange);
        }

        /**
         * The stage of the assetfilter definition allowing to specify Tracks.
         */
        interface WithTracks {
            /**
             * Specifies tracks.
             * @param tracks The tracks selection conditions
             * @return the next definition stage
             */
            WithCreate withTracks(List<FilterTrackSelection> tracks);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AssetFilter>, DefinitionStages.WithFirstQuality, DefinitionStages.WithPresentationTimeRange, DefinitionStages.WithTracks {
        }
    }
    /**
     * The template for a AssetFilter update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AssetFilter>, UpdateStages.WithFirstQuality, UpdateStages.WithPresentationTimeRange, UpdateStages.WithTracks {
    }

    /**
     * Grouping of AssetFilter update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the assetfilter update allowing to specify FirstQuality.
         */
        interface WithFirstQuality {
            /**
             * Specifies firstQuality.
             * @param firstQuality The first quality
             * @return the next update stage
             */
            Update withFirstQuality(FirstQuality firstQuality);
        }

        /**
         * The stage of the assetfilter update allowing to specify PresentationTimeRange.
         */
        interface WithPresentationTimeRange {
            /**
             * Specifies presentationTimeRange.
             * @param presentationTimeRange The presentation time range
             * @return the next update stage
             */
            Update withPresentationTimeRange(PresentationTimeRange presentationTimeRange);
        }

        /**
         * The stage of the assetfilter update allowing to specify Tracks.
         */
        interface WithTracks {
            /**
             * Specifies tracks.
             * @param tracks The tracks selection conditions
             * @return the next update stage
             */
            Update withTracks(List<FilterTrackSelection> tracks);
        }

    }
}
