/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.BillingProfileInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.BillingManager;
import java.util.List;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.InvoiceSectionInner;

/**
 * Type representing BillingProfile.
 */
public interface BillingProfile extends HasInner<BillingProfileInner>, Indexable, Refreshable<BillingProfile>, Updatable<BillingProfile.Update>, HasManager<BillingManager> {
    /**
     * @return the address value.
     */
    AddressDetails address();

    /**
     * @return the currency value.
     */
    String currency();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the enabledAzurePlans value.
     */
    List<AzurePlan> enabledAzurePlans();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the invoiceDay value.
     */
    Integer invoiceDay();

    /**
     * @return the invoiceEmailOptIn value.
     */
    Boolean invoiceEmailOptIn();

    /**
     * @return the invoiceSections value.
     */
    List<InvoiceSection> invoiceSections();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the poNumber value.
     */
    String poNumber();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the BillingProfile definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithBillingAccount, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of BillingProfile definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a BillingProfile definition.
         */
        interface Blank extends WithBillingAccount {
        }

        /**
         * The stage of the billingprofile definition allowing to specify BillingAccount.
         */
        interface WithBillingAccount {
           /**
            * Specifies billingAccountName.
            * @param billingAccountName billing Account Id
            * @return the next definition stage
            */
            WithCreate withExistingBillingAccount(String billingAccountName);
        }

        /**
         * The stage of the billingprofile definition allowing to specify Address.
         */
        interface WithAddress {
            /**
             * Specifies address.
             * @param address Billing address
             * @return the next definition stage
             */
            WithCreate withAddress(AddressDetails address);
        }

        /**
         * The stage of the billingprofile definition allowing to specify DisplayName.
         */
        interface WithDisplayName {
            /**
             * Specifies displayName.
             * @param displayName The billing profile name
             * @return the next definition stage
             */
            WithCreate withDisplayName(String displayName);
        }

        /**
         * The stage of the billingprofile definition allowing to specify EnabledAzurePlans.
         */
        interface WithEnabledAzurePlans {
            /**
             * Specifies enabledAzurePlans.
             * @param enabledAzurePlans Enabled azure plans for this billing profile
             * @return the next definition stage
             */
            WithCreate withEnabledAzurePlans(List<AzurePlan> enabledAzurePlans);
        }

        /**
         * The stage of the billingprofile definition allowing to specify InvoiceEmailOptIn.
         */
        interface WithInvoiceEmailOptIn {
            /**
             * Specifies invoiceEmailOptIn.
             * @param invoiceEmailOptIn If the billing profile is opted in to receive invoices via email
             * @return the next definition stage
             */
            WithCreate withInvoiceEmailOptIn(Boolean invoiceEmailOptIn);
        }

        /**
         * The stage of the billingprofile definition allowing to specify PoNumber.
         */
        interface WithPoNumber {
            /**
             * Specifies poNumber.
             * @param poNumber Purchase order number
             * @return the next definition stage
             */
            WithCreate withPoNumber(String poNumber);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<BillingProfile>, DefinitionStages.WithAddress, DefinitionStages.WithDisplayName, DefinitionStages.WithEnabledAzurePlans, DefinitionStages.WithInvoiceEmailOptIn, DefinitionStages.WithPoNumber {
        }
    }
    /**
     * The template for a BillingProfile update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<BillingProfile>, UpdateStages.WithAddress, UpdateStages.WithDisplayName, UpdateStages.WithEnabledAzurePlans, UpdateStages.WithInvoiceSections, UpdateStages.WithPoNumber {
    }

    /**
     * Grouping of BillingProfile update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the billingprofile update allowing to specify Address.
         */
        interface WithAddress {
            /**
             * Specifies address.
             * @param address Billing address
             * @return the next update stage
             */
            Update withAddress(AddressDetails address);
        }

        /**
         * The stage of the billingprofile update allowing to specify DisplayName.
         */
        interface WithDisplayName {
            /**
             * Specifies displayName.
             * @param displayName The billing profile name
             * @return the next update stage
             */
            Update withDisplayName(String displayName);
        }

        /**
         * The stage of the billingprofile update allowing to specify EnabledAzurePlans.
         */
        interface WithEnabledAzurePlans {
            /**
             * Specifies enabledAzurePlans.
             * @param enabledAzurePlans Information about the enabled azure plans
             * @return the next update stage
             */
            Update withEnabledAzurePlans(List<AzurePlan> enabledAzurePlans);
        }

        /**
         * The stage of the billingprofile update allowing to specify InvoiceSections.
         */
        interface WithInvoiceSections {
            /**
             * Specifies invoiceSections.
             * @param invoiceSections The invoice sections associated to the billing profile
             * @return the next update stage
             */
            Update withInvoiceSections(List<InvoiceSectionInner> invoiceSections);
        }

        /**
         * The stage of the billingprofile update allowing to specify PoNumber.
         */
        interface WithPoNumber {
            /**
             * Specifies poNumber.
             * @param poNumber Purchase order number
             * @return the next update stage
             */
            Update withPoNumber(String poNumber);
        }

    }
}
