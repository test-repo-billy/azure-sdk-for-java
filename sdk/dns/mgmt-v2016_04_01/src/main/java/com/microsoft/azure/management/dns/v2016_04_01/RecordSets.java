/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.dns.v2016_04_01;

import rx.Observable;
import com.microsoft.azure.management.dns.v2016_04_01.implementation.RecordSetsInner;
import com.microsoft.azure.arm.model.HasInner;
import rx.Completable;
import com.microsoft.azure.management.dns.v2016_04_01.implementation.RecordSetInner;

/**
 * Type representing RecordSets.
 */
public interface RecordSets extends HasInner<RecordSetsInner> {
    /**
     * Lists all record sets in a DNS zone.
     *
     * @param resourceGroupName The name of the resource group.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecordSet> listByDnsZoneAsync(final String resourceGroupName, final String zoneName);

    /**
     * Updates a record set within a DNS zone.
     *
     * @param resourceGroupName The name of the resource group.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param relativeRecordSetName The name of the record set, relative to the name of the zone.
     * @param recordType The type of DNS record in this record set. Possible values include: 'A', 'AAAA', 'CNAME', 'MX', 'NS', 'PTR', 'SOA', 'SRV', 'TXT'
     * @param parameters Parameters supplied to the Update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecordSet> updateAsync(String resourceGroupName, String zoneName, String relativeRecordSetName, RecordType recordType, RecordSetInner parameters);

    /**
     * Creates or updates a record set within a DNS zone.
     *
     * @param resourceGroupName The name of the resource group.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param relativeRecordSetName The name of the record set, relative to the name of the zone.
     * @param recordType The type of DNS record in this record set. Record sets of type SOA can be updated but not created (they are created when the DNS zone is created). Possible values include: 'A', 'AAAA', 'CNAME', 'MX', 'NS', 'PTR', 'SOA', 'SRV', 'TXT'
     * @param parameters Parameters supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecordSet> createOrUpdateAsync(String resourceGroupName, String zoneName, String relativeRecordSetName, RecordType recordType, RecordSetInner parameters);

    /**
     * Deletes a record set from a DNS zone. This operation cannot be undone.
     *
     * @param resourceGroupName The name of the resource group.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param relativeRecordSetName The name of the record set, relative to the name of the zone.
     * @param recordType The type of DNS record in this record set. Record sets of type SOA cannot be deleted (they are deleted when the DNS zone is deleted). Possible values include: 'A', 'AAAA', 'CNAME', 'MX', 'NS', 'PTR', 'SOA', 'SRV', 'TXT'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String zoneName, String relativeRecordSetName, RecordType recordType);

    /**
     * Gets a record set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param relativeRecordSetName The name of the record set, relative to the name of the zone.
     * @param recordType The type of DNS record in this record set. Possible values include: 'A', 'AAAA', 'CNAME', 'MX', 'NS', 'PTR', 'SOA', 'SRV', 'TXT'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecordSet> getAsync(String resourceGroupName, String zoneName, String relativeRecordSetName, RecordType recordType);

    /**
     * Lists the record sets of a specified type in a DNS zone.
     *
     * @param resourceGroupName The name of the resource group.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param recordType The type of record sets to enumerate. Possible values include: 'A', 'AAAA', 'CNAME', 'MX', 'NS', 'PTR', 'SOA', 'SRV', 'TXT'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecordSet> listByTypeAsync(final String resourceGroupName, final String zoneName, final RecordType recordType);

}
