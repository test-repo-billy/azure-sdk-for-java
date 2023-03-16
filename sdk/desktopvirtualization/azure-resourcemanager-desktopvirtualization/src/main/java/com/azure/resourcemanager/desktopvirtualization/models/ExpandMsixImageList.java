// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ExpandMsixImageInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * ExpandMsixImageList
 *
 * <p>List of MSIX package properties retrieved from MSIX Image expansion.
 */
@Fluent
public final class ExpandMsixImageList {
    /*
     * List of MSIX package properties from give MSIX Image.
     */
    @JsonProperty(value = "value")
    private List<ExpandMsixImageInner> value;

    /*
     * Link to the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of ExpandMsixImageList class. */
    public ExpandMsixImageList() {
    }

    /**
     * Get the value property: List of MSIX package properties from give MSIX Image.
     *
     * @return the value value.
     */
    public List<ExpandMsixImageInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of MSIX package properties from give MSIX Image.
     *
     * @param value the value value to set.
     * @return the ExpandMsixImageList object itself.
     */
    public ExpandMsixImageList withValue(List<ExpandMsixImageInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
