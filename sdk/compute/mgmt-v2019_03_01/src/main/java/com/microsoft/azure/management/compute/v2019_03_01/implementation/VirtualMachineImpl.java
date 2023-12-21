/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01.implementation;

import com.microsoft.azure.management.compute.v2019_03_01.VirtualMachine;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.compute.v2019_03_01.VirtualMachineUpdate;
import java.util.Map;
import com.microsoft.azure.SubResource;
import java.util.List;
import com.microsoft.azure.management.compute.v2019_03_01.Plan;
import com.microsoft.azure.management.compute.v2019_03_01.HardwareProfile;
import com.microsoft.azure.management.compute.v2019_03_01.StorageProfile;
import com.microsoft.azure.management.compute.v2019_03_01.AdditionalCapabilities;
import com.microsoft.azure.management.compute.v2019_03_01.OSProfile;
import com.microsoft.azure.management.compute.v2019_03_01.NetworkProfile;
import com.microsoft.azure.management.compute.v2019_03_01.DiagnosticsProfile;
import com.microsoft.azure.management.compute.v2019_03_01.VirtualMachinePriorityTypes;
import com.microsoft.azure.management.compute.v2019_03_01.VirtualMachineEvictionPolicyTypes;
import com.microsoft.azure.management.compute.v2019_03_01.BillingProfile;
import com.microsoft.azure.management.compute.v2019_03_01.VirtualMachineIdentity;
import com.microsoft.azure.management.compute.v2019_03_01.VirtualMachineInstanceView;
import java.util.ArrayList;
import com.microsoft.azure.management.compute.v2019_03_01.VirtualMachineExtension;
import rx.functions.Func1;

class VirtualMachineImpl extends CreatableUpdatableImpl<VirtualMachine, VirtualMachineInner, VirtualMachineImpl> implements VirtualMachine, VirtualMachine.Definition, VirtualMachine.Update {
    private final ComputeManager manager;
    private String resourceGroupName;
    private String vmName;
    private VirtualMachineUpdate updateParameter;

    VirtualMachineImpl(String name, ComputeManager manager) {
        super(name, new VirtualMachineInner());
        this.manager = manager;
        // Set resource name
        this.vmName = name;
        //
        this.updateParameter = new VirtualMachineUpdate();
    }

    VirtualMachineImpl(VirtualMachineInner inner, ComputeManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.vmName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.vmName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualMachines");
        //
        this.updateParameter = new VirtualMachineUpdate();
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VirtualMachine> createResourceAsync() {
        VirtualMachinesInner client = this.manager().inner().virtualMachines();
        return client.createOrUpdateAsync(this.resourceGroupName, this.vmName, this.inner())
            .map(new Func1<VirtualMachineInner, VirtualMachineInner>() {
               @Override
               public VirtualMachineInner call(VirtualMachineInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualMachine> updateResourceAsync() {
        VirtualMachinesInner client = this.manager().inner().virtualMachines();
        return client.updateAsync(this.resourceGroupName, this.vmName, this.updateParameter)
            .map(new Func1<VirtualMachineInner, VirtualMachineInner>() {
               @Override
               public VirtualMachineInner call(VirtualMachineInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualMachineInner> getInnerAsync() {
        VirtualMachinesInner client = this.manager().inner().virtualMachines();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new VirtualMachineUpdate();
    }

    @Override
    public AdditionalCapabilities additionalCapabilities() {
        return this.inner().additionalCapabilities();
    }

    @Override
    public SubResource availabilitySet() {
        return this.inner().availabilitySet();
    }

    @Override
    public BillingProfile billingProfile() {
        return this.inner().billingProfile();
    }

    @Override
    public DiagnosticsProfile diagnosticsProfile() {
        return this.inner().diagnosticsProfile();
    }

    @Override
    public VirtualMachineEvictionPolicyTypes evictionPolicy() {
        return this.inner().evictionPolicy();
    }

    @Override
    public HardwareProfile hardwareProfile() {
        return this.inner().hardwareProfile();
    }

    @Override
    public SubResource host() {
        return this.inner().host();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public VirtualMachineIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public VirtualMachineInstanceView instanceView() {
        VirtualMachineInstanceViewInner inner = this.inner().instanceView();
        if (inner != null) {
            return  new VirtualMachineInstanceViewImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public String licenseType() {
        return this.inner().licenseType();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public NetworkProfile networkProfile() {
        return this.inner().networkProfile();
    }

    @Override
    public OSProfile osProfile() {
        return this.inner().osProfile();
    }

    @Override
    public Plan plan() {
        return this.inner().plan();
    }

    @Override
    public VirtualMachinePriorityTypes priority() {
        return this.inner().priority();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public SubResource proximityPlacementGroup() {
        return this.inner().proximityPlacementGroup();
    }

    @Override
    public List<VirtualMachineExtension> resources() {
        List<VirtualMachineExtension> lst = new ArrayList<VirtualMachineExtension>();
        if (this.inner().resources() != null) {
            for (VirtualMachineExtensionInner inner : this.inner().resources()) {
                lst.add( new VirtualMachineExtensionImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public StorageProfile storageProfile() {
        return this.inner().storageProfile();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public SubResource virtualMachineScaleSet() {
        return this.inner().virtualMachineScaleSet();
    }

    @Override
    public String vmId() {
        return this.inner().vmId();
    }

    @Override
    public List<String> zones() {
        return this.inner().zones();
    }

    @Override
    public VirtualMachineImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public VirtualMachineImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public VirtualMachineImpl withAdditionalCapabilities(AdditionalCapabilities additionalCapabilities) {
        if (isInCreateMode()) {
            this.inner().withAdditionalCapabilities(additionalCapabilities);
        } else {
            this.updateParameter.withAdditionalCapabilities(additionalCapabilities);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withAvailabilitySet(SubResource availabilitySet) {
        if (isInCreateMode()) {
            this.inner().withAvailabilitySet(availabilitySet);
        } else {
            this.updateParameter.withAvailabilitySet(availabilitySet);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withBillingProfile(BillingProfile billingProfile) {
        if (isInCreateMode()) {
            this.inner().withBillingProfile(billingProfile);
        } else {
            this.updateParameter.withBillingProfile(billingProfile);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile) {
        if (isInCreateMode()) {
            this.inner().withDiagnosticsProfile(diagnosticsProfile);
        } else {
            this.updateParameter.withDiagnosticsProfile(diagnosticsProfile);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withEvictionPolicy(VirtualMachineEvictionPolicyTypes evictionPolicy) {
        if (isInCreateMode()) {
            this.inner().withEvictionPolicy(evictionPolicy);
        } else {
            this.updateParameter.withEvictionPolicy(evictionPolicy);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withHardwareProfile(HardwareProfile hardwareProfile) {
        if (isInCreateMode()) {
            this.inner().withHardwareProfile(hardwareProfile);
        } else {
            this.updateParameter.withHardwareProfile(hardwareProfile);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withHost(SubResource host) {
        if (isInCreateMode()) {
            this.inner().withHost(host);
        } else {
            this.updateParameter.withHost(host);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withIdentity(VirtualMachineIdentity identity) {
        if (isInCreateMode()) {
            this.inner().withIdentity(identity);
        } else {
            this.updateParameter.withIdentity(identity);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withLicenseType(String licenseType) {
        if (isInCreateMode()) {
            this.inner().withLicenseType(licenseType);
        } else {
            this.updateParameter.withLicenseType(licenseType);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withNetworkProfile(NetworkProfile networkProfile) {
        if (isInCreateMode()) {
            this.inner().withNetworkProfile(networkProfile);
        } else {
            this.updateParameter.withNetworkProfile(networkProfile);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withOsProfile(OSProfile osProfile) {
        if (isInCreateMode()) {
            this.inner().withOsProfile(osProfile);
        } else {
            this.updateParameter.withOsProfile(osProfile);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withPlan(Plan plan) {
        if (isInCreateMode()) {
            this.inner().withPlan(plan);
        } else {
            this.updateParameter.withPlan(plan);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withPriority(VirtualMachinePriorityTypes priority) {
        if (isInCreateMode()) {
            this.inner().withPriority(priority);
        } else {
            this.updateParameter.withPriority(priority);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withProximityPlacementGroup(SubResource proximityPlacementGroup) {
        if (isInCreateMode()) {
            this.inner().withProximityPlacementGroup(proximityPlacementGroup);
        } else {
            this.updateParameter.withProximityPlacementGroup(proximityPlacementGroup);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withStorageProfile(StorageProfile storageProfile) {
        if (isInCreateMode()) {
            this.inner().withStorageProfile(storageProfile);
        } else {
            this.updateParameter.withStorageProfile(storageProfile);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withVirtualMachineScaleSet(SubResource virtualMachineScaleSet) {
        if (isInCreateMode()) {
            this.inner().withVirtualMachineScaleSet(virtualMachineScaleSet);
        } else {
            this.updateParameter.withVirtualMachineScaleSet(virtualMachineScaleSet);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withZones(List<String> zones) {
        if (isInCreateMode()) {
            this.inner().withZones(zones);
        } else {
            this.updateParameter.withZones(zones);
        }
        return this;
    }

}
