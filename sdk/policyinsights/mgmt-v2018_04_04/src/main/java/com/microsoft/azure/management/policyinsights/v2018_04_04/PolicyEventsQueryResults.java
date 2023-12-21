/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2018_04_04;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.policyinsights.v2018_04_04.implementation.PolicyInsightsManager;
import com.microsoft.azure.management.policyinsights.v2018_04_04.implementation.PolicyEventsQueryResultsInner;
import com.microsoft.azure.management.policyinsights.v2018_04_04.implementation.PolicyEventInner;
import java.util.List;

/**
 * Type representing PolicyEventsQueryResults.
 */
public interface PolicyEventsQueryResults extends HasInner<PolicyEventsQueryResultsInner>, HasManager<PolicyInsightsManager> {
    /**
     * @return the odatacontext value.
     */
    String odatacontext();

    /**
     * @return the odatacount value.
     */
    Integer odatacount();

    /**
     * @return the value value.
     */
    List<PolicyEventInner> value();

}
