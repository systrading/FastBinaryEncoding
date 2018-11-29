// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: fbe
// Version: 1.1.0.0

package fbe

import "errors"

// Fast Binary Encoding int64 field model
type FieldModelInt64 struct {
    buffer *Buffer  // Field model buffer
    offset int      // Field model buffer offset
}

// Create a new field model
func NewFieldModelInt64(buffer *Buffer, offset int) *FieldModelInt64 {
    return &FieldModelInt64{buffer: buffer, offset: offset}
}

// Get the field size
func (fm *FieldModelInt64) FBESize() int { return 8 }
// Get the field extra size
func (fm *FieldModelInt64) FBEExtra() int { return 0 }

// Get the field offset
func (fm *FieldModelInt64) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelInt64) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelInt64) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelInt64) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FieldModelInt64) Verify() bool { return true }

// Get the value
func (fm *FieldModelInt64) Get() (int64, error) {
    return fm.GetDefault(0)
}

// Get the value with provided default value
func (fm *FieldModelInt64) GetDefault(defaults int64) (int64, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return defaults, nil
    }

    return ReadInt64(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()), nil
}

// Set the value
func (fm *FieldModelInt64) Set(value int64) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return errors.New("model is broken")
    }

    WriteInt64(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), value)
    return nil
}
