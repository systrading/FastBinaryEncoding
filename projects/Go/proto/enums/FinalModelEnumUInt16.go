// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.1.0.0

package enums

import "errors"
import "../fbe"

// Fast Binary Encoding EnumUInt16 final model
type FinalModelEnumUInt16 struct {
    buffer *fbe.Buffer  // Final model buffer
    offset int          // Final model buffer offset
}

// Create a new final model
func NewFinalModelEnumUInt16(buffer *fbe.Buffer, offset int) *FinalModelEnumUInt16 {
    return &FinalModelEnumUInt16{buffer: buffer, offset: offset}
}

// Get the allocation size
func (fm *FinalModelEnumUInt16) FBEAllocationSize(value EnumUInt16) int { return fm.FBESize() }

// Get the final size
func (fm *FinalModelEnumUInt16) FBESize() int { return 2 }

// Get the final offset
func (fm *FinalModelEnumUInt16) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelEnumUInt16) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelEnumUInt16) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelEnumUInt16) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FinalModelEnumUInt16) Verify() (bool, int) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return false, 0
    }

    return true, fm.FBESize()
}

// Get the value
func (fm *FinalModelEnumUInt16) Get() (*EnumUInt16, int, error) {
    return fm.GetDefault(EnumUInt16(0))
}

// Get the value with provided default value
func (fm *FinalModelEnumUInt16) GetDefault(defaults EnumUInt16) (*EnumUInt16, int, error) {
    result := defaults
    return fm.GetValue(&result)
}

// Get the value by pointer
func (fm *FinalModelEnumUInt16) GetValue(value *EnumUInt16) (*EnumUInt16, int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return value, 0, errors.New("model is broken")
    }

    result := EnumUInt16(fbe.ReadUInt16(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    value = &result
    return value, fm.FBESize(), nil
}

// Set the value
func (fm *FinalModelEnumUInt16) Set(value *EnumUInt16) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    fbe.WriteUInt16(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), uint16(*value))
    return fm.FBESize(), nil
}
