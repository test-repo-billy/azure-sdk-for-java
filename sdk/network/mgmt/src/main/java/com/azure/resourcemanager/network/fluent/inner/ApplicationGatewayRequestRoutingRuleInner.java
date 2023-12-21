// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ApplicationGatewayRequestRoutingRuleType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ApplicationGatewayRequestRoutingRule model. */
@JsonFlatten
@Fluent
public class ApplicationGatewayRequestRoutingRuleInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayRequestRoutingRuleInner.class);

    /*
     * Name of the request routing rule that is unique within an Application
     * Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Rule type.
     */
    @JsonProperty(value = "properties.ruleType")
    private ApplicationGatewayRequestRoutingRuleType ruleType;

    /*
     * Backend address pool resource of the application gateway.
     */
    @JsonProperty(value = "properties.backendAddressPool")
    private SubResource backendAddressPool;

    /*
     * Backend http settings resource of the application gateway.
     */
    @JsonProperty(value = "properties.backendHttpSettings")
    private SubResource backendHttpSettings;

    /*
     * Http listener resource of the application gateway.
     */
    @JsonProperty(value = "properties.httpListener")
    private SubResource httpListener;

    /*
     * URL path map resource of the application gateway.
     */
    @JsonProperty(value = "properties.urlPathMap")
    private SubResource urlPathMap;

    /*
     * Rewrite Rule Set resource in Basic rule of the application gateway.
     */
    @JsonProperty(value = "properties.rewriteRuleSet")
    private SubResource rewriteRuleSet;

    /*
     * Redirect configuration resource of the application gateway.
     */
    @JsonProperty(value = "properties.redirectConfiguration")
    private SubResource redirectConfiguration;

    /*
     * Provisioning state of the request routing rule resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the name property: Name of the request routing rule that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the request routing rule that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayRequestRoutingRuleInner object itself.
     */
    public ApplicationGatewayRequestRoutingRuleInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the ApplicationGatewayRequestRoutingRuleInner object itself.
     */
    public ApplicationGatewayRequestRoutingRuleInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the resource.
     *
     * @param type the type value to set.
     * @return the ApplicationGatewayRequestRoutingRuleInner object itself.
     */
    public ApplicationGatewayRequestRoutingRuleInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the ruleType property: Rule type.
     *
     * @return the ruleType value.
     */
    public ApplicationGatewayRequestRoutingRuleType ruleType() {
        return this.ruleType;
    }

    /**
     * Set the ruleType property: Rule type.
     *
     * @param ruleType the ruleType value to set.
     * @return the ApplicationGatewayRequestRoutingRuleInner object itself.
     */
    public ApplicationGatewayRequestRoutingRuleInner withRuleType(ApplicationGatewayRequestRoutingRuleType ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * Get the backendAddressPool property: Backend address pool resource of the application gateway.
     *
     * @return the backendAddressPool value.
     */
    public SubResource backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set the backendAddressPool property: Backend address pool resource of the application gateway.
     *
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the ApplicationGatewayRequestRoutingRuleInner object itself.
     */
    public ApplicationGatewayRequestRoutingRuleInner withBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get the backendHttpSettings property: Backend http settings resource of the application gateway.
     *
     * @return the backendHttpSettings value.
     */
    public SubResource backendHttpSettings() {
        return this.backendHttpSettings;
    }

    /**
     * Set the backendHttpSettings property: Backend http settings resource of the application gateway.
     *
     * @param backendHttpSettings the backendHttpSettings value to set.
     * @return the ApplicationGatewayRequestRoutingRuleInner object itself.
     */
    public ApplicationGatewayRequestRoutingRuleInner withBackendHttpSettings(SubResource backendHttpSettings) {
        this.backendHttpSettings = backendHttpSettings;
        return this;
    }

    /**
     * Get the httpListener property: Http listener resource of the application gateway.
     *
     * @return the httpListener value.
     */
    public SubResource httpListener() {
        return this.httpListener;
    }

    /**
     * Set the httpListener property: Http listener resource of the application gateway.
     *
     * @param httpListener the httpListener value to set.
     * @return the ApplicationGatewayRequestRoutingRuleInner object itself.
     */
    public ApplicationGatewayRequestRoutingRuleInner withHttpListener(SubResource httpListener) {
        this.httpListener = httpListener;
        return this;
    }

    /**
     * Get the urlPathMap property: URL path map resource of the application gateway.
     *
     * @return the urlPathMap value.
     */
    public SubResource urlPathMap() {
        return this.urlPathMap;
    }

    /**
     * Set the urlPathMap property: URL path map resource of the application gateway.
     *
     * @param urlPathMap the urlPathMap value to set.
     * @return the ApplicationGatewayRequestRoutingRuleInner object itself.
     */
    public ApplicationGatewayRequestRoutingRuleInner withUrlPathMap(SubResource urlPathMap) {
        this.urlPathMap = urlPathMap;
        return this;
    }

    /**
     * Get the rewriteRuleSet property: Rewrite Rule Set resource in Basic rule of the application gateway.
     *
     * @return the rewriteRuleSet value.
     */
    public SubResource rewriteRuleSet() {
        return this.rewriteRuleSet;
    }

    /**
     * Set the rewriteRuleSet property: Rewrite Rule Set resource in Basic rule of the application gateway.
     *
     * @param rewriteRuleSet the rewriteRuleSet value to set.
     * @return the ApplicationGatewayRequestRoutingRuleInner object itself.
     */
    public ApplicationGatewayRequestRoutingRuleInner withRewriteRuleSet(SubResource rewriteRuleSet) {
        this.rewriteRuleSet = rewriteRuleSet;
        return this;
    }

    /**
     * Get the redirectConfiguration property: Redirect configuration resource of the application gateway.
     *
     * @return the redirectConfiguration value.
     */
    public SubResource redirectConfiguration() {
        return this.redirectConfiguration;
    }

    /**
     * Set the redirectConfiguration property: Redirect configuration resource of the application gateway.
     *
     * @param redirectConfiguration the redirectConfiguration value to set.
     * @return the ApplicationGatewayRequestRoutingRuleInner object itself.
     */
    public ApplicationGatewayRequestRoutingRuleInner withRedirectConfiguration(SubResource redirectConfiguration) {
        this.redirectConfiguration = redirectConfiguration;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the request routing rule resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the request routing rule resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewayRequestRoutingRuleInner object itself.
     */
    public ApplicationGatewayRequestRoutingRuleInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
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
