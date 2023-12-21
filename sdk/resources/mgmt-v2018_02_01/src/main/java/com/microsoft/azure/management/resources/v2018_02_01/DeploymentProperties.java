/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment properties.
 */
public class DeploymentProperties {
    /**
     * The template content. You use this element when you want to pass the
     * template syntax directly in the request rather than link to an existing
     * template. It can be a JObject or well-formed JSON string. Use either the
     * templateLink property or the template property, but not both.
     */
    @JsonProperty(value = "template")
    private Object template;

    /**
     * The URI of the template. Use either the templateLink property or the
     * template property, but not both.
     */
    @JsonProperty(value = "templateLink")
    private TemplateLink templateLink;

    /**
     * Name and value pairs that define the deployment parameters for the
     * template. You use this element when you want to provide the parameter
     * values directly in the request rather than link to an existing parameter
     * file. Use either the parametersLink property or the parameters property,
     * but not both. It can be a JObject or a well formed JSON string.
     */
    @JsonProperty(value = "parameters")
    private Object parameters;

    /**
     * The URI of parameters file. You use this element to link to an existing
     * parameters file. Use either the parametersLink property or the
     * parameters property, but not both.
     */
    @JsonProperty(value = "parametersLink")
    private ParametersLink parametersLink;

    /**
     * The mode that is used to deploy resources. This value can be either
     * Incremental or Complete. In Incremental mode, resources are deployed
     * without deleting existing resources that are not included in the
     * template. In Complete mode, resources are deployed and existing
     * resources in the resource group that are not included in the template
     * are deleted. Be careful when using Complete mode as you may
     * unintentionally delete resources. Possible values include:
     * 'Incremental', 'Complete'.
     */
    @JsonProperty(value = "mode", required = true)
    private DeploymentMode mode;

    /**
     * The debug setting of the deployment.
     */
    @JsonProperty(value = "debugSetting")
    private DebugSetting debugSetting;

    /**
     * The deployment on error behavior.
     */
    @JsonProperty(value = "onErrorDeployment")
    private OnErrorDeployment onErrorDeployment;

    /**
     * Get the template content. You use this element when you want to pass the template syntax directly in the request rather than link to an existing template. It can be a JObject or well-formed JSON string. Use either the templateLink property or the template property, but not both.
     *
     * @return the template value
     */
    public Object template() {
        return this.template;
    }

    /**
     * Set the template content. You use this element when you want to pass the template syntax directly in the request rather than link to an existing template. It can be a JObject or well-formed JSON string. Use either the templateLink property or the template property, but not both.
     *
     * @param template the template value to set
     * @return the DeploymentProperties object itself.
     */
    public DeploymentProperties withTemplate(Object template) {
        this.template = template;
        return this;
    }

    /**
     * Get the URI of the template. Use either the templateLink property or the template property, but not both.
     *
     * @return the templateLink value
     */
    public TemplateLink templateLink() {
        return this.templateLink;
    }

    /**
     * Set the URI of the template. Use either the templateLink property or the template property, but not both.
     *
     * @param templateLink the templateLink value to set
     * @return the DeploymentProperties object itself.
     */
    public DeploymentProperties withTemplateLink(TemplateLink templateLink) {
        this.templateLink = templateLink;
        return this;
    }

    /**
     * Get name and value pairs that define the deployment parameters for the template. You use this element when you want to provide the parameter values directly in the request rather than link to an existing parameter file. Use either the parametersLink property or the parameters property, but not both. It can be a JObject or a well formed JSON string.
     *
     * @return the parameters value
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set name and value pairs that define the deployment parameters for the template. You use this element when you want to provide the parameter values directly in the request rather than link to an existing parameter file. Use either the parametersLink property or the parameters property, but not both. It can be a JObject or a well formed JSON string.
     *
     * @param parameters the parameters value to set
     * @return the DeploymentProperties object itself.
     */
    public DeploymentProperties withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the URI of parameters file. You use this element to link to an existing parameters file. Use either the parametersLink property or the parameters property, but not both.
     *
     * @return the parametersLink value
     */
    public ParametersLink parametersLink() {
        return this.parametersLink;
    }

    /**
     * Set the URI of parameters file. You use this element to link to an existing parameters file. Use either the parametersLink property or the parameters property, but not both.
     *
     * @param parametersLink the parametersLink value to set
     * @return the DeploymentProperties object itself.
     */
    public DeploymentProperties withParametersLink(ParametersLink parametersLink) {
        this.parametersLink = parametersLink;
        return this;
    }

    /**
     * Get the mode that is used to deploy resources. This value can be either Incremental or Complete. In Incremental mode, resources are deployed without deleting existing resources that are not included in the template. In Complete mode, resources are deployed and existing resources in the resource group that are not included in the template are deleted. Be careful when using Complete mode as you may unintentionally delete resources. Possible values include: 'Incremental', 'Complete'.
     *
     * @return the mode value
     */
    public DeploymentMode mode() {
        return this.mode;
    }

    /**
     * Set the mode that is used to deploy resources. This value can be either Incremental or Complete. In Incremental mode, resources are deployed without deleting existing resources that are not included in the template. In Complete mode, resources are deployed and existing resources in the resource group that are not included in the template are deleted. Be careful when using Complete mode as you may unintentionally delete resources. Possible values include: 'Incremental', 'Complete'.
     *
     * @param mode the mode value to set
     * @return the DeploymentProperties object itself.
     */
    public DeploymentProperties withMode(DeploymentMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the debug setting of the deployment.
     *
     * @return the debugSetting value
     */
    public DebugSetting debugSetting() {
        return this.debugSetting;
    }

    /**
     * Set the debug setting of the deployment.
     *
     * @param debugSetting the debugSetting value to set
     * @return the DeploymentProperties object itself.
     */
    public DeploymentProperties withDebugSetting(DebugSetting debugSetting) {
        this.debugSetting = debugSetting;
        return this;
    }

    /**
     * Get the deployment on error behavior.
     *
     * @return the onErrorDeployment value
     */
    public OnErrorDeployment onErrorDeployment() {
        return this.onErrorDeployment;
    }

    /**
     * Set the deployment on error behavior.
     *
     * @param onErrorDeployment the onErrorDeployment value to set
     * @return the DeploymentProperties object itself.
     */
    public DeploymentProperties withOnErrorDeployment(OnErrorDeployment onErrorDeployment) {
        this.onErrorDeployment = onErrorDeployment;
        return this;
    }

}
