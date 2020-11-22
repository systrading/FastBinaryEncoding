// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.5.0.0

package proto

import "errors"
import "../fbe"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version

// OrderType enum key
type OrderTypeKey byte

// Convert OrderType enum key to string
func (k OrderTypeKey) String() string {
    return OrderType(k).String()
}

// OrderType enum
type OrderType byte

// OrderType enum values
//noinspection GoSnakeCaseUsage
const (
    OrderType_market = OrderType(0 + 0)
    OrderType_limit = OrderType(0 + 1)
    OrderType_stop = OrderType(0 + 2)
)

// Create a new OrderType enum
func NewOrderType() *OrderType {
    return new(OrderType)
}

// Create a new OrderType enum from the given value
func NewOrderTypeFromValue(value byte) *OrderType {
    result := OrderType(value)
    return &result
}

// Get the enum key
func (e OrderType) Key() OrderTypeKey {
    return OrderTypeKey(e)
}

// Convert enum to optional
func (e *OrderType) Optional() *OrderType {
    return e
}

// Convert enum to string
func (e OrderType) String() string {
    if e == OrderType_market {
        return "market"
    }
    if e == OrderType_limit {
        return "limit"
    }
    if e == OrderType_stop {
        return "stop"
    }
    return "<unknown>"
}

// Convert enum to JSON
func (e OrderType) MarshalJSON() ([]byte, error) {
    value := byte(e)
    return fbe.Json.Marshal(&value)
}

// Convert JSON to enum
func (e *OrderType) UnmarshalJSON(buffer []byte) error {
    var result byte
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return err
    }
    *e = OrderType(result)
    return nil
}
