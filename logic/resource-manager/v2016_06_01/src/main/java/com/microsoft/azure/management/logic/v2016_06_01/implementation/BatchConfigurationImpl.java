/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.management.logic.v2016_06_01.BatchConfiguration;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;
import com.microsoft.azure.management.logic.v2016_06_01.BatchConfigurationProperties;

class BatchConfigurationImpl extends CreatableUpdatableImpl<BatchConfiguration, BatchConfigurationInner, BatchConfigurationImpl> implements BatchConfiguration, BatchConfiguration.Definition, BatchConfiguration.Update {
    private final LogicManager manager;
    private String resourceGroupName;
    private String integrationAccountName;
    private String batchConfigurationName;

    BatchConfigurationImpl(String name, LogicManager manager) {
        super(name, new BatchConfigurationInner());
        this.manager = manager;
        // Set resource name
        this.batchConfigurationName = name;
        //
    }

    BatchConfigurationImpl(BatchConfigurationInner inner, LogicManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.batchConfigurationName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.integrationAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "integrationAccounts");
        this.batchConfigurationName = IdParsingUtils.getValueFromIdByName(inner.id(), "batchConfigurations");
        //
    }

    @Override
    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public Observable<BatchConfiguration> createResourceAsync() {
        IntegrationAccountBatchConfigurationsInner client = this.manager().inner().integrationAccountBatchConfigurations();
        return client.createOrUpdateAsync(this.resourceGroupName, this.integrationAccountName, this.batchConfigurationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<BatchConfiguration> updateResourceAsync() {
        IntegrationAccountBatchConfigurationsInner client = this.manager().inner().integrationAccountBatchConfigurations();
        return client.createOrUpdateAsync(this.resourceGroupName, this.integrationAccountName, this.batchConfigurationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<BatchConfigurationInner> getInnerAsync() {
        IntegrationAccountBatchConfigurationsInner client = this.manager().inner().integrationAccountBatchConfigurations();
        return client.getAsync(this.resourceGroupName, this.integrationAccountName, this.batchConfigurationName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public BatchConfigurationProperties properties() {
        return this.inner().properties();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public BatchConfigurationImpl withExistingIntegrationAccount(String resourceGroupName, String integrationAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.integrationAccountName = integrationAccountName;
        return this;
    }

    @Override
    public BatchConfigurationImpl withProperties(BatchConfigurationProperties properties) {
        this.inner().withProperties(properties);
        return this;
    }

    @Override
    public BatchConfigurationImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public BatchConfigurationImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

}
