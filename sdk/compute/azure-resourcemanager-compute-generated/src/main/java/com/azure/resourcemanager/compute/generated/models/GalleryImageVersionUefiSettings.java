// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Contains UEFI settings for the image version.
 */
@Fluent
public final class GalleryImageVersionUefiSettings {
    /*
     * The name of the template(s) that contains default UEFI key signatures that will be added to the image.
     */
    @JsonProperty(value = "signatureTemplateNames")
    private List<UefiSignatureTemplateName> signatureTemplateNames;

    /*
     * Additional UEFI key signatures that will be added to the image in addition to the signature templates
     */
    @JsonProperty(value = "additionalSignatures")
    private UefiKeySignatures additionalSignatures;

    /**
     * Creates an instance of GalleryImageVersionUefiSettings class.
     */
    public GalleryImageVersionUefiSettings() {
    }

    /**
     * Get the signatureTemplateNames property: The name of the template(s) that contains default UEFI key signatures
     * that will be added to the image.
     * 
     * @return the signatureTemplateNames value.
     */
    public List<UefiSignatureTemplateName> signatureTemplateNames() {
        return this.signatureTemplateNames;
    }

    /**
     * Set the signatureTemplateNames property: The name of the template(s) that contains default UEFI key signatures
     * that will be added to the image.
     * 
     * @param signatureTemplateNames the signatureTemplateNames value to set.
     * @return the GalleryImageVersionUefiSettings object itself.
     */
    public GalleryImageVersionUefiSettings
        withSignatureTemplateNames(List<UefiSignatureTemplateName> signatureTemplateNames) {
        this.signatureTemplateNames = signatureTemplateNames;
        return this;
    }

    /**
     * Get the additionalSignatures property: Additional UEFI key signatures that will be added to the image in addition
     * to the signature templates.
     * 
     * @return the additionalSignatures value.
     */
    public UefiKeySignatures additionalSignatures() {
        return this.additionalSignatures;
    }

    /**
     * Set the additionalSignatures property: Additional UEFI key signatures that will be added to the image in addition
     * to the signature templates.
     * 
     * @param additionalSignatures the additionalSignatures value to set.
     * @return the GalleryImageVersionUefiSettings object itself.
     */
    public GalleryImageVersionUefiSettings withAdditionalSignatures(UefiKeySignatures additionalSignatures) {
        this.additionalSignatures = additionalSignatures;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (additionalSignatures() != null) {
            additionalSignatures().validate();
        }
    }
}
