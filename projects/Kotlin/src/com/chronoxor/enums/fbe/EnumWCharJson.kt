// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.5.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.enums.fbe

class EnumWCharJson : com.google.gson.JsonSerializer<com.chronoxor.enums.EnumWChar>, com.google.gson.JsonDeserializer<com.chronoxor.enums.EnumWChar>
{
    override fun serialize(src: com.chronoxor.enums.EnumWChar, typeOfSrc: java.lang.reflect.Type, context: com.google.gson.JsonSerializationContext): com.google.gson.JsonElement
    {
        return com.google.gson.JsonPrimitive(src.raw)
    }

    @Throws(com.google.gson.JsonParseException::class)
    override fun deserialize(json: com.google.gson.JsonElement, type: java.lang.reflect.Type, context: com.google.gson.JsonDeserializationContext): com.chronoxor.enums.EnumWChar
    {
        return com.chronoxor.enums.EnumWChar(json.asJsonPrimitive.asInt)
    }
}
