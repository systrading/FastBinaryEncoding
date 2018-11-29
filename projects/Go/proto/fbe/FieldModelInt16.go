// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: fbe
// Version: 1.1.0.0

package fbe

import "errors"

// Fast Binary Encoding int16 field model
type FieldModelInt16 struct {
    buffer *Buffer  // Field model buffer
    offset int      // Field model buffer offset
}

// Create a new field model
func NewFieldModelInt16(buffer *Buffer, offset int) *FieldModelInt16 {
    return &FieldModelInt16{buffer: buffer, offset: offset}
}

// Get the field size
func (fm *FieldModelInt16) FBESize() int { return 2 }
// Get the field extra size
func (fm *FieldModelInt16) FBEExtra() int { return 0 }

// Get the field offset
func (fm *FieldModelInt16) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelInt16) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelInt16) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelInt16) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FieldModelInt16) Verify() bool { return true }

// Get the value
func (fm *FieldModelInt16) Get() (int16, error) {
    return fm.GetDefault(0)
}

// Get the value with provided default value
func (fm *FieldModelInt16) GetDefault(defaults int16) (int16, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return defaults, nil
    }

    return ReadInt16(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()), nil
}

// Set the value
func (fm *FieldModelInt16) Set(value int16) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return errors.New("model is broken")
    }

    WriteInt16(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), value)
    return nil
}
