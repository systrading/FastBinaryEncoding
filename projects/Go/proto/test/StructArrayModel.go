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

// Fast Binary Encoding StructArray model
type StructArrayModel struct {
    // Model buffer
    buffer *fbe.Buffer

    // Field model
    model *FieldModelStructArray
}

// Create a new StructArray model
func NewStructArrayModel(buffer *fbe.Buffer) *StructArrayModel {
    return &StructArrayModel{buffer: buffer, model: NewFieldModelStructArray(buffer, 4)}
}

// Get the model buffer
func (m *StructArrayModel) Buffer() *fbe.Buffer { return m.buffer }
// Get the field model
func (m *StructArrayModel) Model() *FieldModelStructArray { return m.model }

// Get the model size
func (m *StructArrayModel) FBESize() int { return m.model.FBESize() + m.model.FBEExtra() }
// // Get the model type
func (m *StructArrayModel) FBEType() int { return m.model.FBEType() }

// Check if the struct value is valid
func (m *StructArrayModel) Verify() bool {
    if (m.buffer.Offset() + m.model.FBEOffset() - 4) > m.buffer.Size() {
        return false
    }

    fbeFullSize := int(fbe.ReadUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 4))
    if fbeFullSize < m.model.FBESize() {
        return false
    }

    return m.model.Verify()
}

// Create a new model (begin phase)
func (m *StructArrayModel) CreateBegin() int {
    fbeBegin := m.buffer.Allocate(4 + m.model.FBESize())
    return fbeBegin
}

// Create a new model (end phase)
func (m *StructArrayModel) CreateEnd(fbeBegin int) int {
    fbeEnd := m.buffer.Size()
    fbeFullSize := fbeEnd - fbeBegin
    fbe.WriteUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 4, uint32(fbeFullSize))
    return fbeFullSize
}

// Serialize the struct value
func (m *StructArrayModel) Serialize(value *StructArray) (int, error) {
    fbeBegin := m.CreateBegin()
    err := m.model.Set(value)
    fbeFullSize := m.CreateEnd(fbeBegin)
    return fbeFullSize, err
}

// Deserialize the struct value
func (m *StructArrayModel) Deserialize() (*StructArray, int, error) {
    value := NewStructArray()
    fbeFullSize, err := m.DeserializeValue(value)
    return value, fbeFullSize, err
}

// Deserialize the struct value by the given pointer
func (m *StructArrayModel) DeserializeValue(value *StructArray) (int, error) {
    if (m.buffer.Offset() + m.model.FBEOffset() - 4) > m.buffer.Size() {
        value = NewStructArray()
        return 0, nil
    }

    fbeFullSize := int(fbe.ReadUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 4))
    if fbeFullSize < m.model.FBESize() {
        value = NewStructArray()
        return 0, errors.New("model is broken")
    }

    err := m.model.GetValue(value)
    return fbeFullSize, err
}

// Move to the next struct value
func (m *StructArrayModel) Next(prev int) {
    m.model.FBEShift(prev)
}
