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
import com.azure.resourcemanager.sql.generated.fluent.models.BackupShortTermRetentionPolicyInner;
import com.azure.resourcemanager.sql.generated.models.ShortTermRetentionPolicyName;

/**
 * An instance of this class provides access to all the operations defined in BackupShortTermRetentionPoliciesClient.
 */
public interface BackupShortTermRetentionPoliciesClient {
    /**
     * Gets a database's short term retention policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be "default".
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's short term retention policy along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BackupShortTermRetentionPolicyInner> getWithResponse(String resourceGroupName, String serverName,
        String databaseName, ShortTermRetentionPolicyName policyName, Context context);

    /**
     * Gets a database's short term retention policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be "default".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupShortTermRetentionPolicyInner get(String resourceGroupName, String serverName, String databaseName,
        ShortTermRetentionPolicyName policyName);

    /**
     * Updates a database's short term retention policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BackupShortTermRetentionPolicyInner>, BackupShortTermRetentionPolicyInner>
        beginCreateOrUpdate(String resourceGroupName, String serverName, String databaseName,
            ShortTermRetentionPolicyName policyName, BackupShortTermRetentionPolicyInner parameters);

    /**
     * Updates a database's short term retention policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BackupShortTermRetentionPolicyInner>, BackupShortTermRetentionPolicyInner>
        beginCreateOrUpdate(String resourceGroupName, String serverName, String databaseName,
            ShortTermRetentionPolicyName policyName, BackupShortTermRetentionPolicyInner parameters, Context context);

    /**
     * Updates a database's short term retention policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupShortTermRetentionPolicyInner createOrUpdate(String resourceGroupName, String serverName, String databaseName,
        ShortTermRetentionPolicyName policyName, BackupShortTermRetentionPolicyInner parameters);

    /**
     * Updates a database's short term retention policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupShortTermRetentionPolicyInner createOrUpdate(String resourceGroupName, String serverName, String databaseName,
        ShortTermRetentionPolicyName policyName, BackupShortTermRetentionPolicyInner parameters, Context context);

    /**
     * Updates a database's short term retention policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BackupShortTermRetentionPolicyInner>, BackupShortTermRetentionPolicyInner> beginUpdate(
        String resourceGroupName, String serverName, String databaseName, ShortTermRetentionPolicyName policyName,
        BackupShortTermRetentionPolicyInner parameters);

    /**
     * Updates a database's short term retention policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BackupShortTermRetentionPolicyInner>, BackupShortTermRetentionPolicyInner> beginUpdate(
        String resourceGroupName, String serverName, String databaseName, ShortTermRetentionPolicyName policyName,
        BackupShortTermRetentionPolicyInner parameters, Context context);

    /**
     * Updates a database's short term retention policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupShortTermRetentionPolicyInner update(String resourceGroupName, String serverName, String databaseName,
        ShortTermRetentionPolicyName policyName, BackupShortTermRetentionPolicyInner parameters);

    /**
     * Updates a database's short term retention policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupShortTermRetentionPolicyInner update(String resourceGroupName, String serverName, String databaseName,
        ShortTermRetentionPolicyName policyName, BackupShortTermRetentionPolicyInner parameters, Context context);

    /**
     * Gets a database's short term retention policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's short term retention policy as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BackupShortTermRetentionPolicyInner> listByDatabase(String resourceGroupName, String serverName,
        String databaseName);

    /**
     * Gets a database's short term retention policy.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's short term retention policy as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BackupShortTermRetentionPolicyInner> listByDatabase(String resourceGroupName, String serverName,
        String databaseName, Context context);
}
