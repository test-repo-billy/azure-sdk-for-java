/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2016_06_01.RosettaNetProcessConfigurations;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.logic.v2016_06_01.IntegrationAccountRosettaNetProcessConfiguration;

class RosettaNetProcessConfigurationsImpl extends WrapperImpl<RosettaNetProcessConfigurationsInner> implements RosettaNetProcessConfigurations {
    private final LogicManager manager;

    RosettaNetProcessConfigurationsImpl(LogicManager manager) {
        super(manager.inner().rosettaNetProcessConfigurations());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public IntegrationAccountRosettaNetProcessConfigurationImpl define(String name) {
        return wrapModel(name);
    }

    private IntegrationAccountRosettaNetProcessConfigurationImpl wrapModel(IntegrationAccountRosettaNetProcessConfigurationInner inner) {
        return  new IntegrationAccountRosettaNetProcessConfigurationImpl(inner, manager());
    }

    private IntegrationAccountRosettaNetProcessConfigurationImpl wrapModel(String name) {
        return new IntegrationAccountRosettaNetProcessConfigurationImpl(name, this.manager());
    }

    @Override
    public Observable<IntegrationAccountRosettaNetProcessConfiguration> listByIntegrationAccountsAsync(final String resourceGroupName, final String integrationAccountName) {
        RosettaNetProcessConfigurationsInner client = this.inner();
        return client.listByIntegrationAccountsAsync(resourceGroupName, integrationAccountName)
        .flatMapIterable(new Func1<Page<IntegrationAccountRosettaNetProcessConfigurationInner>, Iterable<IntegrationAccountRosettaNetProcessConfigurationInner>>() {
            @Override
            public Iterable<IntegrationAccountRosettaNetProcessConfigurationInner> call(Page<IntegrationAccountRosettaNetProcessConfigurationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<IntegrationAccountRosettaNetProcessConfigurationInner, IntegrationAccountRosettaNetProcessConfiguration>() {
            @Override
            public IntegrationAccountRosettaNetProcessConfiguration call(IntegrationAccountRosettaNetProcessConfigurationInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<IntegrationAccountRosettaNetProcessConfiguration> getAsync(String resourceGroupName, String integrationAccountName, String rosettaNetProcessConfigurationName) {
        RosettaNetProcessConfigurationsInner client = this.inner();
        return client.getAsync(resourceGroupName, integrationAccountName, rosettaNetProcessConfigurationName)
        .map(new Func1<IntegrationAccountRosettaNetProcessConfigurationInner, IntegrationAccountRosettaNetProcessConfiguration>() {
            @Override
            public IntegrationAccountRosettaNetProcessConfiguration call(IntegrationAccountRosettaNetProcessConfigurationInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String integrationAccountName, String rosettaNetProcessConfigurationName) {
        RosettaNetProcessConfigurationsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, integrationAccountName, rosettaNetProcessConfigurationName).toCompletable();
    }

}
