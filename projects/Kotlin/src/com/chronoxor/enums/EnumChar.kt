//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.enums

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
class EnumChar : Comparable<EnumChar>
{
    companion object
    {
        val ENUM_VALUE_0 = EnumChar(EnumCharEnum.ENUM_VALUE_0)
        val ENUM_VALUE_1 = EnumChar(EnumCharEnum.ENUM_VALUE_1)
        val ENUM_VALUE_2 = EnumChar(EnumCharEnum.ENUM_VALUE_2)
        val ENUM_VALUE_3 = EnumChar(EnumCharEnum.ENUM_VALUE_3)
        val ENUM_VALUE_4 = EnumChar(EnumCharEnum.ENUM_VALUE_4)
        val ENUM_VALUE_5 = EnumChar(EnumCharEnum.ENUM_VALUE_5)
    }

    var value: EnumCharEnum? = EnumCharEnum.values()[0]
        private set

    val raw: Byte
        get() = value!!.raw

    constructor()
    constructor(value: Byte) { setEnum(value) }
    constructor(value: EnumCharEnum) { setEnum(value) }
    constructor(value: EnumChar) { setEnum(value) }

    fun setDefault() { setEnum(0.toByte()) }

    fun setEnum(value: Byte) { this.value = EnumCharEnum.mapValue(value) }
    fun setEnum(value: EnumCharEnum) { this.value = value }
    fun setEnum(value: EnumChar) { this.value = value.value }

    override fun compareTo(other: EnumChar): Int
    {
        if (value == null)
            return -1
        if (other.value == null)
            return 1
        return (value!!.raw - other.value!!.raw).toInt()
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!EnumChar::class.java.isAssignableFrom(other.javaClass))
            return false

        val enm = other as EnumChar? ?: return false

        if (enm.value == null)
            return false
        if (value!!.raw != enm.value!!.raw)
            return false
        return true
    }

    override fun hashCode(): Int
    {
        var hash = 17
        hash = hash * 31 + if (value != null) value!!.hashCode() else 0
        return hash
    }

    override fun toString(): String
    {
        return if (value != null) value!!.toString() else "<unknown>"
    }
}
