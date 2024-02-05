// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.DiskInner;
import com.azure.resourcemanager.compute.generated.models.AccessUri;
import com.azure.resourcemanager.compute.generated.models.CreationData;
import com.azure.resourcemanager.compute.generated.models.DataAccessAuthMode;
import com.azure.resourcemanager.compute.generated.models.Disk;
import com.azure.resourcemanager.compute.generated.models.DiskSecurityProfile;
import com.azure.resourcemanager.compute.generated.models.DiskSku;
import com.azure.resourcemanager.compute.generated.models.DiskState;
import com.azure.resourcemanager.compute.generated.models.DiskUpdate;
import com.azure.resourcemanager.compute.generated.models.Encryption;
import com.azure.resourcemanager.compute.generated.models.EncryptionSettingsCollection;
import com.azure.resourcemanager.compute.generated.models.ExtendedLocation;
import com.azure.resourcemanager.compute.generated.models.GrantAccessData;
import com.azure.resourcemanager.compute.generated.models.HyperVGeneration;
import com.azure.resourcemanager.compute.generated.models.NetworkAccessPolicy;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.generated.models.PropertyUpdatesInProgress;
import com.azure.resourcemanager.compute.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.compute.generated.models.PurchasePlanAutoGenerated;
import com.azure.resourcemanager.compute.generated.models.ShareInfoElement;
import com.azure.resourcemanager.compute.generated.models.SupportedCapabilities;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class DiskImpl implements Disk, Disk.Definition, Disk.Update {
    private DiskInner innerObject;

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

    public String managedBy() {
        return this.innerModel().managedBy();
    }

    public List<String> managedByExtended() {
        List<String> inner = this.innerModel().managedByExtended();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public DiskSku sku() {
        return this.innerModel().sku();
    }

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public OffsetDateTime timeCreated() {
        return this.innerModel().timeCreated();
    }

    public OperatingSystemTypes osType() {
        return this.innerModel().osType();
    }

    public HyperVGeneration hyperVGeneration() {
        return this.innerModel().hyperVGeneration();
    }

    public PurchasePlanAutoGenerated purchasePlan() {
        return this.innerModel().purchasePlan();
    }

    public SupportedCapabilities supportedCapabilities() {
        return this.innerModel().supportedCapabilities();
    }

    public CreationData creationData() {
        return this.innerModel().creationData();
    }

    public Integer diskSizeGB() {
        return this.innerModel().diskSizeGB();
    }

    public Long diskSizeBytes() {
        return this.innerModel().diskSizeBytes();
    }

    public String uniqueId() {
        return this.innerModel().uniqueId();
    }

    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.innerModel().encryptionSettingsCollection();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Long diskIopsReadWrite() {
        return this.innerModel().diskIopsReadWrite();
    }

    public Long diskMBpsReadWrite() {
        return this.innerModel().diskMBpsReadWrite();
    }

    public Long diskIopsReadOnly() {
        return this.innerModel().diskIopsReadOnly();
    }

    public Long diskMBpsReadOnly() {
        return this.innerModel().diskMBpsReadOnly();
    }

    public DiskState diskState() {
        return this.innerModel().diskState();
    }

    public Encryption encryption() {
        return this.innerModel().encryption();
    }

    public Integer maxShares() {
        return this.innerModel().maxShares();
    }

    public List<ShareInfoElement> shareInfo() {
        List<ShareInfoElement> inner = this.innerModel().shareInfo();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public NetworkAccessPolicy networkAccessPolicy() {
        return this.innerModel().networkAccessPolicy();
    }

    public String diskAccessId() {
        return this.innerModel().diskAccessId();
    }

    public OffsetDateTime burstingEnabledTime() {
        return this.innerModel().burstingEnabledTime();
    }

    public String tier() {
        return this.innerModel().tier();
    }

    public Boolean burstingEnabled() {
        return this.innerModel().burstingEnabled();
    }

    public PropertyUpdatesInProgress propertyUpdatesInProgress() {
        return this.innerModel().propertyUpdatesInProgress();
    }

    public Boolean supportsHibernation() {
        return this.innerModel().supportsHibernation();
    }

    public DiskSecurityProfile securityProfile() {
        return this.innerModel().securityProfile();
    }

    public Float completionPercent() {
        return this.innerModel().completionPercent();
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public DataAccessAuthMode dataAccessAuthMode() {
        return this.innerModel().dataAccessAuthMode();
    }

    public Boolean optimizedForFrequentAttach() {
        return this.innerModel().optimizedForFrequentAttach();
    }

    public OffsetDateTime lastOwnershipUpdateTime() {
        return this.innerModel().lastOwnershipUpdateTime();
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

    public DiskInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String diskName;

    private DiskUpdate updateDisk;

    public DiskImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Disk create() {
        this.innerObject = serviceManager.serviceClient().getDisks().createOrUpdate(resourceGroupName, diskName,
            this.innerModel(), Context.NONE);
        return this;
    }

    public Disk create(Context context) {
        this.innerObject = serviceManager.serviceClient().getDisks().createOrUpdate(resourceGroupName, diskName,
            this.innerModel(), context);
        return this;
    }

    DiskImpl(String name, com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = new DiskInner();
        this.serviceManager = serviceManager;
        this.diskName = name;
    }

    public DiskImpl update() {
        this.updateDisk = new DiskUpdate();
        return this;
    }

    public Disk apply() {
        this.innerObject
            = serviceManager.serviceClient().getDisks().update(resourceGroupName, diskName, updateDisk, Context.NONE);
        return this;
    }

    public Disk apply(Context context) {
        this.innerObject
            = serviceManager.serviceClient().getDisks().update(resourceGroupName, diskName, updateDisk, context);
        return this;
    }

    DiskImpl(DiskInner innerObject, com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.diskName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "disks");
    }

    public Disk refresh() {
        this.innerObject = serviceManager.serviceClient().getDisks()
            .getByResourceGroupWithResponse(resourceGroupName, diskName, Context.NONE).getValue();
        return this;
    }

    public Disk refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getDisks()
            .getByResourceGroupWithResponse(resourceGroupName, diskName, context).getValue();
        return this;
    }

    public AccessUri grantAccess(GrantAccessData grantAccessData) {
        return serviceManager.disks().grantAccess(resourceGroupName, diskName, grantAccessData);
    }

    public AccessUri grantAccess(GrantAccessData grantAccessData, Context context) {
        return serviceManager.disks().grantAccess(resourceGroupName, diskName, grantAccessData, context);
    }

    public void revokeAccess() {
        serviceManager.disks().revokeAccess(resourceGroupName, diskName);
    }

    public void revokeAccess(Context context) {
        serviceManager.disks().revokeAccess(resourceGroupName, diskName, context);
    }

    public DiskImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public DiskImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public DiskImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateDisk.withTags(tags);
            return this;
        }
    }

    public DiskImpl withSku(DiskSku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateDisk.withSku(sku);
            return this;
        }
    }

    public DiskImpl withZones(List<String> zones) {
        this.innerModel().withZones(zones);
        return this;
    }

    public DiskImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public DiskImpl withOsType(OperatingSystemTypes osType) {
        if (isInCreateMode()) {
            this.innerModel().withOsType(osType);
            return this;
        } else {
            this.updateDisk.withOsType(osType);
            return this;
        }
    }

    public DiskImpl withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        this.innerModel().withHyperVGeneration(hyperVGeneration);
        return this;
    }

    public DiskImpl withPurchasePlan(PurchasePlanAutoGenerated purchasePlan) {
        if (isInCreateMode()) {
            this.innerModel().withPurchasePlan(purchasePlan);
            return this;
        } else {
            this.updateDisk.withPurchasePlan(purchasePlan);
            return this;
        }
    }

    public DiskImpl withSupportedCapabilities(SupportedCapabilities supportedCapabilities) {
        if (isInCreateMode()) {
            this.innerModel().withSupportedCapabilities(supportedCapabilities);
            return this;
        } else {
            this.updateDisk.withSupportedCapabilities(supportedCapabilities);
            return this;
        }
    }

    public DiskImpl withCreationData(CreationData creationData) {
        this.innerModel().withCreationData(creationData);
        return this;
    }

    public DiskImpl withDiskSizeGB(Integer diskSizeGB) {
        if (isInCreateMode()) {
            this.innerModel().withDiskSizeGB(diskSizeGB);
            return this;
        } else {
            this.updateDisk.withDiskSizeGB(diskSizeGB);
            return this;
        }
    }

    public DiskImpl withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection) {
        if (isInCreateMode()) {
            this.innerModel().withEncryptionSettingsCollection(encryptionSettingsCollection);
            return this;
        } else {
            this.updateDisk.withEncryptionSettingsCollection(encryptionSettingsCollection);
            return this;
        }
    }

    public DiskImpl withDiskIopsReadWrite(Long diskIopsReadWrite) {
        if (isInCreateMode()) {
            this.innerModel().withDiskIopsReadWrite(diskIopsReadWrite);
            return this;
        } else {
            this.updateDisk.withDiskIopsReadWrite(diskIopsReadWrite);
            return this;
        }
    }

    public DiskImpl withDiskMBpsReadWrite(Long diskMBpsReadWrite) {
        if (isInCreateMode()) {
            this.innerModel().withDiskMBpsReadWrite(diskMBpsReadWrite);
            return this;
        } else {
            this.updateDisk.withDiskMBpsReadWrite(diskMBpsReadWrite);
            return this;
        }
    }

    public DiskImpl withDiskIopsReadOnly(Long diskIopsReadOnly) {
        if (isInCreateMode()) {
            this.innerModel().withDiskIopsReadOnly(diskIopsReadOnly);
            return this;
        } else {
            this.updateDisk.withDiskIopsReadOnly(diskIopsReadOnly);
            return this;
        }
    }

    public DiskImpl withDiskMBpsReadOnly(Long diskMBpsReadOnly) {
        if (isInCreateMode()) {
            this.innerModel().withDiskMBpsReadOnly(diskMBpsReadOnly);
            return this;
        } else {
            this.updateDisk.withDiskMBpsReadOnly(diskMBpsReadOnly);
            return this;
        }
    }

    public DiskImpl withEncryption(Encryption encryption) {
        if (isInCreateMode()) {
            this.innerModel().withEncryption(encryption);
            return this;
        } else {
            this.updateDisk.withEncryption(encryption);
            return this;
        }
    }

    public DiskImpl withMaxShares(Integer maxShares) {
        if (isInCreateMode()) {
            this.innerModel().withMaxShares(maxShares);
            return this;
        } else {
            this.updateDisk.withMaxShares(maxShares);
            return this;
        }
    }

    public DiskImpl withNetworkAccessPolicy(NetworkAccessPolicy networkAccessPolicy) {
        if (isInCreateMode()) {
            this.innerModel().withNetworkAccessPolicy(networkAccessPolicy);
            return this;
        } else {
            this.updateDisk.withNetworkAccessPolicy(networkAccessPolicy);
            return this;
        }
    }

    public DiskImpl withDiskAccessId(String diskAccessId) {
        if (isInCreateMode()) {
            this.innerModel().withDiskAccessId(diskAccessId);
            return this;
        } else {
            this.updateDisk.withDiskAccessId(diskAccessId);
            return this;
        }
    }

    public DiskImpl withTier(String tier) {
        if (isInCreateMode()) {
            this.innerModel().withTier(tier);
            return this;
        } else {
            this.updateDisk.withTier(tier);
            return this;
        }
    }

    public DiskImpl withBurstingEnabled(Boolean burstingEnabled) {
        if (isInCreateMode()) {
            this.innerModel().withBurstingEnabled(burstingEnabled);
            return this;
        } else {
            this.updateDisk.withBurstingEnabled(burstingEnabled);
            return this;
        }
    }

    public DiskImpl withSupportsHibernation(Boolean supportsHibernation) {
        if (isInCreateMode()) {
            this.innerModel().withSupportsHibernation(supportsHibernation);
            return this;
        } else {
            this.updateDisk.withSupportsHibernation(supportsHibernation);
            return this;
        }
    }

    public DiskImpl withSecurityProfile(DiskSecurityProfile securityProfile) {
        this.innerModel().withSecurityProfile(securityProfile);
        return this;
    }

    public DiskImpl withCompletionPercent(Float completionPercent) {
        this.innerModel().withCompletionPercent(completionPercent);
        return this;
    }

    public DiskImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (isInCreateMode()) {
            this.innerModel().withPublicNetworkAccess(publicNetworkAccess);
            return this;
        } else {
            this.updateDisk.withPublicNetworkAccess(publicNetworkAccess);
            return this;
        }
    }

    public DiskImpl withDataAccessAuthMode(DataAccessAuthMode dataAccessAuthMode) {
        if (isInCreateMode()) {
            this.innerModel().withDataAccessAuthMode(dataAccessAuthMode);
            return this;
        } else {
            this.updateDisk.withDataAccessAuthMode(dataAccessAuthMode);
            return this;
        }
    }

    public DiskImpl withOptimizedForFrequentAttach(Boolean optimizedForFrequentAttach) {
        if (isInCreateMode()) {
            this.innerModel().withOptimizedForFrequentAttach(optimizedForFrequentAttach);
            return this;
        } else {
            this.updateDisk.withOptimizedForFrequentAttach(optimizedForFrequentAttach);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
