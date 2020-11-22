// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// Version: 1.5.0.0

package fbe

import "errors"

// Fast Binary Encoding Byte field model
type FieldModelByte struct {
    // Field model buffer
    buffer *Buffer
    // Field model buffer offset
    offset int
}

// Create a new Byte field model
func NewFieldModelByte(buffer *Buffer, offset int) *FieldModelByte {
    return &FieldModelByte{buffer: buffer, offset: offset}
}

// Get the field size
func (fm *FieldModelByte) FBESize() int { return 1 }
// Get the field extra size
func (fm *FieldModelByte) FBEExtra() int { return 0 }

// Get the field offset
func (fm *FieldModelByte) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelByte) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelByte) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelByte) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FieldModelByte) Verify() bool { return true }

// Get the value
func (fm *FieldModelByte) Get() (byte, error) {
    return fm.GetDefault(0)
}

// Get the value with provided default value
func (fm *FieldModelByte) GetDefault(defaults byte) (byte, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return defaults, nil
    }

    return ReadByte(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()), nil
}

// Set the value
func (fm *FieldModelByte) Set(value byte) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return errors.New("model is broken")
    }

    WriteByte(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), value)
    return nil
}
