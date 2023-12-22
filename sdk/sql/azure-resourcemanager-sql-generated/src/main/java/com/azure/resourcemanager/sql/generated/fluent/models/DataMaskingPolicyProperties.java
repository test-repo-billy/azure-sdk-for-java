// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.DataMaskingState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of a database data masking policy.
 */
@Fluent
public final class DataMaskingPolicyProperties {
    /*
     * The state of the data masking policy.
     */
    @JsonProperty(value = "dataMaskingState", required = true)
    private DataMaskingState dataMaskingState;

    /*
     * The list of the exempt principals. Specifies the semicolon-separated list of database users for which the data
     * masking policy does not apply. The specified users receive data results without masking for all of the database
     * queries.
     */
    @JsonProperty(value = "exemptPrincipals")
    private String exemptPrincipals;

    /*
     * The list of the application principals. This is a legacy parameter and is no longer used.
     */
    @JsonProperty(value = "applicationPrincipals", access = JsonProperty.Access.WRITE_ONLY)
    private String applicationPrincipals;

    /*
     * The masking level. This is a legacy parameter and is no longer used.
     */
    @JsonProperty(value = "maskingLevel", access = JsonProperty.Access.WRITE_ONLY)
    private String maskingLevel;

    /**
     * Creates an instance of DataMaskingPolicyProperties class.
     */
    public DataMaskingPolicyProperties() {
    }

    /**
     * Get the dataMaskingState property: The state of the data masking policy.
     * 
     * @return the dataMaskingState value.
     */
    public DataMaskingState dataMaskingState() {
        return this.dataMaskingState;
    }

    /**
     * Set the dataMaskingState property: The state of the data masking policy.
     * 
     * @param dataMaskingState the dataMaskingState value to set.
     * @return the DataMaskingPolicyProperties object itself.
     */
    public DataMaskingPolicyProperties withDataMaskingState(DataMaskingState dataMaskingState) {
        this.dataMaskingState = dataMaskingState;
        return this;
    }

    /**
     * Get the exemptPrincipals property: The list of the exempt principals. Specifies the semicolon-separated list of
     * database users for which the data masking policy does not apply. The specified users receive data results
     * without masking for all of the database queries.
     * 
     * @return the exemptPrincipals value.
     */
    public String exemptPrincipals() {
        return this.exemptPrincipals;
    }

    /**
     * Set the exemptPrincipals property: The list of the exempt principals. Specifies the semicolon-separated list of
     * database users for which the data masking policy does not apply. The specified users receive data results
     * without masking for all of the database queries.
     * 
     * @param exemptPrincipals the exemptPrincipals value to set.
     * @return the DataMaskingPolicyProperties object itself.
     */
    public DataMaskingPolicyProperties withExemptPrincipals(String exemptPrincipals) {
        this.exemptPrincipals = exemptPrincipals;
        return this;
    }

    /**
     * Get the applicationPrincipals property: The list of the application principals. This is a legacy parameter and
     * is no longer used.
     * 
     * @return the applicationPrincipals value.
     */
    public String applicationPrincipals() {
        return this.applicationPrincipals;
    }

    /**
     * Get the maskingLevel property: The masking level. This is a legacy parameter and is no longer used.
     * 
     * @return the maskingLevel value.
     */
    public String maskingLevel() {
        return this.maskingLevel;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataMaskingState() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property dataMaskingState in model DataMaskingPolicyProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataMaskingPolicyProperties.class);
}
