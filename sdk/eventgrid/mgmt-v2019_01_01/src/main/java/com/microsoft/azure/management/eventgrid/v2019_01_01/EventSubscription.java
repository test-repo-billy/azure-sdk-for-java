/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2019_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.eventgrid.v2019_01_01.implementation.EventSubscriptionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventgrid.v2019_01_01.implementation.EventGridManager;
import java.util.List;

/**
 * Type representing EventSubscription.
 */
public interface EventSubscription extends HasInner<EventSubscriptionInner>, Indexable, Updatable<EventSubscription.Update>, Refreshable<EventSubscription>, HasManager<EventGridManager> {
    /**
     * @return the deadLetterDestination value.
     */
    DeadLetterDestination deadLetterDestination();

    /**
     * @return the destination value.
     */
    EventSubscriptionDestination destination();

    /**
     * @return the filter value.
     */
    EventSubscriptionFilter filter();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the labels value.
     */
    List<String> labels();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    EventSubscriptionProvisioningState provisioningState();

    /**
     * @return the retryPolicy value.
     */
    RetryPolicy retryPolicy();

    /**
     * @return the topic value.
     */
    String topic();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the EventSubscription definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithScope, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of EventSubscription definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a EventSubscription definition.
         */
        interface Blank extends WithScope {
        }

        /**
         * The stage of the eventsubscription definition allowing to specify Scope.
         */
        interface WithScope {
           /**
            * Specifies scope.
            * @param scope The identifier of the resource to which the event subscription needs to be created or updated. The scope can be a subscription, or a resource group, or a top level resource belonging to a resource provider namespace, or an EventGrid topic. For example, use '/subscriptions/{subscriptionId}/' for a subscription, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for a resource group, and '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}' for a resource, and '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/topics/{topicName}' for an EventGrid topic
            * @return the next definition stage
            */
            WithCreate withScope(String scope);
        }

        /**
         * The stage of the eventsubscription definition allowing to specify DeadLetterDestination.
         */
        interface WithDeadLetterDestination {
            /**
             * Specifies deadLetterDestination.
             * @param deadLetterDestination The DeadLetter destination of the event subscription
             * @return the next definition stage
             */
            WithCreate withDeadLetterDestination(DeadLetterDestination deadLetterDestination);
        }

        /**
         * The stage of the eventsubscription definition allowing to specify Destination.
         */
        interface WithDestination {
            /**
             * Specifies destination.
             * @param destination Information about the destination where events have to be delivered for the event subscription
             * @return the next definition stage
             */
            WithCreate withDestination(EventSubscriptionDestination destination);
        }

        /**
         * The stage of the eventsubscription definition allowing to specify Filter.
         */
        interface WithFilter {
            /**
             * Specifies filter.
             * @param filter Information about the filter for the event subscription
             * @return the next definition stage
             */
            WithCreate withFilter(EventSubscriptionFilter filter);
        }

        /**
         * The stage of the eventsubscription definition allowing to specify Labels.
         */
        interface WithLabels {
            /**
             * Specifies labels.
             * @param labels List of user defined labels
             * @return the next definition stage
             */
            WithCreate withLabels(List<String> labels);
        }

        /**
         * The stage of the eventsubscription definition allowing to specify RetryPolicy.
         */
        interface WithRetryPolicy {
            /**
             * Specifies retryPolicy.
             * @param retryPolicy The retry policy for events. This can be used to configure maximum number of delivery attempts and time to live for events
             * @return the next definition stage
             */
            WithCreate withRetryPolicy(RetryPolicy retryPolicy);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<EventSubscription>, DefinitionStages.WithDeadLetterDestination, DefinitionStages.WithDestination, DefinitionStages.WithFilter, DefinitionStages.WithLabels, DefinitionStages.WithRetryPolicy {
        }
    }
    /**
     * The template for a EventSubscription update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<EventSubscription>, UpdateStages.WithDeadLetterDestination, UpdateStages.WithDestination, UpdateStages.WithFilter, UpdateStages.WithLabels, UpdateStages.WithRetryPolicy {
    }

    /**
     * Grouping of EventSubscription update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the eventsubscription update allowing to specify DeadLetterDestination.
         */
        interface WithDeadLetterDestination {
            /**
             * Specifies deadLetterDestination.
             * @param deadLetterDestination The DeadLetter destination of the event subscription
             * @return the next update stage
             */
            Update withDeadLetterDestination(DeadLetterDestination deadLetterDestination);
        }

        /**
         * The stage of the eventsubscription update allowing to specify Destination.
         */
        interface WithDestination {
            /**
             * Specifies destination.
             * @param destination Information about the destination where events have to be delivered for the event subscription
             * @return the next update stage
             */
            Update withDestination(EventSubscriptionDestination destination);
        }

        /**
         * The stage of the eventsubscription update allowing to specify Filter.
         */
        interface WithFilter {
            /**
             * Specifies filter.
             * @param filter Information about the filter for the event subscription
             * @return the next update stage
             */
            Update withFilter(EventSubscriptionFilter filter);
        }

        /**
         * The stage of the eventsubscription update allowing to specify Labels.
         */
        interface WithLabels {
            /**
             * Specifies labels.
             * @param labels List of user defined labels
             * @return the next update stage
             */
            Update withLabels(List<String> labels);
        }

        /**
         * The stage of the eventsubscription update allowing to specify RetryPolicy.
         */
        interface WithRetryPolicy {
            /**
             * Specifies retryPolicy.
             * @param retryPolicy The retry policy for events. This can be used to configure maximum number of delivery attempts and time to live for events
             * @return the next update stage
             */
            Update withRetryPolicy(RetryPolicy retryPolicy);
        }

    }
}
