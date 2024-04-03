// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A table object consisting table cells arranged in a rectangular layout.
 */
@Immutable
public final class DocumentTable implements JsonSerializable<DocumentTable> {
    /*
     * Number of rows in the table.
     */
    @Generated
    private final int rowCount;

    /*
     * Number of columns in the table.
     */
    @Generated
    private final int columnCount;

    /*
     * Cells contained within the table.
     */
    @Generated
    private final List<DocumentTableCell> cells;

    /*
     * Bounding regions covering the table.
     */
    @Generated
    private List<BoundingRegion> boundingRegions;

    /*
     * Location of the table in the reading order concatenated content.
     */
    @Generated
    private final List<DocumentSpan> spans;

    /*
     * Caption associated with the table.
     */
    @Generated
    private DocumentCaption caption;

    /*
     * List of footnotes associated with the table.
     */
    @Generated
    private List<DocumentFootnote> footnotes;

    /**
     * Creates an instance of DocumentTable class.
     * 
     * @param rowCount the rowCount value to set.
     * @param columnCount the columnCount value to set.
     * @param cells the cells value to set.
     * @param spans the spans value to set.
     */
    @Generated
    private DocumentTable(int rowCount, int columnCount, List<DocumentTableCell> cells, List<DocumentSpan> spans) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.cells = cells;
        this.spans = spans;
    }

    /**
     * Get the rowCount property: Number of rows in the table.
     * 
     * @return the rowCount value.
     */
    @Generated
    public int getRowCount() {
        return this.rowCount;
    }

    /**
     * Get the columnCount property: Number of columns in the table.
     * 
     * @return the columnCount value.
     */
    @Generated
    public int getColumnCount() {
        return this.columnCount;
    }

    /**
     * Get the cells property: Cells contained within the table.
     * 
     * @return the cells value.
     */
    @Generated
    public List<DocumentTableCell> getCells() {
        return this.cells;
    }

    /**
     * Get the boundingRegions property: Bounding regions covering the table.
     * 
     * @return the boundingRegions value.
     */
    @Generated
    public List<BoundingRegion> getBoundingRegions() {
        return this.boundingRegions;
    }

    /**
     * Get the spans property: Location of the table in the reading order concatenated content.
     * 
     * @return the spans value.
     */
    @Generated
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    /**
     * Get the caption property: Caption associated with the table.
     * 
     * @return the caption value.
     */
    @Generated
    public DocumentCaption getCaption() {
        return this.caption;
    }

    /**
     * Get the footnotes property: List of footnotes associated with the table.
     * 
     * @return the footnotes value.
     */
    @Generated
    public List<DocumentFootnote> getFootnotes() {
        return this.footnotes;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("rowCount", this.rowCount);
        jsonWriter.writeIntField("columnCount", this.columnCount);
        jsonWriter.writeArrayField("cells", this.cells, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("spans", this.spans, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("boundingRegions", this.boundingRegions,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("caption", this.caption);
        jsonWriter.writeArrayField("footnotes", this.footnotes, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DocumentTable from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DocumentTable if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DocumentTable.
     */
    @Generated
    public static DocumentTable fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int rowCount = 0;
            int columnCount = 0;
            List<DocumentTableCell> cells = null;
            List<DocumentSpan> spans = null;
            List<BoundingRegion> boundingRegions = null;
            DocumentCaption caption = null;
            List<DocumentFootnote> footnotes = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("rowCount".equals(fieldName)) {
                    rowCount = reader.getInt();
                } else if ("columnCount".equals(fieldName)) {
                    columnCount = reader.getInt();
                } else if ("cells".equals(fieldName)) {
                    cells = reader.readArray(reader1 -> DocumentTableCell.fromJson(reader1));
                } else if ("spans".equals(fieldName)) {
                    spans = reader.readArray(reader1 -> DocumentSpan.fromJson(reader1));
                } else if ("boundingRegions".equals(fieldName)) {
                    boundingRegions = reader.readArray(reader1 -> BoundingRegion.fromJson(reader1));
                } else if ("caption".equals(fieldName)) {
                    caption = DocumentCaption.fromJson(reader);
                } else if ("footnotes".equals(fieldName)) {
                    footnotes = reader.readArray(reader1 -> DocumentFootnote.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            DocumentTable deserializedDocumentTable = new DocumentTable(rowCount, columnCount, cells, spans);
            deserializedDocumentTable.boundingRegions = boundingRegions;
            deserializedDocumentTable.caption = caption;
            deserializedDocumentTable.footnotes = footnotes;

            return deserializedDocumentTable;
        });
    }
}
