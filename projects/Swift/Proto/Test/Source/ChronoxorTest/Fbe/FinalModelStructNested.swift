//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.0.0
//------------------------------------------------------------------------------

import ChronoxorFbe
import ChronoxorProto

// Fast Binary Encoding StructNested final model
public class FinalModelStructNested: FinalModel {
    public var _buffer: Buffer
    public var _offset: Int

    let parent: FinalModelStructOptional
    let f1000: FinalModelEnumSimple
    let f1001: FinalModelOptionalEnumSimple
    let f1002: FinalModelEnumTyped
    let f1003: FinalModelOptionalEnumTyped
    let f1004: FinalModelFlagsSimple
    let f1005: FinalModelOptionalFlagsSimple
    let f1006: FinalModelFlagsTyped
    let f1007: FinalModelOptionalFlagsTyped
    let f1008: FinalModelStructSimple
    let f1009: FinalModelOptionalStructSimple
    let f1010: FinalModelStructOptional
    let f1011: FinalModelOptionalStructOptional

    // Field type
    public var fbeType: Int = fbeTypeConst

    public static let fbeTypeConst: Int = 112

    public required init(buffer: Buffer, offset: Int) {
        _buffer = buffer
        _offset = offset

        parent = FinalModelStructOptional(buffer: buffer, offset: 0)
        f1000 = FinalModelEnumSimple(buffer: buffer, offset: 0)
        f1001 = FinalModelOptionalEnumSimple(buffer: buffer, offset: 0)
        f1002 = FinalModelEnumTyped(buffer: buffer, offset: 0)
        f1003 = FinalModelOptionalEnumTyped(buffer: buffer, offset: 0)
        f1004 = FinalModelFlagsSimple(buffer: buffer, offset: 0)
        f1005 = FinalModelOptionalFlagsSimple(buffer: buffer, offset: 0)
        f1006 = FinalModelFlagsTyped(buffer: buffer, offset: 0)
        f1007 = FinalModelOptionalFlagsTyped(buffer: buffer, offset: 0)
        f1008 = FinalModelStructSimple(buffer: buffer, offset: 0)
        f1009 = FinalModelOptionalStructSimple(buffer: buffer, offset: 0)
        f1010 = FinalModelStructOptional(buffer: buffer, offset: 0)
        f1011 = FinalModelOptionalStructOptional(buffer: buffer, offset: 0)
    }

    // Get the allocation size
    public func fbeAllocationSize(value fbeValue: StructNested) -> Int {
        return 0
            + parent.fbeAllocationSize(value: fbeValue.parent)
            + f1000.fbeAllocationSize(value: fbeValue.f1000)
            + f1001.fbeAllocationSize(value: fbeValue.f1001)
            + f1002.fbeAllocationSize(value: fbeValue.f1002)
            + f1003.fbeAllocationSize(value: fbeValue.f1003)
            + f1004.fbeAllocationSize(value: fbeValue.f1004)
            + f1005.fbeAllocationSize(value: fbeValue.f1005)
            + f1006.fbeAllocationSize(value: fbeValue.f1006)
            + f1007.fbeAllocationSize(value: fbeValue.f1007)
            + f1008.fbeAllocationSize(value: fbeValue.f1008)
            + f1009.fbeAllocationSize(value: fbeValue.f1009)
            + f1010.fbeAllocationSize(value: fbeValue.f1010)
            + f1011.fbeAllocationSize(value: fbeValue.f1011)
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

        parent.fbeOffset = fbeCurrentOffset
        fbeFieldSize = parent.verifyFields()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f1000.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f1000.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f1001.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f1001.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f1002.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f1002.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f1003.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f1003.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f1004.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f1004.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f1005.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f1005.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f1006.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f1006.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f1007.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f1007.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f1008.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f1008.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f1009.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f1009.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f1010.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f1010.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f1011.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f1011.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        return fbeCurrentOffset
    }

    // Get the struct value
    public func get(size: inout Size) -> StructNested {
        var fbeValue = StructNested()
        return get(size: &size, fbeValue: &fbeValue)
    }

    // Get the struct value
    public func get(size: inout Size, fbeValue: inout StructNested) -> StructNested {
        _buffer.shift(offset: fbeOffset)
        size.value = getFields(fbeValue: &fbeValue)
        _buffer.unshift(offset: fbeOffset)
        return fbeValue
    }

    // Get the struct fields values
    public func getFields(fbeValue: inout StructNested) -> Int {
        var fbeCurrentOffset: Int = 0
        var fbeCurrentSize: Int = 0
        var fbeFieldSize = Size()

        parent.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = parent.getFields(fbeValue: &fbeValue.parent)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1000.fbeOffset = fbeCurrentOffset
        fbeValue.f1000 = f1000.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1001.fbeOffset = fbeCurrentOffset
        fbeValue.f1001 = f1001.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1002.fbeOffset = fbeCurrentOffset
        fbeValue.f1002 = f1002.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1003.fbeOffset = fbeCurrentOffset
        fbeValue.f1003 = f1003.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1004.fbeOffset = fbeCurrentOffset
        fbeValue.f1004 = f1004.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1005.fbeOffset = fbeCurrentOffset
        fbeValue.f1005 = f1005.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1006.fbeOffset = fbeCurrentOffset
        fbeValue.f1006 = f1006.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1007.fbeOffset = fbeCurrentOffset
        fbeValue.f1007 = f1007.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1008.fbeOffset = fbeCurrentOffset
        fbeValue.f1008 = f1008.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1009.fbeOffset = fbeCurrentOffset
        fbeValue.f1009 = f1009.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1010.fbeOffset = fbeCurrentOffset
        fbeValue.f1010 = f1010.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1011.fbeOffset = fbeCurrentOffset
        fbeValue.f1011 = f1011.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }

    // Set the struct value
    public func set(value fbeValue: StructNested) throws -> Int {
        _buffer.shift(offset: fbeOffset)
        let fbeSize = try setFields(fbeValue: fbeValue)
        _buffer.unshift(offset: fbeOffset)
        return fbeSize
    }

    // Set the struct fields values
    public func setFields(fbeValue: StructNested) throws -> Int {
        var fbeCurrentOffset: Int = 0
        var fbeCurrentSize: Int = 0
        let fbeFieldSize = Size()

        parent.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try parent.setFields(fbeValue: fbeValue.parent)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1000.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f1000.set(value: fbeValue.f1000)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1001.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f1001.set(value: fbeValue.f1001)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1002.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f1002.set(value: fbeValue.f1002)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1003.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f1003.set(value: fbeValue.f1003)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1004.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f1004.set(value: fbeValue.f1004)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1005.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f1005.set(value: fbeValue.f1005)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1006.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f1006.set(value: fbeValue.f1006)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1007.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f1007.set(value: fbeValue.f1007)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1008.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f1008.set(value: fbeValue.f1008)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1009.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f1009.set(value: fbeValue.f1009)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1010.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f1010.set(value: fbeValue.f1010)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1011.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f1011.set(value: fbeValue.f1011)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }
}
