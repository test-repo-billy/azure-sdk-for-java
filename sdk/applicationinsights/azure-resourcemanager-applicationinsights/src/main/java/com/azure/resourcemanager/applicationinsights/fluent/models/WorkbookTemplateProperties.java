// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.models.WorkbookTemplateGallery;
import com.azure.resourcemanager.applicationinsights.models.WorkbookTemplateLocalizedGallery;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Properties that contain a workbook template.
 */
@Fluent
public final class WorkbookTemplateProperties {
    /*
     * Priority of the template. Determines which template to open when a workbook gallery is opened in viewer mode.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /*
     * Information about the author of the workbook template.
     */
    @JsonProperty(value = "author")
    private String author;

    /*
     * Valid JSON object containing workbook template payload.
     */
    @JsonProperty(value = "templateData", required = true)
    private Object templateData;

    /*
     * Workbook galleries supported by the template.
     */
    @JsonProperty(value = "galleries", required = true)
    private List<WorkbookTemplateGallery> galleries;

    /*
     * Key value pair of localized gallery. Each key is the locale code of languages supported by the Azure portal.
     */
    @JsonProperty(value = "localized")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, List<WorkbookTemplateLocalizedGallery>> localized;

    /**
     * Creates an instance of WorkbookTemplateProperties class.
     */
    public WorkbookTemplateProperties() {
    }

    /**
     * Get the priority property: Priority of the template. Determines which template to open when a workbook gallery
     * is opened in viewer mode.
     * 
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of the template. Determines which template to open when a workbook gallery
     * is opened in viewer mode.
     * 
     * @param priority the priority value to set.
     * @return the WorkbookTemplateProperties object itself.
     */
    public WorkbookTemplateProperties withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the author property: Information about the author of the workbook template.
     * 
     * @return the author value.
     */
    public String author() {
        return this.author;
    }

    /**
     * Set the author property: Information about the author of the workbook template.
     * 
     * @param author the author value to set.
     * @return the WorkbookTemplateProperties object itself.
     */
    public WorkbookTemplateProperties withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * Get the templateData property: Valid JSON object containing workbook template payload.
     * 
     * @return the templateData value.
     */
    public Object templateData() {
        return this.templateData;
    }

    /**
     * Set the templateData property: Valid JSON object containing workbook template payload.
     * 
     * @param templateData the templateData value to set.
     * @return the WorkbookTemplateProperties object itself.
     */
    public WorkbookTemplateProperties withTemplateData(Object templateData) {
        this.templateData = templateData;
        return this;
    }

    /**
     * Get the galleries property: Workbook galleries supported by the template.
     * 
     * @return the galleries value.
     */
    public List<WorkbookTemplateGallery> galleries() {
        return this.galleries;
    }

    /**
     * Set the galleries property: Workbook galleries supported by the template.
     * 
     * @param galleries the galleries value to set.
     * @return the WorkbookTemplateProperties object itself.
     */
    public WorkbookTemplateProperties withGalleries(List<WorkbookTemplateGallery> galleries) {
        this.galleries = galleries;
        return this;
    }

    /**
     * Get the localized property: Key value pair of localized gallery. Each key is the locale code of languages
     * supported by the Azure portal.
     * 
     * @return the localized value.
     */
    public Map<String, List<WorkbookTemplateLocalizedGallery>> localized() {
        return this.localized;
    }

    /**
     * Set the localized property: Key value pair of localized gallery. Each key is the locale code of languages
     * supported by the Azure portal.
     * 
     * @param localized the localized value to set.
     * @return the WorkbookTemplateProperties object itself.
     */
    public WorkbookTemplateProperties withLocalized(Map<String, List<WorkbookTemplateLocalizedGallery>> localized) {
        this.localized = localized;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (templateData() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property templateData in model WorkbookTemplateProperties"));
        }
        if (galleries() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property galleries in model WorkbookTemplateProperties"));
        } else {
            galleries().forEach(e -> e.validate());
        }
        if (localized() != null) {
            localized().values().forEach(e -> {
                if (e != null) {
                    e.forEach(e1 -> e1.validate());
                }
            });
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WorkbookTemplateProperties.class);
}
