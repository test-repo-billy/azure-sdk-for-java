// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.fluent.models.ComponentLinkedStorageAccountsInner;
import com.azure.resourcemanager.applicationinsights.models.ComponentLinkedStorageAccountsPatch;
import com.azure.resourcemanager.applicationinsights.models.StorageType;

/**
 * An instance of this class provides access to all the operations defined in
 * ComponentLinkedStorageAccountsOperationsClient.
 */
public interface ComponentLinkedStorageAccountsOperationsClient {
    /**
     * Returns the current linked storage settings for an Application Insights component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param storageType The type of the Application Insights component data source for the linked storage account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component linked storage accounts along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ComponentLinkedStorageAccountsInner> getWithResponse(String resourceGroupName, String resourceName,
        StorageType storageType, Context context);

    /**
     * Returns the current linked storage settings for an Application Insights component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param storageType The type of the Application Insights component data source for the linked storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component linked storage accounts.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ComponentLinkedStorageAccountsInner get(String resourceGroupName, String resourceName, StorageType storageType);

    /**
     * Replace current linked storage account for an Application Insights component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param storageType The type of the Application Insights component data source for the linked storage account.
     * @param linkedStorageAccountsProperties Properties that need to be specified to update linked storage accounts for
     * an Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component linked storage accounts along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ComponentLinkedStorageAccountsInner> createAndUpdateWithResponse(String resourceGroupName,
        String resourceName, StorageType storageType,
        ComponentLinkedStorageAccountsInner linkedStorageAccountsProperties, Context context);

    /**
     * Replace current linked storage account for an Application Insights component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param storageType The type of the Application Insights component data source for the linked storage account.
     * @param linkedStorageAccountsProperties Properties that need to be specified to update linked storage accounts for
     * an Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component linked storage accounts.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ComponentLinkedStorageAccountsInner createAndUpdate(String resourceGroupName, String resourceName,
        StorageType storageType, ComponentLinkedStorageAccountsInner linkedStorageAccountsProperties);

    /**
     * Update linked storage accounts for an Application Insights component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param storageType The type of the Application Insights component data source for the linked storage account.
     * @param linkedStorageAccountsProperties Properties that need to be specified to update a linked storage accounts
     * for an Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component linked storage accounts along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ComponentLinkedStorageAccountsInner> updateWithResponse(String resourceGroupName, String resourceName,
        StorageType storageType, ComponentLinkedStorageAccountsPatch linkedStorageAccountsProperties, Context context);

    /**
     * Update linked storage accounts for an Application Insights component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param storageType The type of the Application Insights component data source for the linked storage account.
     * @param linkedStorageAccountsProperties Properties that need to be specified to update a linked storage accounts
     * for an Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component linked storage accounts.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ComponentLinkedStorageAccountsInner update(String resourceGroupName, String resourceName, StorageType storageType,
        ComponentLinkedStorageAccountsPatch linkedStorageAccountsProperties);

    /**
     * Delete linked storage accounts for an Application Insights component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param storageType The type of the Application Insights component data source for the linked storage account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String resourceName, StorageType storageType,
        Context context);

    /**
     * Delete linked storage accounts for an Application Insights component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param storageType The type of the Application Insights component data source for the linked storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName, StorageType storageType);
}
