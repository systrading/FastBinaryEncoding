// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: fbe
// Version: 1.1.0.0

@file:Suppress("UnusedImport", "unused")

package fbe

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

// Fast Binary Encoding bytes final model
class FinalModelBytes(buffer: Buffer, offset: Long) : FinalModel(buffer, offset)
{
    // Get the allocation size
    fun fbeAllocationSize(value: ByteArray): Long = 4 + value.size.toLong()

    // Check if the bytes value is valid
    override fun verify(): Long
    {
        if ((_buffer.offset + fbeOffset) + 4 > _buffer.size)
            return Long.MAX_VALUE

        val fbeBytesSize = readUInt32(fbeOffset).toLong()
        if ((_buffer.offset + fbeOffset + 4 + fbeBytesSize) > _buffer.size)
            return Long.MAX_VALUE

        return 4 + fbeBytesSize
    }

    // Get the bytes value
    fun get(size: Size): ByteArray
    {
        if ((_buffer.offset + fbeOffset) + 4 > _buffer.size)
        {
            size.value = 0
            return ByteArray(0)
        }

        val fbeBytesSize = readUInt32(fbeOffset).toLong()
        assert((_buffer.offset + fbeOffset + 4 + fbeBytesSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + 4 + fbeBytesSize) > _buffer.size)
        {
            size.value = 4
            return ByteArray(0)
        }

        size.value = 4 + fbeBytesSize
        return readBytes(fbeOffset + 4, fbeBytesSize)
    }

    // Set the bytes value
    fun set(value: ByteArray): Long
    {
        assert((_buffer.offset + fbeOffset + 4) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + 4) > _buffer.size)
            return 0

        val fbeBytesSize = value.size.toLong()
        assert((_buffer.offset + fbeOffset + 4 + fbeBytesSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + 4 + fbeBytesSize) > _buffer.size)
            return 4

        write(fbeOffset, fbeBytesSize.toUInt())
        write(fbeOffset + 4, value)
        return 4 + fbeBytesSize
    }
}
