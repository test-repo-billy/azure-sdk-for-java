// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/**
 * Resource collection API of CollectionPartitionRegions.
 */
public interface CollectionPartitionRegions {
    /**
     * Retrieves the metrics determined by the given filter for the given collection and region, split by partition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param region Cosmos DB region, with spaces between words and each word capitalized.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     * filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     * timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list partition metrics request as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PartitionMetric> listMetrics(String resourceGroupName, String accountName, String region,
        String databaseRid, String collectionRid, String filter);

    /**
     * Retrieves the metrics determined by the given filter for the given collection and region, split by partition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param region Cosmos DB region, with spaces between words and each word capitalized.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     * filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     * timeGrain. The supported operator is eq.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list partition metrics request as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PartitionMetric> listMetrics(String resourceGroupName, String accountName, String region,
        String databaseRid, String collectionRid, String filter, Context context);
}
