// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.AzureFirewallApplicationRule;
import com.azure.resourcemanager.network.generated.models.AzureFirewallApplicationRuleCollection;
import com.azure.resourcemanager.network.generated.models.AzureFirewallApplicationRuleProtocol;
import com.azure.resourcemanager.network.generated.models.AzureFirewallApplicationRuleProtocolType;
import com.azure.resourcemanager.network.generated.models.AzureFirewallIpConfiguration;
import com.azure.resourcemanager.network.generated.models.AzureFirewallNatRCAction;
import com.azure.resourcemanager.network.generated.models.AzureFirewallNatRCActionType;
import com.azure.resourcemanager.network.generated.models.AzureFirewallNatRule;
import com.azure.resourcemanager.network.generated.models.AzureFirewallNatRuleCollection;
import com.azure.resourcemanager.network.generated.models.AzureFirewallNetworkRule;
import com.azure.resourcemanager.network.generated.models.AzureFirewallNetworkRuleCollection;
import com.azure.resourcemanager.network.generated.models.AzureFirewallNetworkRuleProtocol;
import com.azure.resourcemanager.network.generated.models.AzureFirewallRCAction;
import com.azure.resourcemanager.network.generated.models.AzureFirewallRCActionType;
import com.azure.resourcemanager.network.generated.models.AzureFirewallSku;
import com.azure.resourcemanager.network.generated.models.AzureFirewallSkuName;
import com.azure.resourcemanager.network.generated.models.AzureFirewallSkuTier;
import com.azure.resourcemanager.network.generated.models.AzureFirewallThreatIntelMode;
import com.azure.resourcemanager.network.generated.models.HubIpAddresses;
import com.azure.resourcemanager.network.generated.models.HubPublicIpAddresses;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for AzureFirewalls CreateOrUpdate.
 */
public final class AzureFirewallsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/AzureFirewallPutWithIpGroups.
     * json
     */
    /**
     * Sample code: Create Azure Firewall With IpGroups.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        createAzureFirewallWithIpGroups(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.azureFirewalls().define("azurefirewall").withRegion("West US").withExistingResourceGroup("rg1")
            .withTags(mapOf("key1", "fakeTokenPlaceholder")).withZones(Arrays.asList())
            .withApplicationRuleCollections(
                Arrays.asList(new AzureFirewallApplicationRuleCollection().withName("apprulecoll").withPriority(110)
                    .withAction(new AzureFirewallRCAction().withType(AzureFirewallRCActionType.DENY))
                    .withRules(Arrays.asList(
                        new AzureFirewallApplicationRule().withName("rule1").withDescription("Deny inbound rule")
                            .withSourceAddresses(Arrays.asList("216.58.216.164", "10.0.0.0/24"))
                            .withProtocols(Arrays.asList(new AzureFirewallApplicationRuleProtocol()
                                .withProtocolType(AzureFirewallApplicationRuleProtocolType.HTTPS).withPort(443)))
                            .withTargetFqdns(Arrays.asList("www.test.com"))))))
            .withNatRuleCollections(
                Arrays
                    .asList(new AzureFirewallNatRuleCollection().withName("natrulecoll").withPriority(112)
                        .withAction(new AzureFirewallNatRCAction().withType(AzureFirewallNatRCActionType.DNAT))
                        .withRules(Arrays.asList(new AzureFirewallNatRule().withName("DNAT-HTTPS-traffic")
                            .withDescription("D-NAT all outbound web traffic for inspection")
                            .withSourceAddresses(Arrays.asList("*")).withDestinationAddresses(Arrays.asList("1.2.3.4"))
                            .withDestinationPorts(Arrays.asList("443"))
                            .withProtocols(Arrays.asList(AzureFirewallNetworkRuleProtocol.TCP))
                            .withTranslatedAddress("1.2.3.5").withTranslatedPort("8443"),
                            new AzureFirewallNatRule().withName("DNAT-HTTP-traffic-With-FQDN")
                                .withDescription("D-NAT all inbound web traffic for inspection")
                                .withSourceAddresses(Arrays.asList("*"))
                                .withDestinationAddresses(Arrays.asList("1.2.3.4"))
                                .withDestinationPorts(Arrays.asList("80"))
                                .withProtocols(Arrays.asList(AzureFirewallNetworkRuleProtocol.TCP))
                                .withTranslatedPort("880").withTranslatedFqdn("internalhttpserver")))))
            .withNetworkRuleCollections(
                Arrays
                    .asList(
                        new AzureFirewallNetworkRuleCollection().withName("netrulecoll").withPriority(112)
                            .withAction(new AzureFirewallRCAction().withType(AzureFirewallRCActionType.DENY))
                            .withRules(Arrays.asList(
                                new AzureFirewallNetworkRule().withName("L4-traffic")
                                    .withDescription("Block traffic based on source IPs and ports")
                                    .withProtocols(Arrays.asList(AzureFirewallNetworkRuleProtocol.TCP))
                                    .withSourceAddresses(
                                        Arrays.asList("192.168.1.1-192.168.1.12", "10.1.4.12-10.1.4.255"))
                                    .withDestinationAddresses(Arrays.asList("*"))
                                    .withDestinationPorts(Arrays.asList("443-444", "8443")),
                                new AzureFirewallNetworkRule().withName("L4-traffic-with-FQDN")
                                    .withDescription("Block traffic based on source IPs and ports to amazon")
                                    .withProtocols(Arrays.asList(AzureFirewallNetworkRuleProtocol.TCP))
                                    .withSourceAddresses(Arrays.asList("10.2.4.12-10.2.4.255"))
                                    .withDestinationPorts(Arrays.asList("443-444", "8443"))
                                    .withDestinationFqdns(Arrays.asList("www.amazon.com"))))))
            .withIpConfigurations(Arrays.asList(new AzureFirewallIpConfiguration()
                .withName("azureFirewallIpConfiguration")
                .withSubnet(new SubResource().withId(
                    "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnet2/subnets/AzureFirewallSubnet"))
                .withPublicIpAddress(new SubResource().withId(
                    "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/publicIPAddresses/pipName"))))
            .withThreatIntelMode(AzureFirewallThreatIntelMode.ALERT)
            .withSku(
                new AzureFirewallSku().withName(AzureFirewallSkuName.AZFW_VNET).withTier(AzureFirewallSkuTier.STANDARD))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/AzureFirewallPutWithZones.
     * json
     */
    /**
     * Sample code: Create Azure Firewall With Zones.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        createAzureFirewallWithZones(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.azureFirewalls().define("azurefirewall").withRegion("West US 2").withExistingResourceGroup("rg1")
            .withTags(mapOf("key1", "fakeTokenPlaceholder")).withZones(Arrays.asList("1", "2", "3"))
            .withApplicationRuleCollections(
                Arrays.asList(new AzureFirewallApplicationRuleCollection().withName("apprulecoll").withPriority(110)
                    .withAction(new AzureFirewallRCAction().withType(AzureFirewallRCActionType.DENY))
                    .withRules(Arrays.asList(
                        new AzureFirewallApplicationRule().withName("rule1").withDescription("Deny inbound rule")
                            .withSourceAddresses(Arrays.asList("216.58.216.164", "10.0.0.0/24"))
                            .withProtocols(Arrays.asList(new AzureFirewallApplicationRuleProtocol()
                                .withProtocolType(AzureFirewallApplicationRuleProtocolType.HTTPS).withPort(443)))
                            .withTargetFqdns(Arrays.asList("www.test.com"))))))
            .withNatRuleCollections(
                Arrays
                    .asList(new AzureFirewallNatRuleCollection().withName("natrulecoll").withPriority(112)
                        .withAction(new AzureFirewallNatRCAction().withType(AzureFirewallNatRCActionType.DNAT))
                        .withRules(Arrays.asList(new AzureFirewallNatRule().withName("DNAT-HTTPS-traffic")
                            .withDescription("D-NAT all outbound web traffic for inspection")
                            .withSourceAddresses(Arrays.asList("*")).withDestinationAddresses(Arrays.asList("1.2.3.4"))
                            .withDestinationPorts(Arrays.asList("443"))
                            .withProtocols(Arrays.asList(AzureFirewallNetworkRuleProtocol.TCP))
                            .withTranslatedAddress("1.2.3.5").withTranslatedPort("8443"),
                            new AzureFirewallNatRule().withName("DNAT-HTTP-traffic-With-FQDN")
                                .withDescription("D-NAT all inbound web traffic for inspection")
                                .withSourceAddresses(Arrays.asList("*"))
                                .withDestinationAddresses(Arrays.asList("1.2.3.4"))
                                .withDestinationPorts(Arrays.asList("80"))
                                .withProtocols(Arrays.asList(AzureFirewallNetworkRuleProtocol.TCP))
                                .withTranslatedPort("880").withTranslatedFqdn("internalhttpserver")))))
            .withNetworkRuleCollections(
                Arrays
                    .asList(
                        new AzureFirewallNetworkRuleCollection().withName("netrulecoll").withPriority(112)
                            .withAction(new AzureFirewallRCAction().withType(AzureFirewallRCActionType.DENY))
                            .withRules(Arrays.asList(
                                new AzureFirewallNetworkRule().withName("L4-traffic")
                                    .withDescription("Block traffic based on source IPs and ports")
                                    .withProtocols(Arrays.asList(AzureFirewallNetworkRuleProtocol.TCP))
                                    .withSourceAddresses(
                                        Arrays.asList("192.168.1.1-192.168.1.12", "10.1.4.12-10.1.4.255"))
                                    .withDestinationAddresses(Arrays.asList("*"))
                                    .withDestinationPorts(Arrays.asList("443-444", "8443")),
                                new AzureFirewallNetworkRule().withName("L4-traffic-with-FQDN")
                                    .withDescription("Block traffic based on source IPs and ports to amazon")
                                    .withProtocols(Arrays.asList(AzureFirewallNetworkRuleProtocol.TCP))
                                    .withSourceAddresses(Arrays.asList("10.2.4.12-10.2.4.255"))
                                    .withDestinationPorts(Arrays.asList("443-444", "8443"))
                                    .withDestinationFqdns(Arrays.asList("www.amazon.com"))))))
            .withIpConfigurations(Arrays.asList(new AzureFirewallIpConfiguration()
                .withName("azureFirewallIpConfiguration")
                .withSubnet(new SubResource().withId(
                    "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnet2/subnets/AzureFirewallSubnet"))
                .withPublicIpAddress(new SubResource().withId(
                    "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/publicIPAddresses/pipName"))))
            .withThreatIntelMode(AzureFirewallThreatIntelMode.ALERT)
            .withSku(
                new AzureFirewallSku().withName(AzureFirewallSkuName.AZFW_VNET).withTier(AzureFirewallSkuTier.STANDARD))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/AzureFirewallPut.json
     */
    /**
     * Sample code: Create Azure Firewall.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void createAzureFirewall(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.azureFirewalls().define("azurefirewall").withRegion("West US").withExistingResourceGroup("rg1")
            .withTags(mapOf("key1", "fakeTokenPlaceholder")).withZones(Arrays.asList())
            .withApplicationRuleCollections(
                Arrays.asList(new AzureFirewallApplicationRuleCollection().withName("apprulecoll").withPriority(110)
                    .withAction(new AzureFirewallRCAction().withType(AzureFirewallRCActionType.DENY))
                    .withRules(Arrays.asList(
                        new AzureFirewallApplicationRule().withName("rule1").withDescription("Deny inbound rule")
                            .withSourceAddresses(Arrays.asList("216.58.216.164", "10.0.0.0/24"))
                            .withProtocols(Arrays.asList(new AzureFirewallApplicationRuleProtocol()
                                .withProtocolType(AzureFirewallApplicationRuleProtocolType.HTTPS).withPort(443)))
                            .withTargetFqdns(Arrays.asList("www.test.com"))))))
            .withNatRuleCollections(
                Arrays
                    .asList(new AzureFirewallNatRuleCollection().withName("natrulecoll").withPriority(112)
                        .withAction(new AzureFirewallNatRCAction().withType(AzureFirewallNatRCActionType.DNAT))
                        .withRules(Arrays.asList(new AzureFirewallNatRule().withName("DNAT-HTTPS-traffic")
                            .withDescription("D-NAT all outbound web traffic for inspection")
                            .withSourceAddresses(Arrays.asList("*")).withDestinationAddresses(Arrays.asList("1.2.3.4"))
                            .withDestinationPorts(Arrays.asList("443"))
                            .withProtocols(Arrays.asList(AzureFirewallNetworkRuleProtocol.TCP))
                            .withTranslatedAddress("1.2.3.5").withTranslatedPort("8443"),
                            new AzureFirewallNatRule().withName("DNAT-HTTP-traffic-With-FQDN")
                                .withDescription("D-NAT all inbound web traffic for inspection")
                                .withSourceAddresses(Arrays.asList("*"))
                                .withDestinationAddresses(Arrays.asList("1.2.3.4"))
                                .withDestinationPorts(Arrays.asList("80"))
                                .withProtocols(Arrays.asList(AzureFirewallNetworkRuleProtocol.TCP))
                                .withTranslatedPort("880").withTranslatedFqdn("internalhttpserver")))))
            .withNetworkRuleCollections(
                Arrays
                    .asList(
                        new AzureFirewallNetworkRuleCollection().withName("netrulecoll").withPriority(112)
                            .withAction(new AzureFirewallRCAction().withType(AzureFirewallRCActionType.DENY))
                            .withRules(Arrays.asList(
                                new AzureFirewallNetworkRule().withName("L4-traffic")
                                    .withDescription("Block traffic based on source IPs and ports")
                                    .withProtocols(Arrays.asList(AzureFirewallNetworkRuleProtocol.TCP))
                                    .withSourceAddresses(
                                        Arrays.asList("192.168.1.1-192.168.1.12", "10.1.4.12-10.1.4.255"))
                                    .withDestinationAddresses(Arrays.asList("*"))
                                    .withDestinationPorts(Arrays.asList("443-444", "8443")),
                                new AzureFirewallNetworkRule().withName("L4-traffic-with-FQDN")
                                    .withDescription("Block traffic based on source IPs and ports to amazon")
                                    .withProtocols(Arrays.asList(AzureFirewallNetworkRuleProtocol.TCP))
                                    .withSourceAddresses(Arrays.asList("10.2.4.12-10.2.4.255"))
                                    .withDestinationPorts(Arrays.asList("443-444", "8443"))
                                    .withDestinationFqdns(Arrays.asList("www.amazon.com"))))))
            .withIpConfigurations(Arrays.asList(new AzureFirewallIpConfiguration()
                .withName("azureFirewallIpConfiguration")
                .withSubnet(new SubResource().withId(
                    "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnet2/subnets/AzureFirewallSubnet"))
                .withPublicIpAddress(new SubResource().withId(
                    "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/publicIPAddresses/pipName"))))
            .withThreatIntelMode(AzureFirewallThreatIntelMode.ALERT)
            .withSku(
                new AzureFirewallSku().withName(AzureFirewallSkuName.AZFW_VNET).withTier(AzureFirewallSkuTier.STANDARD))
            .create();
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * AzureFirewallPutWithAdditionalProperties.json
     */
    /**
     * Sample code: Create Azure Firewall With Additional Properties.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void createAzureFirewallWithAdditionalProperties(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.azureFirewalls().define("azurefirewall").withRegion("West US").withExistingResourceGroup("rg1")
            .withTags(mapOf("key1", "fakeTokenPlaceholder")).withZones(Arrays.asList())
            .withApplicationRuleCollections(
                Arrays.asList(new AzureFirewallApplicationRuleCollection().withName("apprulecoll").withPriority(110)
                    .withAction(new AzureFirewallRCAction().withType(AzureFirewallRCActionType.DENY))
                    .withRules(Arrays.asList(
                        new AzureFirewallApplicationRule().withName("rule1").withDescription("Deny inbound rule")
                            .withSourceAddresses(Arrays.asList("216.58.216.164", "10.0.0.0/24"))
                            .withProtocols(Arrays.asList(new AzureFirewallApplicationRuleProtocol()
                                .withProtocolType(AzureFirewallApplicationRuleProtocolType.HTTPS).withPort(443)))
                            .withTargetFqdns(Arrays.asList("www.test.com"))))))
            .withNatRuleCollections(
                Arrays
                    .asList(new AzureFirewallNatRuleCollection().withName("natrulecoll").withPriority(112)
                        .withAction(new AzureFirewallNatRCAction().withType(AzureFirewallNatRCActionType.DNAT))
                        .withRules(Arrays.asList(new AzureFirewallNatRule().withName("DNAT-HTTPS-traffic")
                            .withDescription("D-NAT all outbound web traffic for inspection")
                            .withSourceAddresses(Arrays.asList("*")).withDestinationAddresses(Arrays.asList("1.2.3.4"))
                            .withDestinationPorts(Arrays.asList("443"))
                            .withProtocols(Arrays.asList(AzureFirewallNetworkRuleProtocol.TCP))
                            .withTranslatedAddress("1.2.3.5").withTranslatedPort("8443"),
                            new AzureFirewallNatRule().withName("DNAT-HTTP-traffic-With-FQDN")
                                .withDescription("D-NAT all inbound web traffic for inspection")
                                .withSourceAddresses(Arrays.asList("*"))
                                .withDestinationAddresses(Arrays.asList("1.2.3.4"))
                                .withDestinationPorts(Arrays.asList("80"))
                                .withProtocols(Arrays.asList(AzureFirewallNetworkRuleProtocol.TCP))
                                .withTranslatedPort("880").withTranslatedFqdn("internalhttpserver")))))
            .withNetworkRuleCollections(
                Arrays
                    .asList(
                        new AzureFirewallNetworkRuleCollection().withName("netrulecoll").withPriority(112)
                            .withAction(new AzureFirewallRCAction().withType(AzureFirewallRCActionType.DENY))
                            .withRules(Arrays.asList(
                                new AzureFirewallNetworkRule().withName("L4-traffic")
                                    .withDescription("Block traffic based on source IPs and ports")
                                    .withProtocols(Arrays.asList(AzureFirewallNetworkRuleProtocol.TCP))
                                    .withSourceAddresses(
                                        Arrays.asList("192.168.1.1-192.168.1.12", "10.1.4.12-10.1.4.255"))
                                    .withDestinationAddresses(Arrays.asList("*"))
                                    .withDestinationPorts(Arrays.asList("443-444", "8443")),
                                new AzureFirewallNetworkRule().withName("L4-traffic-with-FQDN")
                                    .withDescription("Block traffic based on source IPs and ports to amazon")
                                    .withProtocols(Arrays.asList(AzureFirewallNetworkRuleProtocol.TCP))
                                    .withSourceAddresses(Arrays.asList("10.2.4.12-10.2.4.255"))
                                    .withDestinationPorts(Arrays.asList("443-444", "8443"))
                                    .withDestinationFqdns(Arrays.asList("www.amazon.com"))))))
            .withIpConfigurations(Arrays.asList(new AzureFirewallIpConfiguration()
                .withName("azureFirewallIpConfiguration")
                .withSubnet(new SubResource().withId(
                    "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnet2/subnets/AzureFirewallSubnet"))
                .withPublicIpAddress(new SubResource().withId(
                    "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/publicIPAddresses/pipName"))))
            .withThreatIntelMode(AzureFirewallThreatIntelMode.ALERT)
            .withSku(
                new AzureFirewallSku().withName(AzureFirewallSkuName.AZFW_VNET).withTier(AzureFirewallSkuTier.STANDARD))
            .withAdditionalProperties(mapOf("key1", "fakeTokenPlaceholder", "key2", "fakeTokenPlaceholder")).create();
    }

    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/AzureFirewallPutInHub.json
     */
    /**
     * Sample code: Create Azure Firewall in virtual Hub.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        createAzureFirewallInVirtualHub(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.azureFirewalls().define("azurefirewall").withRegion("West US").withExistingResourceGroup("rg1")
            .withTags(mapOf("key1", "fakeTokenPlaceholder")).withZones(Arrays.asList())
            .withThreatIntelMode(AzureFirewallThreatIntelMode.ALERT)
            .withVirtualHub(new SubResource()
                .withId("/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualHubs/hub1"))
            .withFirewallPolicy(new SubResource()
                .withId("/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/firewallPolicies/policy1"))
            .withHubIpAddresses(new HubIpAddresses()
                .withPublicIPs(new HubPublicIpAddresses().withAddresses(Arrays.asList()).withCount(1)))
            .withSku(
                new AzureFirewallSku().withName(AzureFirewallSkuName.AZFW_HUB).withTier(AzureFirewallSkuTier.STANDARD))
            .create();
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * AzureFirewallPutWithMgmtSubnet.json
     */
    /**
     * Sample code: Create Azure Firewall With management subnet.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        createAzureFirewallWithManagementSubnet(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.azureFirewalls().define("azurefirewall").withRegion("West US").withExistingResourceGroup("rg1")
            .withTags(mapOf("key1", "fakeTokenPlaceholder")).withZones(Arrays.asList())
            .withApplicationRuleCollections(
                Arrays.asList(new AzureFirewallApplicationRuleCollection().withName("apprulecoll").withPriority(110)
                    .withAction(new AzureFirewallRCAction().withType(AzureFirewallRCActionType.DENY))
                    .withRules(Arrays.asList(
                        new AzureFirewallApplicationRule().withName("rule1").withDescription("Deny inbound rule")
                            .withSourceAddresses(Arrays.asList("216.58.216.164", "10.0.0.0/24"))
                            .withProtocols(Arrays.asList(new AzureFirewallApplicationRuleProtocol()
                                .withProtocolType(AzureFirewallApplicationRuleProtocolType.HTTPS).withPort(443)))
                            .withTargetFqdns(Arrays.asList("www.test.com"))))))
            .withNatRuleCollections(
                Arrays
                    .asList(new AzureFirewallNatRuleCollection().withName("natrulecoll").withPriority(112)
                        .withAction(new AzureFirewallNatRCAction().withType(AzureFirewallNatRCActionType.DNAT))
                        .withRules(Arrays.asList(new AzureFirewallNatRule().withName("DNAT-HTTPS-traffic")
                            .withDescription("D-NAT all outbound web traffic for inspection")
                            .withSourceAddresses(Arrays.asList("*")).withDestinationAddresses(Arrays.asList("1.2.3.4"))
                            .withDestinationPorts(Arrays.asList("443"))
                            .withProtocols(Arrays.asList(AzureFirewallNetworkRuleProtocol.TCP))
                            .withTranslatedAddress("1.2.3.5").withTranslatedPort("8443"),
                            new AzureFirewallNatRule().withName("DNAT-HTTP-traffic-With-FQDN")
                                .withDescription("D-NAT all inbound web traffic for inspection")
                                .withSourceAddresses(Arrays.asList("*"))
                                .withDestinationAddresses(Arrays.asList("1.2.3.4"))
                                .withDestinationPorts(Arrays.asList("80"))
                                .withProtocols(Arrays.asList(AzureFirewallNetworkRuleProtocol.TCP))
                                .withTranslatedPort("880").withTranslatedFqdn("internalhttpserver")))))
            .withNetworkRuleCollections(
                Arrays
                    .asList(
                        new AzureFirewallNetworkRuleCollection().withName("netrulecoll").withPriority(112)
                            .withAction(new AzureFirewallRCAction().withType(AzureFirewallRCActionType.DENY))
                            .withRules(Arrays.asList(
                                new AzureFirewallNetworkRule().withName("L4-traffic")
                                    .withDescription("Block traffic based on source IPs and ports")
                                    .withProtocols(Arrays.asList(AzureFirewallNetworkRuleProtocol.TCP))
                                    .withSourceAddresses(
                                        Arrays.asList("192.168.1.1-192.168.1.12", "10.1.4.12-10.1.4.255"))
                                    .withDestinationAddresses(Arrays.asList("*"))
                                    .withDestinationPorts(Arrays.asList("443-444", "8443")),
                                new AzureFirewallNetworkRule().withName("L4-traffic-with-FQDN")
                                    .withDescription("Block traffic based on source IPs and ports to amazon")
                                    .withProtocols(Arrays.asList(AzureFirewallNetworkRuleProtocol.TCP))
                                    .withSourceAddresses(Arrays.asList("10.2.4.12-10.2.4.255"))
                                    .withDestinationPorts(Arrays.asList("443-444", "8443"))
                                    .withDestinationFqdns(Arrays.asList("www.amazon.com"))))))
            .withIpConfigurations(Arrays.asList(new AzureFirewallIpConfiguration()
                .withName("azureFirewallIpConfiguration")
                .withSubnet(new SubResource().withId(
                    "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnet2/subnets/AzureFirewallSubnet"))
                .withPublicIpAddress(new SubResource().withId(
                    "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/publicIPAddresses/pipName"))))
            .withManagementIpConfiguration(new AzureFirewallIpConfiguration()
                .withName("azureFirewallMgmtIpConfiguration")
                .withSubnet(new SubResource().withId(
                    "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnet2/subnets/AzureFirewallManagementSubnet"))
                .withPublicIpAddress(new SubResource().withId(
                    "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/publicIPAddresses/managementPipName")))
            .withThreatIntelMode(AzureFirewallThreatIntelMode.ALERT)
            .withSku(
                new AzureFirewallSku().withName(AzureFirewallSkuName.AZFW_VNET).withTier(AzureFirewallSkuTier.STANDARD))
            .create();
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
