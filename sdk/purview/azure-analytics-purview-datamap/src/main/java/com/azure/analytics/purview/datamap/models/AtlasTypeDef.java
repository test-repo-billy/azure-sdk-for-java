// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The definitions of type.
 */
@Immutable
public final class AtlasTypeDef implements JsonSerializable<AtlasTypeDef> {
    /*
     * The enum of type category.
     */
    @Generated
    private TypeCategory category;

    /*
     * The created time of the record.
     */
    @Generated
    private Long createTime;

    /*
     * The user who created the record.
     */
    @Generated
    private String createdBy;

    /*
     * The date format.
     */
    @Generated
    private DateFormat dateFormatter;

    /*
     * The description of the type definition.
     */
    @Generated
    private String description;

    /*
     * The GUID of the type definition.
     */
    @Generated
    private String guid;

    /*
     * The name of the type definition.
     */
    @Generated
    private String name;

    /*
     * The options for the type definition.
     */
    @Generated
    private Map<String, String> options;

    /*
     * The service type.
     */
    @Generated
    private String serviceType;

    /*
     * The version of the type.
     */
    @Generated
    private String typeVersion;

    /*
     * The update time of the record.
     */
    @Generated
    private Long updateTime;

    /*
     * The user who updated the record.
     */
    @Generated
    private String updatedBy;

    /*
     * The version of the record.
     */
    @Generated
    private Long version;

    /*
     * ETag for concurrency control.
     */
    @Generated
    private String lastModifiedTS;

    /*
     * Specifying a list of entityType names in the classificationDef, ensures that
     * classifications can
     * only be applied to those entityTypes.
     * 
     * Any subtypes of the entity types inherit the restriction.
     * 
     * Any classificationDef subtypes inherit the parents entityTypes restrictions.
     * 
     * Any classificationDef subtypes can further restrict the parents entityTypes
     * restrictions by specifying a subset of the entityTypes.
     * 
     * An empty entityTypes list when there are no parent restrictions means there are no
     * restrictions.
     * 
     * An empty entityTypes list when there are parent
     * restrictions means that the subtype picks up the parents
     * restrictions.
     * 
     * If a list of entityTypes are supplied, where one inherits
     * from another, this will be rejected. This should encourage cleaner
     * classificationsDefs.
     * 
     */
    @Generated
    private List<String> entityTypes;

    /*
     * An array of sub types.
     */
    @Generated
    private List<String> subTypes;

    /*
     * An array of super types.
     */
    @Generated
    private List<String> superTypes;

    /*
     * An array of relationship attributes.
     */
    @Generated
    private List<AtlasRelationshipAttributeDef> relationshipAttributeDefs;

    /*
     * The default value.
     */
    @Generated
    private String defaultValue;

    /*
     * An array of enum element definitions.
     */
    @Generated
    private List<AtlasEnumElementDef> elementDefs;

    /*
     * The relationshipEndDef represents an end of the relationship. The end of the
     * relationship is defined by a type, an
     * attribute name, cardinality and whether
     * it  is the container end of the relationship.
     */
    @Generated
    private AtlasRelationshipEndDef endDef1;

    /*
     * The relationshipEndDef represents an end of the relationship. The end of the
     * relationship is defined by a type, an
     * attribute name, cardinality and whether
     * it  is the container end of the relationship.
     */
    @Generated
    private AtlasRelationshipEndDef endDef2;

    /*
     * The Relationship category determines the style of relationship around
     * containment and lifecycle.
     * UML terminology is used for the values.
     * 
     * ASSOCIATION is a relationship with no containment. 
     * COMPOSITION and AGGREGATION are containment relationships.
     * 
     * The difference being in the lifecycles of the container and its children. 
     * In the COMPOSITION case, the children cannot exist without the container. 
     * For AGGREGATION, the life cycles of the container and children are totally independent.
     */
    @Generated
    private RelationshipCategory relationshipCategory;

    /*
     * The label of the relationship.
     */
    @Generated
    private String relationshipLabel;

    /*
     * An array of attribute definitions.
     */
    @Generated
    private List<AtlasAttributeDef> attributeDefs;

    /**
     * Creates an instance of AtlasTypeDef class.
     */
    @Generated
    private AtlasTypeDef() {
    }

    /**
     * Get the category property: The enum of type category.
     * 
     * @return the category value.
     */
    @Generated
    public TypeCategory getCategory() {
        return this.category;
    }

    /**
     * Get the createTime property: The created time of the record.
     * 
     * @return the createTime value.
     */
    @Generated
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * Get the createdBy property: The user who created the record.
     * 
     * @return the createdBy value.
     */
    @Generated
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Get the dateFormatter property: The date format.
     * 
     * @return the dateFormatter value.
     */
    @Generated
    public DateFormat getDateFormatter() {
        return this.dateFormatter;
    }

    /**
     * Get the description property: The description of the type definition.
     * 
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Get the guid property: The GUID of the type definition.
     * 
     * @return the guid value.
     */
    @Generated
    public String getGuid() {
        return this.guid;
    }

    /**
     * Get the name property: The name of the type definition.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the options property: The options for the type definition.
     * 
     * @return the options value.
     */
    @Generated
    public Map<String, String> getOptions() {
        return this.options;
    }

    /**
     * Get the serviceType property: The service type.
     * 
     * @return the serviceType value.
     */
    @Generated
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * Get the typeVersion property: The version of the type.
     * 
     * @return the typeVersion value.
     */
    @Generated
    public String getTypeVersion() {
        return this.typeVersion;
    }

    /**
     * Get the updateTime property: The update time of the record.
     * 
     * @return the updateTime value.
     */
    @Generated
    public Long getUpdateTime() {
        return this.updateTime;
    }

    /**
     * Get the updatedBy property: The user who updated the record.
     * 
     * @return the updatedBy value.
     */
    @Generated
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Get the version property: The version of the record.
     * 
     * @return the version value.
     */
    @Generated
    public Long getVersion() {
        return this.version;
    }

    /**
     * Get the lastModifiedTS property: ETag for concurrency control.
     * 
     * @return the lastModifiedTS value.
     */
    @Generated
    public String getLastModifiedTS() {
        return this.lastModifiedTS;
    }

    /**
     * Get the entityTypes property: Specifying a list of entityType names in the classificationDef, ensures that
     * classifications can
     * only be applied to those entityTypes.
     * 
     * Any subtypes of the entity types inherit the restriction.
     * 
     * Any classificationDef subtypes inherit the parents entityTypes restrictions.
     * 
     * Any classificationDef subtypes can further restrict the parents entityTypes
     * restrictions by specifying a subset of the entityTypes.
     * 
     * An empty entityTypes list when there are no parent restrictions means there are no
     * restrictions.
     * 
     * An empty entityTypes list when there are parent
     * restrictions means that the subtype picks up the parents
     * restrictions.
     * 
     * If a list of entityTypes are supplied, where one inherits
     * from another, this will be rejected. This should encourage cleaner
     * classificationsDefs.
     * 
     * @return the entityTypes value.
     */
    @Generated
    public List<String> getEntityTypes() {
        return this.entityTypes;
    }

    /**
     * Get the subTypes property: An array of sub types.
     * 
     * @return the subTypes value.
     */
    @Generated
    public List<String> getSubTypes() {
        return this.subTypes;
    }

    /**
     * Get the superTypes property: An array of super types.
     * 
     * @return the superTypes value.
     */
    @Generated
    public List<String> getSuperTypes() {
        return this.superTypes;
    }

    /**
     * Get the relationshipAttributeDefs property: An array of relationship attributes.
     * 
     * @return the relationshipAttributeDefs value.
     */
    @Generated
    public List<AtlasRelationshipAttributeDef> getRelationshipAttributeDefs() {
        return this.relationshipAttributeDefs;
    }

    /**
     * Get the defaultValue property: The default value.
     * 
     * @return the defaultValue value.
     */
    @Generated
    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * Get the elementDefs property: An array of enum element definitions.
     * 
     * @return the elementDefs value.
     */
    @Generated
    public List<AtlasEnumElementDef> getElementDefs() {
        return this.elementDefs;
    }

    /**
     * Get the endDef1 property: The relationshipEndDef represents an end of the relationship. The end of the
     * relationship is defined by a type, an
     * attribute name, cardinality and whether
     * it is the container end of the relationship.
     * 
     * @return the endDef1 value.
     */
    @Generated
    public AtlasRelationshipEndDef getEndDef1() {
        return this.endDef1;
    }

    /**
     * Get the endDef2 property: The relationshipEndDef represents an end of the relationship. The end of the
     * relationship is defined by a type, an
     * attribute name, cardinality and whether
     * it is the container end of the relationship.
     * 
     * @return the endDef2 value.
     */
    @Generated
    public AtlasRelationshipEndDef getEndDef2() {
        return this.endDef2;
    }

    /**
     * Get the relationshipCategory property: The Relationship category determines the style of relationship around
     * containment and lifecycle.
     * UML terminology is used for the values.
     * 
     * ASSOCIATION is a relationship with no containment.
     * COMPOSITION and AGGREGATION are containment relationships.
     * 
     * The difference being in the lifecycles of the container and its children.
     * In the COMPOSITION case, the children cannot exist without the container.
     * For AGGREGATION, the life cycles of the container and children are totally independent.
     * 
     * @return the relationshipCategory value.
     */
    @Generated
    public RelationshipCategory getRelationshipCategory() {
        return this.relationshipCategory;
    }

    /**
     * Get the relationshipLabel property: The label of the relationship.
     * 
     * @return the relationshipLabel value.
     */
    @Generated
    public String getRelationshipLabel() {
        return this.relationshipLabel;
    }

    /**
     * Get the attributeDefs property: An array of attribute definitions.
     * 
     * @return the attributeDefs value.
     */
    @Generated
    public List<AtlasAttributeDef> getAttributeDefs() {
        return this.attributeDefs;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("category", this.category == null ? null : this.category.toString());
        jsonWriter.writeNumberField("createTime", this.createTime);
        jsonWriter.writeStringField("createdBy", this.createdBy);
        jsonWriter.writeJsonField("dateFormatter", this.dateFormatter);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("guid", this.guid);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeMapField("options", this.options, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("serviceType", this.serviceType);
        jsonWriter.writeStringField("typeVersion", this.typeVersion);
        jsonWriter.writeNumberField("updateTime", this.updateTime);
        jsonWriter.writeStringField("updatedBy", this.updatedBy);
        jsonWriter.writeNumberField("version", this.version);
        jsonWriter.writeStringField("lastModifiedTS", this.lastModifiedTS);
        jsonWriter.writeArrayField("entityTypes", this.entityTypes, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("subTypes", this.subTypes, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("superTypes", this.superTypes, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("relationshipAttributeDefs", this.relationshipAttributeDefs,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("defaultValue", this.defaultValue);
        jsonWriter.writeArrayField("elementDefs", this.elementDefs, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("endDef1", this.endDef1);
        jsonWriter.writeJsonField("endDef2", this.endDef2);
        jsonWriter.writeStringField("relationshipCategory",
            this.relationshipCategory == null ? null : this.relationshipCategory.toString());
        jsonWriter.writeStringField("relationshipLabel", this.relationshipLabel);
        jsonWriter.writeArrayField("attributeDefs", this.attributeDefs, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AtlasTypeDef from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AtlasTypeDef if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AtlasTypeDef.
     */
    @Generated
    public static AtlasTypeDef fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AtlasTypeDef deserializedAtlasTypeDef = new AtlasTypeDef();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("category".equals(fieldName)) {
                    deserializedAtlasTypeDef.category = TypeCategory.fromString(reader.getString());
                } else if ("createTime".equals(fieldName)) {
                    deserializedAtlasTypeDef.createTime = reader.getNullable(JsonReader::getLong);
                } else if ("createdBy".equals(fieldName)) {
                    deserializedAtlasTypeDef.createdBy = reader.getString();
                } else if ("dateFormatter".equals(fieldName)) {
                    deserializedAtlasTypeDef.dateFormatter = DateFormat.fromJson(reader);
                } else if ("description".equals(fieldName)) {
                    deserializedAtlasTypeDef.description = reader.getString();
                } else if ("guid".equals(fieldName)) {
                    deserializedAtlasTypeDef.guid = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedAtlasTypeDef.name = reader.getString();
                } else if ("options".equals(fieldName)) {
                    Map<String, String> options = reader.readMap(reader1 -> reader1.getString());
                    deserializedAtlasTypeDef.options = options;
                } else if ("serviceType".equals(fieldName)) {
                    deserializedAtlasTypeDef.serviceType = reader.getString();
                } else if ("typeVersion".equals(fieldName)) {
                    deserializedAtlasTypeDef.typeVersion = reader.getString();
                } else if ("updateTime".equals(fieldName)) {
                    deserializedAtlasTypeDef.updateTime = reader.getNullable(JsonReader::getLong);
                } else if ("updatedBy".equals(fieldName)) {
                    deserializedAtlasTypeDef.updatedBy = reader.getString();
                } else if ("version".equals(fieldName)) {
                    deserializedAtlasTypeDef.version = reader.getNullable(JsonReader::getLong);
                } else if ("lastModifiedTS".equals(fieldName)) {
                    deserializedAtlasTypeDef.lastModifiedTS = reader.getString();
                } else if ("entityTypes".equals(fieldName)) {
                    List<String> entityTypes = reader.readArray(reader1 -> reader1.getString());
                    deserializedAtlasTypeDef.entityTypes = entityTypes;
                } else if ("subTypes".equals(fieldName)) {
                    List<String> subTypes = reader.readArray(reader1 -> reader1.getString());
                    deserializedAtlasTypeDef.subTypes = subTypes;
                } else if ("superTypes".equals(fieldName)) {
                    List<String> superTypes = reader.readArray(reader1 -> reader1.getString());
                    deserializedAtlasTypeDef.superTypes = superTypes;
                } else if ("relationshipAttributeDefs".equals(fieldName)) {
                    List<AtlasRelationshipAttributeDef> relationshipAttributeDefs
                        = reader.readArray(reader1 -> AtlasRelationshipAttributeDef.fromJson(reader1));
                    deserializedAtlasTypeDef.relationshipAttributeDefs = relationshipAttributeDefs;
                } else if ("defaultValue".equals(fieldName)) {
                    deserializedAtlasTypeDef.defaultValue = reader.getString();
                } else if ("elementDefs".equals(fieldName)) {
                    List<AtlasEnumElementDef> elementDefs
                        = reader.readArray(reader1 -> AtlasEnumElementDef.fromJson(reader1));
                    deserializedAtlasTypeDef.elementDefs = elementDefs;
                } else if ("endDef1".equals(fieldName)) {
                    deserializedAtlasTypeDef.endDef1 = AtlasRelationshipEndDef.fromJson(reader);
                } else if ("endDef2".equals(fieldName)) {
                    deserializedAtlasTypeDef.endDef2 = AtlasRelationshipEndDef.fromJson(reader);
                } else if ("relationshipCategory".equals(fieldName)) {
                    deserializedAtlasTypeDef.relationshipCategory = RelationshipCategory.fromString(reader.getString());
                } else if ("relationshipLabel".equals(fieldName)) {
                    deserializedAtlasTypeDef.relationshipLabel = reader.getString();
                } else if ("attributeDefs".equals(fieldName)) {
                    List<AtlasAttributeDef> attributeDefs
                        = reader.readArray(reader1 -> AtlasAttributeDef.fromJson(reader1));
                    deserializedAtlasTypeDef.attributeDefs = attributeDefs;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAtlasTypeDef;
        });
    }
}
