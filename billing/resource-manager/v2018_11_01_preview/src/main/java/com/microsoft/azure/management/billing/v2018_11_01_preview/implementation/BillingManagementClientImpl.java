/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the BillingManagementClientImpl class.
 */
public class BillingManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Version of the API to be used with the client request. The current version is 2018-11-01-preview. */
    private String apiVersion;

    /**
     * Gets Version of the API to be used with the client request. The current version is 2018-11-01-preview.
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
    public BillingManagementClientImpl withSubscriptionId(String subscriptionId) {
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
    public BillingManagementClientImpl withAcceptLanguage(String acceptLanguage) {
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
    public BillingManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public BillingManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The BillingAccountsInner object to access its operations.
     */
    private BillingAccountsInner billingAccounts;

    /**
     * Gets the BillingAccountsInner object to access its operations.
     * @return the BillingAccountsInner object.
     */
    public BillingAccountsInner billingAccounts() {
        return this.billingAccounts;
    }

    /**
     * The PaymentMethodsInner object to access its operations.
     */
    private PaymentMethodsInner paymentMethods;

    /**
     * Gets the PaymentMethodsInner object to access its operations.
     * @return the PaymentMethodsInner object.
     */
    public PaymentMethodsInner paymentMethods() {
        return this.paymentMethods;
    }

    /**
     * The AddressesInner object to access its operations.
     */
    private AddressesInner addresses;

    /**
     * Gets the AddressesInner object to access its operations.
     * @return the AddressesInner object.
     */
    public AddressesInner addresses() {
        return this.addresses;
    }

    /**
     * The AvailableBalancesInner object to access its operations.
     */
    private AvailableBalancesInner availableBalances;

    /**
     * Gets the AvailableBalancesInner object to access its operations.
     * @return the AvailableBalancesInner object.
     */
    public AvailableBalancesInner availableBalances() {
        return this.availableBalances;
    }

    /**
     * The BillingProfilesInner object to access its operations.
     */
    private BillingProfilesInner billingProfiles;

    /**
     * Gets the BillingProfilesInner object to access its operations.
     * @return the BillingProfilesInner object.
     */
    public BillingProfilesInner billingProfiles() {
        return this.billingProfiles;
    }

    /**
     * The InvoiceSectionsInner object to access its operations.
     */
    private InvoiceSectionsInner invoiceSections;

    /**
     * Gets the InvoiceSectionsInner object to access its operations.
     * @return the InvoiceSectionsInner object.
     */
    public InvoiceSectionsInner invoiceSections() {
        return this.invoiceSections;
    }

    /**
     * The DepartmentsInner object to access its operations.
     */
    private DepartmentsInner departments;

    /**
     * Gets the DepartmentsInner object to access its operations.
     * @return the DepartmentsInner object.
     */
    public DepartmentsInner departments() {
        return this.departments;
    }

    /**
     * The EnrollmentAccountsInner object to access its operations.
     */
    private EnrollmentAccountsInner enrollmentAccounts;

    /**
     * Gets the EnrollmentAccountsInner object to access its operations.
     * @return the EnrollmentAccountsInner object.
     */
    public EnrollmentAccountsInner enrollmentAccounts() {
        return this.enrollmentAccounts;
    }

    /**
     * The InvoicesInner object to access its operations.
     */
    private InvoicesInner invoices;

    /**
     * Gets the InvoicesInner object to access its operations.
     * @return the InvoicesInner object.
     */
    public InvoicesInner invoices() {
        return this.invoices;
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
     * The BillingSubscriptionsInner object to access its operations.
     */
    private BillingSubscriptionsInner billingSubscriptions;

    /**
     * Gets the BillingSubscriptionsInner object to access its operations.
     * @return the BillingSubscriptionsInner object.
     */
    public BillingSubscriptionsInner billingSubscriptions() {
        return this.billingSubscriptions;
    }

    /**
     * The ProductsInner object to access its operations.
     */
    private ProductsInner products;

    /**
     * Gets the ProductsInner object to access its operations.
     * @return the ProductsInner object.
     */
    public ProductsInner products() {
        return this.products;
    }

    /**
     * The TransactionsInner object to access its operations.
     */
    private TransactionsInner transactions;

    /**
     * Gets the TransactionsInner object to access its operations.
     * @return the TransactionsInner object.
     */
    public TransactionsInner transactions() {
        return this.transactions;
    }

    /**
     * The PoliciesInner object to access its operations.
     */
    private PoliciesInner policies;

    /**
     * Gets the PoliciesInner object to access its operations.
     * @return the PoliciesInner object.
     */
    public PoliciesInner policies() {
        return this.policies;
    }

    /**
     * The BillingPropertysInner object to access its operations.
     */
    private BillingPropertysInner billingPropertys;

    /**
     * Gets the BillingPropertysInner object to access its operations.
     * @return the BillingPropertysInner object.
     */
    public BillingPropertysInner billingPropertys() {
        return this.billingPropertys;
    }

    /**
     * The TransfersInner object to access its operations.
     */
    private TransfersInner transfers;

    /**
     * Gets the TransfersInner object to access its operations.
     * @return the TransfersInner object.
     */
    public TransfersInner transfers() {
        return this.transfers;
    }

    /**
     * The RecipientTransfersInner object to access its operations.
     */
    private RecipientTransfersInner recipientTransfers;

    /**
     * Gets the RecipientTransfersInner object to access its operations.
     * @return the RecipientTransfersInner object.
     */
    public RecipientTransfersInner recipientTransfers() {
        return this.recipientTransfers;
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
     * The BillingPermissionsInner object to access its operations.
     */
    private BillingPermissionsInner billingPermissions;

    /**
     * Gets the BillingPermissionsInner object to access its operations.
     * @return the BillingPermissionsInner object.
     */
    public BillingPermissionsInner billingPermissions() {
        return this.billingPermissions;
    }

    /**
     * The BillingRoleDefinitionsInner object to access its operations.
     */
    private BillingRoleDefinitionsInner billingRoleDefinitions;

    /**
     * Gets the BillingRoleDefinitionsInner object to access its operations.
     * @return the BillingRoleDefinitionsInner object.
     */
    public BillingRoleDefinitionsInner billingRoleDefinitions() {
        return this.billingRoleDefinitions;
    }

    /**
     * The BillingRoleAssignmentsInner object to access its operations.
     */
    private BillingRoleAssignmentsInner billingRoleAssignments;

    /**
     * Gets the BillingRoleAssignmentsInner object to access its operations.
     * @return the BillingRoleAssignmentsInner object.
     */
    public BillingRoleAssignmentsInner billingRoleAssignments() {
        return this.billingRoleAssignments;
    }

    /**
     * The AgreementsInner object to access its operations.
     */
    private AgreementsInner agreements;

    /**
     * Gets the AgreementsInner object to access its operations.
     * @return the AgreementsInner object.
     */
    public AgreementsInner agreements() {
        return this.agreements;
    }

    /**
     * The LineOfCreditsInner object to access its operations.
     */
    private LineOfCreditsInner lineOfCredits;

    /**
     * Gets the LineOfCreditsInner object to access its operations.
     * @return the LineOfCreditsInner object.
     */
    public LineOfCreditsInner lineOfCredits() {
        return this.lineOfCredits;
    }

    /**
     * Initializes an instance of BillingManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public BillingManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of BillingManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public BillingManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of BillingManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public BillingManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2018-11-01-preview";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.billingAccounts = new BillingAccountsInner(restClient().retrofit(), this);
        this.paymentMethods = new PaymentMethodsInner(restClient().retrofit(), this);
        this.addresses = new AddressesInner(restClient().retrofit(), this);
        this.availableBalances = new AvailableBalancesInner(restClient().retrofit(), this);
        this.billingProfiles = new BillingProfilesInner(restClient().retrofit(), this);
        this.invoiceSections = new InvoiceSectionsInner(restClient().retrofit(), this);
        this.departments = new DepartmentsInner(restClient().retrofit(), this);
        this.enrollmentAccounts = new EnrollmentAccountsInner(restClient().retrofit(), this);
        this.invoices = new InvoicesInner(restClient().retrofit(), this);
        this.priceSheets = new PriceSheetsInner(restClient().retrofit(), this);
        this.billingSubscriptions = new BillingSubscriptionsInner(restClient().retrofit(), this);
        this.products = new ProductsInner(restClient().retrofit(), this);
        this.transactions = new TransactionsInner(restClient().retrofit(), this);
        this.policies = new PoliciesInner(restClient().retrofit(), this);
        this.billingPropertys = new BillingPropertysInner(restClient().retrofit(), this);
        this.transfers = new TransfersInner(restClient().retrofit(), this);
        this.recipientTransfers = new RecipientTransfersInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.billingPermissions = new BillingPermissionsInner(restClient().retrofit(), this);
        this.billingRoleDefinitions = new BillingRoleDefinitionsInner(restClient().retrofit(), this);
        this.billingRoleAssignments = new BillingRoleAssignmentsInner(restClient().retrofit(), this);
        this.agreements = new AgreementsInner(restClient().retrofit(), this);
        this.lineOfCredits = new LineOfCreditsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "BillingManagementClient", "2018-11-01-preview");
    }
}
