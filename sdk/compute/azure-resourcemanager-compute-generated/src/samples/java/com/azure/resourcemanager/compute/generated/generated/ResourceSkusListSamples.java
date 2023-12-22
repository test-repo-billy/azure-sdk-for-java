// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for ResourceSkus List.
 */
public final class ResourceSkusListSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/Skus/stable/2021-07-01/examples/skus/
     * ListAvailableResourceSkus.json
     */
    /**
     * Sample code: Lists all available Resource SKUs.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        listsAllAvailableResourceSKUs(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.resourceSkus().list(null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/Skus/stable/2021-07-01/examples/skus/
     * ListAvailableResourceSkusForARegion.json
     */
    /**
     * Sample code: Lists all available Resource SKUs for the specified region.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void listsAllAvailableResourceSKUsForTheSpecifiedRegion(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.resourceSkus().list("location eq 'westus'", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/Skus/stable/2021-07-01/examples/skus/
     * ListAvailableResourceSkusWithExtendedLocations.json
     */
    /**
     * Sample code: Lists all available Resource SKUs with Extended Location information.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void listsAllAvailableResourceSKUsWithExtendedLocationInformation(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.resourceSkus().list(null, "true", com.azure.core.util.Context.NONE);
    }
}
