/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation.FavoritesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Favorites.
 */
public interface Favorites extends SupportsCreating<ApplicationInsightsComponentFavorite.DefinitionStages.Blank>, HasInner<FavoritesInner> {
    /**
     * Get a single favorite by its FavoriteId, defined within an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param favoriteId The Id of a specific favorite defined in the Application Insights component
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationInsightsComponentFavorite> getAsync(String resourceGroupName, String resourceName, String favoriteId);

    /**
     * Gets a list of favorites defined within an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationInsightsComponentFavorite> listAsync(String resourceGroupName, String resourceName);

    /**
     * Remove a favorite that is associated to an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param favoriteId The Id of a specific favorite defined in the Application Insights component
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String resourceName, String favoriteId);

}
