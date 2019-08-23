/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Update protection profile input.
 */
public class UpdatePolicyInput {
    /**
     * The ReplicationProviderSettings.
     */
    @JsonProperty(value = "properties")
    private UpdatePolicyInputProperties properties;

    /**
     * Get the ReplicationProviderSettings.
     *
     * @return the properties value
     */
    public UpdatePolicyInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the ReplicationProviderSettings.
     *
     * @param properties the properties value to set
     * @return the UpdatePolicyInput object itself.
     */
    public UpdatePolicyInput withProperties(UpdatePolicyInputProperties properties) {
        this.properties = properties;
        return this;
    }

}
