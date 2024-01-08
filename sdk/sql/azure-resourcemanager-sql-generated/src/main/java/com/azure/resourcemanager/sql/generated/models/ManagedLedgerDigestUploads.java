// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedLedgerDigestUploadsInner;

/**
 * An immutable client-side representation of ManagedLedgerDigestUploads.
 */
public interface ManagedLedgerDigestUploads {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the digestStorageEndpoint property: The digest storage endpoint, which must be either an Azure blob storage
     * endpoint or an URI for Azure Confidential Ledger.
     * 
     * @return the digestStorageEndpoint value.
     */
    String digestStorageEndpoint();

    /**
     * Gets the state property: Specifies the state of ledger digest upload.
     * 
     * @return the state value.
     */
    ManagedLedgerDigestUploadsState state();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.ManagedLedgerDigestUploadsInner object.
     * 
     * @return the inner object.
     */
    ManagedLedgerDigestUploadsInner innerModel();

    /**
     * The entirety of the ManagedLedgerDigestUploads definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The ManagedLedgerDigestUploads definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the ManagedLedgerDigestUploads definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the ManagedLedgerDigestUploads definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, managedInstanceName, databaseName.
             * 
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             * value from the Azure Resource Manager API or the portal.
             * @param managedInstanceName The name of the managed instance.
             * @param databaseName The name of the database.
             * @return the next definition stage.
             */
            WithCreate withExistingDatabase(String resourceGroupName, String managedInstanceName, String databaseName);
        }

        /**
         * The stage of the ManagedLedgerDigestUploads definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithDigestStorageEndpoint {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            ManagedLedgerDigestUploads create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ManagedLedgerDigestUploads create(Context context);
        }

        /**
         * The stage of the ManagedLedgerDigestUploads definition allowing to specify digestStorageEndpoint.
         */
        interface WithDigestStorageEndpoint {
            /**
             * Specifies the digestStorageEndpoint property: The digest storage endpoint, which must be either an Azure
             * blob storage endpoint or an URI for Azure Confidential Ledger..
             * 
             * @param digestStorageEndpoint The digest storage endpoint, which must be either an Azure blob storage
             * endpoint or an URI for Azure Confidential Ledger.
             * @return the next definition stage.
             */
            WithCreate withDigestStorageEndpoint(String digestStorageEndpoint);
        }
    }

    /**
     * Begins update for the ManagedLedgerDigestUploads resource.
     * 
     * @return the stage of resource update.
     */
    ManagedLedgerDigestUploads.Update update();

    /**
     * The template for ManagedLedgerDigestUploads update.
     */
    interface Update extends UpdateStages.WithDigestStorageEndpoint {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        ManagedLedgerDigestUploads apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ManagedLedgerDigestUploads apply(Context context);
    }

    /**
     * The ManagedLedgerDigestUploads update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the ManagedLedgerDigestUploads update allowing to specify digestStorageEndpoint.
         */
        interface WithDigestStorageEndpoint {
            /**
             * Specifies the digestStorageEndpoint property: The digest storage endpoint, which must be either an Azure
             * blob storage endpoint or an URI for Azure Confidential Ledger..
             * 
             * @param digestStorageEndpoint The digest storage endpoint, which must be either an Azure blob storage
             * endpoint or an URI for Azure Confidential Ledger.
             * @return the next definition stage.
             */
            Update withDigestStorageEndpoint(String digestStorageEndpoint);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    ManagedLedgerDigestUploads refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ManagedLedgerDigestUploads refresh(Context context);

    /**
     * Disables uploading ledger digests to an Azure Storage account or an Azure Confidential Ledger instance.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure SQL Database ledger digest upload settings.
     */
    ManagedLedgerDigestUploads disable();

    /**
     * Disables uploading ledger digests to an Azure Storage account or an Azure Confidential Ledger instance.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure SQL Database ledger digest upload settings.
     */
    ManagedLedgerDigestUploads disable(Context context);
}
