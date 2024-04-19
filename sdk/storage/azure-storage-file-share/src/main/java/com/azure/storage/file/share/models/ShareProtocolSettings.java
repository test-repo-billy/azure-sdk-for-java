// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * Protocol settings.
 */
@Fluent
public final class ShareProtocolSettings implements XmlSerializable<ShareProtocolSettings> {
    /*
     * Settings for SMB protocol.
     */
    private ShareSmbSettings smb;

    /**
     * Creates an instance of ShareProtocolSettings class.
     */
    public ShareProtocolSettings() {
    }

    /**
     * Get the smb property: Settings for SMB protocol.
     * 
     * @return the smb value.
     */
    public ShareSmbSettings getSmb() {
        return this.smb;
    }

    /**
     * Set the smb property: Settings for SMB protocol.
     * 
     * @param smb the smb value to set.
     * @return the ShareProtocolSettings object itself.
     */
    public ShareProtocolSettings setSmb(ShareSmbSettings smb) {
        this.smb = smb;
        return this;
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "ProtocolSettings" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeXml(this.smb, "SMB");
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of ShareProtocolSettings from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of ShareProtocolSettings if the XmlReader was pointing to an instance of it, or null if it
     * was pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the ShareProtocolSettings.
     */
    public static ShareProtocolSettings fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of ShareProtocolSettings from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of ShareProtocolSettings if the XmlReader was pointing to an instance of it, or null if it
     * was pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the ShareProtocolSettings.
     */
    public static ShareProtocolSettings fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "ProtocolSettings" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            ShareProtocolSettings deserializedShareProtocolSettings = new ShareProtocolSettings();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("SMB".equals(elementName.getLocalPart())) {
                    deserializedShareProtocolSettings.smb = ShareSmbSettings.fromXml(reader, "SMB");
                } else {
                    reader.skipElement();
                }
            }

            return deserializedShareProtocolSettings;
        });
    }
}
