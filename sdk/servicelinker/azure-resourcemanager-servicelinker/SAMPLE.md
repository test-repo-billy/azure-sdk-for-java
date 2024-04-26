# Code snippets and samples


## Linker

- [List](#linker_list)
- [ListConfigurations](#linker_listconfigurations)
- [Validate](#linker_validate)

## Operations

- [List](#operations_list)
### Linker_List

```java
/**
 * Samples for Linker List.
 */
public final class LinkerListSamples {
    /*
     * x-ms-original-file: specification/servicelinker/resource-manager/Microsoft.ServiceLinker/stable/2022-05-01/examples/LinkList.json
     */
    /**
     * Sample code: LinkList.
     * 
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void linkList(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager.linkers()
            .list(
                "subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.Web/sites/test-app",
                com.azure.core.util.Context.NONE);
    }
}
```

### Linker_ListConfigurations

```java
/**
 * Samples for Linker ListConfigurations.
 */
public final class LinkerListConfigurationsSamples {
    /*
     * x-ms-original-file: specification/servicelinker/resource-manager/Microsoft.ServiceLinker/stable/2022-05-01/examples/GetConfigurations.json
     */
    /**
     * Sample code: GetConfiguration.
     * 
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void getConfiguration(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager.linkers()
            .listConfigurationsWithResponse(
                "subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.Web/sites/test-app",
                "linkName", com.azure.core.util.Context.NONE);
    }
}
```

### Linker_Validate

```java
/**
 * Samples for Linker Validate.
 */
public final class LinkerValidateSamples {
    /*
     * x-ms-original-file: specification/servicelinker/resource-manager/Microsoft.ServiceLinker/stable/2022-05-01/examples/ValidateLinkSuccess.json
     */
    /**
     * Sample code: ValidateLinkSuccess.
     * 
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void validateLinkSuccess(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager.linkers()
            .validate(
                "subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.Web/sites/test-app",
                "linkName", com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/servicelinker/resource-manager/Microsoft.ServiceLinker/stable/2022-05-01/examples/OperationsList.json
     */
    /**
     * Sample code: GetConfiguration.
     * 
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void getConfiguration(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

