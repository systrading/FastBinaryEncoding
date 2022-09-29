//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.14.0.0
//------------------------------------------------------------------------------

import Foundation
import ChronoxorFbe
import ChronoxorProto

// Fast Binary Encoding Account field model
public class FieldModelAccount: FieldModel {

    public var _buffer: Buffer
    public var _offset: Int

    let id: ChronoxorFbe.FieldModelInt32
    let name: ChronoxorFbe.FieldModelString
    let state: FieldModelStateEx
    let wallet: FieldModelBalance
    let asset: FieldModelOptionalBalance
    let orders: FieldModelVectorOrder

    // Field size
    public let fbeSize: Int = 4

    // Field body size
    public let fbeBody: Int

    // Set the struct value (end phase)
    public required init() {
        let buffer = Buffer()
        let offset = 0

        _buffer = buffer
        _offset = offset

        id = FieldModelInt32(buffer: buffer, offset: 4 + 4)
        name = FieldModelString(buffer: buffer, offset: id.fbeOffset + id.fbeSize)
        state = FieldModelStateEx(buffer: buffer, offset: name.fbeOffset + name.fbeSize)
        wallet = FieldModelBalance(buffer: buffer, offset: state.fbeOffset + state.fbeSize)
        asset = FieldModelOptionalBalance(buffer: buffer, offset: wallet.fbeOffset + wallet.fbeSize)
        orders = FieldModelVectorOrder(buffer: buffer, offset: asset.fbeOffset + asset.fbeSize)

        var fbeBody = (4 + 4)
            fbeBody += id.fbeSize
            fbeBody += name.fbeSize
            fbeBody += state.fbeSize
            fbeBody += wallet.fbeSize
            fbeBody += asset.fbeSize
            fbeBody += orders.fbeSize
        self.fbeBody = fbeBody
    }

    // 
    public required init(buffer: Buffer = Buffer(), offset: Int = 0) {
        _buffer = buffer
        _offset = offset

        id = FieldModelInt32(buffer: buffer, offset: 4 + 4)
        name = FieldModelString(buffer: buffer, offset: id.fbeOffset + id.fbeSize)
        state = FieldModelStateEx(buffer: buffer, offset: name.fbeOffset + name.fbeSize)
        wallet = FieldModelBalance(buffer: buffer, offset: state.fbeOffset + state.fbeSize)
        asset = FieldModelOptionalBalance(buffer: buffer, offset: wallet.fbeOffset + wallet.fbeSize)
        orders = FieldModelVectorOrder(buffer: buffer, offset: asset.fbeOffset + asset.fbeSize)

        var fbeBody = (4 + 4)
            fbeBody += id.fbeSize
            fbeBody += name.fbeSize
            fbeBody += state.fbeSize
            fbeBody += wallet.fbeSize
            fbeBody += asset.fbeSize
            fbeBody += orders.fbeSize
        self.fbeBody = fbeBody
    }

    // Field extra size
    public var fbeExtra: Int {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return 0
        }

        let fbeStructOffset = Int(readUInt32(offset: fbeOffset))
        if (fbeStructOffset == 0) || ((_buffer.offset + fbeStructOffset + 4) > _buffer.size) {
            return 0
        }

        _buffer.shift(offset: fbeStructOffset)

        var fbeResult = fbeBody
            fbeResult += id.fbeExtra
            fbeResult += name.fbeExtra
            fbeResult += state.fbeExtra
            fbeResult += wallet.fbeExtra
            fbeResult += asset.fbeExtra
            fbeResult += orders.fbeExtra

        _buffer.unshift(offset: fbeStructOffset)

        return fbeResult
    }

    // Field type
    public var fbeType: Int = fbeTypeConst
    public static let fbeTypeConst: Int = 3

    // Check if the struct value is valid
    func verify(fbeVerifyType: Bool = true) -> Bool {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            return true
        }

        let fbeStructOffset = Int(readUInt32(offset: fbeOffset))
        if (fbeStructOffset == 0) || ((_buffer.offset + fbeStructOffset + 4 + 4) > _buffer.size) {
            return false
        }

        let fbeStructSize = Int(readUInt32(offset: fbeStructOffset))
        if fbeStructSize < (4 + 4) {
            return false
        }

        let fbeStructType = Int(readUInt32(offset: fbeStructOffset + 4))
        if fbeVerifyType && (fbeStructType != fbeType) {
            return false
        }

        _buffer.shift(offset: fbeStructOffset)
        let fbeResult = verifyFields(fbeStructSize: fbeStructSize)
        _buffer.unshift(offset: fbeStructOffset)
        return fbeResult
    }

    // Check if the struct fields are valid
    public func verifyFields(fbeStructSize: Int) -> Bool {
        var fbeCurrentSize = 4 + 4

        if (fbeCurrentSize + id.fbeSize) > fbeStructSize {
            return true
        }
        if !id.verify() {
            return false
        }
        fbeCurrentSize += id.fbeSize

        if (fbeCurrentSize + name.fbeSize) > fbeStructSize {
            return true
        }
        if !name.verify() {
            return false
        }
        fbeCurrentSize += name.fbeSize

        if (fbeCurrentSize + state.fbeSize) > fbeStructSize {
            return true
        }
        if !state.verify() {
            return false
        }
        fbeCurrentSize += state.fbeSize

        if (fbeCurrentSize + wallet.fbeSize) > fbeStructSize {
            return true
        }
        if !wallet.verify() {
            return false
        }
        fbeCurrentSize += wallet.fbeSize

        if (fbeCurrentSize + asset.fbeSize) > fbeStructSize {
            return true
        }
        if !asset.verify() {
            return false
        }
        fbeCurrentSize += asset.fbeSize

        if (fbeCurrentSize + orders.fbeSize) > fbeStructSize {
            return true
        }
        if !orders.verify() {
            return false
        }
        fbeCurrentSize += orders.fbeSize

        return true
    }

    // Get the struct value (begin phase)
    func getBegin() -> Int {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return 0
        }

        let fbeStructOffset = Int(readUInt32(offset: fbeOffset))
        if (fbeStructOffset == 0) || ((_buffer.offset + fbeStructOffset + 4 + 4) > _buffer.size) {
            assertionFailure("Model is broken!")
            return 0
        }

        let fbeStructSize = Int(readUInt32(offset: fbeStructOffset))
        if fbeStructSize < 4 + 4 {
            assertionFailure("Model is broken!")
            return 0
        }

        _buffer.shift(offset: fbeStructOffset)
        return fbeStructOffset
    }

    // Get the struct value (end phase)
    func getEnd(fbeBegin: Int) {
        _buffer.unshift(offset: fbeBegin)
    }

    // Get the struct value
    public func get() -> Account {
        var fbeValue = Account()
        return get(fbeValue: &fbeValue)
    }

    public func get(fbeValue: inout Account) -> Account {
        let fbeBegin = getBegin()
        if fbeBegin == 0 {
            return fbeValue
        }

        let fbeStructSize = Int(readUInt32(offset: 0))
        getFields(fbeValue: &fbeValue, fbeStructSize: fbeStructSize)
        getEnd(fbeBegin: fbeBegin)
        return fbeValue
    }

    // Get the struct fields values
    public func getFields(fbeValue: inout Account, fbeStructSize: Int) {
        var fbeCurrentSize = 4 + 4

        if fbeCurrentSize + id.fbeSize <= fbeStructSize {
            fbeValue.id = id.get()
        } else {
            fbeValue.id = 0
        }
        fbeCurrentSize += id.fbeSize

        if fbeCurrentSize + name.fbeSize <= fbeStructSize {
            fbeValue.name = name.get()
        } else {
            fbeValue.name = ""
        }
        fbeCurrentSize += name.fbeSize

        if fbeCurrentSize + state.fbeSize <= fbeStructSize {
            fbeValue.state = state.get(defaults: StateEx.fromSet(set: [StateEx.initialized.value!, StateEx.bad.value!, StateEx.sad.value!]))
        } else {
            fbeValue.state = StateEx.fromSet(set: [StateEx.initialized.value!, StateEx.bad.value!, StateEx.sad.value!])
        }
        fbeCurrentSize += state.fbeSize

        if fbeCurrentSize + wallet.fbeSize <= fbeStructSize {
            fbeValue.wallet = wallet.get()
        } else {
            fbeValue.wallet = ChronoxorProtoex.Balance()
        }
        fbeCurrentSize += wallet.fbeSize

        if fbeCurrentSize + asset.fbeSize <= fbeStructSize {
            fbeValue.asset = asset.get()
        } else {
            fbeValue.asset = nil
        }
        fbeCurrentSize += asset.fbeSize

        if fbeCurrentSize + orders.fbeSize <= fbeStructSize {
            orders.get(values: &fbeValue.orders)
        } else {
            fbeValue.orders.removeAll()
        }
        fbeCurrentSize += orders.fbeSize
    }

    // Set the struct value (begin phase)
    func setBegin() throws -> Int {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            assertionFailure("Model is broken!")
            return 0
        }

        let fbeStructSize = fbeBody
        let fbeStructOffset = try _buffer.allocate(size: fbeStructSize) - _buffer.offset
        if (fbeStructOffset <= 0) || ((_buffer.offset + fbeStructOffset + fbeStructSize) > _buffer.size) {
            assertionFailure("Model is broken!")
            return 0
        }

        write(offset: fbeOffset, value: UInt32(fbeStructOffset))
        write(offset: fbeStructOffset, value: UInt32(fbeStructSize))
        write(offset: fbeStructOffset + 4, value: UInt32(fbeType))

        _buffer.shift(offset: fbeStructOffset)
        return fbeStructOffset
    }

    // Set the struct value (end phase)
    public func setEnd(fbeBegin: Int) {
        _buffer.unshift(offset: fbeBegin)
    }

    // Set the struct value
    public func set(value fbeValue: Account) throws {
        let fbeBegin = try setBegin()
        if fbeBegin == 0 {
            return
        }

        try setFields(fbeValue: fbeValue)
        setEnd(fbeBegin: fbeBegin)
    }

    // Set the struct fields values
    public func setFields(fbeValue: Account) throws {
        try id.set(value: fbeValue.id)
        try name.set(value: fbeValue.name)
        try state.set(value: fbeValue.state)
        try wallet.set(value: fbeValue.wallet)
        try asset.set(value: fbeValue.asset)
        try orders.set(value: fbeValue.orders)
    }
}
