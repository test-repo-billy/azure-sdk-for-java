// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.MachineExtensionUpdate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MachineExtensionUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MachineExtensionUpdate model = BinaryData.fromString(
            "{\"properties\":{\"forceUpdateTag\":\"iebwwaloayqcgwrt\",\"publisher\":\"uzgwyzmhtx\",\"type\":\"gmtsavjcbpwxqpsr\",\"typeHandlerVersion\":\"ftguv\",\"enableAutomaticUpgrade\":true,\"autoUpgradeMinorVersion\":true,\"settings\":{\"ro\":\"datamdyvxqtayriw\",\"mcqibycnojv\":\"dataqbex\",\"zhpvgqzcjrvxd\":\"datanmefqsgzvahapj\"},\"protectedSettings\":{\"ug\":\"datamwlxk\",\"nnprn\":\"datahzovawjvzunlut\",\"eilpjzuaejxdu\":\"datai\",\"pwo\":\"datatskzbbtdzumveek\"}},\"tags\":{\"yofd\":\"kfpbs\",\"dttouwaboekqvkel\":\"luu\"}}")
            .toObject(MachineExtensionUpdate.class);
        Assertions.assertEquals("kfpbs", model.tags().get("yofd"));
        Assertions.assertEquals("iebwwaloayqcgwrt", model.forceUpdateTag());
        Assertions.assertEquals("uzgwyzmhtx", model.publisher());
        Assertions.assertEquals("gmtsavjcbpwxqpsr", model.type());
        Assertions.assertEquals("ftguv", model.typeHandlerVersion());
        Assertions.assertEquals(true, model.enableAutomaticUpgrade());
        Assertions.assertEquals(true, model.autoUpgradeMinorVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MachineExtensionUpdate model
            = new MachineExtensionUpdate().withTags(mapOf("yofd", "kfpbs", "dttouwaboekqvkel", "luu"))
                .withForceUpdateTag("iebwwaloayqcgwrt")
                .withPublisher("uzgwyzmhtx")
                .withType("gmtsavjcbpwxqpsr")
                .withTypeHandlerVersion("ftguv")
                .withEnableAutomaticUpgrade(true)
                .withAutoUpgradeMinorVersion(true)
                .withSettings(
                    mapOf("ro", "datamdyvxqtayriw", "mcqibycnojv", "dataqbex", "zhpvgqzcjrvxd", "datanmefqsgzvahapj"))
                .withProtectedSettings(mapOf("ug", "datamwlxk", "nnprn", "datahzovawjvzunlut", "eilpjzuaejxdu", "datai",
                    "pwo", "datatskzbbtdzumveek"));
        model = BinaryData.fromObject(model).toObject(MachineExtensionUpdate.class);
        Assertions.assertEquals("kfpbs", model.tags().get("yofd"));
        Assertions.assertEquals("iebwwaloayqcgwrt", model.forceUpdateTag());
        Assertions.assertEquals("uzgwyzmhtx", model.publisher());
        Assertions.assertEquals("gmtsavjcbpwxqpsr", model.type());
        Assertions.assertEquals("ftguv", model.typeHandlerVersion());
        Assertions.assertEquals(true, model.enableAutomaticUpgrade());
        Assertions.assertEquals(true, model.autoUpgradeMinorVersion());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
