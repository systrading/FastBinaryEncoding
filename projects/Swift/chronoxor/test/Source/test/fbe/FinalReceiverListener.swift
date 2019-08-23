// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.3.0.0


import fbe

import proto

// Fast Binary Encoding test final receiver listener
public protocol FinalReceiverListener : proto.FinalReceiverListener
 {
    func onReceive(value: test.StructSimple)
    func onReceive(value: test.StructOptional)
    func onReceive(value: test.StructNested)
    func onReceive(value: test.StructBytes)
    func onReceive(value: test.StructArray)
    func onReceive(value: test.StructVector)
    func onReceive(value: test.StructList)
    func onReceive(value: test.StructSet)
    func onReceive(value: test.StructMap)
    func onReceive(value: test.StructHash)
    func onReceive(value: test.StructHashEx)
    func onReceive(value: test.StructEmpty)
}
public extension FinalReceiverListener {
    func onReceive(value: test.StructSimple) { }
    func onReceive(value: test.StructOptional) { }
    func onReceive(value: test.StructNested) { }
    func onReceive(value: test.StructBytes) { }
    func onReceive(value: test.StructArray) { }
    func onReceive(value: test.StructVector) { }
    func onReceive(value: test.StructList) { }
    func onReceive(value: test.StructSet) { }
    func onReceive(value: test.StructMap) { }
    func onReceive(value: test.StructHash) { }
    func onReceive(value: test.StructHashEx) { }
    func onReceive(value: test.StructEmpty) { }
}
