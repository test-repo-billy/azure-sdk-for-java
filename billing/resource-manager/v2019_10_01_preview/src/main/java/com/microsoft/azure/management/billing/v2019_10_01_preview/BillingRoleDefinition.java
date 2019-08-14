/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.BillingRoleDefinitionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.BillingManager;
import java.util.List;

/**
 * Type representing BillingRoleDefinition.
 */
public interface BillingRoleDefinition extends HasInner<BillingRoleDefinitionInner>, Indexable, Refreshable<BillingRoleDefinition>, HasManager<BillingManager> {
    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the roleName value.
     */
    String roleName();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the value value.
     */
    List<BillingPermissionsProperties> value();

}
