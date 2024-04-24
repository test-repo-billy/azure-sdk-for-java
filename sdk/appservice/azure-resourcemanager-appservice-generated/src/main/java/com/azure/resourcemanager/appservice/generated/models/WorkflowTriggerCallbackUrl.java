// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.WorkflowTriggerCallbackUrlInner;
import java.util.List;

/**
 * An immutable client-side representation of WorkflowTriggerCallbackUrl.
 */
public interface WorkflowTriggerCallbackUrl {
    /**
     * Gets the value property: Gets the workflow trigger callback URL.
     * 
     * @return the value value.
     */
    String value();

    /**
     * Gets the method property: Gets the workflow trigger callback URL HTTP method.
     * 
     * @return the method value.
     */
    String method();

    /**
     * Gets the basePath property: Gets the workflow trigger callback URL base path.
     * 
     * @return the basePath value.
     */
    String basePath();

    /**
     * Gets the relativePath property: Gets the workflow trigger callback URL relative path.
     * 
     * @return the relativePath value.
     */
    String relativePath();

    /**
     * Gets the relativePathParameters property: Gets the workflow trigger callback URL relative path parameters.
     * 
     * @return the relativePathParameters value.
     */
    List<String> relativePathParameters();

    /**
     * Gets the queries property: Gets the workflow trigger callback URL query parameters.
     * 
     * @return the queries value.
     */
    WorkflowTriggerListCallbackUrlQueries queries();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.WorkflowTriggerCallbackUrlInner
     * object.
     * 
     * @return the inner object.
     */
    WorkflowTriggerCallbackUrlInner innerModel();
}
