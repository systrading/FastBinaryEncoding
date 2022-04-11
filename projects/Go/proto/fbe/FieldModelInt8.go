//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

package fbe

import "errors"

// Fast Binary Encoding Int8 field model
type FieldModelInt8 struct {
    // Field model buffer
    buffer *Buffer
    // Field model buffer offset
    offset int
}

// Create a new Int8 field model
func NewFieldModelInt8(buffer *Buffer, offset int) *FieldModelInt8 {
    return &FieldModelInt8{buffer: buffer, offset: offset}
}

// Get the field size
func (fm *FieldModelInt8) FBESize() int { return 1 }
// Get the field extra size
func (fm *FieldModelInt8) FBEExtra() int { return 0 }

// Get the field offset
func (fm *FieldModelInt8) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelInt8) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelInt8) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelInt8) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FieldModelInt8) Verify() bool { return true }

// Get the value
func (fm *FieldModelInt8) Get() (int8, error) {
    return fm.GetDefault(0)
}

// Get the value with provided default value
func (fm *FieldModelInt8) GetDefault(defaults int8) (int8, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return defaults, nil
    }

    return ReadInt8(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()), nil
}

// Set the value
func (fm *FieldModelInt8) Set(value int8) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return errors.New("model is broken")
    }

    WriteInt8(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), value)
    return nil
}
