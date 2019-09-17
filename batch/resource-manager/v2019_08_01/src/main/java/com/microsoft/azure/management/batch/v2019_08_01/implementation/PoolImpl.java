/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2019_08_01.implementation;

import com.microsoft.azure.management.batch.v2019_08_01.Pool;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.batch.v2019_08_01.PoolProvisioningState;
import com.microsoft.azure.management.batch.v2019_08_01.AllocationState;
import com.microsoft.azure.management.batch.v2019_08_01.DeploymentConfiguration;
import com.microsoft.azure.management.batch.v2019_08_01.ScaleSettings;
import com.microsoft.azure.management.batch.v2019_08_01.AutoScaleRun;
import com.microsoft.azure.management.batch.v2019_08_01.InterNodeCommunicationState;
import com.microsoft.azure.management.batch.v2019_08_01.NetworkConfiguration;
import com.microsoft.azure.management.batch.v2019_08_01.TaskSchedulingPolicy;
import java.util.List;
import com.microsoft.azure.management.batch.v2019_08_01.UserAccount;
import com.microsoft.azure.management.batch.v2019_08_01.MetadataItem;
import com.microsoft.azure.management.batch.v2019_08_01.StartTask;
import com.microsoft.azure.management.batch.v2019_08_01.CertificateReference;
import com.microsoft.azure.management.batch.v2019_08_01.ApplicationPackageReference;
import com.microsoft.azure.management.batch.v2019_08_01.ResizeOperationStatus;
import com.microsoft.azure.management.batch.v2019_08_01.MountConfiguration;

class PoolImpl extends CreatableUpdatableImpl<Pool, PoolInner, PoolImpl> implements Pool, Pool.Definition, Pool.Update {
    private final BatchManager manager;
    private String resourceGroupName;
    private String accountName;
    private String poolName;
    private String cifMatch;
    private String cifNoneMatch;
    private String uifMatch;

    PoolImpl(String name, BatchManager manager) {
        super(name, new PoolInner());
        this.manager = manager;
        // Set resource name
        this.poolName = name;
        //
    }

    PoolImpl(PoolInner inner, BatchManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.poolName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "batchAccounts");
        this.poolName = IdParsingUtils.getValueFromIdByName(inner.id(), "pools");
        //
    }

    @Override
    public BatchManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Pool> createResourceAsync() {
        PoolsInner client = this.manager().inner().pools();
        return client.createAsync(this.resourceGroupName, this.accountName, this.poolName, this.inner(), this.cifMatch, this.cifNoneMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Pool> updateResourceAsync() {
        PoolsInner client = this.manager().inner().pools();
        return client.updateAsync(this.resourceGroupName, this.accountName, this.poolName, this.inner(), this.uifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PoolInner> getInnerAsync() {
        PoolsInner client = this.manager().inner().pools();
        return client.getAsync(this.resourceGroupName, this.accountName, this.poolName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public AllocationState allocationState() {
        return this.inner().allocationState();
    }

    @Override
    public DateTime allocationStateTransitionTime() {
        return this.inner().allocationStateTransitionTime();
    }

    @Override
    public List<String> applicationLicenses() {
        return this.inner().applicationLicenses();
    }

    @Override
    public List<ApplicationPackageReference> applicationPackages() {
        return this.inner().applicationPackages();
    }

    @Override
    public AutoScaleRun autoScaleRun() {
        return this.inner().autoScaleRun();
    }

    @Override
    public List<CertificateReference> certificates() {
        return this.inner().certificates();
    }

    @Override
    public DateTime creationTime() {
        return this.inner().creationTime();
    }

    @Override
    public Integer currentDedicatedNodes() {
        return this.inner().currentDedicatedNodes();
    }

    @Override
    public Integer currentLowPriorityNodes() {
        return this.inner().currentLowPriorityNodes();
    }

    @Override
    public DeploymentConfiguration deploymentConfiguration() {
        return this.inner().deploymentConfiguration();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public InterNodeCommunicationState interNodeCommunication() {
        return this.inner().interNodeCommunication();
    }

    @Override
    public DateTime lastModified() {
        return this.inner().lastModified();
    }

    @Override
    public Integer maxTasksPerNode() {
        return this.inner().maxTasksPerNode();
    }

    @Override
    public List<MetadataItem> metadata() {
        return this.inner().metadata();
    }

    @Override
    public List<MountConfiguration> mountConfiguration() {
        return this.inner().mountConfiguration();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public NetworkConfiguration networkConfiguration() {
        return this.inner().networkConfiguration();
    }

    @Override
    public PoolProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public DateTime provisioningStateTransitionTime() {
        return this.inner().provisioningStateTransitionTime();
    }

    @Override
    public ResizeOperationStatus resizeOperationStatus() {
        return this.inner().resizeOperationStatus();
    }

    @Override
    public ScaleSettings scaleSettings() {
        return this.inner().scaleSettings();
    }

    @Override
    public StartTask startTask() {
        return this.inner().startTask();
    }

    @Override
    public TaskSchedulingPolicy taskSchedulingPolicy() {
        return this.inner().taskSchedulingPolicy();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public List<UserAccount> userAccounts() {
        return this.inner().userAccounts();
    }

    @Override
    public String vmSize() {
        return this.inner().vmSize();
    }

    @Override
    public PoolImpl withExistingBatchAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public PoolImpl withIfNoneMatch(String ifNoneMatch) {
        this.cifNoneMatch = ifNoneMatch;
        return this;
    }

    @Override
    public PoolImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.cifMatch = ifMatch;
        } else {
            this.uifMatch = ifMatch;
        }
        return this;
    }

    @Override
    public PoolImpl withApplicationLicenses(List<String> applicationLicenses) {
        this.inner().withApplicationLicenses(applicationLicenses);
        return this;
    }

    @Override
    public PoolImpl withApplicationPackages(List<ApplicationPackageReference> applicationPackages) {
        this.inner().withApplicationPackages(applicationPackages);
        return this;
    }

    @Override
    public PoolImpl withCertificates(List<CertificateReference> certificates) {
        this.inner().withCertificates(certificates);
        return this;
    }

    @Override
    public PoolImpl withDeploymentConfiguration(DeploymentConfiguration deploymentConfiguration) {
        this.inner().withDeploymentConfiguration(deploymentConfiguration);
        return this;
    }

    @Override
    public PoolImpl withDisplayName(String displayName) {
        this.inner().withDisplayName(displayName);
        return this;
    }

    @Override
    public PoolImpl withInterNodeCommunication(InterNodeCommunicationState interNodeCommunication) {
        this.inner().withInterNodeCommunication(interNodeCommunication);
        return this;
    }

    @Override
    public PoolImpl withMaxTasksPerNode(Integer maxTasksPerNode) {
        this.inner().withMaxTasksPerNode(maxTasksPerNode);
        return this;
    }

    @Override
    public PoolImpl withMetadata(List<MetadataItem> metadata) {
        this.inner().withMetadata(metadata);
        return this;
    }

    @Override
    public PoolImpl withMountConfiguration(List<MountConfiguration> mountConfiguration) {
        this.inner().withMountConfiguration(mountConfiguration);
        return this;
    }

    @Override
    public PoolImpl withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.inner().withNetworkConfiguration(networkConfiguration);
        return this;
    }

    @Override
    public PoolImpl withScaleSettings(ScaleSettings scaleSettings) {
        this.inner().withScaleSettings(scaleSettings);
        return this;
    }

    @Override
    public PoolImpl withStartTask(StartTask startTask) {
        this.inner().withStartTask(startTask);
        return this;
    }

    @Override
    public PoolImpl withTaskSchedulingPolicy(TaskSchedulingPolicy taskSchedulingPolicy) {
        this.inner().withTaskSchedulingPolicy(taskSchedulingPolicy);
        return this;
    }

    @Override
    public PoolImpl withUserAccounts(List<UserAccount> userAccounts) {
        this.inner().withUserAccounts(userAccounts);
        return this;
    }

    @Override
    public PoolImpl withVmSize(String vmSize) {
        this.inner().withVmSize(vmSize);
        return this;
    }

}
