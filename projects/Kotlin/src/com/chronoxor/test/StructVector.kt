//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
open class StructVector : Comparable<Any?>
{
    var f1: java.util.ArrayList<Byte>
    var f2: java.util.ArrayList<Byte?>
    var f3: java.util.ArrayList<ByteArray>
    var f4: java.util.ArrayList<ByteArray?>
    var f5: java.util.ArrayList<EnumSimple>
    var f6: java.util.ArrayList<EnumSimple?>
    var f7: java.util.ArrayList<FlagsSimple>
    var f8: java.util.ArrayList<FlagsSimple?>
    var f9: java.util.ArrayList<StructSimple>
    var f10: java.util.ArrayList<StructSimple?>

    @Transient open var fbeType: Long = 130

    constructor(f1: java.util.ArrayList<Byte> = java.util.ArrayList(), f2: java.util.ArrayList<Byte?> = java.util.ArrayList(), f3: java.util.ArrayList<ByteArray> = java.util.ArrayList(), f4: java.util.ArrayList<ByteArray?> = java.util.ArrayList(), f5: java.util.ArrayList<EnumSimple> = java.util.ArrayList(), f6: java.util.ArrayList<EnumSimple?> = java.util.ArrayList(), f7: java.util.ArrayList<FlagsSimple> = java.util.ArrayList(), f8: java.util.ArrayList<FlagsSimple?> = java.util.ArrayList(), f9: java.util.ArrayList<StructSimple> = java.util.ArrayList(), f10: java.util.ArrayList<StructSimple?> = java.util.ArrayList())
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
    constructor(other: StructVector)
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

    open fun clone(): StructVector
    {
        // Serialize the struct to the FBE stream
        val writer = com.chronoxor.test.fbe.StructVectorModel()
        writer.serialize(this)

        // Deserialize the struct from the FBE stream
        val reader = com.chronoxor.test.fbe.StructVectorModel()
        reader.attach(writer.buffer)
        return reader.deserialize()
    }

    override fun compareTo(other: Any?): Int
    {
        if (other == null)
            return -1

        if (!StructVector::class.java.isAssignableFrom(other.javaClass))
            return -1

        @Suppress("UNUSED_VARIABLE")
        val obj = other as StructVector? ?: return -1

        @Suppress("VARIABLE_WITH_REDUNDANT_INITIALIZER", "CanBeVal", "UnnecessaryVariable")
        var result = 0
        return result
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!StructVector::class.java.isAssignableFrom(other.javaClass))
            return false

        @Suppress("UNUSED_VARIABLE")
        val obj = other as StructVector? ?: return false

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
        sb.append("StructVector(")
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append("f1=[").append(f1.size).append("][")
            for (item in f1)
            {
                sb.append(if (first) "" else ",").append(item)
                first = false
            }
            sb.append("]")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f2=[").append(f2.size).append("][")
            for (item in f2)
            {
                if (item != null) sb.append(if (first) "" else ",").append(item); else sb.append(if (first) "" else ",").append("null")
                first = false
            }
            sb.append("]")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f3=[").append(f3.size).append("][")
            for (item in f3)
            {
                sb.append(if (first) "" else ",").append("bytes[").append(item.size).append("]")
                first = false
            }
            sb.append("]")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f4=[").append(f4.size).append("][")
            for (item in f4)
            {
                if (item != null) sb.append(if (first) "" else ",").append("bytes[").append(item.size).append("]"); else sb.append(if (first) "" else ",").append("null")
                first = false
            }
            sb.append("]")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f5=[").append(f5.size).append("][")
            for (item in f5)
            {
                sb.append(if (first) "" else ",").append(item)
                first = false
            }
            sb.append("]")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f6=[").append(f6.size).append("][")
            for (item in f6)
            {
                if (item != null) sb.append(if (first) "" else ",").append(item); else sb.append(if (first) "" else ",").append("null")
                first = false
            }
            sb.append("]")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f7=[").append(f7.size).append("][")
            for (item in f7)
            {
                sb.append(if (first) "" else ",").append(item)
                first = false
            }
            sb.append("]")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f8=[").append(f8.size).append("][")
            for (item in f8)
            {
                if (item != null) sb.append(if (first) "" else ",").append(item); else sb.append(if (first) "" else ",").append("null")
                first = false
            }
            sb.append("]")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f9=[").append(f9.size).append("][")
            for (item in f9)
            {
                sb.append(if (first) "" else ",").append(item)
                first = false
            }
            sb.append("]")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f10=[").append(f10.size).append("][")
            for (item in f10)
            {
                if (item != null) sb.append(if (first) "" else ",").append(item); else sb.append(if (first) "" else ",").append("null")
                first = false
            }
            sb.append("]")
        }
        sb.append(")")
        return sb.toString()
    }

    open fun toJson(): String = com.chronoxor.test.fbe.Json.engine.toJson(this)

    companion object
    {
        const val fbeTypeConst: Long = 130
        fun fromJson(json: String): StructVector = com.chronoxor.test.fbe.Json.engine.fromJson(json, StructVector::class.java)
    }
}
