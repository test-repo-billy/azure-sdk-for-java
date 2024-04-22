// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * The StorageError model.
 */
@Fluent
public final class StorageError implements XmlSerializable<StorageError> {
    /*
     * The Message property.
     */
    private String message;

    /**
     * Creates an instance of StorageError class.
     */
    public StorageError() {
    }

    /**
     * Get the message property: The Message property.
     * 
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: The Message property.
     * 
     * @param message the message value to set.
     * @return the StorageError object itself.
     */
    public StorageError setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "StorageError" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeStringElement("Message", this.message);
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of StorageError from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of StorageError if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the StorageError.
     */
    public static StorageError fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of StorageError from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of StorageError if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the StorageError.
     */
    public static StorageError fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "StorageError" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            StorageError deserializedStorageError = new StorageError();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("Message".equals(elementName.getLocalPart())) {
                    deserializedStorageError.message = reader.getStringElement();
                } else {
                    reader.skipElement();
                }
            }

            return deserializedStorageError;
        });
    }
}
