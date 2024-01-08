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
import com.azure.resourcemanager.network.generated.fluent.models.CustomIpPrefixInner;
import com.azure.resourcemanager.network.generated.models.TagsObject;

/**
 * An instance of this class provides access to all the operations defined in CustomIpPrefixesClient.
 */
public interface CustomIpPrefixesClient {
    /**
     * Deletes the specified custom IP prefix.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the CustomIpPrefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String customIpPrefixName);

    /**
     * Deletes the specified custom IP prefix.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the CustomIpPrefix.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String customIpPrefixName,
        Context context);

    /**
     * Deletes the specified custom IP prefix.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the CustomIpPrefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String customIpPrefixName);

    /**
     * Deletes the specified custom IP prefix.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the CustomIpPrefix.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String customIpPrefixName, Context context);

    /**
     * Gets the specified custom IP prefix in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified custom IP prefix in a specified resource group along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CustomIpPrefixInner> getByResourceGroupWithResponse(String resourceGroupName, String customIpPrefixName,
        String expand, Context context);

    /**
     * Gets the specified custom IP prefix in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified custom IP prefix in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomIpPrefixInner getByResourceGroup(String resourceGroupName, String customIpPrefixName);

    /**
     * Creates or updates a custom IP prefix.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param parameters Parameters supplied to the create or update custom IP prefix operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of custom IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CustomIpPrefixInner>, CustomIpPrefixInner> beginCreateOrUpdate(String resourceGroupName,
        String customIpPrefixName, CustomIpPrefixInner parameters);

    /**
     * Creates or updates a custom IP prefix.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param parameters Parameters supplied to the create or update custom IP prefix operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of custom IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CustomIpPrefixInner>, CustomIpPrefixInner> beginCreateOrUpdate(String resourceGroupName,
        String customIpPrefixName, CustomIpPrefixInner parameters, Context context);

    /**
     * Creates or updates a custom IP prefix.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param parameters Parameters supplied to the create or update custom IP prefix operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return custom IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomIpPrefixInner createOrUpdate(String resourceGroupName, String customIpPrefixName,
        CustomIpPrefixInner parameters);

    /**
     * Creates or updates a custom IP prefix.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param parameters Parameters supplied to the create or update custom IP prefix operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return custom IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomIpPrefixInner createOrUpdate(String resourceGroupName, String customIpPrefixName,
        CustomIpPrefixInner parameters, Context context);

    /**
     * Updates custom IP prefix tags.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param parameters Parameters supplied to update custom IP prefix tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return custom IP prefix resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CustomIpPrefixInner> updateTagsWithResponse(String resourceGroupName, String customIpPrefixName,
        TagsObject parameters, Context context);

    /**
     * Updates custom IP prefix tags.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param parameters Parameters supplied to update custom IP prefix tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return custom IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomIpPrefixInner updateTags(String resourceGroupName, String customIpPrefixName, TagsObject parameters);

    /**
     * Gets all the custom IP prefixes in a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the custom IP prefixes in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CustomIpPrefixInner> list();

    /**
     * Gets all the custom IP prefixes in a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the custom IP prefixes in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CustomIpPrefixInner> list(Context context);

    /**
     * Gets all custom IP prefixes in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all custom IP prefixes in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CustomIpPrefixInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all custom IP prefixes in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all custom IP prefixes in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CustomIpPrefixInner> listByResourceGroup(String resourceGroupName, Context context);
}
