// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import java.util.Map;

/**
 * The base resource type.
 */
@Fluent
public class WorkflowResource extends Resource {
    /**
     * Creates an instance of WorkflowResource class.
     */
    public WorkflowResource() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorkflowResource withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorkflowResource withTags(Map<String, String> tags) {
        super.withTags(tags);
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
