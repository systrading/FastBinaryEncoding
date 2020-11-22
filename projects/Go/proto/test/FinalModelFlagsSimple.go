// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.5.0.0

package test

import "errors"
import "../fbe"

// Fast Binary Encoding FlagsSimple final model
type FinalModelFlagsSimple struct {
    // Final model buffer
    buffer *fbe.Buffer
    // Final model buffer offset
    offset int
}

// Create a new FlagsSimple final model
func NewFinalModelFlagsSimple(buffer *fbe.Buffer, offset int) *FinalModelFlagsSimple {
    return &FinalModelFlagsSimple{buffer: buffer, offset: offset}
}

// Get the allocation size
func (fm *FinalModelFlagsSimple) FBEAllocationSize(value *FlagsSimple) int { return fm.FBESize() }

// Get the final size
func (fm *FinalModelFlagsSimple) FBESize() int { return 4 }

// Get the final offset
func (fm *FinalModelFlagsSimple) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelFlagsSimple) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelFlagsSimple) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelFlagsSimple) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FinalModelFlagsSimple) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return fbe.MaxInt
    }

    return fm.FBESize()
}

// Get the value
func (fm *FinalModelFlagsSimple) Get() (*FlagsSimple, int, error) {
    var value FlagsSimple
    size, err := fm.GetValueDefault(&value, FlagsSimple(0))
    return &value, size, err
}

// Get the value with provided default value
func (fm *FinalModelFlagsSimple) GetDefault(defaults FlagsSimple) (*FlagsSimple, int, error) {
    var value FlagsSimple
    size, err := fm.GetValueDefault(&value, defaults)
    return &value, size, err
}

// Get the value by the given pointer
func (fm *FinalModelFlagsSimple) GetValue(value *FlagsSimple) (int, error) {
    return fm.GetValueDefault(value, FlagsSimple(0))
}

// Get the value by the given pointer with provided default value
func (fm *FinalModelFlagsSimple) GetValueDefault(value *FlagsSimple, defaults FlagsSimple) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        *value = defaults
        return 0, errors.New("model is broken")
    }

    *value = FlagsSimple(fbe.ReadInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    return fm.FBESize(), nil
}

// Set the value by the given pointer
func (fm *FinalModelFlagsSimple) Set(value *FlagsSimple) (int, error) {
    return fm.SetValue(*value)
}

// Set the value
func (fm *FinalModelFlagsSimple) SetValue(value FlagsSimple) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    fbe.WriteInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), int32(value))
    return fm.FBESize(), nil
}
