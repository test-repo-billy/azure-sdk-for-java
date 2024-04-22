// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Information about current network profile.
 */
@Fluent
public final class NetworkSecurityPerimeterConfigurationPropertiesProfile {
    /*
     * Name of the resource
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Current access rules version
     */
    @JsonProperty(value = "accessRulesVersion")
    private String accessRulesVersion;

    /*
     * List of Access Rules
     */
    @JsonProperty(value = "accessRules")
    private List<NspAccessRule> accessRules;

    /**
     * Creates an instance of NetworkSecurityPerimeterConfigurationPropertiesProfile class.
     */
    public NetworkSecurityPerimeterConfigurationPropertiesProfile() {
    }

    /**
     * Get the name property: Name of the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the resource.
     * 
     * @param name the name value to set.
     * @return the NetworkSecurityPerimeterConfigurationPropertiesProfile object itself.
     */
    public NetworkSecurityPerimeterConfigurationPropertiesProfile withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the accessRulesVersion property: Current access rules version.
     * 
     * @return the accessRulesVersion value.
     */
    public String accessRulesVersion() {
        return this.accessRulesVersion;
    }

    /**
     * Set the accessRulesVersion property: Current access rules version.
     * 
     * @param accessRulesVersion the accessRulesVersion value to set.
     * @return the NetworkSecurityPerimeterConfigurationPropertiesProfile object itself.
     */
    public NetworkSecurityPerimeterConfigurationPropertiesProfile withAccessRulesVersion(String accessRulesVersion) {
        this.accessRulesVersion = accessRulesVersion;
        return this;
    }

    /**
     * Get the accessRules property: List of Access Rules.
     * 
     * @return the accessRules value.
     */
    public List<NspAccessRule> accessRules() {
        return this.accessRules;
    }

    /**
     * Set the accessRules property: List of Access Rules.
     * 
     * @param accessRules the accessRules value to set.
     * @return the NetworkSecurityPerimeterConfigurationPropertiesProfile object itself.
     */
    public NetworkSecurityPerimeterConfigurationPropertiesProfile withAccessRules(List<NspAccessRule> accessRules) {
        this.accessRules = accessRules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accessRules() != null) {
            accessRules().forEach(e -> e.validate());
        }
    }
}
