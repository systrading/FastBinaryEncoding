// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.5.0.0

import Foundation
import ChronoxorFbe
import ChronoxorProto

// Fast Binary Encoding UInt8 array final model
class FinalModelArrayUInt8: FinalModel {
    var _buffer: Buffer = Buffer()
    var _offset: Int = 0
    var _size: Int = 0

    private var _model: ChronoxorFbe.FinalModelUInt8

    init(buffer: Buffer, offset: Int, size: Int) {
        _buffer = buffer
        _offset = offset
        _size = size

        _model = ChronoxorFbe.FinalModelUInt8(buffer: buffer, offset: offset)
    }

    // Get the allocation size
    func fbeAllocationSize(value values: Array<UInt8>) -> Int {
        var size: Int = 0
        for value in values {
            size += _model.fbeAllocationSize(value: value)
        }

        return size
    }

    // Check if the vector is valid
    public func verify() -> Int {
        if _buffer.offset + fbeOffset > _buffer.size {
            return Int.max
        }

        var size: Int = 0
        _model.fbeOffset = fbeOffset
        var i = _size
        while i > 0 {
            let offset = _model.verify()
            if offset == Int.max { return Int.max }
            _model.fbeShift(size: offset)
            size += offset
            i -= 1
        }
        return size
    }

    public func get(size: inout Size) -> Array<UInt8> {
        var values = Array<UInt8>()

        if _buffer.offset + fbeOffset > _buffer.size {
            assertionFailure("Model is broken!")
            size.value = 0
            return values
        }

        size.value = 0
        var offset = Size()
        _model.fbeOffset = fbeOffset
        for _ in 0..._size {
            offset.value = 0
            let value = _model.get(size: &offset)
            values.append(value)
            _model.fbeShift(size: offset.value)
            size.value += offset.value
        }
        return values
    }

    public func get(values: inout Array<UInt8>) -> Int {
        values.removeAll()

        if _buffer.offset + fbeOffset > _buffer.size {
            assertionFailure("Model is broken!")
            return 0
        }

        var size: Int = 0
        var offset = Size()
        _model.fbeOffset = fbeOffset
        for _ in 1..._size {
            offset.value = 0
            let value = _model.get(size: &offset)
            values.append(value)
            _model.fbeShift(size: offset.value)
            size += offset.value
        }
        return size
    }

    public func set(value values: Array<UInt8>) throws -> Int {
        if _buffer.offset + fbeOffset > _buffer.size {
            assertionFailure("Model is broken!")
            return 0
        }

        var size: Int = 0
        _model.fbeOffset = fbeOffset
        for value in values {
            let offset = try _model.set(value: value)
            _model.fbeShift(size: offset)
            size += offset
        }
        return size
    }
}
