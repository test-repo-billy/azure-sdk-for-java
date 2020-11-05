/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;

/**
 * Initializes a new instance of the SiteRecoveryManagementClientImpl class.
 */
public class SiteRecoveryManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The subscription Id. */
    private String subscriptionId;

    /**
     * Gets The subscription Id.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription Id.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public SiteRecoveryManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The name of the resource group where the recovery services vault is present. */
    private String resourceGroupName;

    /**
     * Gets The name of the resource group where the recovery services vault is present.
     *
     * @return the resourceGroupName value.
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Sets The name of the resource group where the recovery services vault is present.
     *
     * @param resourceGroupName the resourceGroupName value.
     * @return the service client itself
     */
    public SiteRecoveryManagementClientImpl withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /** The name of the recovery services vault. */
    private String resourceName;

    /**
     * Gets The name of the recovery services vault.
     *
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Sets The name of the recovery services vault.
     *
     * @param resourceName the resourceName value.
     * @return the service client itself
     */
    public SiteRecoveryManagementClientImpl withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /** Client Api Version. */
    private String apiVersion;

    /**
     * Gets Client Api Version.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public SiteRecoveryManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public SiteRecoveryManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public SiteRecoveryManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The ReplicationAlertSettingsInner object to access its operations.
     */
    private ReplicationAlertSettingsInner replicationAlertSettings;

    /**
     * Gets the ReplicationAlertSettingsInner object to access its operations.
     * @return the ReplicationAlertSettingsInner object.
     */
    public ReplicationAlertSettingsInner replicationAlertSettings() {
        return this.replicationAlertSettings;
    }

    /**
     * The ReplicationEventsInner object to access its operations.
     */
    private ReplicationEventsInner replicationEvents;

    /**
     * Gets the ReplicationEventsInner object to access its operations.
     * @return the ReplicationEventsInner object.
     */
    public ReplicationEventsInner replicationEvents() {
        return this.replicationEvents;
    }

    /**
     * The ReplicationFabricsInner object to access its operations.
     */
    private ReplicationFabricsInner replicationFabrics;

    /**
     * Gets the ReplicationFabricsInner object to access its operations.
     * @return the ReplicationFabricsInner object.
     */
    public ReplicationFabricsInner replicationFabrics() {
        return this.replicationFabrics;
    }

    /**
     * The ReplicationLogicalNetworksInner object to access its operations.
     */
    private ReplicationLogicalNetworksInner replicationLogicalNetworks;

    /**
     * Gets the ReplicationLogicalNetworksInner object to access its operations.
     * @return the ReplicationLogicalNetworksInner object.
     */
    public ReplicationLogicalNetworksInner replicationLogicalNetworks() {
        return this.replicationLogicalNetworks;
    }

    /**
     * The ReplicationNetworksInner object to access its operations.
     */
    private ReplicationNetworksInner replicationNetworks;

    /**
     * Gets the ReplicationNetworksInner object to access its operations.
     * @return the ReplicationNetworksInner object.
     */
    public ReplicationNetworksInner replicationNetworks() {
        return this.replicationNetworks;
    }

    /**
     * The ReplicationNetworkMappingsInner object to access its operations.
     */
    private ReplicationNetworkMappingsInner replicationNetworkMappings;

    /**
     * Gets the ReplicationNetworkMappingsInner object to access its operations.
     * @return the ReplicationNetworkMappingsInner object.
     */
    public ReplicationNetworkMappingsInner replicationNetworkMappings() {
        return this.replicationNetworkMappings;
    }

    /**
     * The ReplicationProtectionContainersInner object to access its operations.
     */
    private ReplicationProtectionContainersInner replicationProtectionContainers;

    /**
     * Gets the ReplicationProtectionContainersInner object to access its operations.
     * @return the ReplicationProtectionContainersInner object.
     */
    public ReplicationProtectionContainersInner replicationProtectionContainers() {
        return this.replicationProtectionContainers;
    }

    /**
     * The ReplicationMigrationItemsInner object to access its operations.
     */
    private ReplicationMigrationItemsInner replicationMigrationItems;

    /**
     * Gets the ReplicationMigrationItemsInner object to access its operations.
     * @return the ReplicationMigrationItemsInner object.
     */
    public ReplicationMigrationItemsInner replicationMigrationItems() {
        return this.replicationMigrationItems;
    }

    /**
     * The MigrationRecoveryPointsInner object to access its operations.
     */
    private MigrationRecoveryPointsInner migrationRecoveryPoints;

    /**
     * Gets the MigrationRecoveryPointsInner object to access its operations.
     * @return the MigrationRecoveryPointsInner object.
     */
    public MigrationRecoveryPointsInner migrationRecoveryPoints() {
        return this.migrationRecoveryPoints;
    }

    /**
     * The ReplicationProtectableItemsInner object to access its operations.
     */
    private ReplicationProtectableItemsInner replicationProtectableItems;

    /**
     * Gets the ReplicationProtectableItemsInner object to access its operations.
     * @return the ReplicationProtectableItemsInner object.
     */
    public ReplicationProtectableItemsInner replicationProtectableItems() {
        return this.replicationProtectableItems;
    }

    /**
     * The ReplicationProtectedItemsInner object to access its operations.
     */
    private ReplicationProtectedItemsInner replicationProtectedItems;

    /**
     * Gets the ReplicationProtectedItemsInner object to access its operations.
     * @return the ReplicationProtectedItemsInner object.
     */
    public ReplicationProtectedItemsInner replicationProtectedItems() {
        return this.replicationProtectedItems;
    }

    /**
     * The RecoveryPointsInner object to access its operations.
     */
    private RecoveryPointsInner recoveryPoints;

    /**
     * Gets the RecoveryPointsInner object to access its operations.
     * @return the RecoveryPointsInner object.
     */
    public RecoveryPointsInner recoveryPoints() {
        return this.recoveryPoints;
    }

    /**
     * The TargetComputeSizesInner object to access its operations.
     */
    private TargetComputeSizesInner targetComputeSizes;

    /**
     * Gets the TargetComputeSizesInner object to access its operations.
     * @return the TargetComputeSizesInner object.
     */
    public TargetComputeSizesInner targetComputeSizes() {
        return this.targetComputeSizes;
    }

    /**
     * The ReplicationProtectionContainerMappingsInner object to access its operations.
     */
    private ReplicationProtectionContainerMappingsInner replicationProtectionContainerMappings;

    /**
     * Gets the ReplicationProtectionContainerMappingsInner object to access its operations.
     * @return the ReplicationProtectionContainerMappingsInner object.
     */
    public ReplicationProtectionContainerMappingsInner replicationProtectionContainerMappings() {
        return this.replicationProtectionContainerMappings;
    }

    /**
     * The ReplicationRecoveryServicesProvidersInner object to access its operations.
     */
    private ReplicationRecoveryServicesProvidersInner replicationRecoveryServicesProviders;

    /**
     * Gets the ReplicationRecoveryServicesProvidersInner object to access its operations.
     * @return the ReplicationRecoveryServicesProvidersInner object.
     */
    public ReplicationRecoveryServicesProvidersInner replicationRecoveryServicesProviders() {
        return this.replicationRecoveryServicesProviders;
    }

    /**
     * The ReplicationStorageClassificationsInner object to access its operations.
     */
    private ReplicationStorageClassificationsInner replicationStorageClassifications;

    /**
     * Gets the ReplicationStorageClassificationsInner object to access its operations.
     * @return the ReplicationStorageClassificationsInner object.
     */
    public ReplicationStorageClassificationsInner replicationStorageClassifications() {
        return this.replicationStorageClassifications;
    }

    /**
     * The ReplicationStorageClassificationMappingsInner object to access its operations.
     */
    private ReplicationStorageClassificationMappingsInner replicationStorageClassificationMappings;

    /**
     * Gets the ReplicationStorageClassificationMappingsInner object to access its operations.
     * @return the ReplicationStorageClassificationMappingsInner object.
     */
    public ReplicationStorageClassificationMappingsInner replicationStorageClassificationMappings() {
        return this.replicationStorageClassificationMappings;
    }

    /**
     * The ReplicationvCentersInner object to access its operations.
     */
    private ReplicationvCentersInner replicationvCenters;

    /**
     * Gets the ReplicationvCentersInner object to access its operations.
     * @return the ReplicationvCentersInner object.
     */
    public ReplicationvCentersInner replicationvCenters() {
        return this.replicationvCenters;
    }

    /**
     * The ReplicationJobsInner object to access its operations.
     */
    private ReplicationJobsInner replicationJobs;

    /**
     * Gets the ReplicationJobsInner object to access its operations.
     * @return the ReplicationJobsInner object.
     */
    public ReplicationJobsInner replicationJobs() {
        return this.replicationJobs;
    }

    /**
     * The ReplicationPoliciesInner object to access its operations.
     */
    private ReplicationPoliciesInner replicationPolicies;

    /**
     * Gets the ReplicationPoliciesInner object to access its operations.
     * @return the ReplicationPoliciesInner object.
     */
    public ReplicationPoliciesInner replicationPolicies() {
        return this.replicationPolicies;
    }

    /**
     * The ReplicationRecoveryPlansInner object to access its operations.
     */
    private ReplicationRecoveryPlansInner replicationRecoveryPlans;

    /**
     * Gets the ReplicationRecoveryPlansInner object to access its operations.
     * @return the ReplicationRecoveryPlansInner object.
     */
    public ReplicationRecoveryPlansInner replicationRecoveryPlans() {
        return this.replicationRecoveryPlans;
    }

    /**
     * The ReplicationVaultHealthsInner object to access its operations.
     */
    private ReplicationVaultHealthsInner replicationVaultHealths;

    /**
     * Gets the ReplicationVaultHealthsInner object to access its operations.
     * @return the ReplicationVaultHealthsInner object.
     */
    public ReplicationVaultHealthsInner replicationVaultHealths() {
        return this.replicationVaultHealths;
    }

    /**
     * Initializes an instance of SiteRecoveryManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public SiteRecoveryManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of SiteRecoveryManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public SiteRecoveryManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of SiteRecoveryManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public SiteRecoveryManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2018-01-10";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.replicationAlertSettings = new ReplicationAlertSettingsInner(restClient().retrofit(), this);
        this.replicationEvents = new ReplicationEventsInner(restClient().retrofit(), this);
        this.replicationFabrics = new ReplicationFabricsInner(restClient().retrofit(), this);
        this.replicationLogicalNetworks = new ReplicationLogicalNetworksInner(restClient().retrofit(), this);
        this.replicationNetworks = new ReplicationNetworksInner(restClient().retrofit(), this);
        this.replicationNetworkMappings = new ReplicationNetworkMappingsInner(restClient().retrofit(), this);
        this.replicationProtectionContainers = new ReplicationProtectionContainersInner(restClient().retrofit(), this);
        this.replicationMigrationItems = new ReplicationMigrationItemsInner(restClient().retrofit(), this);
        this.migrationRecoveryPoints = new MigrationRecoveryPointsInner(restClient().retrofit(), this);
        this.replicationProtectableItems = new ReplicationProtectableItemsInner(restClient().retrofit(), this);
        this.replicationProtectedItems = new ReplicationProtectedItemsInner(restClient().retrofit(), this);
        this.recoveryPoints = new RecoveryPointsInner(restClient().retrofit(), this);
        this.targetComputeSizes = new TargetComputeSizesInner(restClient().retrofit(), this);
        this.replicationProtectionContainerMappings = new ReplicationProtectionContainerMappingsInner(restClient().retrofit(), this);
        this.replicationRecoveryServicesProviders = new ReplicationRecoveryServicesProvidersInner(restClient().retrofit(), this);
        this.replicationStorageClassifications = new ReplicationStorageClassificationsInner(restClient().retrofit(), this);
        this.replicationStorageClassificationMappings = new ReplicationStorageClassificationMappingsInner(restClient().retrofit(), this);
        this.replicationvCenters = new ReplicationvCentersInner(restClient().retrofit(), this);
        this.replicationJobs = new ReplicationJobsInner(restClient().retrofit(), this);
        this.replicationPolicies = new ReplicationPoliciesInner(restClient().retrofit(), this);
        this.replicationRecoveryPlans = new ReplicationRecoveryPlansInner(restClient().retrofit(), this);
        this.replicationVaultHealths = new ReplicationVaultHealthsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "SiteRecoveryManagementClient", "2018-01-10");
    }
}
