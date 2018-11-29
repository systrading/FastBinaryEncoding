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

// Fast Binary Encoding timestamp field model
class FieldModelTimestamp(buffer: Buffer, offset: Long) : FieldModel(buffer, offset)
{
    // Field size
    override val fbeSize: Long = 8

    // Get the timestamp value
    fun get(defaults: Instant = Instant.EPOCH): Instant
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return defaults

        val nanoseconds = readInt64(fbeOffset)
        return Instant.ofEpochSecond(nanoseconds / 1000000000, nanoseconds % 1000000000)
    }

    // Set the timestamp value
    fun set(value: Instant)
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return

        val nanoseconds = value.epochSecond * 1000000000 + value.nano
        write(fbeOffset, nanoseconds.toULong())
    }
}
