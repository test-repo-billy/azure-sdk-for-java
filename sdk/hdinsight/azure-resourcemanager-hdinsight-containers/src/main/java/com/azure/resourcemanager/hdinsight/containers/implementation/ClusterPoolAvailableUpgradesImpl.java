// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.containers.fluent.ClusterPoolAvailableUpgradesClient;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterPoolAvailableUpgradeInner;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterPoolAvailableUpgrade;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterPoolAvailableUpgrades;

public final class ClusterPoolAvailableUpgradesImpl implements ClusterPoolAvailableUpgrades {
    private static final ClientLogger LOGGER = new ClientLogger(ClusterPoolAvailableUpgradesImpl.class);

    private final ClusterPoolAvailableUpgradesClient innerClient;

    private final com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager serviceManager;

    public ClusterPoolAvailableUpgradesImpl(ClusterPoolAvailableUpgradesClient innerClient,
        com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ClusterPoolAvailableUpgrade> list(String resourceGroupName, String clusterPoolName) {
        PagedIterable<ClusterPoolAvailableUpgradeInner> inner
            = this.serviceClient().list(resourceGroupName, clusterPoolName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new ClusterPoolAvailableUpgradeImpl(inner1, this.manager()));
    }

    public PagedIterable<ClusterPoolAvailableUpgrade> list(String resourceGroupName, String clusterPoolName,
        Context context) {
        PagedIterable<ClusterPoolAvailableUpgradeInner> inner
            = this.serviceClient().list(resourceGroupName, clusterPoolName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new ClusterPoolAvailableUpgradeImpl(inner1, this.manager()));
    }

    private ClusterPoolAvailableUpgradesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager manager() {
        return this.serviceManager;
    }
}
