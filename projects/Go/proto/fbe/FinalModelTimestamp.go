//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

package fbe

import "errors"

// Fast Binary Encoding timestamp final model
type FinalModelTimestamp struct {
    // Final model buffer
    buffer *Buffer
    // Final model buffer offset
    offset int
}

// Create a new timestamp final model
func NewFinalModelTimestamp(buffer *Buffer, offset int) *FinalModelTimestamp {
    return &FinalModelTimestamp{buffer: buffer, offset: offset}
}

// Get the allocation size
func (fm *FinalModelTimestamp) FBEAllocationSize(value Timestamp) int { return fm.FBESize() }

// Get the final size
func (fm *FinalModelTimestamp) FBESize() int { return 8 }

// Get the final offset
func (fm *FinalModelTimestamp) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelTimestamp) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelTimestamp) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelTimestamp) FBEUnshift(size int) { fm.offset -= size }

// Check if the timestamp value is valid
func (fm *FinalModelTimestamp) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return MaxInt
    }

    return fm.FBESize()
}

// Get the timestamp value
func (fm *FinalModelTimestamp) Get() (Timestamp, int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return TimestampEpoch(), 0, errors.New("model is broken")
    }

    return ReadTimestamp(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()), fm.FBESize(), nil
}

// Set the timestamp value
func (fm *FinalModelTimestamp) Set(value Timestamp) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    WriteTimestamp(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), value)
    return fm.FBESize(), nil
}
