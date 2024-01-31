// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.fluent.models.WebTestInner;
import com.azure.resourcemanager.applicationinsights.models.TagsResource;

/**
 * An instance of this class provides access to all the operations defined in WebTestsClient.
 */
public interface WebTestsClient {
    /**
     * Get all Application Insights web tests defined for the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Application Insights web tests defined for the specified resource group as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebTestInner> listByResourceGroup(String resourceGroupName);

    /**
     * Get all Application Insights web tests defined for the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Application Insights web tests defined for the specified resource group as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebTestInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get a specific Application Insights web test definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param webTestName The name of the Application Insights WebTest resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific Application Insights web test definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WebTestInner> getByResourceGroupWithResponse(String resourceGroupName, String webTestName,
        Context context);

    /**
     * Get a specific Application Insights web test definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param webTestName The name of the Application Insights WebTest resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific Application Insights web test definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WebTestInner getByResourceGroup(String resourceGroupName, String webTestName);

    /**
     * Creates or updates an Application Insights web test definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param webTestName The name of the Application Insights WebTest resource.
     * @param webTestDefinition Properties that need to be specified to create or update an Application Insights web
     * test definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights WebTest definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WebTestInner> createOrUpdateWithResponse(String resourceGroupName, String webTestName,
        WebTestInner webTestDefinition, Context context);

    /**
     * Creates or updates an Application Insights web test definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param webTestName The name of the Application Insights WebTest resource.
     * @param webTestDefinition Properties that need to be specified to create or update an Application Insights web
     * test definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights WebTest definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WebTestInner createOrUpdate(String resourceGroupName, String webTestName, WebTestInner webTestDefinition);

    /**
     * Updates the tags associated with an Application Insights web test.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param webTestName The name of the Application Insights WebTest resource.
     * @param webTestTags Updated tag information to associate with the web test resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights WebTest definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WebTestInner> updateTagsWithResponse(String resourceGroupName, String webTestName,
        TagsResource webTestTags, Context context);

    /**
     * Updates the tags associated with an Application Insights web test.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param webTestName The name of the Application Insights WebTest resource.
     * @param webTestTags Updated tag information to associate with the web test resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights WebTest definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WebTestInner updateTags(String resourceGroupName, String webTestName, TagsResource webTestTags);

    /**
     * Deletes an Application Insights web test.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param webTestName The name of the Application Insights WebTest resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String webTestName, Context context);

    /**
     * Deletes an Application Insights web test.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param webTestName The name of the Application Insights WebTest resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String webTestName);

    /**
     * Get all Application Insights web test definitions for the specified subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Application Insights web test definitions for the specified subscription as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebTestInner> list();

    /**
     * Get all Application Insights web test definitions for the specified subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Application Insights web test definitions for the specified subscription as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebTestInner> list(Context context);

    /**
     * Get all Application Insights web tests defined for the specified component.
     * 
     * @param componentName The name of the Application Insights component resource.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Application Insights web tests defined for the specified component as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebTestInner> listByComponent(String componentName, String resourceGroupName);

    /**
     * Get all Application Insights web tests defined for the specified component.
     * 
     * @param componentName The name of the Application Insights component resource.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Application Insights web tests defined for the specified component as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebTestInner> listByComponent(String componentName, String resourceGroupName, Context context);
}
