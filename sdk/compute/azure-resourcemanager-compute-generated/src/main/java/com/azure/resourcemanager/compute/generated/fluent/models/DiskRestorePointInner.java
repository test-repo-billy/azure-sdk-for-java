// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.generated.models.DiskSecurityProfile;
import com.azure.resourcemanager.compute.generated.models.Encryption;
import com.azure.resourcemanager.compute.generated.models.HyperVGeneration;
import com.azure.resourcemanager.compute.generated.models.NetworkAccessPolicy;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.generated.models.ProxyOnlyResource;
import com.azure.resourcemanager.compute.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.compute.generated.models.PurchasePlanAutoGenerated;
import com.azure.resourcemanager.compute.generated.models.SupportedCapabilities;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Properties of disk restore point.
 */
@Fluent
public final class DiskRestorePointInner extends ProxyOnlyResource {
    /*
     * Properties of an incremental disk restore point
     */
    @JsonProperty(value = "properties")
    private DiskRestorePointProperties innerProperties;

    /**
     * Creates an instance of DiskRestorePointInner class.
     */
    public DiskRestorePointInner() {
    }

    /**
     * Get the innerProperties property: Properties of an incremental disk restore point.
     * 
     * @return the innerProperties value.
     */
    private DiskRestorePointProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the timeCreated property: The timestamp of restorePoint creation.
     * 
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.innerProperties() == null ? null : this.innerProperties().timeCreated();
    }

    /**
     * Get the sourceResourceId property: arm id of source disk or source disk restore point.
     * 
     * @return the sourceResourceId value.
     */
    public String sourceResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceResourceId();
    }

    /**
     * Get the osType property: The Operating System type.
     * 
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.innerProperties() == null ? null : this.innerProperties().osType();
    }

    /**
     * Get the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks
     * only.
     * 
     * @return the hyperVGeneration value.
     */
    public HyperVGeneration hyperVGeneration() {
        return this.innerProperties() == null ? null : this.innerProperties().hyperVGeneration();
    }

    /**
     * Set the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks
     * only.
     * 
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the DiskRestorePointInner object itself.
     */
    public DiskRestorePointInner withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskRestorePointProperties();
        }
        this.innerProperties().withHyperVGeneration(hyperVGeneration);
        return this;
    }

    /**
     * Get the purchasePlan property: Purchase plan information for the the image from which the OS disk was created.
     * 
     * @return the purchasePlan value.
     */
    public PurchasePlanAutoGenerated purchasePlan() {
        return this.innerProperties() == null ? null : this.innerProperties().purchasePlan();
    }

    /**
     * Set the purchasePlan property: Purchase plan information for the the image from which the OS disk was created.
     * 
     * @param purchasePlan the purchasePlan value to set.
     * @return the DiskRestorePointInner object itself.
     */
    public DiskRestorePointInner withPurchasePlan(PurchasePlanAutoGenerated purchasePlan) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskRestorePointProperties();
        }
        this.innerProperties().withPurchasePlan(purchasePlan);
        return this;
    }

    /**
     * Get the supportedCapabilities property: List of supported capabilities for the image from which the OS disk was
     * created.
     * 
     * @return the supportedCapabilities value.
     */
    public SupportedCapabilities supportedCapabilities() {
        return this.innerProperties() == null ? null : this.innerProperties().supportedCapabilities();
    }

    /**
     * Set the supportedCapabilities property: List of supported capabilities for the image from which the OS disk was
     * created.
     * 
     * @param supportedCapabilities the supportedCapabilities value to set.
     * @return the DiskRestorePointInner object itself.
     */
    public DiskRestorePointInner withSupportedCapabilities(SupportedCapabilities supportedCapabilities) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskRestorePointProperties();
        }
        this.innerProperties().withSupportedCapabilities(supportedCapabilities);
        return this;
    }

    /**
     * Get the familyId property: id of the backing snapshot's MIS family.
     * 
     * @return the familyId value.
     */
    public String familyId() {
        return this.innerProperties() == null ? null : this.innerProperties().familyId();
    }

    /**
     * Get the sourceUniqueId property: unique incarnation id of the source disk.
     * 
     * @return the sourceUniqueId value.
     */
    public String sourceUniqueId() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceUniqueId();
    }

    /**
     * Get the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     * 
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Get the supportsHibernation property: Indicates the OS on a disk supports hibernation.
     * 
     * @return the supportsHibernation value.
     */
    public Boolean supportsHibernation() {
        return this.innerProperties() == null ? null : this.innerProperties().supportsHibernation();
    }

    /**
     * Set the supportsHibernation property: Indicates the OS on a disk supports hibernation.
     * 
     * @param supportsHibernation the supportsHibernation value to set.
     * @return the DiskRestorePointInner object itself.
     */
    public DiskRestorePointInner withSupportsHibernation(Boolean supportsHibernation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskRestorePointProperties();
        }
        this.innerProperties().withSupportsHibernation(supportsHibernation);
        return this;
    }

    /**
     * Get the networkAccessPolicy property: Policy for accessing the disk via network.
     * 
     * @return the networkAccessPolicy value.
     */
    public NetworkAccessPolicy networkAccessPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().networkAccessPolicy();
    }

    /**
     * Set the networkAccessPolicy property: Policy for accessing the disk via network.
     * 
     * @param networkAccessPolicy the networkAccessPolicy value to set.
     * @return the DiskRestorePointInner object itself.
     */
    public DiskRestorePointInner withNetworkAccessPolicy(NetworkAccessPolicy networkAccessPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskRestorePointProperties();
        }
        this.innerProperties().withNetworkAccessPolicy(networkAccessPolicy);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Policy for controlling export on the disk.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Policy for controlling export on the disk.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the DiskRestorePointInner object itself.
     */
    public DiskRestorePointInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskRestorePointProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     * 
     * @return the diskAccessId value.
     */
    public String diskAccessId() {
        return this.innerProperties() == null ? null : this.innerProperties().diskAccessId();
    }

    /**
     * Set the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     * 
     * @param diskAccessId the diskAccessId value to set.
     * @return the DiskRestorePointInner object itself.
     */
    public DiskRestorePointInner withDiskAccessId(String diskAccessId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskRestorePointProperties();
        }
        this.innerProperties().withDiskAccessId(diskAccessId);
        return this;
    }

    /**
     * Get the completionPercent property: Percentage complete for the background copy of disk restore point when
     * source resource is from a different region.
     * 
     * @return the completionPercent value.
     */
    public Float completionPercent() {
        return this.innerProperties() == null ? null : this.innerProperties().completionPercent();
    }

    /**
     * Set the completionPercent property: Percentage complete for the background copy of disk restore point when
     * source resource is from a different region.
     * 
     * @param completionPercent the completionPercent value to set.
     * @return the DiskRestorePointInner object itself.
     */
    public DiskRestorePointInner withCompletionPercent(Float completionPercent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskRestorePointProperties();
        }
        this.innerProperties().withCompletionPercent(completionPercent);
        return this;
    }

    /**
     * Get the replicationState property: Replication state of disk restore point when source resource is from a
     * different region.
     * 
     * @return the replicationState value.
     */
    public String replicationState() {
        return this.innerProperties() == null ? null : this.innerProperties().replicationState();
    }

    /**
     * Get the sourceResourceLocation property: Location of source disk or source disk restore point when source
     * resource is from a different region.
     * 
     * @return the sourceResourceLocation value.
     */
    public String sourceResourceLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceResourceLocation();
    }

    /**
     * Get the securityProfile property: Contains the security related information for the resource.
     * 
     * @return the securityProfile value.
     */
    public DiskSecurityProfile securityProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().securityProfile();
    }

    /**
     * Set the securityProfile property: Contains the security related information for the resource.
     * 
     * @param securityProfile the securityProfile value to set.
     * @return the DiskRestorePointInner object itself.
     */
    public DiskRestorePointInner withSecurityProfile(DiskSecurityProfile securityProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskRestorePointProperties();
        }
        this.innerProperties().withSecurityProfile(securityProfile);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
