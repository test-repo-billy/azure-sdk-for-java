// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.resourcemanager.security.fluent.models.OperationResultAutoGeneratedInner;

/**
 * An immutable client-side representation of OperationResultAutoGenerated.
 */
public interface OperationResultAutoGenerated {
    /**
     * Gets the status property: The status of the long run operation result of governance rule.
     * 
     * @return the status value.
     */
    OperationResult status();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.OperationResultAutoGeneratedInner object.
     * 
     * @return the inner object.
     */
    OperationResultAutoGeneratedInner innerModel();
}
