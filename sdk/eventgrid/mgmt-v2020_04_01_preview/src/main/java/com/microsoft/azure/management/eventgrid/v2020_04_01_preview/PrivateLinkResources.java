/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import rx.Observable;

/**
 * Type representing PrivateLinkResources.
 */
public interface PrivateLinkResources {
    /**
     * Get a private link resource.
     * Get properties of a private link resource.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\' or \'domains\'.
     * @param parentName The name of the parent resource (namely, either, the topic name or domain name).
     * @param privateLinkResourceName The name of private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PrivateLinkResource> getAsync(String resourceGroupName, String parentType, String parentName, String privateLinkResourceName);

    /**
     * List private link resources under specific topic or domain.
     * List all the private link resources under a topic or domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\' or \'domains\'.
     * @param parentName The name of the parent resource (namely, either, the topic name or domain name).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PrivateLinkResource> listByResourceAsync(final String resourceGroupName, final String parentType, final String parentName);

}
