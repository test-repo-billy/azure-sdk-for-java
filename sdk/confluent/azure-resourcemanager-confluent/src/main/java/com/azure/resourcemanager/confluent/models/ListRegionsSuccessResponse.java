// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.models;

import com.azure.resourcemanager.confluent.fluent.models.ListRegionsSuccessResponseInner;
import java.util.List;

/**
 * An immutable client-side representation of ListRegionsSuccessResponse.
 */
public interface ListRegionsSuccessResponse {
    /**
     * Gets the data property: List of regions supported by confluent.
     * 
     * @return the data value.
     */
    List<RegionRecord> data();

    /**
     * Gets the inner com.azure.resourcemanager.confluent.fluent.models.ListRegionsSuccessResponseInner object.
     * 
     * @return the inner object.
     */
    ListRegionsSuccessResponseInner innerModel();
}
