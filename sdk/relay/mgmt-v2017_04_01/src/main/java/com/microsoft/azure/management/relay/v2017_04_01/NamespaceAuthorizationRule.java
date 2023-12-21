/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.relay.v2017_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.relay.v2017_04_01.implementation.AuthorizationRuleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.relay.v2017_04_01.implementation.RelayManager;
import java.util.List;

/**
 * Type representing NamespaceAuthorizationRule.
 */
public interface NamespaceAuthorizationRule extends HasInner<AuthorizationRuleInner>, Indexable, Refreshable<NamespaceAuthorizationRule>, Updatable<NamespaceAuthorizationRule.Update>, HasManager<RelayManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the rights value.
     */
    List<AccessRights> rights();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the NamespaceAuthorizationRule definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNamespace, DefinitionStages.WithRights, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of NamespaceAuthorizationRule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a NamespaceAuthorizationRule definition.
         */
        interface Blank extends WithNamespace {
        }

        /**
         * The stage of the namespaceauthorizationrule definition allowing to specify Namespace.
         */
        interface WithNamespace {
           /**
            * Specifies resourceGroupName, namespaceName.
            * @param resourceGroupName Name of the Resource group within the Azure subscription
            * @param namespaceName The namespace name
            * @return the next definition stage
            */
            WithRights withExistingNamespace(String resourceGroupName, String namespaceName);
        }

        /**
         * The stage of the namespaceauthorizationrule definition allowing to specify Rights.
         */
        interface WithRights {
           /**
            * Specifies rights.
            * @param rights The rights associated with the rule
            * @return the next definition stage
            */
            WithCreate withRights(List<AccessRights> rights);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<NamespaceAuthorizationRule> {
        }
    }
    /**
     * The template for a NamespaceAuthorizationRule update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<NamespaceAuthorizationRule>, UpdateStages.WithRights {
    }

    /**
     * Grouping of NamespaceAuthorizationRule update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the namespaceauthorizationrule update allowing to specify Rights.
         */
        interface WithRights {
            /**
             * Specifies rights.
             * @param rights The rights associated with the rule
             * @return the next update stage
             */
            Update withRights(List<AccessRights> rights);
        }

    }
}
