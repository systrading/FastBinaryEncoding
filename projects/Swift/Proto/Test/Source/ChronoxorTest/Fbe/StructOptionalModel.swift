//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

import ChronoxorFbe

// Fast Binary Encoding StructOptional model
public class StructOptionalModel: Model {
    public let model: FieldModelStructOptional

    public override init(buffer: Buffer = Buffer()) {
        model = FieldModelStructOptional(buffer: buffer, offset: 4)
        super.init(buffer: buffer)
    }

    // Model size
    public func fbeSize() -> Int { model.fbeSize + model.fbeExtra }
    // Model type
    public var fbeType: Int = fbeTypeConst
    static let fbeTypeConst: Int = FieldModelStructOptional.fbeTypeConst

    // Check if the struct value is valid
    public func verify() -> Bool {
        if buffer.offset + model.fbeOffset - 4 > buffer.size {
            return false
        }

        let fbeFullSize = Int(readUInt32(offset: model.fbeOffset - 4))
        if fbeFullSize < model.fbeSize {
            return false
        }

        return model.verify()
    }

    // Create a new model (begin phase)
    public func createBegin() throws -> Int {
        return try buffer.allocate(size: 4 + model.fbeSize)
    }

    // Create a new model (end phase)
    public func createEnd(fbeBegin: Int) -> Int {
        let fbeEnd = buffer.size
        let fbeFullSize = fbeEnd - fbeBegin
        write(offset: model.fbeOffset - 4, value: UInt32(fbeFullSize))
        return fbeFullSize
    }

    // Serialize the struct value
    public func serialize(value: StructOptional) throws -> Int {
        let fbeBegin = try createBegin()
        try model.set(value: value)
        return createEnd(fbeBegin: fbeBegin)
    }

    // Deserialize the struct value
    public func deserialize() -> StructOptional { var value = StructOptional(); _ = deserialize(value: &value); return value }
    public func deserialize(value: inout StructOptional) -> Int {
        if buffer.offset + model.fbeOffset - 4 > buffer.size {
            value = StructOptional()
            return 0
        }

        let fbeFullSize = Int(readUInt32(offset: model.fbeOffset - 4))
        if fbeFullSize < model.fbeSize {
            assertionFailure("Model is broken!")
            value = StructOptional()
            return 0
        }

        value = model.get(fbeValue: &value)
        return fbeFullSize
    }

    // Move to the next struct value
    public func next(prev: Int) {
        model.fbeShift(size: prev)
    }
}
