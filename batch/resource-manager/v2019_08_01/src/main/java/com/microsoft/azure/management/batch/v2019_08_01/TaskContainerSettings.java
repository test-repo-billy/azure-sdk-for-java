/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The container settings for a task.
 */
public class TaskContainerSettings {
    /**
     * Additional options to the container create command.
     * These additional options are supplied as arguments to the "docker
     * create" command, in addition to those controlled by the Batch Service.
     */
    @JsonProperty(value = "containerRunOptions")
    private String containerRunOptions;

    /**
     * The image to use to create the container in which the task will run.
     * This is the full image reference, as would be specified to "docker
     * pull". If no tag is provided as part of the image name, the tag
     * ":latest" is used as a default.
     */
    @JsonProperty(value = "imageName", required = true)
    private String imageName;

    /**
     * The private registry which contains the container image.
     * This setting can be omitted if was already provided at pool creation.
     */
    @JsonProperty(value = "registry")
    private ContainerRegistry registry;

    /**
     * A flag to indicate where the container task working directory is. The
     * default is 'taskWorkingDirectory'.
     * Possible values include: 'TaskWorkingDirectory',
     * 'ContainerImageDefault'.
     */
    @JsonProperty(value = "workingDirectory")
    private ContainerWorkingDirectory workingDirectory;

    /**
     * Get these additional options are supplied as arguments to the "docker create" command, in addition to those controlled by the Batch Service.
     *
     * @return the containerRunOptions value
     */
    public String containerRunOptions() {
        return this.containerRunOptions;
    }

    /**
     * Set these additional options are supplied as arguments to the "docker create" command, in addition to those controlled by the Batch Service.
     *
     * @param containerRunOptions the containerRunOptions value to set
     * @return the TaskContainerSettings object itself.
     */
    public TaskContainerSettings withContainerRunOptions(String containerRunOptions) {
        this.containerRunOptions = containerRunOptions;
        return this;
    }

    /**
     * Get this is the full image reference, as would be specified to "docker pull". If no tag is provided as part of the image name, the tag ":latest" is used as a default.
     *
     * @return the imageName value
     */
    public String imageName() {
        return this.imageName;
    }

    /**
     * Set this is the full image reference, as would be specified to "docker pull". If no tag is provided as part of the image name, the tag ":latest" is used as a default.
     *
     * @param imageName the imageName value to set
     * @return the TaskContainerSettings object itself.
     */
    public TaskContainerSettings withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * Get this setting can be omitted if was already provided at pool creation.
     *
     * @return the registry value
     */
    public ContainerRegistry registry() {
        return this.registry;
    }

    /**
     * Set this setting can be omitted if was already provided at pool creation.
     *
     * @param registry the registry value to set
     * @return the TaskContainerSettings object itself.
     */
    public TaskContainerSettings withRegistry(ContainerRegistry registry) {
        this.registry = registry;
        return this;
    }

    /**
     * Get possible values include: 'TaskWorkingDirectory', 'ContainerImageDefault'.
     *
     * @return the workingDirectory value
     */
    public ContainerWorkingDirectory workingDirectory() {
        return this.workingDirectory;
    }

    /**
     * Set possible values include: 'TaskWorkingDirectory', 'ContainerImageDefault'.
     *
     * @param workingDirectory the workingDirectory value to set
     * @return the TaskContainerSettings object itself.
     */
    public TaskContainerSettings withWorkingDirectory(ContainerWorkingDirectory workingDirectory) {
        this.workingDirectory = workingDirectory;
        return this;
    }

}
