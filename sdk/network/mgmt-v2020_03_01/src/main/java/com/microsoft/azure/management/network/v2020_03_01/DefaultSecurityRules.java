/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2020_03_01.implementation.DefaultSecurityRulesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DefaultSecurityRules.
 */
public interface DefaultSecurityRules extends HasInner<DefaultSecurityRulesInner> {
    /**
     * Get the specified default network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param defaultSecurityRuleName The name of the default security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NetworkSecurityGroupSecurityRuleModel> getAsync(String resourceGroupName, String networkSecurityGroupName, String defaultSecurityRuleName);

    /**
     * Gets all default security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NetworkSecurityGroupSecurityRuleModel> listAsync(final String resourceGroupName, final String networkSecurityGroupName);

}
