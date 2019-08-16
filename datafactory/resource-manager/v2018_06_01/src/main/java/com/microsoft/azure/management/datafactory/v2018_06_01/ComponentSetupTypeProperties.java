/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Install 3rd party component setup type properties.
 */
public class ComponentSetupTypeProperties {
    /**
     * The name of the 3rd party component.
     */
    @JsonProperty(value = "componentName", required = true)
    private String componentName;

    /**
     * Get the name of the 3rd party component.
     *
     * @return the componentName value
     */
    public String componentName() {
        return this.componentName;
    }

    /**
     * Set the name of the 3rd party component.
     *
     * @param componentName the componentName value to set
     * @return the ComponentSetupTypeProperties object itself.
     */
    public ComponentSetupTypeProperties withComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

}
