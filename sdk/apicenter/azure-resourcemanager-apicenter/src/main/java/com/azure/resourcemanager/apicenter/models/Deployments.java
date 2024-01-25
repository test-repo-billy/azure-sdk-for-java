// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Deployments.
 */
public interface Deployments {
    /**
     * List deployments
     * 
     * Returns a collection of API deployments.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aPI deployment collection as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Deployment> list(String resourceGroupName, String serviceName, String workspaceName, String apiName);

    /**
     * List deployments
     * 
     * Returns a collection of API deployments.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @param filter OData filter parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aPI deployment collection as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Deployment> list(String resourceGroupName, String serviceName, String workspaceName, String apiName,
        String filter, Context context);

    /**
     * Delete API deployment
     * 
     * Deletes API deployment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @param deploymentName The name of the API deployment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String serviceName, String workspaceName,
        String apiName, String deploymentName, Context context);

    /**
     * Delete API deployment
     * 
     * Deletes API deployment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @param deploymentName The name of the API deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serviceName, String workspaceName, String apiName,
        String deploymentName);

    /**
     * Get API deployment
     * 
     * Returns details of the API deployment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @param deploymentName The name of the API deployment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aPI deployment.
     */
    Response<Deployment> getWithResponse(String resourceGroupName, String serviceName, String workspaceName,
        String apiName, String deploymentName, Context context);

    /**
     * Get API deployment
     * 
     * Returns details of the API deployment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @param deploymentName The name of the API deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aPI deployment.
     */
    Deployment get(String resourceGroupName, String serviceName, String workspaceName, String apiName,
        String deploymentName);

    /**
     * Check if API deployment exists
     * 
     * Checks if specified API deployment exists.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @param deploymentName The name of the API deployment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> headWithResponse(String resourceGroupName, String serviceName, String workspaceName, String apiName,
        String deploymentName, Context context);

    /**
     * Check if API deployment exists
     * 
     * Checks if specified API deployment exists.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @param deploymentName The name of the API deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void head(String resourceGroupName, String serviceName, String workspaceName, String apiName,
        String deploymentName);

    /**
     * Get API deployment
     * 
     * Returns details of the API deployment.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aPI deployment.
     */
    Deployment getById(String id);

    /**
     * Get API deployment
     * 
     * Returns details of the API deployment.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aPI deployment.
     */
    Response<Deployment> getByIdWithResponse(String id, Context context);

    /**
     * Delete API deployment
     * 
     * Deletes API deployment.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete API deployment
     * 
     * Deletes API deployment.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Deployment resource.
     * 
     * @param name resource name.
     * @return the first stage of the new Deployment definition.
     */
    Deployment.DefinitionStages.Blank define(String name);
}
