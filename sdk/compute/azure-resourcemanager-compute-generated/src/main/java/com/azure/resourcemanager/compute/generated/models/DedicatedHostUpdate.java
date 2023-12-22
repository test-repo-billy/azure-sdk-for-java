// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.generated.fluent.models.DedicatedHostProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Specifies information about the dedicated host. Only tags, autoReplaceOnFailure and licenseType may be updated.
 */
@Fluent
public final class DedicatedHostUpdate extends UpdateResource {
    /*
     * Properties of the dedicated host.
     */
    @JsonProperty(value = "properties")
    private DedicatedHostProperties innerProperties;

    /*
     * [List all available dedicated host sizes for resizing]
     * (https://docs.microsoft.com/rest/api/compute/dedicated-hosts/listavailablesizes). Resizing can be only used to
     * scale up DedicatedHost. Only name is required to be set.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Creates an instance of DedicatedHostUpdate class.
     */
    public DedicatedHostUpdate() {
    }

    /**
     * Get the innerProperties property: Properties of the dedicated host.
     * 
     * @return the innerProperties value.
     */
    private DedicatedHostProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sku property: [List all available dedicated host sizes for resizing]
     * (https://docs.microsoft.com/rest/api/compute/dedicated-hosts/listavailablesizes). Resizing can be only used to
     * scale up DedicatedHost. Only name is required to be set.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: [List all available dedicated host sizes for resizing]
     * (https://docs.microsoft.com/rest/api/compute/dedicated-hosts/listavailablesizes). Resizing can be only used to
     * scale up DedicatedHost. Only name is required to be set.
     * 
     * @param sku the sku value to set.
     * @return the DedicatedHostUpdate object itself.
     */
    public DedicatedHostUpdate withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DedicatedHostUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the platformFaultDomain property: Fault domain of the dedicated host within a dedicated host group.
     * 
     * @return the platformFaultDomain value.
     */
    public Integer platformFaultDomain() {
        return this.innerProperties() == null ? null : this.innerProperties().platformFaultDomain();
    }

    /**
     * Set the platformFaultDomain property: Fault domain of the dedicated host within a dedicated host group.
     * 
     * @param platformFaultDomain the platformFaultDomain value to set.
     * @return the DedicatedHostUpdate object itself.
     */
    public DedicatedHostUpdate withPlatformFaultDomain(Integer platformFaultDomain) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DedicatedHostProperties();
        }
        this.innerProperties().withPlatformFaultDomain(platformFaultDomain);
        return this;
    }

    /**
     * Get the autoReplaceOnFailure property: Specifies whether the dedicated host should be replaced automatically in
     * case of a failure. The value is defaulted to 'true' when not provided.
     * 
     * @return the autoReplaceOnFailure value.
     */
    public Boolean autoReplaceOnFailure() {
        return this.innerProperties() == null ? null : this.innerProperties().autoReplaceOnFailure();
    }

    /**
     * Set the autoReplaceOnFailure property: Specifies whether the dedicated host should be replaced automatically in
     * case of a failure. The value is defaulted to 'true' when not provided.
     * 
     * @param autoReplaceOnFailure the autoReplaceOnFailure value to set.
     * @return the DedicatedHostUpdate object itself.
     */
    public DedicatedHostUpdate withAutoReplaceOnFailure(Boolean autoReplaceOnFailure) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DedicatedHostProperties();
        }
        this.innerProperties().withAutoReplaceOnFailure(autoReplaceOnFailure);
        return this;
    }

    /**
     * Get the hostId property: A unique id generated and assigned to the dedicated host by the platform. Does not
     * change throughout the lifetime of the host.
     * 
     * @return the hostId value.
     */
    public String hostId() {
        return this.innerProperties() == null ? null : this.innerProperties().hostId();
    }

    /**
     * Get the virtualMachines property: A list of references to all virtual machines in the Dedicated Host.
     * 
     * @return the virtualMachines value.
     */
    public List<SubResourceReadOnly> virtualMachines() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachines();
    }

    /**
     * Get the licenseType property: Specifies the software license type that will be applied to the VMs deployed on
     * the dedicated host. Possible values are: **None,** **Windows_Server_Hybrid,** **Windows_Server_Perpetual.** The
     * default value is: **None.**.
     * 
     * @return the licenseType value.
     */
    public DedicatedHostLicenseTypes licenseType() {
        return this.innerProperties() == null ? null : this.innerProperties().licenseType();
    }

    /**
     * Set the licenseType property: Specifies the software license type that will be applied to the VMs deployed on
     * the dedicated host. Possible values are: **None,** **Windows_Server_Hybrid,** **Windows_Server_Perpetual.** The
     * default value is: **None.**.
     * 
     * @param licenseType the licenseType value to set.
     * @return the DedicatedHostUpdate object itself.
     */
    public DedicatedHostUpdate withLicenseType(DedicatedHostLicenseTypes licenseType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DedicatedHostProperties();
        }
        this.innerProperties().withLicenseType(licenseType);
        return this;
    }

    /**
     * Get the provisioningTime property: The date when the host was first provisioned.
     * 
     * @return the provisioningTime value.
     */
    public OffsetDateTime provisioningTime() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningTime();
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the instanceView property: The dedicated host instance view.
     * 
     * @return the instanceView value.
     */
    public DedicatedHostInstanceView instanceView() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceView();
    }

    /**
     * Get the timeCreated property: Specifies the time at which the Dedicated Host resource was created. Minimum
     * api-version: 2021-11-01.
     * 
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.innerProperties() == null ? null : this.innerProperties().timeCreated();
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
        if (sku() != null) {
            sku().validate();
        }
    }
}
