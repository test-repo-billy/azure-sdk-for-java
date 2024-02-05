// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.generated.models.AnalyticalStorageConfiguration;
import com.azure.resourcemanager.cosmos.generated.models.ApiProperties;
import com.azure.resourcemanager.cosmos.generated.models.BackupPolicy;
import com.azure.resourcemanager.cosmos.generated.models.Capability;
import com.azure.resourcemanager.cosmos.generated.models.Capacity;
import com.azure.resourcemanager.cosmos.generated.models.ConnectorOffer;
import com.azure.resourcemanager.cosmos.generated.models.ConsistencyPolicy;
import com.azure.resourcemanager.cosmos.generated.models.CorsPolicy;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseAccountKeysMetadata;
import com.azure.resourcemanager.cosmos.generated.models.DefaultPriorityLevel;
import com.azure.resourcemanager.cosmos.generated.models.DiagnosticLogSettings;
import com.azure.resourcemanager.cosmos.generated.models.IpAddressOrRange;
import com.azure.resourcemanager.cosmos.generated.models.Location;
import com.azure.resourcemanager.cosmos.generated.models.MinimalTlsVersion;
import com.azure.resourcemanager.cosmos.generated.models.NetworkAclBypass;
import com.azure.resourcemanager.cosmos.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.cosmos.generated.models.VirtualNetworkRule;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties to update Azure Cosmos DB database accounts.
 */
@Fluent
public final class DatabaseAccountUpdateProperties {
    /*
     * The consistency policy for the Cosmos DB account.
     */
    @JsonProperty(value = "consistencyPolicy")
    private ConsistencyPolicy consistencyPolicy;

    /*
     * An array that contains the georeplication locations enabled for the Cosmos DB account.
     */
    @JsonProperty(value = "locations")
    private List<Location> locations;

    /*
     * List of IpRules.
     */
    @JsonProperty(value = "ipRules")
    private List<IpAddressOrRange> ipRules;

    /*
     * Flag to indicate whether to enable/disable Virtual Network ACL rules.
     */
    @JsonProperty(value = "isVirtualNetworkFilterEnabled")
    private Boolean isVirtualNetworkFilterEnabled;

    /*
     * Enables automatic failover of the write region in the rare event that the region is unavailable due to an
     * outage. Automatic failover will result in a new write region for the account and is chosen based on the failover
     * priorities configured for the account.
     */
    @JsonProperty(value = "enableAutomaticFailover")
    private Boolean enableAutomaticFailover;

    /*
     * List of Cosmos DB capabilities for the account
     */
    @JsonProperty(value = "capabilities")
    private List<Capability> capabilities;

    /*
     * List of Virtual Network ACL rules configured for the Cosmos DB account.
     */
    @JsonProperty(value = "virtualNetworkRules")
    private List<VirtualNetworkRule> virtualNetworkRules;

    /*
     * Enables the account to write in multiple locations
     */
    @JsonProperty(value = "enableMultipleWriteLocations")
    private Boolean enableMultipleWriteLocations;

    /*
     * Enables the cassandra connector on the Cosmos DB C* account
     */
    @JsonProperty(value = "enableCassandraConnector")
    private Boolean enableCassandraConnector;

    /*
     * The cassandra connector offer type for the Cosmos DB database C* account.
     */
    @JsonProperty(value = "connectorOffer")
    private ConnectorOffer connectorOffer;

    /*
     * Disable write operations on metadata resources (databases, containers, throughput) via account keys
     */
    @JsonProperty(value = "disableKeyBasedMetadataWriteAccess")
    private Boolean disableKeyBasedMetadataWriteAccess;

    /*
     * The URI of the key vault
     */
    @JsonProperty(value = "keyVaultKeyUri")
    private String keyVaultKeyUri;

    /*
     * The default identity for accessing key vault used in features like customer managed keys. The default identity
     * needs to be explicitly set by the users. It can be "FirstPartyIdentity", "SystemAssignedIdentity" and more.
     */
    @JsonProperty(value = "defaultIdentity")
    private String defaultIdentity;

    /*
     * Whether requests from Public Network are allowed
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * Flag to indicate whether Free Tier is enabled.
     */
    @JsonProperty(value = "enableFreeTier")
    private Boolean enableFreeTier;

    /*
     * API specific properties. Currently, supported only for MongoDB API.
     */
    @JsonProperty(value = "apiProperties")
    private ApiProperties apiProperties;

    /*
     * Flag to indicate whether to enable storage analytics.
     */
    @JsonProperty(value = "enableAnalyticalStorage")
    private Boolean enableAnalyticalStorage;

    /*
     * Analytical storage specific properties.
     */
    @JsonProperty(value = "analyticalStorageConfiguration")
    private AnalyticalStorageConfiguration analyticalStorageConfiguration;

    /*
     * The object representing the policy for taking backups on an account.
     */
    @JsonProperty(value = "backupPolicy")
    private BackupPolicy backupPolicy;

    /*
     * The CORS policy for the Cosmos DB database account.
     */
    @JsonProperty(value = "cors")
    private List<CorsPolicy> cors;

    /*
     * Indicates what services are allowed to bypass firewall checks.
     */
    @JsonProperty(value = "networkAclBypass")
    private NetworkAclBypass networkAclBypass;

    /*
     * An array that contains the Resource Ids for Network Acl Bypass for the Cosmos DB account.
     */
    @JsonProperty(value = "networkAclBypassResourceIds")
    private List<String> networkAclBypassResourceIds;

    /*
     * The Object representing the different Diagnostic log settings for the Cosmos DB Account.
     */
    @JsonProperty(value = "diagnosticLogSettings")
    private DiagnosticLogSettings diagnosticLogSettings;

    /*
     * Opt-out of local authentication and ensure only MSI and AAD can be used exclusively for authentication.
     */
    @JsonProperty(value = "disableLocalAuth")
    private Boolean disableLocalAuth;

    /*
     * The object that represents all properties related to capacity enforcement on an account.
     */
    @JsonProperty(value = "capacity")
    private Capacity capacity;

    /*
     * Flag to indicate whether to enable MaterializedViews on the Cosmos DB account
     */
    @JsonProperty(value = "enableMaterializedViews")
    private Boolean enableMaterializedViews;

    /*
     * This property is ignored during the update operation, as the metadata is read-only. The object represents the
     * metadata for the Account Keys of the Cosmos DB account.
     */
    @JsonProperty(value = "keysMetadata", access = JsonProperty.Access.WRITE_ONLY)
    private DatabaseAccountKeysMetadata keysMetadata;

    /*
     * Flag to indicate enabling/disabling of Partition Merge feature on the account
     */
    @JsonProperty(value = "enablePartitionMerge")
    private Boolean enablePartitionMerge;

    /*
     * Flag to indicate enabling/disabling of Burst Capacity Preview feature on the account
     */
    @JsonProperty(value = "enableBurstCapacity")
    private Boolean enableBurstCapacity;

    /*
     * Indicates the minimum allowed Tls version. The default is Tls 1.0, except for Cassandra and Mongo API's, which
     * only work with Tls 1.2.
     */
    @JsonProperty(value = "minimalTlsVersion")
    private MinimalTlsVersion minimalTlsVersion;

    /*
     * Indicates the status of the Customer Managed Key feature on the account. In case there are errors, the property
     * provides troubleshooting guidance.
     */
    @JsonProperty(value = "customerManagedKeyStatus")
    private String customerManagedKeyStatus;

    /*
     * Flag to indicate enabling/disabling of Priority Based Execution Preview feature on the account
     */
    @JsonProperty(value = "enablePriorityBasedExecution")
    private Boolean enablePriorityBasedExecution;

    /*
     * Enum to indicate default Priority Level of request for Priority Based Execution.
     */
    @JsonProperty(value = "defaultPriorityLevel")
    private DefaultPriorityLevel defaultPriorityLevel;

    /**
     * Creates an instance of DatabaseAccountUpdateProperties class.
     */
    public DatabaseAccountUpdateProperties() {
    }

    /**
     * Get the consistencyPolicy property: The consistency policy for the Cosmos DB account.
     * 
     * @return the consistencyPolicy value.
     */
    public ConsistencyPolicy consistencyPolicy() {
        return this.consistencyPolicy;
    }

    /**
     * Set the consistencyPolicy property: The consistency policy for the Cosmos DB account.
     * 
     * @param consistencyPolicy the consistencyPolicy value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withConsistencyPolicy(ConsistencyPolicy consistencyPolicy) {
        this.consistencyPolicy = consistencyPolicy;
        return this;
    }

    /**
     * Get the locations property: An array that contains the georeplication locations enabled for the Cosmos DB
     * account.
     * 
     * @return the locations value.
     */
    public List<Location> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: An array that contains the georeplication locations enabled for the Cosmos DB
     * account.
     * 
     * @param locations the locations value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withLocations(List<Location> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the ipRules property: List of IpRules.
     * 
     * @return the ipRules value.
     */
    public List<IpAddressOrRange> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: List of IpRules.
     * 
     * @param ipRules the ipRules value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withIpRules(List<IpAddressOrRange> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Get the isVirtualNetworkFilterEnabled property: Flag to indicate whether to enable/disable Virtual Network ACL
     * rules.
     * 
     * @return the isVirtualNetworkFilterEnabled value.
     */
    public Boolean isVirtualNetworkFilterEnabled() {
        return this.isVirtualNetworkFilterEnabled;
    }

    /**
     * Set the isVirtualNetworkFilterEnabled property: Flag to indicate whether to enable/disable Virtual Network ACL
     * rules.
     * 
     * @param isVirtualNetworkFilterEnabled the isVirtualNetworkFilterEnabled value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withIsVirtualNetworkFilterEnabled(Boolean isVirtualNetworkFilterEnabled) {
        this.isVirtualNetworkFilterEnabled = isVirtualNetworkFilterEnabled;
        return this;
    }

    /**
     * Get the enableAutomaticFailover property: Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will result in a new write region for the account
     * and is chosen based on the failover priorities configured for the account.
     * 
     * @return the enableAutomaticFailover value.
     */
    public Boolean enableAutomaticFailover() {
        return this.enableAutomaticFailover;
    }

    /**
     * Set the enableAutomaticFailover property: Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will result in a new write region for the account
     * and is chosen based on the failover priorities configured for the account.
     * 
     * @param enableAutomaticFailover the enableAutomaticFailover value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withEnableAutomaticFailover(Boolean enableAutomaticFailover) {
        this.enableAutomaticFailover = enableAutomaticFailover;
        return this;
    }

    /**
     * Get the capabilities property: List of Cosmos DB capabilities for the account.
     * 
     * @return the capabilities value.
     */
    public List<Capability> capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: List of Cosmos DB capabilities for the account.
     * 
     * @param capabilities the capabilities value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withCapabilities(List<Capability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get the virtualNetworkRules property: List of Virtual Network ACL rules configured for the Cosmos DB account.
     * 
     * @return the virtualNetworkRules value.
     */
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set the virtualNetworkRules property: List of Virtual Network ACL rules configured for the Cosmos DB account.
     * 
     * @param virtualNetworkRules the virtualNetworkRules value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

    /**
     * Get the enableMultipleWriteLocations property: Enables the account to write in multiple locations.
     * 
     * @return the enableMultipleWriteLocations value.
     */
    public Boolean enableMultipleWriteLocations() {
        return this.enableMultipleWriteLocations;
    }

    /**
     * Set the enableMultipleWriteLocations property: Enables the account to write in multiple locations.
     * 
     * @param enableMultipleWriteLocations the enableMultipleWriteLocations value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withEnableMultipleWriteLocations(Boolean enableMultipleWriteLocations) {
        this.enableMultipleWriteLocations = enableMultipleWriteLocations;
        return this;
    }

    /**
     * Get the enableCassandraConnector property: Enables the cassandra connector on the Cosmos DB C* account.
     * 
     * @return the enableCassandraConnector value.
     */
    public Boolean enableCassandraConnector() {
        return this.enableCassandraConnector;
    }

    /**
     * Set the enableCassandraConnector property: Enables the cassandra connector on the Cosmos DB C* account.
     * 
     * @param enableCassandraConnector the enableCassandraConnector value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withEnableCassandraConnector(Boolean enableCassandraConnector) {
        this.enableCassandraConnector = enableCassandraConnector;
        return this;
    }

    /**
     * Get the connectorOffer property: The cassandra connector offer type for the Cosmos DB database C* account.
     * 
     * @return the connectorOffer value.
     */
    public ConnectorOffer connectorOffer() {
        return this.connectorOffer;
    }

    /**
     * Set the connectorOffer property: The cassandra connector offer type for the Cosmos DB database C* account.
     * 
     * @param connectorOffer the connectorOffer value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withConnectorOffer(ConnectorOffer connectorOffer) {
        this.connectorOffer = connectorOffer;
        return this;
    }

    /**
     * Get the disableKeyBasedMetadataWriteAccess property: Disable write operations on metadata resources (databases,
     * containers, throughput) via account keys.
     * 
     * @return the disableKeyBasedMetadataWriteAccess value.
     */
    public Boolean disableKeyBasedMetadataWriteAccess() {
        return this.disableKeyBasedMetadataWriteAccess;
    }

    /**
     * Set the disableKeyBasedMetadataWriteAccess property: Disable write operations on metadata resources (databases,
     * containers, throughput) via account keys.
     * 
     * @param disableKeyBasedMetadataWriteAccess the disableKeyBasedMetadataWriteAccess value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties
        withDisableKeyBasedMetadataWriteAccess(Boolean disableKeyBasedMetadataWriteAccess) {
        this.disableKeyBasedMetadataWriteAccess = disableKeyBasedMetadataWriteAccess;
        return this;
    }

    /**
     * Get the keyVaultKeyUri property: The URI of the key vault.
     * 
     * @return the keyVaultKeyUri value.
     */
    public String keyVaultKeyUri() {
        return this.keyVaultKeyUri;
    }

    /**
     * Set the keyVaultKeyUri property: The URI of the key vault.
     * 
     * @param keyVaultKeyUri the keyVaultKeyUri value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withKeyVaultKeyUri(String keyVaultKeyUri) {
        this.keyVaultKeyUri = keyVaultKeyUri;
        return this;
    }

    /**
     * Get the defaultIdentity property: The default identity for accessing key vault used in features like customer
     * managed keys. The default identity needs to be explicitly set by the users. It can be "FirstPartyIdentity",
     * "SystemAssignedIdentity" and more.
     * 
     * @return the defaultIdentity value.
     */
    public String defaultIdentity() {
        return this.defaultIdentity;
    }

    /**
     * Set the defaultIdentity property: The default identity for accessing key vault used in features like customer
     * managed keys. The default identity needs to be explicitly set by the users. It can be "FirstPartyIdentity",
     * "SystemAssignedIdentity" and more.
     * 
     * @param defaultIdentity the defaultIdentity value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withDefaultIdentity(String defaultIdentity) {
        this.defaultIdentity = defaultIdentity;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether requests from Public Network are allowed.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Whether requests from Public Network are allowed.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the enableFreeTier property: Flag to indicate whether Free Tier is enabled.
     * 
     * @return the enableFreeTier value.
     */
    public Boolean enableFreeTier() {
        return this.enableFreeTier;
    }

    /**
     * Set the enableFreeTier property: Flag to indicate whether Free Tier is enabled.
     * 
     * @param enableFreeTier the enableFreeTier value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withEnableFreeTier(Boolean enableFreeTier) {
        this.enableFreeTier = enableFreeTier;
        return this;
    }

    /**
     * Get the apiProperties property: API specific properties. Currently, supported only for MongoDB API.
     * 
     * @return the apiProperties value.
     */
    public ApiProperties apiProperties() {
        return this.apiProperties;
    }

    /**
     * Set the apiProperties property: API specific properties. Currently, supported only for MongoDB API.
     * 
     * @param apiProperties the apiProperties value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withApiProperties(ApiProperties apiProperties) {
        this.apiProperties = apiProperties;
        return this;
    }

    /**
     * Get the enableAnalyticalStorage property: Flag to indicate whether to enable storage analytics.
     * 
     * @return the enableAnalyticalStorage value.
     */
    public Boolean enableAnalyticalStorage() {
        return this.enableAnalyticalStorage;
    }

    /**
     * Set the enableAnalyticalStorage property: Flag to indicate whether to enable storage analytics.
     * 
     * @param enableAnalyticalStorage the enableAnalyticalStorage value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withEnableAnalyticalStorage(Boolean enableAnalyticalStorage) {
        this.enableAnalyticalStorage = enableAnalyticalStorage;
        return this;
    }

    /**
     * Get the analyticalStorageConfiguration property: Analytical storage specific properties.
     * 
     * @return the analyticalStorageConfiguration value.
     */
    public AnalyticalStorageConfiguration analyticalStorageConfiguration() {
        return this.analyticalStorageConfiguration;
    }

    /**
     * Set the analyticalStorageConfiguration property: Analytical storage specific properties.
     * 
     * @param analyticalStorageConfiguration the analyticalStorageConfiguration value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties
        withAnalyticalStorageConfiguration(AnalyticalStorageConfiguration analyticalStorageConfiguration) {
        this.analyticalStorageConfiguration = analyticalStorageConfiguration;
        return this;
    }

    /**
     * Get the backupPolicy property: The object representing the policy for taking backups on an account.
     * 
     * @return the backupPolicy value.
     */
    public BackupPolicy backupPolicy() {
        return this.backupPolicy;
    }

    /**
     * Set the backupPolicy property: The object representing the policy for taking backups on an account.
     * 
     * @param backupPolicy the backupPolicy value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withBackupPolicy(BackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }

    /**
     * Get the cors property: The CORS policy for the Cosmos DB database account.
     * 
     * @return the cors value.
     */
    public List<CorsPolicy> cors() {
        return this.cors;
    }

    /**
     * Set the cors property: The CORS policy for the Cosmos DB database account.
     * 
     * @param cors the cors value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withCors(List<CorsPolicy> cors) {
        this.cors = cors;
        return this;
    }

    /**
     * Get the networkAclBypass property: Indicates what services are allowed to bypass firewall checks.
     * 
     * @return the networkAclBypass value.
     */
    public NetworkAclBypass networkAclBypass() {
        return this.networkAclBypass;
    }

    /**
     * Set the networkAclBypass property: Indicates what services are allowed to bypass firewall checks.
     * 
     * @param networkAclBypass the networkAclBypass value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withNetworkAclBypass(NetworkAclBypass networkAclBypass) {
        this.networkAclBypass = networkAclBypass;
        return this;
    }

    /**
     * Get the networkAclBypassResourceIds property: An array that contains the Resource Ids for Network Acl Bypass for
     * the Cosmos DB account.
     * 
     * @return the networkAclBypassResourceIds value.
     */
    public List<String> networkAclBypassResourceIds() {
        return this.networkAclBypassResourceIds;
    }

    /**
     * Set the networkAclBypassResourceIds property: An array that contains the Resource Ids for Network Acl Bypass for
     * the Cosmos DB account.
     * 
     * @param networkAclBypassResourceIds the networkAclBypassResourceIds value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withNetworkAclBypassResourceIds(List<String> networkAclBypassResourceIds) {
        this.networkAclBypassResourceIds = networkAclBypassResourceIds;
        return this;
    }

    /**
     * Get the diagnosticLogSettings property: The Object representing the different Diagnostic log settings for the
     * Cosmos DB Account.
     * 
     * @return the diagnosticLogSettings value.
     */
    public DiagnosticLogSettings diagnosticLogSettings() {
        return this.diagnosticLogSettings;
    }

    /**
     * Set the diagnosticLogSettings property: The Object representing the different Diagnostic log settings for the
     * Cosmos DB Account.
     * 
     * @param diagnosticLogSettings the diagnosticLogSettings value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withDiagnosticLogSettings(DiagnosticLogSettings diagnosticLogSettings) {
        this.diagnosticLogSettings = diagnosticLogSettings;
        return this;
    }

    /**
     * Get the disableLocalAuth property: Opt-out of local authentication and ensure only MSI and AAD can be used
     * exclusively for authentication.
     * 
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.disableLocalAuth;
    }

    /**
     * Set the disableLocalAuth property: Opt-out of local authentication and ensure only MSI and AAD can be used
     * exclusively for authentication.
     * 
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withDisableLocalAuth(Boolean disableLocalAuth) {
        this.disableLocalAuth = disableLocalAuth;
        return this;
    }

    /**
     * Get the capacity property: The object that represents all properties related to capacity enforcement on an
     * account.
     * 
     * @return the capacity value.
     */
    public Capacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The object that represents all properties related to capacity enforcement on an
     * account.
     * 
     * @param capacity the capacity value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withCapacity(Capacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the enableMaterializedViews property: Flag to indicate whether to enable MaterializedViews on the Cosmos DB
     * account.
     * 
     * @return the enableMaterializedViews value.
     */
    public Boolean enableMaterializedViews() {
        return this.enableMaterializedViews;
    }

    /**
     * Set the enableMaterializedViews property: Flag to indicate whether to enable MaterializedViews on the Cosmos DB
     * account.
     * 
     * @param enableMaterializedViews the enableMaterializedViews value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withEnableMaterializedViews(Boolean enableMaterializedViews) {
        this.enableMaterializedViews = enableMaterializedViews;
        return this;
    }

    /**
     * Get the keysMetadata property: This property is ignored during the update operation, as the metadata is
     * read-only. The object represents the metadata for the Account Keys of the Cosmos DB account.
     * 
     * @return the keysMetadata value.
     */
    public DatabaseAccountKeysMetadata keysMetadata() {
        return this.keysMetadata;
    }

    /**
     * Get the enablePartitionMerge property: Flag to indicate enabling/disabling of Partition Merge feature on the
     * account.
     * 
     * @return the enablePartitionMerge value.
     */
    public Boolean enablePartitionMerge() {
        return this.enablePartitionMerge;
    }

    /**
     * Set the enablePartitionMerge property: Flag to indicate enabling/disabling of Partition Merge feature on the
     * account.
     * 
     * @param enablePartitionMerge the enablePartitionMerge value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withEnablePartitionMerge(Boolean enablePartitionMerge) {
        this.enablePartitionMerge = enablePartitionMerge;
        return this;
    }

    /**
     * Get the enableBurstCapacity property: Flag to indicate enabling/disabling of Burst Capacity Preview feature on
     * the account.
     * 
     * @return the enableBurstCapacity value.
     */
    public Boolean enableBurstCapacity() {
        return this.enableBurstCapacity;
    }

    /**
     * Set the enableBurstCapacity property: Flag to indicate enabling/disabling of Burst Capacity Preview feature on
     * the account.
     * 
     * @param enableBurstCapacity the enableBurstCapacity value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withEnableBurstCapacity(Boolean enableBurstCapacity) {
        this.enableBurstCapacity = enableBurstCapacity;
        return this;
    }

    /**
     * Get the minimalTlsVersion property: Indicates the minimum allowed Tls version. The default is Tls 1.0, except
     * for Cassandra and Mongo API's, which only work with Tls 1.2.
     * 
     * @return the minimalTlsVersion value.
     */
    public MinimalTlsVersion minimalTlsVersion() {
        return this.minimalTlsVersion;
    }

    /**
     * Set the minimalTlsVersion property: Indicates the minimum allowed Tls version. The default is Tls 1.0, except
     * for Cassandra and Mongo API's, which only work with Tls 1.2.
     * 
     * @param minimalTlsVersion the minimalTlsVersion value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withMinimalTlsVersion(MinimalTlsVersion minimalTlsVersion) {
        this.minimalTlsVersion = minimalTlsVersion;
        return this;
    }

    /**
     * Get the customerManagedKeyStatus property: Indicates the status of the Customer Managed Key feature on the
     * account. In case there are errors, the property provides troubleshooting guidance.
     * 
     * @return the customerManagedKeyStatus value.
     */
    public String customerManagedKeyStatus() {
        return this.customerManagedKeyStatus;
    }

    /**
     * Set the customerManagedKeyStatus property: Indicates the status of the Customer Managed Key feature on the
     * account. In case there are errors, the property provides troubleshooting guidance.
     * 
     * @param customerManagedKeyStatus the customerManagedKeyStatus value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withCustomerManagedKeyStatus(String customerManagedKeyStatus) {
        this.customerManagedKeyStatus = customerManagedKeyStatus;
        return this;
    }

    /**
     * Get the enablePriorityBasedExecution property: Flag to indicate enabling/disabling of Priority Based Execution
     * Preview feature on the account.
     * 
     * @return the enablePriorityBasedExecution value.
     */
    public Boolean enablePriorityBasedExecution() {
        return this.enablePriorityBasedExecution;
    }

    /**
     * Set the enablePriorityBasedExecution property: Flag to indicate enabling/disabling of Priority Based Execution
     * Preview feature on the account.
     * 
     * @param enablePriorityBasedExecution the enablePriorityBasedExecution value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withEnablePriorityBasedExecution(Boolean enablePriorityBasedExecution) {
        this.enablePriorityBasedExecution = enablePriorityBasedExecution;
        return this;
    }

    /**
     * Get the defaultPriorityLevel property: Enum to indicate default Priority Level of request for Priority Based
     * Execution.
     * 
     * @return the defaultPriorityLevel value.
     */
    public DefaultPriorityLevel defaultPriorityLevel() {
        return this.defaultPriorityLevel;
    }

    /**
     * Set the defaultPriorityLevel property: Enum to indicate default Priority Level of request for Priority Based
     * Execution.
     * 
     * @param defaultPriorityLevel the defaultPriorityLevel value to set.
     * @return the DatabaseAccountUpdateProperties object itself.
     */
    public DatabaseAccountUpdateProperties withDefaultPriorityLevel(DefaultPriorityLevel defaultPriorityLevel) {
        this.defaultPriorityLevel = defaultPriorityLevel;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (consistencyPolicy() != null) {
            consistencyPolicy().validate();
        }
        if (locations() != null) {
            locations().forEach(e -> e.validate());
        }
        if (ipRules() != null) {
            ipRules().forEach(e -> e.validate());
        }
        if (capabilities() != null) {
            capabilities().forEach(e -> e.validate());
        }
        if (virtualNetworkRules() != null) {
            virtualNetworkRules().forEach(e -> e.validate());
        }
        if (apiProperties() != null) {
            apiProperties().validate();
        }
        if (analyticalStorageConfiguration() != null) {
            analyticalStorageConfiguration().validate();
        }
        if (backupPolicy() != null) {
            backupPolicy().validate();
        }
        if (cors() != null) {
            cors().forEach(e -> e.validate());
        }
        if (diagnosticLogSettings() != null) {
            diagnosticLogSettings().validate();
        }
        if (capacity() != null) {
            capacity().validate();
        }
        if (keysMetadata() != null) {
            keysMetadata().validate();
        }
    }
}
