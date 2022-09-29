//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test.fbe

// Fast Binary Encoding StructSet field model
@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods", "ReplaceGetOrSet")
class FieldModelStructSet(buffer: com.chronoxor.fbe.Buffer, offset: Long) : com.chronoxor.fbe.FieldModel(buffer, offset)
{
    val f1: FieldModelVectorByte = FieldModelVectorByte(buffer, 4 + 4)
    val f2: FieldModelVectorEnumSimple = FieldModelVectorEnumSimple(buffer, f1.fbeOffset + f1.fbeSize)
    val f3: FieldModelVectorFlagsSimple = FieldModelVectorFlagsSimple(buffer, f2.fbeOffset + f2.fbeSize)
    val f4: FieldModelVectorStructSimple = FieldModelVectorStructSimple(buffer, f3.fbeOffset + f3.fbeSize)

    // Field size
    override val fbeSize: Long = 4

    // Field body size
    val fbeBody: Long = (4 + 4
        + f1.fbeSize
        + f2.fbeSize
        + f3.fbeSize
        + f4.fbeSize
        )

    // Field extra size
    override val fbeExtra: Long get()
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return 0

        val fbeStructOffset = readUInt32(fbeOffset).toLong()
        if ((fbeStructOffset == 0L) || ((_buffer.offset + fbeStructOffset + 4) > _buffer.size))
            return 0

        _buffer.shift(fbeStructOffset)

        val fbeResult = (fbeBody
            + f1.fbeExtra
            + f2.fbeExtra
            + f3.fbeExtra
            + f4.fbeExtra
            )

        _buffer.unshift(fbeStructOffset)

        return fbeResult
    }

    // Field type
    var fbeType: Long = fbeTypeConst

    companion object
    {
        const val fbeTypeConst: Long = 132
    }

    // Check if the struct value is valid
    fun verify(fbeVerifyType: Boolean = true): Boolean
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return true

        val fbeStructOffset = readUInt32(fbeOffset).toLong()
        if ((fbeStructOffset == 0L) || ((_buffer.offset + fbeStructOffset + 4 + 4) > _buffer.size))
            return false

        val fbeStructSize = readUInt32(fbeStructOffset).toLong()
        if (fbeStructSize < (4 + 4))
            return false

        val fbeStructType = readUInt32(fbeStructOffset + 4).toLong()
        if (fbeVerifyType && (fbeStructType != fbeType))
            return false

        _buffer.shift(fbeStructOffset)
        val fbeResult = verifyFields(fbeStructSize)
        _buffer.unshift(fbeStructOffset)
        return fbeResult
    }

    // Check if the struct fields are valid
    @Suppress("UNUSED_PARAMETER")
    fun verifyFields(fbeStructSize: Long): Boolean
    {
        var fbeCurrentSize = 4L + 4L

        if ((fbeCurrentSize + f1.fbeSize) > fbeStructSize)
            return true
        if (!f1.verify())
            return false
        fbeCurrentSize += f1.fbeSize

        if ((fbeCurrentSize + f2.fbeSize) > fbeStructSize)
            return true
        if (!f2.verify())
            return false
        fbeCurrentSize += f2.fbeSize

        if ((fbeCurrentSize + f3.fbeSize) > fbeStructSize)
            return true
        if (!f3.verify())
            return false
        fbeCurrentSize += f3.fbeSize

        if ((fbeCurrentSize + f4.fbeSize) > fbeStructSize)
            return true
        if (!f4.verify())
            return false
        fbeCurrentSize += f4.fbeSize

        return true
    }

    // Get the struct value (begin phase)
    fun getBegin(): Long
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return 0

        val fbeStructOffset = readUInt32(fbeOffset).toLong()
        assert((fbeStructOffset > 0) && ((_buffer.offset + fbeStructOffset + 4 + 4) <= _buffer.size)) { "Model is broken!" }
        if ((fbeStructOffset == 0L) || ((_buffer.offset + fbeStructOffset + 4 + 4) > _buffer.size))
            return 0

        val fbeStructSize = readUInt32(fbeStructOffset).toLong()
        assert(fbeStructSize >= (4 + 4)) { "Model is broken!" }
        if (fbeStructSize < (4 + 4))
            return 0

        _buffer.shift(fbeStructOffset)
        return fbeStructOffset
    }

    // Get the struct value (end phase)
    fun getEnd(fbeBegin: Long)
    {
        _buffer.unshift(fbeBegin)
    }

    // Get the struct value
    fun get(fbeValue: com.chronoxor.test.StructSet = com.chronoxor.test.StructSet()): com.chronoxor.test.StructSet
    {
        val fbeBegin = getBegin()
        if (fbeBegin == 0L)
            return fbeValue

        val fbeStructSize = readUInt32(0).toLong()
        getFields(fbeValue, fbeStructSize)
        getEnd(fbeBegin)
        return fbeValue
    }

    // Get the struct fields values
    @Suppress("UNUSED_PARAMETER")
    fun getFields(fbeValue: com.chronoxor.test.StructSet, fbeStructSize: Long)
    {
        var fbeCurrentSize = 4L + 4L

        if ((fbeCurrentSize + f1.fbeSize) <= fbeStructSize)
            f1.get(fbeValue.f1)
        else
            fbeValue.f1.clear()
        fbeCurrentSize += f1.fbeSize

        if ((fbeCurrentSize + f2.fbeSize) <= fbeStructSize)
            f2.get(fbeValue.f2)
        else
            fbeValue.f2.clear()
        fbeCurrentSize += f2.fbeSize

        if ((fbeCurrentSize + f3.fbeSize) <= fbeStructSize)
            f3.get(fbeValue.f3)
        else
            fbeValue.f3.clear()
        fbeCurrentSize += f3.fbeSize

        if ((fbeCurrentSize + f4.fbeSize) <= fbeStructSize)
            f4.get(fbeValue.f4)
        else
            fbeValue.f4.clear()
        fbeCurrentSize += f4.fbeSize
    }

    // Set the struct value (begin phase)
    fun setBegin(): Long
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return 0

        val fbeStructSize = fbeBody
        val fbeStructOffset = _buffer.allocate(fbeStructSize) - _buffer.offset
        assert((fbeStructOffset > 0) && ((_buffer.offset + fbeStructOffset + fbeStructSize) <= _buffer.size)) { "Model is broken!" }
        if ((fbeStructOffset <= 0) || ((_buffer.offset + fbeStructOffset + fbeStructSize) > _buffer.size))
            return 0

        write(fbeOffset, fbeStructOffset.toUInt())
        write(fbeStructOffset, fbeStructSize.toUInt())
        write(fbeStructOffset + 4, fbeType.toUInt())

        _buffer.shift(fbeStructOffset)
        return fbeStructOffset
    }

    // Set the struct value (end phase)
    fun setEnd(fbeBegin: Long)
    {
        _buffer.unshift(fbeBegin)
    }

    // Set the struct value
    fun set(fbeValue: com.chronoxor.test.StructSet)
    {
        val fbeBegin = setBegin()
        if (fbeBegin == 0L)
            return

        setFields(fbeValue)
        setEnd(fbeBegin)
    }

    // Set the struct fields values
    @Suppress("UNUSED_PARAMETER")
    fun setFields(fbeValue: com.chronoxor.test.StructSet)
    {
        f1.set(fbeValue.f1)
        f2.set(fbeValue.f2)
        f3.set(fbeValue.f3)
        f4.set(fbeValue.f4)
    }
}
