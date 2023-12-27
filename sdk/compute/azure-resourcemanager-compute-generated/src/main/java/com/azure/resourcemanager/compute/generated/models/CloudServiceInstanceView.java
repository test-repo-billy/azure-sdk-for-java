// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.resourcemanager.compute.generated.fluent.models.CloudServiceInstanceViewInner;
import java.util.List;

/**
 * An immutable client-side representation of CloudServiceInstanceView.
 */
public interface CloudServiceInstanceView {
    /**
     * Gets the roleInstance property: Instance view statuses.
     * 
     * @return the roleInstance value.
     */
    InstanceViewStatusesSummary roleInstance();

    /**
     * Gets the sdkVersion property: The version of the SDK that was used to generate the package for the cloud service.
     * 
     * @return the sdkVersion value.
     */
    String sdkVersion();

    /**
     * Gets the privateIds property: Specifies a list of unique identifiers generated internally for the cloud service.
     * &lt;br /&gt;&lt;br /&gt; NOTE: If you are using Azure Diagnostics extension, this property can be used as
     * 'DeploymentId' for querying details.
     * 
     * @return the privateIds value.
     */
    List<String> privateIds();

    /**
     * Gets the statuses property: The statuses property.
     * 
     * @return the statuses value.
     */
    List<ResourceInstanceViewStatus> statuses();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.CloudServiceInstanceViewInner object.
     * 
     * @return the inner object.
     */
    CloudServiceInstanceViewInner innerModel();
}
