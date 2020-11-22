// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.5.0.0

import Foundation

public struct FlagsEmpty: Comparable, Hashable, Codable {
    typealias RawValue = Int32
    public static func fromSet(set: FlagsEmptyEnum) -> FlagsEmpty {
        var result = NSNumber(value: 0).intValue
        return FlagsEmpty(value: NSNumber(value: result).int32Value)
    }

    public private(set) var value: FlagsEmptyEnum?

    public private(set) var raw: Int32 = 0

    public init() { setDefaults() }
    public init(value: Int32) { setEnum(value: value) }
    public init(value: FlagsEmptyEnum) { setEnum(value: value) }
    public init(value: FlagsEmpty) { setEnum(value: value) }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        setEnum(value: try container.decode(RawValue.self))
    }

    public mutating func setDefaults() { setEnum(value: 0) }

    public mutating func setEnum(value: Int32) { self.raw = value; self.value = FlagsEmptyEnum.mapValue(value: value) }
    public mutating func setEnum(value: FlagsEmptyEnum) { self.raw = value.rawValue; self.value = value }
    public mutating func setEnum(value: FlagsEmpty) { self.raw = value.raw; self.value = value.value }

    public func hasFlags(flags: Int32) -> Bool { return (NSNumber(value: raw).intValue & NSNumber(value: flags).intValue != 0) && ((NSNumber(value: raw).intValue & NSNumber(value: flags).intValue) == NSNumber(value: flags).intValue) }
    public func hasFlags(flags: FlagsEmptyEnum) -> Bool { return hasFlags(flags: flags.rawValue) }
    public func hasFlags(flags: FlagsEmpty) -> Bool { return hasFlags(flags: flags.raw) }

    public mutating func setFlags(flags: Int32) -> FlagsEmpty { setEnum(value: NSNumber(value: NSNumber(value: raw).intValue | NSNumber(value: flags).intValue).int32Value); return self }
    public mutating func setFlags(flags: FlagsEmptyEnum) -> FlagsEmpty { _ = setFlags(flags: flags.rawValue); return self }
    public mutating func setFlags(flags: FlagsEmpty) -> FlagsEmpty { _ = setFlags(flags: flags.raw); return self }

    public mutating func removeFlags(flags: Int32) -> FlagsEmpty { setEnum(value: NSNumber(value: NSNumber(value: raw).intValue | NSNumber(value: flags).intValue.byteSwapped).int32Value); return self }
    public mutating func removeFlags(flags: FlagsEmptyEnum) -> FlagsEmpty { _ = removeFlags(flags: flags.rawValue); return self }
    public mutating func removeFlags(flags: FlagsEmpty) -> FlagsEmpty { _ = removeFlags(flags: flags.raw); return self }

    public var allSet: FlagsEmptyEnum { return .allSet }
    public var noneSet: FlagsEmptyEnum { return .noneSet }
    public var currentSet: FlagsEmptyEnum { return value!.currentSet }

    public static func < (lhs: FlagsEmpty, rhs: FlagsEmpty) -> Bool {
        return lhs.raw < rhs.raw
    }

    public static func == (lhs: FlagsEmpty, rhs: FlagsEmpty) -> Bool {
        return lhs.raw == rhs.raw
    }

    public func hash(into hasher: inout Hasher) {
        hasher.combine(raw)
    }

    public var description: String {
        var sb = String()
        return sb
    }
    public func encode(to encoder: Encoder) throws {
        var container = encoder.singleValueContainer()
        try container.encode(raw)
    }

    public func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    public static func fromJson(_ json: String) throws -> FlagsEmpty {
        return try JSONDecoder().decode(FlagsEmpty.self, from: json.data(using: .utf8)!)
    }
}
