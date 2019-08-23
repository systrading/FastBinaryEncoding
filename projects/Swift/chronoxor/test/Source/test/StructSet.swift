// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.3.0.0


import Foundation

import fbe

import proto

open class StructSet: Comparable, Hashable, Codable {
    public var f1: Array<UInt8> = Array()
    public var f2: Array<EnumSimple> = Array()
    public var f3: Array<FlagsSimple> = Array()
    public var f4: Array<StructSimple> = Array()

    public init() { }
    public init(f1: Array<UInt8>, f2: Array<EnumSimple>, f3: Array<FlagsSimple>, f4: Array<StructSimple>) {

        self.f1 = f1
        self.f2 = f2
        self.f3 = f3
        self.f4 = f4
    }

    public init(other: StructSet) {
        self.f1 = other.f1
        self.f2 = other.f2
        self.f3 = other.f3
        self.f4 = other.f4
    }

    public required init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        f1 = try container.decode(Array<UInt8>.self, forKey: .f1)
        f2 = try container.decode(Array<test.EnumSimple>.self, forKey: .f2)
        f3 = try container.decode(Array<test.FlagsSimple>.self, forKey: .f3)
        f4 = try container.decode(Array<test.StructSimple>.self, forKey: .f4)
    }

    open func clone() throws -> StructSet {
        // Serialize the struct to the FBE stream
        let writer = StructSetModel()
        try _ = writer.serialize(value: self)

        // Deserialize the struct from the FBE stream
        let reader = StructSetModel()
        reader.attach(buffer: writer.buffer)
        return reader.deserialize()
    }

    public static func < (lhs: StructSet, rhs: StructSet) -> Bool {

        return true
    }

    public static func == (lhs: StructSet, rhs: StructSet) -> Bool {

        return true
    }

    open func hash(into hasher: inout Hasher) {
    }

    open var description: String {
        var sb = String()
        sb.append("StructSet(")
        if (true)
        {
            var first = true
            sb.append("f1=["); sb.append("\(f1.count)"); sb.append("]{")
            for item in f1 {
                sb.append(first ? "" : ","); sb.append(item.description)
                first = false
            }
            sb.append("}")
        }
        if (true)
        {
            var first = true
            sb.append(",f2=["); sb.append("\(f2.count)"); sb.append("]{")
            for item in f2 {
                sb.append(first ? "" : ","); sb.append(item.description)
                first = false
            }
            sb.append("}")
        }
        if (true)
        {
            var first = true
            sb.append(",f3=["); sb.append("\(f3.count)"); sb.append("]{")
            for item in f3 {
                sb.append(first ? "" : ","); sb.append(item.description)
                first = false
            }
            sb.append("}")
        }
        if (true)
        {
            var first = true
            sb.append(",f4=["); sb.append("\(f4.count)"); sb.append("]{")
            for item in f4 {
                sb.append(first ? "" : ","); sb.append(item.description)
                first = false
            }
            sb.append("}")
        }
        sb.append(")")
        return sb
    }
    private enum CodingKeys: String, CodingKey {
        case f1
        case f2
        case f3
        case f4
    }

    open func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(f1, forKey: .f1)
        try container.encode(f2, forKey: .f2)
        try container.encode(f3, forKey: .f3)
        try container.encode(f4, forKey: .f4)
    }

    open func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    open class func fromJson(_ json: String) -> StructSet {
        return try! JSONDecoder().decode(StructSet.self, from: json.data(using: .utf8)!)
    }
}
