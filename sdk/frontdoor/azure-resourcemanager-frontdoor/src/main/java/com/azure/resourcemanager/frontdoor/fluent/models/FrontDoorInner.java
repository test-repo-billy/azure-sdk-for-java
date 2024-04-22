// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.frontdoor.models.BackendPool;
import com.azure.resourcemanager.frontdoor.models.BackendPoolsSettings;
import com.azure.resourcemanager.frontdoor.models.FrontDoorEnabledState;
import com.azure.resourcemanager.frontdoor.models.FrontDoorResourceState;
import com.azure.resourcemanager.frontdoor.models.HealthProbeSettingsModel;
import com.azure.resourcemanager.frontdoor.models.LoadBalancingSettingsModel;
import com.azure.resourcemanager.frontdoor.models.RoutingRule;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Front Door represents a collection of backend endpoints to route traffic to along with rules that specify how traffic
 * is sent there.
 */
@Fluent
public final class FrontDoorInner extends Resource {
    /*
     * Properties of the Front Door Load Balancer
     */
    @JsonProperty(value = "properties")
    private FrontDoorProperties innerProperties;

    /**
     * Creates an instance of FrontDoorInner class.
     */
    public FrontDoorInner() {
    }

    /**
     * Get the innerProperties property: Properties of the Front Door Load Balancer.
     * 
     * @return the innerProperties value.
     */
    private FrontDoorProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FrontDoorInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FrontDoorInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resourceState property: Resource status of the Front Door or Front Door SubResource.
     * 
     * Resource status of the Front Door.
     * 
     * @return the resourceState value.
     */
    public FrontDoorResourceState resourceState() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceState();
    }

    /**
     * Get the provisioningState property: Provisioning state of the Front Door.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the cname property: The host that each frontendEndpoint must CNAME to.
     * 
     * @return the cname value.
     */
    public String cname() {
        return this.innerProperties() == null ? null : this.innerProperties().cname();
    }

    /**
     * Get the frontdoorId property: The Id of the frontdoor.
     * 
     * @return the frontdoorId value.
     */
    public String frontdoorId() {
        return this.innerProperties() == null ? null : this.innerProperties().frontdoorId();
    }

    /**
     * Get the rulesEngines property: Rules Engine Configurations available to routing rules.
     * 
     * @return the rulesEngines value.
     */
    public List<RulesEngineInner> rulesEngines() {
        return this.innerProperties() == null ? null : this.innerProperties().rulesEngines();
    }

    /**
     * Get the extendedProperties property: Key-Value pair representing additional properties for frontdoor.
     * 
     * @return the extendedProperties value.
     */
    public Map<String, String> extendedProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().extendedProperties();
    }

    /**
     * Get the friendlyName property: A friendly name for the frontDoor.
     * 
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.innerProperties() == null ? null : this.innerProperties().friendlyName();
    }

    /**
     * Set the friendlyName property: A friendly name for the frontDoor.
     * 
     * @param friendlyName the friendlyName value to set.
     * @return the FrontDoorInner object itself.
     */
    public FrontDoorInner withFriendlyName(String friendlyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FrontDoorProperties();
        }
        this.innerProperties().withFriendlyName(friendlyName);
        return this;
    }

    /**
     * Get the routingRules property: Routing rules associated with this Front Door.
     * 
     * @return the routingRules value.
     */
    public List<RoutingRule> routingRules() {
        return this.innerProperties() == null ? null : this.innerProperties().routingRules();
    }

    /**
     * Set the routingRules property: Routing rules associated with this Front Door.
     * 
     * @param routingRules the routingRules value to set.
     * @return the FrontDoorInner object itself.
     */
    public FrontDoorInner withRoutingRules(List<RoutingRule> routingRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FrontDoorProperties();
        }
        this.innerProperties().withRoutingRules(routingRules);
        return this;
    }

    /**
     * Get the loadBalancingSettings property: Load balancing settings associated with this Front Door instance.
     * 
     * @return the loadBalancingSettings value.
     */
    public List<LoadBalancingSettingsModel> loadBalancingSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().loadBalancingSettings();
    }

    /**
     * Set the loadBalancingSettings property: Load balancing settings associated with this Front Door instance.
     * 
     * @param loadBalancingSettings the loadBalancingSettings value to set.
     * @return the FrontDoorInner object itself.
     */
    public FrontDoorInner withLoadBalancingSettings(List<LoadBalancingSettingsModel> loadBalancingSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FrontDoorProperties();
        }
        this.innerProperties().withLoadBalancingSettings(loadBalancingSettings);
        return this;
    }

    /**
     * Get the healthProbeSettings property: Health probe settings associated with this Front Door instance.
     * 
     * @return the healthProbeSettings value.
     */
    public List<HealthProbeSettingsModel> healthProbeSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().healthProbeSettings();
    }

    /**
     * Set the healthProbeSettings property: Health probe settings associated with this Front Door instance.
     * 
     * @param healthProbeSettings the healthProbeSettings value to set.
     * @return the FrontDoorInner object itself.
     */
    public FrontDoorInner withHealthProbeSettings(List<HealthProbeSettingsModel> healthProbeSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FrontDoorProperties();
        }
        this.innerProperties().withHealthProbeSettings(healthProbeSettings);
        return this;
    }

    /**
     * Get the backendPools property: Backend pools available to routing rules.
     * 
     * @return the backendPools value.
     */
    public List<BackendPool> backendPools() {
        return this.innerProperties() == null ? null : this.innerProperties().backendPools();
    }

    /**
     * Set the backendPools property: Backend pools available to routing rules.
     * 
     * @param backendPools the backendPools value to set.
     * @return the FrontDoorInner object itself.
     */
    public FrontDoorInner withBackendPools(List<BackendPool> backendPools) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FrontDoorProperties();
        }
        this.innerProperties().withBackendPools(backendPools);
        return this;
    }

    /**
     * Get the frontendEndpoints property: Frontend endpoints available to routing rules.
     * 
     * @return the frontendEndpoints value.
     */
    public List<FrontendEndpointInner> frontendEndpoints() {
        return this.innerProperties() == null ? null : this.innerProperties().frontendEndpoints();
    }

    /**
     * Set the frontendEndpoints property: Frontend endpoints available to routing rules.
     * 
     * @param frontendEndpoints the frontendEndpoints value to set.
     * @return the FrontDoorInner object itself.
     */
    public FrontDoorInner withFrontendEndpoints(List<FrontendEndpointInner> frontendEndpoints) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FrontDoorProperties();
        }
        this.innerProperties().withFrontendEndpoints(frontendEndpoints);
        return this;
    }

    /**
     * Get the backendPoolsSettings property: Settings for all backendPools.
     * 
     * @return the backendPoolsSettings value.
     */
    public BackendPoolsSettings backendPoolsSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().backendPoolsSettings();
    }

    /**
     * Set the backendPoolsSettings property: Settings for all backendPools.
     * 
     * @param backendPoolsSettings the backendPoolsSettings value to set.
     * @return the FrontDoorInner object itself.
     */
    public FrontDoorInner withBackendPoolsSettings(BackendPoolsSettings backendPoolsSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FrontDoorProperties();
        }
        this.innerProperties().withBackendPoolsSettings(backendPoolsSettings);
        return this;
    }

    /**
     * Get the enabledState property: Operational status of the Front Door load balancer. Permitted values are 'Enabled'
     * or 'Disabled'.
     * 
     * @return the enabledState value.
     */
    public FrontDoorEnabledState enabledState() {
        return this.innerProperties() == null ? null : this.innerProperties().enabledState();
    }

    /**
     * Set the enabledState property: Operational status of the Front Door load balancer. Permitted values are 'Enabled'
     * or 'Disabled'.
     * 
     * @param enabledState the enabledState value to set.
     * @return the FrontDoorInner object itself.
     */
    public FrontDoorInner withEnabledState(FrontDoorEnabledState enabledState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FrontDoorProperties();
        }
        this.innerProperties().withEnabledState(enabledState);
        return this;
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
