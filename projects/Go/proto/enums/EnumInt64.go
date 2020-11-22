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

// EnumInt64 enum key
type EnumInt64Key int64

// Convert EnumInt64 enum key to string
func (k EnumInt64Key) String() string {
    return EnumInt64(k).String()
}

// EnumInt64 enum
type EnumInt64 int64

// EnumInt64 enum values
//noinspection GoSnakeCaseUsage
const (
    EnumInt64_ENUM_VALUE_0 = EnumInt64(0 + 0)
    EnumInt64_ENUM_VALUE_1 = EnumInt64(-9223372036854775807 + 0)
    EnumInt64_ENUM_VALUE_2 = EnumInt64(-9223372036854775807 + 1)
    EnumInt64_ENUM_VALUE_3 = EnumInt64(9223372036854775806 + 0)
    EnumInt64_ENUM_VALUE_4 = EnumInt64(9223372036854775806 + 1)
    EnumInt64_ENUM_VALUE_5 = EnumInt64(EnumInt64_ENUM_VALUE_3)
)

// Create a new EnumInt64 enum
func NewEnumInt64() *EnumInt64 {
    return new(EnumInt64)
}

// Create a new EnumInt64 enum from the given value
func NewEnumInt64FromValue(value int64) *EnumInt64 {
    result := EnumInt64(value)
    return &result
}

// Get the enum key
func (e EnumInt64) Key() EnumInt64Key {
    return EnumInt64Key(e)
}

// Convert enum to optional
func (e *EnumInt64) Optional() *EnumInt64 {
    return e
}

// Convert enum to string
func (e EnumInt64) String() string {
    if e == EnumInt64_ENUM_VALUE_0 {
        return "ENUM_VALUE_0"
    }
    if e == EnumInt64_ENUM_VALUE_1 {
        return "ENUM_VALUE_1"
    }
    if e == EnumInt64_ENUM_VALUE_2 {
        return "ENUM_VALUE_2"
    }
    if e == EnumInt64_ENUM_VALUE_3 {
        return "ENUM_VALUE_3"
    }
    if e == EnumInt64_ENUM_VALUE_4 {
        return "ENUM_VALUE_4"
    }
    if e == EnumInt64_ENUM_VALUE_5 {
        return "ENUM_VALUE_5"
    }
    return "<unknown>"
}

// Convert enum to JSON
func (e EnumInt64) MarshalJSON() ([]byte, error) {
    value := int64(e)
    return fbe.Json.Marshal(&value)
}

// Convert JSON to enum
func (e *EnumInt64) UnmarshalJSON(buffer []byte) error {
    var result int64
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return err
    }
    *e = EnumInt64(result)
    return nil
}
