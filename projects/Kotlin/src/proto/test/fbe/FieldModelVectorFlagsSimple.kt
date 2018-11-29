// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.1.0.0

@file:Suppress("UnusedImport", "unused")

package test.fbe

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import fbe.*
import test.*

// Fast Binary Encoding FlagsSimple vector field model
class FieldModelVectorFlagsSimple(buffer: Buffer, offset: Long) : FieldModel(buffer, offset)
{
    private val _model = FieldModelFlagsSimple(buffer, offset)

    // Field size
    override val fbeSize: Long = 4

    // Field extra size
    override val fbeExtra: Long get()
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return 0

        val fbeVectorOffset = readUInt32(fbeOffset).toLong()
        if ((fbeVectorOffset == 0L) || ((_buffer.offset + fbeVectorOffset + 4) > _buffer.size))
            return 0

        val fbeVectorSize = readUInt32(fbeVectorOffset).toLong()

        var fbeResult: Long = 4
        _model.fbeOffset = fbeVectorOffset + 4
        var i = fbeVectorSize
        while (i-- > 0)
        {
            fbeResult += _model.fbeSize + _model.fbeExtra
            _model.fbeShift(_model.fbeSize)
        }
        return fbeResult
    }

    // Get the vector offset
    val offset: Long get()
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return 0

        return readUInt32(fbeOffset).toLong()
    }

    // Get the vector size
    val size: Long get()
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return 0

        val fbeVectorOffset = readUInt32(fbeOffset).toLong()
        if ((fbeVectorOffset == 0L) || ((_buffer.offset + fbeVectorOffset + 4) > _buffer.size))
            return 0

        return readUInt32(fbeVectorOffset).toLong()
    }

    // Vector index operator
    fun getItem(index: Long): FieldModelFlagsSimple
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }

        val fbeVectorOffset = readUInt32(fbeOffset).toLong()
        assert((fbeVectorOffset > 0) && ((_buffer.offset + fbeVectorOffset + 4) <= _buffer.size)) { "Model is broken!" }

        val fbeVectorSize = readUInt32(fbeVectorOffset).toLong()
        assert(index < fbeVectorSize) { "Index is out of bounds!" }

        _model.fbeOffset = fbeVectorOffset + 4
        _model.fbeShift(index * _model.fbeSize)
        return _model
    }

    // Resize the vector and get its first model
    fun resize(size: Long): FieldModelFlagsSimple
    {
        val fbeVectorSize = size * _model.fbeSize
        val fbeVectorOffset = _buffer.allocate(4 + fbeVectorSize) - _buffer.offset
        assert((fbeVectorOffset > 0) && ((_buffer.offset + fbeVectorOffset + 4) <= _buffer.size)) { "Model is broken!" }

        write(fbeOffset, fbeVectorOffset.toUInt())
        write(fbeVectorOffset, size.toUInt())
        write(fbeVectorOffset + 4, 0.toByte(), fbeVectorSize)

        _model.fbeOffset = fbeVectorOffset + 4
        return _model
    }

    // Check if the vector is valid
    override fun verify(): Boolean
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return true

        val fbeVectorOffset = readUInt32(fbeOffset).toLong()
        if (fbeVectorOffset == 0L)
            return true

        if ((_buffer.offset + fbeVectorOffset + 4) > _buffer.size)
            return false

        val fbeVectorSize = readUInt32(fbeVectorOffset).toLong()

        _model.fbeOffset = fbeVectorOffset + 4
        var i = fbeVectorSize
        while (i-- > 0)
        {
            if (!_model.verify())
                return false
            _model.fbeShift(_model.fbeSize)
        }

        return true
    }

    // Get the vector as ArrayList
    operator fun get(values: ArrayList<FlagsSimple>)
    {
        values.clear()

        val fbeVectorSize = size
        if (fbeVectorSize == 0L)
            return

        values.ensureCapacity(fbeVectorSize.toInt())

        val fbeModel = getItem(0)
        var i = fbeVectorSize
        while (i-- > 0)
        {
            val value = fbeModel.get()
            values.add(value)
            fbeModel.fbeShift(fbeModel.fbeSize)
        }
    }

    // Get the vector as LinkedList
    operator fun get(values: LinkedList<FlagsSimple>)
    {
        values.clear()

        val fbeVectorSize = size
        if (fbeVectorSize == 0L)
            return

        val fbeModel = getItem(0)
        var i = fbeVectorSize
        while (i-- > 0)
        {
            val value = fbeModel.get()
            values.add(value)
            fbeModel.fbeShift(fbeModel.fbeSize)
        }
    }

    // Get the vector as HashSet
    operator fun get(values: HashSet<FlagsSimple>)
    {
        values.clear()

        val fbeVectorSize = size
        if (fbeVectorSize == 0L)
            return

        val fbeModel = getItem(0)
        var i = fbeVectorSize
        while (i-- > 0)
        {
            val value = fbeModel.get()
            values.add(value)
            fbeModel.fbeShift(fbeModel.fbeSize)
        }
    }

    // Set the vector as ArrayList
    fun set(values: ArrayList<FlagsSimple>)
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return

        val fbeModel = resize(values.size.toLong())
        for (value in values)
        {
            fbeModel.set(value)
            fbeModel.fbeShift(fbeModel.fbeSize)
        }
    }

    // Set the vector as LinkedList
    fun set(values: LinkedList<FlagsSimple>)
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return

        val fbeModel = resize(values.size.toLong())
        for (value in values)
        {
            fbeModel.set(value)
            fbeModel.fbeShift(fbeModel.fbeSize)
        }
    }

    // Set the vector as HashSet
    fun set(values: HashSet<FlagsSimple>)
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return

        val fbeModel = resize(values.size.toLong())
        for (value in values)
        {
            fbeModel.set(value)
            fbeModel.fbeShift(fbeModel.fbeSize)
        }
    }
}
