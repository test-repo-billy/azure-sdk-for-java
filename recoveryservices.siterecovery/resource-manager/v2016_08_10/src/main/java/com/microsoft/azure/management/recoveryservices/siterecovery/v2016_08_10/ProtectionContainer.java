/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.implementation.ProtectionContainerInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.implementation.RecoveryServicesManager;
import java.util.List;

/**
 * Type representing ProtectionContainer.
 */
public interface ProtectionContainer extends HasInner<ProtectionContainerInner>, Indexable, Refreshable<ProtectionContainer>, Updatable<ProtectionContainer.Update>, HasManager<RecoveryServicesManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    ProtectionContainerProperties properties();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ProtectionContainer definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithReplicationFabric, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ProtectionContainer definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ProtectionContainer definition.
         */
        interface Blank extends WithReplicationFabric {
        }

        /**
         * The stage of the protectioncontainer definition allowing to specify ReplicationFabric.
         */
        interface WithReplicationFabric {
           /**
            * Specifies fabricName.
            * @param fabricName Unique fabric ARM name
            * @return the next definition stage
            */
            WithProperties withExistingReplicationFabric(String fabricName);
        }

        /**
         * The stage of the protectioncontainer definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            * @param properties Create protection container input properties
            * @return the next definition stage
            */
            WithCreate withProperties(CreateProtectionContainerInputProperties properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ProtectionContainer> {
        }
    }
    /**
     * The template for a ProtectionContainer update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ProtectionContainer>, UpdateStages.WithProperties {
    }

    /**
     * Grouping of ProtectionContainer update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the protectioncontainer update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties Create protection container input properties
             * @return the next update stage
             */
            Update withProperties(CreateProtectionContainerInputProperties properties);
        }

    }
}
