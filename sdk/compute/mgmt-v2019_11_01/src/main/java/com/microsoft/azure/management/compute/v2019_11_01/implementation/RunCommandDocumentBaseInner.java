/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01.implementation;

import com.microsoft.azure.management.compute.v2019_11_01.OperatingSystemTypes;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the properties of a Run Command metadata.
 */
public class RunCommandDocumentBaseInner {
    /**
     * The VM run command schema.
     */
    @JsonProperty(value = "$schema", required = true)
    private String schema;

    /**
     * The VM run command id.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * The Operating System type. Possible values include: 'Windows', 'Linux'.
     */
    @JsonProperty(value = "osType", required = true)
    private OperatingSystemTypes osType;

    /**
     * The VM run command label.
     */
    @JsonProperty(value = "label", required = true)
    private String label;

    /**
     * The VM run command description.
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /**
     * Get the VM run command schema.
     *
     * @return the schema value
     */
    public String schema() {
        return this.schema;
    }

    /**
     * Set the VM run command schema.
     *
     * @param schema the schema value to set
     * @return the RunCommandDocumentBaseInner object itself.
     */
    public RunCommandDocumentBaseInner withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get the VM run command id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the VM run command id.
     *
     * @param id the id value to set
     * @return the RunCommandDocumentBaseInner object itself.
     */
    public RunCommandDocumentBaseInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the Operating System type. Possible values include: 'Windows', 'Linux'.
     *
     * @return the osType value
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the Operating System type. Possible values include: 'Windows', 'Linux'.
     *
     * @param osType the osType value to set
     * @return the RunCommandDocumentBaseInner object itself.
     */
    public RunCommandDocumentBaseInner withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the VM run command label.
     *
     * @return the label value
     */
    public String label() {
        return this.label;
    }

    /**
     * Set the VM run command label.
     *
     * @param label the label value to set
     * @return the RunCommandDocumentBaseInner object itself.
     */
    public RunCommandDocumentBaseInner withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the VM run command description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the VM run command description.
     *
     * @param description the description value to set
     * @return the RunCommandDocumentBaseInner object itself.
     */
    public RunCommandDocumentBaseInner withDescription(String description) {
        this.description = description;
        return this;
    }

}
