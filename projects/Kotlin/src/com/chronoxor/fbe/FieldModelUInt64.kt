//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.14.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.fbe

// Fast Binary Encoding ULong field model
class FieldModelUInt64(buffer: Buffer, offset: Long) : FieldModel(buffer, offset)
{
    // Field size
    override val fbeSize: Long = 8

    // Get the value
    fun get(defaults: ULong = 0uL): ULong
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return defaults

        return readUInt64(fbeOffset)
    }

    // Set the value
    fun set(value: ULong)
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return

        write(fbeOffset, value)
    }
}
