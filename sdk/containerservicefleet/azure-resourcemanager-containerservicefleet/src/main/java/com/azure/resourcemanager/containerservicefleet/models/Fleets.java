// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Fleets.
 */
public interface Fleets {
    /**
     * Lists fleets in the specified subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Fleet list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Fleet> list();

    /**
     * Lists fleets in the specified subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Fleet list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Fleet> list(Context context);

    /**
     * Lists fleets in the specified subscription and resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Fleet list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Fleet> listByResourceGroup(String resourceGroupName);

    /**
     * Lists fleets in the specified subscription and resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Fleet list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Fleet> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Fleet along with {@link Response}.
     */
    Response<Fleet> getByResourceGroupWithResponse(String resourceGroupName, String fleetName, Context context);

    /**
     * Gets a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Fleet.
     */
    Fleet getByResourceGroup(String resourceGroupName, String fleetName);

    /**
     * Delete a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String fleetName);

    /**
     * Delete a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param ifMatch The request should only proceed if an entity matches this string.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String fleetName, String ifMatch, Context context);

    /**
     * Lists the user credentials of a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Credential results response along with {@link Response}.
     */
    Response<FleetCredentialResults> listCredentialsWithResponse(String resourceGroupName, String fleetName,
        Context context);

    /**
     * Lists the user credentials of a Fleet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Credential results response.
     */
    FleetCredentialResults listCredentials(String resourceGroupName, String fleetName);

    /**
     * Gets a Fleet.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Fleet along with {@link Response}.
     */
    Fleet getById(String id);

    /**
     * Gets a Fleet.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Fleet along with {@link Response}.
     */
    Response<Fleet> getByIdWithResponse(String id, Context context);

    /**
     * Delete a Fleet.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a Fleet.
     * 
     * @param id the resource ID.
     * @param ifMatch The request should only proceed if an entity matches this string.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, String ifMatch, Context context);

    /**
     * Begins definition for a new Fleet resource.
     * 
     * @param name resource name.
     * @return the first stage of the new Fleet definition.
     */
    Fleet.DefinitionStages.Blank define(String name);
}
