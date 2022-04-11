//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

package fbe

import "errors"

// Fast Binary Encoding string final model
type FinalModelString struct {
    // Final model buffer
    buffer *Buffer
    // Final model buffer offset
    offset int
}

// Create a new string final model
func NewFinalModelString(buffer *Buffer, offset int) *FinalModelString {
    return &FinalModelString{buffer: buffer, offset: offset}
}

// Get the allocation size
func (fm *FinalModelString) FBEAllocationSize(value string) int { return 4 + 3 * (len(value) + 1) }

// Get the final offset
func (fm *FinalModelString) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelString) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelString) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelString) FBEUnshift(size int) { fm.offset -= size }

// Check if the string value is valid
func (fm *FinalModelString) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + 4) > fm.buffer.Size() {
        return MaxInt
    }

    fbeStringSize := int(ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fm.buffer.Offset() + fm.FBEOffset() + 4 + fbeStringSize) > fm.buffer.Size() {
        return MaxInt
    }

    return 4 + fbeStringSize
}

// Get the string value
func (fm *FinalModelString) Get() (string, int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + 4) > fm.buffer.Size() {
        return "", 0, nil
    }

    fbeStringSize := int(ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fm.buffer.Offset() + fm.FBEOffset() + 4 + fbeStringSize) > fm.buffer.Size() {
        return "", 4, errors.New("model is broken")
    }

    data := ReadBytes(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset() + 4, fbeStringSize)
    return string(data), 4 + fbeStringSize, nil
}

// Set the string value
func (fm *FinalModelString) Set(value string) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + 4) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    data := []byte(value)

    fbeStringSize := len(data)
    if (fm.buffer.Offset() + fm.FBEOffset() + 4 + fbeStringSize) > fm.buffer.Size() {
        return 4, errors.New("model is broken")
    }

    WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), uint32(fbeStringSize))
    WriteBytes(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset() + 4, data)
    return 4 + fbeStringSize, nil
}
