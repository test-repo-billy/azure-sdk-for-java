// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.AppServiceEnvironmentInner;
import java.util.List;

/**
 * An immutable client-side representation of AppServiceEnvironment.
 */
public interface AppServiceEnvironment {
    /**
     * Gets the provisioningState property: Provisioning state of the App Service Environment.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the status property: Current status of the App Service Environment.
     * 
     * @return the status value.
     */
    HostingEnvironmentStatus status();

    /**
     * Gets the virtualNetwork property: Description of the Virtual Network.
     * 
     * @return the virtualNetwork value.
     */
    VirtualNetworkProfile virtualNetwork();

    /**
     * Gets the internalLoadBalancingMode property: Specifies which endpoints to serve internally in the Virtual Network
     * for the App Service Environment.
     * 
     * @return the internalLoadBalancingMode value.
     */
    LoadBalancingMode internalLoadBalancingMode();

    /**
     * Gets the multiSize property: Front-end VM size, e.g. "Medium", "Large".
     * 
     * @return the multiSize value.
     */
    String multiSize();

    /**
     * Gets the multiRoleCount property: Number of front-end instances.
     * 
     * @return the multiRoleCount value.
     */
    Integer multiRoleCount();

    /**
     * Gets the ipsslAddressCount property: Number of IP SSL addresses reserved for the App Service Environment.
     * 
     * @return the ipsslAddressCount value.
     */
    Integer ipsslAddressCount();

    /**
     * Gets the dnsSuffix property: DNS suffix of the App Service Environment.
     * 
     * @return the dnsSuffix value.
     */
    String dnsSuffix();

    /**
     * Gets the maximumNumberOfMachines property: Maximum number of VMs in the App Service Environment.
     * 
     * @return the maximumNumberOfMachines value.
     */
    Integer maximumNumberOfMachines();

    /**
     * Gets the frontEndScaleFactor property: Scale factor for front-ends.
     * 
     * @return the frontEndScaleFactor value.
     */
    Integer frontEndScaleFactor();

    /**
     * Gets the suspended property: &lt;code&gt;true&lt;/code&gt; if the App Service Environment is suspended;
     * otherwise, &lt;code&gt;false&lt;/code&gt;. The environment can be suspended, e.g. when the management endpoint is
     * no longer available
     * (most likely because NSG blocked the incoming traffic).
     * 
     * @return the suspended value.
     */
    Boolean suspended();

    /**
     * Gets the clusterSettings property: Custom settings for changing the behavior of the App Service Environment.
     * 
     * @return the clusterSettings value.
     */
    List<NameValuePair> clusterSettings();

    /**
     * Gets the userWhitelistedIpRanges property: User added ip ranges to whitelist on ASE db.
     * 
     * @return the userWhitelistedIpRanges value.
     */
    List<String> userWhitelistedIpRanges();

    /**
     * Gets the hasLinuxWorkers property: Flag that displays whether an ASE has linux workers or not.
     * 
     * @return the hasLinuxWorkers value.
     */
    Boolean hasLinuxWorkers();

    /**
     * Gets the upgradePreference property: Upgrade Preference.
     * 
     * @return the upgradePreference value.
     */
    UpgradePreference upgradePreference();

    /**
     * Gets the dedicatedHostCount property: Dedicated Host Count.
     * 
     * @return the dedicatedHostCount value.
     */
    Integer dedicatedHostCount();

    /**
     * Gets the zoneRedundant property: Whether or not this App Service Environment is zone-redundant.
     * 
     * @return the zoneRedundant value.
     */
    Boolean zoneRedundant();

    /**
     * Gets the customDnsSuffixConfiguration property: Full view of the custom domain suffix configuration for ASEv3.
     * 
     * @return the customDnsSuffixConfiguration value.
     */
    CustomDnsSuffixConfiguration customDnsSuffixConfiguration();

    /**
     * Gets the networkingConfiguration property: Full view of networking configuration for an ASE.
     * 
     * @return the networkingConfiguration value.
     */
    AseV3NetworkingConfiguration networkingConfiguration();

    /**
     * Gets the upgradeAvailability property: Whether an upgrade is available for this App Service Environment.
     * 
     * @return the upgradeAvailability value.
     */
    UpgradeAvailability upgradeAvailability();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.AppServiceEnvironmentInner object.
     * 
     * @return the inner object.
     */
    AppServiceEnvironmentInner innerModel();
}
