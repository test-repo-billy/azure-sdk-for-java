/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.mediaservices.v2018_07_01.EnvelopeEncryption;
import com.microsoft.azure.management.mediaservices.v2018_07_01.CommonEncryptionCenc;
import com.microsoft.azure.management.mediaservices.v2018_07_01.CommonEncryptionCbcs;
import com.microsoft.azure.management.mediaservices.v2018_07_01.NoEncryption;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A Streaming Policy resource.
 */
@JsonFlatten
public class StreamingPolicyInner extends ProxyResource {
    /**
     * Creation time of Streaming Policy.
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * Default ContentKey used by current Streaming Policy.
     */
    @JsonProperty(value = "properties.defaultContentKeyPolicyName")
    private String defaultContentKeyPolicyName;

    /**
     * Configuration of EnvelopeEncryption.
     */
    @JsonProperty(value = "properties.envelopeEncryption")
    private EnvelopeEncryption envelopeEncryption;

    /**
     * Configuration of CommonEncryptionCenc.
     */
    @JsonProperty(value = "properties.commonEncryptionCenc")
    private CommonEncryptionCenc commonEncryptionCenc;

    /**
     * Configuration of CommonEncryptionCbcs.
     */
    @JsonProperty(value = "properties.commonEncryptionCbcs")
    private CommonEncryptionCbcs commonEncryptionCbcs;

    /**
     * Configurations of NoEncryption.
     */
    @JsonProperty(value = "properties.noEncryption")
    private NoEncryption noEncryption;

    /**
     * Get creation time of Streaming Policy.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Get default ContentKey used by current Streaming Policy.
     *
     * @return the defaultContentKeyPolicyName value
     */
    public String defaultContentKeyPolicyName() {
        return this.defaultContentKeyPolicyName;
    }

    /**
     * Set default ContentKey used by current Streaming Policy.
     *
     * @param defaultContentKeyPolicyName the defaultContentKeyPolicyName value to set
     * @return the StreamingPolicyInner object itself.
     */
    public StreamingPolicyInner withDefaultContentKeyPolicyName(String defaultContentKeyPolicyName) {
        this.defaultContentKeyPolicyName = defaultContentKeyPolicyName;
        return this;
    }

    /**
     * Get configuration of EnvelopeEncryption.
     *
     * @return the envelopeEncryption value
     */
    public EnvelopeEncryption envelopeEncryption() {
        return this.envelopeEncryption;
    }

    /**
     * Set configuration of EnvelopeEncryption.
     *
     * @param envelopeEncryption the envelopeEncryption value to set
     * @return the StreamingPolicyInner object itself.
     */
    public StreamingPolicyInner withEnvelopeEncryption(EnvelopeEncryption envelopeEncryption) {
        this.envelopeEncryption = envelopeEncryption;
        return this;
    }

    /**
     * Get configuration of CommonEncryptionCenc.
     *
     * @return the commonEncryptionCenc value
     */
    public CommonEncryptionCenc commonEncryptionCenc() {
        return this.commonEncryptionCenc;
    }

    /**
     * Set configuration of CommonEncryptionCenc.
     *
     * @param commonEncryptionCenc the commonEncryptionCenc value to set
     * @return the StreamingPolicyInner object itself.
     */
    public StreamingPolicyInner withCommonEncryptionCenc(CommonEncryptionCenc commonEncryptionCenc) {
        this.commonEncryptionCenc = commonEncryptionCenc;
        return this;
    }

    /**
     * Get configuration of CommonEncryptionCbcs.
     *
     * @return the commonEncryptionCbcs value
     */
    public CommonEncryptionCbcs commonEncryptionCbcs() {
        return this.commonEncryptionCbcs;
    }

    /**
     * Set configuration of CommonEncryptionCbcs.
     *
     * @param commonEncryptionCbcs the commonEncryptionCbcs value to set
     * @return the StreamingPolicyInner object itself.
     */
    public StreamingPolicyInner withCommonEncryptionCbcs(CommonEncryptionCbcs commonEncryptionCbcs) {
        this.commonEncryptionCbcs = commonEncryptionCbcs;
        return this;
    }

    /**
     * Get configurations of NoEncryption.
     *
     * @return the noEncryption value
     */
    public NoEncryption noEncryption() {
        return this.noEncryption;
    }

    /**
     * Set configurations of NoEncryption.
     *
     * @param noEncryption the noEncryption value to set
     * @return the StreamingPolicyInner object itself.
     */
    public StreamingPolicyInner withNoEncryption(NoEncryption noEncryption) {
        this.noEncryption = noEncryption;
        return this;
    }

}
