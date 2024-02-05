// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.PartitionKeyRangeIdsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.PartitionMetricInner;
import com.azure.resourcemanager.cosmos.generated.models.PartitionKeyRangeIds;
import com.azure.resourcemanager.cosmos.generated.models.PartitionMetric;

public final class PartitionKeyRangeIdsImpl implements PartitionKeyRangeIds {
    private static final ClientLogger LOGGER = new ClientLogger(PartitionKeyRangeIdsImpl.class);

    private final PartitionKeyRangeIdsClient innerClient;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public PartitionKeyRangeIdsImpl(PartitionKeyRangeIdsClient innerClient,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PartitionMetric> listMetrics(String resourceGroupName, String accountName, String databaseRid,
        String collectionRid, String partitionKeyRangeId, String filter) {
        PagedIterable<PartitionMetricInner> inner = this.serviceClient().listMetrics(resourceGroupName, accountName,
            databaseRid, collectionRid, partitionKeyRangeId, filter);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PartitionMetricImpl(inner1, this.manager()));
    }

    public PagedIterable<PartitionMetric> listMetrics(String resourceGroupName, String accountName, String databaseRid,
        String collectionRid, String partitionKeyRangeId, String filter, Context context) {
        PagedIterable<PartitionMetricInner> inner = this.serviceClient().listMetrics(resourceGroupName, accountName,
            databaseRid, collectionRid, partitionKeyRangeId, filter, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PartitionMetricImpl(inner1, this.manager()));
    }

    private PartitionKeyRangeIdsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }
}
