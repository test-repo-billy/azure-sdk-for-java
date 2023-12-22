// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedInstanceEncryptionProtectorInner;
import com.azure.resourcemanager.sql.generated.models.EncryptionProtectorName;

/**
 * An instance of this class provides access to all the operations defined in
 * ManagedInstanceEncryptionProtectorsClient.
 */
public interface ManagedInstanceEncryptionProtectorsClient {
    /**
     * Revalidates an existing encryption protector.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRevalidate(String resourceGroupName, String managedInstanceName,
        EncryptionProtectorName encryptionProtectorName);

    /**
     * Revalidates an existing encryption protector.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRevalidate(String resourceGroupName, String managedInstanceName,
        EncryptionProtectorName encryptionProtectorName, Context context);

    /**
     * Revalidates an existing encryption protector.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void revalidate(String resourceGroupName, String managedInstanceName,
        EncryptionProtectorName encryptionProtectorName);

    /**
     * Revalidates an existing encryption protector.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void revalidate(String resourceGroupName, String managedInstanceName,
        EncryptionProtectorName encryptionProtectorName, Context context);

    /**
     * Gets a list of managed instance encryption protectors.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed instance encryption protectors as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedInstanceEncryptionProtectorInner> listByInstance(String resourceGroupName,
        String managedInstanceName);

    /**
     * Gets a list of managed instance encryption protectors.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed instance encryption protectors as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedInstanceEncryptionProtectorInner> listByInstance(String resourceGroupName,
        String managedInstanceName, Context context);

    /**
     * Gets a managed instance encryption protector.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param encryptionProtectorName The name of the encryption protector to be retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed instance encryption protector along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedInstanceEncryptionProtectorInner> getWithResponse(String resourceGroupName,
        String managedInstanceName, EncryptionProtectorName encryptionProtectorName, Context context);

    /**
     * Gets a managed instance encryption protector.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param encryptionProtectorName The name of the encryption protector to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed instance encryption protector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedInstanceEncryptionProtectorInner get(String resourceGroupName, String managedInstanceName,
        EncryptionProtectorName encryptionProtectorName);

    /**
     * Updates an existing encryption protector.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @param parameters The requested encryption protector resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the managed instance encryption protector.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ManagedInstanceEncryptionProtectorInner>, ManagedInstanceEncryptionProtectorInner>
        beginCreateOrUpdate(String resourceGroupName, String managedInstanceName,
            EncryptionProtectorName encryptionProtectorName, ManagedInstanceEncryptionProtectorInner parameters);

    /**
     * Updates an existing encryption protector.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @param parameters The requested encryption protector resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the managed instance encryption protector.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ManagedInstanceEncryptionProtectorInner>, ManagedInstanceEncryptionProtectorInner>
        beginCreateOrUpdate(String resourceGroupName, String managedInstanceName,
            EncryptionProtectorName encryptionProtectorName, ManagedInstanceEncryptionProtectorInner parameters,
            Context context);

    /**
     * Updates an existing encryption protector.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @param parameters The requested encryption protector resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed instance encryption protector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedInstanceEncryptionProtectorInner createOrUpdate(String resourceGroupName, String managedInstanceName,
        EncryptionProtectorName encryptionProtectorName, ManagedInstanceEncryptionProtectorInner parameters);

    /**
     * Updates an existing encryption protector.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @param parameters The requested encryption protector resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed instance encryption protector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedInstanceEncryptionProtectorInner createOrUpdate(String resourceGroupName, String managedInstanceName,
        EncryptionProtectorName encryptionProtectorName, ManagedInstanceEncryptionProtectorInner parameters,
        Context context);
}
