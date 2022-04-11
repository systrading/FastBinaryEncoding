//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
open class StructMap : Comparable<Any?>
{
    var f1: java.util.TreeMap<Int, Byte>
    var f2: java.util.TreeMap<Int, Byte?>
    var f3: java.util.TreeMap<Int, ByteArray>
    var f4: java.util.TreeMap<Int, ByteArray?>
    var f5: java.util.TreeMap<Int, EnumSimple>
    var f6: java.util.TreeMap<Int, EnumSimple?>
    var f7: java.util.TreeMap<Int, FlagsSimple>
    var f8: java.util.TreeMap<Int, FlagsSimple?>
    var f9: java.util.TreeMap<Int, StructSimple>
    var f10: java.util.TreeMap<Int, StructSimple?>

    @Transient open var fbeType: Long = 140

    constructor(f1: java.util.TreeMap<Int, Byte> = java.util.TreeMap(), f2: java.util.TreeMap<Int, Byte?> = java.util.TreeMap(), f3: java.util.TreeMap<Int, ByteArray> = java.util.TreeMap(), f4: java.util.TreeMap<Int, ByteArray?> = java.util.TreeMap(), f5: java.util.TreeMap<Int, EnumSimple> = java.util.TreeMap(), f6: java.util.TreeMap<Int, EnumSimple?> = java.util.TreeMap(), f7: java.util.TreeMap<Int, FlagsSimple> = java.util.TreeMap(), f8: java.util.TreeMap<Int, FlagsSimple?> = java.util.TreeMap(), f9: java.util.TreeMap<Int, StructSimple> = java.util.TreeMap(), f10: java.util.TreeMap<Int, StructSimple?> = java.util.TreeMap())
    {
        this.f1 = f1
        this.f2 = f2
        this.f3 = f3
        this.f4 = f4
        this.f5 = f5
        this.f6 = f6
        this.f7 = f7
        this.f8 = f8
        this.f9 = f9
        this.f10 = f10
    }

    @Suppress("UNUSED_PARAMETER")
    constructor(other: StructMap)
    {
        this.f1 = other.f1
        this.f2 = other.f2
        this.f3 = other.f3
        this.f4 = other.f4
        this.f5 = other.f5
        this.f6 = other.f6
        this.f7 = other.f7
        this.f8 = other.f8
        this.f9 = other.f9
        this.f10 = other.f10
    }

    open fun clone(): StructMap
    {
        // Serialize the struct to the FBE stream
        val writer = com.chronoxor.test.fbe.StructMapModel()
        writer.serialize(this)

        // Deserialize the struct from the FBE stream
        val reader = com.chronoxor.test.fbe.StructMapModel()
        reader.attach(writer.buffer)
        return reader.deserialize()
    }

    override fun compareTo(other: Any?): Int
    {
        if (other == null)
            return -1

        if (!StructMap::class.java.isAssignableFrom(other.javaClass))
            return -1

        @Suppress("UNUSED_VARIABLE")
        val obj = other as StructMap? ?: return -1

        @Suppress("VARIABLE_WITH_REDUNDANT_INITIALIZER", "CanBeVal", "UnnecessaryVariable")
        var result = 0
        return result
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!StructMap::class.java.isAssignableFrom(other.javaClass))
            return false

        @Suppress("UNUSED_VARIABLE")
        val obj = other as StructMap? ?: return false

        return true
    }

    override fun hashCode(): Int
    {
        @Suppress("CanBeVal", "UnnecessaryVariable")
        var hash = 17
        return hash
    }

    override fun toString(): String
    {
        val sb = StringBuilder()
        sb.append("StructMap(")
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append("f1=[").append(f1.size).append("]<{")
            for (item in f1.entries)
            {
                sb.append(if (first) "" else ",").append(item.key)
                sb.append("->")
                sb.append(item.value)
                first = false
            }
            sb.append("}>")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f2=[").append(f2.size).append("]<{")
            for (item in f2.entries)
            {
                sb.append(if (first) "" else ",").append(item.key)
                sb.append("->")
                if (item.value != null) sb.append(item.value!!); else sb.append("null")
                first = false
            }
            sb.append("}>")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f3=[").append(f3.size).append("]<{")
            for (item in f3.entries)
            {
                sb.append(if (first) "" else ",").append(item.key)
                sb.append("->")
                sb.append("bytes[").append(item.value.size).append("]")
                first = false
            }
            sb.append("}>")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f4=[").append(f4.size).append("]<{")
            for (item in f4.entries)
            {
                sb.append(if (first) "" else ",").append(item.key)
                sb.append("->")
                if (item.value != null) sb.append("bytes[").append(item.value!!.size).append("]"); else sb.append("null")
                first = false
            }
            sb.append("}>")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f5=[").append(f5.size).append("]<{")
            for (item in f5.entries)
            {
                sb.append(if (first) "" else ",").append(item.key)
                sb.append("->")
                sb.append(item.value)
                first = false
            }
            sb.append("}>")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f6=[").append(f6.size).append("]<{")
            for (item in f6.entries)
            {
                sb.append(if (first) "" else ",").append(item.key)
                sb.append("->")
                if (item.value != null) sb.append(item.value!!); else sb.append("null")
                first = false
            }
            sb.append("}>")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f7=[").append(f7.size).append("]<{")
            for (item in f7.entries)
            {
                sb.append(if (first) "" else ",").append(item.key)
                sb.append("->")
                sb.append(item.value)
                first = false
            }
            sb.append("}>")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f8=[").append(f8.size).append("]<{")
            for (item in f8.entries)
            {
                sb.append(if (first) "" else ",").append(item.key)
                sb.append("->")
                if (item.value != null) sb.append(item.value!!); else sb.append("null")
                first = false
            }
            sb.append("}>")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f9=[").append(f9.size).append("]<{")
            for (item in f9.entries)
            {
                sb.append(if (first) "" else ",").append(item.key)
                sb.append("->")
                sb.append(item.value)
                first = false
            }
            sb.append("}>")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f10=[").append(f10.size).append("]<{")
            for (item in f10.entries)
            {
                sb.append(if (first) "" else ",").append(item.key)
                sb.append("->")
                if (item.value != null) sb.append(item.value!!); else sb.append("null")
                first = false
            }
            sb.append("}>")
        }
        sb.append(")")
        return sb.toString()
    }

    open fun toJson(): String = com.chronoxor.test.fbe.Json.engine.toJson(this)

    companion object
    {
        const val fbeTypeConst: Long = 140
        fun fromJson(json: String): StructMap = com.chronoxor.test.fbe.Json.engine.fromJson(json, StructMap::class.java)
    }
}
