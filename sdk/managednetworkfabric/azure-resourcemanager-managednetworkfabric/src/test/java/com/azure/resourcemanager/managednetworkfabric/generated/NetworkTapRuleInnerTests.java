// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkTapRuleInner;
import com.azure.resourcemanager.managednetworkfabric.models.BooleanEnumProperty;
import com.azure.resourcemanager.managednetworkfabric.models.CommonDynamicMatchConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.ConfigurationType;
import com.azure.resourcemanager.managednetworkfabric.models.EncapsulationType;
import com.azure.resourcemanager.managednetworkfabric.models.IpAddressType;
import com.azure.resourcemanager.managednetworkfabric.models.IpGroupProperties;
import com.azure.resourcemanager.managednetworkfabric.models.IpMatchCondition;
import com.azure.resourcemanager.managednetworkfabric.models.Layer4Protocol;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapRuleAction;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapRuleMatchCondition;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapRuleMatchConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.PollingIntervalInSeconds;
import com.azure.resourcemanager.managednetworkfabric.models.PortCondition;
import com.azure.resourcemanager.managednetworkfabric.models.PortGroupProperties;
import com.azure.resourcemanager.managednetworkfabric.models.TapRuleActionType;
import com.azure.resourcemanager.managednetworkfabric.models.VlanGroupProperties;
import com.azure.resourcemanager.managednetworkfabric.models.VlanMatchCondition;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class NetworkTapRuleInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkTapRuleInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"networkTapId\":\"njkkxukgu\",\"pollingIntervalInSeconds\":60,\"lastSyncedTime\":\"2021-12-04T13:47:23Z\",\"configurationState\":\"Accepted\",\"provisioningState\":\"Updating\",\"administrativeState\":\"Enabled\",\"configurationType\":\"File\",\"tapRulesUrl\":\"lleuidpmtonvhgn\",\"matchConfigurations\":[{\"matchConfigurationName\":\"plhbpjbapmummmkv\",\"sequenceNumber\":1261371572179891456,\"ipAddressType\":\"IPv6\",\"matchConditions\":[{\"encapsulationType\":\"None\",\"portCondition\":{\"layer4Protocol\":\"TCP\"},\"protocolTypes\":[\"ufzhrchx\"],\"vlanMatchCondition\":{},\"ipCondition\":{}}],\"actions\":[{\"type\":\"Drop\",\"truncate\":\"wlvi\",\"isTimestampEnabled\":\"True\",\"destinationId\":\"mlitqdsj\",\"matchConfigurationName\":\"dvisco\"},{\"type\":\"Redirect\",\"truncate\":\"riifefn\",\"isTimestampEnabled\":\"True\",\"destinationId\":\"rqoemwsieeailwdq\",\"matchConfigurationName\":\"fydeotmfxlkd\"},{\"type\":\"Goto\",\"truncate\":\"namkuuyiuyu\",\"isTimestampEnabled\":\"True\",\"destinationId\":\"lxicwgpthdcf\",\"matchConfigurationName\":\"z\"}]}],\"dynamicMatchConfigurations\":[{\"ipGroups\":[{\"name\":\"d\",\"ipAddressType\":\"IPv4\",\"ipPrefixes\":[\"v\"]},{\"name\":\"tw\",\"ipAddressType\":\"IPv4\",\"ipPrefixes\":[\"gqrnt\",\"umdrcjlvkrkegty\",\"zuppiyx\"]},{\"name\":\"miyddeeqzqvabmh\",\"ipAddressType\":\"IPv6\",\"ipPrefixes\":[\"uetbapfczew\",\"trlq\"]},{\"name\":\"xyazkjpirgzx\",\"ipAddressType\":\"IPv4\",\"ipPrefixes\":[\"hyegb\"]}],\"vlanGroups\":[{\"name\":\"ritjbu\",\"vlans\":[\"runozfvual\",\"thoivsdwsngk\",\"f\",\"hscj\"]},{\"name\":\"kmhzbh\",\"vlans\":[\"fbwih\"]},{\"name\":\"nx\",\"vlans\":[\"ynuqqkotauratnic\",\"pfzsclefyrl\",\"tndqlmf\",\"ggnbbuypwovvvsfl\"]}],\"portGroups\":[{\"name\":\"oqayrehjuqwv\",\"ports\":[\"rlzh\",\"zihacen\",\"qzlxn\"]},{\"name\":\"ubfonfdbgmkf\",\"ports\":[\"cwtewfhxwyrkb\"]},{\"name\":\"hzlrynjpchamkae\",\"ports\":[\"ajubo\",\"uywevtjrieikmwl\",\"oklf\",\"isyxgucbmtredsc\"]}]}],\"annotation\":\"stjcyyuvtzr\"},\"location\":\"hcle\",\"tags\":{\"yup\":\"tzqzcloy\",\"yresgzsdtmwbyorj\":\"idhz\",\"hychakvyrfbqvum\":\"lb\"},\"id\":\"xqjsiuepm\",\"name\":\"xfnzlpq\",\"type\":\"pf\"}")
                .toObject(NetworkTapRuleInner.class);
        Assertions.assertEquals("hcle", model.location());
        Assertions.assertEquals("tzqzcloy", model.tags().get("yup"));
        Assertions.assertEquals(PollingIntervalInSeconds.SIX_ZERO, model.pollingIntervalInSeconds());
        Assertions.assertEquals(ConfigurationType.FILE, model.configurationType());
        Assertions.assertEquals("lleuidpmtonvhgn", model.tapRulesUrl());
        Assertions.assertEquals("plhbpjbapmummmkv", model.matchConfigurations().get(0).matchConfigurationName());
        Assertions.assertEquals(1261371572179891456L, model.matchConfigurations().get(0).sequenceNumber());
        Assertions.assertEquals(IpAddressType.IPV6, model.matchConfigurations().get(0).ipAddressType());
        Assertions
            .assertEquals(
                "ufzhrchx", model.matchConfigurations().get(0).matchConditions().get(0).protocolTypes().get(0));
        Assertions
            .assertEquals(
                EncapsulationType.NONE,
                model.matchConfigurations().get(0).matchConditions().get(0).encapsulationType());
        Assertions
            .assertEquals(
                Layer4Protocol.TCP,
                model.matchConfigurations().get(0).matchConditions().get(0).portCondition().layer4Protocol());
        Assertions.assertEquals(TapRuleActionType.DROP, model.matchConfigurations().get(0).actions().get(0).type());
        Assertions.assertEquals("wlvi", model.matchConfigurations().get(0).actions().get(0).truncate());
        Assertions
            .assertEquals(
                BooleanEnumProperty.TRUE, model.matchConfigurations().get(0).actions().get(0).isTimestampEnabled());
        Assertions.assertEquals("mlitqdsj", model.matchConfigurations().get(0).actions().get(0).destinationId());
        Assertions.assertEquals("dvisco", model.matchConfigurations().get(0).actions().get(0).matchConfigurationName());
        Assertions.assertEquals("d", model.dynamicMatchConfigurations().get(0).ipGroups().get(0).name());
        Assertions
            .assertEquals(
                IpAddressType.IPV4, model.dynamicMatchConfigurations().get(0).ipGroups().get(0).ipAddressType());
        Assertions.assertEquals("v", model.dynamicMatchConfigurations().get(0).ipGroups().get(0).ipPrefixes().get(0));
        Assertions.assertEquals("ritjbu", model.dynamicMatchConfigurations().get(0).vlanGroups().get(0).name());
        Assertions
            .assertEquals("runozfvual", model.dynamicMatchConfigurations().get(0).vlanGroups().get(0).vlans().get(0));
        Assertions.assertEquals("oqayrehjuqwv", model.dynamicMatchConfigurations().get(0).portGroups().get(0).name());
        Assertions.assertEquals("rlzh", model.dynamicMatchConfigurations().get(0).portGroups().get(0).ports().get(0));
        Assertions.assertEquals("stjcyyuvtzr", model.annotation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkTapRuleInner model =
            new NetworkTapRuleInner()
                .withLocation("hcle")
                .withTags(mapOf("yup", "tzqzcloy", "yresgzsdtmwbyorj", "idhz", "hychakvyrfbqvum", "lb"))
                .withPollingIntervalInSeconds(PollingIntervalInSeconds.SIX_ZERO)
                .withConfigurationType(ConfigurationType.FILE)
                .withTapRulesUrl("lleuidpmtonvhgn")
                .withMatchConfigurations(
                    Arrays
                        .asList(
                            new NetworkTapRuleMatchConfiguration()
                                .withMatchConfigurationName("plhbpjbapmummmkv")
                                .withSequenceNumber(1261371572179891456L)
                                .withIpAddressType(IpAddressType.IPV6)
                                .withMatchConditions(
                                    Arrays
                                        .asList(
                                            new NetworkTapRuleMatchCondition()
                                                .withProtocolTypes(Arrays.asList("ufzhrchx"))
                                                .withVlanMatchCondition(new VlanMatchCondition())
                                                .withIpCondition(new IpMatchCondition())
                                                .withEncapsulationType(EncapsulationType.NONE)
                                                .withPortCondition(
                                                    new PortCondition().withLayer4Protocol(Layer4Protocol.TCP))))
                                .withActions(
                                    Arrays
                                        .asList(
                                            new NetworkTapRuleAction()
                                                .withType(TapRuleActionType.DROP)
                                                .withTruncate("wlvi")
                                                .withIsTimestampEnabled(BooleanEnumProperty.TRUE)
                                                .withDestinationId("mlitqdsj")
                                                .withMatchConfigurationName("dvisco"),
                                            new NetworkTapRuleAction()
                                                .withType(TapRuleActionType.REDIRECT)
                                                .withTruncate("riifefn")
                                                .withIsTimestampEnabled(BooleanEnumProperty.TRUE)
                                                .withDestinationId("rqoemwsieeailwdq")
                                                .withMatchConfigurationName("fydeotmfxlkd"),
                                            new NetworkTapRuleAction()
                                                .withType(TapRuleActionType.GOTO)
                                                .withTruncate("namkuuyiuyu")
                                                .withIsTimestampEnabled(BooleanEnumProperty.TRUE)
                                                .withDestinationId("lxicwgpthdcf")
                                                .withMatchConfigurationName("z")))))
                .withDynamicMatchConfigurations(
                    Arrays
                        .asList(
                            new CommonDynamicMatchConfiguration()
                                .withIpGroups(
                                    Arrays
                                        .asList(
                                            new IpGroupProperties()
                                                .withName("d")
                                                .withIpAddressType(IpAddressType.IPV4)
                                                .withIpPrefixes(Arrays.asList("v")),
                                            new IpGroupProperties()
                                                .withName("tw")
                                                .withIpAddressType(IpAddressType.IPV4)
                                                .withIpPrefixes(Arrays.asList("gqrnt", "umdrcjlvkrkegty", "zuppiyx")),
                                            new IpGroupProperties()
                                                .withName("miyddeeqzqvabmh")
                                                .withIpAddressType(IpAddressType.IPV6)
                                                .withIpPrefixes(Arrays.asList("uetbapfczew", "trlq")),
                                            new IpGroupProperties()
                                                .withName("xyazkjpirgzx")
                                                .withIpAddressType(IpAddressType.IPV4)
                                                .withIpPrefixes(Arrays.asList("hyegb"))))
                                .withVlanGroups(
                                    Arrays
                                        .asList(
                                            new VlanGroupProperties()
                                                .withName("ritjbu")
                                                .withVlans(Arrays.asList("runozfvual", "thoivsdwsngk", "f", "hscj")),
                                            new VlanGroupProperties()
                                                .withName("kmhzbh")
                                                .withVlans(Arrays.asList("fbwih")),
                                            new VlanGroupProperties()
                                                .withName("nx")
                                                .withVlans(
                                                    Arrays
                                                        .asList(
                                                            "ynuqqkotauratnic",
                                                            "pfzsclefyrl",
                                                            "tndqlmf",
                                                            "ggnbbuypwovvvsfl"))))
                                .withPortGroups(
                                    Arrays
                                        .asList(
                                            new PortGroupProperties()
                                                .withName("oqayrehjuqwv")
                                                .withPorts(Arrays.asList("rlzh", "zihacen", "qzlxn")),
                                            new PortGroupProperties()
                                                .withName("ubfonfdbgmkf")
                                                .withPorts(Arrays.asList("cwtewfhxwyrkb")),
                                            new PortGroupProperties()
                                                .withName("hzlrynjpchamkae")
                                                .withPorts(
                                                    Arrays
                                                        .asList(
                                                            "ajubo", "uywevtjrieikmwl", "oklf", "isyxgucbmtredsc"))))))
                .withAnnotation("stjcyyuvtzr");
        model = BinaryData.fromObject(model).toObject(NetworkTapRuleInner.class);
        Assertions.assertEquals("hcle", model.location());
        Assertions.assertEquals("tzqzcloy", model.tags().get("yup"));
        Assertions.assertEquals(PollingIntervalInSeconds.SIX_ZERO, model.pollingIntervalInSeconds());
        Assertions.assertEquals(ConfigurationType.FILE, model.configurationType());
        Assertions.assertEquals("lleuidpmtonvhgn", model.tapRulesUrl());
        Assertions.assertEquals("plhbpjbapmummmkv", model.matchConfigurations().get(0).matchConfigurationName());
        Assertions.assertEquals(1261371572179891456L, model.matchConfigurations().get(0).sequenceNumber());
        Assertions.assertEquals(IpAddressType.IPV6, model.matchConfigurations().get(0).ipAddressType());
        Assertions
            .assertEquals(
                "ufzhrchx", model.matchConfigurations().get(0).matchConditions().get(0).protocolTypes().get(0));
        Assertions
            .assertEquals(
                EncapsulationType.NONE,
                model.matchConfigurations().get(0).matchConditions().get(0).encapsulationType());
        Assertions
            .assertEquals(
                Layer4Protocol.TCP,
                model.matchConfigurations().get(0).matchConditions().get(0).portCondition().layer4Protocol());
        Assertions.assertEquals(TapRuleActionType.DROP, model.matchConfigurations().get(0).actions().get(0).type());
        Assertions.assertEquals("wlvi", model.matchConfigurations().get(0).actions().get(0).truncate());
        Assertions
            .assertEquals(
                BooleanEnumProperty.TRUE, model.matchConfigurations().get(0).actions().get(0).isTimestampEnabled());
        Assertions.assertEquals("mlitqdsj", model.matchConfigurations().get(0).actions().get(0).destinationId());
        Assertions.assertEquals("dvisco", model.matchConfigurations().get(0).actions().get(0).matchConfigurationName());
        Assertions.assertEquals("d", model.dynamicMatchConfigurations().get(0).ipGroups().get(0).name());
        Assertions
            .assertEquals(
                IpAddressType.IPV4, model.dynamicMatchConfigurations().get(0).ipGroups().get(0).ipAddressType());
        Assertions.assertEquals("v", model.dynamicMatchConfigurations().get(0).ipGroups().get(0).ipPrefixes().get(0));
        Assertions.assertEquals("ritjbu", model.dynamicMatchConfigurations().get(0).vlanGroups().get(0).name());
        Assertions
            .assertEquals("runozfvual", model.dynamicMatchConfigurations().get(0).vlanGroups().get(0).vlans().get(0));
        Assertions.assertEquals("oqayrehjuqwv", model.dynamicMatchConfigurations().get(0).portGroups().get(0).name());
        Assertions.assertEquals("rlzh", model.dynamicMatchConfigurations().get(0).portGroups().get(0).ports().get(0));
        Assertions.assertEquals("stjcyyuvtzr", model.annotation());
    }

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
