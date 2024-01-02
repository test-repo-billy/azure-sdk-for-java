// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.DiskEncryptionSetInner;
import com.azure.resourcemanager.compute.generated.models.ApiError;
import com.azure.resourcemanager.compute.generated.models.DiskEncryptionSet;
import com.azure.resourcemanager.compute.generated.models.DiskEncryptionSetType;
import com.azure.resourcemanager.compute.generated.models.DiskEncryptionSetUpdate;
import com.azure.resourcemanager.compute.generated.models.EncryptionSetIdentity;
import com.azure.resourcemanager.compute.generated.models.KeyForDiskEncryptionSet;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class DiskEncryptionSetImpl
    implements DiskEncryptionSet, DiskEncryptionSet.Definition, DiskEncryptionSet.Update {
    private DiskEncryptionSetInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public EncryptionSetIdentity identity() {
        return this.innerModel().identity();
    }

    public DiskEncryptionSetType encryptionType() {
        return this.innerModel().encryptionType();
    }

    public KeyForDiskEncryptionSet activeKey() {
        return this.innerModel().activeKey();
    }

    public List<KeyForDiskEncryptionSet> previousKeys() {
        List<KeyForDiskEncryptionSet> inner = this.innerModel().previousKeys();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Boolean rotationToLatestKeyVersionEnabled() {
        return this.innerModel().rotationToLatestKeyVersionEnabled();
    }

    public OffsetDateTime lastKeyRotationTimestamp() {
        return this.innerModel().lastKeyRotationTimestamp();
    }

    public ApiError autoKeyRotationError() {
        return this.innerModel().autoKeyRotationError();
    }

    public String federatedClientId() {
        return this.innerModel().federatedClientId();
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

    public DiskEncryptionSetInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String diskEncryptionSetName;

    private DiskEncryptionSetUpdate updateDiskEncryptionSet;

    public DiskEncryptionSetImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public DiskEncryptionSet create() {
        this.innerObject = serviceManager.serviceClient().getDiskEncryptionSets().createOrUpdate(resourceGroupName,
            diskEncryptionSetName, this.innerModel(), Context.NONE);
        return this;
    }

    public DiskEncryptionSet create(Context context) {
        this.innerObject = serviceManager.serviceClient().getDiskEncryptionSets().createOrUpdate(resourceGroupName,
            diskEncryptionSetName, this.innerModel(), context);
        return this;
    }

    DiskEncryptionSetImpl(String name, com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = new DiskEncryptionSetInner();
        this.serviceManager = serviceManager;
        this.diskEncryptionSetName = name;
    }

    public DiskEncryptionSetImpl update() {
        this.updateDiskEncryptionSet = new DiskEncryptionSetUpdate();
        return this;
    }

    public DiskEncryptionSet apply() {
        this.innerObject = serviceManager.serviceClient().getDiskEncryptionSets().update(resourceGroupName,
            diskEncryptionSetName, updateDiskEncryptionSet, Context.NONE);
        return this;
    }

    public DiskEncryptionSet apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getDiskEncryptionSets().update(resourceGroupName,
            diskEncryptionSetName, updateDiskEncryptionSet, context);
        return this;
    }

    DiskEncryptionSetImpl(DiskEncryptionSetInner innerObject,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.diskEncryptionSetName = Utils.getValueFromIdByName(innerObject.id(), "diskEncryptionSets");
    }

    public DiskEncryptionSet refresh() {
        this.innerObject = serviceManager.serviceClient().getDiskEncryptionSets()
            .getByResourceGroupWithResponse(resourceGroupName, diskEncryptionSetName, Context.NONE).getValue();
        return this;
    }

    public DiskEncryptionSet refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getDiskEncryptionSets()
            .getByResourceGroupWithResponse(resourceGroupName, diskEncryptionSetName, context).getValue();
        return this;
    }

    public DiskEncryptionSetImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public DiskEncryptionSetImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public DiskEncryptionSetImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateDiskEncryptionSet.withTags(tags);
            return this;
        }
    }

    public DiskEncryptionSetImpl withIdentity(EncryptionSetIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateDiskEncryptionSet.withIdentity(identity);
            return this;
        }
    }

    public DiskEncryptionSetImpl withEncryptionType(DiskEncryptionSetType encryptionType) {
        if (isInCreateMode()) {
            this.innerModel().withEncryptionType(encryptionType);
            return this;
        } else {
            this.updateDiskEncryptionSet.withEncryptionType(encryptionType);
            return this;
        }
    }

    public DiskEncryptionSetImpl withActiveKey(KeyForDiskEncryptionSet activeKey) {
        if (isInCreateMode()) {
            this.innerModel().withActiveKey(activeKey);
            return this;
        } else {
            this.updateDiskEncryptionSet.withActiveKey(activeKey);
            return this;
        }
    }

    public DiskEncryptionSetImpl withRotationToLatestKeyVersionEnabled(Boolean rotationToLatestKeyVersionEnabled) {
        if (isInCreateMode()) {
            this.innerModel().withRotationToLatestKeyVersionEnabled(rotationToLatestKeyVersionEnabled);
            return this;
        } else {
            this.updateDiskEncryptionSet.withRotationToLatestKeyVersionEnabled(rotationToLatestKeyVersionEnabled);
            return this;
        }
    }

    public DiskEncryptionSetImpl withFederatedClientId(String federatedClientId) {
        if (isInCreateMode()) {
            this.innerModel().withFederatedClientId(federatedClientId);
            return this;
        } else {
            this.updateDiskEncryptionSet.withFederatedClientId(federatedClientId);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
