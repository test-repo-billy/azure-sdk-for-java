/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.ServerAdvisorsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ServerAdvisors.
 */
public interface ServerAdvisors extends SupportsCreating<ServerAdvisor.DefinitionStages.Blank>, HasInner<ServerAdvisorsInner> {
    /**
     * Gets a list of server advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AdvisorListResult> listByServerAsync(String resourceGroupName, String serverName);

    /**
     * Gets a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServerAdvisor> getAsync(String resourceGroupName, String serverName, String advisorName);

}
