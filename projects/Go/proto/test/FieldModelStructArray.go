// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.5.0.0

package test

import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// Fast Binary Encoding StructArray field model
type FieldModelStructArray struct {
    // Field model buffer
    buffer *fbe.Buffer
    // Field model buffer offset
    offset int

    F1 *FieldModelArrayByte
    F2 *FieldModelArrayOptionalByte
    F3 *FieldModelArrayBytes
    F4 *FieldModelArrayOptionalBytes
    F5 *FieldModelArrayEnumSimple
    F6 *FieldModelArrayOptionalEnumSimple
    F7 *FieldModelArrayFlagsSimple
    F8 *FieldModelArrayOptionalFlagsSimple
    F9 *FieldModelArrayStructSimple
    F10 *FieldModelArrayOptionalStructSimple
}

// Create a new StructArray field model
func NewFieldModelStructArray(buffer *fbe.Buffer, offset int) *FieldModelStructArray {
    fbeResult := FieldModelStructArray{buffer: buffer, offset: offset}
    fbeResult.F1 = NewFieldModelArrayByte(buffer, 4 + 4, 2)
    fbeResult.F2 = NewFieldModelArrayOptionalByte(buffer, fbeResult.F1.FBEOffset() + fbeResult.F1.FBESize(), 2)
    fbeResult.F3 = NewFieldModelArrayBytes(buffer, fbeResult.F2.FBEOffset() + fbeResult.F2.FBESize(), 2)
    fbeResult.F4 = NewFieldModelArrayOptionalBytes(buffer, fbeResult.F3.FBEOffset() + fbeResult.F3.FBESize(), 2)
    fbeResult.F5 = NewFieldModelArrayEnumSimple(buffer, fbeResult.F4.FBEOffset() + fbeResult.F4.FBESize(), 2)
    fbeResult.F6 = NewFieldModelArrayOptionalEnumSimple(buffer, fbeResult.F5.FBEOffset() + fbeResult.F5.FBESize(), 2)
    fbeResult.F7 = NewFieldModelArrayFlagsSimple(buffer, fbeResult.F6.FBEOffset() + fbeResult.F6.FBESize(), 2)
    fbeResult.F8 = NewFieldModelArrayOptionalFlagsSimple(buffer, fbeResult.F7.FBEOffset() + fbeResult.F7.FBESize(), 2)
    fbeResult.F9 = NewFieldModelArrayStructSimple(buffer, fbeResult.F8.FBEOffset() + fbeResult.F8.FBESize(), 2)
    fbeResult.F10 = NewFieldModelArrayOptionalStructSimple(buffer, fbeResult.F9.FBEOffset() + fbeResult.F9.FBESize(), 2)
    return &fbeResult
}

// Get the field size
func (fm *FieldModelStructArray) FBESize() int { return 4 }

// Get the field body size
func (fm *FieldModelStructArray) FBEBody() int {
    fbeResult := 4 + 4 +
        fm.F1.FBESize() +
        fm.F2.FBESize() +
        fm.F3.FBESize() +
        fm.F4.FBESize() +
        fm.F5.FBESize() +
        fm.F6.FBESize() +
        fm.F7.FBESize() +
        fm.F8.FBESize() +
        fm.F9.FBESize() +
        fm.F10.FBESize() +
        0
    return fbeResult
}

// Get the field extra size
func (fm *FieldModelStructArray) FBEExtra() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0
    }

    fbeStructOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fbeStructOffset == 0) || ((fm.buffer.Offset() + fbeStructOffset + 4) > fm.buffer.Size()) {
        return 0
    }

    fm.buffer.Shift(fbeStructOffset)

    fbeResult := fm.FBEBody() +
        fm.F1.FBEExtra() +
        fm.F2.FBEExtra() +
        fm.F3.FBEExtra() +
        fm.F4.FBEExtra() +
        fm.F5.FBEExtra() +
        fm.F6.FBEExtra() +
        fm.F7.FBEExtra() +
        fm.F8.FBEExtra() +
        fm.F9.FBEExtra() +
        fm.F10.FBEExtra() +
        0

    fm.buffer.Unshift(fbeStructOffset)

    return fbeResult
}

// Get the field type
func (fm *FieldModelStructArray) FBEType() int { return 125 }

// Get the field offset
func (fm *FieldModelStructArray) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelStructArray) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelStructArray) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelStructArray) FBEUnshift(size int) { fm.offset -= size }

// Check if the struct value is valid
func (fm *FieldModelStructArray) Verify() bool { return fm.VerifyType(true) }

// Check if the struct value and its type are valid
func (fm *FieldModelStructArray) VerifyType(fbeVerifyType bool) bool {
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
func (fm *FieldModelStructArray) VerifyFields(fbeStructSize int) bool {
    fbeCurrentSize := 4 + 4

    if (fbeCurrentSize + fm.F1.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F1.Verify() {
        return false
    }
    fbeCurrentSize += fm.F1.FBESize()

    if (fbeCurrentSize + fm.F2.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F2.Verify() {
        return false
    }
    fbeCurrentSize += fm.F2.FBESize()

    if (fbeCurrentSize + fm.F3.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F3.Verify() {
        return false
    }
    fbeCurrentSize += fm.F3.FBESize()

    if (fbeCurrentSize + fm.F4.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F4.Verify() {
        return false
    }
    fbeCurrentSize += fm.F4.FBESize()

    if (fbeCurrentSize + fm.F5.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F5.Verify() {
        return false
    }
    fbeCurrentSize += fm.F5.FBESize()

    if (fbeCurrentSize + fm.F6.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F6.Verify() {
        return false
    }
    fbeCurrentSize += fm.F6.FBESize()

    if (fbeCurrentSize + fm.F7.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F7.Verify() {
        return false
    }
    fbeCurrentSize += fm.F7.FBESize()

    if (fbeCurrentSize + fm.F8.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F8.Verify() {
        return false
    }
    fbeCurrentSize += fm.F8.FBESize()

    if (fbeCurrentSize + fm.F9.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F9.Verify() {
        return false
    }
    fbeCurrentSize += fm.F9.FBESize()

    if (fbeCurrentSize + fm.F10.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F10.Verify() {
        return false
    }
    fbeCurrentSize += fm.F10.FBESize()

    return true
}

// Get the struct value (begin phase)
func (fm *FieldModelStructArray) GetBegin() (int, error) {
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
func (fm *FieldModelStructArray) GetEnd(fbeBegin int) {
    fm.buffer.Unshift(fbeBegin)
}

// Get the struct value
func (fm *FieldModelStructArray) Get() (*StructArray, error) {
    fbeResult := NewStructArray()
    return fbeResult, fm.GetValue(fbeResult)
}

// Get the struct value by the given pointer
func (fm *FieldModelStructArray) GetValue(fbeValue *StructArray) error {
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
func (fm *FieldModelStructArray) GetFields(fbeValue *StructArray, fbeStructSize int) {
    fbeCurrentSize := 4 + 4

    if (fbeCurrentSize + fm.F1.FBESize()) <= fbeStructSize {
        slice, _ := fm.F1.Get()
        copy(fbeValue.F1[:], slice)
    } else {
        fbeValue.F1 = [2]byte{}
    }
    fbeCurrentSize += fm.F1.FBESize()

    if (fbeCurrentSize + fm.F2.FBESize()) <= fbeStructSize {
        slice, _ := fm.F2.Get()
        copy(fbeValue.F2[:], slice)
    } else {
        fbeValue.F2 = [2]*byte{}
    }
    fbeCurrentSize += fm.F2.FBESize()

    if (fbeCurrentSize + fm.F3.FBESize()) <= fbeStructSize {
        slice, _ := fm.F3.Get()
        copy(fbeValue.F3[:], slice)
    } else {
        fbeValue.F3 = [2][]byte{}
    }
    fbeCurrentSize += fm.F3.FBESize()

    if (fbeCurrentSize + fm.F4.FBESize()) <= fbeStructSize {
        slice, _ := fm.F4.Get()
        copy(fbeValue.F4[:], slice)
    } else {
        fbeValue.F4 = [2]*[]byte{}
    }
    fbeCurrentSize += fm.F4.FBESize()

    if (fbeCurrentSize + fm.F5.FBESize()) <= fbeStructSize {
        slice, _ := fm.F5.Get()
        copy(fbeValue.F5[:], slice)
    } else {
        fbeValue.F5 = [2]EnumSimple{}
    }
    fbeCurrentSize += fm.F5.FBESize()

    if (fbeCurrentSize + fm.F6.FBESize()) <= fbeStructSize {
        slice, _ := fm.F6.Get()
        copy(fbeValue.F6[:], slice)
    } else {
        fbeValue.F6 = [2]*EnumSimple{}
    }
    fbeCurrentSize += fm.F6.FBESize()

    if (fbeCurrentSize + fm.F7.FBESize()) <= fbeStructSize {
        slice, _ := fm.F7.Get()
        copy(fbeValue.F7[:], slice)
    } else {
        fbeValue.F7 = [2]FlagsSimple{}
    }
    fbeCurrentSize += fm.F7.FBESize()

    if (fbeCurrentSize + fm.F8.FBESize()) <= fbeStructSize {
        slice, _ := fm.F8.Get()
        copy(fbeValue.F8[:], slice)
    } else {
        fbeValue.F8 = [2]*FlagsSimple{}
    }
    fbeCurrentSize += fm.F8.FBESize()

    if (fbeCurrentSize + fm.F9.FBESize()) <= fbeStructSize {
        slice, _ := fm.F9.Get()
        copy(fbeValue.F9[:], slice)
    } else {
        fbeValue.F9 = [2]StructSimple{}
    }
    fbeCurrentSize += fm.F9.FBESize()

    if (fbeCurrentSize + fm.F10.FBESize()) <= fbeStructSize {
        slice, _ := fm.F10.Get()
        copy(fbeValue.F10[:], slice)
    } else {
        fbeValue.F10 = [2]*StructSimple{}
    }
    fbeCurrentSize += fm.F10.FBESize()
}

// Set the struct value (begin phase)
func (fm *FieldModelStructArray) SetBegin() (int, error) {
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
func (fm *FieldModelStructArray) SetEnd(fbeBegin int) {
    fm.buffer.Unshift(fbeBegin)
}

// Set the struct value
func (fm *FieldModelStructArray) Set(fbeValue *StructArray) error {
    fbeBegin, err := fm.SetBegin()
    if fbeBegin == 0 {
        return err
    }

    err = fm.SetFields(fbeValue)
    fm.SetEnd(fbeBegin)
    return err
}

// Set the struct fields values
func (fm *FieldModelStructArray) SetFields(fbeValue *StructArray) error {
    var err error = nil

    if err = fm.F1.Set(fbeValue.F1[:]); err != nil {
        return err
    }
    if err = fm.F2.Set(fbeValue.F2[:]); err != nil {
        return err
    }
    if err = fm.F3.Set(fbeValue.F3[:]); err != nil {
        return err
    }
    if err = fm.F4.Set(fbeValue.F4[:]); err != nil {
        return err
    }
    if err = fm.F5.Set(fbeValue.F5[:]); err != nil {
        return err
    }
    if err = fm.F6.Set(fbeValue.F6[:]); err != nil {
        return err
    }
    if err = fm.F7.Set(fbeValue.F7[:]); err != nil {
        return err
    }
    if err = fm.F8.Set(fbeValue.F8[:]); err != nil {
        return err
    }
    if err = fm.F9.Set(fbeValue.F9[:]); err != nil {
        return err
    }
    if err = fm.F10.Set(fbeValue.F10[:]); err != nil {
        return err
    }
    return err
}
