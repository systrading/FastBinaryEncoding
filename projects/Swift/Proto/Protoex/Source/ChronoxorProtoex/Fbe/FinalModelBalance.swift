//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.14.0.0
//------------------------------------------------------------------------------

import ChronoxorFbe
import ChronoxorProto

// Fast Binary Encoding Balance final model
public class FinalModelBalance: FinalModel {
    public var _buffer: Buffer
    public var _offset: Int

    let parent: ChronoxorProto.FinalModelBalance
    let locked: ChronoxorFbe.FinalModelDouble

    // Field type
    public var fbeType: Int = fbeTypeConst

    public static let fbeTypeConst: Int = ChronoxorProto.FinalModelBalance.fbeTypeConst

    public required init(buffer: Buffer, offset: Int) {
        _buffer = buffer
        _offset = offset

        parent = ChronoxorProto.FinalModelBalance(buffer: buffer, offset: 0)
        locked = FinalModelDouble(buffer: buffer, offset: 0)
    }

    // Get the allocation size
    public func fbeAllocationSize(value fbeValue: Balance) -> Int {
        return 0
            + parent.fbeAllocationSize(value: fbeValue.parent)
            + locked.fbeAllocationSize(value: fbeValue.locked)
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

        locked.fbeOffset = fbeCurrentOffset
        fbeFieldSize = locked.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        return fbeCurrentOffset
    }

    // Get the struct value
    public func get(size: inout Size) -> Balance {
        var fbeValue = Balance()
        return get(size: &size, fbeValue: &fbeValue)
    }

    // Get the struct value
    public func get(size: inout Size, fbeValue: inout Balance) -> Balance {
        _buffer.shift(offset: fbeOffset)
        size.value = getFields(fbeValue: &fbeValue)
        _buffer.unshift(offset: fbeOffset)
        return fbeValue
    }

    // Get the struct fields values
    public func getFields(fbeValue: inout Balance) -> Int {
        var fbeCurrentOffset: Int = 0
        var fbeCurrentSize: Int = 0
        var fbeFieldSize = Size()

        parent.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = parent.getFields(fbeValue: &fbeValue.parent)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        locked.fbeOffset = fbeCurrentOffset
        fbeValue.locked = locked.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }

    // Set the struct value
    public func set(value fbeValue: Balance) throws -> Int {
        _buffer.shift(offset: fbeOffset)
        let fbeSize = try setFields(fbeValue: fbeValue)
        _buffer.unshift(offset: fbeOffset)
        return fbeSize
    }

    // Set the struct fields values
    public func setFields(fbeValue: Balance) throws -> Int {
        var fbeCurrentOffset: Int = 0
        var fbeCurrentSize: Int = 0
        let fbeFieldSize = Size()

        parent.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try parent.setFields(fbeValue: fbeValue.parent)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        locked.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try locked.set(value: fbeValue.locked)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }
}
