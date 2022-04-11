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

// Fast Binary Encoding EnumSimple set field model
type FieldModelSetEnumSimple struct {
    // Field model buffer
    buffer *fbe.Buffer
    // Field model buffer offset
    offset int

    // Set item field model
    model *FieldModelEnumSimple
}

// Create a new EnumSimple set field model
func NewFieldModelSetEnumSimple(buffer *fbe.Buffer, offset int) *FieldModelSetEnumSimple {
    fbeResult := FieldModelSetEnumSimple{buffer: buffer, offset: offset}
    fbeResult.model = NewFieldModelEnumSimple(buffer, offset)
    return &fbeResult
}

// Get the field size
func (fm *FieldModelSetEnumSimple) FBESize() int { return 4 }

// Get the field extra size
func (fm *FieldModelSetEnumSimple) FBEExtra() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0
    }

    fbeSetOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fbeSetOffset == 0) || ((fm.buffer.Offset() + fbeSetOffset + 4) > fm.buffer.Size()) {
        return 0
    }

    fbeSetSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeSetOffset))

    fbeResult := 0
    fm.model.SetFBEOffset(fbeSetOffset + 4)
    for i := fbeSetSize; i > 0; i-- {
        fbeResult += fm.model.FBESize() + fm.model.FBEExtra()
        fm.model.FBEShift(fm.model.FBESize())
    }
    return fbeResult
}

// Get the field offset
func (fm *FieldModelSetEnumSimple) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelSetEnumSimple) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelSetEnumSimple) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelSetEnumSimple) FBEUnshift(size int) { fm.offset -= size }

// Get the set offset
func (fm *FieldModelSetEnumSimple) Offset() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0
    }

    fbeSetOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    return fbeSetOffset
}

// Get the set size
func (fm *FieldModelSetEnumSimple) Size() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0
    }

    fbeSetOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fbeSetOffset == 0) || ((fm.buffer.Offset() + fbeSetOffset + 4) > fm.buffer.Size()) {
        return 0
    }

    fbeSetSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeSetOffset))
    return fbeSetSize
}

// Set index operator
func (fm *FieldModelSetEnumSimple) GetItem(index int) (*FieldModelEnumSimple, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return nil, errors.New("model is broken")
    }

    fbeSetOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fbeSetOffset == 0) || ((fm.buffer.Offset() + fbeSetOffset + 4) > fm.buffer.Size()) {
        return nil, errors.New("model is broken")
    }

    fbeSetSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeSetOffset))
    if index >= fbeSetSize {
        return nil, errors.New("index is out of bounds")
    }

    fm.model.SetFBEOffset(fbeSetOffset + 4)
    fm.model.FBEShift(index * fm.model.FBESize())
    return fm.model, nil
}

// Resize the set and get its first model
func (fm *FieldModelSetEnumSimple) Resize(size int) (*FieldModelEnumSimple, error) {
    fbeSetSize := size * fm.model.FBESize()
    fbeSetOffset := fm.buffer.Allocate(4 + fbeSetSize) - fm.buffer.Offset()
    if (fbeSetOffset == 0) || ((fm.buffer.Offset() + fbeSetOffset + 4) > fm.buffer.Size()) {
        return nil, errors.New("model is broken")
    }

    fbe.WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), uint32(fbeSetOffset))
    fbe.WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeSetOffset, uint32(size))
    fbe.WriteCount(fm.buffer.Data(), fm.buffer.Offset() + fbeSetOffset + 4, 0, fbeSetSize)

    fm.model.SetFBEOffset(fbeSetOffset + 4)
    return fm.model, nil
}

// Check if the set value is valid
func (fm *FieldModelSetEnumSimple) Verify() bool {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return true
    }

    fbeSetOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if fbeSetOffset == 0 {
        return true
    }

    if (fm.buffer.Offset() + fbeSetOffset + 4) > fm.buffer.Size() {
        return false
    }

    fbeSetSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeSetOffset))

    fm.model.SetFBEOffset(fbeSetOffset + 4)
    for i := fbeSetSize; i > 0; i-- {
        if !fm.model.Verify() {
            return false
        }
        fm.model.FBEShift(fm.model.FBESize())
    }

    return true
}

// Get the set value
func (fm *FieldModelSetEnumSimple) Get() (map[EnumSimpleKey]EnumSimple, error) {
    values := make(map[EnumSimpleKey]EnumSimple)

    fbeSetSize := fm.Size()
    if fbeSetSize == 0 {
        return values, nil
    }

    fbeModel, err := fm.GetItem(0)
    if err != nil {
        return values, err
    }

    for i := fbeSetSize; i > 0; i-- {
        value, err := fbeModel.Get()
        if err != nil {
            return values, err
        }
        values[value.Key()] = *value
        fbeModel.FBEShift(fbeModel.FBESize())
    }

    return values, nil
}

// Set the set value
func (fm *FieldModelSetEnumSimple) Set(values map[EnumSimpleKey]EnumSimple) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return errors.New("model is broken")
    }

    fbeModel, err := fm.Resize(len(values))
    if err != nil {
        return err
    }

    for _, value := range values {
        err := fbeModel.Set(&value)
        if err != nil {
            return err
        }
        fbeModel.FBEShift(fbeModel.FBESize())
    }

    return nil
}
