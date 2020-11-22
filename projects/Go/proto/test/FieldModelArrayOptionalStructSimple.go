// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// Version: 1.5.0.0

package test

import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// Fast Binary Encoding OptionalStructSimple array field model
type FieldModelArrayOptionalStructSimple struct {
    // Field model buffer
    buffer *fbe.Buffer
    // Field model buffer offset
    offset int

    // Array item field model
    model *FieldModelOptionalStructSimple
    // Array size
    size int
}

// Create a new OptionalStructSimple array field model
func NewFieldModelArrayOptionalStructSimple(buffer *fbe.Buffer, offset int, size int) *FieldModelArrayOptionalStructSimple {
    fbeResult := FieldModelArrayOptionalStructSimple{buffer: buffer, offset: offset}
    fbeResult.model = NewFieldModelOptionalStructSimple(buffer, offset)
    fbeResult.size = size
    return &fbeResult
}

// Get the field size
func (fm *FieldModelArrayOptionalStructSimple) FBESize() int { return fm.size * fm.model.FBESize() }

// Get the field extra size
func (fm *FieldModelArrayOptionalStructSimple) FBEExtra() int { return 0 }

// Get the field offset
func (fm *FieldModelArrayOptionalStructSimple) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelArrayOptionalStructSimple) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelArrayOptionalStructSimple) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelArrayOptionalStructSimple) FBEUnshift(size int) { fm.offset -= size }

// Get the array offset
func (fm *FieldModelArrayOptionalStructSimple) Offset() int { return 0 }
// Get the array size
func (fm *FieldModelArrayOptionalStructSimple) Size() int { return fm.size }

// Array index operator
func (fm *FieldModelArrayOptionalStructSimple) GetItem(index int) (*FieldModelOptionalStructSimple, error) {
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
func (fm *FieldModelArrayOptionalStructSimple) Verify() bool {
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
func (fm *FieldModelArrayOptionalStructSimple) Get() ([]*StructSimple, error) {
    values := make([]*StructSimple, 0, fm.size)

    fbeModel, err := fm.GetItem(0)
    if err != nil {
        return values, err
    }

    for i := 0; i < fm.size; i++ {
        value, err := fbeModel.Get()
        if err != nil {
            return values, err
        }
        values = append(values, value)
        fbeModel.FBEShift(fbeModel.FBESize())
    }

    return values, nil
}

// Set the array
func (fm *FieldModelArrayOptionalStructSimple) Set(values []*StructSimple) error {
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
        err := fbeModel.Set(values[i])
        if err != nil {
            return err
        }
        fbeModel.FBEShift(fbeModel.FBESize())
    }

    return nil
}
