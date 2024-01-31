// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.fluent.models.WorkbookTemplateInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of WorkbookTemplate.
 */
public interface WorkbookTemplate {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the priority property: Priority of the template. Determines which template to open when a workbook gallery
     * is opened in viewer mode.
     * 
     * @return the priority value.
     */
    Integer priority();

    /**
     * Gets the author property: Information about the author of the workbook template.
     * 
     * @return the author value.
     */
    String author();

    /**
     * Gets the templateData property: Valid JSON object containing workbook template payload.
     * 
     * @return the templateData value.
     */
    Object templateData();

    /**
     * Gets the galleries property: Workbook galleries supported by the template.
     * 
     * @return the galleries value.
     */
    List<WorkbookTemplateGallery> galleries();

    /**
     * Gets the localized property: Key value pair of localized gallery. Each key is the locale code of languages
     * supported by the Azure portal.
     * 
     * @return the localized value.
     */
    Map<String, List<WorkbookTemplateLocalizedGallery>> localized();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.applicationinsights.fluent.models.WorkbookTemplateInner object.
     * 
     * @return the inner object.
     */
    WorkbookTemplateInner innerModel();

    /**
     * The entirety of the WorkbookTemplate definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The WorkbookTemplate definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the WorkbookTemplate definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the WorkbookTemplate definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the WorkbookTemplate definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the WorkbookTemplate definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithPriority, DefinitionStages.WithAuthor,
            DefinitionStages.WithTemplateData, DefinitionStages.WithGalleries, DefinitionStages.WithLocalized {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            WorkbookTemplate create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            WorkbookTemplate create(Context context);
        }

        /**
         * The stage of the WorkbookTemplate definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the WorkbookTemplate definition allowing to specify priority.
         */
        interface WithPriority {
            /**
             * Specifies the priority property: Priority of the template. Determines which template to open when a
             * workbook gallery is opened in viewer mode..
             * 
             * @param priority Priority of the template. Determines which template to open when a workbook gallery is
             * opened in viewer mode.
             * @return the next definition stage.
             */
            WithCreate withPriority(Integer priority);
        }

        /**
         * The stage of the WorkbookTemplate definition allowing to specify author.
         */
        interface WithAuthor {
            /**
             * Specifies the author property: Information about the author of the workbook template..
             * 
             * @param author Information about the author of the workbook template.
             * @return the next definition stage.
             */
            WithCreate withAuthor(String author);
        }

        /**
         * The stage of the WorkbookTemplate definition allowing to specify templateData.
         */
        interface WithTemplateData {
            /**
             * Specifies the templateData property: Valid JSON object containing workbook template payload..
             * 
             * @param templateData Valid JSON object containing workbook template payload.
             * @return the next definition stage.
             */
            WithCreate withTemplateData(Object templateData);
        }

        /**
         * The stage of the WorkbookTemplate definition allowing to specify galleries.
         */
        interface WithGalleries {
            /**
             * Specifies the galleries property: Workbook galleries supported by the template..
             * 
             * @param galleries Workbook galleries supported by the template.
             * @return the next definition stage.
             */
            WithCreate withGalleries(List<WorkbookTemplateGallery> galleries);
        }

        /**
         * The stage of the WorkbookTemplate definition allowing to specify localized.
         */
        interface WithLocalized {
            /**
             * Specifies the localized property: Key value pair of localized gallery. Each key is the locale code of
             * languages supported by the Azure portal..
             * 
             * @param localized Key value pair of localized gallery. Each key is the locale code of languages supported
             * by the Azure portal.
             * @return the next definition stage.
             */
            WithCreate withLocalized(Map<String, List<WorkbookTemplateLocalizedGallery>> localized);
        }
    }

    /**
     * Begins update for the WorkbookTemplate resource.
     * 
     * @return the stage of resource update.
     */
    WorkbookTemplate.Update update();

    /**
     * The template for WorkbookTemplate update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithPriority, UpdateStages.WithAuthor,
        UpdateStages.WithTemplateData, UpdateStages.WithGalleries, UpdateStages.WithLocalized {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        WorkbookTemplate apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        WorkbookTemplate apply(Context context);
    }

    /**
     * The WorkbookTemplate update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the WorkbookTemplate update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the WorkbookTemplate update allowing to specify priority.
         */
        interface WithPriority {
            /**
             * Specifies the priority property: Priority of the template. Determines which template to open when a
             * workbook gallery is opened in viewer mode..
             * 
             * @param priority Priority of the template. Determines which template to open when a workbook gallery is
             * opened in viewer mode.
             * @return the next definition stage.
             */
            Update withPriority(Integer priority);
        }

        /**
         * The stage of the WorkbookTemplate update allowing to specify author.
         */
        interface WithAuthor {
            /**
             * Specifies the author property: Information about the author of the workbook template..
             * 
             * @param author Information about the author of the workbook template.
             * @return the next definition stage.
             */
            Update withAuthor(String author);
        }

        /**
         * The stage of the WorkbookTemplate update allowing to specify templateData.
         */
        interface WithTemplateData {
            /**
             * Specifies the templateData property: Valid JSON object containing workbook template payload..
             * 
             * @param templateData Valid JSON object containing workbook template payload.
             * @return the next definition stage.
             */
            Update withTemplateData(Object templateData);
        }

        /**
         * The stage of the WorkbookTemplate update allowing to specify galleries.
         */
        interface WithGalleries {
            /**
             * Specifies the galleries property: Workbook galleries supported by the template..
             * 
             * @param galleries Workbook galleries supported by the template.
             * @return the next definition stage.
             */
            Update withGalleries(List<WorkbookTemplateGallery> galleries);
        }

        /**
         * The stage of the WorkbookTemplate update allowing to specify localized.
         */
        interface WithLocalized {
            /**
             * Specifies the localized property: Key value pair of localized gallery. Each key is the locale code of
             * languages supported by the Azure portal..
             * 
             * @param localized Key value pair of localized gallery. Each key is the locale code of languages supported
             * by the Azure portal.
             * @return the next definition stage.
             */
            Update withLocalized(Map<String, List<WorkbookTemplateLocalizedGallery>> localized);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    WorkbookTemplate refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    WorkbookTemplate refresh(Context context);
}
