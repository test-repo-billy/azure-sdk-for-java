// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.implementation.models;

import com.azure.core.util.CoreUtils;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * A wrapper around List&lt;PeekedMessageItemInternal&gt; which provides top-level metadata for serialization.
 */
public final class PeekedMessageItemInternalWrapper implements XmlSerializable<PeekedMessageItemInternalWrapper> {
    private final List<PeekedMessageItemInternal> queueMessagesList;

    /**
     * Creates an instance of PeekedMessageItemInternalWrapper.
     * 
     * @param queueMessagesList the list.
     */
    public PeekedMessageItemInternalWrapper(List<PeekedMessageItemInternal> queueMessagesList) {
        this.queueMessagesList = queueMessagesList;
    }

    /**
     * Get the List&lt;PeekedMessageItemInternal&gt; contained in this wrapper.
     * 
     * @return the List&lt;PeekedMessageItemInternal&gt;.
     */
    public List<PeekedMessageItemInternal> items() {
        return queueMessagesList;
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "QueueMessagesList" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        if (queueMessagesList != null) {
            for (PeekedMessageItemInternal element : queueMessagesList) {
                xmlWriter.writeXml(element, "QueueMessage");
            }
        }
        return xmlWriter.writeEndElement();
    }

    public static PeekedMessageItemInternalWrapper fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    public static PeekedMessageItemInternalWrapper fromXml(XmlReader xmlReader, String rootElementName)
        throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "QueueMessagesList" : rootElementName;
        return xmlReader.readObject(rootElementName, reader -> {
            List<PeekedMessageItemInternal> items = null;

            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("QueueMessage".equals(elementName.getLocalPart())) {
                    if (items == null) {
                        items = new ArrayList<>();
                    }

                    items.add(PeekedMessageItemInternal.fromXml(reader));
                } else {
                    reader.nextElement();
                }
            }
            return new PeekedMessageItemInternalWrapper(items);
        });
    }
}
