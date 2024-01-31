// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.fluent.models.WorkbookInner;
import com.azure.resourcemanager.applicationinsights.models.CategoryType;
import com.azure.resourcemanager.applicationinsights.models.WorkbookUpdateParameters;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined in WorkbooksClient.
 */
public interface WorkbooksClient {
    /**
     * Get all Workbooks defined within a specified subscription and category.
     * 
     * @param category Category of workbook to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Workbooks defined within a specified subscription and category as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkbookInner> list(CategoryType category);

    /**
     * Get all Workbooks defined within a specified subscription and category.
     * 
     * @param category Category of workbook to return.
     * @param tags Tags presents on each workbook returned.
     * @param canFetchContent Flag indicating whether or not to return the full content for each applicable workbook. If
     * false, only return summary content for workbooks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Workbooks defined within a specified subscription and category as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkbookInner> list(CategoryType category, List<String> tags, Boolean canFetchContent,
        Context context);

    /**
     * Get all Workbooks defined within a specified resource group and category.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param category Category of workbook to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Workbooks defined within a specified resource group and category as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkbookInner> listByResourceGroup(String resourceGroupName, CategoryType category);

    /**
     * Get all Workbooks defined within a specified resource group and category.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param category Category of workbook to return.
     * @param tags Tags presents on each workbook returned.
     * @param sourceId Azure Resource Id that will fetch all linked workbooks.
     * @param canFetchContent Flag indicating whether or not to return the full content for each applicable workbook. If
     * false, only return summary content for workbooks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Workbooks defined within a specified resource group and category as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkbookInner> listByResourceGroup(String resourceGroupName, CategoryType category, List<String> tags,
        String sourceId, Boolean canFetchContent, Context context);

    /**
     * Get a single workbook by its resourceName.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the workbook resource. The value must be an UUID.
     * @param canFetchContent Flag indicating whether or not to return the full content for each applicable workbook. If
     * false, only return summary content for workbooks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single workbook by its resourceName along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkbookInner> getByResourceGroupWithResponse(String resourceGroupName, String resourceName,
        Boolean canFetchContent, Context context);

    /**
     * Get a single workbook by its resourceName.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the workbook resource. The value must be an UUID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single workbook by its resourceName.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkbookInner getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Delete a workbook.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the workbook resource. The value must be an UUID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String resourceName, Context context);

    /**
     * Delete a workbook.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the workbook resource. The value must be an UUID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName);

    /**
     * Create a new workbook.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the workbook resource. The value must be an UUID.
     * @param workbookProperties Properties that need to be specified to create a new workbook.
     * @param sourceId Azure Resource Id that will fetch all linked workbooks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workbook definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkbookInner> createOrUpdateWithResponse(String resourceGroupName, String resourceName,
        WorkbookInner workbookProperties, String sourceId, Context context);

    /**
     * Create a new workbook.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the workbook resource. The value must be an UUID.
     * @param workbookProperties Properties that need to be specified to create a new workbook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workbook definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkbookInner createOrUpdate(String resourceGroupName, String resourceName, WorkbookInner workbookProperties);

    /**
     * Updates a workbook that has already been added.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the workbook resource. The value must be an UUID.
     * @param sourceId Azure Resource Id that will fetch all linked workbooks.
     * @param workbookUpdateParameters Properties that need to be specified to create a new workbook.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workbook definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkbookInner> updateWithResponse(String resourceGroupName, String resourceName, String sourceId,
        WorkbookUpdateParameters workbookUpdateParameters, Context context);

    /**
     * Updates a workbook that has already been added.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the workbook resource. The value must be an UUID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workbook definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkbookInner update(String resourceGroupName, String resourceName);

    /**
     * Get the revisions for the workbook defined by its resourceName.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the workbook resource. The value must be an UUID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the revisions for the workbook defined by its resourceName as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkbookInner> revisionsList(String resourceGroupName, String resourceName);

    /**
     * Get the revisions for the workbook defined by its resourceName.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the workbook resource. The value must be an UUID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the revisions for the workbook defined by its resourceName as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkbookInner> revisionsList(String resourceGroupName, String resourceName, Context context);

    /**
     * Get a single workbook revision defined by its revisionId.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the workbook resource. The value must be an UUID.
     * @param revisionId The id of the workbook's revision.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single workbook revision defined by its revisionId along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkbookInner> revisionGetWithResponse(String resourceGroupName, String resourceName, String revisionId,
        Context context);

    /**
     * Get a single workbook revision defined by its revisionId.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the workbook resource. The value must be an UUID.
     * @param revisionId The id of the workbook's revision.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single workbook revision defined by its revisionId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkbookInner revisionGet(String resourceGroupName, String resourceName, String revisionId);
}
