// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.generated.fluent.models.CapacityReservationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Specifies information about the capacity reservation. Only tags and sku.capacity can be updated.
 */
@Fluent
public final class CapacityReservationUpdate extends UpdateResource {
    /*
     * Properties of the Capacity reservation.
     */
    @JsonProperty(value = "properties")
    private CapacityReservationProperties innerProperties;

    /*
     * SKU of the resource for which capacity needs be reserved. The SKU name and capacity is required to be set.
     * Currently VM Skus with the capability called 'CapacityReservationSupported' set to true are supported. Refer to
     * List Microsoft.Compute SKUs in a region (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for
     * supported values.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Creates an instance of CapacityReservationUpdate class.
     */
    public CapacityReservationUpdate() {
    }

    /**
     * Get the innerProperties property: Properties of the Capacity reservation.
     * 
     * @return the innerProperties value.
     */
    private CapacityReservationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sku property: SKU of the resource for which capacity needs be reserved. The SKU name and capacity is
     * required to be set. Currently VM Skus with the capability called 'CapacityReservationSupported' set to true are
     * supported. Refer to List Microsoft.Compute SKUs in a region
     * (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for supported values.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU of the resource for which capacity needs be reserved. The SKU name and capacity is
     * required to be set. Currently VM Skus with the capability called 'CapacityReservationSupported' set to true are
     * supported. Refer to List Microsoft.Compute SKUs in a region
     * (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for supported values.
     * 
     * @param sku the sku value to set.
     * @return the CapacityReservationUpdate object itself.
     */
    public CapacityReservationUpdate withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CapacityReservationUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the reservationId property: A unique id generated and assigned to the capacity reservation by the platform
     * which does not change throughout the lifetime of the resource.
     * 
     * @return the reservationId value.
     */
    public String reservationId() {
        return this.innerProperties() == null ? null : this.innerProperties().reservationId();
    }

    /**
     * Get the platformFaultDomainCount property: Specifies the value of fault domain count that Capacity Reservation
     * supports for requested VM size. **Note:** The fault domain count specified for a resource (like virtual machines
     * scale set) must be less than or equal to this value if it deploys using capacity reservation. Minimum
     * api-version: 2022-08-01.
     * 
     * @return the platformFaultDomainCount value.
     */
    public Integer platformFaultDomainCount() {
        return this.innerProperties() == null ? null : this.innerProperties().platformFaultDomainCount();
    }

    /**
     * Get the virtualMachinesAssociated property: A list of all virtual machine resource ids that are associated with
     * the capacity reservation.
     * 
     * @return the virtualMachinesAssociated value.
     */
    public List<SubResourceReadOnly> virtualMachinesAssociated() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachinesAssociated();
    }

    /**
     * Get the provisioningTime property: The date time when the capacity reservation was last updated.
     * 
     * @return the provisioningTime value.
     */
    public OffsetDateTime provisioningTime() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningTime();
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the instanceView property: The Capacity reservation instance view.
     * 
     * @return the instanceView value.
     */
    public CapacityReservationInstanceView instanceView() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceView();
    }

    /**
     * Get the timeCreated property: Specifies the time at which the Capacity Reservation resource was created. Minimum
     * api-version: 2021-11-01.
     * 
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.innerProperties() == null ? null : this.innerProperties().timeCreated();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}
