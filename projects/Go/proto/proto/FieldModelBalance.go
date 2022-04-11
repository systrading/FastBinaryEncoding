//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

package proto

import "errors"
import "../fbe"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version

// Fast Binary Encoding Balance field model
type FieldModelBalance struct {
    // Field model buffer
    buffer *fbe.Buffer
    // Field model buffer offset
    offset int

    Currency *fbe.FieldModelString
    Amount *fbe.FieldModelDouble
}

// Create a new Balance field model
func NewFieldModelBalance(buffer *fbe.Buffer, offset int) *FieldModelBalance {
    fbeResult := FieldModelBalance{buffer: buffer, offset: offset}
    fbeResult.Currency = fbe.NewFieldModelString(buffer, 4 + 4)
    fbeResult.Amount = fbe.NewFieldModelDouble(buffer, fbeResult.Currency.FBEOffset() + fbeResult.Currency.FBESize())
    return &fbeResult
}

// Get the field size
func (fm *FieldModelBalance) FBESize() int { return 4 }

// Get the field body size
func (fm *FieldModelBalance) FBEBody() int {
    fbeResult := 4 + 4 +
        fm.Currency.FBESize() +
        fm.Amount.FBESize() +
        0
    return fbeResult
}

// Get the field extra size
func (fm *FieldModelBalance) FBEExtra() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0
    }

    fbeStructOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fbeStructOffset == 0) || ((fm.buffer.Offset() + fbeStructOffset + 4) > fm.buffer.Size()) {
        return 0
    }

    fm.buffer.Shift(fbeStructOffset)

    fbeResult := fm.FBEBody() +
        fm.Currency.FBEExtra() +
        fm.Amount.FBEExtra() +
        0

    fm.buffer.Unshift(fbeStructOffset)

    return fbeResult
}

// Get the field type
func (fm *FieldModelBalance) FBEType() int { return 2 }

// Get the field offset
func (fm *FieldModelBalance) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelBalance) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelBalance) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelBalance) FBEUnshift(size int) { fm.offset -= size }

// Check if the struct value is valid
func (fm *FieldModelBalance) Verify() bool { return fm.VerifyType(true) }

// Check if the struct value and its type are valid
func (fm *FieldModelBalance) VerifyType(fbeVerifyType bool) bool {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return true
    }

    fbeStructOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fbeStructOffset == 0) || ((fm.buffer.Offset() + fbeStructOffset + 4 + 4) > fm.buffer.Size()) {
        return false
    }

    fbeStructSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStructOffset))
    if fbeStructSize < (4 + 4) {
        return false
    }

    fbeStructType := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStructOffset + 4))
    if fbeVerifyType && (fbeStructType != fm.FBEType()) {
        return false
    }

    fm.buffer.Shift(fbeStructOffset)
    fbeResult := fm.VerifyFields(fbeStructSize)
    fm.buffer.Unshift(fbeStructOffset)
    return fbeResult
}

// // Check if the struct value fields are valid
func (fm *FieldModelBalance) VerifyFields(fbeStructSize int) bool {
    fbeCurrentSize := 4 + 4

    if (fbeCurrentSize + fm.Currency.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.Currency.Verify() {
        return false
    }
    fbeCurrentSize += fm.Currency.FBESize()

    if (fbeCurrentSize + fm.Amount.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.Amount.Verify() {
        return false
    }
    fbeCurrentSize += fm.Amount.FBESize()

    return true
}

// Get the struct value (begin phase)
func (fm *FieldModelBalance) GetBegin() (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, nil
    }

    fbeStructOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fbeStructOffset == 0) || ((fm.buffer.Offset() + fbeStructOffset + 4 + 4) > fm.buffer.Size()) {
        return 0, errors.New("model is broken")
    }

    fbeStructSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStructOffset))
    if fbeStructSize < (4 + 4) {
        return 0, errors.New("model is broken")
    }

    fm.buffer.Shift(fbeStructOffset)
    return fbeStructOffset, nil
}

// Get the struct value (end phase)
func (fm *FieldModelBalance) GetEnd(fbeBegin int) {
    fm.buffer.Unshift(fbeBegin)
}

// Get the struct value
func (fm *FieldModelBalance) Get() (*Balance, error) {
    fbeResult := NewBalance()
    return fbeResult, fm.GetValue(fbeResult)
}

// Get the struct value by the given pointer
func (fm *FieldModelBalance) GetValue(fbeValue *Balance) error {
    fbeBegin, err := fm.GetBegin()
    if fbeBegin == 0 {
        return err
    }

    fbeStructSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset()))
    fm.GetFields(fbeValue, fbeStructSize)
    fm.GetEnd(fbeBegin)
    return nil
}

// Get the struct fields values
func (fm *FieldModelBalance) GetFields(fbeValue *Balance, fbeStructSize int) {
    fbeCurrentSize := 4 + 4

    if (fbeCurrentSize + fm.Currency.FBESize()) <= fbeStructSize {
        fbeValue.Currency, _ = fm.Currency.Get()
    } else {
        fbeValue.Currency = ""
    }
    fbeCurrentSize += fm.Currency.FBESize()

    if (fbeCurrentSize + fm.Amount.FBESize()) <= fbeStructSize {
        fbeValue.Amount, _ = fm.Amount.GetDefault(float64(0.0))
    } else {
        fbeValue.Amount = float64(0.0)
    }
    fbeCurrentSize += fm.Amount.FBESize()
}

// Set the struct value (begin phase)
func (fm *FieldModelBalance) SetBegin() (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    fbeStructSize := fm.FBEBody()
    fbeStructOffset := fm.buffer.Allocate(fbeStructSize) - fm.buffer.Offset()
    if (fbeStructOffset <= 0) || ((fm.buffer.Offset() + fbeStructOffset + fbeStructSize) > fm.buffer.Size()) {
        return 0, errors.New("model is broken")
    }

    fbe.WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), uint32(fbeStructOffset))
    fbe.WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStructOffset, uint32(fbeStructSize))
    fbe.WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStructOffset + 4, uint32(fm.FBEType()))

    fm.buffer.Shift(fbeStructOffset)
    return fbeStructOffset, nil
}

// Set the struct value (end phase)
func (fm *FieldModelBalance) SetEnd(fbeBegin int) {
    fm.buffer.Unshift(fbeBegin)
}

// Set the struct value
func (fm *FieldModelBalance) Set(fbeValue *Balance) error {
    fbeBegin, err := fm.SetBegin()
    if fbeBegin == 0 {
        return err
    }

    err = fm.SetFields(fbeValue)
    fm.SetEnd(fbeBegin)
    return err
}

// Set the struct fields values
func (fm *FieldModelBalance) SetFields(fbeValue *Balance) error {
    var err error = nil

    if err = fm.Currency.Set(fbeValue.Currency); err != nil {
        return err
    }
    if err = fm.Amount.Set(fbeValue.Amount); err != nil {
        return err
    }
    return err
}
