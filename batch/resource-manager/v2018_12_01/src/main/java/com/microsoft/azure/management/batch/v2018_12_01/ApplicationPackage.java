/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2018_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.batch.v2018_12_01.implementation.ApplicationPackageInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.batch.v2018_12_01.implementation.BatchManager;
import org.joda.time.DateTime;

/**
 * Type representing ApplicationPackage.
 */
public interface ApplicationPackage extends HasInner<ApplicationPackageInner>, Indexable, Refreshable<ApplicationPackage>, Updatable<ApplicationPackage.Update>, HasManager<BatchManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the format value.
     */
    String format();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastActivationTime value.
     */
    DateTime lastActivationTime();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the state value.
     */
    PackageState state();

    /**
     * @return the storageUrl value.
     */
    String storageUrl();

    /**
     * @return the storageUrlExpiry value.
     */
    DateTime storageUrlExpiry();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ApplicationPackage definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithApplication, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ApplicationPackage definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ApplicationPackage definition.
         */
        interface Blank extends WithApplication {
        }

        /**
         * The stage of the applicationpackage definition allowing to specify Application.
         */
        interface WithApplication {
           /**
            * Specifies resourceGroupName, accountName, applicationName.
            * @param resourceGroupName The name of the resource group that contains the Batch account
            * @param accountName The name of the Batch account
            * @param applicationName The name of the application. This must be unique within the account
            * @return the next definition stage
            */
            WithCreate withExistingApplication(String resourceGroupName, String accountName, String applicationName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ApplicationPackage> {
        }
    }
    /**
     * The template for a ApplicationPackage update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ApplicationPackage> {
    }

    /**
     * Grouping of ApplicationPackage update stages.
     */
    interface UpdateStages {
    }
}
