// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.compute.generated.fluent.models.StorageProfileInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetVMInstanceViewInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetVMPropertiesInner;
import com.azure.resourcemanager.compute.generated.models.AdditionalCapabilities;
import com.azure.resourcemanager.compute.generated.models.DiagnosticsProfile;
import com.azure.resourcemanager.compute.generated.models.HardwareProfile;
import com.azure.resourcemanager.compute.generated.models.NetworkProfile;
import com.azure.resourcemanager.compute.generated.models.OSProfile;
import com.azure.resourcemanager.compute.generated.models.SecurityProfile;
import com.azure.resourcemanager.compute.generated.models.StorageProfile;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMInstanceView;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMNetworkProfileConfiguration;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMProperties;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMProtectionPolicy;
import java.time.OffsetDateTime;

public final class VirtualMachineScaleSetVMPropertiesImpl implements VirtualMachineScaleSetVMProperties {
    private VirtualMachineScaleSetVMPropertiesInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    VirtualMachineScaleSetVMPropertiesImpl(VirtualMachineScaleSetVMPropertiesInner innerObject,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean latestModelApplied() {
        return this.innerModel().latestModelApplied();
    }

    public String vmId() {
        return this.innerModel().vmId();
    }

    public VirtualMachineScaleSetVMInstanceView instanceView() {
        VirtualMachineScaleSetVMInstanceViewInner inner = this.innerModel().instanceView();
        if (inner != null) {
            return new VirtualMachineScaleSetVMInstanceViewImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public HardwareProfile hardwareProfile() {
        return this.innerModel().hardwareProfile();
    }

    public StorageProfile storageProfile() {
        StorageProfileInner inner = this.innerModel().storageProfile();
        if (inner != null) {
            return new StorageProfileImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AdditionalCapabilities additionalCapabilities() {
        return this.innerModel().additionalCapabilities();
    }

    public OSProfile osProfile() {
        return this.innerModel().osProfile();
    }

    public SecurityProfile securityProfile() {
        return this.innerModel().securityProfile();
    }

    public NetworkProfile networkProfile() {
        return this.innerModel().networkProfile();
    }

    public VirtualMachineScaleSetVMNetworkProfileConfiguration networkProfileConfiguration() {
        return this.innerModel().networkProfileConfiguration();
    }

    public DiagnosticsProfile diagnosticsProfile() {
        return this.innerModel().diagnosticsProfile();
    }

    public SubResource availabilitySet() {
        return this.innerModel().availabilitySet();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String licenseType() {
        return this.innerModel().licenseType();
    }

    public String modelDefinitionApplied() {
        return this.innerModel().modelDefinitionApplied();
    }

    public VirtualMachineScaleSetVMProtectionPolicy protectionPolicy() {
        return this.innerModel().protectionPolicy();
    }

    public String userData() {
        return this.innerModel().userData();
    }

    public OffsetDateTime timeCreated() {
        return this.innerModel().timeCreated();
    }

    public VirtualMachineScaleSetVMPropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
