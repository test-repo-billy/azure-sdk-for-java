/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import java.util.List;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ApplicationInsightsComponentFeature;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An Application Insights component available features.
 */
public class ApplicationInsightsComponentAvailableFeaturesInner {
    /**
     * A list of Application Insigths component feature.
     */
    @JsonProperty(value = "Result", access = JsonProperty.Access.WRITE_ONLY)
    private List<ApplicationInsightsComponentFeature> result;

    /**
     * Get a list of Application Insigths component feature.
     *
     * @return the result value
     */
    public List<ApplicationInsightsComponentFeature> result() {
        return this.result;
    }

}
