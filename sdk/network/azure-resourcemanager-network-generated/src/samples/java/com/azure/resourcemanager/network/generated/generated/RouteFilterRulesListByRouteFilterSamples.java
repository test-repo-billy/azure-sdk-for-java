// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for RouteFilterRules ListByRouteFilter.
 */
public final class RouteFilterRulesListByRouteFilterSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * RouteFilterRuleListByRouteFilter.json
     */
    /**
     * Sample code: RouteFilterRuleListByRouteFilter.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        routeFilterRuleListByRouteFilter(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.routeFilterRules().listByRouteFilter("rg1", "filterName", com.azure.core.util.Context.NONE);
    }
}
