// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.resourcemanager.sql.generated.fluent.models.SecurityEventInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of SecurityEvent.
 */
public interface SecurityEvent {
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
     * Gets the eventTime property: The time when the security event occurred.
     * 
     * @return the eventTime value.
     */
    OffsetDateTime eventTime();

    /**
     * Gets the securityEventType property: The type of the security event.
     * 
     * @return the securityEventType value.
     */
    SecurityEventType securityEventType();

    /**
     * Gets the subscription property: The subscription name.
     * 
     * @return the subscription value.
     */
    String subscription();

    /**
     * Gets the server property: The server name.
     * 
     * @return the server value.
     */
    String server();

    /**
     * Gets the database property: The database name.
     * 
     * @return the database value.
     */
    String database();

    /**
     * Gets the clientIp property: The IP address of the client who executed the statement.
     * 
     * @return the clientIp value.
     */
    String clientIp();

    /**
     * Gets the applicationName property: The application used to execute the statement.
     * 
     * @return the applicationName value.
     */
    String applicationName();

    /**
     * Gets the principalName property: The principal user who executed the statement.
     * 
     * @return the principalName value.
     */
    String principalName();

    /**
     * Gets the securityEventSqlInjectionAdditionalProperties property: The sql injection additional properties,
     * populated only if the type of the security event is sql injection.
     * 
     * @return the securityEventSqlInjectionAdditionalProperties value.
     */
    SecurityEventSqlInjectionAdditionalProperties securityEventSqlInjectionAdditionalProperties();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.SecurityEventInner object.
     * 
     * @return the inner object.
     */
    SecurityEventInner innerModel();
}
