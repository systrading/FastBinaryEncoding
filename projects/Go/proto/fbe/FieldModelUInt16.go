// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: fbe
// Version: 1.1.0.0

package fbe

import "errors"

// Fast Binary Encoding uint16 field model
type FieldModelUInt16 struct {
    buffer *Buffer  // Field model buffer
    offset int      // Field model buffer offset
}

// Create a new field model
func NewFieldModelUInt16(buffer *Buffer, offset int) *FieldModelUInt16 {
    return &FieldModelUInt16{buffer: buffer, offset: offset}
}

// Get the field size
func (fm *FieldModelUInt16) FBESize() int { return 2 }
// Get the field extra size
func (fm *FieldModelUInt16) FBEExtra() int { return 0 }

// Get the field offset
func (fm *FieldModelUInt16) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelUInt16) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelUInt16) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelUInt16) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FieldModelUInt16) Verify() bool { return true }

// Get the value
func (fm *FieldModelUInt16) Get() (uint16, error) {
    return fm.GetDefault(0)
}

// Get the value with provided default value
func (fm *FieldModelUInt16) GetDefault(defaults uint16) (uint16, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return defaults, nil
    }

    return ReadUInt16(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()), nil
}

// Set the value
func (fm *FieldModelUInt16) Set(value uint16) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return errors.New("model is broken")
    }

    WriteUInt16(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), value)
    return nil
}
