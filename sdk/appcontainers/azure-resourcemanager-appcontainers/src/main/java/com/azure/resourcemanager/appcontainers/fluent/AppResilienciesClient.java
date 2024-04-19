// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.AppResiliencyInner;

/**
 * An instance of this class provides access to all the operations defined in AppResilienciesClient.
 */
public interface AppResilienciesClient {
    /**
     * Create or update an application's resiliency policy.
     * 
     * Create or update container app resiliency policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param appName Name of the Container App.
     * @param name Name of the resiliency policy.
     * @param resiliencyEnvelope The resiliency policy to create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration to setup App Resiliency along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AppResiliencyInner> createOrUpdateWithResponse(String resourceGroupName, String appName, String name,
        AppResiliencyInner resiliencyEnvelope, Context context);

    /**
     * Create or update an application's resiliency policy.
     * 
     * Create or update container app resiliency policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param appName Name of the Container App.
     * @param name Name of the resiliency policy.
     * @param resiliencyEnvelope The resiliency policy to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration to setup App Resiliency.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AppResiliencyInner createOrUpdate(String resourceGroupName, String appName, String name,
        AppResiliencyInner resiliencyEnvelope);

    /**
     * Update an application's resiliency policy.
     * 
     * Update container app resiliency policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param appName Name of the Container App.
     * @param name Name of the resiliency policy.
     * @param resiliencyEnvelope The resiliency policy to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration to setup App Resiliency along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AppResiliencyInner> updateWithResponse(String resourceGroupName, String appName, String name,
        AppResiliencyInner resiliencyEnvelope, Context context);

    /**
     * Update an application's resiliency policy.
     * 
     * Update container app resiliency policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param appName Name of the Container App.
     * @param name Name of the resiliency policy.
     * @param resiliencyEnvelope The resiliency policy to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration to setup App Resiliency.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AppResiliencyInner update(String resourceGroupName, String appName, String name,
        AppResiliencyInner resiliencyEnvelope);

    /**
     * Delete an application's resiliency policy.
     * 
     * Delete container app resiliency policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param appName Name of the Container App.
     * @param name Name of the resiliency policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String appName, String name, Context context);

    /**
     * Delete an application's resiliency policy.
     * 
     * Delete container app resiliency policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param appName Name of the Container App.
     * @param name Name of the resiliency policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String appName, String name);

    /**
     * Get an application's resiliency policy.
     * 
     * Get container app resiliency policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param appName Name of the Container App.
     * @param name Name of the resiliency policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container app resiliency policy along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AppResiliencyInner> getWithResponse(String resourceGroupName, String appName, String name,
        Context context);

    /**
     * Get an application's resiliency policy.
     * 
     * Get container app resiliency policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param appName Name of the Container App.
     * @param name Name of the resiliency policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container app resiliency policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AppResiliencyInner get(String resourceGroupName, String appName, String name);

    /**
     * List an application's resiliency policies.
     * 
     * List container app resiliency policies.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param appName Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of AppResiliency policies as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AppResiliencyInner> list(String resourceGroupName, String appName);

    /**
     * List an application's resiliency policies.
     * 
     * List container app resiliency policies.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param appName Name of the Container App.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of AppResiliency policies as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AppResiliencyInner> list(String resourceGroupName, String appName, Context context);
}
