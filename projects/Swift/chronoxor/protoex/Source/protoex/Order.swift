// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.3.0.0


import Foundation

import fbe

import proto

open class Order: Comparable, Hashable, Codable {
    public var id: Int32 = 0
    public var symbol: String = ""
    public var side: OrderSide = protoex.OrderSide()
    public var type: OrderType = protoex.OrderType()
    public var price: Double = 0.0
    public var volume: Double = 0.0
    public var tp: Double = 10.0
    public var sl: Double = -10.0

    public init() { }
    public init(id: Int32, symbol: String, side: OrderSide, type: OrderType, price: Double, volume: Double, tp: Double, sl: Double) {

        self.id = id
        self.symbol = symbol
        self.side = side
        self.type = type
        self.price = price
        self.volume = volume
        self.tp = tp
        self.sl = sl
    }

    public init(other: Order) {
        self.id = other.id
        self.symbol = other.symbol
        self.side = other.side
        self.type = other.type
        self.price = other.price
        self.volume = other.volume
        self.tp = other.tp
        self.sl = other.sl
    }

    public required init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        id = try container.decode(Int32.self, forKey: .id)
        symbol = try container.decode(String.self, forKey: .symbol)
        side = try container.decode(protoex.OrderSide.self, forKey: .side)
        type = try container.decode(protoex.OrderType.self, forKey: .type)
        price = try container.decode(Double.self, forKey: .price)
        volume = try container.decode(Double.self, forKey: .volume)
        tp = try container.decode(Double.self, forKey: .tp)
        sl = try container.decode(Double.self, forKey: .sl)
    }

    open func clone() throws -> Order {
        // Serialize the struct to the FBE stream
        let writer = OrderModel()
        try _ = writer.serialize(value: self)

        // Deserialize the struct from the FBE stream
        let reader = OrderModel()
        reader.attach(buffer: writer.buffer)
        return reader.deserialize()
    }

    public static func < (lhs: Order, rhs: Order) -> Bool {
        if !(lhs.id < rhs.id) { return false }

        return true
    }

    public static func == (lhs: Order, rhs: Order) -> Bool {
        if !(lhs.id == rhs.id) { return false }

        return true
    }

    open func hash(into hasher: inout Hasher) {
        hasher.combine(id)
    }

    open var description: String {
        var sb = String()
        sb.append("Order(")
        sb.append("id="); sb.append(id.description)
        sb.append(",symbol="); sb.append("\""); sb.append(symbol); sb.append("\"")
        sb.append(",side="); sb.append(side.description)
        sb.append(",type="); sb.append(type.description)
        sb.append(",price="); sb.append(price.description)
        sb.append(",volume="); sb.append(volume.description)
        sb.append(",tp="); sb.append(tp.description)
        sb.append(",sl="); sb.append(sl.description)
        sb.append(")")
        return sb
    }
    private enum CodingKeys: String, CodingKey {
        case id
        case symbol
        case side
        case type
        case price
        case volume
        case tp
        case sl
    }

    open func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(id, forKey: .id)
        try container.encode(symbol, forKey: .symbol)
        try container.encode(side, forKey: .side)
        try container.encode(type, forKey: .type)
        try container.encode(price, forKey: .price)
        try container.encode(volume, forKey: .volume)
        try container.encode(tp, forKey: .tp)
        try container.encode(sl, forKey: .sl)
    }

    open func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    open class func fromJson(_ json: String) -> Order {
        return try! JSONDecoder().decode(Order.self, from: json.data(using: .utf8)!)
    }
}
