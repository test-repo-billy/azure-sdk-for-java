// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.NetworkManagerCommitsClient;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkManagerCommitInner;
import com.azure.resourcemanager.network.generated.models.NetworkManagerCommit;
import com.azure.resourcemanager.network.generated.models.NetworkManagerCommits;

public final class NetworkManagerCommitsImpl implements NetworkManagerCommits {
    private static final ClientLogger LOGGER = new ClientLogger(NetworkManagerCommitsImpl.class);

    private final NetworkManagerCommitsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public NetworkManagerCommitsImpl(NetworkManagerCommitsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public NetworkManagerCommit post(String resourceGroupName, String networkManagerName,
        NetworkManagerCommitInner parameters) {
        NetworkManagerCommitInner inner = this.serviceClient().post(resourceGroupName, networkManagerName, parameters);
        if (inner != null) {
            return new NetworkManagerCommitImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NetworkManagerCommit post(String resourceGroupName, String networkManagerName,
        NetworkManagerCommitInner parameters, Context context) {
        NetworkManagerCommitInner inner
            = this.serviceClient().post(resourceGroupName, networkManagerName, parameters, context);
        if (inner != null) {
            return new NetworkManagerCommitImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private NetworkManagerCommitsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
