// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of RestorePointCollections.
 */
public interface RestorePointCollections {
    /**
     * The operation to delete the restore point collection. This operation will also delete all the contained restore
     * points.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the Restore Point Collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String restorePointCollectionName);

    /**
     * The operation to delete the restore point collection. This operation will also delete all the contained restore
     * points.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the Restore Point Collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String restorePointCollectionName, Context context);

    /**
     * The operation to get the restore point collection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param expand The expand expression to apply on the operation. If expand=restorePoints, server will return all
     * contained restore points in the restorePointCollection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return create or update Restore Point collection parameters along with {@link Response}.
     */
    Response<RestorePointCollection> getByResourceGroupWithResponse(String resourceGroupName,
        String restorePointCollectionName, RestorePointCollectionExpandOptions expand, Context context);

    /**
     * The operation to get the restore point collection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return create or update Restore Point collection parameters.
     */
    RestorePointCollection getByResourceGroup(String resourceGroupName, String restorePointCollectionName);

    /**
     * Gets the list of restore point collections in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of restore point collections in a resource group as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<RestorePointCollection> listByResourceGroup(String resourceGroupName);

    /**
     * Gets the list of restore point collections in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of restore point collections in a resource group as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<RestorePointCollection> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the list of restore point collections in the subscription. Use nextLink property in the response to get the
     * next page of restore point collections. Do this till nextLink is not null to fetch all the restore point
     * collections.
     * 
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of restore point collections in the subscription as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<RestorePointCollection> list();

    /**
     * Gets the list of restore point collections in the subscription. Use nextLink property in the response to get the
     * next page of restore point collections. Do this till nextLink is not null to fetch all the restore point
     * collections.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of restore point collections in the subscription as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<RestorePointCollection> list(Context context);

    /**
     * The operation to get the restore point collection.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return create or update Restore Point collection parameters along with {@link Response}.
     */
    RestorePointCollection getById(String id);

    /**
     * The operation to get the restore point collection.
     * 
     * @param id the resource ID.
     * @param expand The expand expression to apply on the operation. If expand=restorePoints, server will return all
     * contained restore points in the restorePointCollection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return create or update Restore Point collection parameters along with {@link Response}.
     */
    Response<RestorePointCollection> getByIdWithResponse(String id, RestorePointCollectionExpandOptions expand,
        Context context);

    /**
     * The operation to delete the restore point collection. This operation will also delete all the contained restore
     * points.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * The operation to delete the restore point collection. This operation will also delete all the contained restore
     * points.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new RestorePointCollection resource.
     * 
     * @param name resource name.
     * @return the first stage of the new RestorePointCollection definition.
     */
    RestorePointCollection.DefinitionStages.Blank define(String name);
}
