// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.5.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test

@Suppress("EnumEntryName", "MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
enum class FlagsSimpleEnum
{
    FLAG_VALUE_0(0x0)
    , FLAG_VALUE_1(0x1)
    , FLAG_VALUE_2(0x2)
    , FLAG_VALUE_3(0x4)
    , FLAG_VALUE_4(FLAG_VALUE_3.raw.toInt())
    , FLAG_VALUE_5(FLAG_VALUE_1.raw.toInt() or FLAG_VALUE_3.raw.toInt())
    ;

    var raw: Int = 0
        private set

    constructor(value: Byte) { this.raw = value.toInt() }
    constructor(value: Short) { this.raw = value.toInt() }
    constructor(value: Int) { this.raw = value.toInt() }
    constructor(value: Long) { this.raw = value.toInt() }
    constructor(value: FlagsSimpleEnum) { this.raw = value.raw }

    fun hasFlags(flags: Int): Boolean = ((raw.toInt() and flags.toInt()) != 0) && ((raw.toInt() and flags.toInt()) == flags.toInt())
    fun hasFlags(flags: FlagsSimpleEnum): Boolean = hasFlags(flags.raw)

    val allSet: java.util.EnumSet<FlagsSimpleEnum> get() = java.util.EnumSet.allOf(FlagsSimpleEnum::class.java)
    val noneSet: java.util.EnumSet<FlagsSimpleEnum> get() = java.util.EnumSet.noneOf(FlagsSimpleEnum::class.java)
    val currentSet: java.util.EnumSet<FlagsSimpleEnum> get()
    {
        val result = java.util.EnumSet.noneOf(FlagsSimpleEnum::class.java)
        if ((raw.toInt() and FLAG_VALUE_0.raw.toInt()) != 0)
        {
            result.add(FLAG_VALUE_0)
        }
        if ((raw.toInt() and FLAG_VALUE_1.raw.toInt()) != 0)
        {
            result.add(FLAG_VALUE_1)
        }
        if ((raw.toInt() and FLAG_VALUE_2.raw.toInt()) != 0)
        {
            result.add(FLAG_VALUE_2)
        }
        if ((raw.toInt() and FLAG_VALUE_3.raw.toInt()) != 0)
        {
            result.add(FLAG_VALUE_3)
        }
        if ((raw.toInt() and FLAG_VALUE_4.raw.toInt()) != 0)
        {
            result.add(FLAG_VALUE_4)
        }
        if ((raw.toInt() and FLAG_VALUE_5.raw.toInt()) != 0)
        {
            result.add(FLAG_VALUE_5)
        }
        return result
    }

    override fun toString(): String
    {
        val sb = StringBuilder()
        var first = true
        if (hasFlags(FLAG_VALUE_0))
        {
            sb.append(if (first) "" else "|").append("FLAG_VALUE_0")
            @Suppress("UNUSED_VALUE")
            first = false
        }
        if (hasFlags(FLAG_VALUE_1))
        {
            sb.append(if (first) "" else "|").append("FLAG_VALUE_1")
            @Suppress("UNUSED_VALUE")
            first = false
        }
        if (hasFlags(FLAG_VALUE_2))
        {
            sb.append(if (first) "" else "|").append("FLAG_VALUE_2")
            @Suppress("UNUSED_VALUE")
            first = false
        }
        if (hasFlags(FLAG_VALUE_3))
        {
            sb.append(if (first) "" else "|").append("FLAG_VALUE_3")
            @Suppress("UNUSED_VALUE")
            first = false
        }
        if (hasFlags(FLAG_VALUE_4))
        {
            sb.append(if (first) "" else "|").append("FLAG_VALUE_4")
            @Suppress("UNUSED_VALUE")
            first = false
        }
        if (hasFlags(FLAG_VALUE_5))
        {
            sb.append(if (first) "" else "|").append("FLAG_VALUE_5")
            @Suppress("UNUSED_VALUE")
            first = false
        }
        return sb.toString()
    }

    companion object
    {
        private val mapping = java.util.HashMap<Int, FlagsSimpleEnum>()

        init
        {
            for (value in FlagsSimpleEnum.values())
                mapping[value.raw] = value
        }

        fun mapValue(value: Int): FlagsSimpleEnum? { return mapping[value] }
    }
}
