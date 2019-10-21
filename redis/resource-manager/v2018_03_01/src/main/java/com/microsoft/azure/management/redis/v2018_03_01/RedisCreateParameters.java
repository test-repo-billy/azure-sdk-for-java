/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.v2018_03_01;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters supplied to the Create Redis operation.
 */
@JsonFlatten
public class RedisCreateParameters {
    /**
     * All Redis Settings. Few possible keys:
     * rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value
     * etc.
     */
    @JsonProperty(value = "properties.redisConfiguration")
    private Map<String, String> redisConfiguration;

    /**
     * Specifies whether the non-ssl Redis server port (6379) is enabled.
     */
    @JsonProperty(value = "properties.enableNonSslPort")
    private Boolean enableNonSslPort;

    /**
     * A dictionary of tenant settings.
     */
    @JsonProperty(value = "properties.tenantSettings")
    private Map<String, String> tenantSettings;

    /**
     * The number of shards to be created on a Premium Cluster Cache.
     */
    @JsonProperty(value = "properties.shardCount")
    private Integer shardCount;

    /**
     * Optional: requires clients to use a specified TLS version (or higher) to
     * connect (e,g, '1.0', '1.1', '1.2'). Possible values include: '1.0',
     * '1.1', '1.2'.
     */
    @JsonProperty(value = "properties.minimumTlsVersion")
    private TlsVersion minimumTlsVersion;

    /**
     * The SKU of the Redis cache to deploy.
     */
    @JsonProperty(value = "properties.sku", required = true)
    private Sku sku;

    /**
     * The full resource ID of a subnet in a virtual network to deploy the
     * Redis cache in. Example format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1.
     */
    @JsonProperty(value = "properties.subnetId")
    private String subnetId;

    /**
     * Deprecated. May optionally be used to request a specific IP address,
     * only when deploying a Redis cache inside an Azure virtual network. We
     * recommend you do not set this parameter, and connect using the hostname
     * instead.
     */
    @JsonProperty(value = "properties.staticIP")
    private String staticIP;

    /**
     * A list of availability zones denoting where the resource needs to come
     * from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * The geo-location where the resource lives.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get all Redis Settings. Few possible keys: rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value etc.
     *
     * @return the redisConfiguration value
     */
    public Map<String, String> redisConfiguration() {
        return this.redisConfiguration;
    }

    /**
     * Set all Redis Settings. Few possible keys: rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value etc.
     *
     * @param redisConfiguration the redisConfiguration value to set
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withRedisConfiguration(Map<String, String> redisConfiguration) {
        this.redisConfiguration = redisConfiguration;
        return this;
    }

    /**
     * Get specifies whether the non-ssl Redis server port (6379) is enabled.
     *
     * @return the enableNonSslPort value
     */
    public Boolean enableNonSslPort() {
        return this.enableNonSslPort;
    }

    /**
     * Set specifies whether the non-ssl Redis server port (6379) is enabled.
     *
     * @param enableNonSslPort the enableNonSslPort value to set
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withEnableNonSslPort(Boolean enableNonSslPort) {
        this.enableNonSslPort = enableNonSslPort;
        return this;
    }

    /**
     * Get a dictionary of tenant settings.
     *
     * @return the tenantSettings value
     */
    public Map<String, String> tenantSettings() {
        return this.tenantSettings;
    }

    /**
     * Set a dictionary of tenant settings.
     *
     * @param tenantSettings the tenantSettings value to set
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withTenantSettings(Map<String, String> tenantSettings) {
        this.tenantSettings = tenantSettings;
        return this;
    }

    /**
     * Get the number of shards to be created on a Premium Cluster Cache.
     *
     * @return the shardCount value
     */
    public Integer shardCount() {
        return this.shardCount;
    }

    /**
     * Set the number of shards to be created on a Premium Cluster Cache.
     *
     * @param shardCount the shardCount value to set
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }

    /**
     * Get optional: requires clients to use a specified TLS version (or higher) to connect (e,g, '1.0', '1.1', '1.2'). Possible values include: '1.0', '1.1', '1.2'.
     *
     * @return the minimumTlsVersion value
     */
    public TlsVersion minimumTlsVersion() {
        return this.minimumTlsVersion;
    }

    /**
     * Set optional: requires clients to use a specified TLS version (or higher) to connect (e,g, '1.0', '1.1', '1.2'). Possible values include: '1.0', '1.1', '1.2'.
     *
     * @param minimumTlsVersion the minimumTlsVersion value to set
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withMinimumTlsVersion(TlsVersion minimumTlsVersion) {
        this.minimumTlsVersion = minimumTlsVersion;
        return this;
    }

    /**
     * Get the SKU of the Redis cache to deploy.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the SKU of the Redis cache to deploy.
     *
     * @param sku the sku value to set
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the full resource ID of a subnet in a virtual network to deploy the Redis cache in. Example format: /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1.
     *
     * @return the subnetId value
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the full resource ID of a subnet in a virtual network to deploy the Redis cache in. Example format: /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1.
     *
     * @param subnetId the subnetId value to set
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get deprecated. May optionally be used to request a specific IP address, only when deploying a Redis cache inside an Azure virtual network. We recommend you do not set this parameter, and connect using the hostname instead.
     *
     * @return the staticIP value
     */
    public String staticIP() {
        return this.staticIP;
    }

    /**
     * Set deprecated. May optionally be used to request a specific IP address, only when deploying a Redis cache inside an Azure virtual network. We recommend you do not set this parameter, and connect using the hostname instead.
     *
     * @param staticIP the staticIP value to set
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withStaticIP(String staticIP) {
        this.staticIP = staticIP;
        return this;
    }

    /**
     * Get a list of availability zones denoting where the resource needs to come from.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set a list of availability zones denoting where the resource needs to come from.
     *
     * @param zones the zones value to set
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the geo-location where the resource lives.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the geo-location where the resource lives.
     *
     * @param location the location value to set
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
