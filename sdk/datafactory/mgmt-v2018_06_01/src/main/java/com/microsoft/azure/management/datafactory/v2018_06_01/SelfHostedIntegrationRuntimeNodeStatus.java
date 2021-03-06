/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SelfHostedIntegrationRuntimeNodeStatus.
 */
public final class SelfHostedIntegrationRuntimeNodeStatus extends ExpandableStringEnum<SelfHostedIntegrationRuntimeNodeStatus> {
    /** Static value NeedRegistration for SelfHostedIntegrationRuntimeNodeStatus. */
    public static final SelfHostedIntegrationRuntimeNodeStatus NEED_REGISTRATION = fromString("NeedRegistration");

    /** Static value Online for SelfHostedIntegrationRuntimeNodeStatus. */
    public static final SelfHostedIntegrationRuntimeNodeStatus ONLINE = fromString("Online");

    /** Static value Limited for SelfHostedIntegrationRuntimeNodeStatus. */
    public static final SelfHostedIntegrationRuntimeNodeStatus LIMITED = fromString("Limited");

    /** Static value Offline for SelfHostedIntegrationRuntimeNodeStatus. */
    public static final SelfHostedIntegrationRuntimeNodeStatus OFFLINE = fromString("Offline");

    /** Static value Upgrading for SelfHostedIntegrationRuntimeNodeStatus. */
    public static final SelfHostedIntegrationRuntimeNodeStatus UPGRADING = fromString("Upgrading");

    /** Static value Initializing for SelfHostedIntegrationRuntimeNodeStatus. */
    public static final SelfHostedIntegrationRuntimeNodeStatus INITIALIZING = fromString("Initializing");

    /** Static value InitializeFailed for SelfHostedIntegrationRuntimeNodeStatus. */
    public static final SelfHostedIntegrationRuntimeNodeStatus INITIALIZE_FAILED = fromString("InitializeFailed");

    /**
     * Creates or finds a SelfHostedIntegrationRuntimeNodeStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding SelfHostedIntegrationRuntimeNodeStatus
     */
    @JsonCreator
    public static SelfHostedIntegrationRuntimeNodeStatus fromString(String name) {
        return fromString(name, SelfHostedIntegrationRuntimeNodeStatus.class);
    }

    /**
     * @return known SelfHostedIntegrationRuntimeNodeStatus values
     */
    public static Collection<SelfHostedIntegrationRuntimeNodeStatus> values() {
        return values(SelfHostedIntegrationRuntimeNodeStatus.class);
    }
}
