// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The configuration parameters used for performing automatic OS upgrade.
 */
@Fluent
public final class AutomaticOSUpgradePolicy {
    /*
     * Whether OS image rollback feature should be disabled.
     */
    @JsonProperty(value = "disableAutomaticRollback")
    private Boolean disableAutomaticRollback;

    /*
     * Indicates whether OS upgrades should automatically be applied to scale set instances in a rolling fashion when a
     * newer version of the OS image becomes available. <br /><br /> If this is set to true for Windows based pools,
     * [WindowsConfiguration.enableAutomaticUpdates](https://learn.microsoft.com/en-us/rest/api/batchmanagement/pool/
     * create?tabs=HTTP#windowsconfiguration)
     * cannot be set to true.
     */
    @JsonProperty(value = "enableAutomaticOSUpgrade")
    private Boolean enableAutomaticOSUpgrade;

    /*
     * Indicates whether rolling upgrade policy should be used during Auto OS Upgrade. Auto OS Upgrade will fallback to
     * the default policy if no policy is defined on the VMSS.
     */
    @JsonProperty(value = "useRollingUpgradePolicy")
    private Boolean useRollingUpgradePolicy;

    /*
     * Defer OS upgrades on the TVMs if they are running tasks.
     */
    @JsonProperty(value = "osRollingUpgradeDeferral")
    private Boolean osRollingUpgradeDeferral;

    /**
     * Creates an instance of AutomaticOSUpgradePolicy class.
     */
    public AutomaticOSUpgradePolicy() {
    }

    /**
     * Get the disableAutomaticRollback property: Whether OS image rollback feature should be disabled.
     * 
     * @return the disableAutomaticRollback value.
     */
    public Boolean disableAutomaticRollback() {
        return this.disableAutomaticRollback;
    }

    /**
     * Set the disableAutomaticRollback property: Whether OS image rollback feature should be disabled.
     * 
     * @param disableAutomaticRollback the disableAutomaticRollback value to set.
     * @return the AutomaticOSUpgradePolicy object itself.
     */
    public AutomaticOSUpgradePolicy withDisableAutomaticRollback(Boolean disableAutomaticRollback) {
        this.disableAutomaticRollback = disableAutomaticRollback;
        return this;
    }

    /**
     * Get the enableAutomaticOSUpgrade property: Indicates whether OS upgrades should automatically be applied to
     * scale set instances in a rolling fashion when a newer version of the OS image becomes available. &lt;br
     * /&gt;&lt;br /&gt; If this is set to true for Windows based pools,
     * [WindowsConfiguration.enableAutomaticUpdates](https://learn.microsoft.com/en-us/rest/api/batchmanagement/pool/create?tabs=HTTP#windowsconfiguration)
     * cannot be set to true.
     * 
     * @return the enableAutomaticOSUpgrade value.
     */
    public Boolean enableAutomaticOSUpgrade() {
        return this.enableAutomaticOSUpgrade;
    }

    /**
     * Set the enableAutomaticOSUpgrade property: Indicates whether OS upgrades should automatically be applied to
     * scale set instances in a rolling fashion when a newer version of the OS image becomes available. &lt;br
     * /&gt;&lt;br /&gt; If this is set to true for Windows based pools,
     * [WindowsConfiguration.enableAutomaticUpdates](https://learn.microsoft.com/en-us/rest/api/batchmanagement/pool/create?tabs=HTTP#windowsconfiguration)
     * cannot be set to true.
     * 
     * @param enableAutomaticOSUpgrade the enableAutomaticOSUpgrade value to set.
     * @return the AutomaticOSUpgradePolicy object itself.
     */
    public AutomaticOSUpgradePolicy withEnableAutomaticOSUpgrade(Boolean enableAutomaticOSUpgrade) {
        this.enableAutomaticOSUpgrade = enableAutomaticOSUpgrade;
        return this;
    }

    /**
     * Get the useRollingUpgradePolicy property: Indicates whether rolling upgrade policy should be used during Auto OS
     * Upgrade. Auto OS Upgrade will fallback to the default policy if no policy is defined on the VMSS.
     * 
     * @return the useRollingUpgradePolicy value.
     */
    public Boolean useRollingUpgradePolicy() {
        return this.useRollingUpgradePolicy;
    }

    /**
     * Set the useRollingUpgradePolicy property: Indicates whether rolling upgrade policy should be used during Auto OS
     * Upgrade. Auto OS Upgrade will fallback to the default policy if no policy is defined on the VMSS.
     * 
     * @param useRollingUpgradePolicy the useRollingUpgradePolicy value to set.
     * @return the AutomaticOSUpgradePolicy object itself.
     */
    public AutomaticOSUpgradePolicy withUseRollingUpgradePolicy(Boolean useRollingUpgradePolicy) {
        this.useRollingUpgradePolicy = useRollingUpgradePolicy;
        return this;
    }

    /**
     * Get the osRollingUpgradeDeferral property: Defer OS upgrades on the TVMs if they are running tasks.
     * 
     * @return the osRollingUpgradeDeferral value.
     */
    public Boolean osRollingUpgradeDeferral() {
        return this.osRollingUpgradeDeferral;
    }

    /**
     * Set the osRollingUpgradeDeferral property: Defer OS upgrades on the TVMs if they are running tasks.
     * 
     * @param osRollingUpgradeDeferral the osRollingUpgradeDeferral value to set.
     * @return the AutomaticOSUpgradePolicy object itself.
     */
    public AutomaticOSUpgradePolicy withOsRollingUpgradeDeferral(Boolean osRollingUpgradeDeferral) {
        this.osRollingUpgradeDeferral = osRollingUpgradeDeferral;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
