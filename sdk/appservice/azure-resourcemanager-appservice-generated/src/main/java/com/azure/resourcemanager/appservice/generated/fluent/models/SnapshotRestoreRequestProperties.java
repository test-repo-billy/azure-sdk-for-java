// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.SnapshotRecoverySource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SnapshotRestoreRequest resource specific properties.
 */
@Fluent
public final class SnapshotRestoreRequestProperties {
    /*
     * Point in time in which the app restore should be done, formatted as a DateTime string.
     */
    @JsonProperty(value = "snapshotTime")
    private String snapshotTime;

    /*
     * Optional. Specifies the web app that snapshot contents will be retrieved from.
     * If empty, the targeted web app will be used as the source.
     */
    @JsonProperty(value = "recoverySource")
    private SnapshotRecoverySource recoverySource;

    /*
     * If <code>true</code> the restore operation can overwrite source app; otherwise, <code>false</code>.
     */
    @JsonProperty(value = "overwrite", required = true)
    private boolean overwrite;

    /*
     * If true, site configuration, in addition to content, will be reverted.
     */
    @JsonProperty(value = "recoverConfiguration")
    private Boolean recoverConfiguration;

    /*
     * If true, custom hostname conflicts will be ignored when recovering to a target web app.
     * This setting is only necessary when RecoverConfiguration is enabled.
     */
    @JsonProperty(value = "ignoreConflictingHostNames")
    private Boolean ignoreConflictingHostNames;

    /*
     * If true, the snapshot is retrieved from DRSecondary endpoint.
     */
    @JsonProperty(value = "useDRSecondary")
    private Boolean useDRSecondary;

    /**
     * Creates an instance of SnapshotRestoreRequestProperties class.
     */
    public SnapshotRestoreRequestProperties() {
    }

    /**
     * Get the snapshotTime property: Point in time in which the app restore should be done, formatted as a DateTime
     * string.
     * 
     * @return the snapshotTime value.
     */
    public String snapshotTime() {
        return this.snapshotTime;
    }

    /**
     * Set the snapshotTime property: Point in time in which the app restore should be done, formatted as a DateTime
     * string.
     * 
     * @param snapshotTime the snapshotTime value to set.
     * @return the SnapshotRestoreRequestProperties object itself.
     */
    public SnapshotRestoreRequestProperties withSnapshotTime(String snapshotTime) {
        this.snapshotTime = snapshotTime;
        return this;
    }

    /**
     * Get the recoverySource property: Optional. Specifies the web app that snapshot contents will be retrieved from.
     * If empty, the targeted web app will be used as the source.
     * 
     * @return the recoverySource value.
     */
    public SnapshotRecoverySource recoverySource() {
        return this.recoverySource;
    }

    /**
     * Set the recoverySource property: Optional. Specifies the web app that snapshot contents will be retrieved from.
     * If empty, the targeted web app will be used as the source.
     * 
     * @param recoverySource the recoverySource value to set.
     * @return the SnapshotRestoreRequestProperties object itself.
     */
    public SnapshotRestoreRequestProperties withRecoverySource(SnapshotRecoverySource recoverySource) {
        this.recoverySource = recoverySource;
        return this;
    }

    /**
     * Get the overwrite property: If &lt;code&gt;true&lt;/code&gt; the restore operation can overwrite source app;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the overwrite value.
     */
    public boolean overwrite() {
        return this.overwrite;
    }

    /**
     * Set the overwrite property: If &lt;code&gt;true&lt;/code&gt; the restore operation can overwrite source app;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param overwrite the overwrite value to set.
     * @return the SnapshotRestoreRequestProperties object itself.
     */
    public SnapshotRestoreRequestProperties withOverwrite(boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }

    /**
     * Get the recoverConfiguration property: If true, site configuration, in addition to content, will be reverted.
     * 
     * @return the recoverConfiguration value.
     */
    public Boolean recoverConfiguration() {
        return this.recoverConfiguration;
    }

    /**
     * Set the recoverConfiguration property: If true, site configuration, in addition to content, will be reverted.
     * 
     * @param recoverConfiguration the recoverConfiguration value to set.
     * @return the SnapshotRestoreRequestProperties object itself.
     */
    public SnapshotRestoreRequestProperties withRecoverConfiguration(Boolean recoverConfiguration) {
        this.recoverConfiguration = recoverConfiguration;
        return this;
    }

    /**
     * Get the ignoreConflictingHostNames property: If true, custom hostname conflicts will be ignored when recovering
     * to a target web app.
     * This setting is only necessary when RecoverConfiguration is enabled.
     * 
     * @return the ignoreConflictingHostNames value.
     */
    public Boolean ignoreConflictingHostNames() {
        return this.ignoreConflictingHostNames;
    }

    /**
     * Set the ignoreConflictingHostNames property: If true, custom hostname conflicts will be ignored when recovering
     * to a target web app.
     * This setting is only necessary when RecoverConfiguration is enabled.
     * 
     * @param ignoreConflictingHostNames the ignoreConflictingHostNames value to set.
     * @return the SnapshotRestoreRequestProperties object itself.
     */
    public SnapshotRestoreRequestProperties withIgnoreConflictingHostNames(Boolean ignoreConflictingHostNames) {
        this.ignoreConflictingHostNames = ignoreConflictingHostNames;
        return this;
    }

    /**
     * Get the useDRSecondary property: If true, the snapshot is retrieved from DRSecondary endpoint.
     * 
     * @return the useDRSecondary value.
     */
    public Boolean useDRSecondary() {
        return this.useDRSecondary;
    }

    /**
     * Set the useDRSecondary property: If true, the snapshot is retrieved from DRSecondary endpoint.
     * 
     * @param useDRSecondary the useDRSecondary value to set.
     * @return the SnapshotRestoreRequestProperties object itself.
     */
    public SnapshotRestoreRequestProperties withUseDRSecondary(Boolean useDRSecondary) {
        this.useDRSecondary = useDRSecondary;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (recoverySource() != null) {
            recoverySource().validate();
        }
    }
}
