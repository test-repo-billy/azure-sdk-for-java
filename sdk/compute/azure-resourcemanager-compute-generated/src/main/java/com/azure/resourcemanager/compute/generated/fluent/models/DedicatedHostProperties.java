// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.generated.models.DedicatedHostInstanceView;
import com.azure.resourcemanager.compute.generated.models.DedicatedHostLicenseTypes;
import com.azure.resourcemanager.compute.generated.models.SubResourceReadOnly;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Properties of the dedicated host.
 */
@Fluent
public final class DedicatedHostProperties {
    /*
     * Fault domain of the dedicated host within a dedicated host group.
     */
    @JsonProperty(value = "platformFaultDomain")
    private Integer platformFaultDomain;

    /*
     * Specifies whether the dedicated host should be replaced automatically in case of a failure. The value is
     * defaulted to 'true' when not provided.
     */
    @JsonProperty(value = "autoReplaceOnFailure")
    private Boolean autoReplaceOnFailure;

    /*
     * A unique id generated and assigned to the dedicated host by the platform. Does not change throughout the
     * lifetime of the host.
     */
    @JsonProperty(value = "hostId", access = JsonProperty.Access.WRITE_ONLY)
    private String hostId;

    /*
     * A list of references to all virtual machines in the Dedicated Host.
     */
    @JsonProperty(value = "virtualMachines", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResourceReadOnly> virtualMachines;

    /*
     * Specifies the software license type that will be applied to the VMs deployed on the dedicated host. Possible
     * values are: **None,** **Windows_Server_Hybrid,** **Windows_Server_Perpetual.** The default value is: **None.**
     */
    @JsonProperty(value = "licenseType")
    private DedicatedHostLicenseTypes licenseType;

    /*
     * The date when the host was first provisioned.
     */
    @JsonProperty(value = "provisioningTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime provisioningTime;

    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The dedicated host instance view.
     */
    @JsonProperty(value = "instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private DedicatedHostInstanceView instanceView;

    /*
     * Specifies the time at which the Dedicated Host resource was created. Minimum api-version: 2021-11-01.
     */
    @JsonProperty(value = "timeCreated", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timeCreated;

    /**
     * Creates an instance of DedicatedHostProperties class.
     */
    public DedicatedHostProperties() {
    }

    /**
     * Get the platformFaultDomain property: Fault domain of the dedicated host within a dedicated host group.
     * 
     * @return the platformFaultDomain value.
     */
    public Integer platformFaultDomain() {
        return this.platformFaultDomain;
    }

    /**
     * Set the platformFaultDomain property: Fault domain of the dedicated host within a dedicated host group.
     * 
     * @param platformFaultDomain the platformFaultDomain value to set.
     * @return the DedicatedHostProperties object itself.
     */
    public DedicatedHostProperties withPlatformFaultDomain(Integer platformFaultDomain) {
        this.platformFaultDomain = platformFaultDomain;
        return this;
    }

    /**
     * Get the autoReplaceOnFailure property: Specifies whether the dedicated host should be replaced automatically in
     * case of a failure. The value is defaulted to 'true' when not provided.
     * 
     * @return the autoReplaceOnFailure value.
     */
    public Boolean autoReplaceOnFailure() {
        return this.autoReplaceOnFailure;
    }

    /**
     * Set the autoReplaceOnFailure property: Specifies whether the dedicated host should be replaced automatically in
     * case of a failure. The value is defaulted to 'true' when not provided.
     * 
     * @param autoReplaceOnFailure the autoReplaceOnFailure value to set.
     * @return the DedicatedHostProperties object itself.
     */
    public DedicatedHostProperties withAutoReplaceOnFailure(Boolean autoReplaceOnFailure) {
        this.autoReplaceOnFailure = autoReplaceOnFailure;
        return this;
    }

    /**
     * Get the hostId property: A unique id generated and assigned to the dedicated host by the platform. Does not
     * change throughout the lifetime of the host.
     * 
     * @return the hostId value.
     */
    public String hostId() {
        return this.hostId;
    }

    /**
     * Get the virtualMachines property: A list of references to all virtual machines in the Dedicated Host.
     * 
     * @return the virtualMachines value.
     */
    public List<SubResourceReadOnly> virtualMachines() {
        return this.virtualMachines;
    }

    /**
     * Get the licenseType property: Specifies the software license type that will be applied to the VMs deployed on
     * the dedicated host. Possible values are: **None,** **Windows_Server_Hybrid,** **Windows_Server_Perpetual.** The
     * default value is: **None.**.
     * 
     * @return the licenseType value.
     */
    public DedicatedHostLicenseTypes licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: Specifies the software license type that will be applied to the VMs deployed on
     * the dedicated host. Possible values are: **None,** **Windows_Server_Hybrid,** **Windows_Server_Perpetual.** The
     * default value is: **None.**.
     * 
     * @param licenseType the licenseType value to set.
     * @return the DedicatedHostProperties object itself.
     */
    public DedicatedHostProperties withLicenseType(DedicatedHostLicenseTypes licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the provisioningTime property: The date when the host was first provisioned.
     * 
     * @return the provisioningTime value.
     */
    public OffsetDateTime provisioningTime() {
        return this.provisioningTime;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the instanceView property: The dedicated host instance view.
     * 
     * @return the instanceView value.
     */
    public DedicatedHostInstanceView instanceView() {
        return this.instanceView;
    }

    /**
     * Get the timeCreated property: Specifies the time at which the Dedicated Host resource was created. Minimum
     * api-version: 2021-11-01.
     * 
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.timeCreated;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualMachines() != null) {
            virtualMachines().forEach(e -> e.validate());
        }
        if (instanceView() != null) {
            instanceView().validate();
        }
    }
}
