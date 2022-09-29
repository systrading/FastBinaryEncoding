//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.14.0.0
//------------------------------------------------------------------------------

package proto

import "errors"
import "../fbe"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version

// Fast Binary Encoding Balance final model
type FinalModelBalance struct {
    buffer *fbe.Buffer  // Final model buffer
    offset int          // Final model buffer offset

    Currency *fbe.FinalModelString
    Amount *fbe.FinalModelDouble
}

// Create a new Balance final model
func NewFinalModelBalance(buffer *fbe.Buffer, offset int) *FinalModelBalance {
    fbeResult := FinalModelBalance{buffer: buffer, offset: offset}
    fbeResult.Currency = fbe.NewFinalModelString(buffer, 0)
    fbeResult.Amount = fbe.NewFinalModelDouble(buffer, 0)
    return &fbeResult
}

// Get the allocation size
func (fm *FinalModelBalance) FBEAllocationSize(fbeValue *Balance) int {
    fbeResult := 0 +
        fm.Currency.FBEAllocationSize(fbeValue.Currency) +
        fm.Amount.FBEAllocationSize(fbeValue.Amount) +
        0
    return fbeResult
}

// Get the final size
func (fm *FinalModelBalance) FBESize() int { return 0 }

// Get the final extra size
func (fm *FinalModelBalance) FBEExtra() int { return 0 }

// Get the final type
func (fm *FinalModelBalance) FBEType() int { return 2 }

// Get the final offset
func (fm *FinalModelBalance) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelBalance) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelBalance) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelBalance) FBEUnshift(size int) { fm.offset -= size }

// Check if the struct value is valid
func (fm *FinalModelBalance) Verify() int {
    fm.buffer.Shift(fm.FBEOffset())
    fbeResult := fm.VerifyFields()
    fm.buffer.Unshift(fm.FBEOffset())
    return fbeResult
}

// Check if the struct fields are valid
func (fm *FinalModelBalance) VerifyFields() int {
    fbeCurrentOffset := 0
    fbeFieldSize := 0


    fm.Currency.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize = fm.Currency.Verify(); fbeFieldSize == fbe.MaxInt {
        return fbe.MaxInt
    }
    fbeCurrentOffset += fbeFieldSize

    fm.Amount.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize = fm.Amount.Verify(); fbeFieldSize == fbe.MaxInt {
        return fbe.MaxInt
    }
    fbeCurrentOffset += fbeFieldSize

    return fbeCurrentOffset
}

// Get the struct value
func (fm *FinalModelBalance) Get() (*Balance, int, error) {
    fbeResult := NewBalance()
    fbeSize, err := fm.GetValue(fbeResult)
    return fbeResult, fbeSize, err
}

// Get the struct value by the given pointer
func (fm *FinalModelBalance) GetValue(fbeValue *Balance) (int, error) {
    fm.buffer.Shift(fm.FBEOffset())
    fbeSize, err := fm.GetFields(fbeValue)
    fm.buffer.Unshift(fm.FBEOffset())
    return fbeSize, err
}

// Get the struct fields values
func (fm *FinalModelBalance) GetFields(fbeValue *Balance) (int, error) {
    var err error = nil
    fbeCurrentSize := 0
    fbeCurrentOffset := 0
    fbeFieldSize := 0

    fm.Currency.SetFBEOffset(fbeCurrentOffset)
    if fbeValue.Currency, fbeFieldSize, err = fm.Currency.Get(); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.Amount.SetFBEOffset(fbeCurrentOffset)
    if fbeValue.Amount, fbeFieldSize, err = fm.Amount.Get(); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    return fbeCurrentSize, err
}

// Set the struct value
func (fm *FinalModelBalance) Set(fbeValue *Balance) (int, error) {
    fm.buffer.Shift(fm.FBEOffset())
    fbeResult, err := fm.SetFields(fbeValue)
    fm.buffer.Unshift(fm.FBEOffset())
    return fbeResult, err
}

// Set the struct fields values
func (fm *FinalModelBalance) SetFields(fbeValue *Balance) (int, error) {
    var err error = nil
    fbeCurrentSize := 0
    fbeCurrentOffset := 0
    fbeFieldSize := 0

    fm.Currency.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize, err = fm.Currency.Set(fbeValue.Currency); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.Amount.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize, err = fm.Amount.Set(fbeValue.Amount); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    return fbeCurrentSize, err
}
