// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.EventhubInner;
import com.azure.resourcemanager.eventhubs.generated.models.CaptureDescription;
import com.azure.resourcemanager.eventhubs.generated.models.EntityStatus;
import com.azure.resourcemanager.eventhubs.generated.models.Eventhub;
import com.azure.resourcemanager.eventhubs.generated.models.RetentionDescription;
import com.azure.resourcemanager.eventhubs.generated.models.TimestampType;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class EventhubImpl implements Eventhub, Eventhub.Definition, Eventhub.Update {
    private EventhubInner innerObject;

    private final com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String location() {
        return this.innerModel().location();
    }

    public List<String> partitionIds() {
        List<String> inner = this.innerModel().partitionIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OffsetDateTime createdAt() {
        return this.innerModel().createdAt();
    }

    public OffsetDateTime updatedAt() {
        return this.innerModel().updatedAt();
    }

    public Long messageRetentionInDays() {
        return this.innerModel().messageRetentionInDays();
    }

    public Long partitionCount() {
        return this.innerModel().partitionCount();
    }

    public EntityStatus status() {
        return this.innerModel().status();
    }

    public CaptureDescription captureDescription() {
        return this.innerModel().captureDescription();
    }

    public RetentionDescription retentionDescription() {
        return this.innerModel().retentionDescription();
    }

    public TimestampType messageTimestampType() {
        return this.innerModel().messageTimestampType();
    }

    public String identifier() {
        return this.innerModel().identifier();
    }

    public String userMetadata() {
        return this.innerModel().userMetadata();
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

    public EventhubInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private String eventHubName;

    public EventhubImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    public Eventhub create() {
        this.innerObject = serviceManager.serviceClient()
            .getEventHubs()
            .createOrUpdateWithResponse(resourceGroupName, namespaceName, eventHubName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public Eventhub create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getEventHubs()
            .createOrUpdateWithResponse(resourceGroupName, namespaceName, eventHubName, this.innerModel(), context)
            .getValue();
        return this;
    }

    EventhubImpl(String name, com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager) {
        this.innerObject = new EventhubInner();
        this.serviceManager = serviceManager;
        this.eventHubName = name;
    }

    public EventhubImpl update() {
        return this;
    }

    public Eventhub apply() {
        this.innerObject = serviceManager.serviceClient()
            .getEventHubs()
            .createOrUpdateWithResponse(resourceGroupName, namespaceName, eventHubName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public Eventhub apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getEventHubs()
            .createOrUpdateWithResponse(resourceGroupName, namespaceName, eventHubName, this.innerModel(), context)
            .getValue();
        return this;
    }

    EventhubImpl(EventhubInner innerObject,
        com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.eventHubName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "eventhubs");
    }

    public Eventhub refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getEventHubs()
            .getWithResponse(resourceGroupName, namespaceName, eventHubName, Context.NONE)
            .getValue();
        return this;
    }

    public Eventhub refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getEventHubs()
            .getWithResponse(resourceGroupName, namespaceName, eventHubName, context)
            .getValue();
        return this;
    }

    public EventhubImpl withMessageRetentionInDays(Long messageRetentionInDays) {
        this.innerModel().withMessageRetentionInDays(messageRetentionInDays);
        return this;
    }

    public EventhubImpl withPartitionCount(Long partitionCount) {
        this.innerModel().withPartitionCount(partitionCount);
        return this;
    }

    public EventhubImpl withStatus(EntityStatus status) {
        this.innerModel().withStatus(status);
        return this;
    }

    public EventhubImpl withCaptureDescription(CaptureDescription captureDescription) {
        this.innerModel().withCaptureDescription(captureDescription);
        return this;
    }

    public EventhubImpl withRetentionDescription(RetentionDescription retentionDescription) {
        this.innerModel().withRetentionDescription(retentionDescription);
        return this;
    }

    public EventhubImpl withMessageTimestampType(TimestampType messageTimestampType) {
        this.innerModel().withMessageTimestampType(messageTimestampType);
        return this;
    }

    public EventhubImpl withUserMetadata(String userMetadata) {
        this.innerModel().withUserMetadata(userMetadata);
        return this;
    }
}
