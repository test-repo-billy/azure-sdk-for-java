// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apicenter.fluent.models.ApiDefinitionInner;
import com.azure.resourcemanager.apicenter.fluent.models.ApiSpecExportResultInner;
import com.azure.resourcemanager.apicenter.models.ApiDefinitionsCreateOrUpdateResponse;
import com.azure.resourcemanager.apicenter.models.ApiDefinitionsGetResponse;
import com.azure.resourcemanager.apicenter.models.ApiSpecImportRequest;

/**
 * An instance of this class provides access to all the operations defined in ApiDefinitionsClient.
 */
public interface ApiDefinitionsClient {
    /**
     * List API definitions
     * 
     * Returns a collection of API definitions.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @param versionName The name of the API version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aPI version collection as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApiDefinitionInner> list(String resourceGroupName, String serviceName, String workspaceName,
        String apiName, String versionName);

    /**
     * List API definitions
     * 
     * Returns a collection of API definitions.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @param versionName The name of the API version.
     * @param filter OData filter parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aPI version collection as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApiDefinitionInner> list(String resourceGroupName, String serviceName, String workspaceName,
        String apiName, String versionName, String filter, Context context);

    /**
     * Get API definition
     * 
     * Returns details of the API definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @param versionName The name of the API version.
     * @param definitionName The name of the API definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aPI definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiDefinitionsGetResponse getWithResponse(String resourceGroupName, String serviceName, String workspaceName,
        String apiName, String versionName, String definitionName, Context context);

    /**
     * Get API definition
     * 
     * Returns details of the API definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @param versionName The name of the API version.
     * @param definitionName The name of the API definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aPI definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiDefinitionInner get(String resourceGroupName, String serviceName, String workspaceName, String apiName,
        String versionName, String definitionName);

    /**
     * Create or update API definition
     * 
     * Creates new or updates existing API definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @param versionName The name of the API version.
     * @param definitionName The name of the API definition.
     * @param payload API definition entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aPI definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiDefinitionsCreateOrUpdateResponse createOrUpdateWithResponse(String resourceGroupName, String serviceName,
        String workspaceName, String apiName, String versionName, String definitionName, ApiDefinitionInner payload,
        Context context);

    /**
     * Create or update API definition
     * 
     * Creates new or updates existing API definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @param versionName The name of the API version.
     * @param definitionName The name of the API definition.
     * @param payload API definition entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aPI definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiDefinitionInner createOrUpdate(String resourceGroupName, String serviceName, String workspaceName,
        String apiName, String versionName, String definitionName, ApiDefinitionInner payload);

    /**
     * Delete API definition
     * 
     * Deletes specified API definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @param versionName The name of the API version.
     * @param definitionName The name of the API definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String serviceName, String workspaceName,
        String apiName, String versionName, String definitionName, Context context);

    /**
     * Delete API definition
     * 
     * Deletes specified API definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @param versionName The name of the API version.
     * @param definitionName The name of the API definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String workspaceName, String apiName, String versionName,
        String definitionName);

    /**
     * Check if API definition exists
     * 
     * Checks if specified API definition exists.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @param versionName The name of the API version.
     * @param definitionName The name of the API definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> headWithResponse(String resourceGroupName, String serviceName, String workspaceName, String apiName,
        String versionName, String definitionName, Context context);

    /**
     * Check if API definition exists
     * 
     * Checks if specified API definition exists.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @param versionName The name of the API version.
     * @param definitionName The name of the API definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void head(String resourceGroupName, String serviceName, String workspaceName, String apiName, String versionName,
        String definitionName);

    /**
     * Import API specification
     * 
     * Imports the API specification.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @param versionName The name of the API version.
     * @param definitionName The name of the API definition.
     * @param payload The API specification source entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> importSpecificationWithResponse(String resourceGroupName, String serviceName, String workspaceName,
        String apiName, String versionName, String definitionName, ApiSpecImportRequest payload, Context context);

    /**
     * Import API specification
     * 
     * Imports the API specification.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @param versionName The name of the API version.
     * @param definitionName The name of the API definition.
     * @param payload The API specification source entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void importSpecification(String resourceGroupName, String serviceName, String workspaceName, String apiName,
        String versionName, String definitionName, ApiSpecImportRequest payload);

    /**
     * Export API specification
     * 
     * Exports the API specification.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @param versionName The name of the API version.
     * @param definitionName The name of the API definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the API specification export result along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApiSpecExportResultInner> exportSpecificationWithResponse(String resourceGroupName, String serviceName,
        String workspaceName, String apiName, String versionName, String definitionName, Context context);

    /**
     * Export API specification
     * 
     * Exports the API specification.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param apiName The name of the API.
     * @param versionName The name of the API version.
     * @param definitionName The name of the API definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the API specification export result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiSpecExportResultInner exportSpecification(String resourceGroupName, String serviceName, String workspaceName,
        String apiName, String versionName, String definitionName);
}
