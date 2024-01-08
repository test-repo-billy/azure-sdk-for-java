// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.FirewallPacketCaptureParametersFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Azure Firewall Packet Capture Parameters resource.
 */
@Fluent
public final class FirewallPacketCaptureParameters extends SubResource {
    /*
     * Properties of the azure firewall.
     */
    @JsonProperty(value = "properties")
    private FirewallPacketCaptureParametersFormat innerProperties;

    /**
     * Creates an instance of FirewallPacketCaptureParameters class.
     */
    public FirewallPacketCaptureParameters() {
    }

    /**
     * Get the innerProperties property: Properties of the azure firewall.
     * 
     * @return the innerProperties value.
     */
    private FirewallPacketCaptureParametersFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirewallPacketCaptureParameters withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the durationInSeconds property: Duration of packet capture in seconds.
     * 
     * @return the durationInSeconds value.
     */
    public Integer durationInSeconds() {
        return this.innerProperties() == null ? null : this.innerProperties().durationInSeconds();
    }

    /**
     * Set the durationInSeconds property: Duration of packet capture in seconds.
     * 
     * @param durationInSeconds the durationInSeconds value to set.
     * @return the FirewallPacketCaptureParameters object itself.
     */
    public FirewallPacketCaptureParameters withDurationInSeconds(Integer durationInSeconds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallPacketCaptureParametersFormat();
        }
        this.innerProperties().withDurationInSeconds(durationInSeconds);
        return this;
    }

    /**
     * Get the numberOfPacketsToCapture property: Number of packets to be captured.
     * 
     * @return the numberOfPacketsToCapture value.
     */
    public Integer numberOfPacketsToCapture() {
        return this.innerProperties() == null ? null : this.innerProperties().numberOfPacketsToCapture();
    }

    /**
     * Set the numberOfPacketsToCapture property: Number of packets to be captured.
     * 
     * @param numberOfPacketsToCapture the numberOfPacketsToCapture value to set.
     * @return the FirewallPacketCaptureParameters object itself.
     */
    public FirewallPacketCaptureParameters withNumberOfPacketsToCapture(Integer numberOfPacketsToCapture) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallPacketCaptureParametersFormat();
        }
        this.innerProperties().withNumberOfPacketsToCapture(numberOfPacketsToCapture);
        return this;
    }

    /**
     * Get the sasUrl property: Upload capture location.
     * 
     * @return the sasUrl value.
     */
    public String sasUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().sasUrl();
    }

    /**
     * Set the sasUrl property: Upload capture location.
     * 
     * @param sasUrl the sasUrl value to set.
     * @return the FirewallPacketCaptureParameters object itself.
     */
    public FirewallPacketCaptureParameters withSasUrl(String sasUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallPacketCaptureParametersFormat();
        }
        this.innerProperties().withSasUrl(sasUrl);
        return this;
    }

    /**
     * Get the fileName property: Name of file to be uploaded to sasURL.
     * 
     * @return the fileName value.
     */
    public String fileName() {
        return this.innerProperties() == null ? null : this.innerProperties().fileName();
    }

    /**
     * Set the fileName property: Name of file to be uploaded to sasURL.
     * 
     * @param fileName the fileName value to set.
     * @return the FirewallPacketCaptureParameters object itself.
     */
    public FirewallPacketCaptureParameters withFileName(String fileName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallPacketCaptureParametersFormat();
        }
        this.innerProperties().withFileName(fileName);
        return this;
    }

    /**
     * Get the protocol property: The protocol of packets to capture.
     * 
     * @return the protocol value.
     */
    public AzureFirewallNetworkRuleProtocol protocol() {
        return this.innerProperties() == null ? null : this.innerProperties().protocol();
    }

    /**
     * Set the protocol property: The protocol of packets to capture.
     * 
     * @param protocol the protocol value to set.
     * @return the FirewallPacketCaptureParameters object itself.
     */
    public FirewallPacketCaptureParameters withProtocol(AzureFirewallNetworkRuleProtocol protocol) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallPacketCaptureParametersFormat();
        }
        this.innerProperties().withProtocol(protocol);
        return this;
    }

    /**
     * Get the flags property: The tcp-flag type to be captured. Used with protocol TCP.
     * 
     * @return the flags value.
     */
    public List<AzureFirewallPacketCaptureFlags> flags() {
        return this.innerProperties() == null ? null : this.innerProperties().flags();
    }

    /**
     * Set the flags property: The tcp-flag type to be captured. Used with protocol TCP.
     * 
     * @param flags the flags value to set.
     * @return the FirewallPacketCaptureParameters object itself.
     */
    public FirewallPacketCaptureParameters withFlags(List<AzureFirewallPacketCaptureFlags> flags) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallPacketCaptureParametersFormat();
        }
        this.innerProperties().withFlags(flags);
        return this;
    }

    /**
     * Get the filters property: Rules to filter packet captures.
     * 
     * @return the filters value.
     */
    public List<AzureFirewallPacketCaptureRule> filters() {
        return this.innerProperties() == null ? null : this.innerProperties().filters();
    }

    /**
     * Set the filters property: Rules to filter packet captures.
     * 
     * @param filters the filters value to set.
     * @return the FirewallPacketCaptureParameters object itself.
     */
    public FirewallPacketCaptureParameters withFilters(List<AzureFirewallPacketCaptureRule> filters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallPacketCaptureParametersFormat();
        }
        this.innerProperties().withFilters(filters);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
