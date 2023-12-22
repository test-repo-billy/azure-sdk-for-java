// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.MaintenanceWindowsInner;

/**
 * An instance of this class provides access to all the operations defined in MaintenanceWindowsOperationsClient.
 */
public interface MaintenanceWindowsOperationsClient {
    /**
     * Gets maintenance windows settings for a database.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database to get maintenance windows for.
     * @param maintenanceWindowName Maintenance window name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return maintenance windows settings for a database along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MaintenanceWindowsInner> getWithResponse(String resourceGroupName, String serverName, String databaseName,
        String maintenanceWindowName, Context context);

    /**
     * Gets maintenance windows settings for a database.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database to get maintenance windows for.
     * @param maintenanceWindowName Maintenance window name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return maintenance windows settings for a database.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MaintenanceWindowsInner get(String resourceGroupName, String serverName, String databaseName,
        String maintenanceWindowName);

    /**
     * Sets maintenance windows settings for a database.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database to set maintenance windows for.
     * @param maintenanceWindowName Maintenance window name.
     * @param parameters Maintenance windows.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> createOrUpdateWithResponse(String resourceGroupName, String serverName, String databaseName,
        String maintenanceWindowName, MaintenanceWindowsInner parameters, Context context);

    /**
     * Sets maintenance windows settings for a database.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database to set maintenance windows for.
     * @param maintenanceWindowName Maintenance window name.
     * @param parameters Maintenance windows.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void createOrUpdate(String resourceGroupName, String serverName, String databaseName, String maintenanceWindowName,
        MaintenanceWindowsInner parameters);
}
