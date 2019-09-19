/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.mediaservices.v2019_05_01_preview.implementation.AssetFiltersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing AssetFilters.
 */
public interface AssetFilters extends SupportsCreating<AssetFilter.DefinitionStages.Blank>, HasInner<AssetFiltersInner> {
    /**
     * Get an Asset Filter.
     * Get the details of an Asset Filter associated with the specified Asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param filterName The Asset Filter name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AssetFilter> getAsync(String resourceGroupName, String accountName, String assetName, String filterName);

    /**
     * List Asset Filters.
     * List Asset Filters associated with the specified Asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AssetFilter> listAsync(final String resourceGroupName, final String accountName, final String assetName);

    /**
     * Delete an Asset Filter.
     * Deletes an Asset Filter associated with the specified Asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param filterName The Asset Filter name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String accountName, String assetName, String filterName);

}
