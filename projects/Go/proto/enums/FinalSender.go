//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

package enums

import "errors"
import "../fbe"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version

// Fast Binary Encoding enums final sender
type FinalSender struct {
    *fbe.Sender
}

// Create a new enums final sender with an empty buffer
func NewFinalSender() *FinalSender {
    return NewFinalSenderWithBuffer(fbe.NewEmptyBuffer())
}

// Create a new enums final sender with the given buffer
func NewFinalSenderWithBuffer(buffer *fbe.Buffer) *FinalSender {
    return &FinalSender{
        fbe.NewSender(buffer, true),
    }
}

// Sender models accessors


// Send methods

func (s *FinalSender) Send(value interface{}) (int, error) {
    switch value := value.(type) {
    default:
        _ = value
        break
    }
    return 0, nil
}
