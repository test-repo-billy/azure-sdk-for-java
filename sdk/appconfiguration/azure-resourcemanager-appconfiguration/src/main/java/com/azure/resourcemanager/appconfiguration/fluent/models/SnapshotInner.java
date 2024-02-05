// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.appconfiguration.models.CompositionType;
import com.azure.resourcemanager.appconfiguration.models.KeyValueFilter;
import com.azure.resourcemanager.appconfiguration.models.ProvisioningState;
import com.azure.resourcemanager.appconfiguration.models.SnapshotStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * The snapshot resource.
 */
@Fluent
public final class SnapshotInner extends ProxyResource {
    /*
     * All snapshot properties.
     */
    @JsonProperty(value = "properties")
    private SnapshotProperties innerProperties;

    /**
     * Creates an instance of SnapshotInner class.
     */
    public SnapshotInner() {
    }

    /**
     * Get the innerProperties property: All snapshot properties.
     * 
     * @return the innerProperties value.
     */
    private SnapshotProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the provisioningState property: The provisioning state of the snapshot.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the status property: The current status of the snapshot.
     * 
     * @return the status value.
     */
    public SnapshotStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the filters property: A list of filters used to filter the key-values included in the snapshot.
     * 
     * @return the filters value.
     */
    public List<KeyValueFilter> filters() {
        return this.innerProperties() == null ? null : this.innerProperties().filters();
    }

    /**
     * Set the filters property: A list of filters used to filter the key-values included in the snapshot.
     * 
     * @param filters the filters value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withFilters(List<KeyValueFilter> filters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withFilters(filters);
        return this;
    }

    /**
     * Get the compositionType property: The composition type describes how the key-values within the snapshot are
     * composed. The 'key' composition type ensures there are no two key-values containing the same key. The
     * 'key_label' composition type ensures there are no two key-values containing the same key and label.
     * 
     * @return the compositionType value.
     */
    public CompositionType compositionType() {
        return this.innerProperties() == null ? null : this.innerProperties().compositionType();
    }

    /**
     * Set the compositionType property: The composition type describes how the key-values within the snapshot are
     * composed. The 'key' composition type ensures there are no two key-values containing the same key. The
     * 'key_label' composition type ensures there are no two key-values containing the same key and label.
     * 
     * @param compositionType the compositionType value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withCompositionType(CompositionType compositionType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withCompositionType(compositionType);
        return this;
    }

    /**
     * Get the created property: The time that the snapshot was created.
     * 
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.innerProperties() == null ? null : this.innerProperties().created();
    }

    /**
     * Get the expires property: The time that the snapshot will expire.
     * 
     * @return the expires value.
     */
    public OffsetDateTime expires() {
        return this.innerProperties() == null ? null : this.innerProperties().expires();
    }

    /**
     * Get the retentionPeriod property: The amount of time, in seconds, that a snapshot will remain in the archived
     * state before expiring. This property is only writable during the creation of a snapshot. If not specified, the
     * default lifetime of key-value revisions will be used.
     * 
     * @return the retentionPeriod value.
     */
    public Long retentionPeriod() {
        return this.innerProperties() == null ? null : this.innerProperties().retentionPeriod();
    }

    /**
     * Set the retentionPeriod property: The amount of time, in seconds, that a snapshot will remain in the archived
     * state before expiring. This property is only writable during the creation of a snapshot. If not specified, the
     * default lifetime of key-value revisions will be used.
     * 
     * @param retentionPeriod the retentionPeriod value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withRetentionPeriod(Long retentionPeriod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * Get the size property: The size in bytes of the snapshot.
     * 
     * @return the size value.
     */
    public Long size() {
        return this.innerProperties() == null ? null : this.innerProperties().size();
    }

    /**
     * Get the itemsCount property: The amount of key-values in the snapshot.
     * 
     * @return the itemsCount value.
     */
    public Long itemsCount() {
        return this.innerProperties() == null ? null : this.innerProperties().itemsCount();
    }

    /**
     * Get the tags property: The tags of the snapshot. NOTE: These are data plane tags, not ARM tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.innerProperties() == null ? null : this.innerProperties().tags();
    }

    /**
     * Set the tags property: The tags of the snapshot. NOTE: These are data plane tags, not ARM tags.
     * 
     * @param tags the tags value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withTags(Map<String, String> tags) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withTags(tags);
        return this;
    }

    /**
     * Get the etag property: A value representing the current state of the snapshot.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.innerProperties() == null ? null : this.innerProperties().etag();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
