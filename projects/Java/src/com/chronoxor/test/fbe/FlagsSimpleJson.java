// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.5.0.0

package com.chronoxor.test.fbe;;

public final class FlagsSimpleJson implements com.google.gson.JsonSerializer<com.chronoxor.test.FlagsSimple>, com.google.gson.JsonDeserializer<com.chronoxor.test.FlagsSimple>
{

    @Override
    public com.google.gson.JsonElement serialize(com.chronoxor.test.FlagsSimple src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context)
    {
        return new com.google.gson.JsonPrimitive(src.getRaw());
    }

    @Override
    public com.chronoxor.test.FlagsSimple deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type type, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException
    {
        return new com.chronoxor.test.FlagsSimple(json.getAsJsonPrimitive().getAsInt());
    }
}
