/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2017_08_31;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Profile for diagnostics on the container service VMs.
 */
public class ContainerServiceVMDiagnostics {
    /**
     * Whether the VM diagnostic agent is provisioned on the VM.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /**
     * The URI of the storage account where diagnostics are stored.
     */
    @JsonProperty(value = "storageUri", access = JsonProperty.Access.WRITE_ONLY)
    private String storageUri;

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     * @return the ContainerServiceVMDiagnostics object itself.
     */
    public ContainerServiceVMDiagnostics withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the storageUri value.
     *
     * @return the storageUri value
     */
    public String storageUri() {
        return this.storageUri;
    }

}
