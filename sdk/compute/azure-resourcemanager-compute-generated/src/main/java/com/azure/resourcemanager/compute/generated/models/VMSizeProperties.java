// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies VM Size Property settings on the virtual machine.
 */
@Fluent
public final class VMSizeProperties {
    /*
     * Specifies the number of vCPUs available for the VM. When this property is not specified in the request body the default behavior is to set it to the value of vCPUs available for that VM size exposed in api response of [List all available virtual machine sizes in a region](https://docs.microsoft.com/en-us/rest/api/compute/resource-skus/list).
     */
    @JsonProperty(value = "vCPUsAvailable")
    private Integer vCpusAvailable;

    /*
     * Specifies the vCPU to physical core ratio. When this property is not specified in the request body the default behavior is set to the value of vCPUsPerCore for the VM Size exposed in api response of [List all available virtual machine sizes in a region](https://docs.microsoft.com/en-us/rest/api/compute/resource-skus/list). **Setting this property to 1 also means that hyper-threading is disabled.**
     */
    @JsonProperty(value = "vCPUsPerCore")
    private Integer vCpusPerCore;

    /**
     * Creates an instance of VMSizeProperties class.
     */
    public VMSizeProperties() {
    }

    /**
     * Get the vCpusAvailable property: Specifies the number of vCPUs available for the VM. When this property is not
     * specified in the request body the default behavior is to set it to the value of vCPUs available for that VM size
     * exposed in api response of [List all available virtual machine sizes in a
     * region](https://docs.microsoft.com/en-us/rest/api/compute/resource-skus/list).
     * 
     * @return the vCpusAvailable value.
     */
    public Integer vCpusAvailable() {
        return this.vCpusAvailable;
    }

    /**
     * Set the vCpusAvailable property: Specifies the number of vCPUs available for the VM. When this property is not
     * specified in the request body the default behavior is to set it to the value of vCPUs available for that VM size
     * exposed in api response of [List all available virtual machine sizes in a
     * region](https://docs.microsoft.com/en-us/rest/api/compute/resource-skus/list).
     * 
     * @param vCpusAvailable the vCpusAvailable value to set.
     * @return the VMSizeProperties object itself.
     */
    public VMSizeProperties withVCpusAvailable(Integer vCpusAvailable) {
        this.vCpusAvailable = vCpusAvailable;
        return this;
    }

    /**
     * Get the vCpusPerCore property: Specifies the vCPU to physical core ratio. When this property is not specified in
     * the request body the default behavior is set to the value of vCPUsPerCore for the VM Size exposed in api response
     * of [List all available virtual machine sizes in a
     * region](https://docs.microsoft.com/en-us/rest/api/compute/resource-skus/list). **Setting this property to 1 also
     * means that hyper-threading is disabled.**.
     * 
     * @return the vCpusPerCore value.
     */
    public Integer vCpusPerCore() {
        return this.vCpusPerCore;
    }

    /**
     * Set the vCpusPerCore property: Specifies the vCPU to physical core ratio. When this property is not specified in
     * the request body the default behavior is set to the value of vCPUsPerCore for the VM Size exposed in api response
     * of [List all available virtual machine sizes in a
     * region](https://docs.microsoft.com/en-us/rest/api/compute/resource-skus/list). **Setting this property to 1 also
     * means that hyper-threading is disabled.**.
     * 
     * @param vCpusPerCore the vCpusPerCore value to set.
     * @return the VMSizeProperties object itself.
     */
    public VMSizeProperties withVCpusPerCore(Integer vCpusPerCore) {
        this.vCpusPerCore = vCpusPerCore;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
