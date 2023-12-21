/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation.FormulaInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation.DevTestLabsManager;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Type representing Formula.
 */
public interface Formula extends HasInner<FormulaInner>, Indexable, Refreshable<Formula>, Updatable<Formula.Update>, HasManager<DevTestLabsManager> {
    /**
     * @return the author value.
     */
    String author();

    /**
     * @return the creationDate value.
     */
    DateTime creationDate();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the formulaContent value.
     */
    LabVirtualMachineCreationParameter formulaContent();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the osType value.
     */
    String osType();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

    /**
     * @return the vm value.
     */
    FormulaPropertiesFromVm vm();

    /**
     * The entirety of the Formula definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLab, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Formula definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Formula definition.
         */
        interface Blank extends WithLab {
        }

        /**
         * The stage of the formula definition allowing to specify Lab.
         */
        interface WithLab {
           /**
            * Specifies resourceGroupName, labName.
            * @param resourceGroupName The name of the resource group
            * @param labName The name of the lab
            * @return the next definition stage
            */
            WithCreate withExistingLab(String resourceGroupName, String labName);
        }

        /**
         * The stage of the formula definition allowing to specify Author.
         */
        interface WithAuthor {
            /**
             * Specifies author.
             * @param author The author of the formula
             * @return the next definition stage
             */
            WithCreate withAuthor(String author);
        }

        /**
         * The stage of the formula definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description The description of the formula
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the formula definition allowing to specify FormulaContent.
         */
        interface WithFormulaContent {
            /**
             * Specifies formulaContent.
             * @param formulaContent The content of the formula
             * @return the next definition stage
             */
            WithCreate withFormulaContent(LabVirtualMachineCreationParameter formulaContent);
        }

        /**
         * The stage of the formula definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The location of the resource
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the formula definition allowing to specify OsType.
         */
        interface WithOsType {
            /**
             * Specifies osType.
             * @param osType The OS type of the formula
             * @return the next definition stage
             */
            WithCreate withOsType(String osType);
        }

        /**
         * The stage of the formula definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the formula definition allowing to specify Vm.
         */
        interface WithVm {
            /**
             * Specifies vm.
             * @param vm Information about a VM from which a formula is to be created
             * @return the next definition stage
             */
            WithCreate withVm(FormulaPropertiesFromVm vm);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Formula>, DefinitionStages.WithAuthor, DefinitionStages.WithDescription, DefinitionStages.WithFormulaContent, DefinitionStages.WithLocation, DefinitionStages.WithOsType, DefinitionStages.WithTags, DefinitionStages.WithVm {
        }
    }
    /**
     * The template for a Formula update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Formula>, UpdateStages.WithAuthor, UpdateStages.WithDescription, UpdateStages.WithFormulaContent, UpdateStages.WithOsType, UpdateStages.WithTags, UpdateStages.WithVm {
    }

    /**
     * Grouping of Formula update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the formula update allowing to specify Author.
         */
        interface WithAuthor {
            /**
             * Specifies author.
             * @param author The author of the formula
             * @return the next update stage
             */
            Update withAuthor(String author);
        }

        /**
         * The stage of the formula update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description The description of the formula
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the formula update allowing to specify FormulaContent.
         */
        interface WithFormulaContent {
            /**
             * Specifies formulaContent.
             * @param formulaContent The content of the formula
             * @return the next update stage
             */
            Update withFormulaContent(LabVirtualMachineCreationParameterFragment formulaContent);
        }

        /**
         * The stage of the formula update allowing to specify OsType.
         */
        interface WithOsType {
            /**
             * Specifies osType.
             * @param osType The OS type of the formula
             * @return the next update stage
             */
            Update withOsType(String osType);
        }

        /**
         * The stage of the formula update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the formula update allowing to specify Vm.
         */
        interface WithVm {
            /**
             * Specifies vm.
             * @param vm Information about a VM from which a formula is to be created
             * @return the next update stage
             */
            Update withVm(FormulaPropertiesFromVmFragment vm);
        }

    }
}
