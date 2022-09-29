//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.14.0.0
//------------------------------------------------------------------------------

package test

import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// Fast Binary Encoding EnumSimple array field model
type FieldModelArrayEnumSimple struct {
    // Field model buffer
    buffer *fbe.Buffer
    // Field model buffer offset
    offset int

    // Array item field model
    model *FieldModelEnumSimple
    // Array size
    size int
}

// Create a new EnumSimple array field model
func NewFieldModelArrayEnumSimple(buffer *fbe.Buffer, offset int, size int) *FieldModelArrayEnumSimple {
    fbeResult := FieldModelArrayEnumSimple{buffer: buffer, offset: offset}
    fbeResult.model = NewFieldModelEnumSimple(buffer, offset)
    fbeResult.size = size
    return &fbeResult
}

// Get the field size
func (fm *FieldModelArrayEnumSimple) FBESize() int { return fm.size * fm.model.FBESize() }

// Get the field extra size
func (fm *FieldModelArrayEnumSimple) FBEExtra() int { return 0 }

// Get the field offset
func (fm *FieldModelArrayEnumSimple) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelArrayEnumSimple) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelArrayEnumSimple) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelArrayEnumSimple) FBEUnshift(size int) { fm.offset -= size }

// Get the array offset
func (fm *FieldModelArrayEnumSimple) Offset() int { return 0 }
// Get the array size
func (fm *FieldModelArrayEnumSimple) Size() int { return fm.size }

// Array index operator
func (fm *FieldModelArrayEnumSimple) GetItem(index int) (*FieldModelEnumSimple, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return nil, errors.New("model is broken")
    }
    if index >= fm.size {
        return nil, errors.New("index is out of bounds")
    }

    fm.model.SetFBEOffset(fm.FBEOffset())
    fm.model.FBEShift(index * fm.model.FBESize())
    return fm.model, nil
}

// Check if the array is valid
func (fm *FieldModelArrayEnumSimple) Verify() bool {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return false
    }

    fm.model.SetFBEOffset(fm.FBEOffset())
    for i := 0; i < fm.size; i++ {
        if !fm.model.Verify() {
            return false
        }
        fm.model.FBEShift(fm.model.FBESize())
    }

    return true
}

// Get the array
func (fm *FieldModelArrayEnumSimple) Get() ([]EnumSimple, error) {
    values := make([]EnumSimple, 0, fm.size)

    fbeModel, err := fm.GetItem(0)
    if err != nil {
        return values, err
    }

    for i := 0; i < fm.size; i++ {
        value, err := fbeModel.Get()
        if err != nil {
            return values, err
        }
        values = append(values, *value)
        fbeModel.FBEShift(fbeModel.FBESize())
    }

    return values, nil
}

// Set the array
func (fm *FieldModelArrayEnumSimple) Set(values []EnumSimple) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return errors.New("model is broken")
    }

    fbeModel, err := fm.GetItem(0)
    if err != nil {
        return err
    }

    size := len(values)
    if size > fm.size {
        size = fm.size
    }

    for i := 0; i < size; i++ {
        err := fbeModel.Set(&values[i])
        if err != nil {
            return err
        }
        fbeModel.FBEShift(fbeModel.FBESize())
    }

    return nil
}
