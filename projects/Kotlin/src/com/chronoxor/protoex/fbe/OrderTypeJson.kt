//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.protoex.fbe

class OrderTypeJson : com.google.gson.JsonSerializer<com.chronoxor.protoex.OrderType>, com.google.gson.JsonDeserializer<com.chronoxor.protoex.OrderType>
{
    override fun serialize(src: com.chronoxor.protoex.OrderType, typeOfSrc: java.lang.reflect.Type, context: com.google.gson.JsonSerializationContext): com.google.gson.JsonElement
    {
        return com.google.gson.JsonPrimitive(src.raw)
    }

    @Throws(com.google.gson.JsonParseException::class)
    override fun deserialize(json: com.google.gson.JsonElement, type: java.lang.reflect.Type, context: com.google.gson.JsonDeserializationContext): com.chronoxor.protoex.OrderType
    {
        return com.chronoxor.protoex.OrderType(json.asJsonPrimitive.asByte)
    }
}
