//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

package test

import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// Fast Binary Encoding optional UUID final model
type FinalModelOptionalUUID struct {
    // Final model buffer
    buffer *fbe.Buffer
    // Final model buffer offset
    offset int

    // Base final model value
    value *fbe.FinalModelUUID
}

// Create a new optional UUID final model
func NewFinalModelOptionalUUID(buffer *fbe.Buffer, offset int) *FinalModelOptionalUUID {
    fbeResult := FinalModelOptionalUUID{buffer: buffer, offset: offset}
    fbeResult.value = fbe.NewFinalModelUUID(buffer, 0)
    return &fbeResult
}

// Get the optional final model value
func (fm *FinalModelOptionalUUID) Value() *fbe.FinalModelUUID { return fm.value }

// Get the allocation size
func (fm *FinalModelOptionalUUID) FBEAllocationSize(fbeValue *fbe.UUID) int {
    if fbeValue != nil {
        return 1 + fm.value.FBEAllocationSize(*fbeValue)
    } else {
        return 1
    }
}

// Get the final offset
func (fm *FinalModelOptionalUUID) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelOptionalUUID) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelOptionalUUID) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelOptionalUUID) FBEUnshift(size int) { fm.offset -= size }

// Check if the object contains a value
func (fm *FinalModelOptionalUUID) HasValue() bool {
    if (fm.buffer.Offset() + fm.FBEOffset() + 1) > fm.buffer.Size() {
        return false
    }

    fbeHasValue := fbe.ReadUInt8(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset())
    return fbeHasValue != 0
}

// Check if the optional value is valid
func (fm *FinalModelOptionalUUID) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + 1) > fm.buffer.Size() {
        return fbe.MaxInt
    }

    fbeHasValue := fbe.ReadUInt8(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset())
    if fbeHasValue == 0 {
        return 1
    }

    fm.buffer.Shift(fm.FBEOffset() + 1)
    fbeResult := fm.value.Verify()
    fm.buffer.Unshift(fm.FBEOffset() + 1)
    return 1 + fbeResult
}

// Get the optional value
func (fm *FinalModelOptionalUUID) Get() (*fbe.UUID, int, error) {
    var fbeValue *fbe.UUID = nil

    if (fm.buffer.Offset() + fm.FBEOffset() + 1) > fm.buffer.Size() {
        return fbeValue, 0, errors.New("model is broken")
    }

    if !fm.HasValue() {
        return fbeValue, 1, nil
    }

    var fbeResult int
    var err error

    fbeValue = fbe.OptionalUUID(fbe.UUIDNil())

    fm.buffer.Shift(fm.FBEOffset() + 1)
    *fbeValue, fbeResult, err = fm.value.Get()
    fm.buffer.Unshift(fm.FBEOffset() + 1)
    return fbeValue, 1 + fbeResult, err
}

// Set the optional value
func (fm *FinalModelOptionalUUID) Set(fbeValue *fbe.UUID) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + 1) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    fbeHasValue := uint8(0)
    if fbeValue != nil {
        fbeHasValue = uint8(1)
    }
    fbe.WriteUInt8(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), fbeHasValue)
    if fbeHasValue == 0 {
        return 1, nil
    }

    fm.buffer.Shift(fm.FBEOffset() + 1)
    fbeResult, err := fm.value.Set(*fbeValue)
    fm.buffer.Unshift(fm.FBEOffset() + 1)
    return 1 + fbeResult, err
}
