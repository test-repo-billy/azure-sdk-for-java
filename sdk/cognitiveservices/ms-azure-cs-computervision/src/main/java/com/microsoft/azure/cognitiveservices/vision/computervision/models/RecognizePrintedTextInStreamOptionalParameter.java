/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;


/**
 * The RecognizePrintedTextInStreamOptionalParameter model.
 */
public class RecognizePrintedTextInStreamOptionalParameter {
    /**
     * The BCP-47 language code of the text to be detected in the image. The
     * default value is 'unk'. Possible values include: 'unk', 'zh-Hans',
     * 'zh-Hant', 'cs', 'da', 'nl', 'en', 'fi', 'fr', 'de', 'el', 'hu', 'it',
     * 'ja', 'ko', 'nb', 'pl', 'pt', 'ru', 'es', 'sv', 'tr', 'ar', 'ro',
     * 'sr-Cyrl', 'sr-Latn', 'sk'.
     */
    private OcrLanguages language;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the language value.
     *
     * @return the language value
     */
    public OcrLanguages language() {
        return this.language;
    }

    /**
     * Set the language value.
     *
     * @param language the language value to set
     * @return the RecognizePrintedTextInStreamOptionalParameter object itself.
     */
    public RecognizePrintedTextInStreamOptionalParameter withLanguage(OcrLanguages language) {
        this.language = language;
        return this;
    }

    /**
     * Get the thisclientacceptLanguage value.
     *
     * @return the thisclientacceptLanguage value
     */
    public String thisclientacceptLanguage() {
        return this.thisclientacceptLanguage;
    }

    /**
     * Set the thisclientacceptLanguage value.
     *
     * @param thisclientacceptLanguage the thisclientacceptLanguage value to set
     * @return the RecognizePrintedTextInStreamOptionalParameter object itself.
     */
    public RecognizePrintedTextInStreamOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
