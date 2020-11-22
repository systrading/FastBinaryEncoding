// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.5.0.0

package test

import "fmt"
import "strconv"
import "strings"
import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// Workaround for Go unused imports issue
var _ = fmt.Print
var _ = strconv.FormatInt

// StructNested key
type StructNestedKey struct {
    StructOptionalKey
}

// Convert StructNested flags key to string
func (k *StructNestedKey) String() string {
    var sb strings.Builder
    sb.WriteString("StructNestedKey(")
    sb.WriteString(k.StructOptionalKey.String())
    sb.WriteString(")")
    return sb.String()
}

// StructNested struct
type StructNested struct {
    *StructOptional
    F1000 EnumSimple `json:"f1000"`
    F1001 *EnumSimple `json:"f1001"`
    F1002 EnumTyped `json:"f1002"`
    F1003 *EnumTyped `json:"f1003"`
    F1004 FlagsSimple `json:"f1004"`
    F1005 *FlagsSimple `json:"f1005"`
    F1006 FlagsTyped `json:"f1006"`
    F1007 *FlagsTyped `json:"f1007"`
    F1008 StructSimple `json:"f1008"`
    F1009 *StructSimple `json:"f1009"`
    F1010 StructOptional `json:"f1010"`
    F1011 *StructOptional `json:"f1011"`
}

// Create a new StructNested struct
func NewStructNested() *StructNested {
    return &StructNested{
        StructOptional: NewStructOptional(),
        F1000: *NewEnumSimple(),
        F1001: nil,
        F1002: EnumTyped_ENUM_VALUE_2,
        F1003: nil,
        F1004: *NewFlagsSimple(),
        F1005: nil,
        F1006: FlagsTyped_FLAG_VALUE_2 | FlagsTyped_FLAG_VALUE_4 | FlagsTyped_FLAG_VALUE_6,
        F1007: nil,
        F1008: *NewStructSimple(),
        F1009: nil,
        F1010: *NewStructOptional(),
        F1011: nil,
    }
}

// Create a new StructNested struct from the given field values
func NewStructNestedFromFieldValues(Parent *StructOptional, F1000 EnumSimple, F1001 *EnumSimple, F1002 EnumTyped, F1003 *EnumTyped, F1004 FlagsSimple, F1005 *FlagsSimple, F1006 FlagsTyped, F1007 *FlagsTyped, F1008 StructSimple, F1009 *StructSimple, F1010 StructOptional, F1011 *StructOptional) *StructNested {
    return &StructNested{Parent, F1000, F1001, F1002, F1003, F1004, F1005, F1006, F1007, F1008, F1009, F1010, F1011}
}

// Create a new StructNested struct from JSON
func NewStructNestedFromJSON(buffer []byte) (*StructNested, error) {
    result := *NewStructNested()
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return nil, err
    }
    return &result, nil
}

// Struct shallow copy
func (s *StructNested) Copy() *StructNested {
    var result = *s
    return &result
}

// Struct deep clone
func (s *StructNested) Clone() *StructNested {
    // Serialize the struct to the FBE stream
    writer := NewStructNestedModel(fbe.NewEmptyBuffer())
    _, _ = writer.Serialize(s)

    // Deserialize the struct from the FBE stream
    reader := NewStructNestedModel(writer.Buffer())
    result, _, _ := reader.Deserialize()
    return result
}

// Get the struct key
func (s *StructNested) Key() StructNestedKey {
    return StructNestedKey{
        StructOptionalKey: s.StructOptional.Key(),
    }
}

// Convert struct to optional
func (s *StructNested) Optional() *StructNested {
    return s
}

// Get the FBE type
func (s *StructNested) FBEType() int { return 112 }

// Convert struct to string
func (s *StructNested) String() string {
    var sb strings.Builder
    sb.WriteString("StructNested(")
    sb.WriteString(s.StructOptional.String())
    sb.WriteString(",f1000=")
    sb.WriteString(s.F1000.String())
    sb.WriteString(",f1001=")
    if s.F1001 != nil { 
        sb.WriteString(s.F1001.String())
    } else {
        sb.WriteString("null")
    }
    sb.WriteString(",f1002=")
    sb.WriteString(s.F1002.String())
    sb.WriteString(",f1003=")
    if s.F1003 != nil { 
        sb.WriteString(s.F1003.String())
    } else {
        sb.WriteString("null")
    }
    sb.WriteString(",f1004=")
    sb.WriteString(s.F1004.String())
    sb.WriteString(",f1005=")
    if s.F1005 != nil { 
        sb.WriteString(s.F1005.String())
    } else {
        sb.WriteString("null")
    }
    sb.WriteString(",f1006=")
    sb.WriteString(s.F1006.String())
    sb.WriteString(",f1007=")
    if s.F1007 != nil { 
        sb.WriteString(s.F1007.String())
    } else {
        sb.WriteString("null")
    }
    sb.WriteString(",f1008=")
    sb.WriteString(s.F1008.String())
    sb.WriteString(",f1009=")
    if s.F1009 != nil { 
        sb.WriteString(s.F1009.String())
    } else {
        sb.WriteString("null")
    }
    sb.WriteString(",f1010=")
    sb.WriteString(s.F1010.String())
    sb.WriteString(",f1011=")
    if s.F1011 != nil { 
        sb.WriteString(s.F1011.String())
    } else {
        sb.WriteString("null")
    }
    sb.WriteString(")")
    return sb.String()
}

// Convert struct to JSON
func (s *StructNested) JSON() ([]byte, error) {
    return fbe.Json.Marshal(s)
}
