// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.fluent.models.MetricDefinitionInner;
import com.azure.resourcemanager.sql.generated.models.MetricAvailability;
import com.azure.resourcemanager.sql.generated.models.MetricDefinition;
import com.azure.resourcemanager.sql.generated.models.MetricName;
import com.azure.resourcemanager.sql.generated.models.PrimaryAggregationType;
import com.azure.resourcemanager.sql.generated.models.UnitDefinitionType;
import java.util.Collections;
import java.util.List;

public final class MetricDefinitionImpl implements MetricDefinition {
    private MetricDefinitionInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    MetricDefinitionImpl(MetricDefinitionInner innerObject,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public MetricName name() {
        return this.innerModel().name();
    }

    public PrimaryAggregationType primaryAggregationType() {
        return this.innerModel().primaryAggregationType();
    }

    public String resourceUri() {
        return this.innerModel().resourceUri();
    }

    public UnitDefinitionType unit() {
        return this.innerModel().unit();
    }

    public List<MetricAvailability> metricAvailabilities() {
        List<MetricAvailability> inner = this.innerModel().metricAvailabilities();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public MetricDefinitionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
