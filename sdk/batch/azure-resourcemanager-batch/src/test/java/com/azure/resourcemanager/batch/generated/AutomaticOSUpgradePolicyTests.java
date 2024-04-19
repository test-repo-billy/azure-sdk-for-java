// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.AutomaticOSUpgradePolicy;
import org.junit.jupiter.api.Assertions;

public final class AutomaticOSUpgradePolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutomaticOSUpgradePolicy model = BinaryData.fromString(
            "{\"disableAutomaticRollback\":true,\"enableAutomaticOSUpgrade\":true,\"useRollingUpgradePolicy\":true,\"osRollingUpgradeDeferral\":false}")
            .toObject(AutomaticOSUpgradePolicy.class);
        Assertions.assertEquals(true, model.disableAutomaticRollback());
        Assertions.assertEquals(true, model.enableAutomaticOSUpgrade());
        Assertions.assertEquals(true, model.useRollingUpgradePolicy());
        Assertions.assertEquals(false, model.osRollingUpgradeDeferral());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AutomaticOSUpgradePolicy model = new AutomaticOSUpgradePolicy().withDisableAutomaticRollback(true)
            .withEnableAutomaticOSUpgrade(true).withUseRollingUpgradePolicy(true).withOsRollingUpgradeDeferral(false);
        model = BinaryData.fromObject(model).toObject(AutomaticOSUpgradePolicy.class);
        Assertions.assertEquals(true, model.disableAutomaticRollback());
        Assertions.assertEquals(true, model.enableAutomaticOSUpgrade());
        Assertions.assertEquals(true, model.useRollingUpgradePolicy());
        Assertions.assertEquals(false, model.osRollingUpgradeDeferral());
    }
}
