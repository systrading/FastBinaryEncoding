// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.5.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test.fbe

class EnumEmptyJson : com.google.gson.JsonSerializer<com.chronoxor.test.EnumEmpty>, com.google.gson.JsonDeserializer<com.chronoxor.test.EnumEmpty>
{
    override fun serialize(src: com.chronoxor.test.EnumEmpty, typeOfSrc: java.lang.reflect.Type, context: com.google.gson.JsonSerializationContext): com.google.gson.JsonElement
    {
        return com.google.gson.JsonPrimitive(src.raw)
    }

    @Throws(com.google.gson.JsonParseException::class)
    override fun deserialize(json: com.google.gson.JsonElement, type: java.lang.reflect.Type, context: com.google.gson.JsonDeserializationContext): com.chronoxor.test.EnumEmpty
    {
        return com.chronoxor.test.EnumEmpty(json.asJsonPrimitive.asInt)
    }
}
