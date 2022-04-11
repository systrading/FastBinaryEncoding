//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

import Foundation

public struct OrderSide: Comparable, Hashable, Codable {
    typealias RawValue = UInt8
    public static let buy = OrderSide(value: OrderSideEnum.buy)
    public static let sell = OrderSide(value: OrderSideEnum.sell)

    var value: OrderSideEnum?

    public var raw: UInt8 { return value!.rawValue }

    public init() { setDefault() }
    public init(value: UInt8) { setEnum(value: value) }
    public init(value: OrderSideEnum) { setEnum(value: value) }
    public init(value: OrderSide) { setEnum(value: value) }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        setEnum(value: try container.decode(RawValue.self))
    }
    public mutating func setDefault() { setEnum(value: NSNumber(value: 0).uint8Value) }

    public mutating func setEnum(value: UInt8) { self.value = OrderSideEnum.mapValue(value: value) }
    public mutating func setEnum(value: OrderSideEnum) { self.value = value }
    public mutating func setEnum(value: OrderSide) { self.value = value.value }

    public static func < (lhs: OrderSide, rhs: OrderSide) -> Bool {
        guard let lhsValue = lhs.value, let rhsValue = rhs.value else {
            return false
            }
        return lhsValue.rawValue < rhsValue.rawValue
    }

    public static func == (lhs: OrderSide, rhs: OrderSide) -> Bool {
        guard let lhsValue = lhs.value, let rhsValue = rhs.value else {
            return false
            }
        return lhsValue.rawValue == rhsValue.rawValue
    }

    public func hash(into hasher: inout Hasher) {
        hasher.combine(value?.rawValue ?? 0)
    }

    public var description: String {
        return value?.description ?? "<unknown>"
    }
    public func encode(to encoder: Encoder) throws {
        var container = encoder.singleValueContainer()
        try container.encode(raw)
    }

    public func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    public static func fromJson(_ json: String) throws -> OrderSide {
        return try JSONDecoder().decode(OrderSide.self, from: json.data(using: .utf8)!)
    }
}
