// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.1.0.0

package enums

import "errors"
import "../fbe"

// Fast Binary Encoding EnumInt32 field model
type FieldModelEnumInt32 struct {
    buffer *fbe.Buffer  // Field model buffer
    offset int          // Field model buffer offset
}

// Create a new field model
func NewFieldModelEnumInt32(buffer *fbe.Buffer, offset int) *FieldModelEnumInt32 {
    return &FieldModelEnumInt32{buffer: buffer, offset: offset}
}

// Get the field size
func (fm *FieldModelEnumInt32) FBESize() int { return 4 }
// Get the field extra size
func (fm *FieldModelEnumInt32) FBEExtra() int { return 0 }

// Get the field offset
func (fm *FieldModelEnumInt32) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelEnumInt32) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelEnumInt32) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelEnumInt32) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FieldModelEnumInt32) Verify() bool { return true }

// Get the value
func (fm *FieldModelEnumInt32) Get() (*EnumInt32, error) {
    return fm.GetDefault(EnumInt32(0))
}

// Get the value with provided default value
func (fm *FieldModelEnumInt32) GetDefault(defaults EnumInt32) (*EnumInt32, error) {
    result := defaults
    return fm.GetValue(&result)
}

// Get the value by pointer
func (fm *FieldModelEnumInt32) GetValue(value *EnumInt32) (*EnumInt32, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return value, nil
    }

    result := EnumInt32(fbe.ReadInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    value = &result
    return value, nil
}

// Set the value
func (fm *FieldModelEnumInt32) Set(value *EnumInt32) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return errors.New("model is broken")
    }

    fbe.WriteInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), int32(*value))
    return nil
}
