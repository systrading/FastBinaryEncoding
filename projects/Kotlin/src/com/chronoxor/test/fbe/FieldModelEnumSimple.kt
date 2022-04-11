//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test.fbe

// Fast Binary Encoding EnumSimple field model
class FieldModelEnumSimple(buffer: com.chronoxor.fbe.Buffer, offset: Long) : com.chronoxor.fbe.FieldModel(buffer, offset)
{
    // Field size
    override val fbeSize: Long = 4

    // Get the value
    fun get(defaults: com.chronoxor.test.EnumSimple = com.chronoxor.test.EnumSimple()): com.chronoxor.test.EnumSimple
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return defaults

        return com.chronoxor.test.EnumSimple(readInt32(fbeOffset))
    }

    // Set the value
    fun set(value: com.chronoxor.test.EnumSimple)
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return

        write(fbeOffset, value.raw)
    }
}
