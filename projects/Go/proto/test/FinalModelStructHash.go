//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
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

// Fast Binary Encoding StructHash final model
type FinalModelStructHash struct {
    buffer *fbe.Buffer  // Final model buffer
    offset int          // Final model buffer offset

    F1 *FinalModelMapStringByte
    F2 *FinalModelMapStringOptionalByte
    F3 *FinalModelMapStringBytes
    F4 *FinalModelMapStringOptionalBytes
    F5 *FinalModelMapStringEnumSimple
    F6 *FinalModelMapStringOptionalEnumSimple
    F7 *FinalModelMapStringFlagsSimple
    F8 *FinalModelMapStringOptionalFlagsSimple
    F9 *FinalModelMapStringStructSimple
    F10 *FinalModelMapStringOptionalStructSimple
}

// Create a new StructHash final model
func NewFinalModelStructHash(buffer *fbe.Buffer, offset int) *FinalModelStructHash {
    fbeResult := FinalModelStructHash{buffer: buffer, offset: offset}
    fbeResult.F1 = NewFinalModelMapStringByte(buffer, 0)
    fbeResult.F2 = NewFinalModelMapStringOptionalByte(buffer, 0)
    fbeResult.F3 = NewFinalModelMapStringBytes(buffer, 0)
    fbeResult.F4 = NewFinalModelMapStringOptionalBytes(buffer, 0)
    fbeResult.F5 = NewFinalModelMapStringEnumSimple(buffer, 0)
    fbeResult.F6 = NewFinalModelMapStringOptionalEnumSimple(buffer, 0)
    fbeResult.F7 = NewFinalModelMapStringFlagsSimple(buffer, 0)
    fbeResult.F8 = NewFinalModelMapStringOptionalFlagsSimple(buffer, 0)
    fbeResult.F9 = NewFinalModelMapStringStructSimple(buffer, 0)
    fbeResult.F10 = NewFinalModelMapStringOptionalStructSimple(buffer, 0)
    return &fbeResult
}

// Get the allocation size
func (fm *FinalModelStructHash) FBEAllocationSize(fbeValue *StructHash) int {
    fbeResult := 0 +
        fm.F1.FBEAllocationSize(fbeValue.F1) +
        fm.F2.FBEAllocationSize(fbeValue.F2) +
        fm.F3.FBEAllocationSize(fbeValue.F3) +
        fm.F4.FBEAllocationSize(fbeValue.F4) +
        fm.F5.FBEAllocationSize(fbeValue.F5) +
        fm.F6.FBEAllocationSize(fbeValue.F6) +
        fm.F7.FBEAllocationSize(fbeValue.F7) +
        fm.F8.FBEAllocationSize(fbeValue.F8) +
        fm.F9.FBEAllocationSize(fbeValue.F9) +
        fm.F10.FBEAllocationSize(fbeValue.F10) +
        0
    return fbeResult
}

// Get the final size
func (fm *FinalModelStructHash) FBESize() int { return 0 }

// Get the final extra size
func (fm *FinalModelStructHash) FBEExtra() int { return 0 }

// Get the final type
func (fm *FinalModelStructHash) FBEType() int { return 141 }

// Get the final offset
func (fm *FinalModelStructHash) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelStructHash) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelStructHash) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelStructHash) FBEUnshift(size int) { fm.offset -= size }

// Check if the struct value is valid
func (fm *FinalModelStructHash) Verify() int {
    fm.buffer.Shift(fm.FBEOffset())
    fbeResult := fm.VerifyFields()
    fm.buffer.Unshift(fm.FBEOffset())
    return fbeResult
}

// Check if the struct fields are valid
func (fm *FinalModelStructHash) VerifyFields() int {
    fbeCurrentOffset := 0
    fbeFieldSize := 0


    fm.F1.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize = fm.F1.Verify(); fbeFieldSize == fbe.MaxInt {
        return fbe.MaxInt
    }
    fbeCurrentOffset += fbeFieldSize

    fm.F2.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize = fm.F2.Verify(); fbeFieldSize == fbe.MaxInt {
        return fbe.MaxInt
    }
    fbeCurrentOffset += fbeFieldSize

    fm.F3.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize = fm.F3.Verify(); fbeFieldSize == fbe.MaxInt {
        return fbe.MaxInt
    }
    fbeCurrentOffset += fbeFieldSize

    fm.F4.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize = fm.F4.Verify(); fbeFieldSize == fbe.MaxInt {
        return fbe.MaxInt
    }
    fbeCurrentOffset += fbeFieldSize

    fm.F5.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize = fm.F5.Verify(); fbeFieldSize == fbe.MaxInt {
        return fbe.MaxInt
    }
    fbeCurrentOffset += fbeFieldSize

    fm.F6.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize = fm.F6.Verify(); fbeFieldSize == fbe.MaxInt {
        return fbe.MaxInt
    }
    fbeCurrentOffset += fbeFieldSize

    fm.F7.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize = fm.F7.Verify(); fbeFieldSize == fbe.MaxInt {
        return fbe.MaxInt
    }
    fbeCurrentOffset += fbeFieldSize

    fm.F8.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize = fm.F8.Verify(); fbeFieldSize == fbe.MaxInt {
        return fbe.MaxInt
    }
    fbeCurrentOffset += fbeFieldSize

    fm.F9.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize = fm.F9.Verify(); fbeFieldSize == fbe.MaxInt {
        return fbe.MaxInt
    }
    fbeCurrentOffset += fbeFieldSize

    fm.F10.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize = fm.F10.Verify(); fbeFieldSize == fbe.MaxInt {
        return fbe.MaxInt
    }
    fbeCurrentOffset += fbeFieldSize

    return fbeCurrentOffset
}

// Get the struct value
func (fm *FinalModelStructHash) Get() (*StructHash, int, error) {
    fbeResult := NewStructHash()
    fbeSize, err := fm.GetValue(fbeResult)
    return fbeResult, fbeSize, err
}

// Get the struct value by the given pointer
func (fm *FinalModelStructHash) GetValue(fbeValue *StructHash) (int, error) {
    fm.buffer.Shift(fm.FBEOffset())
    fbeSize, err := fm.GetFields(fbeValue)
    fm.buffer.Unshift(fm.FBEOffset())
    return fbeSize, err
}

// Get the struct fields values
func (fm *FinalModelStructHash) GetFields(fbeValue *StructHash) (int, error) {
    var err error = nil
    fbeCurrentSize := 0
    fbeCurrentOffset := 0
    fbeFieldSize := 0

    fm.F1.SetFBEOffset(fbeCurrentOffset)
    if fbeValue.F1, fbeFieldSize, err = fm.F1.Get(); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.F2.SetFBEOffset(fbeCurrentOffset)
    if fbeValue.F2, fbeFieldSize, err = fm.F2.Get(); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.F3.SetFBEOffset(fbeCurrentOffset)
    if fbeValue.F3, fbeFieldSize, err = fm.F3.Get(); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.F4.SetFBEOffset(fbeCurrentOffset)
    if fbeValue.F4, fbeFieldSize, err = fm.F4.Get(); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.F5.SetFBEOffset(fbeCurrentOffset)
    if fbeValue.F5, fbeFieldSize, err = fm.F5.Get(); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.F6.SetFBEOffset(fbeCurrentOffset)
    if fbeValue.F6, fbeFieldSize, err = fm.F6.Get(); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.F7.SetFBEOffset(fbeCurrentOffset)
    if fbeValue.F7, fbeFieldSize, err = fm.F7.Get(); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.F8.SetFBEOffset(fbeCurrentOffset)
    if fbeValue.F8, fbeFieldSize, err = fm.F8.Get(); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.F9.SetFBEOffset(fbeCurrentOffset)
    if fbeValue.F9, fbeFieldSize, err = fm.F9.Get(); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.F10.SetFBEOffset(fbeCurrentOffset)
    if fbeValue.F10, fbeFieldSize, err = fm.F10.Get(); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    return fbeCurrentSize, err
}

// Set the struct value
func (fm *FinalModelStructHash) Set(fbeValue *StructHash) (int, error) {
    fm.buffer.Shift(fm.FBEOffset())
    fbeResult, err := fm.SetFields(fbeValue)
    fm.buffer.Unshift(fm.FBEOffset())
    return fbeResult, err
}

// Set the struct fields values
func (fm *FinalModelStructHash) SetFields(fbeValue *StructHash) (int, error) {
    var err error = nil
    fbeCurrentSize := 0
    fbeCurrentOffset := 0
    fbeFieldSize := 0

    fm.F1.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize, err = fm.F1.Set(fbeValue.F1); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.F2.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize, err = fm.F2.Set(fbeValue.F2); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.F3.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize, err = fm.F3.Set(fbeValue.F3); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.F4.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize, err = fm.F4.Set(fbeValue.F4); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.F5.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize, err = fm.F5.Set(fbeValue.F5); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.F6.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize, err = fm.F6.Set(fbeValue.F6); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.F7.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize, err = fm.F7.Set(fbeValue.F7); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.F8.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize, err = fm.F8.Set(fbeValue.F8); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.F9.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize, err = fm.F9.Set(fbeValue.F9); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.F10.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize, err = fm.F10.Set(fbeValue.F10); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    return fbeCurrentSize, err
}
