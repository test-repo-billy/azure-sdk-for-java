// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.redisenterprise.fluent.models.DatabaseInner;
import java.util.List;

/**
 * An immutable client-side representation of Database.
 */
public interface Database {
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
     * Gets the clientProtocol property: Specifies whether redis clients can connect using TLS-encrypted or plaintext
     * redis protocols. Default is TLS-encrypted.
     * 
     * @return the clientProtocol value.
     */
    Protocol clientProtocol();

    /**
     * Gets the port property: TCP port of the database endpoint. Specified at create time. Defaults to an available
     * port.
     * 
     * @return the port value.
     */
    Integer port();

    /**
     * Gets the provisioningState property: Current provisioning status of the database.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the resourceState property: Current resource status of the database.
     * 
     * @return the resourceState value.
     */
    ResourceState resourceState();

    /**
     * Gets the clusteringPolicy property: Clustering policy - default is OSSCluster. Specified at create time.
     * 
     * @return the clusteringPolicy value.
     */
    ClusteringPolicy clusteringPolicy();

    /**
     * Gets the evictionPolicy property: Redis eviction policy - default is VolatileLRU.
     * 
     * @return the evictionPolicy value.
     */
    EvictionPolicy evictionPolicy();

    /**
     * Gets the persistence property: Persistence settings.
     * 
     * @return the persistence value.
     */
    Persistence persistence();

    /**
     * Gets the modules property: Optional set of redis modules to enable in this database - modules can only be added
     * at creation time.
     * 
     * @return the modules value.
     */
    List<Module> modules();

    /**
     * Gets the geoReplication property: Optional set of properties to configure geo replication for this database.
     * 
     * @return the geoReplication value.
     */
    DatabasePropertiesGeoReplication geoReplication();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.redisenterprise.fluent.models.DatabaseInner object.
     * 
     * @return the inner object.
     */
    DatabaseInner innerModel();

    /**
     * The entirety of the Database definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The Database definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Database definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the Database definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, clusterName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param clusterName The name of the RedisEnterprise cluster.
             * @return the next definition stage.
             */
            WithCreate withExistingRedisEnterprise(String resourceGroupName, String clusterName);
        }

        /**
         * The stage of the Database definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithClientProtocol, DefinitionStages.WithPort,
            DefinitionStages.WithClusteringPolicy, DefinitionStages.WithEvictionPolicy,
            DefinitionStages.WithPersistence, DefinitionStages.WithModules, DefinitionStages.WithGeoReplication {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Database create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Database create(Context context);
        }

        /**
         * The stage of the Database definition allowing to specify clientProtocol.
         */
        interface WithClientProtocol {
            /**
             * Specifies the clientProtocol property: Specifies whether redis clients can connect using TLS-encrypted or
             * plaintext redis protocols. Default is TLS-encrypted..
             * 
             * @param clientProtocol Specifies whether redis clients can connect using TLS-encrypted or plaintext redis
             * protocols. Default is TLS-encrypted.
             * @return the next definition stage.
             */
            WithCreate withClientProtocol(Protocol clientProtocol);
        }

        /**
         * The stage of the Database definition allowing to specify port.
         */
        interface WithPort {
            /**
             * Specifies the port property: TCP port of the database endpoint. Specified at create time. Defaults to an
             * available port..
             * 
             * @param port TCP port of the database endpoint. Specified at create time. Defaults to an available port.
             * @return the next definition stage.
             */
            WithCreate withPort(Integer port);
        }

        /**
         * The stage of the Database definition allowing to specify clusteringPolicy.
         */
        interface WithClusteringPolicy {
            /**
             * Specifies the clusteringPolicy property: Clustering policy - default is OSSCluster. Specified at create
             * time..
             * 
             * @param clusteringPolicy Clustering policy - default is OSSCluster. Specified at create time.
             * @return the next definition stage.
             */
            WithCreate withClusteringPolicy(ClusteringPolicy clusteringPolicy);
        }

        /**
         * The stage of the Database definition allowing to specify evictionPolicy.
         */
        interface WithEvictionPolicy {
            /**
             * Specifies the evictionPolicy property: Redis eviction policy - default is VolatileLRU.
             * 
             * @param evictionPolicy Redis eviction policy - default is VolatileLRU.
             * @return the next definition stage.
             */
            WithCreate withEvictionPolicy(EvictionPolicy evictionPolicy);
        }

        /**
         * The stage of the Database definition allowing to specify persistence.
         */
        interface WithPersistence {
            /**
             * Specifies the persistence property: Persistence settings.
             * 
             * @param persistence Persistence settings.
             * @return the next definition stage.
             */
            WithCreate withPersistence(Persistence persistence);
        }

        /**
         * The stage of the Database definition allowing to specify modules.
         */
        interface WithModules {
            /**
             * Specifies the modules property: Optional set of redis modules to enable in this database - modules can
             * only be added at creation time..
             * 
             * @param modules Optional set of redis modules to enable in this database - modules can only be added at
             * creation time.
             * @return the next definition stage.
             */
            WithCreate withModules(List<Module> modules);
        }

        /**
         * The stage of the Database definition allowing to specify geoReplication.
         */
        interface WithGeoReplication {
            /**
             * Specifies the geoReplication property: Optional set of properties to configure geo replication for this
             * database..
             * 
             * @param geoReplication Optional set of properties to configure geo replication for this database.
             * @return the next definition stage.
             */
            WithCreate withGeoReplication(DatabasePropertiesGeoReplication geoReplication);
        }
    }

    /**
     * Begins update for the Database resource.
     * 
     * @return the stage of resource update.
     */
    Database.Update update();

    /**
     * The template for Database update.
     */
    interface Update
        extends UpdateStages.WithClientProtocol, UpdateStages.WithEvictionPolicy, UpdateStages.WithPersistence {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Database apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Database apply(Context context);
    }

    /**
     * The Database update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the Database update allowing to specify clientProtocol.
         */
        interface WithClientProtocol {
            /**
             * Specifies the clientProtocol property: Specifies whether redis clients can connect using TLS-encrypted or
             * plaintext redis protocols. Default is TLS-encrypted..
             * 
             * @param clientProtocol Specifies whether redis clients can connect using TLS-encrypted or plaintext redis
             * protocols. Default is TLS-encrypted.
             * @return the next definition stage.
             */
            Update withClientProtocol(Protocol clientProtocol);
        }

        /**
         * The stage of the Database update allowing to specify evictionPolicy.
         */
        interface WithEvictionPolicy {
            /**
             * Specifies the evictionPolicy property: Redis eviction policy - default is VolatileLRU.
             * 
             * @param evictionPolicy Redis eviction policy - default is VolatileLRU.
             * @return the next definition stage.
             */
            Update withEvictionPolicy(EvictionPolicy evictionPolicy);
        }

        /**
         * The stage of the Database update allowing to specify persistence.
         */
        interface WithPersistence {
            /**
             * Specifies the persistence property: Persistence settings.
             * 
             * @param persistence Persistence settings.
             * @return the next definition stage.
             */
            Update withPersistence(Persistence persistence);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Database refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Database refresh(Context context);

    /**
     * Retrieves the access keys for the RedisEnterprise database.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access keys along with {@link Response}.
     */
    Response<AccessKeys> listKeysWithResponse(Context context);

    /**
     * Retrieves the access keys for the RedisEnterprise database.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access keys.
     */
    AccessKeys listKeys();

    /**
     * Regenerates the RedisEnterprise database's access keys.
     * 
     * @param parameters Specifies which key to regenerate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access keys.
     */
    AccessKeys regenerateKey(RegenerateKeyParameters parameters);

    /**
     * Regenerates the RedisEnterprise database's access keys.
     * 
     * @param parameters Specifies which key to regenerate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access keys.
     */
    AccessKeys regenerateKey(RegenerateKeyParameters parameters, Context context);

    /**
     * Imports database files to target database.
     * 
     * @param parameters Storage information for importing into the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void importMethod(ImportClusterParameters parameters);

    /**
     * Imports database files to target database.
     * 
     * @param parameters Storage information for importing into the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void importMethod(ImportClusterParameters parameters, Context context);

    /**
     * Exports a database file from target database.
     * 
     * @param parameters Storage information for exporting into the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void export(ExportClusterParameters parameters);

    /**
     * Exports a database file from target database.
     * 
     * @param parameters Storage information for exporting into the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void export(ExportClusterParameters parameters, Context context);

    /**
     * Forcibly removes the link to the specified database resource.
     * 
     * @param parameters Information identifying the database to be unlinked.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void forceUnlink(ForceUnlinkParameters parameters);

    /**
     * Forcibly removes the link to the specified database resource.
     * 
     * @param parameters Information identifying the database to be unlinked.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void forceUnlink(ForceUnlinkParameters parameters, Context context);

    /**
     * Flushes all the keys in this database and also from its linked databases.
     * 
     * @param parameters Information identifying the databases to be flushed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void flush(FlushParameters parameters);

    /**
     * Flushes all the keys in this database and also from its linked databases.
     * 
     * @param parameters Information identifying the databases to be flushed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void flush(FlushParameters parameters, Context context);
}
