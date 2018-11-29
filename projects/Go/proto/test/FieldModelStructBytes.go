// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.1.0.0

package test

import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = fbe.Version
var _ = proto.Version

// Fast Binary Encoding StructBytes field model
type FieldModelStructBytes struct {
    buffer *fbe.Buffer  // Field model buffer
    offset int          // Field model buffer offset

    F1 *fbe.FieldModelBytes
    F2 *FieldModelOptionalBytes
    F3 *FieldModelOptionalBytes
}

// Create a new StructBytes field model
func NewFieldModelStructBytes(buffer *fbe.Buffer, offset int) *FieldModelStructBytes {
    fbeResult := FieldModelStructBytes{buffer: buffer, offset: offset}
    fbeResult.F1 = fbe.NewFieldModelBytes(buffer, 4 + 4)
    fbeResult.F2 = NewFieldModelOptionalBytes(buffer, fbeResult.F1.FBEOffset() + fbeResult.F1.FBESize())
    fbeResult.F3 = NewFieldModelOptionalBytes(buffer, fbeResult.F2.FBEOffset() + fbeResult.F2.FBESize())
    return &fbeResult
}

// Get the field size
func (fm *FieldModelStructBytes) FBESize() int { return 1 }

// Get the field body size
func (fm *FieldModelStructBytes) FBEBody() int {
    fbeResult := 4 + 4 +
        0
    return fbeResult
}

// Get the field extra size
func (fm *FieldModelStructBytes) FBEExtra() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0
    }

    fbeStructOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fbeStructOffset == 0) || ((fm.buffer.Offset() + fbeStructOffset + 4) > fm.buffer.Size()) {
        return 0
    }

    fm.buffer.Shift(fbeStructOffset)

    fbeResult := fm.FBEBody() +
        0

    fm.buffer.Unshift(fbeStructOffset)

    return fbeResult
}

// Get the field type
func (fm *FieldModelStructBytes) FBEType() int { return 120 }

// Get the field offset
func (fm *FieldModelStructBytes) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelStructBytes) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelStructBytes) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelStructBytes) FBEUnshift(size int) { fm.offset -= size }

// Check if the struct value is valid
func (fm *FieldModelStructBytes) Verify() bool { return fm.VerifyType(true) }

// Check if the struct value and its type are valid
func (fm *FieldModelStructBytes) VerifyType(fbeVerifyType bool) bool {
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
func (fm *FieldModelStructBytes) VerifyFields(fbeStructSize int) bool {
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

    return true
}

// Get the struct value (begin phase)
func (fm *FieldModelStructBytes) GetBegin() (int, error) {
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
func (fm *FieldModelStructBytes) GetEnd(fbeBegin int) {
    fm.buffer.Unshift(fbeBegin)
}

// Get the struct value
func (fm *FieldModelStructBytes) Get() (*StructBytes, error) {
    fbeResult := NewStructBytes()
    return fm.GetValue(fbeResult)
}

// Get the struct value by pointer
func (fm *FieldModelStructBytes) GetValue(fbeValue *StructBytes) (*StructBytes, error) {
    fbeBegin, err := fm.GetBegin()
    if fbeBegin == 0 {
        return fbeValue, err
    }

    fbeStructSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset()))
    fm.GetFields(fbeValue, fbeStructSize)
    fm.GetEnd(fbeBegin)
    return fbeValue, nil
}

// Get the struct fields values
func (fm *FieldModelStructBytes) GetFields(fbeValue *StructBytes, fbeStructSize int) {
    fbeCurrentSize := 4 + 4

    if (fbeCurrentSize + fm.F1.FBESize()) <= fbeStructSize {
    } else {
        fbeValue.F1 = make([]byte, 0)
    }
    fbeCurrentSize += fm.F1.FBESize()

    if (fbeCurrentSize + fm.F2.FBESize()) <= fbeStructSize {
    } else {
        fbeValue.F2 = nil
    }
    fbeCurrentSize += fm.F2.FBESize()

    if (fbeCurrentSize + fm.F3.FBESize()) <= fbeStructSize {
    } else {
        fbeValue.F3 = nil
    }
    fbeCurrentSize += fm.F3.FBESize()
}
