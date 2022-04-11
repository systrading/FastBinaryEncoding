//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

package com.chronoxor.enums;

public enum EnumInt8Enum
{
    ENUM_VALUE_0((byte)0 + 0)
    , ENUM_VALUE_1((byte)-128 + 0)
    , ENUM_VALUE_2((byte)-128 + 1)
    , ENUM_VALUE_3((byte)126 + 0)
    , ENUM_VALUE_4((byte)126 + 1)
    , ENUM_VALUE_5(ENUM_VALUE_3.getRaw())
    ;

    private byte value;

    EnumInt8Enum(byte value) { this.value = value; }
    EnumInt8Enum(int value) { this.value = (byte)value; }
    EnumInt8Enum(EnumInt8Enum value) { this.value = value.value; }

    public byte getRaw() { return value; }

    public static EnumInt8Enum mapValue(byte value) { return mapping.get(value); }

    @Override
    public String toString()
    {
        if (this == ENUM_VALUE_0) return "ENUM_VALUE_0";
        if (this == ENUM_VALUE_1) return "ENUM_VALUE_1";
        if (this == ENUM_VALUE_2) return "ENUM_VALUE_2";
        if (this == ENUM_VALUE_3) return "ENUM_VALUE_3";
        if (this == ENUM_VALUE_4) return "ENUM_VALUE_4";
        if (this == ENUM_VALUE_5) return "ENUM_VALUE_5";
        return "<unknown>";
    }

    private static final java.util.Map<Byte, EnumInt8Enum> mapping = new java.util.HashMap<>();
    static
    {
        for (var value : EnumInt8Enum.values())
            mapping.put(value.value, value);
    }
}
