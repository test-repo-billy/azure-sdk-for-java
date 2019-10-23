/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2019_08_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.peering.v2019_08_01_preview.implementation.PeeringServicePrefixInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.peering.v2019_08_01_preview.implementation.PeeringManager;
import java.util.List;

/**
 * Type representing PeeringServicePrefix.
 */
public interface PeeringServicePrefix extends HasInner<PeeringServicePrefixInner>, Indexable, Refreshable<PeeringServicePrefix>, Updatable<PeeringServicePrefix.Update>, HasManager<PeeringManager> {
    /**
     * @return the errorMessage value.
     */
    String errorMessage();

    /**
     * @return the events value.
     */
    List<PeeringServicePrefixEvent> events();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the learnedType value.
     */
    LearnedType learnedType();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the prefix value.
     */
    String prefix();

    /**
     * @return the prefixValidationState value.
     */
    PrefixValidationState prefixValidationState();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the PeeringServicePrefix definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithPeeringService, DefinitionStages.WithPrefix, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PeeringServicePrefix definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PeeringServicePrefix definition.
         */
        interface Blank extends WithPeeringService {
        }

        /**
         * The stage of the peeringserviceprefix definition allowing to specify PeeringService.
         */
        interface WithPeeringService {
           /**
            * Specifies resourceGroupName, myPeeringService.
            * @param resourceGroupName The name of the resource group
            * @param myPeeringService The name of the peering service
            * @return the next definition stage
            */
            WithPrefix withExistingPeeringService(String resourceGroupName, String myPeeringService);
        }

        /**
         * The stage of the peeringserviceprefix definition allowing to specify Prefix.
         */
        interface WithPrefix {
           /**
            * Specifies prefix.
            * @param prefix The prefix from which your traffic originates
            * @return the next definition stage
            */
            WithCreate withPrefix(String prefix);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PeeringServicePrefix> {
        }
    }
    /**
     * The template for a PeeringServicePrefix update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PeeringServicePrefix>, UpdateStages.WithPrefix {
    }

    /**
     * Grouping of PeeringServicePrefix update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the peeringserviceprefix update allowing to specify Prefix.
         */
        interface WithPrefix {
            /**
             * Specifies prefix.
             * @param prefix The prefix from which your traffic originates
             * @return the next update stage
             */
            Update withPrefix(String prefix);
        }

    }
}
