/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2016_10_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.keyvault.v2016_10_01.Vaults;
import com.microsoft.azure.management.keyvault.v2016_10_01.Operations;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure KeyVault resource management.
 */
public final class KeyVaultManager extends ManagerCore<KeyVaultManager, KeyVaultManagementClientImpl> {
    private Vaults vaults;
    private Operations operations;
    /**
    * Get a Configurable instance that can be used to create KeyVaultManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new KeyVaultManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of KeyVaultManager that exposes KeyVault resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the KeyVaultManager
    */
    public static KeyVaultManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new KeyVaultManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of KeyVaultManager that exposes KeyVault resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the KeyVaultManager
    */
    public static KeyVaultManager authenticate(RestClient restClient, String subscriptionId) {
        return new KeyVaultManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of KeyVaultManager that exposes KeyVault management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing KeyVault management API entry points that work across subscriptions
        */
        KeyVaultManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Vaults.
     */
    public Vaults vaults() {
        if (this.vaults == null) {
            this.vaults = new VaultsImpl(this);
        }
        return this.vaults;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public KeyVaultManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return KeyVaultManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private KeyVaultManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new KeyVaultManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
