// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.5.0.0

package enums

import "errors"
import "../fbe"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version

// EnumInt8 enum key
type EnumInt8Key int8

// Convert EnumInt8 enum key to string
func (k EnumInt8Key) String() string {
    return EnumInt8(k).String()
}

// EnumInt8 enum
type EnumInt8 int8

// EnumInt8 enum values
//noinspection GoSnakeCaseUsage
const (
    EnumInt8_ENUM_VALUE_0 = EnumInt8(0 + 0)
    EnumInt8_ENUM_VALUE_1 = EnumInt8(-128 + 0)
    EnumInt8_ENUM_VALUE_2 = EnumInt8(-128 + 1)
    EnumInt8_ENUM_VALUE_3 = EnumInt8(126 + 0)
    EnumInt8_ENUM_VALUE_4 = EnumInt8(126 + 1)
    EnumInt8_ENUM_VALUE_5 = EnumInt8(EnumInt8_ENUM_VALUE_3)
)

// Create a new EnumInt8 enum
func NewEnumInt8() *EnumInt8 {
    return new(EnumInt8)
}

// Create a new EnumInt8 enum from the given value
func NewEnumInt8FromValue(value int8) *EnumInt8 {
    result := EnumInt8(value)
    return &result
}

// Get the enum key
func (e EnumInt8) Key() EnumInt8Key {
    return EnumInt8Key(e)
}

// Convert enum to optional
func (e *EnumInt8) Optional() *EnumInt8 {
    return e
}

// Convert enum to string
func (e EnumInt8) String() string {
    if e == EnumInt8_ENUM_VALUE_0 {
        return "ENUM_VALUE_0"
    }
    if e == EnumInt8_ENUM_VALUE_1 {
        return "ENUM_VALUE_1"
    }
    if e == EnumInt8_ENUM_VALUE_2 {
        return "ENUM_VALUE_2"
    }
    if e == EnumInt8_ENUM_VALUE_3 {
        return "ENUM_VALUE_3"
    }
    if e == EnumInt8_ENUM_VALUE_4 {
        return "ENUM_VALUE_4"
    }
    if e == EnumInt8_ENUM_VALUE_5 {
        return "ENUM_VALUE_5"
    }
    return "<unknown>"
}

// Convert enum to JSON
func (e EnumInt8) MarshalJSON() ([]byte, error) {
    value := int8(e)
    return fbe.Json.Marshal(&value)
}

// Convert JSON to enum
func (e *EnumInt8) UnmarshalJSON(buffer []byte) error {
    var result int8
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return err
    }
    *e = EnumInt8(result)
    return nil
}
