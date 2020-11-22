// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.5.0.0

import Foundation

public struct StateEnum: OptionSet {
    public static let unknown = StateEnum(rawValue: 0x00)
    public static let invalid = StateEnum(rawValue: 0x01)
    public static let initialized = StateEnum(rawValue: 0x02)
    public static let calculated = StateEnum(rawValue: 0x04)
    public static let broken = StateEnum(rawValue: 0x08)
    public static let good = StateEnum(rawValue: Self.initialized.rawValue | Self.calculated.rawValue)
    public static let bad = StateEnum(rawValue: Self.unknown.rawValue | Self.invalid.rawValue | Self.broken.rawValue)

    public var rawValue: UInt8

    public init(rawValue: UInt8) { self.rawValue = rawValue }
    public init(value: UInt8) { self.rawValue = NSNumber(value: value).uint8Value }
    public init(value: UInt16) { self.rawValue = NSNumber(value: value).uint8Value }
    public init(value: UInt32) { self.rawValue = NSNumber(value: value).uint8Value }
    public init(value: UInt64) { self.rawValue = NSNumber(value: value).uint8Value }
    public init(value: StateEnum) { self.rawValue = value.rawValue }

    public func hasFlags(flags: UInt8) -> Bool { return ((NSNumber(value: rawValue).intValue & NSNumber(value: flags).intValue) != 0) && (NSNumber(value: rawValue).intValue & NSNumber(value: flags).intValue == NSNumber(value: flags).intValue) }
    public func hasFlags(flags: StateEnum) -> Bool { return hasFlags(flags: flags.rawValue) }

    public static let allSet: StateEnum = [
        .unknown,
        .invalid,
        .initialized,
        .calculated,
        .broken,
        .good,
        .bad,
    ]
    public static let noneSet: StateEnum = []
    public var currentSet: StateEnum {
        var result = StateEnum.noneSet
        if (NSNumber(value: rawValue).intValue & NSNumber(value: StateEnum.unknown.rawValue).intValue) != 0 {
            result = result.union(.unknown)
        }
        if (NSNumber(value: rawValue).intValue & NSNumber(value: StateEnum.invalid.rawValue).intValue) != 0 {
            result = result.union(.invalid)
        }
        if (NSNumber(value: rawValue).intValue & NSNumber(value: StateEnum.initialized.rawValue).intValue) != 0 {
            result = result.union(.initialized)
        }
        if (NSNumber(value: rawValue).intValue & NSNumber(value: StateEnum.calculated.rawValue).intValue) != 0 {
            result = result.union(.calculated)
        }
        if (NSNumber(value: rawValue).intValue & NSNumber(value: StateEnum.broken.rawValue).intValue) != 0 {
            result = result.union(.broken)
        }
        if (NSNumber(value: rawValue).intValue & NSNumber(value: StateEnum.good.rawValue).intValue) != 0 {
            result = result.union(.good)
        }
        if (NSNumber(value: rawValue).intValue & NSNumber(value: StateEnum.bad.rawValue).intValue) != 0 {
            result = result.union(.bad)
        }
        return result
    }

    public var description: String {
        var sb = String()
        var first = true
        if hasFlags(flags: .unknown) {
            sb.append(first ? "" : "|"); sb.append("unknown")
            first = false
        }
        if hasFlags(flags: .invalid) {
            sb.append(first ? "" : "|"); sb.append("invalid")
            first = false
        }
        if hasFlags(flags: .initialized) {
            sb.append(first ? "" : "|"); sb.append("initialized")
            first = false
        }
        if hasFlags(flags: .calculated) {
            sb.append(first ? "" : "|"); sb.append("calculated")
            first = false
        }
        if hasFlags(flags: .broken) {
            sb.append(first ? "" : "|"); sb.append("broken")
            first = false
        }
        if hasFlags(flags: .good) {
            sb.append(first ? "" : "|"); sb.append("good")
            first = false
        }
        if hasFlags(flags: .bad) {
            sb.append(first ? "" : "|"); sb.append("bad")
            first = false
        }
        return sb
    }

    static let rawValuesMap: [RawValue: StateEnum] = {
        var value = [RawValue: StateEnum]()
        value[StateEnum.unknown.rawValue] = .unknown
        value[StateEnum.invalid.rawValue] = .invalid
        value[StateEnum.initialized.rawValue] = .initialized
        value[StateEnum.calculated.rawValue] = .calculated
        value[StateEnum.broken.rawValue] = .broken
        value[StateEnum.good.rawValue] = .good
        value[StateEnum.bad.rawValue] = .bad
        return value
    }()

    public static func mapValue(value: RawValue) -> StateEnum? {
        return rawValuesMap[value]
    }
}
