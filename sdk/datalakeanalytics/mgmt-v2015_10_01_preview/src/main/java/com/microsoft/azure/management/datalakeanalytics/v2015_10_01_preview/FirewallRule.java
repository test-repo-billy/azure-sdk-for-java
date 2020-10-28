/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.implementation.FirewallRuleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.implementation.DataLakeAnalyticsManager;

/**
 * Type representing FirewallRule.
 */
public interface FirewallRule extends HasInner<FirewallRuleInner>, Indexable, Refreshable<FirewallRule>, Updatable<FirewallRule.Update>, HasManager<DataLakeAnalyticsManager> {
    /**
     * @return the endIpAddress value.
     */
    String endIpAddress();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the startIpAddress value.
     */
    String startIpAddress();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the FirewallRule definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithAccount, DefinitionStages.WithEndIpAddress, DefinitionStages.WithStartIpAddress, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of FirewallRule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a FirewallRule definition.
         */
        interface Blank extends WithAccount {
        }

        /**
         * The stage of the firewallrule definition allowing to specify Account.
         */
        interface WithAccount {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName The name of the Azure resource group
            * @param accountName The name of the Data Lake Analytics account
            * @return the next definition stage
            */
            WithEndIpAddress withExistingAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the firewallrule definition allowing to specify EndIpAddress.
         */
        interface WithEndIpAddress {
           /**
            * Specifies endIpAddress.
            * @param endIpAddress The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol
            * @return the next definition stage
            */
            WithStartIpAddress withEndIpAddress(String endIpAddress);
        }

        /**
         * The stage of the firewallrule definition allowing to specify StartIpAddress.
         */
        interface WithStartIpAddress {
           /**
            * Specifies startIpAddress.
            * @param startIpAddress The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol
            * @return the next definition stage
            */
            WithCreate withStartIpAddress(String startIpAddress);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<FirewallRule> {
        }
    }
    /**
     * The template for a FirewallRule update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<FirewallRule>, UpdateStages.WithEndIpAddress, UpdateStages.WithStartIpAddress {
    }

    /**
     * Grouping of FirewallRule update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the firewallrule update allowing to specify EndIpAddress.
         */
        interface WithEndIpAddress {
            /**
             * Specifies endIpAddress.
             * @param endIpAddress The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol
             * @return the next update stage
             */
            Update withEndIpAddress(String endIpAddress);
        }

        /**
         * The stage of the firewallrule update allowing to specify StartIpAddress.
         */
        interface WithStartIpAddress {
            /**
             * Specifies startIpAddress.
             * @param startIpAddress The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol
             * @return the next update stage
             */
            Update withStartIpAddress(String startIpAddress);
        }

    }
}
