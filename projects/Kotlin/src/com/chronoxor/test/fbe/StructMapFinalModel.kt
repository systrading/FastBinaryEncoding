// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.5.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test.fbe

// Fast Binary Encoding StructMap final model
class StructMapFinalModel : com.chronoxor.fbe.Model
{
    private val _model: FinalModelStructMap

    constructor() { _model = FinalModelStructMap(buffer, 8) }
    constructor(buffer: com.chronoxor.fbe.Buffer) : super(buffer) { _model = FinalModelStructMap(buffer, 8) }

    // Model type
    var fbeType: Long = fbeTypeConst

    companion object
    {
        const val fbeTypeConst: Long = FinalModelStructMap.fbeTypeConst
    }

    // Check if the struct value is valid
    fun verify(): Boolean
    {
        if ((buffer.offset + _model.fbeOffset) > buffer.size)
            return false

        val fbeStructSize = readUInt32(_model.fbeOffset - 8).toLong()
        val fbeStructType = readUInt32(_model.fbeOffset - 4).toLong()
        if ((fbeStructSize <= 0) || (fbeStructType != fbeType))
            return false

        return ((8 + _model.verify()) == fbeStructSize)
    }

    // Serialize the struct value
    fun serialize(value: com.chronoxor.test.StructMap): Long
    {
        val fbeInitialSize = buffer.size

        val fbeStructType = fbeType
        var fbeStructSize = 8 + _model.fbeAllocationSize(value)
        val fbeStructOffset = buffer.allocate(fbeStructSize) - buffer.offset
        assert((buffer.offset + fbeStructOffset + fbeStructSize) <= buffer.size) { "Model is broken!" }
        if ((buffer.offset + fbeStructOffset + fbeStructSize) > buffer.size)
            return 0

        fbeStructSize = 8 + _model.set(value)
        buffer.resize(fbeInitialSize + fbeStructSize)

        write(_model.fbeOffset - 8, fbeStructSize.toUInt())
        write(_model.fbeOffset - 4, fbeStructType.toUInt())

        return fbeStructSize
    }

    // Deserialize the struct value
    fun deserialize(): com.chronoxor.test.StructMap { val value = com.chronoxor.test.StructMap(); deserialize(value); return value }
    @Suppress("UNUSED_VALUE")
    fun deserialize(value: com.chronoxor.test.StructMap): Long
    {
        var valueRef = value

        assert((buffer.offset + _model.fbeOffset) <= buffer.size) { "Model is broken!" }
        if ((buffer.offset + _model.fbeOffset) > buffer.size)
            return 0

        val fbeStructSize = readUInt32(_model.fbeOffset - 8).toLong()
        val fbeStructType = readUInt32(_model.fbeOffset - 4).toLong()
        assert((fbeStructSize > 0) && (fbeStructType == fbeType)) { "Model is broken!" }
        if ((fbeStructSize <= 0) || (fbeStructType != fbeType))
            return 8

        val fbeSize = com.chronoxor.fbe.Size()
        valueRef = _model.get(fbeSize, valueRef)
        return 8 + fbeSize.value
    }

    // Move to the next struct value
    fun next(prev: Long)
    {
        _model.fbeShift(prev)
    }
}
