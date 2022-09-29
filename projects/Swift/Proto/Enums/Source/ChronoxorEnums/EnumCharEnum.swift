//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.0.0
//------------------------------------------------------------------------------

import Foundation

public enum EnumCharEnum {
    typealias RawValue = UInt8
    case ENUM_VALUE_0
    case ENUM_VALUE_1
    case ENUM_VALUE_2
    case ENUM_VALUE_3
    case ENUM_VALUE_4
    case ENUM_VALUE_5

    var rawValue: RawValue {
        switch self {
        case .ENUM_VALUE_0: return "0".utf8.map { UInt8($0) }[0] + 0
        case .ENUM_VALUE_1: return "1".utf8.map { UInt8($0) }[0] + 0
        case .ENUM_VALUE_2: return "1".utf8.map { UInt8($0) }[0] + 1
        case .ENUM_VALUE_3: return "3".utf8.map { UInt8($0) }[0] + 0
        case .ENUM_VALUE_4: return "3".utf8.map { UInt8($0) }[0] + 1
        case .ENUM_VALUE_5: return Self.ENUM_VALUE_3.rawValue
        }
    }

    init(value: Character) { self = EnumCharEnum(rawValue: NSNumber(value: Int(String(value))!).uint8Value ) }
    init(value: Int8) { self = EnumCharEnum(rawValue: NSNumber(value: value).uint8Value) }
    init(value: Int16) { self = EnumCharEnum(rawValue: NSNumber(value: value).uint8Value) }
    init(value: Int32) { self = EnumCharEnum(rawValue: NSNumber(value: value).uint8Value) }
    init(value: Int64) { self = EnumCharEnum(rawValue: NSNumber(value: value).uint8Value) }
    init(value: EnumCharEnum) { self = EnumCharEnum(rawValue: value.rawValue) }
    init(rawValue: UInt8) { self = Self.mapValue(value: rawValue)! }

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

    static let rawValuesMap: [RawValue: EnumCharEnum] = {
        var value = [RawValue: EnumCharEnum]()
        value[EnumCharEnum.ENUM_VALUE_0.rawValue] = .ENUM_VALUE_0
        value[EnumCharEnum.ENUM_VALUE_1.rawValue] = .ENUM_VALUE_1
        value[EnumCharEnum.ENUM_VALUE_2.rawValue] = .ENUM_VALUE_2
        value[EnumCharEnum.ENUM_VALUE_3.rawValue] = .ENUM_VALUE_3
        value[EnumCharEnum.ENUM_VALUE_4.rawValue] = .ENUM_VALUE_4
        value[EnumCharEnum.ENUM_VALUE_5.rawValue] = .ENUM_VALUE_5
        return value
    }()

    static func mapValue(value: UInt8) -> EnumCharEnum? {
        return rawValuesMap[value]
    }
}
