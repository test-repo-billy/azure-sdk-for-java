/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2019_01_01.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the ConsumptionManagementClientImpl class.
 */
public class ConsumptionManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Version of the API to be used with the client request. The current version is 2019-01-01. */
    private String apiVersion;

    /**
     * Gets Version of the API to be used with the client request. The current version is 2019-01-01.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** Azure Subscription ID. */
    private String subscriptionId;

    /**
     * Gets Azure Subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Azure Subscription ID.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public ConsumptionManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
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
    public ConsumptionManagementClientImpl withAcceptLanguage(String acceptLanguage) {
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
    public ConsumptionManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public ConsumptionManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The UsageDetailsInner object to access its operations.
     */
    private UsageDetailsInner usageDetails;

    /**
     * Gets the UsageDetailsInner object to access its operations.
     * @return the UsageDetailsInner object.
     */
    public UsageDetailsInner usageDetails() {
        return this.usageDetails;
    }

    /**
     * The MarketplacesInner object to access its operations.
     */
    private MarketplacesInner marketplaces;

    /**
     * Gets the MarketplacesInner object to access its operations.
     * @return the MarketplacesInner object.
     */
    public MarketplacesInner marketplaces() {
        return this.marketplaces;
    }

    /**
     * The BudgetsInner object to access its operations.
     */
    private BudgetsInner budgets;

    /**
     * Gets the BudgetsInner object to access its operations.
     * @return the BudgetsInner object.
     */
    public BudgetsInner budgets() {
        return this.budgets;
    }

    /**
     * The TagsInner object to access its operations.
     */
    private TagsInner tags;

    /**
     * Gets the TagsInner object to access its operations.
     * @return the TagsInner object.
     */
    public TagsInner tags() {
        return this.tags;
    }

    /**
     * The ChargesInner object to access its operations.
     */
    private ChargesInner charges;

    /**
     * Gets the ChargesInner object to access its operations.
     * @return the ChargesInner object.
     */
    public ChargesInner charges() {
        return this.charges;
    }

    /**
     * The BalancesInner object to access its operations.
     */
    private BalancesInner balances;

    /**
     * Gets the BalancesInner object to access its operations.
     * @return the BalancesInner object.
     */
    public BalancesInner balances() {
        return this.balances;
    }

    /**
     * The ReservationsSummariesInner object to access its operations.
     */
    private ReservationsSummariesInner reservationsSummaries;

    /**
     * Gets the ReservationsSummariesInner object to access its operations.
     * @return the ReservationsSummariesInner object.
     */
    public ReservationsSummariesInner reservationsSummaries() {
        return this.reservationsSummaries;
    }

    /**
     * The ReservationsDetailsInner object to access its operations.
     */
    private ReservationsDetailsInner reservationsDetails;

    /**
     * Gets the ReservationsDetailsInner object to access its operations.
     * @return the ReservationsDetailsInner object.
     */
    public ReservationsDetailsInner reservationsDetails() {
        return this.reservationsDetails;
    }

    /**
     * The ReservationRecommendationsInner object to access its operations.
     */
    private ReservationRecommendationsInner reservationRecommendations;

    /**
     * Gets the ReservationRecommendationsInner object to access its operations.
     * @return the ReservationRecommendationsInner object.
     */
    public ReservationRecommendationsInner reservationRecommendations() {
        return this.reservationRecommendations;
    }

    /**
     * The PriceSheetsInner object to access its operations.
     */
    private PriceSheetsInner priceSheets;

    /**
     * Gets the PriceSheetsInner object to access its operations.
     * @return the PriceSheetsInner object.
     */
    public PriceSheetsInner priceSheets() {
        return this.priceSheets;
    }

    /**
     * The ForecastsInner object to access its operations.
     */
    private ForecastsInner forecasts;

    /**
     * Gets the ForecastsInner object to access its operations.
     * @return the ForecastsInner object.
     */
    public ForecastsInner forecasts() {
        return this.forecasts;
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
     * The AggregatedCostsInner object to access its operations.
     */
    private AggregatedCostsInner aggregatedCosts;

    /**
     * Gets the AggregatedCostsInner object to access its operations.
     * @return the AggregatedCostsInner object.
     */
    public AggregatedCostsInner aggregatedCosts() {
        return this.aggregatedCosts;
    }

    /**
     * Initializes an instance of ConsumptionManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public ConsumptionManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of ConsumptionManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public ConsumptionManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of ConsumptionManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public ConsumptionManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2019-01-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.usageDetails = new UsageDetailsInner(restClient().retrofit(), this);
        this.marketplaces = new MarketplacesInner(restClient().retrofit(), this);
        this.budgets = new BudgetsInner(restClient().retrofit(), this);
        this.tags = new TagsInner(restClient().retrofit(), this);
        this.charges = new ChargesInner(restClient().retrofit(), this);
        this.balances = new BalancesInner(restClient().retrofit(), this);
        this.reservationsSummaries = new ReservationsSummariesInner(restClient().retrofit(), this);
        this.reservationsDetails = new ReservationsDetailsInner(restClient().retrofit(), this);
        this.reservationRecommendations = new ReservationRecommendationsInner(restClient().retrofit(), this);
        this.priceSheets = new PriceSheetsInner(restClient().retrofit(), this);
        this.forecasts = new ForecastsInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.aggregatedCosts = new AggregatedCostsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "ConsumptionManagementClient", "2019-01-01");
    }
}
