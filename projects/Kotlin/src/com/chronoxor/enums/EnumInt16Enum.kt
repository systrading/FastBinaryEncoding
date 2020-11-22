// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.5.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.enums

@Suppress("EnumEntryName", "MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
enum class EnumInt16Enum
{
    ENUM_VALUE_0(0 + 0)
    , ENUM_VALUE_1(-32768 + 0)
    , ENUM_VALUE_2(-32768 + 1)
    , ENUM_VALUE_3(32766 + 0)
    , ENUM_VALUE_4(32766 + 1)
    , ENUM_VALUE_5(ENUM_VALUE_3.raw)
    ;

    var raw: Short = 0
        private set

    constructor(value: Byte) { this.raw = value.toShort() }
    constructor(value: Short) { this.raw = value.toShort() }
    constructor(value: Int) { this.raw = value.toShort() }
    constructor(value: Long) { this.raw = value.toShort() }
    constructor(value: EnumInt16Enum) { this.raw = value.raw }

    override fun toString(): String
    {
        if (this == ENUM_VALUE_0) return "ENUM_VALUE_0"
        if (this == ENUM_VALUE_1) return "ENUM_VALUE_1"
        if (this == ENUM_VALUE_2) return "ENUM_VALUE_2"
        if (this == ENUM_VALUE_3) return "ENUM_VALUE_3"
        if (this == ENUM_VALUE_4) return "ENUM_VALUE_4"
        if (this == ENUM_VALUE_5) return "ENUM_VALUE_5"
        return "<unknown>"
    }

    companion object
    {
        private val mapping = java.util.HashMap<Short, EnumInt16Enum>()

        init
        {
            for (value in EnumInt16Enum.values())
                mapping[value.raw] = value
        }

        fun mapValue(value: Short): EnumInt16Enum? { return mapping[value] }
    }
}
