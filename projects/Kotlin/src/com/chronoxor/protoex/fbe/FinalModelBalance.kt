//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.14.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.protoex.fbe

// Fast Binary Encoding Balance final model
@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods", "ReplaceGetOrSet")
class FinalModelBalance(buffer: com.chronoxor.fbe.Buffer, offset: Long) : com.chronoxor.fbe.FinalModel(buffer, offset)
{
    val parent: com.chronoxor.proto.fbe.FinalModelBalance = com.chronoxor.proto.fbe.FinalModelBalance(buffer, 0)
    val locked: com.chronoxor.fbe.FinalModelDouble = com.chronoxor.fbe.FinalModelDouble(buffer, 0)

    // Get the allocation size
    @Suppress("UNUSED_PARAMETER")
    fun fbeAllocationSize(fbeValue: com.chronoxor.protoex.Balance): Long = (0
        + parent.fbeAllocationSize(fbeValue)
        + locked.fbeAllocationSize(fbeValue.locked)
        )

    // Field type
    var fbeType: Long = fbeTypeConst

    companion object
    {
        const val fbeTypeConst: Long = com.chronoxor.proto.fbe.FinalModelBalance.fbeTypeConst
    }

    // Check if the struct value is valid
    override fun verify(): Long
    {
        _buffer.shift(fbeOffset)
        val fbeResult = verifyFields()
        _buffer.unshift(fbeOffset)
        return fbeResult
    }

    // Check if the struct fields are valid
    fun verifyFields(): Long
    {
        var fbeCurrentOffset = 0L
        @Suppress("VARIABLE_WITH_REDUNDANT_INITIALIZER")
        var fbeFieldSize = 0L

        parent.fbeOffset = fbeCurrentOffset
        fbeFieldSize = parent.verifyFields()
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE
        fbeCurrentOffset += fbeFieldSize

        locked.fbeOffset = fbeCurrentOffset
        fbeFieldSize = locked.verify()
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE
        fbeCurrentOffset += fbeFieldSize

        return fbeCurrentOffset
    }

    // Get the struct value
    fun get(fbeSize: com.chronoxor.fbe.Size, fbeValue: com.chronoxor.protoex.Balance = com.chronoxor.protoex.Balance()): com.chronoxor.protoex.Balance
    {
        _buffer.shift(fbeOffset)
        fbeSize.value = getFields(fbeValue)
        _buffer.unshift(fbeOffset)
        return fbeValue
    }

    // Get the struct fields values
    @Suppress("UNUSED_PARAMETER")
    fun getFields(fbeValue: com.chronoxor.protoex.Balance): Long
    {
        var fbeCurrentOffset = 0L
        var fbeCurrentSize = 0L
        val fbeFieldSize = com.chronoxor.fbe.Size()

        parent.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = parent.getFields(fbeValue)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        locked.fbeOffset = fbeCurrentOffset
        fbeValue.locked = locked.get(fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }

    // Set the struct value
    fun set(fbeValue: com.chronoxor.protoex.Balance): Long
    {
        _buffer.shift(fbeOffset)
        val fbeSize = setFields(fbeValue)
        _buffer.unshift(fbeOffset)
        return fbeSize
    }

    // Set the struct fields values
    @Suppress("UNUSED_PARAMETER")
    fun setFields(fbeValue: com.chronoxor.protoex.Balance): Long
    {
        var fbeCurrentOffset = 0L
        var fbeCurrentSize = 0L
        val fbeFieldSize = com.chronoxor.fbe.Size()

        parent.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = parent.setFields(fbeValue)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        locked.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = locked.set(fbeValue.locked)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }
}
