// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.GeoBackupPolicyInner;
import com.azure.resourcemanager.sql.generated.models.GeoBackupPolicy;
import com.azure.resourcemanager.sql.generated.models.GeoBackupPolicyName;
import com.azure.resourcemanager.sql.generated.models.GeoBackupPolicyState;

public final class GeoBackupPolicyImpl implements GeoBackupPolicy, GeoBackupPolicy.Definition, GeoBackupPolicy.Update {
    private GeoBackupPolicyInner innerObject;

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

    public String kind() {
        return this.innerModel().kind();
    }

    public String location() {
        return this.innerModel().location();
    }

    public GeoBackupPolicyState state() {
        return this.innerModel().state();
    }

    public String storageType() {
        return this.innerModel().storageType();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public GeoBackupPolicyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String databaseName;

    private GeoBackupPolicyName geoBackupPolicyName;

    public GeoBackupPolicyImpl withExistingDatabase(String resourceGroupName, String serverName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.databaseName = databaseName;
        return this;
    }

    public GeoBackupPolicy create() {
        this.innerObject
            = serviceManager.serviceClient().getGeoBackupPolicies().createOrUpdateWithResponse(resourceGroupName,
                serverName, databaseName, geoBackupPolicyName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public GeoBackupPolicy create(Context context) {
        this.innerObject
            = serviceManager.serviceClient().getGeoBackupPolicies().createOrUpdateWithResponse(resourceGroupName,
                serverName, databaseName, geoBackupPolicyName, this.innerModel(), context).getValue();
        return this;
    }

    GeoBackupPolicyImpl(GeoBackupPolicyName name, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = new GeoBackupPolicyInner();
        this.serviceManager = serviceManager;
        this.geoBackupPolicyName = name;
    }

    public GeoBackupPolicyImpl update() {
        return this;
    }

    public GeoBackupPolicy apply() {
        this.innerObject
            = serviceManager.serviceClient().getGeoBackupPolicies().createOrUpdateWithResponse(resourceGroupName,
                serverName, databaseName, geoBackupPolicyName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public GeoBackupPolicy apply(Context context) {
        this.innerObject
            = serviceManager.serviceClient().getGeoBackupPolicies().createOrUpdateWithResponse(resourceGroupName,
                serverName, databaseName, geoBackupPolicyName, this.innerModel(), context).getValue();
        return this;
    }

    GeoBackupPolicyImpl(GeoBackupPolicyInner innerObject,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "databases");
        this.geoBackupPolicyName
            = GeoBackupPolicyName.fromString(Utils.getValueFromIdByName(innerObject.id(), "geoBackupPolicies"));
    }

    public GeoBackupPolicy refresh() {
        this.innerObject = serviceManager.serviceClient().getGeoBackupPolicies()
            .getWithResponse(resourceGroupName, serverName, databaseName, geoBackupPolicyName, Context.NONE).getValue();
        return this;
    }

    public GeoBackupPolicy refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getGeoBackupPolicies()
            .getWithResponse(resourceGroupName, serverName, databaseName, geoBackupPolicyName, context).getValue();
        return this;
    }

    public GeoBackupPolicyImpl withState(GeoBackupPolicyState state) {
        this.innerModel().withState(state);
        return this;
    }
}
