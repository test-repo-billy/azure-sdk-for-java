/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DW Copy Command settings.
 */
public class DWCopyCommandSettings {
    /**
     * Specifies the default values for each target column in SQL DW. The
     * default values in the property overwrite the DEFAULT constraint set in
     * the DB, and identity column cannot have a default value. Type: array of
     * objects (or Expression with resultType array of objects).
     */
    @JsonProperty(value = "defaultValues")
    private List<DWCopyCommandDefaultValue> defaultValues;

    /**
     * Additional options directly passed to SQL DW in Copy Command. Type: key
     * value pairs (value should be string type) (or Expression with resultType
     * object). Example: "additionalOptions": { "MAXERRORS": "1000",
     * "DATEFORMAT": "'ymd'" }.
     */
    @JsonProperty(value = "additionalOptions")
    private Map<String, String> additionalOptions;

    /**
     * Get specifies the default values for each target column in SQL DW. The default values in the property overwrite the DEFAULT constraint set in the DB, and identity column cannot have a default value. Type: array of objects (or Expression with resultType array of objects).
     *
     * @return the defaultValues value
     */
    public List<DWCopyCommandDefaultValue> defaultValues() {
        return this.defaultValues;
    }

    /**
     * Set specifies the default values for each target column in SQL DW. The default values in the property overwrite the DEFAULT constraint set in the DB, and identity column cannot have a default value. Type: array of objects (or Expression with resultType array of objects).
     *
     * @param defaultValues the defaultValues value to set
     * @return the DWCopyCommandSettings object itself.
     */
    public DWCopyCommandSettings withDefaultValues(List<DWCopyCommandDefaultValue> defaultValues) {
        this.defaultValues = defaultValues;
        return this;
    }

    /**
     * Get additional options directly passed to SQL DW in Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: "additionalOptions": { "MAXERRORS": "1000", "DATEFORMAT": "'ymd'" }.
     *
     * @return the additionalOptions value
     */
    public Map<String, String> additionalOptions() {
        return this.additionalOptions;
    }

    /**
     * Set additional options directly passed to SQL DW in Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: "additionalOptions": { "MAXERRORS": "1000", "DATEFORMAT": "'ymd'" }.
     *
     * @param additionalOptions the additionalOptions value to set
     * @return the DWCopyCommandSettings object itself.
     */
    public DWCopyCommandSettings withAdditionalOptions(Map<String, String> additionalOptions) {
        this.additionalOptions = additionalOptions;
        return this;
    }

}
