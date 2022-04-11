//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

import ChronoxorFbe

// Fast Binary Encoding State field model
public class FieldModelState: FieldModel {

    public var _buffer: Buffer = Buffer()
    public var _offset: Int = 0

    public var fbeSize: Int = 1

    public required init() {
        _buffer = Buffer()
        _offset = 0
    }

    // Get the value
    public func get(defaults: State = State()) -> State {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return defaults
        }

        return State(value: readByte(offset: fbeOffset))
    }

    // Set the value
    public func set(value: State) throws {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            assertionFailure("Model is broken!")
            return
        }

        write(offset: fbeOffset, value: value.raw)
    }
}
