// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayRedirectType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of redirect configuration of the application gateway.
 */
@Fluent
public final class ApplicationGatewayRedirectConfigurationPropertiesFormat {
    /*
     * HTTP redirection type.
     */
    @JsonProperty(value = "redirectType")
    private ApplicationGatewayRedirectType redirectType;

    /*
     * Reference to a listener to redirect the request to.
     */
    @JsonProperty(value = "targetListener")
    private SubResource targetListener;

    /*
     * Url to redirect the request to.
     */
    @JsonProperty(value = "targetUrl")
    private String targetUrl;

    /*
     * Include path in the redirected url.
     */
    @JsonProperty(value = "includePath")
    private Boolean includePath;

    /*
     * Include query string in the redirected url.
     */
    @JsonProperty(value = "includeQueryString")
    private Boolean includeQueryString;

    /*
     * Request routing specifying redirect configuration.
     */
    @JsonProperty(value = "requestRoutingRules")
    private List<SubResource> requestRoutingRules;

    /*
     * Url path maps specifying default redirect configuration.
     */
    @JsonProperty(value = "urlPathMaps")
    private List<SubResource> urlPathMaps;

    /*
     * Path rules specifying redirect configuration.
     */
    @JsonProperty(value = "pathRules")
    private List<SubResource> pathRules;

    /**
     * Creates an instance of ApplicationGatewayRedirectConfigurationPropertiesFormat class.
     */
    public ApplicationGatewayRedirectConfigurationPropertiesFormat() {
    }

    /**
     * Get the redirectType property: HTTP redirection type.
     * 
     * @return the redirectType value.
     */
    public ApplicationGatewayRedirectType redirectType() {
        return this.redirectType;
    }

    /**
     * Set the redirectType property: HTTP redirection type.
     * 
     * @param redirectType the redirectType value to set.
     * @return the ApplicationGatewayRedirectConfigurationPropertiesFormat object itself.
     */
    public ApplicationGatewayRedirectConfigurationPropertiesFormat
        withRedirectType(ApplicationGatewayRedirectType redirectType) {
        this.redirectType = redirectType;
        return this;
    }

    /**
     * Get the targetListener property: Reference to a listener to redirect the request to.
     * 
     * @return the targetListener value.
     */
    public SubResource targetListener() {
        return this.targetListener;
    }

    /**
     * Set the targetListener property: Reference to a listener to redirect the request to.
     * 
     * @param targetListener the targetListener value to set.
     * @return the ApplicationGatewayRedirectConfigurationPropertiesFormat object itself.
     */
    public ApplicationGatewayRedirectConfigurationPropertiesFormat withTargetListener(SubResource targetListener) {
        this.targetListener = targetListener;
        return this;
    }

    /**
     * Get the targetUrl property: Url to redirect the request to.
     * 
     * @return the targetUrl value.
     */
    public String targetUrl() {
        return this.targetUrl;
    }

    /**
     * Set the targetUrl property: Url to redirect the request to.
     * 
     * @param targetUrl the targetUrl value to set.
     * @return the ApplicationGatewayRedirectConfigurationPropertiesFormat object itself.
     */
    public ApplicationGatewayRedirectConfigurationPropertiesFormat withTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
        return this;
    }

    /**
     * Get the includePath property: Include path in the redirected url.
     * 
     * @return the includePath value.
     */
    public Boolean includePath() {
        return this.includePath;
    }

    /**
     * Set the includePath property: Include path in the redirected url.
     * 
     * @param includePath the includePath value to set.
     * @return the ApplicationGatewayRedirectConfigurationPropertiesFormat object itself.
     */
    public ApplicationGatewayRedirectConfigurationPropertiesFormat withIncludePath(Boolean includePath) {
        this.includePath = includePath;
        return this;
    }

    /**
     * Get the includeQueryString property: Include query string in the redirected url.
     * 
     * @return the includeQueryString value.
     */
    public Boolean includeQueryString() {
        return this.includeQueryString;
    }

    /**
     * Set the includeQueryString property: Include query string in the redirected url.
     * 
     * @param includeQueryString the includeQueryString value to set.
     * @return the ApplicationGatewayRedirectConfigurationPropertiesFormat object itself.
     */
    public ApplicationGatewayRedirectConfigurationPropertiesFormat withIncludeQueryString(Boolean includeQueryString) {
        this.includeQueryString = includeQueryString;
        return this;
    }

    /**
     * Get the requestRoutingRules property: Request routing specifying redirect configuration.
     * 
     * @return the requestRoutingRules value.
     */
    public List<SubResource> requestRoutingRules() {
        return this.requestRoutingRules;
    }

    /**
     * Set the requestRoutingRules property: Request routing specifying redirect configuration.
     * 
     * @param requestRoutingRules the requestRoutingRules value to set.
     * @return the ApplicationGatewayRedirectConfigurationPropertiesFormat object itself.
     */
    public ApplicationGatewayRedirectConfigurationPropertiesFormat
        withRequestRoutingRules(List<SubResource> requestRoutingRules) {
        this.requestRoutingRules = requestRoutingRules;
        return this;
    }

    /**
     * Get the urlPathMaps property: Url path maps specifying default redirect configuration.
     * 
     * @return the urlPathMaps value.
     */
    public List<SubResource> urlPathMaps() {
        return this.urlPathMaps;
    }

    /**
     * Set the urlPathMaps property: Url path maps specifying default redirect configuration.
     * 
     * @param urlPathMaps the urlPathMaps value to set.
     * @return the ApplicationGatewayRedirectConfigurationPropertiesFormat object itself.
     */
    public ApplicationGatewayRedirectConfigurationPropertiesFormat withUrlPathMaps(List<SubResource> urlPathMaps) {
        this.urlPathMaps = urlPathMaps;
        return this;
    }

    /**
     * Get the pathRules property: Path rules specifying redirect configuration.
     * 
     * @return the pathRules value.
     */
    public List<SubResource> pathRules() {
        return this.pathRules;
    }

    /**
     * Set the pathRules property: Path rules specifying redirect configuration.
     * 
     * @param pathRules the pathRules value to set.
     * @return the ApplicationGatewayRedirectConfigurationPropertiesFormat object itself.
     */
    public ApplicationGatewayRedirectConfigurationPropertiesFormat withPathRules(List<SubResource> pathRules) {
        this.pathRules = pathRules;
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
