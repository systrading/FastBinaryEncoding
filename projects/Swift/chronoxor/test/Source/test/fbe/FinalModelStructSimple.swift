// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.3.0.0


import fbe

import proto

// Fast Binary Encoding StructSimple final model
public class FinalModelStructSimple: FinalModel {
    public var _buffer: Buffer
    public var _offset: Int

    let id: fbe.FinalModelInt32
    let f1: fbe.FinalModelBoolean
    let f2: fbe.FinalModelBoolean
    let f3: fbe.FinalModelUInt8
    let f4: fbe.FinalModelUInt8
    let f5: fbe.FinalModelChar
    let f6: fbe.FinalModelChar
    let f7: fbe.FinalModelWChar
    let f8: fbe.FinalModelWChar
    let f9: fbe.FinalModelInt8
    let f10: fbe.FinalModelInt8
    let f11: fbe.FinalModelUInt8
    let f12: fbe.FinalModelUInt8
    let f13: fbe.FinalModelInt16
    let f14: fbe.FinalModelInt16
    let f15: fbe.FinalModelUInt16
    let f16: fbe.FinalModelUInt16
    let f17: fbe.FinalModelInt32
    let f18: fbe.FinalModelInt32
    let f19: fbe.FinalModelUInt32
    let f20: fbe.FinalModelUInt32
    let f21: fbe.FinalModelInt64
    let f22: fbe.FinalModelInt64
    let f23: fbe.FinalModelUInt64
    let f24: fbe.FinalModelUInt64
    let f25: fbe.FinalModelFloat
    let f26: fbe.FinalModelFloat
    let f27: fbe.FinalModelDouble
    let f28: fbe.FinalModelDouble
    let f29: fbe.FinalModelDecimal
    let f30: fbe.FinalModelDecimal
    let f31: fbe.FinalModelString
    let f32: fbe.FinalModelString
    let f33: fbe.FinalModelTimestamp
    let f34: fbe.FinalModelTimestamp
    let f35: fbe.FinalModelTimestamp
    let f36: fbe.FinalModelUUID
    let f37: fbe.FinalModelUUID
    let f38: fbe.FinalModelUUID
    let f39: proto.FinalModelOrderSide
    let f40: proto.FinalModelOrderType
    let f41: proto.FinalModelOrder
    let f42: proto.FinalModelBalance
    let f43: proto.FinalModelState
    let f44: proto.FinalModelAccount

    // Field type
    public var fbeType: Int = fbeTypeConst

    public static let fbeTypeConst: Int = 110

    public required init(buffer: Buffer, offset: Int) {
        _buffer = buffer
        _offset = offset

        id = FinalModelInt32(buffer: buffer, offset: 0)
        f1 = FinalModelBoolean(buffer: buffer, offset: 0)
        f2 = FinalModelBoolean(buffer: buffer, offset: 0)
        f3 = FinalModelUInt8(buffer: buffer, offset: 0)
        f4 = FinalModelUInt8(buffer: buffer, offset: 0)
        f5 = FinalModelChar(buffer: buffer, offset: 0)
        f6 = FinalModelChar(buffer: buffer, offset: 0)
        f7 = FinalModelWChar(buffer: buffer, offset: 0)
        f8 = FinalModelWChar(buffer: buffer, offset: 0)
        f9 = FinalModelInt8(buffer: buffer, offset: 0)
        f10 = FinalModelInt8(buffer: buffer, offset: 0)
        f11 = FinalModelUInt8(buffer: buffer, offset: 0)
        f12 = FinalModelUInt8(buffer: buffer, offset: 0)
        f13 = FinalModelInt16(buffer: buffer, offset: 0)
        f14 = FinalModelInt16(buffer: buffer, offset: 0)
        f15 = FinalModelUInt16(buffer: buffer, offset: 0)
        f16 = FinalModelUInt16(buffer: buffer, offset: 0)
        f17 = FinalModelInt32(buffer: buffer, offset: 0)
        f18 = FinalModelInt32(buffer: buffer, offset: 0)
        f19 = FinalModelUInt32(buffer: buffer, offset: 0)
        f20 = FinalModelUInt32(buffer: buffer, offset: 0)
        f21 = FinalModelInt64(buffer: buffer, offset: 0)
        f22 = FinalModelInt64(buffer: buffer, offset: 0)
        f23 = FinalModelUInt64(buffer: buffer, offset: 0)
        f24 = FinalModelUInt64(buffer: buffer, offset: 0)
        f25 = FinalModelFloat(buffer: buffer, offset: 0)
        f26 = FinalModelFloat(buffer: buffer, offset: 0)
        f27 = FinalModelDouble(buffer: buffer, offset: 0)
        f28 = FinalModelDouble(buffer: buffer, offset: 0)
        f29 = FinalModelDecimal(buffer: buffer, offset: 0)
        f30 = FinalModelDecimal(buffer: buffer, offset: 0)
        f31 = FinalModelString(buffer: buffer, offset: 0)
        f32 = FinalModelString(buffer: buffer, offset: 0)
        f33 = FinalModelTimestamp(buffer: buffer, offset: 0)
        f34 = FinalModelTimestamp(buffer: buffer, offset: 0)
        f35 = FinalModelTimestamp(buffer: buffer, offset: 0)
        f36 = FinalModelUUID(buffer: buffer, offset: 0)
        f37 = FinalModelUUID(buffer: buffer, offset: 0)
        f38 = FinalModelUUID(buffer: buffer, offset: 0)
        f39 = proto.FinalModelOrderSide(buffer: buffer, offset: 0)
        f40 = proto.FinalModelOrderType(buffer: buffer, offset: 0)
        f41 = proto.FinalModelOrder(buffer: buffer, offset: 0)
        f42 = proto.FinalModelBalance(buffer: buffer, offset: 0)
        f43 = proto.FinalModelState(buffer: buffer, offset: 0)
        f44 = proto.FinalModelAccount(buffer: buffer, offset: 0)
    }

    // Get the allocation size
    public func fbeAllocationSize(value fbeValue: StructSimple) -> Int {
        return 0
            + id.fbeAllocationSize(value: fbeValue.id)
            + f1.fbeAllocationSize(value: fbeValue.f1)
            + f2.fbeAllocationSize(value: fbeValue.f2)
            + f3.fbeAllocationSize(value: fbeValue.f3)
            + f4.fbeAllocationSize(value: fbeValue.f4)
            + f5.fbeAllocationSize(value: fbeValue.f5)
            + f6.fbeAllocationSize(value: fbeValue.f6)
            + f7.fbeAllocationSize(value: fbeValue.f7)
            + f8.fbeAllocationSize(value: fbeValue.f8)
            + f9.fbeAllocationSize(value: fbeValue.f9)
            + f10.fbeAllocationSize(value: fbeValue.f10)
            + f11.fbeAllocationSize(value: fbeValue.f11)
            + f12.fbeAllocationSize(value: fbeValue.f12)
            + f13.fbeAllocationSize(value: fbeValue.f13)
            + f14.fbeAllocationSize(value: fbeValue.f14)
            + f15.fbeAllocationSize(value: fbeValue.f15)
            + f16.fbeAllocationSize(value: fbeValue.f16)
            + f17.fbeAllocationSize(value: fbeValue.f17)
            + f18.fbeAllocationSize(value: fbeValue.f18)
            + f19.fbeAllocationSize(value: fbeValue.f19)
            + f20.fbeAllocationSize(value: fbeValue.f20)
            + f21.fbeAllocationSize(value: fbeValue.f21)
            + f22.fbeAllocationSize(value: fbeValue.f22)
            + f23.fbeAllocationSize(value: fbeValue.f23)
            + f24.fbeAllocationSize(value: fbeValue.f24)
            + f25.fbeAllocationSize(value: fbeValue.f25)
            + f26.fbeAllocationSize(value: fbeValue.f26)
            + f27.fbeAllocationSize(value: fbeValue.f27)
            + f28.fbeAllocationSize(value: fbeValue.f28)
            + f29.fbeAllocationSize(value: fbeValue.f29)
            + f30.fbeAllocationSize(value: fbeValue.f30)
            + f31.fbeAllocationSize(value: fbeValue.f31)
            + f32.fbeAllocationSize(value: fbeValue.f32)
            + f33.fbeAllocationSize(value: fbeValue.f33)
            + f34.fbeAllocationSize(value: fbeValue.f34)
            + f35.fbeAllocationSize(value: fbeValue.f35)
            + f36.fbeAllocationSize(value: fbeValue.f36)
            + f37.fbeAllocationSize(value: fbeValue.f37)
            + f38.fbeAllocationSize(value: fbeValue.f38)
            + f39.fbeAllocationSize(value: fbeValue.f39)
            + f40.fbeAllocationSize(value: fbeValue.f40)
            + f41.fbeAllocationSize(value: fbeValue.f41)
            + f42.fbeAllocationSize(value: fbeValue.f42)
            + f43.fbeAllocationSize(value: fbeValue.f43)
            + f44.fbeAllocationSize(value: fbeValue.f44)
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

        id.fbeOffset = fbeCurrentOffset
        fbeFieldSize = id.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

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

        f5.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f5.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f6.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f6.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f7.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f7.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f8.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f8.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f9.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f9.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f10.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f10.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f11.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f11.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f12.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f12.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f13.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f13.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f14.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f14.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f15.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f15.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f16.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f16.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f17.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f17.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f18.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f18.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f19.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f19.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f20.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f20.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f21.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f21.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f22.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f22.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f23.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f23.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f24.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f24.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f25.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f25.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f26.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f26.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f27.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f27.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f28.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f28.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f29.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f29.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f30.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f30.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f31.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f31.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f32.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f32.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f33.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f33.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f34.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f34.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f35.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f35.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f36.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f36.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f37.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f37.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f38.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f38.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f39.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f39.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f40.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f40.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f41.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f41.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f42.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f42.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f43.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f43.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f44.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f44.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        return fbeCurrentOffset
    }

    // Get the struct value
    public func get(size: inout Size) -> StructSimple {
        var fbeValue = StructSimple()
        return get(size: &size, fbeValue: &fbeValue)
    }

    // Get the struct value
    public func get(size: inout Size, fbeValue: inout StructSimple) -> StructSimple {
        _buffer.shift(offset: fbeOffset)
        size.value = getFields(fbeValue: &fbeValue)
        _buffer.unshift(offset: fbeOffset)
        return fbeValue
    }

    // Get the struct fields values
    public func getFields(fbeValue: inout StructSimple) -> Int {
        var fbeCurrentOffset: Int = 0
        var fbeCurrentSize: Int = 0
        var fbeFieldSize = Size()

        id.fbeOffset = fbeCurrentOffset
        fbeValue.id = id.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f1.fbeOffset = fbeCurrentOffset
        fbeValue.f1 = f1.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f2.fbeOffset = fbeCurrentOffset
        fbeValue.f2 = f2.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f3.fbeOffset = fbeCurrentOffset
        fbeValue.f3 = f3.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f4.fbeOffset = fbeCurrentOffset
        fbeValue.f4 = f4.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f5.fbeOffset = fbeCurrentOffset
        fbeValue.f5 = f5.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f6.fbeOffset = fbeCurrentOffset
        fbeValue.f6 = f6.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f7.fbeOffset = fbeCurrentOffset
        fbeValue.f7 = f7.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f8.fbeOffset = fbeCurrentOffset
        fbeValue.f8 = f8.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f9.fbeOffset = fbeCurrentOffset
        fbeValue.f9 = f9.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f10.fbeOffset = fbeCurrentOffset
        fbeValue.f10 = f10.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f11.fbeOffset = fbeCurrentOffset
        fbeValue.f11 = f11.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f12.fbeOffset = fbeCurrentOffset
        fbeValue.f12 = f12.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f13.fbeOffset = fbeCurrentOffset
        fbeValue.f13 = f13.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f14.fbeOffset = fbeCurrentOffset
        fbeValue.f14 = f14.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f15.fbeOffset = fbeCurrentOffset
        fbeValue.f15 = f15.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f16.fbeOffset = fbeCurrentOffset
        fbeValue.f16 = f16.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f17.fbeOffset = fbeCurrentOffset
        fbeValue.f17 = f17.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f18.fbeOffset = fbeCurrentOffset
        fbeValue.f18 = f18.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f19.fbeOffset = fbeCurrentOffset
        fbeValue.f19 = f19.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f20.fbeOffset = fbeCurrentOffset
        fbeValue.f20 = f20.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f21.fbeOffset = fbeCurrentOffset
        fbeValue.f21 = f21.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f22.fbeOffset = fbeCurrentOffset
        fbeValue.f22 = f22.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f23.fbeOffset = fbeCurrentOffset
        fbeValue.f23 = f23.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f24.fbeOffset = fbeCurrentOffset
        fbeValue.f24 = f24.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f25.fbeOffset = fbeCurrentOffset
        fbeValue.f25 = f25.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f26.fbeOffset = fbeCurrentOffset
        fbeValue.f26 = f26.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f27.fbeOffset = fbeCurrentOffset
        fbeValue.f27 = f27.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f28.fbeOffset = fbeCurrentOffset
        fbeValue.f28 = f28.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f29.fbeOffset = fbeCurrentOffset
        fbeValue.f29 = f29.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f30.fbeOffset = fbeCurrentOffset
        fbeValue.f30 = f30.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f31.fbeOffset = fbeCurrentOffset
        fbeValue.f31 = f31.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f32.fbeOffset = fbeCurrentOffset
        fbeValue.f32 = f32.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f33.fbeOffset = fbeCurrentOffset
        fbeValue.f33 = f33.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f34.fbeOffset = fbeCurrentOffset
        fbeValue.f34 = f34.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f35.fbeOffset = fbeCurrentOffset
        fbeValue.f35 = f35.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f36.fbeOffset = fbeCurrentOffset
        fbeValue.f36 = f36.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f37.fbeOffset = fbeCurrentOffset
        fbeValue.f37 = f37.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f38.fbeOffset = fbeCurrentOffset
        fbeValue.f38 = f38.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f39.fbeOffset = fbeCurrentOffset
        fbeValue.f39 = f39.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f40.fbeOffset = fbeCurrentOffset
        fbeValue.f40 = f40.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f41.fbeOffset = fbeCurrentOffset
        fbeValue.f41 = f41.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f42.fbeOffset = fbeCurrentOffset
        fbeValue.f42 = f42.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f43.fbeOffset = fbeCurrentOffset
        fbeValue.f43 = f43.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f44.fbeOffset = fbeCurrentOffset
        fbeValue.f44 = f44.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }

    // Set the struct value
    public func set(value fbeValue: StructSimple) throws -> Int {
        _buffer.shift(offset: fbeOffset)
        let fbeSize = try setFields(fbeValue: fbeValue)
        _buffer.unshift(offset: fbeOffset)
        return fbeSize
    }

    // Set the struct fields values
    public func setFields(fbeValue: StructSimple) throws -> Int {
        var fbeCurrentOffset: Int = 0
        var fbeCurrentSize: Int = 0
        let fbeFieldSize = Size()

        id.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try id.set(value: fbeValue.id)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

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

        f5.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f5.set(value: fbeValue.f5)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f6.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f6.set(value: fbeValue.f6)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f7.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f7.set(value: fbeValue.f7)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f8.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f8.set(value: fbeValue.f8)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f9.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f9.set(value: fbeValue.f9)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f10.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f10.set(value: fbeValue.f10)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f11.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f11.set(value: fbeValue.f11)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f12.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f12.set(value: fbeValue.f12)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f13.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f13.set(value: fbeValue.f13)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f14.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f14.set(value: fbeValue.f14)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f15.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f15.set(value: fbeValue.f15)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f16.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f16.set(value: fbeValue.f16)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f17.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f17.set(value: fbeValue.f17)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f18.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f18.set(value: fbeValue.f18)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f19.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f19.set(value: fbeValue.f19)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f20.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f20.set(value: fbeValue.f20)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f21.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f21.set(value: fbeValue.f21)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f22.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f22.set(value: fbeValue.f22)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f23.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f23.set(value: fbeValue.f23)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f24.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f24.set(value: fbeValue.f24)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f25.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f25.set(value: fbeValue.f25)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f26.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f26.set(value: fbeValue.f26)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f27.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f27.set(value: fbeValue.f27)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f28.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f28.set(value: fbeValue.f28)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f29.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f29.set(value: fbeValue.f29)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f30.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f30.set(value: fbeValue.f30)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f31.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f31.set(value: fbeValue.f31)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f32.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f32.set(value: fbeValue.f32)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f33.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f33.set(value: fbeValue.f33)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f34.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f34.set(value: fbeValue.f34)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f35.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f35.set(value: fbeValue.f35)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f36.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f36.set(value: fbeValue.f36)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f37.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f37.set(value: fbeValue.f37)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f38.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f38.set(value: fbeValue.f38)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f39.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f39.set(value: fbeValue.f39)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f40.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f40.set(value: fbeValue.f40)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f41.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f41.set(value: fbeValue.f41)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f42.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f42.set(value: fbeValue.f42)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f43.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f43.set(value: fbeValue.f43)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f44.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f44.set(value: fbeValue.f44)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }
}
