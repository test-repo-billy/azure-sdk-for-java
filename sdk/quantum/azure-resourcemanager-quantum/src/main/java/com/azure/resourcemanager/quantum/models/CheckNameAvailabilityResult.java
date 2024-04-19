// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.models;

import com.azure.resourcemanager.quantum.fluent.models.CheckNameAvailabilityResultInner;

/**
 * An immutable client-side representation of CheckNameAvailabilityResult.
 */
public interface CheckNameAvailabilityResult {
    /**
     * Gets the nameAvailable property: Indicator of availability of the Quantum Workspace resource name.
     * 
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * Gets the reason property: The reason of unavailability.
     * 
     * @return the reason value.
     */
    String reason();

    /**
     * Gets the message property: The detailed info regarding the reason associated with the Namespace.
     * 
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.quantum.fluent.models.CheckNameAvailabilityResultInner object.
     * 
     * @return the inner object.
     */
    CheckNameAvailabilityResultInner innerModel();
}
