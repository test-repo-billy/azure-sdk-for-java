// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appconfiguration.fluent.models.KeyValueInner;
import com.azure.resourcemanager.appconfiguration.models.KeyValue;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class KeyValueImpl implements KeyValue, KeyValue.Definition, KeyValue.Update {
    private KeyValueInner innerObject;

    private final com.azure.resourcemanager.appconfiguration.AppConfigurationManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String key() {
        return this.innerModel().key();
    }

    public String label() {
        return this.innerModel().label();
    }

    public String value() {
        return this.innerModel().value();
    }

    public String contentType() {
        return this.innerModel().contentType();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public OffsetDateTime lastModified() {
        return this.innerModel().lastModified();
    }

    public Boolean locked() {
        return this.innerModel().locked();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public KeyValueInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String configStoreName;

    private String keyValueName;

    public KeyValueImpl withExistingConfigurationStore(String resourceGroupName, String configStoreName) {
        this.resourceGroupName = resourceGroupName;
        this.configStoreName = configStoreName;
        return this;
    }

    public KeyValue create() {
        this.innerObject = serviceManager.serviceClient().getKeyValues().createOrUpdateWithResponse(resourceGroupName,
            configStoreName, keyValueName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public KeyValue create(Context context) {
        this.innerObject = serviceManager.serviceClient().getKeyValues()
            .createOrUpdateWithResponse(resourceGroupName, configStoreName, keyValueName, this.innerModel(), context)
            .getValue();
        return this;
    }

    KeyValueImpl(String name, com.azure.resourcemanager.appconfiguration.AppConfigurationManager serviceManager) {
        this.innerObject = new KeyValueInner();
        this.serviceManager = serviceManager;
        this.keyValueName = name;
    }

    public KeyValueImpl update() {
        return this;
    }

    public KeyValue apply() {
        this.innerObject = serviceManager.serviceClient().getKeyValues().createOrUpdateWithResponse(resourceGroupName,
            configStoreName, keyValueName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public KeyValue apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getKeyValues()
            .createOrUpdateWithResponse(resourceGroupName, configStoreName, keyValueName, this.innerModel(), context)
            .getValue();
        return this;
    }

    KeyValueImpl(KeyValueInner innerObject,
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.configStoreName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "configurationStores");
        this.keyValueName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "keyValues");
    }

    public KeyValue refresh() {
        this.innerObject = serviceManager.serviceClient().getKeyValues()
            .getWithResponse(resourceGroupName, configStoreName, keyValueName, Context.NONE).getValue();
        return this;
    }

    public KeyValue refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getKeyValues()
            .getWithResponse(resourceGroupName, configStoreName, keyValueName, context).getValue();
        return this;
    }

    public KeyValueImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public KeyValueImpl withValue(String value) {
        this.innerModel().withValue(value);
        return this;
    }

    public KeyValueImpl withContentType(String contentType) {
        this.innerModel().withContentType(contentType);
        return this;
    }
}
