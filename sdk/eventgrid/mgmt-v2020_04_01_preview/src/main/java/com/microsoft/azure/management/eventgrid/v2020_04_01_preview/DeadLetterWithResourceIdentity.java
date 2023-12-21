/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about the deadletter destination with resource identity.
 */
public class DeadLetterWithResourceIdentity {
    /**
     * The identity to use when dead-lettering events.
     */
    @JsonProperty(value = "identity")
    private EventSubscriptionIdentity identity;

    /**
     * Information about the destination where events have to be delivered for
     * the event subscription.
     * Uses the managed identity setup on the parent resource (namely, topic or
     * domain) to acquire the authentication tokens being used during delivery
     * / dead-lettering.
     */
    @JsonProperty(value = "deadLetterDestination")
    private DeadLetterDestination deadLetterDestination;

    /**
     * Get the identity to use when dead-lettering events.
     *
     * @return the identity value
     */
    public EventSubscriptionIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity to use when dead-lettering events.
     *
     * @param identity the identity value to set
     * @return the DeadLetterWithResourceIdentity object itself.
     */
    public DeadLetterWithResourceIdentity withIdentity(EventSubscriptionIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get information about the destination where events have to be delivered for the event subscription.
     Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     *
     * @return the deadLetterDestination value
     */
    public DeadLetterDestination deadLetterDestination() {
        return this.deadLetterDestination;
    }

    /**
     * Set information about the destination where events have to be delivered for the event subscription.
     Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     *
     * @param deadLetterDestination the deadLetterDestination value to set
     * @return the DeadLetterWithResourceIdentity object itself.
     */
    public DeadLetterWithResourceIdentity withDeadLetterDestination(DeadLetterDestination deadLetterDestination) {
        this.deadLetterDestination = deadLetterDestination;
        return this;
    }

}
