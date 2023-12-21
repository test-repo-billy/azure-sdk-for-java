/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.monitor.v2018_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.monitor.v2018_01_01.MetricDefinitions;
import rx.functions.Func1;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.monitor.v2018_01_01.MetricDefinition;

class MetricDefinitionsImpl extends WrapperImpl<MetricDefinitionsInner> implements MetricDefinitions {
    private final MonitorManager manager;

    MetricDefinitionsImpl(MonitorManager manager) {
        super(manager.inner().metricDefinitions());
        this.manager = manager;
    }

    public MonitorManager manager() {
        return this.manager;
    }

    @Override
    public Observable<MetricDefinition> listAsync(String resourceUri) {
        MetricDefinitionsInner client = this.inner();
        return client.listAsync(resourceUri)
        .flatMap(new Func1<List<MetricDefinitionInner>, Observable<MetricDefinitionInner>>() {
            @Override
            public Observable<MetricDefinitionInner> call(List<MetricDefinitionInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<MetricDefinitionInner, MetricDefinition>() {
            @Override
            public MetricDefinition call(MetricDefinitionInner inner) {
                return new MetricDefinitionImpl(inner, manager());
            }
        });
    }

}
