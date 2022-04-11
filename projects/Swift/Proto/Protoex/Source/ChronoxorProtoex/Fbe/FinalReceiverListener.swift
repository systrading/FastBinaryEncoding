//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

import ChronoxorFbe
import ChronoxorProto

// Fast Binary Encoding Protoex final receiver listener
public protocol FinalReceiverListener: ChronoxorProto.FinalReceiverListener {
    func onReceive(value: ChronoxorProtoex.OrderMessage)
    func onReceive(value: ChronoxorProtoex.BalanceMessage)
    func onReceive(value: ChronoxorProtoex.AccountMessage)
}

public extension FinalReceiverListener {
    func onReceive(value: ChronoxorProtoex.OrderMessage) {}
    func onReceive(value: ChronoxorProtoex.BalanceMessage) {}
    func onReceive(value: ChronoxorProtoex.AccountMessage) {}
}
