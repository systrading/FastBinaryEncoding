//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.0.0
//------------------------------------------------------------------------------

import Foundation

public struct FlagsSimpleEnum: OptionSet {
    public static let FLAG_VALUE_0 = FlagsSimpleEnum(rawValue: 0x0)
    public static let FLAG_VALUE_1 = FlagsSimpleEnum(rawValue: 0x1)
    public static let FLAG_VALUE_2 = FlagsSimpleEnum(rawValue: 0x2)
    public static let FLAG_VALUE_3 = FlagsSimpleEnum(rawValue: 0x4)
    public static let FLAG_VALUE_4 = FlagsSimpleEnum(rawValue: Self.FLAG_VALUE_3.rawValue)
    public static let FLAG_VALUE_5 = FlagsSimpleEnum(rawValue: Self.FLAG_VALUE_1.rawValue | Self.FLAG_VALUE_3.rawValue)

    public var rawValue: Int32

    public init(rawValue: Int32) { self.rawValue = rawValue }
    public init(value: Int8) { self.rawValue = NSNumber(value: value).int32Value }
    public init(value: Int16) { self.rawValue = NSNumber(value: value).int32Value }
    public init(value: Int32) { self.rawValue = NSNumber(value: value).int32Value }
    public init(value: Int64) { self.rawValue = NSNumber(value: value).int32Value }
    public init(value: FlagsSimpleEnum) { self.rawValue = value.rawValue }

    public func hasFlags(flags: Int32) -> Bool { return ((NSNumber(value: rawValue).intValue & NSNumber(value: flags).intValue) != 0) && (NSNumber(value: rawValue).intValue & NSNumber(value: flags).intValue == NSNumber(value: flags).intValue) }
    public func hasFlags(flags: FlagsSimpleEnum) -> Bool { return hasFlags(flags: flags.rawValue) }

    public static let allSet: FlagsSimpleEnum = [
        .FLAG_VALUE_0,
        .FLAG_VALUE_1,
        .FLAG_VALUE_2,
        .FLAG_VALUE_3,
        .FLAG_VALUE_4,
        .FLAG_VALUE_5,
    ]
    public static let noneSet: FlagsSimpleEnum = []
    public var currentSet: FlagsSimpleEnum {
        var result = FlagsSimpleEnum.noneSet
        if (NSNumber(value: rawValue).intValue & NSNumber(value: FlagsSimpleEnum.FLAG_VALUE_0.rawValue).intValue) != 0 {
            result = result.union(.FLAG_VALUE_0)
        }
        if (NSNumber(value: rawValue).intValue & NSNumber(value: FlagsSimpleEnum.FLAG_VALUE_1.rawValue).intValue) != 0 {
            result = result.union(.FLAG_VALUE_1)
        }
        if (NSNumber(value: rawValue).intValue & NSNumber(value: FlagsSimpleEnum.FLAG_VALUE_2.rawValue).intValue) != 0 {
            result = result.union(.FLAG_VALUE_2)
        }
        if (NSNumber(value: rawValue).intValue & NSNumber(value: FlagsSimpleEnum.FLAG_VALUE_3.rawValue).intValue) != 0 {
            result = result.union(.FLAG_VALUE_3)
        }
        if (NSNumber(value: rawValue).intValue & NSNumber(value: FlagsSimpleEnum.FLAG_VALUE_4.rawValue).intValue) != 0 {
            result = result.union(.FLAG_VALUE_4)
        }
        if (NSNumber(value: rawValue).intValue & NSNumber(value: FlagsSimpleEnum.FLAG_VALUE_5.rawValue).intValue) != 0 {
            result = result.union(.FLAG_VALUE_5)
        }
        return result
    }

    public var description: String {
        var sb = String()
        var first = true
        if hasFlags(flags: .FLAG_VALUE_0) {
            sb.append(first ? "" : "|"); sb.append("FLAG_VALUE_0")
            first = false
        }
        if hasFlags(flags: .FLAG_VALUE_1) {
            sb.append(first ? "" : "|"); sb.append("FLAG_VALUE_1")
            first = false
        }
        if hasFlags(flags: .FLAG_VALUE_2) {
            sb.append(first ? "" : "|"); sb.append("FLAG_VALUE_2")
            first = false
        }
        if hasFlags(flags: .FLAG_VALUE_3) {
            sb.append(first ? "" : "|"); sb.append("FLAG_VALUE_3")
            first = false
        }
        if hasFlags(flags: .FLAG_VALUE_4) {
            sb.append(first ? "" : "|"); sb.append("FLAG_VALUE_4")
            first = false
        }
        if hasFlags(flags: .FLAG_VALUE_5) {
            sb.append(first ? "" : "|"); sb.append("FLAG_VALUE_5")
            first = false
        }
        return sb
    }

    static let rawValuesMap: [RawValue: FlagsSimpleEnum] = {
        var value = [RawValue: FlagsSimpleEnum]()
        value[FlagsSimpleEnum.FLAG_VALUE_0.rawValue] = .FLAG_VALUE_0
        value[FlagsSimpleEnum.FLAG_VALUE_1.rawValue] = .FLAG_VALUE_1
        value[FlagsSimpleEnum.FLAG_VALUE_2.rawValue] = .FLAG_VALUE_2
        value[FlagsSimpleEnum.FLAG_VALUE_3.rawValue] = .FLAG_VALUE_3
        value[FlagsSimpleEnum.FLAG_VALUE_4.rawValue] = .FLAG_VALUE_4
        value[FlagsSimpleEnum.FLAG_VALUE_5.rawValue] = .FLAG_VALUE_5
        return value
    }()

    public static func mapValue(value: RawValue) -> FlagsSimpleEnum? {
        return rawValuesMap[value]
    }
}
