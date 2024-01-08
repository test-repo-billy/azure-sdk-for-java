// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.EffectiveRouteListResultInner;
import java.util.List;

/**
 * An immutable client-side representation of EffectiveRouteListResult.
 */
public interface EffectiveRouteListResult {
    /**
     * Gets the value property: A list of effective routes.
     * 
     * @return the value value.
     */
    List<EffectiveRoute> value();

    /**
     * Gets the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.EffectiveRouteListResultInner object.
     * 
     * @return the inner object.
     */
    EffectiveRouteListResultInner innerModel();
}
