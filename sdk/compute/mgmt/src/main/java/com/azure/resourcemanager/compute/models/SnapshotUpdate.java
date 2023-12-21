// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The SnapshotUpdate model. */
@JsonFlatten
@Fluent
public class SnapshotUpdate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SnapshotUpdate.class);

    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The snapshots sku name. Can be Standard_LRS, Premium_LRS, or
     * Standard_ZRS.
     */
    @JsonProperty(value = "sku")
    private SnapshotSku sku;

    /*
     * the Operating System type.
     */
    @JsonProperty(value = "properties.osType")
    private OperatingSystemTypes osType;

    /*
     * If creationData.createOption is Empty, this field is mandatory and it
     * indicates the size of the disk to create. If this field is present for
     * updates or creation with other options, it indicates a resize. Resizes
     * are only allowed if the disk is not attached to a running VM, and can
     * only increase the disk's size.
     */
    @JsonProperty(value = "properties.diskSizeGB")
    private Integer diskSizeGB;

    /*
     * Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     */
    @JsonProperty(value = "properties.encryptionSettingsCollection")
    private EncryptionSettingsCollection encryptionSettingsCollection;

    /*
     * Encryption property can be used to encrypt data at rest with customer
     * managed keys or platform managed keys.
     */
    @JsonProperty(value = "properties.encryption")
    private Encryption encryption;

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku property: The snapshots sku name. Can be Standard_LRS, Premium_LRS, or Standard_ZRS.
     *
     * @return the sku value.
     */
    public SnapshotSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The snapshots sku name. Can be Standard_LRS, Premium_LRS, or Standard_ZRS.
     *
     * @param sku the sku value to set.
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withSku(SnapshotSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the osType property: the Operating System type.
     *
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the osType property: the Operating System type.
     *
     * @param osType the osType value to set.
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     *
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     *
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the encryptionSettingsCollection property: Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     *
     * @return the encryptionSettingsCollection value.
     */
    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.encryptionSettingsCollection;
    }

    /**
     * Set the encryptionSettingsCollection property: Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     *
     * @param encryptionSettingsCollection the encryptionSettingsCollection value to set.
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection) {
        this.encryptionSettingsCollection = encryptionSettingsCollection;
        return this;
    }

    /**
     * Get the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     *
     * @param encryption the encryption value to set.
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (encryptionSettingsCollection() != null) {
            encryptionSettingsCollection().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
    }
}
