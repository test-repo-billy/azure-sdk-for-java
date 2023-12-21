/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_03_22_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.MatchedRoute;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of testing all routes.
 */
public class TestAllRoutesResultInner {
    /**
     * JSON-serialized array of matched routes.
     */
    @JsonProperty(value = "routes")
    private List<MatchedRoute> routes;

    /**
     * Get jSON-serialized array of matched routes.
     *
     * @return the routes value
     */
    public List<MatchedRoute> routes() {
        return this.routes;
    }

    /**
     * Set jSON-serialized array of matched routes.
     *
     * @param routes the routes value to set
     * @return the TestAllRoutesResultInner object itself.
     */
    public TestAllRoutesResultInner withRoutes(List<MatchedRoute> routes) {
        this.routes = routes;
        return this;
    }

}
