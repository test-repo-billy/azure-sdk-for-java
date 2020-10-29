/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appconfiguration.v2020_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A resource identity that is managed by the user of the service.
 */
public class UserIdentity {
    /**
     * The principal ID of the user-assigned identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /**
     * The client ID of the user-assigned identity.
     */
    @JsonProperty(value = "clientId", access = JsonProperty.Access.WRITE_ONLY)
    private String clientId;

    /**
     * Get the principal ID of the user-assigned identity.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the client ID of the user-assigned identity.
     *
     * @return the clientId value
     */
    public String clientId() {
        return this.clientId;
    }

}
