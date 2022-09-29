//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.0.0
//------------------------------------------------------------------------------

import ChronoxorFbe
import ChronoxorProto

// Fast Binary Encoding StructSet final model
public class FinalModelStructSet: FinalModel {
    public var _buffer: Buffer
    public var _offset: Int

    let f1: FinalModelVectorUInt8
    let f2: FinalModelVectorEnumSimple
    let f3: FinalModelVectorFlagsSimple
    let f4: FinalModelVectorStructSimple

    // Field type
    public var fbeType: Int = fbeTypeConst

    public static let fbeTypeConst: Int = 132

    public required init(buffer: Buffer, offset: Int) {
        _buffer = buffer
        _offset = offset

        f1 = FinalModelVectorUInt8(buffer: buffer, offset: 0)
        f2 = FinalModelVectorEnumSimple(buffer: buffer, offset: 0)
        f3 = FinalModelVectorFlagsSimple(buffer: buffer, offset: 0)
        f4 = FinalModelVectorStructSimple(buffer: buffer, offset: 0)
    }

    // Get the allocation size
    public func fbeAllocationSize(value fbeValue: StructSet) -> Int {
        return 0
            + f1.fbeAllocationSize(value: fbeValue.f1)
            + f2.fbeAllocationSize(value: fbeValue.f2)
            + f3.fbeAllocationSize(value: fbeValue.f3)
            + f4.fbeAllocationSize(value: fbeValue.f4)
    }

    // Check if the struct value is valid
    public func verify() -> Int {
        _buffer.shift(offset: fbeOffset)
        let fbeResult = verifyFields()
        _buffer.unshift(offset: fbeOffset)
        return fbeResult
    }

    // Check if the struct fields are valid
    public func verifyFields() -> Int {
        var fbeCurrentOffset: Int = 0
        var fbeFieldSize: Int = 0

        f1.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f1.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f2.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f2.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f3.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f3.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f4.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f4.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        return fbeCurrentOffset
    }

    // Get the struct value
    public func get(size: inout Size) -> StructSet {
        var fbeValue = StructSet()
        return get(size: &size, fbeValue: &fbeValue)
    }

    // Get the struct value
    public func get(size: inout Size, fbeValue: inout StructSet) -> StructSet {
        _buffer.shift(offset: fbeOffset)
        size.value = getFields(fbeValue: &fbeValue)
        _buffer.unshift(offset: fbeOffset)
        return fbeValue
    }

    // Get the struct fields values
    public func getFields(fbeValue: inout StructSet) -> Int {
        var fbeCurrentOffset: Int = 0
        var fbeCurrentSize: Int = 0
        var fbeFieldSize = Size()

        f1.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = f1.get(values: &fbeValue.f1)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f2.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = f2.get(values: &fbeValue.f2)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f3.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = f3.get(values: &fbeValue.f3)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f4.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = f4.get(values: &fbeValue.f4)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }

    // Set the struct value
    public func set(value fbeValue: StructSet) throws -> Int {
        _buffer.shift(offset: fbeOffset)
        let fbeSize = try setFields(fbeValue: fbeValue)
        _buffer.unshift(offset: fbeOffset)
        return fbeSize
    }

    // Set the struct fields values
    public func setFields(fbeValue: StructSet) throws -> Int {
        var fbeCurrentOffset: Int = 0
        var fbeCurrentSize: Int = 0
        let fbeFieldSize = Size()

        f1.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f1.set(value: fbeValue.f1)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f2.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f2.set(value: fbeValue.f2)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f3.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f3.set(value: fbeValue.f3)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f4.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f4.set(value: fbeValue.f4)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }
}
