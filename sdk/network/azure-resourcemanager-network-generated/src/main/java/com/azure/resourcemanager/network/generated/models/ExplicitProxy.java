// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Explicit Proxy Settings in Firewall Policy.
 */
@Fluent
public final class ExplicitProxy {
    /*
     * When set to true, explicit proxy mode is enabled.
     */
    @JsonProperty(value = "enableExplicitProxy")
    private Boolean enableExplicitProxy;

    /*
     * Port number for explicit proxy http protocol, cannot be greater than 64000.
     */
    @JsonProperty(value = "httpPort")
    private Integer httpPort;

    /*
     * Port number for explicit proxy https protocol, cannot be greater than 64000.
     */
    @JsonProperty(value = "httpsPort")
    private Integer httpsPort;

    /*
     * When set to true, pac file port and url needs to be provided.
     */
    @JsonProperty(value = "enablePacFile")
    private Boolean enablePacFile;

    /*
     * Port number for firewall to serve PAC file.
     */
    @JsonProperty(value = "pacFilePort")
    private Integer pacFilePort;

    /*
     * SAS URL for PAC file.
     */
    @JsonProperty(value = "pacFile")
    private String pacFile;

    /**
     * Creates an instance of ExplicitProxy class.
     */
    public ExplicitProxy() {
    }

    /**
     * Get the enableExplicitProxy property: When set to true, explicit proxy mode is enabled.
     * 
     * @return the enableExplicitProxy value.
     */
    public Boolean enableExplicitProxy() {
        return this.enableExplicitProxy;
    }

    /**
     * Set the enableExplicitProxy property: When set to true, explicit proxy mode is enabled.
     * 
     * @param enableExplicitProxy the enableExplicitProxy value to set.
     * @return the ExplicitProxy object itself.
     */
    public ExplicitProxy withEnableExplicitProxy(Boolean enableExplicitProxy) {
        this.enableExplicitProxy = enableExplicitProxy;
        return this;
    }

    /**
     * Get the httpPort property: Port number for explicit proxy http protocol, cannot be greater than 64000.
     * 
     * @return the httpPort value.
     */
    public Integer httpPort() {
        return this.httpPort;
    }

    /**
     * Set the httpPort property: Port number for explicit proxy http protocol, cannot be greater than 64000.
     * 
     * @param httpPort the httpPort value to set.
     * @return the ExplicitProxy object itself.
     */
    public ExplicitProxy withHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
        return this;
    }

    /**
     * Get the httpsPort property: Port number for explicit proxy https protocol, cannot be greater than 64000.
     * 
     * @return the httpsPort value.
     */
    public Integer httpsPort() {
        return this.httpsPort;
    }

    /**
     * Set the httpsPort property: Port number for explicit proxy https protocol, cannot be greater than 64000.
     * 
     * @param httpsPort the httpsPort value to set.
     * @return the ExplicitProxy object itself.
     */
    public ExplicitProxy withHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }

    /**
     * Get the enablePacFile property: When set to true, pac file port and url needs to be provided.
     * 
     * @return the enablePacFile value.
     */
    public Boolean enablePacFile() {
        return this.enablePacFile;
    }

    /**
     * Set the enablePacFile property: When set to true, pac file port and url needs to be provided.
     * 
     * @param enablePacFile the enablePacFile value to set.
     * @return the ExplicitProxy object itself.
     */
    public ExplicitProxy withEnablePacFile(Boolean enablePacFile) {
        this.enablePacFile = enablePacFile;
        return this;
    }

    /**
     * Get the pacFilePort property: Port number for firewall to serve PAC file.
     * 
     * @return the pacFilePort value.
     */
    public Integer pacFilePort() {
        return this.pacFilePort;
    }

    /**
     * Set the pacFilePort property: Port number for firewall to serve PAC file.
     * 
     * @param pacFilePort the pacFilePort value to set.
     * @return the ExplicitProxy object itself.
     */
    public ExplicitProxy withPacFilePort(Integer pacFilePort) {
        this.pacFilePort = pacFilePort;
        return this;
    }

    /**
     * Get the pacFile property: SAS URL for PAC file.
     * 
     * @return the pacFile value.
     */
    public String pacFile() {
        return this.pacFile;
    }

    /**
     * Set the pacFile property: SAS URL for PAC file.
     * 
     * @param pacFile the pacFile value to set.
     * @return the ExplicitProxy object itself.
     */
    public ExplicitProxy withPacFile(String pacFile) {
        this.pacFile = pacFile;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
