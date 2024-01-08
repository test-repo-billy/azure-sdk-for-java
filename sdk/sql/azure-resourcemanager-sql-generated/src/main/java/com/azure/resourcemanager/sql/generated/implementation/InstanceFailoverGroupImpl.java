// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.InstanceFailoverGroupInner;
import com.azure.resourcemanager.sql.generated.models.InstanceFailoverGroup;
import com.azure.resourcemanager.sql.generated.models.InstanceFailoverGroupReadOnlyEndpoint;
import com.azure.resourcemanager.sql.generated.models.InstanceFailoverGroupReadWriteEndpoint;
import com.azure.resourcemanager.sql.generated.models.InstanceFailoverGroupReplicationRole;
import com.azure.resourcemanager.sql.generated.models.ManagedInstancePairInfo;
import com.azure.resourcemanager.sql.generated.models.PartnerRegionInfo;
import com.azure.resourcemanager.sql.generated.models.SecondaryInstanceType;
import java.util.Collections;
import java.util.List;

public final class InstanceFailoverGroupImpl
    implements InstanceFailoverGroup, InstanceFailoverGroup.Definition, InstanceFailoverGroup.Update {
    private InstanceFailoverGroupInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SecondaryInstanceType secondaryType() {
        return this.innerModel().secondaryType();
    }

    public InstanceFailoverGroupReadWriteEndpoint readWriteEndpoint() {
        return this.innerModel().readWriteEndpoint();
    }

    public InstanceFailoverGroupReadOnlyEndpoint readOnlyEndpoint() {
        return this.innerModel().readOnlyEndpoint();
    }

    public InstanceFailoverGroupReplicationRole replicationRole() {
        return this.innerModel().replicationRole();
    }

    public String replicationState() {
        return this.innerModel().replicationState();
    }

    public List<PartnerRegionInfo> partnerRegions() {
        List<PartnerRegionInfo> inner = this.innerModel().partnerRegions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ManagedInstancePairInfo> managedInstancePairs() {
        List<ManagedInstancePairInfo> inner = this.innerModel().managedInstancePairs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public InstanceFailoverGroupInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String locationName;

    private String failoverGroupName;

    public InstanceFailoverGroupImpl withExistingLocation(String resourceGroupName, String locationName) {
        this.resourceGroupName = resourceGroupName;
        this.locationName = locationName;
        return this;
    }

    public InstanceFailoverGroup create() {
        this.innerObject = serviceManager.serviceClient().getInstanceFailoverGroups().createOrUpdate(resourceGroupName,
            locationName, failoverGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public InstanceFailoverGroup create(Context context) {
        this.innerObject = serviceManager.serviceClient().getInstanceFailoverGroups().createOrUpdate(resourceGroupName,
            locationName, failoverGroupName, this.innerModel(), context);
        return this;
    }

    InstanceFailoverGroupImpl(String name, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = new InstanceFailoverGroupInner();
        this.serviceManager = serviceManager;
        this.failoverGroupName = name;
    }

    public InstanceFailoverGroupImpl update() {
        return this;
    }

    public InstanceFailoverGroup apply() {
        this.innerObject = serviceManager.serviceClient().getInstanceFailoverGroups().createOrUpdate(resourceGroupName,
            locationName, failoverGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public InstanceFailoverGroup apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getInstanceFailoverGroups().createOrUpdate(resourceGroupName,
            locationName, failoverGroupName, this.innerModel(), context);
        return this;
    }

    InstanceFailoverGroupImpl(InstanceFailoverGroupInner innerObject,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.locationName = Utils.getValueFromIdByName(innerObject.id(), "locations");
        this.failoverGroupName = Utils.getValueFromIdByName(innerObject.id(), "instanceFailoverGroups");
    }

    public InstanceFailoverGroup refresh() {
        this.innerObject = serviceManager.serviceClient().getInstanceFailoverGroups()
            .getWithResponse(resourceGroupName, locationName, failoverGroupName, Context.NONE).getValue();
        return this;
    }

    public InstanceFailoverGroup refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getInstanceFailoverGroups()
            .getWithResponse(resourceGroupName, locationName, failoverGroupName, context).getValue();
        return this;
    }

    public InstanceFailoverGroup failover() {
        return serviceManager.instanceFailoverGroups().failover(resourceGroupName, locationName, failoverGroupName);
    }

    public InstanceFailoverGroup failover(Context context) {
        return serviceManager.instanceFailoverGroups().failover(resourceGroupName, locationName, failoverGroupName,
            context);
    }

    public InstanceFailoverGroup forceFailoverAllowDataLoss() {
        return serviceManager.instanceFailoverGroups().forceFailoverAllowDataLoss(resourceGroupName, locationName,
            failoverGroupName);
    }

    public InstanceFailoverGroup forceFailoverAllowDataLoss(Context context) {
        return serviceManager.instanceFailoverGroups().forceFailoverAllowDataLoss(resourceGroupName, locationName,
            failoverGroupName, context);
    }

    public InstanceFailoverGroupImpl withSecondaryType(SecondaryInstanceType secondaryType) {
        this.innerModel().withSecondaryType(secondaryType);
        return this;
    }

    public InstanceFailoverGroupImpl withReadWriteEndpoint(InstanceFailoverGroupReadWriteEndpoint readWriteEndpoint) {
        this.innerModel().withReadWriteEndpoint(readWriteEndpoint);
        return this;
    }

    public InstanceFailoverGroupImpl withReadOnlyEndpoint(InstanceFailoverGroupReadOnlyEndpoint readOnlyEndpoint) {
        this.innerModel().withReadOnlyEndpoint(readOnlyEndpoint);
        return this;
    }

    public InstanceFailoverGroupImpl withPartnerRegions(List<PartnerRegionInfo> partnerRegions) {
        this.innerModel().withPartnerRegions(partnerRegions);
        return this;
    }

    public InstanceFailoverGroupImpl withManagedInstancePairs(List<ManagedInstancePairInfo> managedInstancePairs) {
        this.innerModel().withManagedInstancePairs(managedInstancePairs);
        return this;
    }
}
