// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.health.insights.radiologyinsights;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.PollerFlux;
import com.azure.health.insights.radiologyinsights.implementation.RadiologyInsightsClientImpl;
import com.azure.health.insights.radiologyinsights.models.ExpandQueryParamsType;
import com.azure.health.insights.radiologyinsights.models.RadiologyInsightsJob;

/**
 * Initializes a new instance of the asynchronous RadiologyInsightsClient type.
 */
@ServiceClient(builder = RadiologyInsightsClientBuilder.class, isAsync = true)
public final class RadiologyInsightsAsyncClient {
    @Generated
    private final RadiologyInsightsClientImpl serviceClient;

    /**
     * Initializes an instance of RadiologyInsightsAsyncClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    RadiologyInsightsAsyncClient(RadiologyInsightsClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Create Radiology Insights job
     * 
     * Creates a Radiology Insights job with the given request body.
     * <p>
     * <strong>Query Parameters</strong>
     * </p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * </tr>
     * <tr>
     * <td>expand</td>
     * <td>String</td>
     * <td>No</td>
     * <td>A comma separated list of related properties to be included in line with the job. Allowed values:
     * "jobData".</td>
     * </tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p>
     * <strong>Request Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     jobData (Optional): {
     *         patients (Required): [
     *              (Required){
     *                 id: String (Required)
     *                 details (Optional): {
     *                     sex: String(female/male/unspecified) (Optional)
     *                     birthDate: LocalDate (Optional)
     *                     clinicalInfo (Optional): [
     *                          (Optional){
     *                             resourceType: String (Required)
     *                             id: String (Optional)
     *                             meta (Optional): {
     *                                 versionId: String (Optional)
     *                                 lastUpdated: String (Optional)
     *                                 source: String (Optional)
     *                                 profile (Optional): [
     *                                     String (Optional)
     *                                 ]
     *                                 security (Optional): [
     *                                      (Optional){
     *                                         id: String (Optional)
     *                                         extension (Optional): [
     *                                              (Optional){
     *                                                 id: String (Optional)
     *                                                 extension (Optional): [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 url: String (Required)
     *                                                 valueQuantity (Optional): {
     *                                                     id: String (Optional)
     *                                                     extension (Optional): [
     *                                                         (recursive schema, see above)
     *                                                     ]
     *                                                     value: Double (Optional)
     *                                                     comparator: String (Optional)
     *                                                     unit: String (Optional)
     *                                                     system: String (Optional)
     *                                                     code: String (Optional)
     *                                                 }
     *                                                 valueCodeableConcept (Optional): {
     *                                                     id: String (Optional)
     *                                                     extension (Optional): [
     *                                                         (recursive schema, see above)
     *                                                     ]
     *                                                     coding (Optional): [
     *                                                         (recursive schema, see above)
     *                                                     ]
     *                                                     text: String (Optional)
     *                                                 }
     *                                                 valueString: String (Optional)
     *                                                 valueBoolean: Boolean (Optional)
     *                                                 valueInteger: Integer (Optional)
     *                                                 valueRange (Optional): {
     *                                                     id: String (Optional)
     *                                                     extension (Optional): [
     *                                                         (recursive schema, see above)
     *                                                     ]
     *                                                     low (Optional): (recursive schema, see low above)
     *                                                     high (Optional): (recursive schema, see high above)
     *                                                 }
     *                                                 valueRatio (Optional): {
     *                                                     id: String (Optional)
     *                                                     extension (Optional): [
     *                                                         (recursive schema, see above)
     *                                                     ]
     *                                                     numerator (Optional): (recursive schema, see numerator above)
     *                                                     denominator (Optional): (recursive schema, see denominator above)
     *                                                 }
     *                                                 valueSampledData (Optional): {
     *                                                     id: String (Optional)
     *                                                     extension (Optional): [
     *                                                         (recursive schema, see above)
     *                                                     ]
     *                                                     origin (Required): (recursive schema, see origin above)
     *                                                     period: double (Required)
     *                                                     factor: Double (Optional)
     *                                                     lowerLimit: Double (Optional)
     *                                                     upperLimit: Double (Optional)
     *                                                     dimensions: int (Required)
     *                                                     data: String (Optional)
     *                                                 }
     *                                                 valueTime: String (Optional)
     *                                                 valueDateTime: String (Optional)
     *                                                 valuePeriod (Optional): {
     *                                                     id: String (Optional)
     *                                                     extension (Optional): [
     *                                                         (recursive schema, see above)
     *                                                     ]
     *                                                     start: String (Optional)
     *                                                     end: String (Optional)
     *                                                 }
     *                                                 valueReference (Optional): {
     *                                                     id: String (Optional)
     *                                                     extension (Optional): [
     *                                                         (recursive schema, see above)
     *                                                     ]
     *                                                     reference: String (Optional)
     *                                                     type: String (Optional)
     *                                                     identifier (Optional): {
     *                                                         id: String (Optional)
     *                                                         extension (Optional): [
     *                                                             (recursive schema, see above)
     *                                                         ]
     *                                                         use: String (Optional)
     *                                                         type (Optional): (recursive schema, see type above)
     *                                                         system: String (Optional)
     *                                                         value: String (Optional)
     *                                                         period (Optional): (recursive schema, see period above)
     *                                                         assigner (Optional): (recursive schema, see assigner above)
     *                                                     }
     *                                                     display: String (Optional)
     *                                                 }
     *                                             }
     *                                         ]
     *                                         system: String (Optional)
     *                                         version: String (Optional)
     *                                         code: String (Optional)
     *                                         display: String (Optional)
     *                                     }
     *                                 ]
     *                                 tag (Optional): [
     *                                     (recursive schema, see above)
     *                                 ]
     *                             }
     *                             implicitRules: String (Optional)
     *                             language: String (Optional)
     *                              (Optional): {
     *                                 String: Object (Required)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 encounters (Optional): [
     *                      (Optional){
     *                         id: String (Required)
     *                         period (Optional): {
     *                             start: OffsetDateTime (Optional)
     *                             end: OffsetDateTime (Optional)
     *                         }
     *                         class: String(inpatient/ambulatory/observation/emergency/virtual/healthHome) (Optional)
     *                     }
     *                 ]
     *                 patientDocuments (Optional): [
     *                      (Optional){
     *                         type: String(note/fhirBundle/dicom/genomicSequencing) (Required)
     *                         clinicalType: String(consultation/dischargeSummary/historyAndPhysical/radiologyReport/procedure/progress/laboratory/pathologyReport) (Optional)
     *                         id: String (Required)
     *                         language: String (Optional)
     *                         createdAt: OffsetDateTime (Optional)
     *                         authors (Optional): [
     *                              (Optional){
     *                                 id: String (Optional)
     *                                 fullName: String (Optional)
     *                             }
     *                         ]
     *                         specialtyType: String(pathology/radiology) (Optional)
     *                         administrativeMetadata (Optional): {
     *                             orderedProcedures (Optional): [
     *                                  (Optional){
     *                                     extension (Optional): [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     code (Optional): (recursive schema, see code above)
     *                                     description: String (Optional)
     *                                 }
     *                             ]
     *                             encounterId: String (Optional)
     *                         }
     *                         content (Required): {
     *                             sourceType: String(inline/reference) (Required)
     *                             value: String (Required)
     *                         }
     *                     }
     *                 ]
     *             }
     *         ]
     *         configuration (Optional): {
     *             verbose: Boolean (Optional)
     *             includeEvidence: Boolean (Optional)
     *             inferenceTypes (Optional): [
     *                 String(ageMismatch/lateralityDiscrepancy/sexMismatch/completeOrderDiscrepancy/limitedOrderDiscrepancy/finding/criticalResult/followupRecommendation/followupCommunication/radiologyProcedure) (Optional)
     *             ]
     *             inferenceOptions (Optional): {
     *                 followupRecommendationOptions (Optional): {
     *                     includeRecommendationsWithNoSpecifiedModality: Boolean (Optional)
     *                     includeRecommendationsInReferences: Boolean (Optional)
     *                     provideFocusedSentenceEvidence: Boolean (Optional)
     *                 }
     *                 findingOptions (Optional): {
     *                     provideFocusedSentenceEvidence: Boolean (Optional)
     *                 }
     *             }
     *             locale: String (Optional)
     *         }
     *     }
     *     result (Optional): {
     *         patientResults (Required): [
     *              (Required){
     *                 patientId: String (Required)
     *                 inferences (Required): [
     *                      (Required){
     *                         extension (Optional): [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                 ]
     *             }
     *         ]
     *         modelVersion: String (Required)
     *     }
     *     status: String(notStarted/running/succeeded/failed/canceled) (Required)
     *     createdAt: OffsetDateTime (Optional)
     *     expiresAt: OffsetDateTime (Optional)
     *     updatedAt: OffsetDateTime (Optional)
     *     error (Optional): {
     *         code: String (Required)
     *         message: String (Required)
     *         target: String (Optional)
     *         details (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         innererror (Optional): {
     *             code: String (Optional)
     *             innererror (Optional): (recursive schema, see innererror above)
     *         }
     *     }
     * }
     * }</pre>
     * <p>
     * <strong>Response Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     jobData (Optional): {
     *         patients (Required): [
     *              (Required){
     *                 id: String (Required)
     *                 details (Optional): {
     *                     sex: String(female/male/unspecified) (Optional)
     *                     birthDate: LocalDate (Optional)
     *                     clinicalInfo (Optional): [
     *                          (Optional){
     *                             resourceType: String (Required)
     *                             id: String (Optional)
     *                             meta (Optional): {
     *                                 versionId: String (Optional)
     *                                 lastUpdated: String (Optional)
     *                                 source: String (Optional)
     *                                 profile (Optional): [
     *                                     String (Optional)
     *                                 ]
     *                                 security (Optional): [
     *                                      (Optional){
     *                                         id: String (Optional)
     *                                         extension (Optional): [
     *                                              (Optional){
     *                                                 id: String (Optional)
     *                                                 extension (Optional): [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 url: String (Required)
     *                                                 valueQuantity (Optional): {
     *                                                     id: String (Optional)
     *                                                     extension (Optional): [
     *                                                         (recursive schema, see above)
     *                                                     ]
     *                                                     value: Double (Optional)
     *                                                     comparator: String (Optional)
     *                                                     unit: String (Optional)
     *                                                     system: String (Optional)
     *                                                     code: String (Optional)
     *                                                 }
     *                                                 valueCodeableConcept (Optional): {
     *                                                     id: String (Optional)
     *                                                     extension (Optional): [
     *                                                         (recursive schema, see above)
     *                                                     ]
     *                                                     coding (Optional): [
     *                                                         (recursive schema, see above)
     *                                                     ]
     *                                                     text: String (Optional)
     *                                                 }
     *                                                 valueString: String (Optional)
     *                                                 valueBoolean: Boolean (Optional)
     *                                                 valueInteger: Integer (Optional)
     *                                                 valueRange (Optional): {
     *                                                     id: String (Optional)
     *                                                     extension (Optional): [
     *                                                         (recursive schema, see above)
     *                                                     ]
     *                                                     low (Optional): (recursive schema, see low above)
     *                                                     high (Optional): (recursive schema, see high above)
     *                                                 }
     *                                                 valueRatio (Optional): {
     *                                                     id: String (Optional)
     *                                                     extension (Optional): [
     *                                                         (recursive schema, see above)
     *                                                     ]
     *                                                     numerator (Optional): (recursive schema, see numerator above)
     *                                                     denominator (Optional): (recursive schema, see denominator above)
     *                                                 }
     *                                                 valueSampledData (Optional): {
     *                                                     id: String (Optional)
     *                                                     extension (Optional): [
     *                                                         (recursive schema, see above)
     *                                                     ]
     *                                                     origin (Required): (recursive schema, see origin above)
     *                                                     period: double (Required)
     *                                                     factor: Double (Optional)
     *                                                     lowerLimit: Double (Optional)
     *                                                     upperLimit: Double (Optional)
     *                                                     dimensions: int (Required)
     *                                                     data: String (Optional)
     *                                                 }
     *                                                 valueTime: String (Optional)
     *                                                 valueDateTime: String (Optional)
     *                                                 valuePeriod (Optional): {
     *                                                     id: String (Optional)
     *                                                     extension (Optional): [
     *                                                         (recursive schema, see above)
     *                                                     ]
     *                                                     start: String (Optional)
     *                                                     end: String (Optional)
     *                                                 }
     *                                                 valueReference (Optional): {
     *                                                     id: String (Optional)
     *                                                     extension (Optional): [
     *                                                         (recursive schema, see above)
     *                                                     ]
     *                                                     reference: String (Optional)
     *                                                     type: String (Optional)
     *                                                     identifier (Optional): {
     *                                                         id: String (Optional)
     *                                                         extension (Optional): [
     *                                                             (recursive schema, see above)
     *                                                         ]
     *                                                         use: String (Optional)
     *                                                         type (Optional): (recursive schema, see type above)
     *                                                         system: String (Optional)
     *                                                         value: String (Optional)
     *                                                         period (Optional): (recursive schema, see period above)
     *                                                         assigner (Optional): (recursive schema, see assigner above)
     *                                                     }
     *                                                     display: String (Optional)
     *                                                 }
     *                                             }
     *                                         ]
     *                                         system: String (Optional)
     *                                         version: String (Optional)
     *                                         code: String (Optional)
     *                                         display: String (Optional)
     *                                     }
     *                                 ]
     *                                 tag (Optional): [
     *                                     (recursive schema, see above)
     *                                 ]
     *                             }
     *                             implicitRules: String (Optional)
     *                             language: String (Optional)
     *                              (Optional): {
     *                                 String: Object (Required)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 encounters (Optional): [
     *                      (Optional){
     *                         id: String (Required)
     *                         period (Optional): {
     *                             start: OffsetDateTime (Optional)
     *                             end: OffsetDateTime (Optional)
     *                         }
     *                         class: String(inpatient/ambulatory/observation/emergency/virtual/healthHome) (Optional)
     *                     }
     *                 ]
     *                 patientDocuments (Optional): [
     *                      (Optional){
     *                         type: String(note/fhirBundle/dicom/genomicSequencing) (Required)
     *                         clinicalType: String(consultation/dischargeSummary/historyAndPhysical/radiologyReport/procedure/progress/laboratory/pathologyReport) (Optional)
     *                         id: String (Required)
     *                         language: String (Optional)
     *                         createdAt: OffsetDateTime (Optional)
     *                         authors (Optional): [
     *                              (Optional){
     *                                 id: String (Optional)
     *                                 fullName: String (Optional)
     *                             }
     *                         ]
     *                         specialtyType: String(pathology/radiology) (Optional)
     *                         administrativeMetadata (Optional): {
     *                             orderedProcedures (Optional): [
     *                                  (Optional){
     *                                     extension (Optional): [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     code (Optional): (recursive schema, see code above)
     *                                     description: String (Optional)
     *                                 }
     *                             ]
     *                             encounterId: String (Optional)
     *                         }
     *                         content (Required): {
     *                             sourceType: String(inline/reference) (Required)
     *                             value: String (Required)
     *                         }
     *                     }
     *                 ]
     *             }
     *         ]
     *         configuration (Optional): {
     *             verbose: Boolean (Optional)
     *             includeEvidence: Boolean (Optional)
     *             inferenceTypes (Optional): [
     *                 String(ageMismatch/lateralityDiscrepancy/sexMismatch/completeOrderDiscrepancy/limitedOrderDiscrepancy/finding/criticalResult/followupRecommendation/followupCommunication/radiologyProcedure) (Optional)
     *             ]
     *             inferenceOptions (Optional): {
     *                 followupRecommendationOptions (Optional): {
     *                     includeRecommendationsWithNoSpecifiedModality: Boolean (Optional)
     *                     includeRecommendationsInReferences: Boolean (Optional)
     *                     provideFocusedSentenceEvidence: Boolean (Optional)
     *                 }
     *                 findingOptions (Optional): {
     *                     provideFocusedSentenceEvidence: Boolean (Optional)
     *                 }
     *             }
     *             locale: String (Optional)
     *         }
     *     }
     *     result (Optional): {
     *         patientResults (Required): [
     *              (Required){
     *                 patientId: String (Required)
     *                 inferences (Required): [
     *                      (Required){
     *                         extension (Optional): [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                 ]
     *             }
     *         ]
     *         modelVersion: String (Required)
     *     }
     *     status: String(notStarted/running/succeeded/failed/canceled) (Required)
     *     createdAt: OffsetDateTime (Optional)
     *     expiresAt: OffsetDateTime (Optional)
     *     updatedAt: OffsetDateTime (Optional)
     *     error (Optional): {
     *         code: String (Required)
     *         message: String (Required)
     *         target: String (Optional)
     *         details (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         innererror (Optional): {
     *             code: String (Optional)
     *             innererror (Optional): (recursive schema, see innererror above)
     *         }
     *     }
     * }
     * }</pre>
     * 
     * @param id The unique ID of the job.
     * @param resource The resource instance.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of response for the Radiology Insights request.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginInferRadiologyInsights(String id, BinaryData resource,
        RequestOptions requestOptions) {
        return this.serviceClient.beginInferRadiologyInsightsAsync(id, resource, requestOptions);
    }

    /**
     * Create Radiology Insights job
     * 
     * Creates a Radiology Insights job with the given request body.
     * 
     * @param id The unique ID of the job.
     * @param resource The resource instance.
     * @param expand A comma separated list of related properties to be included in line with the job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of response for the Radiology Insights request.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<RadiologyInsightsJob, RadiologyInsightsJob> beginInferRadiologyInsights(String id,
        RadiologyInsightsJob resource, ExpandQueryParamsType expand) {
        // Generated convenience method for beginInferRadiologyInsightsWithModel
        RequestOptions requestOptions = new RequestOptions();
        if (expand != null) {
            requestOptions.addQueryParam("expand", expand.toString(), false);
        }
        return serviceClient.beginInferRadiologyInsightsWithModelAsync(id, BinaryData.fromObject(resource),
            requestOptions);
    }

    /**
     * Create Radiology Insights job
     * 
     * Creates a Radiology Insights job with the given request body.
     * 
     * @param id The unique ID of the job.
     * @param resource The resource instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of response for the Radiology Insights request.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<RadiologyInsightsJob, RadiologyInsightsJob> beginInferRadiologyInsights(String id,
        RadiologyInsightsJob resource) {
        // Generated convenience method for beginInferRadiologyInsightsWithModel
        RequestOptions requestOptions = new RequestOptions();
        return serviceClient.beginInferRadiologyInsightsWithModelAsync(id, BinaryData.fromObject(resource),
            requestOptions);
    }
}
