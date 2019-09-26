/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcehealth.v2018_08_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure service impacted by the service health event.
 */
public class Impact {
    /**
     * Impacted service name.
     */
    @JsonProperty(value = "impactedService")
    private String impactedService;

    /**
     * List regions impacted by the service health event.
     */
    @JsonProperty(value = "impactedRegions")
    private List<ImpactedServiceRegion> impactedRegions;

    /**
     * Get impacted service name.
     *
     * @return the impactedService value
     */
    public String impactedService() {
        return this.impactedService;
    }

    /**
     * Set impacted service name.
     *
     * @param impactedService the impactedService value to set
     * @return the Impact object itself.
     */
    public Impact withImpactedService(String impactedService) {
        this.impactedService = impactedService;
        return this;
    }

    /**
     * Get list regions impacted by the service health event.
     *
     * @return the impactedRegions value
     */
    public List<ImpactedServiceRegion> impactedRegions() {
        return this.impactedRegions;
    }

    /**
     * Set list regions impacted by the service health event.
     *
     * @param impactedRegions the impactedRegions value to set
     * @return the Impact object itself.
     */
    public Impact withImpactedRegions(List<ImpactedServiceRegion> impactedRegions) {
        this.impactedRegions = impactedRegions;
        return this;
    }

}
