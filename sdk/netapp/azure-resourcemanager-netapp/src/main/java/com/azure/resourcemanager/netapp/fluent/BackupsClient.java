// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.netapp.fluent.models.RestoreStatusInner;

/**
 * An instance of this class provides access to all the operations defined in BackupsClient.
 */
public interface BackupsClient {
    /**
     * Get volume's restore status
     * 
     * Get the status of the restore for a volume.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the restore for a volume along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RestoreStatusInner> getVolumeRestoreStatusWithResponse(String resourceGroupName, String accountName,
        String poolName, String volumeName, Context context);

    /**
     * Get volume's restore status
     * 
     * Get the status of the restore for a volume.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the restore for a volume.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RestoreStatusInner getVolumeRestoreStatus(String resourceGroupName, String accountName, String poolName,
        String volumeName);
}
