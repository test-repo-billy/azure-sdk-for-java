// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a connection monitor test configuration.
 */
@Fluent
public final class ConnectionMonitorTestConfiguration {
    /*
     * The name of the connection monitor test configuration.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The frequency of test evaluation, in seconds.
     */
    @JsonProperty(value = "testFrequencySec")
    private Integer testFrequencySec;

    /*
     * The protocol to use in test evaluation.
     */
    @JsonProperty(value = "protocol", required = true)
    private ConnectionMonitorTestConfigurationProtocol protocol;

    /*
     * The preferred IP version to use in test evaluation. The connection monitor may choose to use a different version
     * depending on other parameters.
     */
    @JsonProperty(value = "preferredIPVersion")
    private PreferredIpVersion preferredIpVersion;

    /*
     * The parameters used to perform test evaluation over HTTP.
     */
    @JsonProperty(value = "httpConfiguration")
    private ConnectionMonitorHttpConfiguration httpConfiguration;

    /*
     * The parameters used to perform test evaluation over TCP.
     */
    @JsonProperty(value = "tcpConfiguration")
    private ConnectionMonitorTcpConfiguration tcpConfiguration;

    /*
     * The parameters used to perform test evaluation over ICMP.
     */
    @JsonProperty(value = "icmpConfiguration")
    private ConnectionMonitorIcmpConfiguration icmpConfiguration;

    /*
     * The threshold for declaring a test successful.
     */
    @JsonProperty(value = "successThreshold")
    private ConnectionMonitorSuccessThreshold successThreshold;

    /**
     * Creates an instance of ConnectionMonitorTestConfiguration class.
     */
    public ConnectionMonitorTestConfiguration() {
    }

    /**
     * Get the name property: The name of the connection monitor test configuration.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the connection monitor test configuration.
     * 
     * @param name the name value to set.
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the testFrequencySec property: The frequency of test evaluation, in seconds.
     * 
     * @return the testFrequencySec value.
     */
    public Integer testFrequencySec() {
        return this.testFrequencySec;
    }

    /**
     * Set the testFrequencySec property: The frequency of test evaluation, in seconds.
     * 
     * @param testFrequencySec the testFrequencySec value to set.
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withTestFrequencySec(Integer testFrequencySec) {
        this.testFrequencySec = testFrequencySec;
        return this;
    }

    /**
     * Get the protocol property: The protocol to use in test evaluation.
     * 
     * @return the protocol value.
     */
    public ConnectionMonitorTestConfigurationProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The protocol to use in test evaluation.
     * 
     * @param protocol the protocol value to set.
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withProtocol(ConnectionMonitorTestConfigurationProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the preferredIpVersion property: The preferred IP version to use in test evaluation. The connection monitor
     * may choose to use a different version depending on other parameters.
     * 
     * @return the preferredIpVersion value.
     */
    public PreferredIpVersion preferredIpVersion() {
        return this.preferredIpVersion;
    }

    /**
     * Set the preferredIpVersion property: The preferred IP version to use in test evaluation. The connection monitor
     * may choose to use a different version depending on other parameters.
     * 
     * @param preferredIpVersion the preferredIpVersion value to set.
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withPreferredIpVersion(PreferredIpVersion preferredIpVersion) {
        this.preferredIpVersion = preferredIpVersion;
        return this;
    }

    /**
     * Get the httpConfiguration property: The parameters used to perform test evaluation over HTTP.
     * 
     * @return the httpConfiguration value.
     */
    public ConnectionMonitorHttpConfiguration httpConfiguration() {
        return this.httpConfiguration;
    }

    /**
     * Set the httpConfiguration property: The parameters used to perform test evaluation over HTTP.
     * 
     * @param httpConfiguration the httpConfiguration value to set.
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration
        withHttpConfiguration(ConnectionMonitorHttpConfiguration httpConfiguration) {
        this.httpConfiguration = httpConfiguration;
        return this;
    }

    /**
     * Get the tcpConfiguration property: The parameters used to perform test evaluation over TCP.
     * 
     * @return the tcpConfiguration value.
     */
    public ConnectionMonitorTcpConfiguration tcpConfiguration() {
        return this.tcpConfiguration;
    }

    /**
     * Set the tcpConfiguration property: The parameters used to perform test evaluation over TCP.
     * 
     * @param tcpConfiguration the tcpConfiguration value to set.
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withTcpConfiguration(ConnectionMonitorTcpConfiguration tcpConfiguration) {
        this.tcpConfiguration = tcpConfiguration;
        return this;
    }

    /**
     * Get the icmpConfiguration property: The parameters used to perform test evaluation over ICMP.
     * 
     * @return the icmpConfiguration value.
     */
    public ConnectionMonitorIcmpConfiguration icmpConfiguration() {
        return this.icmpConfiguration;
    }

    /**
     * Set the icmpConfiguration property: The parameters used to perform test evaluation over ICMP.
     * 
     * @param icmpConfiguration the icmpConfiguration value to set.
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration
        withIcmpConfiguration(ConnectionMonitorIcmpConfiguration icmpConfiguration) {
        this.icmpConfiguration = icmpConfiguration;
        return this;
    }

    /**
     * Get the successThreshold property: The threshold for declaring a test successful.
     * 
     * @return the successThreshold value.
     */
    public ConnectionMonitorSuccessThreshold successThreshold() {
        return this.successThreshold;
    }

    /**
     * Set the successThreshold property: The threshold for declaring a test successful.
     * 
     * @param successThreshold the successThreshold value to set.
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withSuccessThreshold(ConnectionMonitorSuccessThreshold successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property name in model ConnectionMonitorTestConfiguration"));
        }
        if (protocol() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property protocol in model ConnectionMonitorTestConfiguration"));
        }
        if (httpConfiguration() != null) {
            httpConfiguration().validate();
        }
        if (tcpConfiguration() != null) {
            tcpConfiguration().validate();
        }
        if (icmpConfiguration() != null) {
            icmpConfiguration().validate();
        }
        if (successThreshold() != null) {
            successThreshold().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ConnectionMonitorTestConfiguration.class);
}
