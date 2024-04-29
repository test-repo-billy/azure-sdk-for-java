// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetInner;
import com.azure.resourcemanager.compute.generated.models.AdditionalCapabilities;
import com.azure.resourcemanager.compute.generated.models.AutomaticRepairsPolicy;
import com.azure.resourcemanager.compute.generated.models.ExpandTypesForGetVMScaleSets;
import com.azure.resourcemanager.compute.generated.models.ExtendedLocation;
import com.azure.resourcemanager.compute.generated.models.OrchestrationMode;
import com.azure.resourcemanager.compute.generated.models.OrchestrationServiceStateInput;
import com.azure.resourcemanager.compute.generated.models.Plan;
import com.azure.resourcemanager.compute.generated.models.PriorityMixPolicy;
import com.azure.resourcemanager.compute.generated.models.ResiliencyPolicy;
import com.azure.resourcemanager.compute.generated.models.ScaleInPolicy;
import com.azure.resourcemanager.compute.generated.models.ScheduledEventsPolicy;
import com.azure.resourcemanager.compute.generated.models.Sku;
import com.azure.resourcemanager.compute.generated.models.SpotRestorePolicy;
import com.azure.resourcemanager.compute.generated.models.UpgradePolicy;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSet;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetIdentity;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetReimageParameters;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetUpdate;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetUpdateVMProfile;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMInstanceIDs;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMInstanceRequiredIDs;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMProfile;
import com.azure.resourcemanager.compute.generated.models.VMScaleSetConvertToSinglePlacementGroupInput;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class VirtualMachineScaleSetImpl
    implements VirtualMachineScaleSet, VirtualMachineScaleSet.Definition, VirtualMachineScaleSet.Update {
    private VirtualMachineScaleSetInner innerObject;

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

    public Sku sku() {
        return this.innerModel().sku();
    }

    public Plan plan() {
        return this.innerModel().plan();
    }

    public VirtualMachineScaleSetIdentity identity() {
        return this.innerModel().identity();
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

    public String etag() {
        return this.innerModel().etag();
    }

    public UpgradePolicy upgradePolicy() {
        return this.innerModel().upgradePolicy();
    }

    public ScheduledEventsPolicy scheduledEventsPolicy() {
        return this.innerModel().scheduledEventsPolicy();
    }

    public AutomaticRepairsPolicy automaticRepairsPolicy() {
        return this.innerModel().automaticRepairsPolicy();
    }

    public VirtualMachineScaleSetVMProfile virtualMachineProfile() {
        return this.innerModel().virtualMachineProfile();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Boolean overprovision() {
        return this.innerModel().overprovision();
    }

    public Boolean doNotRunExtensionsOnOverprovisionedVMs() {
        return this.innerModel().doNotRunExtensionsOnOverprovisionedVMs();
    }

    public String uniqueId() {
        return this.innerModel().uniqueId();
    }

    public Boolean singlePlacementGroup() {
        return this.innerModel().singlePlacementGroup();
    }

    public Boolean zoneBalance() {
        return this.innerModel().zoneBalance();
    }

    public Integer platformFaultDomainCount() {
        return this.innerModel().platformFaultDomainCount();
    }

    public SubResource proximityPlacementGroup() {
        return this.innerModel().proximityPlacementGroup();
    }

    public SubResource hostGroup() {
        return this.innerModel().hostGroup();
    }

    public AdditionalCapabilities additionalCapabilities() {
        return this.innerModel().additionalCapabilities();
    }

    public ScaleInPolicy scaleInPolicy() {
        return this.innerModel().scaleInPolicy();
    }

    public OrchestrationMode orchestrationMode() {
        return this.innerModel().orchestrationMode();
    }

    public SpotRestorePolicy spotRestorePolicy() {
        return this.innerModel().spotRestorePolicy();
    }

    public PriorityMixPolicy priorityMixPolicy() {
        return this.innerModel().priorityMixPolicy();
    }

    public OffsetDateTime timeCreated() {
        return this.innerModel().timeCreated();
    }

    public Boolean constrainedMaximumCapacity() {
        return this.innerModel().constrainedMaximumCapacity();
    }

    public ResiliencyPolicy resiliencyPolicy() {
        return this.innerModel().resiliencyPolicy();
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

    public VirtualMachineScaleSetInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String vmScaleSetName;

    private String createIfMatch;

    private String createIfNoneMatch;

    private String updateIfMatch;

    private String updateIfNoneMatch;

    private VirtualMachineScaleSetUpdate updateParameters;

    public VirtualMachineScaleSetImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public VirtualMachineScaleSet create() {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualMachineScaleSets()
            .createOrUpdate(resourceGroupName, vmScaleSetName, this.innerModel(), createIfMatch, createIfNoneMatch,
                Context.NONE);
        return this;
    }

    public VirtualMachineScaleSet create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualMachineScaleSets()
            .createOrUpdate(resourceGroupName, vmScaleSetName, this.innerModel(), createIfMatch, createIfNoneMatch,
                context);
        return this;
    }

    VirtualMachineScaleSetImpl(String name, com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = new VirtualMachineScaleSetInner();
        this.serviceManager = serviceManager;
        this.vmScaleSetName = name;
        this.createIfMatch = null;
        this.createIfNoneMatch = null;
    }

    public VirtualMachineScaleSetImpl update() {
        this.updateIfMatch = null;
        this.updateIfNoneMatch = null;
        this.updateParameters = new VirtualMachineScaleSetUpdate();
        return this;
    }

    public VirtualMachineScaleSet apply() {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualMachineScaleSets()
            .update(resourceGroupName, vmScaleSetName, updateParameters, updateIfMatch, updateIfNoneMatch,
                Context.NONE);
        return this;
    }

    public VirtualMachineScaleSet apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualMachineScaleSets()
            .update(resourceGroupName, vmScaleSetName, updateParameters, updateIfMatch, updateIfNoneMatch, context);
        return this;
    }

    VirtualMachineScaleSetImpl(VirtualMachineScaleSetInner innerObject,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.vmScaleSetName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "virtualMachineScaleSets");
    }

    public VirtualMachineScaleSet refresh() {
        ExpandTypesForGetVMScaleSets localExpand = null;
        this.innerObject = serviceManager.serviceClient()
            .getVirtualMachineScaleSets()
            .getByResourceGroupWithResponse(resourceGroupName, vmScaleSetName, localExpand, Context.NONE)
            .getValue();
        return this;
    }

    public VirtualMachineScaleSet refresh(Context context) {
        ExpandTypesForGetVMScaleSets localExpand = null;
        this.innerObject = serviceManager.serviceClient()
            .getVirtualMachineScaleSets()
            .getByResourceGroupWithResponse(resourceGroupName, vmScaleSetName, localExpand, context)
            .getValue();
        return this;
    }

    public void deallocate() {
        serviceManager.virtualMachineScaleSets().deallocate(resourceGroupName, vmScaleSetName);
    }

    public void deallocate(Boolean hibernate, VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, Context context) {
        serviceManager.virtualMachineScaleSets()
            .deallocate(resourceGroupName, vmScaleSetName, hibernate, vmInstanceIDs, context);
    }

    public void deleteInstances(VirtualMachineScaleSetVMInstanceRequiredIDs vmInstanceIDs) {
        serviceManager.virtualMachineScaleSets().deleteInstances(resourceGroupName, vmScaleSetName, vmInstanceIDs);
    }

    public void deleteInstances(VirtualMachineScaleSetVMInstanceRequiredIDs vmInstanceIDs, Boolean forceDeletion,
        Context context) {
        serviceManager.virtualMachineScaleSets()
            .deleteInstances(resourceGroupName, vmScaleSetName, vmInstanceIDs, forceDeletion, context);
    }

    public void powerOff() {
        serviceManager.virtualMachineScaleSets().powerOff(resourceGroupName, vmScaleSetName);
    }

    public void powerOff(Boolean skipShutdown, VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, Context context) {
        serviceManager.virtualMachineScaleSets()
            .powerOff(resourceGroupName, vmScaleSetName, skipShutdown, vmInstanceIDs, context);
    }

    public void restart() {
        serviceManager.virtualMachineScaleSets().restart(resourceGroupName, vmScaleSetName);
    }

    public void restart(VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, Context context) {
        serviceManager.virtualMachineScaleSets().restart(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public void start() {
        serviceManager.virtualMachineScaleSets().start(resourceGroupName, vmScaleSetName);
    }

    public void start(VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, Context context) {
        serviceManager.virtualMachineScaleSets().start(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public void reapply() {
        serviceManager.virtualMachineScaleSets().reapply(resourceGroupName, vmScaleSetName);
    }

    public void reapply(Context context) {
        serviceManager.virtualMachineScaleSets().reapply(resourceGroupName, vmScaleSetName, context);
    }

    public void redeploy() {
        serviceManager.virtualMachineScaleSets().redeploy(resourceGroupName, vmScaleSetName);
    }

    public void redeploy(VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, Context context) {
        serviceManager.virtualMachineScaleSets().redeploy(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public void performMaintenance() {
        serviceManager.virtualMachineScaleSets().performMaintenance(resourceGroupName, vmScaleSetName);
    }

    public void performMaintenance(VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, Context context) {
        serviceManager.virtualMachineScaleSets()
            .performMaintenance(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public void updateInstances(VirtualMachineScaleSetVMInstanceRequiredIDs vmInstanceIDs) {
        serviceManager.virtualMachineScaleSets().updateInstances(resourceGroupName, vmScaleSetName, vmInstanceIDs);
    }

    public void updateInstances(VirtualMachineScaleSetVMInstanceRequiredIDs vmInstanceIDs, Context context) {
        serviceManager.virtualMachineScaleSets()
            .updateInstances(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public void reimage() {
        serviceManager.virtualMachineScaleSets().reimage(resourceGroupName, vmScaleSetName);
    }

    public void reimage(VirtualMachineScaleSetReimageParameters vmScaleSetReimageInput, Context context) {
        serviceManager.virtualMachineScaleSets()
            .reimage(resourceGroupName, vmScaleSetName, vmScaleSetReimageInput, context);
    }

    public void reimageAll() {
        serviceManager.virtualMachineScaleSets().reimageAll(resourceGroupName, vmScaleSetName);
    }

    public void reimageAll(VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, Context context) {
        serviceManager.virtualMachineScaleSets().reimageAll(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public void approveRollingUpgrade() {
        serviceManager.virtualMachineScaleSets().approveRollingUpgrade(resourceGroupName, vmScaleSetName);
    }

    public void approveRollingUpgrade(VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, Context context) {
        serviceManager.virtualMachineScaleSets()
            .approveRollingUpgrade(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public Response<Void> convertToSinglePlacementGroupWithResponse(
        VMScaleSetConvertToSinglePlacementGroupInput parameters, Context context) {
        return serviceManager.virtualMachineScaleSets()
            .convertToSinglePlacementGroupWithResponse(resourceGroupName, vmScaleSetName, parameters, context);
    }

    public void convertToSinglePlacementGroup(VMScaleSetConvertToSinglePlacementGroupInput parameters) {
        serviceManager.virtualMachineScaleSets()
            .convertToSinglePlacementGroup(resourceGroupName, vmScaleSetName, parameters);
    }

    public void setOrchestrationServiceState(OrchestrationServiceStateInput parameters) {
        serviceManager.virtualMachineScaleSets()
            .setOrchestrationServiceState(resourceGroupName, vmScaleSetName, parameters);
    }

    public void setOrchestrationServiceState(OrchestrationServiceStateInput parameters, Context context) {
        serviceManager.virtualMachineScaleSets()
            .setOrchestrationServiceState(resourceGroupName, vmScaleSetName, parameters, context);
    }

    public VirtualMachineScaleSetImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VirtualMachineScaleSetImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VirtualMachineScaleSetImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withPlan(Plan plan) {
        if (isInCreateMode()) {
            this.innerModel().withPlan(plan);
            return this;
        } else {
            this.updateParameters.withPlan(plan);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withIdentity(VirtualMachineScaleSetIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateParameters.withIdentity(identity);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withZones(List<String> zones) {
        this.innerModel().withZones(zones);
        return this;
    }

    public VirtualMachineScaleSetImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public VirtualMachineScaleSetImpl withUpgradePolicy(UpgradePolicy upgradePolicy) {
        if (isInCreateMode()) {
            this.innerModel().withUpgradePolicy(upgradePolicy);
            return this;
        } else {
            this.updateParameters.withUpgradePolicy(upgradePolicy);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withScheduledEventsPolicy(ScheduledEventsPolicy scheduledEventsPolicy) {
        this.innerModel().withScheduledEventsPolicy(scheduledEventsPolicy);
        return this;
    }

    public VirtualMachineScaleSetImpl withAutomaticRepairsPolicy(AutomaticRepairsPolicy automaticRepairsPolicy) {
        if (isInCreateMode()) {
            this.innerModel().withAutomaticRepairsPolicy(automaticRepairsPolicy);
            return this;
        } else {
            this.updateParameters.withAutomaticRepairsPolicy(automaticRepairsPolicy);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withVirtualMachineProfile(VirtualMachineScaleSetVMProfile virtualMachineProfile) {
        this.innerModel().withVirtualMachineProfile(virtualMachineProfile);
        return this;
    }

    public VirtualMachineScaleSetImpl withOverprovision(Boolean overprovision) {
        if (isInCreateMode()) {
            this.innerModel().withOverprovision(overprovision);
            return this;
        } else {
            this.updateParameters.withOverprovision(overprovision);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl
        withDoNotRunExtensionsOnOverprovisionedVMs(Boolean doNotRunExtensionsOnOverprovisionedVMs) {
        if (isInCreateMode()) {
            this.innerModel().withDoNotRunExtensionsOnOverprovisionedVMs(doNotRunExtensionsOnOverprovisionedVMs);
            return this;
        } else {
            this.updateParameters.withDoNotRunExtensionsOnOverprovisionedVMs(doNotRunExtensionsOnOverprovisionedVMs);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withSinglePlacementGroup(Boolean singlePlacementGroup) {
        if (isInCreateMode()) {
            this.innerModel().withSinglePlacementGroup(singlePlacementGroup);
            return this;
        } else {
            this.updateParameters.withSinglePlacementGroup(singlePlacementGroup);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withZoneBalance(Boolean zoneBalance) {
        this.innerModel().withZoneBalance(zoneBalance);
        return this;
    }

    public VirtualMachineScaleSetImpl withPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        this.innerModel().withPlatformFaultDomainCount(platformFaultDomainCount);
        return this;
    }

    public VirtualMachineScaleSetImpl withProximityPlacementGroup(SubResource proximityPlacementGroup) {
        if (isInCreateMode()) {
            this.innerModel().withProximityPlacementGroup(proximityPlacementGroup);
            return this;
        } else {
            this.updateParameters.withProximityPlacementGroup(proximityPlacementGroup);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withHostGroup(SubResource hostGroup) {
        this.innerModel().withHostGroup(hostGroup);
        return this;
    }

    public VirtualMachineScaleSetImpl withAdditionalCapabilities(AdditionalCapabilities additionalCapabilities) {
        if (isInCreateMode()) {
            this.innerModel().withAdditionalCapabilities(additionalCapabilities);
            return this;
        } else {
            this.updateParameters.withAdditionalCapabilities(additionalCapabilities);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withScaleInPolicy(ScaleInPolicy scaleInPolicy) {
        if (isInCreateMode()) {
            this.innerModel().withScaleInPolicy(scaleInPolicy);
            return this;
        } else {
            this.updateParameters.withScaleInPolicy(scaleInPolicy);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withOrchestrationMode(OrchestrationMode orchestrationMode) {
        this.innerModel().withOrchestrationMode(orchestrationMode);
        return this;
    }

    public VirtualMachineScaleSetImpl withSpotRestorePolicy(SpotRestorePolicy spotRestorePolicy) {
        if (isInCreateMode()) {
            this.innerModel().withSpotRestorePolicy(spotRestorePolicy);
            return this;
        } else {
            this.updateParameters.withSpotRestorePolicy(spotRestorePolicy);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withPriorityMixPolicy(PriorityMixPolicy priorityMixPolicy) {
        if (isInCreateMode()) {
            this.innerModel().withPriorityMixPolicy(priorityMixPolicy);
            return this;
        } else {
            this.updateParameters.withPriorityMixPolicy(priorityMixPolicy);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withConstrainedMaximumCapacity(Boolean constrainedMaximumCapacity) {
        this.innerModel().withConstrainedMaximumCapacity(constrainedMaximumCapacity);
        return this;
    }

    public VirtualMachineScaleSetImpl withResiliencyPolicy(ResiliencyPolicy resiliencyPolicy) {
        if (isInCreateMode()) {
            this.innerModel().withResiliencyPolicy(resiliencyPolicy);
            return this;
        } else {
            this.updateParameters.withResiliencyPolicy(resiliencyPolicy);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withIfNoneMatch(String ifNoneMatch) {
        if (isInCreateMode()) {
            this.createIfNoneMatch = ifNoneMatch;
            return this;
        } else {
            this.updateIfNoneMatch = ifNoneMatch;
            return this;
        }
    }

    public VirtualMachineScaleSetImpl
        withVirtualMachineProfile(VirtualMachineScaleSetUpdateVMProfile virtualMachineProfile) {
        this.updateParameters.withVirtualMachineProfile(virtualMachineProfile);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
