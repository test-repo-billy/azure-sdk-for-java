/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import rx.Observable;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.RecommendedElasticPoolsInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2014_04_01.RecommendedElasticPoolMetric;

/**
 * Type representing RecommendedElasticPools.
 */
public interface RecommendedElasticPools extends HasInner<RecommendedElasticPoolsInner> {
    /**
     * Gets a recommented elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param recommendedElasticPoolName The name of the recommended elastic pool to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecommendedElasticPool> getAsync(String resourceGroupName, String serverName, String recommendedElasticPoolName);

    /**
     * Returns recommended elastic pools.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecommendedElasticPool> listByServerAsync(String resourceGroupName, String serverName);

    /**
     * Returns recommented elastic pool metrics.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param recommendedElasticPoolName The name of the recommended elastic pool to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecommendedElasticPoolMetric> listMetricsAsync(String resourceGroupName, String serverName, String recommendedElasticPoolName);

}
