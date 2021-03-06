/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.management.synapse.v2019_06_01_preview.SelfHostedIntegrationRuntimeNode;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.util.Map;
import org.joda.time.DateTime;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeUpdateResult;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SelfHostedIntegrationRuntimeNodeStatus;

class SelfHostedIntegrationRuntimeNodeImpl extends WrapperImpl<SelfHostedIntegrationRuntimeNodeInner> implements SelfHostedIntegrationRuntimeNode {
    private final SynapseManager manager;
    private String resourceGroupName;
    private String workspaceName;
    private String integrationRuntimeName;
    private String nodeName;

    SelfHostedIntegrationRuntimeNodeImpl(SelfHostedIntegrationRuntimeNodeInner inner,  SynapseManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SynapseManager manager() {
        return this.manager;
    }



    @Override
    public Map<String, String> capabilities() {
        return this.inner().capabilities();
    }

    @Override
    public Integer concurrentJobsLimit() {
        return this.inner().concurrentJobsLimit();
    }

    @Override
    public DateTime expiryTime() {
        return this.inner().expiryTime();
    }

    @Override
    public String hostServiceUri() {
        return this.inner().hostServiceUri();
    }

    @Override
    public Boolean isActiveDispatcher() {
        return this.inner().isActiveDispatcher();
    }

    @Override
    public DateTime lastConnectTime() {
        return this.inner().lastConnectTime();
    }

    @Override
    public DateTime lastEndUpdateTime() {
        return this.inner().lastEndUpdateTime();
    }

    @Override
    public DateTime lastStartTime() {
        return this.inner().lastStartTime();
    }

    @Override
    public DateTime lastStartUpdateTime() {
        return this.inner().lastStartUpdateTime();
    }

    @Override
    public DateTime lastStopTime() {
        return this.inner().lastStopTime();
    }

    @Override
    public IntegrationRuntimeUpdateResult lastUpdateResult() {
        return this.inner().lastUpdateResult();
    }

    @Override
    public String machineName() {
        return this.inner().machineName();
    }

    @Override
    public Integer maxConcurrentJobs() {
        return this.inner().maxConcurrentJobs();
    }

    @Override
    public String nodeName() {
        return this.inner().nodeName();
    }

    @Override
    public DateTime registerTime() {
        return this.inner().registerTime();
    }

    @Override
    public SelfHostedIntegrationRuntimeNodeStatus status() {
        return this.inner().status();
    }

    @Override
    public String version() {
        return this.inner().version();
    }

    @Override
    public String versionStatus() {
        return this.inner().versionStatus();
    }

}
