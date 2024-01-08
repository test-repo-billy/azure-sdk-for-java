// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.generated.fluent.models.PrivateEndpointInner;

/**
 * An instance of this class provides access to all the operations defined in PrivateEndpointsClient.
 */
public interface PrivateEndpointsClient {
    /**
     * Deletes the specified private endpoint.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String privateEndpointName);

    /**
     * Deletes the specified private endpoint.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String privateEndpointName,
        Context context);

    /**
     * Deletes the specified private endpoint.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String privateEndpointName);

    /**
     * Deletes the specified private endpoint.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String privateEndpointName, Context context);

    /**
     * Gets the specified private endpoint by resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint by resource group along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointInner> getByResourceGroupWithResponse(String resourceGroupName, String privateEndpointName,
        String expand, Context context);

    /**
     * Gets the specified private endpoint by resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint by resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointInner getByResourceGroup(String resourceGroupName, String privateEndpointName);

    /**
     * Creates or updates an private endpoint in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param parameters Parameters supplied to the create or update private endpoint operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of private endpoint resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PrivateEndpointInner>, PrivateEndpointInner> beginCreateOrUpdate(String resourceGroupName,
        String privateEndpointName, PrivateEndpointInner parameters);

    /**
     * Creates or updates an private endpoint in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param parameters Parameters supplied to the create or update private endpoint operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of private endpoint resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PrivateEndpointInner>, PrivateEndpointInner> beginCreateOrUpdate(String resourceGroupName,
        String privateEndpointName, PrivateEndpointInner parameters, Context context);

    /**
     * Creates or updates an private endpoint in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param parameters Parameters supplied to the create or update private endpoint operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointInner createOrUpdate(String resourceGroupName, String privateEndpointName,
        PrivateEndpointInner parameters);

    /**
     * Creates or updates an private endpoint in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param parameters Parameters supplied to the create or update private endpoint operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointInner createOrUpdate(String resourceGroupName, String privateEndpointName,
        PrivateEndpointInner parameters, Context context);

    /**
     * Gets all private endpoints in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private endpoints in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all private endpoints in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private endpoints in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all private endpoints in a subscription.
     * 
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private endpoints in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointInner> list();

    /**
     * Gets all private endpoints in a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private endpoints in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointInner> list(Context context);
}
