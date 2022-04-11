//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

import Foundation

public enum EnumUInt32Enum {
    typealias RawValue = UInt32
    case ENUM_VALUE_0
    case ENUM_VALUE_1
    case ENUM_VALUE_2
    case ENUM_VALUE_3
    case ENUM_VALUE_4
    case ENUM_VALUE_5

    var rawValue: RawValue {
        switch self {
        case .ENUM_VALUE_0: return 0 + 0
        case .ENUM_VALUE_1: return 0 + 0
        case .ENUM_VALUE_2: return 0 + 1
        case .ENUM_VALUE_3: return 0xFFFFFFFE + 0
        case .ENUM_VALUE_4: return 0xFFFFFFFE + 1
        case .ENUM_VALUE_5: return Self.ENUM_VALUE_3.rawValue
        }
    }

    init(value: UInt8) { self = EnumUInt32Enum(rawValue: NSNumber(value: value).uint32Value) }
    init(value: UInt16) { self = EnumUInt32Enum(rawValue: NSNumber(value: value).uint32Value) }
    init(value: UInt32) { self = EnumUInt32Enum(rawValue: NSNumber(value: value).uint32Value) }
    init(value: UInt64) { self = EnumUInt32Enum(rawValue: NSNumber(value: value).uint32Value) }
    init(value: EnumUInt32Enum) { self = EnumUInt32Enum(rawValue: value.rawValue) }
    init(rawValue: UInt32) { self = Self.mapValue(value: rawValue)! }

    var description: String {
        switch self {
        case .ENUM_VALUE_0: return "ENUM_VALUE_0"
        case .ENUM_VALUE_1: return "ENUM_VALUE_1"
        case .ENUM_VALUE_2: return "ENUM_VALUE_2"
        case .ENUM_VALUE_3: return "ENUM_VALUE_3"
        case .ENUM_VALUE_4: return "ENUM_VALUE_4"
        case .ENUM_VALUE_5: return "ENUM_VALUE_5"
        }
    }

    static let rawValuesMap: [RawValue: EnumUInt32Enum] = {
        var value = [RawValue: EnumUInt32Enum]()
        value[EnumUInt32Enum.ENUM_VALUE_0.rawValue] = .ENUM_VALUE_0
        value[EnumUInt32Enum.ENUM_VALUE_1.rawValue] = .ENUM_VALUE_1
        value[EnumUInt32Enum.ENUM_VALUE_2.rawValue] = .ENUM_VALUE_2
        value[EnumUInt32Enum.ENUM_VALUE_3.rawValue] = .ENUM_VALUE_3
        value[EnumUInt32Enum.ENUM_VALUE_4.rawValue] = .ENUM_VALUE_4
        value[EnumUInt32Enum.ENUM_VALUE_5.rawValue] = .ENUM_VALUE_5
        return value
    }()

    static func mapValue(value: UInt32) -> EnumUInt32Enum? {
        return rawValuesMap[value]
    }
}
