// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.resourcemanager.appservice.generated.fluent.models.SiteConfigInner;
import com.azure.resourcemanager.appservice.generated.models.AuthenticationType;
import com.azure.resourcemanager.appservice.generated.models.CloningInfo;
import com.azure.resourcemanager.appservice.generated.models.FunctionAppConfig;
import com.azure.resourcemanager.appservice.generated.models.FunctionsAlwaysReadyConfig;
import com.azure.resourcemanager.appservice.generated.models.FunctionsDeployment;
import com.azure.resourcemanager.appservice.generated.models.FunctionsDeploymentStorage;
import com.azure.resourcemanager.appservice.generated.models.FunctionsDeploymentStorageAuthentication;
import com.azure.resourcemanager.appservice.generated.models.FunctionsRuntime;
import com.azure.resourcemanager.appservice.generated.models.FunctionsScaleAndConcurrency;
import com.azure.resourcemanager.appservice.generated.models.FunctionsScaleAndConcurrencyTriggers;
import com.azure.resourcemanager.appservice.generated.models.FunctionsScaleAndConcurrencyTriggersHttp;
import com.azure.resourcemanager.appservice.generated.models.NameValuePair;
import com.azure.resourcemanager.appservice.generated.models.RuntimeName;
import com.azure.resourcemanager.appservice.generated.models.StorageType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for WebApps CreateOrUpdate.
 */
public final class WebAppsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/CreateOrUpdateFunctionAppFlexConsumptionWithDetails.json
     */
    /**
     * Sample code: Create or Update Flex Consumption function app with details.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void createOrUpdateFlexConsumptionFunctionAppWithDetails(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.webApps()
            .define("sitef6141")
            .withRegion("East US")
            .withExistingResourceGroup("testrg123")
            .withKind("functionapp,linux")
            .withSiteConfig(new SiteConfigInner().withAppSettings(Arrays.asList(new NameValuePair()
                .withName("AzureWebJobsStorage")
                .withValue(
                    "DefaultEndpointsProtocol=https;AccountName=StorageAccountName;AccountKey=Sanitized;EndpointSuffix=core.windows.net"),
                new NameValuePair().withName("APPLICATIONINSIGHTS_CONNECTION_STRING")
                    .withValue("InstrumentationKey=Sanitized;IngestionEndpoint=Sanitized;LiveEndpoint=Sanitized"))))
            .withFunctionAppConfig(new FunctionAppConfig()
                .withDeployment(new FunctionsDeployment()
                    .withStorage(new FunctionsDeploymentStorage().withType(StorageType.BLOB_CONTAINER)
                        .withValue("https://storageAccountName.blob.core.windows.net/containername")
                        .withAuthentication(new FunctionsDeploymentStorageAuthentication()
                            .withType(AuthenticationType.STORAGE_ACCOUNT_CONNECTION_STRING)
                            .withStorageAccountConnectionStringName("TheAppSettingName"))))
                .withRuntime(new FunctionsRuntime().withName(RuntimeName.PYTHON).withVersion("3.11"))
                .withScaleAndConcurrency(new FunctionsScaleAndConcurrency()
                    .withAlwaysReady(
                        Arrays.asList(new FunctionsAlwaysReadyConfig().withName("http").withInstanceCount(2.0F)))
                    .withMaximumInstanceCount(100.0F)
                    .withInstanceMemoryMB(2048.0F)
                    .withTriggers(new FunctionsScaleAndConcurrencyTriggers()
                        .withHttp(new FunctionsScaleAndConcurrencyTriggersHttp().withPerInstanceConcurrency(16.0F)))))
            .create();
    }

    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/CreateOrUpdateFunctionAppFlexConsumption.json
     */
    /**
     * Sample code: Create or Update Flex Consumption function app.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void createOrUpdateFlexConsumptionFunctionApp(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.webApps()
            .define("sitef6141")
            .withRegion("East US")
            .withExistingResourceGroup("testrg123")
            .withKind("functionapp,linux")
            .withSiteConfig(new SiteConfigInner().withAppSettings(Arrays.asList(new NameValuePair()
                .withName("AzureWebJobsStorage")
                .withValue(
                    "DefaultEndpointsProtocol=https;AccountName=StorageAccountName;AccountKey=Sanitized;EndpointSuffix=core.windows.net"),
                new NameValuePair().withName("APPLICATIONINSIGHTS_CONNECTION_STRING")
                    .withValue("InstrumentationKey=Sanitized;IngestionEndpoint=Sanitized;LiveEndpoint=Sanitized"))))
            .withFunctionAppConfig(new FunctionAppConfig()
                .withDeployment(new FunctionsDeployment()
                    .withStorage(new FunctionsDeploymentStorage().withType(StorageType.BLOB_CONTAINER)
                        .withValue("https://storageAccountName.blob.core.windows.net/containername")
                        .withAuthentication(new FunctionsDeploymentStorageAuthentication()
                            .withType(AuthenticationType.STORAGE_ACCOUNT_CONNECTION_STRING)
                            .withStorageAccountConnectionStringName("TheAppSettingName"))))
                .withRuntime(new FunctionsRuntime().withName(RuntimeName.PYTHON).withVersion("3.11"))
                .withScaleAndConcurrency(
                    new FunctionsScaleAndConcurrency().withMaximumInstanceCount(100.0F).withInstanceMemoryMB(2048.0F)))
            .create();
    }

    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/CreateOrUpdateWebApp.json
     */
    /**
     * Sample code: Create or Update web app.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void createOrUpdateWebApp(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.webApps()
            .define("sitef6141")
            .withRegion("East US")
            .withExistingResourceGroup("testrg123")
            .withKind("app")
            .withServerFarmId(
                "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testrg123/providers/Microsoft.Web/serverfarms/DefaultAsp")
            .create();
    }

    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/CloneWebApp.json
     */
    /**
     * Sample code: Clone web app.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void cloneWebApp(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.webApps()
            .define("sitef6141")
            .withRegion("East US")
            .withExistingResourceGroup("testrg123")
            .withKind("app")
            .withCloningInfo(new CloningInfo().withOverwrite(false)
                .withCloneCustomHostNames(true)
                .withCloneSourceControl(true)
                .withSourceWebAppId(
                    "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testrg456/providers/Microsoft.Web/sites/srcsiteg478")
                .withSourceWebAppLocation("West Europe")
                .withHostingEnvironment(
                    "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testrg456/providers/Microsoft.Web/hostingenvironments/aseforsites")
                .withAppSettingsOverrides(mapOf("Setting1", "NewValue1", "Setting3", "NewValue5"))
                .withConfigureLoadBalancing(false))
            .create();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
