// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.fluent.models.FirewallRuleInner;

/**
 * An immutable client-side representation of FirewallRule.
 */
public interface FirewallRule {
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
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: The provisioning state of the firewall rule.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the startIpAddress property: The start IP address of the mongo cluster firewall rule. Must be IPv4 format.
     * 
     * @return the startIpAddress value.
     */
    String startIpAddress();

    /**
     * Gets the endIpAddress property: The end IP address of the mongo cluster firewall rule. Must be IPv4 format.
     * 
     * @return the endIpAddress value.
     */
    String endIpAddress();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.cosmos.generated.fluent.models.FirewallRuleInner object.
     * 
     * @return the inner object.
     */
    FirewallRuleInner innerModel();

    /**
     * The entirety of the FirewallRule definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithParentResource,
        DefinitionStages.WithStartIpAddress, DefinitionStages.WithEndIpAddress, DefinitionStages.WithCreate {
    }

    /**
     * The FirewallRule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the FirewallRule definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the FirewallRule definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, mongoClusterName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param mongoClusterName The name of the mongo cluster.
             * @return the next definition stage.
             */
            WithStartIpAddress withExistingMongoCluster(String resourceGroupName, String mongoClusterName);
        }

        /**
         * The stage of the FirewallRule definition allowing to specify startIpAddress.
         */
        interface WithStartIpAddress {
            /**
             * Specifies the startIpAddress property: The start IP address of the mongo cluster firewall rule. Must be
             * IPv4 format..
             * 
             * @param startIpAddress The start IP address of the mongo cluster firewall rule. Must be IPv4 format.
             * @return the next definition stage.
             */
            WithEndIpAddress withStartIpAddress(String startIpAddress);
        }

        /**
         * The stage of the FirewallRule definition allowing to specify endIpAddress.
         */
        interface WithEndIpAddress {
            /**
             * Specifies the endIpAddress property: The end IP address of the mongo cluster firewall rule. Must be IPv4
             * format..
             * 
             * @param endIpAddress The end IP address of the mongo cluster firewall rule. Must be IPv4 format.
             * @return the next definition stage.
             */
            WithCreate withEndIpAddress(String endIpAddress);
        }

        /**
         * The stage of the FirewallRule definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            FirewallRule create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            FirewallRule create(Context context);
        }
    }

    /**
     * Begins update for the FirewallRule resource.
     * 
     * @return the stage of resource update.
     */
    FirewallRule.Update update();

    /**
     * The template for FirewallRule update.
     */
    interface Update extends UpdateStages.WithStartIpAddress, UpdateStages.WithEndIpAddress {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        FirewallRule apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        FirewallRule apply(Context context);
    }

    /**
     * The FirewallRule update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the FirewallRule update allowing to specify startIpAddress.
         */
        interface WithStartIpAddress {
            /**
             * Specifies the startIpAddress property: The start IP address of the mongo cluster firewall rule. Must be
             * IPv4 format..
             * 
             * @param startIpAddress The start IP address of the mongo cluster firewall rule. Must be IPv4 format.
             * @return the next definition stage.
             */
            Update withStartIpAddress(String startIpAddress);
        }

        /**
         * The stage of the FirewallRule update allowing to specify endIpAddress.
         */
        interface WithEndIpAddress {
            /**
             * Specifies the endIpAddress property: The end IP address of the mongo cluster firewall rule. Must be IPv4
             * format..
             * 
             * @param endIpAddress The end IP address of the mongo cluster firewall rule. Must be IPv4 format.
             * @return the next definition stage.
             */
            Update withEndIpAddress(String endIpAddress);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    FirewallRule refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    FirewallRule refresh(Context context);
}
