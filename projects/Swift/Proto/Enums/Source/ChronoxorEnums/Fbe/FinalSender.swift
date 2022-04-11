//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

import ChronoxorFbe
import Foundation

// Fast Binary Encoding ChronoxorEnums final sender
open class FinalSender: ChronoxorFbe.SenderProtocol {
    // Sender models accessors

    public var buffer: Buffer = Buffer()
    public var final: Bool = false

    public init() {
        build(with: true)
    }

    public init(buffer: ChronoxorFbe.Buffer) {
        build(with: buffer, final: true)
    }

    public func send(obj: Any) throws -> Int {
        guard let listener = self as? ChronoxorFbe.SenderListener else { return 0 }
        return try send(obj: obj, listener: listener)
    }

    public func send(obj: Any, listener: ChronoxorFbe.SenderListener) throws -> Int {

        return 0
    }
}
