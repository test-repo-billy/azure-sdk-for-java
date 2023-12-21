/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker;

import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models.CreateKbDTO;
import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models.EnvironmentType;
import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models.KnowledgebaseDTO;
import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models.KnowledgebasesDTO;
import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models.KnowledgebaseUpdateHeaders;
import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models.Operation;
import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models.QnADocumentsDTO;
import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models.QnADTO;
import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models.UpdateKbOperationDTO;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Knowledgebases.
 */
public interface Knowledgebases {

    /**
     * Gets all knowledgebases for a user.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the KnowledgebasesDTO object if successful.
     */
    KnowledgebasesDTO listAll();

    /**
     * Gets all knowledgebases for a user.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KnowledgebasesDTO object
     */
    Observable<KnowledgebasesDTO> listAllAsync();



    /**
     * Gets details of a specific knowledgebase.
     *
     * @param kbId Knowledgebase id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the KnowledgebaseDTO object if successful.
     */
    KnowledgebaseDTO getDetails(String kbId);

    /**
     * Gets details of a specific knowledgebase.
     *
     * @param kbId Knowledgebase id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KnowledgebaseDTO object
     */
    Observable<KnowledgebaseDTO> getDetailsAsync(String kbId);



    /**
     * Deletes the knowledgebase and all its data.
     *
     * @param kbId Knowledgebase id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String kbId);

    /**
     * Deletes the knowledgebase and all its data.
     *
     * @param kbId Knowledgebase id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a representation of the deferred computation of this call if successful.
     */
    Observable<Void> deleteAsync(String kbId);



    /**
     * Publishes all changes in test index of a knowledgebase to its prod index.
     *
     * @param kbId Knowledgebase id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void publish(String kbId);

    /**
     * Publishes all changes in test index of a knowledgebase to its prod index.
     *
     * @param kbId Knowledgebase id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a representation of the deferred computation of this call if successful.
     */
    Observable<Void> publishAsync(String kbId);



    /**
     * Replace knowledgebase contents.
     *
     * @param kbId Knowledgebase id.
     * @param qnAList List of Q-A (QnADTO) to be added to the knowledgebase. Q-A Ids are assigned by the service and
      *  should be omitted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void replace(String kbId, List<QnADTO> qnAList);

    /**
     * Replace knowledgebase contents.
     *
     * @param kbId Knowledgebase id.
     * @param qnAList List of Q-A (QnADTO) to be added to the knowledgebase. Q-A Ids are assigned by the service and
      *  should be omitted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a representation of the deferred computation of this call if successful.
     */
    Observable<Void> replaceAsync(String kbId, List<QnADTO> qnAList);



    /**
     * Asynchronous operation to modify a knowledgebase.
     *
     * @param kbId Knowledgebase id.
     * @param updateKb Post body of the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Operation object if successful.
     */
    Operation update(String kbId, UpdateKbOperationDTO updateKb);

    /**
     * Asynchronous operation to modify a knowledgebase.
     *
     * @param kbId Knowledgebase id.
     * @param updateKb Post body of the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Operation object
     */
    Observable<Operation> updateAsync(String kbId, UpdateKbOperationDTO updateKb);



    /**
     * Asynchronous operation to create a new knowledgebase.
     *
     * @param createKbPayload Post body of the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Operation object if successful.
     */
    Operation create(CreateKbDTO createKbPayload);

    /**
     * Asynchronous operation to create a new knowledgebase.
     *
     * @param createKbPayload Post body of the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Operation object
     */
    Observable<Operation> createAsync(CreateKbDTO createKbPayload);



    /**
     * Download the knowledgebase.
     *
     * @param kbId Knowledgebase id.
     * @param environment Specifies whether environment is Test or Prod. Possible values include: 'Prod', 'Test'.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the QnADocumentsDTO object if successful.
     */
    QnADocumentsDTO download(String kbId, EnvironmentType environment);

    /**
     * Download the knowledgebase.
     *
     * @param kbId Knowledgebase id.
     * @param environment Specifies whether environment is Test or Prod. Possible values include: 'Prod', 'Test'.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the QnADocumentsDTO object
     */
    Observable<QnADocumentsDTO> downloadAsync(String kbId, EnvironmentType environment);


}
