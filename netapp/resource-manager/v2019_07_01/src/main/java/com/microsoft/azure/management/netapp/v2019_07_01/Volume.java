/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2019_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.netapp.v2019_07_01.implementation.VolumeInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.netapp.v2019_07_01.implementation.NetAppManager;
import java.util.List;
import java.util.Map;

/**
 * Type representing Volume.
 */
public interface Volume extends HasInner<VolumeInner>, Indexable, Refreshable<Volume>, Updatable<Volume.Update>, HasManager<NetAppManager> {
    /**
     * @return the baremetalTenantId value.
     */
    String baremetalTenantId();

    /**
     * @return the creationToken value.
     */
    String creationToken();

    /**
     * @return the exportPolicy value.
     */
    VolumePropertiesExportPolicy exportPolicy();

    /**
     * @return the fileSystemId value.
     */
    String fileSystemId();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the mountTargets value.
     */
    Object mountTargets();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the protocolTypes value.
     */
    List<String> protocolTypes();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the serviceLevel value.
     */
    ServiceLevel serviceLevel();

    /**
     * @return the snapshotId value.
     */
    String snapshotId();

    /**
     * @return the subnetId value.
     */
    String subnetId();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the usageThreshold value.
     */
    long usageThreshold();

    /**
     * The entirety of the Volume definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithCapacityPool, DefinitionStages.WithCreationToken, DefinitionStages.WithLocation, DefinitionStages.WithSubnetId, DefinitionStages.WithUsageThreshold, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Volume definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Volume definition.
         */
        interface Blank extends WithCapacityPool {
        }

        /**
         * The stage of the volume definition allowing to specify CapacityPool.
         */
        interface WithCapacityPool {
           /**
            * Specifies resourceGroupName, accountName, poolName.
            * @param resourceGroupName The name of the resource group
            * @param accountName The name of the NetApp account
            * @param poolName The name of the capacity pool
            * @return the next definition stage
            */
            WithCreationToken withExistingCapacityPool(String resourceGroupName, String accountName, String poolName);
        }

        /**
         * The stage of the volume definition allowing to specify CreationToken.
         */
        interface WithCreationToken {
           /**
            * Specifies creationToken.
            * @param creationToken A unique file path for the volume. Used when creating mount targets
            * @return the next definition stage
            */
            WithLocation withCreationToken(String creationToken);
        }

        /**
         * The stage of the volume definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location the location parameter value
            * @return the next definition stage
            */
            WithSubnetId withLocation(String location);
        }

        /**
         * The stage of the volume definition allowing to specify SubnetId.
         */
        interface WithSubnetId {
           /**
            * Specifies subnetId.
            * @param subnetId The Azure Resource URI for a delegated subnet. Must have the delegation Microsoft.NetApp/volumes
            * @return the next definition stage
            */
            WithUsageThreshold withSubnetId(String subnetId);
        }

        /**
         * The stage of the volume definition allowing to specify UsageThreshold.
         */
        interface WithUsageThreshold {
           /**
            * Specifies usageThreshold.
            * @param usageThreshold Maximum storage quota allowed for a file system in bytes. This is a soft quota used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes
            * @return the next definition stage
            */
            WithCreate withUsageThreshold(long usageThreshold);
        }

        /**
         * The stage of the volume definition allowing to specify ExportPolicy.
         */
        interface WithExportPolicy {
            /**
             * Specifies exportPolicy.
             * @param exportPolicy Set of export policy rules
             * @return the next definition stage
             */
            WithCreate withExportPolicy(VolumePropertiesExportPolicy exportPolicy);
        }

        /**
         * The stage of the volume definition allowing to specify MountTargets.
         */
        interface WithMountTargets {
            /**
             * Specifies mountTargets.
             * @param mountTargets List of mount targets
             * @return the next definition stage
             */
            WithCreate withMountTargets(Object mountTargets);
        }

        /**
         * The stage of the volume definition allowing to specify ProtocolTypes.
         */
        interface WithProtocolTypes {
            /**
             * Specifies protocolTypes.
             * @param protocolTypes Set of protocol types
             * @return the next definition stage
             */
            WithCreate withProtocolTypes(List<String> protocolTypes);
        }

        /**
         * The stage of the volume definition allowing to specify ServiceLevel.
         */
        interface WithServiceLevel {
            /**
             * Specifies serviceLevel.
             * @param serviceLevel The service level of the file system. Possible values include: 'Standard', 'Premium', 'Ultra'
             * @return the next definition stage
             */
            WithCreate withServiceLevel(ServiceLevel serviceLevel);
        }

        /**
         * The stage of the volume definition allowing to specify SnapshotId.
         */
        interface WithSnapshotId {
            /**
             * Specifies snapshotId.
             * @param snapshotId UUID v4 or resource identifier used to identify the Snapshot
             * @return the next definition stage
             */
            WithCreate withSnapshotId(String snapshotId);
        }

        /**
         * The stage of the volume definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags the tags parameter value
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Volume>, DefinitionStages.WithExportPolicy, DefinitionStages.WithMountTargets, DefinitionStages.WithProtocolTypes, DefinitionStages.WithServiceLevel, DefinitionStages.WithSnapshotId, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a Volume update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Volume>, UpdateStages.WithExportPolicy, UpdateStages.WithServiceLevel, UpdateStages.WithTags, UpdateStages.WithUsageThreshold {
    }

    /**
     * Grouping of Volume update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the volume update allowing to specify ExportPolicy.
         */
        interface WithExportPolicy {
            /**
             * Specifies exportPolicy.
             * @param exportPolicy Set of export policy rules
             * @return the next update stage
             */
            Update withExportPolicy(VolumePatchPropertiesExportPolicy exportPolicy);
        }

        /**
         * The stage of the volume update allowing to specify ServiceLevel.
         */
        interface WithServiceLevel {
            /**
             * Specifies serviceLevel.
             * @param serviceLevel The service level of the file system. Possible values include: 'Standard', 'Premium', 'Ultra'
             * @return the next update stage
             */
            Update withServiceLevel(ServiceLevel serviceLevel);
        }

        /**
         * The stage of the volume update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags the tags parameter value
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the volume update allowing to specify UsageThreshold.
         */
        interface WithUsageThreshold {
            /**
             * Specifies usageThreshold.
             * @param usageThreshold Maximum storage quota allowed for a file system in bytes. This is a soft quota used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes
             * @return the next update stage
             */
            Update withUsageThreshold(Long usageThreshold);
        }

    }
}
