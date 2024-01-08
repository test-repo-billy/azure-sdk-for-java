// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedInstanceDtcInner;
import java.util.List;

/**
 * An immutable client-side representation of ManagedInstanceDtc.
 */
public interface ManagedInstanceDtc {
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
     * Gets the dtcEnabled property: Active status of managed instance DTC.
     * 
     * @return the dtcEnabled value.
     */
    Boolean dtcEnabled();

    /**
     * Gets the securitySettings property: Security settings of managed instance DTC.
     * 
     * @return the securitySettings value.
     */
    ManagedInstanceDtcSecuritySettings securitySettings();

    /**
     * Gets the externalDnsSuffixSearchList property: External dns suffix search list of managed instance DTC.
     * 
     * @return the externalDnsSuffixSearchList value.
     */
    List<String> externalDnsSuffixSearchList();

    /**
     * Gets the dtcHostnameDnsSuffix property: Host name dns suffix of managed instance DTC.
     * 
     * @return the dtcHostnameDnsSuffix value.
     */
    String dtcHostnameDnsSuffix();

    /**
     * Gets the provisioningState property: Provisioning state of managed instance DTC.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.ManagedInstanceDtcInner object.
     * 
     * @return the inner object.
     */
    ManagedInstanceDtcInner innerModel();

    /**
     * The entirety of the ManagedInstanceDtc definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The ManagedInstanceDtc definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the ManagedInstanceDtc definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the ManagedInstanceDtc definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, managedInstanceName.
             * 
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             * value from the Azure Resource Manager API or the portal.
             * @param managedInstanceName The name of the managed instance.
             * @return the next definition stage.
             */
            WithCreate withExistingManagedInstance(String resourceGroupName, String managedInstanceName);
        }

        /**
         * The stage of the ManagedInstanceDtc definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithDtcEnabled, DefinitionStages.WithSecuritySettings,
            DefinitionStages.WithExternalDnsSuffixSearchList {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            ManagedInstanceDtc create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ManagedInstanceDtc create(Context context);
        }

        /**
         * The stage of the ManagedInstanceDtc definition allowing to specify dtcEnabled.
         */
        interface WithDtcEnabled {
            /**
             * Specifies the dtcEnabled property: Active status of managed instance DTC..
             * 
             * @param dtcEnabled Active status of managed instance DTC.
             * @return the next definition stage.
             */
            WithCreate withDtcEnabled(Boolean dtcEnabled);
        }

        /**
         * The stage of the ManagedInstanceDtc definition allowing to specify securitySettings.
         */
        interface WithSecuritySettings {
            /**
             * Specifies the securitySettings property: Security settings of managed instance DTC..
             * 
             * @param securitySettings Security settings of managed instance DTC.
             * @return the next definition stage.
             */
            WithCreate withSecuritySettings(ManagedInstanceDtcSecuritySettings securitySettings);
        }

        /**
         * The stage of the ManagedInstanceDtc definition allowing to specify externalDnsSuffixSearchList.
         */
        interface WithExternalDnsSuffixSearchList {
            /**
             * Specifies the externalDnsSuffixSearchList property: External dns suffix search list of managed instance
             * DTC..
             * 
             * @param externalDnsSuffixSearchList External dns suffix search list of managed instance DTC.
             * @return the next definition stage.
             */
            WithCreate withExternalDnsSuffixSearchList(List<String> externalDnsSuffixSearchList);
        }
    }

    /**
     * Begins update for the ManagedInstanceDtc resource.
     * 
     * @return the stage of resource update.
     */
    ManagedInstanceDtc.Update update();

    /**
     * The template for ManagedInstanceDtc update.
     */
    interface Update extends UpdateStages.WithDtcEnabled, UpdateStages.WithSecuritySettings,
        UpdateStages.WithExternalDnsSuffixSearchList {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        ManagedInstanceDtc apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ManagedInstanceDtc apply(Context context);
    }

    /**
     * The ManagedInstanceDtc update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the ManagedInstanceDtc update allowing to specify dtcEnabled.
         */
        interface WithDtcEnabled {
            /**
             * Specifies the dtcEnabled property: Active status of managed instance DTC..
             * 
             * @param dtcEnabled Active status of managed instance DTC.
             * @return the next definition stage.
             */
            Update withDtcEnabled(Boolean dtcEnabled);
        }

        /**
         * The stage of the ManagedInstanceDtc update allowing to specify securitySettings.
         */
        interface WithSecuritySettings {
            /**
             * Specifies the securitySettings property: Security settings of managed instance DTC..
             * 
             * @param securitySettings Security settings of managed instance DTC.
             * @return the next definition stage.
             */
            Update withSecuritySettings(ManagedInstanceDtcSecuritySettings securitySettings);
        }

        /**
         * The stage of the ManagedInstanceDtc update allowing to specify externalDnsSuffixSearchList.
         */
        interface WithExternalDnsSuffixSearchList {
            /**
             * Specifies the externalDnsSuffixSearchList property: External dns suffix search list of managed instance
             * DTC..
             * 
             * @param externalDnsSuffixSearchList External dns suffix search list of managed instance DTC.
             * @return the next definition stage.
             */
            Update withExternalDnsSuffixSearchList(List<String> externalDnsSuffixSearchList);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    ManagedInstanceDtc refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ManagedInstanceDtc refresh(Context context);
}
