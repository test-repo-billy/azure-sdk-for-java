// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.healthcareapis.models.IotEventHubIngestionEndpointConfiguration;
import com.azure.resourcemanager.healthcareapis.models.IotMappingProperties;
import com.azure.resourcemanager.healthcareapis.models.ServiceManagedIdentityIdentity;
import com.azure.resourcemanager.healthcareapis.models.ServiceManagedIdentityType;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for IotConnectors CreateOrUpdate.
 */
public final class IotConnectorsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/healthcareapis/resource-manager/Microsoft.HealthcareApis/stable/2024-03-01/examples/iotconnectors/
     * iotconnector_Create.json
     */
    /**
     * Sample code: Create an IoT Connector.
     * 
     * @param manager Entry point to HealthcareApisManager.
     */
    public static void createAnIoTConnector(com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager)
        throws IOException {
        manager.iotConnectors().define("blue").withExistingWorkspace("testRG", "workspace1").withRegion("westus")
            .withTags(mapOf("additionalProp1", "string", "additionalProp2", "string", "additionalProp3", "string"))
            .withIdentity(new ServiceManagedIdentityIdentity().withType(ServiceManagedIdentityType.SYSTEM_ASSIGNED))
            .withIngestionEndpointConfiguration(new IotEventHubIngestionEndpointConfiguration()
                .withEventHubName("MyEventHubName").withConsumerGroup("ConsumerGroupA")
                .withFullyQualifiedEventHubNamespace("myeventhub.servicesbus.windows.net"))
            .withDeviceMapping(new IotMappingProperties()
                .withContent(SerializerFactory.createDefaultManagementSerializerAdapter().deserialize(
                    "{\"template\":[{\"template\":{\"deviceIdExpression\":\"$.deviceid\",\"timestampExpression\":\"$.measurementdatetime\",\"typeMatchExpression\":\"$..[?(@heartrate)]\",\"typeName\":\"heartrate\",\"values\":[{\"required\":\"true\",\"valueExpression\":\"$.heartrate\",\"valueName\":\"hr\"}]},\"templateType\":\"JsonPathContent\"}],\"templateType\":\"CollectionContent\"}",
                    Object.class, SerializerEncoding.JSON)))
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
