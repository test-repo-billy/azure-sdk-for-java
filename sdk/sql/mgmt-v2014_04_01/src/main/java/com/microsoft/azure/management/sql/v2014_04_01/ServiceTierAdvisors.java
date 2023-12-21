/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import rx.Observable;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.ServiceTierAdvisorsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ServiceTierAdvisors.
 */
public interface ServiceTierAdvisors extends HasInner<ServiceTierAdvisorsInner> {
    /**
     * Gets a service tier advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of database.
     * @param serviceTierAdvisorName The name of service tier advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServiceTierAdvisor> getAsync(String resourceGroupName, String serverName, String databaseName, String serviceTierAdvisorName);

    /**
     * Returns service tier advisors for specified database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServiceTierAdvisor> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName);

}
