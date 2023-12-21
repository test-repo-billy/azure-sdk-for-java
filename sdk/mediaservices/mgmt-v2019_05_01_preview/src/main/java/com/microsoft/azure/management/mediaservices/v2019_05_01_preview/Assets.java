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
import com.microsoft.azure.management.mediaservices.v2019_05_01_preview.implementation.AssetsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Assets.
 */
public interface Assets extends SupportsCreating<Asset.DefinitionStages.Blank>, HasInner<AssetsInner> {
    /**
     * List the Asset URLs.
     * Lists storage container URLs with shared access signatures (SAS) for uploading and downloading Asset content. The signatures are derived from the storage account keys.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param parameters The request parameters
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AssetContainerSas> listContainerSasAsync(String resourceGroupName, String accountName, String assetName, ListContainerSasInput parameters);

    /**
     * Gets the Asset storage key.
     * Gets the Asset storage encryption keys used to decrypt content created by version 2 of the Media Services API.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StorageEncryptedAssetDecryptionData> getEncryptionKeyAsync(String resourceGroupName, String accountName, String assetName);

    /**
     * List Streaming Locators.
     * Lists Streaming Locators which are associated with this asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ListStreamingLocatorsResponse> listStreamingLocatorsAsync(String resourceGroupName, String accountName, String assetName);

    /**
     * Get an Asset.
     * Get the details of an Asset in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Asset> getAsync(String resourceGroupName, String accountName, String assetName);

    /**
     * List Assets.
     * List Assets in the Media Services account with optional filtering and ordering.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Asset> listAsync(final String resourceGroupName, final String accountName);

    /**
     * Delete an Asset.
     * Deletes an Asset in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String accountName, String assetName);

}
