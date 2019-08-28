/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policy.v2019_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.policy.v2019_06_01.implementation.PolicySetDefinitionInner;
import com.microsoft.azure.management.policy.v2019_06_01.implementation.PolicySetDefinitionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PolicySetDefinitions.
 */
public interface PolicySetDefinitions extends SupportsCreating<PolicySetDefinition.DefinitionStages.Blank>, SupportsListing<PolicySetDefinition>, HasInner<PolicySetDefinitionsInner> {
    /**
     * Deletes a policy set definition.
     * This operation deletes the policy set definition in the given subscription with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String policySetDefinitionName);

    /**
     * Retrieves a policy set definition.
     * This operation retrieves the policy set definition in the given subscription with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicySetDefinition> getAsync(String policySetDefinitionName);

    /**
     * Retrieves a built in policy set definition.
     * This operation retrieves the built-in policy set definition with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicySetDefinition> getBuiltInAsync(String policySetDefinitionName);

    /**
     * Creates or updates a policy set definition.
     * This operation creates or updates a policy set definition in the given management group with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to create.
     * @param managementGroupId The ID of the management group.
     * @param parameters The policy set definition properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicySetDefinition> createOrUpdateAtManagementGroupAsync(String policySetDefinitionName, String managementGroupId, PolicySetDefinitionInner parameters);

    /**
     * Deletes a policy set definition.
     * This operation deletes the policy set definition in the given management group with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to delete.
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAtManagementGroupAsync(String policySetDefinitionName, String managementGroupId);

    /**
     * Retrieves a policy set definition.
     * This operation retrieves the policy set definition in the given management group with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to get.
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicySetDefinition> getAtManagementGroupAsync(String policySetDefinitionName, String managementGroupId);

    /**
     * Retrieves all policy set definitions in management group.
     * This operation retrieves a list of all the a policy set definition in the given management group.
     *
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicySetDefinition> listByManagementGroupAsync(final String managementGroupId);

    /**
     * Retrieves built-in policy set definitions.
     * This operation retrieves a list of all the built-in policy set definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicySetDefinition> listBuiltInAsync();

}
