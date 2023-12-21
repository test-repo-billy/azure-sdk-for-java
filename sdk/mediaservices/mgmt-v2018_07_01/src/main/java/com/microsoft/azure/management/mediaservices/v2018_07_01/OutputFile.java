/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an output file produced.
 */
public class OutputFile {
    /**
     * The list of labels that describe how the encoder should multiplex video
     * and audio into an output file. For example, if the encoder is producing
     * two video layers with labels v1 and v2, and one audio layer with label
     * a1, then an array like '[v1, a1]' tells the encoder to produce an output
     * file with the video track represented by v1 and the audio track
     * represented by a1.
     */
    @JsonProperty(value = "labels", required = true)
    private List<String> labels;

    /**
     * Get the list of labels that describe how the encoder should multiplex video and audio into an output file. For example, if the encoder is producing two video layers with labels v1 and v2, and one audio layer with label a1, then an array like '[v1, a1]' tells the encoder to produce an output file with the video track represented by v1 and the audio track represented by a1.
     *
     * @return the labels value
     */
    public List<String> labels() {
        return this.labels;
    }

    /**
     * Set the list of labels that describe how the encoder should multiplex video and audio into an output file. For example, if the encoder is producing two video layers with labels v1 and v2, and one audio layer with label a1, then an array like '[v1, a1]' tells the encoder to produce an output file with the video track represented by v1 and the audio track represented by a1.
     *
     * @param labels the labels value to set
     * @return the OutputFile object itself.
     */
    public OutputFile withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

}
