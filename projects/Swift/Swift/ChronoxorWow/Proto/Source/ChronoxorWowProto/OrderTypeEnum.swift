// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.3.0.0

import Foundation

public enum OrderTypeEnum {
    typealias RawValue = UInt8
    case market
    case limit
    case stop

    var rawValue: RawValue {
        switch self {
        case .market: return 0 + 0
        case .limit: return 0 + 1
        case .stop: return 0 + 2
        }
    }

    init(value: UInt8) { self = OrderTypeEnum(rawValue: NSNumber(value: value).uint8Value) }
    init(value: UInt16) { self = OrderTypeEnum(rawValue: NSNumber(value: value).uint8Value) }
    init(value: UInt32) { self = OrderTypeEnum(rawValue: NSNumber(value: value).uint8Value) }
    init(value: UInt64) { self = OrderTypeEnum(rawValue: NSNumber(value: value).uint8Value) }
    init(value: OrderTypeEnum) { self = OrderTypeEnum(rawValue: value.rawValue) }
    init(rawValue: UInt8) { self = Self.mapValue(value: rawValue)! }

    var description: String {
        switch self {
        case .market: return "market"
        case .limit: return "limit"
        case .stop: return "stop"
        }
    }

    static func values() -> [OrderTypeEnum] {
        return [
            OrderTypeEnum.market,
            OrderTypeEnum.limit,
            OrderTypeEnum.stop,
        ]
    }

    static func mapValue(value: UInt8) -> OrderTypeEnum? {
        var mapping = Dictionary<UInt8, OrderTypeEnum>()
        for value in values() {
            mapping[value.rawValue] = value
        }
        return mapping[value]
    }
}
