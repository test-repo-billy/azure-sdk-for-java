// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.HttpResponse;
import com.azure.core.management.exception.ManagementException;

/**
 * Exception thrown for an invalid response with Error information.
 */
public final class ErrorException extends ManagementException {
    /**
     * Initializes a new instance of the ErrorException class.
     * 
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public ErrorException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the ErrorException class.
     * 
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public ErrorException(String message, HttpResponse response, Error value) {
        super(message, response, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Error getValue() {
        return (Error) super.getValue();
    }
}
