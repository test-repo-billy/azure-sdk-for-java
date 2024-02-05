// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.PercentileSourceTargetsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.PercentileMetricInner;
import com.azure.resourcemanager.cosmos.generated.models.PercentileMetric;
import com.azure.resourcemanager.cosmos.generated.models.PercentileSourceTargets;

public final class PercentileSourceTargetsImpl implements PercentileSourceTargets {
    private static final ClientLogger LOGGER = new ClientLogger(PercentileSourceTargetsImpl.class);

    private final PercentileSourceTargetsClient innerClient;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public PercentileSourceTargetsImpl(PercentileSourceTargetsClient innerClient,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PercentileMetric> listMetrics(String resourceGroupName, String accountName,
        String sourceRegion, String targetRegion, String filter) {
        PagedIterable<PercentileMetricInner> inner
            = this.serviceClient().listMetrics(resourceGroupName, accountName, sourceRegion, targetRegion, filter);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PercentileMetricImpl(inner1, this.manager()));
    }

    public PagedIterable<PercentileMetric> listMetrics(String resourceGroupName, String accountName,
        String sourceRegion, String targetRegion, String filter, Context context) {
        PagedIterable<PercentileMetricInner> inner = this.serviceClient().listMetrics(resourceGroupName, accountName,
            sourceRegion, targetRegion, filter, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PercentileMetricImpl(inner1, this.manager()));
    }

    private PercentileSourceTargetsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }
}
