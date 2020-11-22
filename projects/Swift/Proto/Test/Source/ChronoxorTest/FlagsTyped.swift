// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.5.0.0

import Foundation

public struct FlagsTyped: Comparable, Hashable, Codable {
    typealias RawValue = UInt64
    public static let FLAG_VALUE_0 = FlagsTyped(value: .FLAG_VALUE_0)
    public static let FLAG_VALUE_1 = FlagsTyped(value: .FLAG_VALUE_1)
    public static let FLAG_VALUE_2 = FlagsTyped(value: .FLAG_VALUE_2)
    public static let FLAG_VALUE_3 = FlagsTyped(value: .FLAG_VALUE_3)
    public static let FLAG_VALUE_4 = FlagsTyped(value: .FLAG_VALUE_4)
    public static let FLAG_VALUE_5 = FlagsTyped(value: .FLAG_VALUE_5)
    public static let FLAG_VALUE_6 = FlagsTyped(value: .FLAG_VALUE_6)
    public static let FLAG_VALUE_7 = FlagsTyped(value: .FLAG_VALUE_7)
    public static let FLAG_VALUE_8 = FlagsTyped(value: .FLAG_VALUE_8)
    public static let FLAG_VALUE_9 = FlagsTyped(value: .FLAG_VALUE_9)

    public static func fromSet(set: FlagsTypedEnum) -> FlagsTyped {
        var result = NSNumber(value: 0).uint64Value
        if set.contains(FlagsTyped.FLAG_VALUE_0.value!) {
            result = NSNumber(value: result).uint64Value | NSNumber(value: FlagsTyped.FLAG_VALUE_0.raw).uint64Value
        }
        if set.contains(FlagsTyped.FLAG_VALUE_1.value!) {
            result = NSNumber(value: result).uint64Value | NSNumber(value: FlagsTyped.FLAG_VALUE_1.raw).uint64Value
        }
        if set.contains(FlagsTyped.FLAG_VALUE_2.value!) {
            result = NSNumber(value: result).uint64Value | NSNumber(value: FlagsTyped.FLAG_VALUE_2.raw).uint64Value
        }
        if set.contains(FlagsTyped.FLAG_VALUE_3.value!) {
            result = NSNumber(value: result).uint64Value | NSNumber(value: FlagsTyped.FLAG_VALUE_3.raw).uint64Value
        }
        if set.contains(FlagsTyped.FLAG_VALUE_4.value!) {
            result = NSNumber(value: result).uint64Value | NSNumber(value: FlagsTyped.FLAG_VALUE_4.raw).uint64Value
        }
        if set.contains(FlagsTyped.FLAG_VALUE_5.value!) {
            result = NSNumber(value: result).uint64Value | NSNumber(value: FlagsTyped.FLAG_VALUE_5.raw).uint64Value
        }
        if set.contains(FlagsTyped.FLAG_VALUE_6.value!) {
            result = NSNumber(value: result).uint64Value | NSNumber(value: FlagsTyped.FLAG_VALUE_6.raw).uint64Value
        }
        if set.contains(FlagsTyped.FLAG_VALUE_7.value!) {
            result = NSNumber(value: result).uint64Value | NSNumber(value: FlagsTyped.FLAG_VALUE_7.raw).uint64Value
        }
        if set.contains(FlagsTyped.FLAG_VALUE_8.value!) {
            result = NSNumber(value: result).uint64Value | NSNumber(value: FlagsTyped.FLAG_VALUE_8.raw).uint64Value
        }
        if set.contains(FlagsTyped.FLAG_VALUE_9.value!) {
            result = NSNumber(value: result).uint64Value | NSNumber(value: FlagsTyped.FLAG_VALUE_9.raw).uint64Value
        }
        return FlagsTyped(value: NSNumber(value: result).uint64Value)
    }

    public private(set) var value: FlagsTypedEnum?

    public private(set) var raw: UInt64 = 0

    public init() { setDefaults() }
    public init(value: UInt64) { setEnum(value: value) }
    public init(value: FlagsTypedEnum) { setEnum(value: value) }
    public init(value: FlagsTyped) { setEnum(value: value) }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        setEnum(value: try container.decode(RawValue.self))
    }

    public mutating func setDefaults() { setEnum(value: 0) }

    public mutating func setEnum(value: UInt64) { self.raw = value; self.value = FlagsTypedEnum.mapValue(value: value) }
    public mutating func setEnum(value: FlagsTypedEnum) { self.raw = value.rawValue; self.value = value }
    public mutating func setEnum(value: FlagsTyped) { self.raw = value.raw; self.value = value.value }

    public func hasFlags(flags: UInt64) -> Bool { return (NSNumber(value: raw).uint64Value & NSNumber(value: flags).uint64Value != 0) && ((NSNumber(value: raw).uint64Value & NSNumber(value: flags).uint64Value) == NSNumber(value: flags).uint64Value) }
    public func hasFlags(flags: FlagsTypedEnum) -> Bool { return hasFlags(flags: flags.rawValue) }
    public func hasFlags(flags: FlagsTyped) -> Bool { return hasFlags(flags: flags.raw) }

    public mutating func setFlags(flags: UInt64) -> FlagsTyped { setEnum(value: NSNumber(value: NSNumber(value: raw).uint64Value | NSNumber(value: flags).uint64Value).uint64Value); return self }
    public mutating func setFlags(flags: FlagsTypedEnum) -> FlagsTyped { _ = setFlags(flags: flags.rawValue); return self }
    public mutating func setFlags(flags: FlagsTyped) -> FlagsTyped { _ = setFlags(flags: flags.raw); return self }

    public mutating func removeFlags(flags: UInt64) -> FlagsTyped { setEnum(value: NSNumber(value: NSNumber(value: raw).uint64Value | NSNumber(value: flags).uint64Value.byteSwapped).uint64Value); return self }
    public mutating func removeFlags(flags: FlagsTypedEnum) -> FlagsTyped { _ = removeFlags(flags: flags.rawValue); return self }
    public mutating func removeFlags(flags: FlagsTyped) -> FlagsTyped { _ = removeFlags(flags: flags.raw); return self }

    public var allSet: FlagsTypedEnum { return .allSet }
    public var noneSet: FlagsTypedEnum { return .noneSet }
    public var currentSet: FlagsTypedEnum { return value!.currentSet }

    public static func < (lhs: FlagsTyped, rhs: FlagsTyped) -> Bool {
        return lhs.raw < rhs.raw
    }

    public static func == (lhs: FlagsTyped, rhs: FlagsTyped) -> Bool {
        return lhs.raw == rhs.raw
    }

    public func hash(into hasher: inout Hasher) {
        hasher.combine(raw)
    }

    public var description: String {
        var sb = String()
        var first = true
        if hasFlags(flags: FlagsTyped.FLAG_VALUE_0.raw) {
            sb.append(first ? "" : "|"); sb.append("FLAG_VALUE_0")
            first = false
        }
        if hasFlags(flags: FlagsTyped.FLAG_VALUE_1.raw) {
            sb.append(first ? "" : "|"); sb.append("FLAG_VALUE_1")
            first = false
        }
        if hasFlags(flags: FlagsTyped.FLAG_VALUE_2.raw) {
            sb.append(first ? "" : "|"); sb.append("FLAG_VALUE_2")
            first = false
        }
        if hasFlags(flags: FlagsTyped.FLAG_VALUE_3.raw) {
            sb.append(first ? "" : "|"); sb.append("FLAG_VALUE_3")
            first = false
        }
        if hasFlags(flags: FlagsTyped.FLAG_VALUE_4.raw) {
            sb.append(first ? "" : "|"); sb.append("FLAG_VALUE_4")
            first = false
        }
        if hasFlags(flags: FlagsTyped.FLAG_VALUE_5.raw) {
            sb.append(first ? "" : "|"); sb.append("FLAG_VALUE_5")
            first = false
        }
        if hasFlags(flags: FlagsTyped.FLAG_VALUE_6.raw) {
            sb.append(first ? "" : "|"); sb.append("FLAG_VALUE_6")
            first = false
        }
        if hasFlags(flags: FlagsTyped.FLAG_VALUE_7.raw) {
            sb.append(first ? "" : "|"); sb.append("FLAG_VALUE_7")
            first = false
        }
        if hasFlags(flags: FlagsTyped.FLAG_VALUE_8.raw) {
            sb.append(first ? "" : "|"); sb.append("FLAG_VALUE_8")
            first = false
        }
        if hasFlags(flags: FlagsTyped.FLAG_VALUE_9.raw) {
            sb.append(first ? "" : "|"); sb.append("FLAG_VALUE_9")
            first = false
        }
        return sb
    }
    public func encode(to encoder: Encoder) throws {
        var container = encoder.singleValueContainer()
        try container.encode(raw)
    }

    public func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    public static func fromJson(_ json: String) throws -> FlagsTyped {
        return try JSONDecoder().decode(FlagsTyped.self, from: json.data(using: .utf8)!)
    }
}
