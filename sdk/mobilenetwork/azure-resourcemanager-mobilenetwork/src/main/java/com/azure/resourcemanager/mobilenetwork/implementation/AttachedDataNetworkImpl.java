// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mobilenetwork.fluent.models.AttachedDataNetworkInner;
import com.azure.resourcemanager.mobilenetwork.models.AttachedDataNetwork;
import com.azure.resourcemanager.mobilenetwork.models.InterfaceProperties;
import com.azure.resourcemanager.mobilenetwork.models.NaptConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.azure.resourcemanager.mobilenetwork.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class AttachedDataNetworkImpl
    implements AttachedDataNetwork, AttachedDataNetwork.Definition, AttachedDataNetwork.Update {
    private AttachedDataNetworkInner innerObject;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public InterfaceProperties userPlaneDataInterface() {
        return this.innerModel().userPlaneDataInterface();
    }

    public List<String> dnsAddresses() {
        List<String> inner = this.innerModel().dnsAddresses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public NaptConfiguration naptConfiguration() {
        return this.innerModel().naptConfiguration();
    }

    public List<String> userEquipmentAddressPoolPrefix() {
        List<String> inner = this.innerModel().userEquipmentAddressPoolPrefix();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> userEquipmentStaticAddressPoolPrefix() {
        List<String> inner = this.innerModel().userEquipmentStaticAddressPoolPrefix();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
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

    public AttachedDataNetworkInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String packetCoreControlPlaneName;

    private String packetCoreDataPlaneName;

    private String attachedDataNetworkName;

    private TagsObject updateParameters;

    public AttachedDataNetworkImpl withExistingPacketCoreDataPlane(String resourceGroupName,
        String packetCoreControlPlaneName, String packetCoreDataPlaneName) {
        this.resourceGroupName = resourceGroupName;
        this.packetCoreControlPlaneName = packetCoreControlPlaneName;
        this.packetCoreDataPlaneName = packetCoreDataPlaneName;
        return this;
    }

    public AttachedDataNetwork create() {
        this.innerObject = serviceManager.serviceClient().getAttachedDataNetworks().createOrUpdate(resourceGroupName,
            packetCoreControlPlaneName, packetCoreDataPlaneName, attachedDataNetworkName, this.innerModel(),
            Context.NONE);
        return this;
    }

    public AttachedDataNetwork create(Context context) {
        this.innerObject = serviceManager.serviceClient().getAttachedDataNetworks().createOrUpdate(resourceGroupName,
            packetCoreControlPlaneName, packetCoreDataPlaneName, attachedDataNetworkName, this.innerModel(), context);
        return this;
    }

    AttachedDataNetworkImpl(String name, com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerObject = new AttachedDataNetworkInner();
        this.serviceManager = serviceManager;
        this.attachedDataNetworkName = name;
    }

    public AttachedDataNetworkImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public AttachedDataNetwork apply() {
        this.innerObject = serviceManager.serviceClient().getAttachedDataNetworks()
            .updateTagsWithResponse(resourceGroupName, packetCoreControlPlaneName, packetCoreDataPlaneName,
                attachedDataNetworkName, updateParameters, Context.NONE)
            .getValue();
        return this;
    }

    public AttachedDataNetwork apply(Context context) {
        this.innerObject = serviceManager
            .serviceClient().getAttachedDataNetworks().updateTagsWithResponse(resourceGroupName,
                packetCoreControlPlaneName, packetCoreDataPlaneName, attachedDataNetworkName, updateParameters, context)
            .getValue();
        return this;
    }

    AttachedDataNetworkImpl(AttachedDataNetworkInner innerObject,
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.packetCoreControlPlaneName
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "packetCoreControlPlanes");
        this.packetCoreDataPlaneName
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "packetCoreDataPlanes");
        this.attachedDataNetworkName
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "attachedDataNetworks");
    }

    public AttachedDataNetwork refresh() {
        this.innerObject
            = serviceManager
                .serviceClient().getAttachedDataNetworks().getWithResponse(resourceGroupName,
                    packetCoreControlPlaneName, packetCoreDataPlaneName, attachedDataNetworkName, Context.NONE)
                .getValue();
        return this;
    }

    public AttachedDataNetwork refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getAttachedDataNetworks().getWithResponse(resourceGroupName,
            packetCoreControlPlaneName, packetCoreDataPlaneName, attachedDataNetworkName, context).getValue();
        return this;
    }

    public AttachedDataNetworkImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AttachedDataNetworkImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AttachedDataNetworkImpl withUserPlaneDataInterface(InterfaceProperties userPlaneDataInterface) {
        this.innerModel().withUserPlaneDataInterface(userPlaneDataInterface);
        return this;
    }

    public AttachedDataNetworkImpl withDnsAddresses(List<String> dnsAddresses) {
        this.innerModel().withDnsAddresses(dnsAddresses);
        return this;
    }

    public AttachedDataNetworkImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public AttachedDataNetworkImpl withNaptConfiguration(NaptConfiguration naptConfiguration) {
        this.innerModel().withNaptConfiguration(naptConfiguration);
        return this;
    }

    public AttachedDataNetworkImpl withUserEquipmentAddressPoolPrefix(List<String> userEquipmentAddressPoolPrefix) {
        this.innerModel().withUserEquipmentAddressPoolPrefix(userEquipmentAddressPoolPrefix);
        return this;
    }

    public AttachedDataNetworkImpl
        withUserEquipmentStaticAddressPoolPrefix(List<String> userEquipmentStaticAddressPoolPrefix) {
        this.innerModel().withUserEquipmentStaticAddressPoolPrefix(userEquipmentStaticAddressPoolPrefix);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
