/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters to use for creating a Data Lake Analytics account.
 */
@JsonFlatten
public class CreateDataLakeAnalyticsAccountParameters {
    /**
     * The resource location.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * The resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The default Data Lake Store account associated with this account.
     */
    @JsonProperty(value = "properties.defaultDataLakeStoreAccount", required = true)
    private String defaultDataLakeStoreAccount;

    /**
     * The list of Data Lake Store accounts associated with this account.
     */
    @JsonProperty(value = "properties.dataLakeStoreAccounts", required = true)
    private List<AddDataLakeStoreWithAccountParameters> dataLakeStoreAccounts;

    /**
     * The list of Azure Blob Storage accounts associated with this account.
     */
    @JsonProperty(value = "properties.storageAccounts")
    private List<AddStorageAccountWithAccountParameters> storageAccounts;

    /**
     * The list of compute policies associated with this account.
     */
    @JsonProperty(value = "properties.computePolicies")
    private List<CreateComputePolicyWithAccountParameters> computePolicies;

    /**
     * The list of firewall rules associated with this account.
     */
    @JsonProperty(value = "properties.firewallRules")
    private List<CreateFirewallRuleWithAccountParameters> firewallRules;

    /**
     * The current state of the IP address firewall for this account. Possible
     * values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.firewallState")
    private FirewallState firewallState;

    /**
     * The current state of allowing or disallowing IPs originating within
     * Azure through the firewall. If the firewall is disabled, this is not
     * enforced. Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.firewallAllowAzureIps")
    private FirewallAllowAzureIpsState firewallAllowAzureIps;

    /**
     * The commitment tier for the next month. Possible values include:
     * 'Consumption', 'Commitment_100AUHours', 'Commitment_500AUHours',
     * 'Commitment_1000AUHours', 'Commitment_5000AUHours',
     * 'Commitment_10000AUHours', 'Commitment_50000AUHours',
     * 'Commitment_100000AUHours', 'Commitment_500000AUHours'.
     */
    @JsonProperty(value = "properties.newTier")
    private TierType newTier;

    /**
     * The maximum supported jobs running under the account at the same time.
     */
    @JsonProperty(value = "properties.maxJobCount")
    private Integer maxJobCount;

    /**
     * The maximum supported degree of parallelism for this account.
     */
    @JsonProperty(value = "properties.maxDegreeOfParallelism")
    private Integer maxDegreeOfParallelism;

    /**
     * The maximum supported degree of parallelism per job for this account.
     */
    @JsonProperty(value = "properties.maxDegreeOfParallelismPerJob")
    private Integer maxDegreeOfParallelismPerJob;

    /**
     * The minimum supported priority per job for this account.
     */
    @JsonProperty(value = "properties.minPriorityPerJob")
    private Integer minPriorityPerJob;

    /**
     * The number of days that job metadata is retained.
     */
    @JsonProperty(value = "properties.queryStoreRetention")
    private Integer queryStoreRetention;

    /**
     * Get the resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the resource location.
     *
     * @param location the location value to set
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the resource tags.
     *
     * @param tags the tags value to set
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the default Data Lake Store account associated with this account.
     *
     * @return the defaultDataLakeStoreAccount value
     */
    public String defaultDataLakeStoreAccount() {
        return this.defaultDataLakeStoreAccount;
    }

    /**
     * Set the default Data Lake Store account associated with this account.
     *
     * @param defaultDataLakeStoreAccount the defaultDataLakeStoreAccount value to set
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withDefaultDataLakeStoreAccount(String defaultDataLakeStoreAccount) {
        this.defaultDataLakeStoreAccount = defaultDataLakeStoreAccount;
        return this;
    }

    /**
     * Get the list of Data Lake Store accounts associated with this account.
     *
     * @return the dataLakeStoreAccounts value
     */
    public List<AddDataLakeStoreWithAccountParameters> dataLakeStoreAccounts() {
        return this.dataLakeStoreAccounts;
    }

    /**
     * Set the list of Data Lake Store accounts associated with this account.
     *
     * @param dataLakeStoreAccounts the dataLakeStoreAccounts value to set
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withDataLakeStoreAccounts(List<AddDataLakeStoreWithAccountParameters> dataLakeStoreAccounts) {
        this.dataLakeStoreAccounts = dataLakeStoreAccounts;
        return this;
    }

    /**
     * Get the list of Azure Blob Storage accounts associated with this account.
     *
     * @return the storageAccounts value
     */
    public List<AddStorageAccountWithAccountParameters> storageAccounts() {
        return this.storageAccounts;
    }

    /**
     * Set the list of Azure Blob Storage accounts associated with this account.
     *
     * @param storageAccounts the storageAccounts value to set
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withStorageAccounts(List<AddStorageAccountWithAccountParameters> storageAccounts) {
        this.storageAccounts = storageAccounts;
        return this;
    }

    /**
     * Get the list of compute policies associated with this account.
     *
     * @return the computePolicies value
     */
    public List<CreateComputePolicyWithAccountParameters> computePolicies() {
        return this.computePolicies;
    }

    /**
     * Set the list of compute policies associated with this account.
     *
     * @param computePolicies the computePolicies value to set
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withComputePolicies(List<CreateComputePolicyWithAccountParameters> computePolicies) {
        this.computePolicies = computePolicies;
        return this;
    }

    /**
     * Get the list of firewall rules associated with this account.
     *
     * @return the firewallRules value
     */
    public List<CreateFirewallRuleWithAccountParameters> firewallRules() {
        return this.firewallRules;
    }

    /**
     * Set the list of firewall rules associated with this account.
     *
     * @param firewallRules the firewallRules value to set
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withFirewallRules(List<CreateFirewallRuleWithAccountParameters> firewallRules) {
        this.firewallRules = firewallRules;
        return this;
    }

    /**
     * Get the current state of the IP address firewall for this account. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the firewallState value
     */
    public FirewallState firewallState() {
        return this.firewallState;
    }

    /**
     * Set the current state of the IP address firewall for this account. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param firewallState the firewallState value to set
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withFirewallState(FirewallState firewallState) {
        this.firewallState = firewallState;
        return this;
    }

    /**
     * Get the current state of allowing or disallowing IPs originating within Azure through the firewall. If the firewall is disabled, this is not enforced. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the firewallAllowAzureIps value
     */
    public FirewallAllowAzureIpsState firewallAllowAzureIps() {
        return this.firewallAllowAzureIps;
    }

    /**
     * Set the current state of allowing or disallowing IPs originating within Azure through the firewall. If the firewall is disabled, this is not enforced. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param firewallAllowAzureIps the firewallAllowAzureIps value to set
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withFirewallAllowAzureIps(FirewallAllowAzureIpsState firewallAllowAzureIps) {
        this.firewallAllowAzureIps = firewallAllowAzureIps;
        return this;
    }

    /**
     * Get the commitment tier for the next month. Possible values include: 'Consumption', 'Commitment_100AUHours', 'Commitment_500AUHours', 'Commitment_1000AUHours', 'Commitment_5000AUHours', 'Commitment_10000AUHours', 'Commitment_50000AUHours', 'Commitment_100000AUHours', 'Commitment_500000AUHours'.
     *
     * @return the newTier value
     */
    public TierType newTier() {
        return this.newTier;
    }

    /**
     * Set the commitment tier for the next month. Possible values include: 'Consumption', 'Commitment_100AUHours', 'Commitment_500AUHours', 'Commitment_1000AUHours', 'Commitment_5000AUHours', 'Commitment_10000AUHours', 'Commitment_50000AUHours', 'Commitment_100000AUHours', 'Commitment_500000AUHours'.
     *
     * @param newTier the newTier value to set
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withNewTier(TierType newTier) {
        this.newTier = newTier;
        return this;
    }

    /**
     * Get the maximum supported jobs running under the account at the same time.
     *
     * @return the maxJobCount value
     */
    public Integer maxJobCount() {
        return this.maxJobCount;
    }

    /**
     * Set the maximum supported jobs running under the account at the same time.
     *
     * @param maxJobCount the maxJobCount value to set
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withMaxJobCount(Integer maxJobCount) {
        this.maxJobCount = maxJobCount;
        return this;
    }

    /**
     * Get the maximum supported degree of parallelism for this account.
     *
     * @return the maxDegreeOfParallelism value
     */
    public Integer maxDegreeOfParallelism() {
        return this.maxDegreeOfParallelism;
    }

    /**
     * Set the maximum supported degree of parallelism for this account.
     *
     * @param maxDegreeOfParallelism the maxDegreeOfParallelism value to set
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withMaxDegreeOfParallelism(Integer maxDegreeOfParallelism) {
        this.maxDegreeOfParallelism = maxDegreeOfParallelism;
        return this;
    }

    /**
     * Get the maximum supported degree of parallelism per job for this account.
     *
     * @return the maxDegreeOfParallelismPerJob value
     */
    public Integer maxDegreeOfParallelismPerJob() {
        return this.maxDegreeOfParallelismPerJob;
    }

    /**
     * Set the maximum supported degree of parallelism per job for this account.
     *
     * @param maxDegreeOfParallelismPerJob the maxDegreeOfParallelismPerJob value to set
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withMaxDegreeOfParallelismPerJob(Integer maxDegreeOfParallelismPerJob) {
        this.maxDegreeOfParallelismPerJob = maxDegreeOfParallelismPerJob;
        return this;
    }

    /**
     * Get the minimum supported priority per job for this account.
     *
     * @return the minPriorityPerJob value
     */
    public Integer minPriorityPerJob() {
        return this.minPriorityPerJob;
    }

    /**
     * Set the minimum supported priority per job for this account.
     *
     * @param minPriorityPerJob the minPriorityPerJob value to set
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withMinPriorityPerJob(Integer minPriorityPerJob) {
        this.minPriorityPerJob = minPriorityPerJob;
        return this;
    }

    /**
     * Get the number of days that job metadata is retained.
     *
     * @return the queryStoreRetention value
     */
    public Integer queryStoreRetention() {
        return this.queryStoreRetention;
    }

    /**
     * Set the number of days that job metadata is retained.
     *
     * @param queryStoreRetention the queryStoreRetention value to set
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withQueryStoreRetention(Integer queryStoreRetention) {
        this.queryStoreRetention = queryStoreRetention;
        return this;
    }

}
