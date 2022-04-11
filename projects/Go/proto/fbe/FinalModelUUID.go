//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

package fbe

import "errors"

// Fast Binary Encoding UUID final model
type FinalModelUUID struct {
    // Final model buffer
    buffer *Buffer
    // Final model buffer offset
    offset int
}

// Create a new UUID final model
func NewFinalModelUUID(buffer *Buffer, offset int) *FinalModelUUID {
    return &FinalModelUUID{buffer: buffer, offset: offset}
}

// Get the allocation size
func (fm *FinalModelUUID) FBEAllocationSize(value UUID) int { return fm.FBESize() }

// Get the final size
func (fm *FinalModelUUID) FBESize() int { return 16 }

// Get the final offset
func (fm *FinalModelUUID) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelUUID) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelUUID) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelUUID) FBEUnshift(size int) { fm.offset -= size }

// Check if the UUID value is valid
func (fm *FinalModelUUID) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return MaxInt
    }

    return fm.FBESize()
}

// Get the UUID value
func (fm *FinalModelUUID) Get() (UUID, int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return UUIDNil(), 0, errors.New("model is broken")
    }

    return ReadUUID(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()), fm.FBESize(), nil
}

// Set the UUID value
func (fm *FinalModelUUID) Set(value UUID) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    WriteUUID(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), value)
    return fm.FBESize(), nil
}
